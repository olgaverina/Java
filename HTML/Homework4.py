import requests

res = requests.get('https://aws.random.cat/meow')
print(res.json())

import requests

res = requests.get('https://cat-fact.herokuapp.com/facts/random?animal_type=cat&amount=2')
print(res.json())