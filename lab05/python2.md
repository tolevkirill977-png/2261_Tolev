# Задачи на Python
## Задача 1
```
n = int(input())
print(n // 15 * 15, n % 15)
```
## Задача 2
```
a = input()
b = len(a) // 2
print(int(a[:b]) + int(a[b:]))
```
# Задача 3
```
n = int(input())
a = n / 3
print(round(a, 3))
```

# Задача 4
```
a = float(input())
b = int(round(a * 100))
c = b // 100
d = b % 100
print(f"{c} rub {d} kop")

```

# Задача 5
```
n, m, c, k = map(int, input().split())
a = n * m
b = a - k
if b < 0:
    b = 0    
d = b // 200
if b % 200 != 0:
    d = d + 1    
e = d * c
print(e)
```

# Задача 6
```
n, m, k = map(int, input().split())
a = n * m
b = a // k
if a % k != 0:
    b = b + 1
print(b)
```

# Задача 7
```
import math
n, t = map(float, input().split())
a = n / t * 60
b = math.ceil(a)
print(int(b))
```

# Задача 8
```
import math
x, y = map(float, input().split())
a = math.ceil(x)
b = math.floor(y)
c = b - a + 1
if c < 0:
    c = 0
print(c)
```

# Задача 9
```
a = input()
b = 0
for c in a:
    if c.isdigit():
        b = b + int(c)
print(b)
```

# Задача 10
```
a = input()
b = ""
for c in a:
    if c == "(":
        b = ")" + b
    else:
        b = "(" + b
print(b)
```

# Задача 11
```

```

# Задача 12
```

```

# Задача 13
```

```

# Задача 14
```

```
# Задача 15
```

```
