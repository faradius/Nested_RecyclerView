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

        val songRomaticList = listOf(
            Song("Primera Vez", R.color.red_800),
            Song("Corazon", R.color.pink_800),
            Song("Luz del dia", R.color.purple_800),
            Song("Amiga Mia", R.color.deep_purple_800),
            Song("Si quisieras", R.color.indigo_800),
            Song("Cariñosos", R.color.light_blue_800),
            Song("Desprecio", R.color.cyan_800),
            Song("Sin amigos", R.color.teal_800),
            Song("Una vez fui", R.color.green_800),
            Song("Hata que te conoci", R.color.blue_grey_800),

            )

        val musicGroupList = listOf(
            MusicGroup("Sigue escuchando...", songList),
            MusicGroup("Tu ultima playlist", songRomaticList)
        )

        return musicGroupList.shuffled()
    }
}