package com.example.san.pages

import androidx.compose.runtime.*
import com.example.san.components.BackToTopButton
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
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.dom.Text
import com.varabyte.kobweb.worker.rememberWorker


@Page
@Composable
fun HomePage() {
   Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            MainSection()
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
   }
}

