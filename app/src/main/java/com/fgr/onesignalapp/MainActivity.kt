package com.fgr.onesignalapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.fgr.onesignalapp.navigation.SetupNavGraph
import com.fgr.onesignalapp.ui.theme.OneSignalAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OneSignalAppTheme {
                val navHostController = rememberNavController()
                SetupNavGraph(navHostController = navHostController)
            }
        }
    }
}