# Bandits simulator lab01

## Run simulator:
bash run.sh

## How to complete:

modify: **Agent_method.java**

- given:
  - the total number of actions by *Construtor method*: **nAction**
  - the reward of the previous action taken: **pastReward**, this value is **0** when this function is called the first time
  - the id of the previous action taken: **pastActionId**, this value is **-1** when this function is called the first time
- the body of the class is yours to design, create table of values, create method to compute information returns...
- return the id of the action you choose

*Notice*: Consider both **exploration** and **exploitation** for the best performance

😏 feel free to create new classes to support your code

🚫 please, do not change the nature of the function **getAction**. Meaning, the inputs and outputs must be kept still
