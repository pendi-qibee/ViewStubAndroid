package id.qibee.viewstub.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is my favorite Screenshot tool, \nViewStub inflate after 1200ms"
    }
    val text: LiveData<String> = _text
}