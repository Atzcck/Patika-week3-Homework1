package com.alptazecicek.logintomain

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.alptazecicek.logintomain.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {

    private lateinit var fragmentWelcomeBinding: FragmentWelcomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentWelcomeBinding = FragmentWelcomeBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return fragmentWelcomeBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // fragment navigates with lets go button.
        fragmentWelcomeBinding.letsGoBtn.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_loginFragment)
        }
    }

}