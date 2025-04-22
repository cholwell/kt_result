package cholwell.dev.result

sealed interface Result<out V, out E> {
    data class Ok<out V>(val value: V): Result<V, Nothing>
    data class Error<out E>(val error: E): Result<Nothing, E>
}

fun <V> ok(value: V) = Result.Ok(value)
fun <E> error(error: E) = Result.Error(error)

data object None
