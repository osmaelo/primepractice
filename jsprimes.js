// Javascript

var isPrime = function(num) {
  for (var i = 2; i < num; i++) {
    if (num % i == 0) {
      return false;
    }
  }
  return true;
};

function primes(numPrimes) {
  var primeArr = [];
  var j = 2;

  while (primeArr.length < numPrimes) {
    if (isPrime(j)) {
      primeArr.push(j);
    }
    j++;
  }
  return primeArr;
};

console.log(primes(10));
