package pablo.myexample.rxjavaretrofitmvpdemo

import android.util.Log
import android.view.View

class MainActivityPresenter(view: MainActivityContract.MainView): MainActivityContract.MainPresenter {

    var mainView: MainActivityContract.MainView = view

    override fun fetchData(view: View, id: String) {
        if(id.isNotEmpty()) FetchDataLogic().retrieve(id)?.subscribe({mainView.showData(it.url)})
    }
}