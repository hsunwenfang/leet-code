
Quick intro to hash maps

url:
https://www.youtube.com/watch?v=eMymKAFYaCs
Array -> should determine size at the beginning
LinkedList -> inefficient look-up
HashMap -> hold a Key and a Value
1. Take a key and returned a hashed code by a hash function

How hashmaps work

url:
https://www.youtube.com/watch?v=h2d9b_nEzoA

1. Array stores data with same types and support random acces
	But array sizes are fixed
2. Linked List could grow --> memory not neceesarily continuous
	But checked node to node --> inefficient look-up
3. Hash table prioritize insertion deletion and look-up
4. 2-keys hashing into the same value --> collision

Collision solutions : 1. linear probing 2. Separate chaining

1. Linear probing stores value to the next available slot --> clustering
1. collisions live in linked position

Good hash functions properties:
1. Using all available informations for Keys
2. Uniformly ditributes output across table

LeetCode Explore of HashMap tutorial
url:
https://leetcode.com/explore/learn/card/hash-table/182/practical-applications/1139/
