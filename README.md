
The system was designed by Leeroy who has moved on to new adventures.
To adhere to SOLID design principles in this situation,I would have a chat with the "goblin" to convience him that his code will not be altered but extended, and reassure him his code will still work as intended but we want to adhere to SOLID software design principles in order to ease code maintenance.

My approch was to first.
1. Analyze the code
2. Write unit test for each case
3. Use a code coverage tool in eclipse to ensure the updateQuality method is well covered (i.e 100%)
4. Extend the Item class and utilise object oreiented principles such as inheritance and polymorphism
5. Rerun the test and ensure all passed