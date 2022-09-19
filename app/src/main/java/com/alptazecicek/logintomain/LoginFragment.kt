package com.alptazecicek.logintomain

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.alptazecicek.logintomain.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    val email = "fmss@gmail.com"
    val password = "1234"
    private lateinit var fragmentLoginBinding: FragmentLoginBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentLoginBinding = FragmentLoginBinding.inflate(inflater)
        return fragmentLoginBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // email and password check. if its not correct a hint message giving with toast.
        fragmentLoginBinding.logInBtn.setOnClickListener {
            if (fragmentLoginBinding.emailEdittext.text.toString() == email
                && fragmentLoginBinding.passwordEdittext.text.toString() == password )
            findNavController().navigate(R.id.action_loginFragment_to_main_graph)
            else Toast.makeText(requireContext(), "Wrong email and password!\nHint= $email $password", Toast.LENGTH_SHORT).show()

        }
    }

}