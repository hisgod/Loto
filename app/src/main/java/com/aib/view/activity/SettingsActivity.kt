package com.aib.view.activity

import android.os.Bundle
import com.aib.mgt.R
import com.aib.mgt.databinding.ActivitySettingsBinding

/**
 * 更多设置
 */
class SettingsActivity : BaseActivity<ActivitySettingsBinding>() {

    override fun getResId(): Int = R.layout.activity_settings

    override fun initData(savedInstanceState: Bundle?) {
        binding.tb.setNavigationOnClickListener {
            finish()
        }
    }
}
