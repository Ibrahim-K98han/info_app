package com.example.day21

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.example.day21.databinding.FragmentInforamtionBinding

class InforamtionFragment : Fragment() {

    /*private lateinit var fnameTv:TextView
    private lateinit var lnameTv:TextView
    private lateinit var emailTv:TextView
    private lateinit var phoneTv:TextView*/

    private lateinit var binding:FragmentInforamtionBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentInforamtionBinding.inflate(inflater,container,false)

        val fname = arguments?.getString("faname")
        val lname = arguments?.getString("lname")
        val phone = arguments?.getString("phone")
        val email = arguments?.getString("email")

        binding.fnameTv.text = fname
        binding.lnameTv.text = lname
        binding.phoneTv.text = phone
        binding.emailTv.text = email

        return binding.root
    }

    /*override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fnameTv = view.findViewById(R.id.fnameTv)
        lnameTv = view.findViewById(R.id.lnameTv)
        emailTv = view.findViewById(R.id.emailTv)
        phoneTv = view.findViewById(R.id.phoneTv)

        val fname = arguments?.getString("fname")
        val lname = arguments?.getString("lname")
        val email = arguments?.getString("phone")
        val phone = arguments?.getString("email")

        fnameTv.text = "First name : $fname"
        lnameTv.text = "Last name : $lname"
        emailTv.text = "Email : $email"
        phoneTv.text = "Phone : $phone"

        //Toast.makeText(activity, "Welcome $email"+"Name $name", Toast.LENGTH_SHORT).show()
    }*/

}