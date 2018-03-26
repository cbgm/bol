package cbgm.bookoflife.state

import android.os.Bundle
import android.support.v4.app.FragmentTransaction
import cbgm.bookoflife.R
import cbgm.bookoflife.fragment.BucketFragment
import cbgm.bookoflife.fragment.HomeFragment

/**
 * Created by SA_Admin on 06.02.2018.
 */
class BucketState(val stateName: String, val intentData: Map<String,Any>): AppState {
    override fun apply(fragmentTransaction: FragmentTransaction) {
        val bundle = Bundle()
        val bucketFragment = BucketFragment()
        bucketFragment.setArguments(bundle)
        fragmentTransaction.addToBackStack(this.stateName)
        fragmentTransaction.replace(R.id.fragment_holder, bucketFragment, this.stateName)
    }

}