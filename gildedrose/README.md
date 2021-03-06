# Clean Code Kata - GildedRose

Code used to demonstrate in a workshop how clean code principles can be
applied to existing legacy code.

## Getting Started

This workshop is organized into two folders start and finish.

Start folder has working files in original state

Finish folder has files after the refactoring is done.  The finish folder
shall be used to check the final results of the refactoring as
model state for verification.

The learner shall start in the start folder and open the project inside
the start folder in an IDE like IntelliJ IDEA or Eclipse.

The project is a maven project and can be imported directly in any IDE.
The README file in the start folder project details all the observations
and the activities of the refactoring to be done to files.

After every activity learner is supposed to run the test cases and
verify nothing is broken while doing the refactoring mentioned
in the activities of the README file.

## Going through gradual activity changes

The commits in this repositoy are done after performing every
listed activity in the README file and they can be studied
by opening in any git visualization like gitk or Git UI apps.

The commits can also be checked out one by one using the commit
hashes to study what changes were made to files in every activity.

## Original source

[GildedRose Repository](https://github.com/NotMyself/GildedRose)
Taken from the work by @TerryHughes, @NotMyself

Additional translations to Java and concept of texttest.org based
testing taken from the [ArturT Repository](https://github.com/ArturT/GildedRose-Refactoring-Kata)

## Text of the kata

Hi and welcome to team Gilded Rose. As you know, we are a small inn with a prime location in a prominent city ran by a friendly innkeeper named Allison. We also buy and sell only the finest goods. Unfortunately, our goods are constantly degrading in quality as they approach their sell by date. We have a system in place that updates our inventory for us. It was developed by a no-nonsense type named Leeroy, who has moved on to new adventures. Your task is to add the new feature to our system so that we can begin selling a new category of items. First an introduction to our system:

* All items have a SellIn value which denotes the number of days we have to sell the item.
* All items have a Quality value which denotes how valuable the item is.
* At the end of each day our system lowers both values for every item.

Pretty simple, right? Well this is where it gets interesting:

* Once the sell by date has passed, Quality degrades twice as fast.
* The Quality of an item is never negative.
* ???Aged Brie??? actually increases in Quality the older it gets.
* The Quality of an item is never more than 50.
* ???Sulfuras???, being a legendary item, never has to be sold or decreases in Quality.
* ???Backstage passes???, like aged brie, increases in Quality as it???s SellIn value approaches; Quality increases by 2 when there are 10 days or less and by 3 when there are 5 days or less but Quality drops to 0 after the concert.

We have recently signed a supplier of conjured items. This requires an update to our system:

* ???Conjured??? items degrade in Quality twice as fast as normal items.

Feel free to make any changes to the UpdateQuality method and add any new code as long as everything still works correctly. However, do not alter the Item class or Items property as those belong to the goblin in the corner who will insta-rage and one-shot you as he doesn???t believe in shared code ownership (you can make the UpdateQuality method and Items property static if you like, we???ll cover for you).

Source: http://iamnotmyself.com/2011/02/13/refactor-this-the-gilded-rose-kata/

## Text-Based Approval Testing

This is a testing approach which is very useful when refactoring legacy code. Before you change the code, you run it, and gather the output of the code as a plain text file. You review the text, and if it correctly describes the behaviour as you understand it, you can "approve" it, and save it as a "Golden Master". Then after you change the code, you run it again, and compare the new output against the Golden Master. Any differences, and the test fails.

It's basically the same idea as "assertEquals(expected, actual)" in a unit test, except the text you are comparing is typically much longer, and the "expected" value is saved from actual output, rather than being defined in advance.

Typically a piece of legacy code may not produce suitable textual output from the start, so you may need to modify it before you can write your first text-based approval test. That could involve inserting log statements into the code, or just writing a "main" method that executes the code and prints out what the result is afterwards. It's this latter approach we are using here to test GildedRose.

The Text-Based tests in this repository are designed to be used with the tool ["TextTest"](http://texttest.org). This tool helps you to organize and run text-based tests. There is more information in the README file in the "texttests" subdirectory.