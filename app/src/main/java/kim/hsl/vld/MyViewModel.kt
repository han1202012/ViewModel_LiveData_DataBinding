package kim.hsl.vld

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    lateinit var number: MutableLiveData<Int>

    init {
        number = MutableLiveData()
        number.value = 0
    }

    fun plus(): Unit {
        number.value = number.value?.plus(1)
    }

    fun minus(): Unit {
        number.value = number.value?.minus(1)
    }

    fun reset(): Unit {
        number.value = 0
    }
}