package com.example.san.pages

import androidx.compose.runtime.*
import com.example.san.components.BackToTopButton
import com.example.san.components.OverflowMenu
import com.example.san.sections.AboutSection
import com.example.san.sections.AchievementSection
import com.example.san.sections.ContactSection
import com.example.san.sections.ExperienceSection
import com.example.san.sections.FooterSection
import com.example.san.sections.MainSection
import com.example.san.sections.PortfolioSection
import com.example.san.sections.ServiceSection
import com.example.san.sections.TestimonialSection
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page

@Page
@Composable
fun HomePage() {
    var menuOpened by remember { mutableStateOf(false) }
   Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            MainSection(onMenuClicked = { menuOpened = true })
            AboutSection()
            ServiceSection()
            PortfolioSection()
            AchievementSection()
            TestimonialSection()
            ExperienceSection()
            ContactSection()
            FooterSection()
        }
       BackToTopButton()
       if (menuOpened) {
           OverflowMenu(onMenuClosed = { menuOpened = false })
       }
   }
}

