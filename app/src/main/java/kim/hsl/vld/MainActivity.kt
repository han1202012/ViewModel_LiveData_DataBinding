package kim.hsl.vld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import kim.hsl.vld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 1. 加载数据绑定布局
        var activityMainBinding: ActivityMainBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        // 2. 获取数据模型
        var viewModel: MyViewModel = ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory(application)).get(MyViewModel::class.java)
        // 3. 向布局中设置数据模型对象
        activityMainBinding.viewmodel = viewModel
        // 4. 设置 LiveData 在 DataBinding 中观察者生命周期所有者
        activityMainBinding.lifecycleOwner = this

    }
}