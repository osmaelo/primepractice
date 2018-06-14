# test1.rb
# require 'rb-readline'
# require 'byebug'

def prime?(num)
  (2...num).each do |idx|
    if num % idx == 0
      return false
    end
  end
  true
end

def primes(num_primes)
  ps = []
  num = 2
  while ps.count < num_primes
    # debugger
    ps << num if prime?(num)
    num += 1
  end
  ps
end

if __FILE__ == $PROGRAM_NAME
  puts primes(15)
end
