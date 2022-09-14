package com.karrar.betterlife.ui.edit

import androidx.navigation.Navigation
import com.karrar.betterlife.R
import com.karrar.betterlife.databinding.FragmentEditHabitBinding
import com.karrar.betterlife.ui.HabitInteractionListener
import com.karrar.betterlife.ui.base.BaseFragment
import com.karrar.betterlife.util.EventObserve

class EditHabitFragment : BaseFragment<FragmentEditHabitBinding, EditHabitViewModel>(){
    override val layoutIdFragment = R.layout.fragment_edit_habit
    override val viewModelClass = EditHabitViewModel::class.java

    override fun setup() {
        startTheGame()
    }

    private fun startTheGame() {
        viewModel.navigateTOEditHabit.observe(this, EventObserve {
            if (it) {
                Navigation.findNavController(binding.root)
                    .navigate(EditHabitFragmentDirections.actionEditFragmentToEditHabitDialog())
            }
        })
    }
}