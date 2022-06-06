import requests

res = requests.get('https://aws.random.cat/meow')
print(res.json())