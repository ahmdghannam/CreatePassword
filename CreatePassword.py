import random
import string
numbers = [i for i in range(1,10)]
characters = list(string.ascii_lowercase)
special_char = [char for char in "{}()[].,:;+-*/&|<>=~$"]
num_char = int(input("how many letters yuo want in your password: "))
num_symbol = int(input("how many symbols you want in your password: "))
num_number = int(input("how many numbers you want in your password: "))
password_list = []
for i in range(num_char):
    password_list += random.choice(characters)
for i in range(num_symbol):
    password_list += random.choice(special_char)
for i in range(num_number):
    password_list += str(random.choice(numbers))
random.shuffle(password_list)
print(*password_list, sep="")
