package kr.co.woobi.imyeon.instaclone
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class TabFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tab, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navHostFragment:NavHostFragment=childFragmentManager
            .findFragmentById(R.id.tab_nav_host_fragment) as NavHostFragment

        view.findViewById<BottomNavigationView>(R.id.bottomNavigationView)
            .setupWithNavController(navHostFragment.navController)
    }
}
