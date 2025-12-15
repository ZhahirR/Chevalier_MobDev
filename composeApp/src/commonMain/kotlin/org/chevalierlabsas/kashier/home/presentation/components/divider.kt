package org.chevalierlabsas.kashier.home.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun Divider(onToggleClick: () -> Unit) {
    Row(
        modifier = Modifier
        .fillMaxWidth()
            .padding(vertical = 8.dp, horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Semua Barang",
            color = MaterialTheme.colorScheme.onSurface,
            fontWeight = FontWeight.Bold,
        )
        HorizontalDivider(
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 16.dp),
            color = MaterialTheme.colorScheme.onSurface,
        )
        IconButton(onClick = onToggleClick,
                    modifier = Modifier.size (24.dp)){
        Icon(
            imageVector = Icons.Default.ArrowDropDown,
            contentDescription = "Toggle",
            tint = MaterialTheme.colorScheme.onSurface,
        )}
    }
}

@Preview
@Composable
fun PreviewDivider() {
        Divider(
            onToggleClick = ()
        )
}