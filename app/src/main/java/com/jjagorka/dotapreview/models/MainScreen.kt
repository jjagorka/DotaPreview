package com.jjagorka.dotapreview.models


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.jjagorka.dotapreview.R


@Preview
@Composable
fun MainScreen() {
    Column {
        LazyColumn() {
            item {
                HeaderBackground(
                    painter = painterResource(id = R.drawable.logo),
                    modifier = Modifier
                )
            }
            item { Title(Modifier, R.drawable.icon) }
            item { GameTags(Modifier) }
            item { Description(Modifier) }
            item { ScreenShots(Modifier) }
            item { Reviews(Modifier) }
            item { Reviewers(Modifier) }
            item { InstallButton(Modifier, buttonText = R.string.install_button_label) }


        }
    }
}

