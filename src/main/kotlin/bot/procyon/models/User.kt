package bot.procyon.models

import org.komapper.annotation.KomapperEntity
import org.komapper.annotation.KomapperId
import org.komapper.annotation.KomapperOneToMany
import org.komapper.annotation.KomapperTable

@KomapperEntity
@KomapperOneToMany(targetEntity = Guild::class)
@KomapperTable(alwaysQuote = true)
data class User(
    @KomapperId
    val id:             Long,
    val balance:        Int,
    val exp:            Float
)

