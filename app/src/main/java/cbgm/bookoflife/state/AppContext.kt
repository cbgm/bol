package cbgm.bookoflife.state

import android.support.v4.app.FragmentTransaction
import java.util.*

/**
 * Created by SA_Admin on 06.02.2018.
 */
object AppContext {

    private var curAppState: AppState? = null
    private var stateHistory: Deque<AppState> = ArrayDeque<AppState>()

    fun setAppState(state: AppState) {
        this.curAppState = state
    }

    fun switchAppState(transaction: FragmentTransaction) {
        this.curAppState?.apply(transaction)
        this.stateHistory.push(this.curAppState)
    }

    fun popHistory() {
        this.stateHistory.pop();
    }
}