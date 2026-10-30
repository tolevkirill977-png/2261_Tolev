import math
n = int(input())
k = math.ceil(n / 25)
min_students = n // k
print(k, min_students)
