package com.example.day21

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import com.example.day21.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    /*private lateinit var fnameTv:EditText
    private lateinit var lnameTv:EditText
    private lateinit var emailTv:EditText
    private lateinit var phoneTv:EditText
    private lateinit var regBtn:Button*/

    private lateinit var binding:FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        binding.regBtn.setOnClickListener {
            val fname = binding.fnameTv.text.toString()
            val lname  = binding.lnameTv.text.toString()
            val phone = binding.phoneTv.text.toString()
            val email = binding.emailTv.text.toString()

            val bundle = Bundle().apply {
                putString("faname",fname)
                putString("lname",lname)
                putString("phone",phone)
                putString("email",email)
            }
            findNavController()
                .navigate(R.id.action_homeFragment_to_inforamtionFragment,bundle)
        }
        return binding.root
    }

    /*override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fnameTv = view.findViewById(R.id.fnameTv)
        lnameTv = view.findViewById(R.id.lnameTv)
        emailTv = view.findViewById(R.id.emailTv)
        phoneTv = view.findViewById(R.id.phoneTv)
        regBtn = view.findViewById(R.id.regBtn)

        regBtn.setOnClickListener {
            val fname = fnameTv.text.toString()
            val lname  = lnameTv.text.toString()
            val phone = phoneTv.text.toString()
            val email = emailTv.text.toString()


            val bundle = Bundle().apply {
                putString("fname",fname)
                putString("lname",lname)
                putString("phone",phone)
                putString("email",email)
            }
            findNavController()
                .navigate(R.id.action_homeFragment_to_inforamtionFragment,bundle)
        }
    }*/

}