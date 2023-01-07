package com.example.pokemon

class RequestClients {
}

data class Clients(
    var clientId: String,
    var clientName: String,
    var enterprises: List<Enterprise>



)

data class Enterprise(
    var enterpriseId: String,
    var enterpriseName: String,
)