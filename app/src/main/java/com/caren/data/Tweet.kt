package com.caren.data

data class Tweet(
    val name: String,
    val username: String,
    val tweetMessage: String,
    val numberOfComments: Int,
    val numberOfRetweets: Int,
    val numberOfLikes: Int

) {
    companion object {
        fun getListOfTweets(): List<Tweet> {
            return listOf(
                Tweet(
                    "Android Developers",
                    "AndroidDev",
                    "#AndroidDevSummit is back! ",
                    3,
                    20,
                    145
                ),
                Tweet(
                    "Android Developers",
                    "AndroidDev",
                    "Implement proper color contrast in your #Android apps! ", 1,
                    23,
                    14
                ),
                Tweet(
                    "National Geographic",
                    "NatGeo",
                    "Being around more birds can boost your family’s happiness, a German study finds",
                    12,
                    52,
                    560
                ),
                Tweet(
                    "NASA",
                    "NASA",
                    "Fall weather have you itching to step outside? You're in luck! This month, you'll have a chance to see several groupings of the Moon, planets, and stars at sunrise & sunset. ",
                    56,
                    612,
                    2800
                ),
                Tweet(
                    "Marvel Entertainment",
                    "Marvel",
                    "New comics hitting shelves next week!",
                    18,
                    110,
                    1300
                ),
                Tweet(
                    "Karl the Fog",
                    "KarlTheFog",
                    "Welcome to Fogust",
                    71,
                    1100,
                    5400
                ),
                Tweet(
                    "The Onion",
                    "TheOnion",
                    "Daily Spin Class Only Thing Keeping Mom From Driving Car Full Of Kids Into Ocean",
                    26,
                    94,
                    1700
                ),
                Tweet(
                    "Android Developers",
                    "AndroidDev",
                    "A new Android Basics in Kotlin codelab just launched!", 4,
                    49,
                    279
                ),
            )
        }
    }
}