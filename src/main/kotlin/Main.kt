fun main(args: Array<String>) {

    var num1 = """
           You are most likely to get a large draft or warmblood.
           Possibly a Shire, Percheron, Clydesdale, Hanoverian, or Holsteiner.
        """
    var num2 = """
        You are most likely to get horse on the tall average side.
        Possibly a Dutch Warmblood, American Cream Draft, Andalusian, Freisian, or Hackney.
    """
    var num3 = """
       You are most likely to get an average sized horse.
       Possibly an American Standardbred, Appaloosa, Arabian, Morgan, or Gypsy Vanner.
    """
    var num4 = """
        You are most to have a horse that your friends can't quite decide if it is a horse or a pony.
         Possibly a Norwegian Ford, Welsh Cob, Highland Pony, Connemara Pony, or  Hackney Pony.
    """
    var num5 = """
        You will have a very distinct pony, probably one that people will want to cuddle all day.
        Possibly an Exmoor Pony, Miniature Horse, Icelandic Pony, Shetland Pony, or Welsh Pony.
    """

    do {
        print("How tall would you like your horse to be?")
        var heightString = """
            1. 16.3hh +
            2. 15 - 16.2hh
            3. 14 - 15hh
            4. 13 - 14hh
            5. 13hh and under
            6. Exit
        """
        print(heightString)
        print("Please enter the number of your choice: ")
        val height = readLine()!!.toInt()

        if (height == 1)
            print("Congratulations! ${num1}")
        else if (height == 2)
            print("Congratulations! ${num2}")
        else if (height == 3)
            print("Congratulations! ${num3}")
        else if (height == 4)
            print("Congratulations! ${num4}")
        else if (height == 5)
            print("Congratulations! ${num5}")
        else if (height == 6)
            print("Goodbye!")
        else
            print("Please enter a valid option!!")
    } while (height != 6)

}