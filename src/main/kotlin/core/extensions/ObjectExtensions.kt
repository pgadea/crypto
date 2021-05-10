package core.extensions

val Any.methodName: String
    get() = this.javaClass.enclosingMethod?.name ?: ""
