package com.samedtemiz.android_learning.navigation

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController
import com.samedtemiz.android_learning.R

class Dialog : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setMessage("This dialog title")
                .setPositiveButton("OK", DialogInterface.OnClickListener { dialog, id ->
                    // OK'a basınca olacak olaylar

                })
                .setNegativeButton("Cancel", DialogInterface.OnClickListener { dialog, id ->
                    // Cancel'a basınca olacak olaylar

                })

            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}