package pablo.myexample.rxjavaretrofitmvpdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainActivityContract.MainView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            MainActivityPresenter(this).fetchData(it, editText.text.toString())
        }
    }

    override fun showData(url: String) {
        Picasso.get().load(url).into(imageView);
    }
}
