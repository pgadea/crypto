package core.extensions

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

/* see https://stackoverflow.com/questions/33381384/how-to-use-typetoken-generics-with-gson-in-kotlin
    Usage:
        val turns = Gson().fromJson<Turns>(pref.turns)
    or
        val turns: Turns = Gson().fromJson(pref.turns)
 */
inline fun <reified T> Gson.fromJson(json: String): T = this.fromJson(json, object: TypeToken<T>() {}.type)