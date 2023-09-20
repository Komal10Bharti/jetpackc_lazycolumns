package com.k.t3
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
@Preview(heightDp = 500)
@Composable
fun PreviewItem()
{
//    BlogCategory(
//        img = R.drawable.user,
//        title = "Programmer",
//        subtitle ="Learn programming"
//    )
//    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
//        getCategoryList().map{ item ->
//            BlogCategory(img = item.img, title = item.title, subtitle = item.subtitle)
//        }
//    }
    LazyColumn(content = {
        items(getCategoryList()){item ->
            BlogCategory(img = item.img, title = item.title, subtitle = item.subtitle)
        }
    })
}
@Composable
fun BlogCategory(img:Int , title: String , subtitle: String )
{
    Card(

        modifier = Modifier.padding(8.dp)
    )
    {
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier=Modifier.padding(8.dp))
        {
            Image(painter = painterResource(id = img),
                contentDescription = "",
                modifier = Modifier
                    .size(48.dp)
                    .padding(8.dp)
                    .weight(.2f)
                )

            Extracted(title, subtitle , Modifier.weight(.8f ))
        }
    }
}

@Composable
fun Extracted(title: String, subtitle: String, modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.headlineMedium
//                fontWeight = FontWeight.Bold
        )

        Text(
            text = subtitle,
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Thin
        )
    }
}
data class Category(val img: Int , val title:String , val subtitle: String)
fun getCategoryList(): MutableList<Category>{
    val list =  mutableListOf<Category>()
    list.add(Category(R.drawable.user , title = "Programmer" , subtitle = "learning"))
    list.add(Category(R.drawable.user , title = "Developer" , subtitle = "learning"))
    list.add(Category(R.drawable.user , title = "Tester" , subtitle = "learning"))
    list.add(Category(R.drawable.user , title = "Engineer" , subtitle = "learning"))
    list.add(Category(R.drawable.user , title = "Designer" , subtitle = "learning"))
    list.add(Category(R.drawable.user , title = "Coder" , subtitle = "learning"))
    list.add(Category(R.drawable.user , title = "Entrepreneur" , subtitle = "learning"))
    list.add(Category(R.drawable.user , title = "Student" , subtitle = "learning"))
    list.add(Category(R.drawable.user , title = "Professor" , subtitle = "learning"))

    return list
}