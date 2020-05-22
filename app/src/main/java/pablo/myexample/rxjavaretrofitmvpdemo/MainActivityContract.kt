package pablo.myexample.rxjavaretrofitmvpdemo

import android.view.View

interface MainActivityContract {

    interface MainView{
        fun showData(url: String)
    }

    interface MainPresenter{
        fun fetchData(view: View, id: String)
    }
}