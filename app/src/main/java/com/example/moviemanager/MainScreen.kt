package com.example.moviemanager

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade


@Composable
fun VideoThumbnail(photo: Photo, onClickEvent: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(
            modifier = Modifier
                .background(Color.LightGray)
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(photo.thumbnailUrl)
                    .crossfade(true)
                    .build(),
                contentDescription = photo.describtion,
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f)
                    .clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = photo.describtion,
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier
                    .clickable(true) {
                        onClickEvent()
                    }
            )
        }
    }
}

data class Photo(val id: Int, val thumbnailUrl: String, val movieUrl: String, val describtion: String)

val photoList = listOf(
    Photo(
        1,
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1jl_IhNcfipvMyNeo3nqLEWtYTi4V8EqmxgijwFXZd0_MPv1m95PZzB9-5K1IoLpARU0&usqp=CAU",
        "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4",
        "Photo 1"
    ),
    Photo(
        2,
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1jl_IhNcfipvMyNeo3nqLEWtYTi4V8EqmxgijwFXZd0_MPv1m95PZzB9-5K1IoLpARU0&usqp=CAU",
        "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4",
        "Photo 2"
    ),
    Photo(
        3,
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1jl_IhNcfipvMyNeo3nqLEWtYTi4V8EqmxgijwFXZd0_MPv1m95PZzB9-5K1IoLpARU0&usqp=CAU",
        "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4",
        "Photo 3"
    ),
    Photo(
        4,
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1jl_IhNcfipvMyNeo3nqLEWtYTi4V8EqmxgijwFXZd0_MPv1m95PZzB9-5K1IoLpARU0&usqp=CAU",
        "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4",
        "Photo 4"
    ),
    Photo(
        5,
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1jl_IhNcfipvMyNeo3nqLEWtYTi4V8EqmxgijwFXZd0_MPv1m95PZzB9-5K1IoLpARU0&usqp=CAU",
        "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4",
        "Photo 5"
    ),
    Photo(
        6,
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1jl_IhNcfipvMyNeo3nqLEWtYTi4V8EqmxgijwFXZd0_MPv1m95PZzB9-5K1IoLpARU0&usqp=CAU",
        "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4",
        "Photo 6"
    ),
    Photo(
        7,
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1jl_IhNcfipvMyNeo3nqLEWtYTi4V8EqmxgijwFXZd0_MPv1m95PZzB9-5K1IoLpARU0&usqp=CAU",
        "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4",
        "Photo 7"
    ),
    Photo(
        8,
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1jl_IhNcfipvMyNeo3nqLEWtYTi4V8EqmxgijwFXZd0_MPv1m95PZzB9-5K1IoLpARU0&usqp=CAU",
        "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4",
        "Photo 8"
    ),
    Photo(
        9,
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1jl_IhNcfipvMyNeo3nqLEWtYTi4V8EqmxgijwFXZd0_MPv1m95PZzB9-5K1IoLpARU0&usqp=CAU",
        "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4",
        "Photo 9"
    ),
    Photo(
        10,
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1jl_IhNcfipvMyNeo3nqLEWtYTi4V8EqmxgijwFXZd0_MPv1m95PZzB9-5K1IoLpARU0&usqp=CAU",
        "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4",
        "Photo 10"
    ),
    Photo(
        11,
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1jl_IhNcfipvMyNeo3nqLEWtYTi4V8EqmxgijwFXZd0_MPv1m95PZzB9-5K1IoLpARU0&usqp=CAU",
        "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4",
        "Photo 11"
    ),
    Photo(
        12,
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1jl_IhNcfipvMyNeo3nqLEWtYTi4V8EqmxgijwFXZd0_MPv1m95PZzB9-5K1IoLpARU0&usqp=CAU",
        "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4",
        "Photo 12"
    )
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                ),
                title = {
                    Text("Movie Manager")
                },
                actions = {
                    IconButton(onClick = {navController.navigate(Screen.SettingScreen.route) }) {
                        Icon(Icons.Filled.Settings, contentDescription = "Setting")
                    }
                }
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.primary
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    text = "Bottom app bar"
                )
            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { }) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        }
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            MoviesGrid(navController)
        }
    }
}

@Composable
fun MoviesGrid(navController: NavController) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 128.dp),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White, RoundedCornerShape(12.dp))
            .padding(8.dp)
    ) {
        items(photoList, key = { it.id }) { photo ->
            VideoThumbnail(photo = photo) {
                navController.navigate(Screen.MovieDetail.route + "?movieUrl=${photo.movieUrl}")
            }
        }
    }
}