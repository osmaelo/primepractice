print("Hello World")

def is_prime(num):
    for i in range(2, num):
        if num % i == 0:
            return False
    return True


def primes(num_primes):
    prime_list = []
    num = 2
    while len(prime_list) < num_primes:
        prime_list.append(num) if is_prime(num) else False
        num += 1
    return prime_list

print(primes(40))
