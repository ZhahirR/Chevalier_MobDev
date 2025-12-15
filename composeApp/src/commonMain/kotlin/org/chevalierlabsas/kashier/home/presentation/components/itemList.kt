package org.chevalierlabsas.kashier.home.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.chevalierlabsas.kashier.home.domain.Item
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun ListItem(
    item: Item,
    onEditClick: () -> Unit,
    onAddClick: () -> Unit,
    modifier: Modifier = Modifier
){
    Card(modifier = modifier
        .fillMaxWidth()
        .padding(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.secondary,
            contentColor = MaterialTheme.colorScheme.onSecondary
        ),
        shape = MaterialTheme.shapes.medium
    ) {
        Row(modifier = modifier
            .padding(start = 16.dp, end = 12.dp, top = 8.dp, bottom = 8.dp)
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween)
        {
            Column{
                Text(
                    text = item.name,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Rp. ${item.price.toUInt()}",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Row {
                IconButton(onClick = onEditClick,
                    modifier = Modifier.size(32.dp)) {
                    Icon(imageVector = Icons.Filled.Edit,
                        contentDescription = "Edit"
                    )
                }
                IconButton(onClick = onAddClick,
                    modifier = Modifier.size(32.dp)) {
                    Icon(imageVector = Icons.Filled.Add,
                        contentDescription = "Tambah" )
                }
            }
        }
    }
}

@Preview
@Composable
fun ListItemPreview() {
    MaterialTheme{
        ListItem(
            item = Item(1,1,"Telor",12000.0),
            onEditClick = {},
            onAddClick = {}
        )
    }
}

@Composable
fun MaterialTheme(content: @Composable () -> Unit) {
    TODO("Not yet implemented")
}