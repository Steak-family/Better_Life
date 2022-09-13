package com.karrar.betterlife.ui.util

import androidx.databinding.BindingAdapter
import androidx.databinding.InverseBindingAdapter
import androidx.databinding.InverseBindingListener
import com.google.android.material.chip.ChipGroup

@BindingAdapter(value = ["checkedChipButtonId"])
fun setCheckedChipId(view: ChipGroup?, id: Int) {
    if (view?.checkedChipId != id) {
        view?.check(id)
    }
}

@InverseBindingAdapter(attribute = "checkedChipButtonId", event = "checkedChipButtonId")
fun getChipId(view: ChipGroup?): Int? {
    return view?.checkedChipId
}

@BindingAdapter("checkedChipButtonId")
fun setChipsListener(view: ChipGroup?, attChange: InverseBindingListener) {
    view?.setOnCheckedStateChangeListener { group, checkedId ->
        attChange.onChange()
    }
}