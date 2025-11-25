# Deterministic finite automaton

Suppose we have a binary string `n = "101101"` and a number `k = 5`.

We need to determine whether number n is divisible by 5.

If we convert our string to base 10:
`1*2^5 + 0*2^4 + 1*2^3 + 1*2^2 +0*2^1 +1*2^0 = 32 + 0 + 8 + 4 + 0 + 1 = 45`
However, for binary strings longer than 32 bits, Java int cannot store the value.
Instead, we use a Deterministic Finite Automaton (DFA).

A DFA is an abstract model that accepts or rejects a string by moving through states determined by input symbols.
DFA model consists of:

* set of inputs I
* set of finite states Q
* initial state q0
* set of accepting states F
* transition function

1. Considering our string consists of ones and zeroes it is ease to determine that `I={0,1}`.
2. By definition remainder `r` is `0 <= r < k` and that brings us to our set of finite states
   `Q = {0,...,k-1} = {0, 1, 2, 3, 4}` and the initial state is `q0=0`.
3. The number is divisible by k iff the remainder is 0 at the end. So the accepting set is:`F={0}`.
4. Transition function - `transition(q, b) -> (q*2 + b) % k`, where `q - current remainder`, `b - next input bit`.

Transition function can be represented using transition table.

| Current State | Next state for b=0 | Next state for b=1 |
|---------------|--------------------|--------------------|
| 0             | (2·0 + 0) % 5 = 0  | (2·0 + 1) % 5 = 1  |
| 1             | (2·1 + 0) % 5 = 2  | (2·1 + 1) % 5 = 3  |
| 2             | (2·2 + 0) % 5 = 4  | (2·2 + 1) % 5 = 0  |
| 3             | (2·3 + 0) % 5 = 1  | (2·3 + 1) % 5 = 2  |
| 4             | (2·4 + 0) % 5 = 3  | (2·4 + 1) % 5 = 4  |

Using our transition table we can traverse throug our string

| Input | Next State |
|-------|------------|
| 1     | 1          |
| 0     | 2          |
| 1     | 0          |
| 1     | 1          |
| 0     | 2          |
| 1     | 0          |

Final state is `0` it means that number is divisible by 5.