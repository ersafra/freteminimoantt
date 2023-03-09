package com.ersafra.freteminimoantt

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Tabela : NavigationItem("tabela", R.drawable.ic_tabela_36, "Tabela")
    object Fracao : NavigationItem("fracao", R.drawable.ic_fracao_36, "Fração")
    object Diarias : NavigationItem("diarias", R.drawable.ic_diarias_36, "Diarias")
}

