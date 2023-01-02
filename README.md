The greatest common divisor (GCD) of two nonzero integers a and b is the greatest positive integer d such that d is a divisor of both a and b; that is, there are integers e and f such that a = de and b = df, and d is the largest such integer. The GCD of a and b is generally denoted gcd(a, b).[8]

This definition also applies when one of a and b is zero. In this case, the GCD is the absolute value of the non zero integer: gcd(a, 0) = gcd(0, a) = |a|. This case is important as the terminating step of the Euclidean algorithm.

The above definition cannot be used for defining gcd(0, 0), since 0 × n = 0, and zero thus has no greatest divisor. However, zero is its own greatest divisor if greatest is understood in the context of the divisibility relation, so gcd(0, 0) is commonly defined as 0. This preserves the usual identities for GCD, and in particular Bézout's identity, namely that gcd(a, b) generates the same ideal as {a, b}.[9][10][11] This convention is followed by many computer algebra systems.[12] Nonetheless, some authors leave gcd(0, 0) undefined.[13]

The GCD of a and b is their greatest positive common divisor in the preorder relation of divisibility. This means that the common divisors of a and b are exactly the divisors of their GCD. This is commonly proved by using either Euclid's lemma, the fundamental theorem of arithmetic, or the Euclidean algorithm. This is the meaning of "greatest" that is used for the generalizations of the concept of GCD.

Example
The number 54 can be expressed as a product of two integers in several different ways:

{\displaystyle 54\times 1=27\times 2=18\times 3=9\times 6.}{\displaystyle 54\times 1=27\times 2=18\times 3=9\times 6.}
Thus the complete list of divisors of 54 is {\displaystyle 1,2,3,6,9,18,27,54}{\displaystyle 1,2,3,6,9,18,27,54}. Similarly, the divisors of 24 are {\displaystyle 1,2,3,4,6,8,12,24}{\displaystyle 1,2,3,4,6,8,12,24}. The numbers that these two lists have in common are the common divisors of 54 and 24, that is,

{\displaystyle 1,2,3,6.}{\displaystyle 1,2,3,6.}
Of these, the greatest is 6, so it is the greatest common divisor:

{\displaystyle \gcd(54,24)=6.}{\displaystyle \gcd(54,24)=6.}
