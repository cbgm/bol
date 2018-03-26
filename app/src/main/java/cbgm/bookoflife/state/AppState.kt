package cbgm.bookoflife.state

import android.support.v4.app.FragmentTransaction

/**
 * Created by SA_Admin on 06.02.2018.
 */
interface AppState {

    fun apply(fragmentTransaction: FragmentTransaction)
}