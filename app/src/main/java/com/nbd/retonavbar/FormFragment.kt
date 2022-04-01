package com.nbd.retonavbar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.nbd.retonavbar.databinding.FragmentFormBinding


class FormFragment : Fragment() {
    private lateinit var binding: FragmentFormBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentFormBinding.inflate(layoutInflater)
        val navController=findNavController()
        binding.btnSend.setOnClickListener{
            Toast.makeText(context, "Datos Registrados Con Éxito", Toast.LENGTH_SHORT).show()
            val destination=FormFragmentDirections.actionFormFragmentToResultFragment(
                binding.etName.getText().toString(),
                binding.etApelldioPaterno.getText().toString(),
                binding.etApelldioMaterno.getText().toString(),
                binding.etUsername.getText().toString(),
                binding.etEmail.getText().toString(),
                binding.etGamerTag.getText().toString(),
                binding.etTextPassword.getText().toString())
            navController.navigate(destination)
        }

        return binding.root
    }


}