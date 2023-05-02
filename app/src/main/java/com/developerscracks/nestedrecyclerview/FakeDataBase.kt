package com.developerscracks.nestedrecyclerview

object FakeDataBase {
    fun getAllMusic(): List<MusicGroup>{
        val songList = listOf(
            Song("Amor", R.color.red_800),
            Song("La ultima vez", R.color.pink_800),
            Song("Rock Rock", R.color.purple_800),
            Song("Baila Conmigo", R.color.deep_purple_800),
            Song("Tu y Yo", R.color.indigo_800),
            Song("Job!", R.color.light_blue_800),
            Song("Luz Oscura", R.color.cyan_800),
            Song("No Regreses", R.color.teal_800),
            Song("La Coronita", R.color.green_800),
            Song("Tierra Santa", R.color.blue_grey_800),

        )

        val musicGroupList = listOf(
            MusicGroup("Sigue escuchando...", songList),
            MusicGroup("Tu ultima playlist", songList),
            MusicGroup("Descubre", songList),
            MusicGroup("Las más escuchadas", songList),
            MusicGroup("Top 90s", songList),
        )

        return musicGroupList.shuffled()
    }
}