package com.nbd.retonavbar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nbd.retonavbar.databinding.FragmentFormBinding
import com.nbd.retonavbar.databinding.FragmentResultBinding


class ResultFragment : Fragment() {
    private lateinit var binding: FragmentResultBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentResultBinding.inflate(layoutInflater)

        binding.etResName.setText(arguments?.getString("name"))
        binding.etResApelldioPaterno.setText(arguments?.getString("apellidoPaterno"))
        binding.etResApelldioMaterno.setText(arguments?.getString("apellidoMaterno"))
        binding.etResUsername.setText(arguments?.getString("user"))
        binding.etResEmail.setText(arguments?.getString("email"))
        binding.etResGamerTag.setText(arguments?.getString("gamertag"))
        binding.etResTextPassword.setText(arguments?.getString("password"))

        return binding.root
    }

}