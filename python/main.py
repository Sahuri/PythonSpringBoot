print("please type a value :")
b=input()
x=1
c=''
while(x<=b):
  b1=b-x
  for y in range(b1):  
    c=c+' '
  for z in range(b1,b):
    c=c+'#'
  x=x+1
  print(c)
  c=''
