# Kapng-Android 
### An android library to create or display apng

# Example of apng :

![apng-example](https://upload.wikimedia.org/wikipedia/commons/1/14/Animated_PNG_example_bouncing_beach_ball.png)

# How to use this library :

## To load an animated png to an imageView : 
```kotlin
val imageUrl = "https://upload.wikimedia.org/wikipedia/commons/1/14/Animated_PNG_example_bouncing_beach_ball.png"

ApngDecoder.decodeApngAsyncInto(context, URL(url), imageView)
```

You can load a file, an uri, a resource int, an url, or an inputStream.

导库的方式：

allprojects {

		repositories {
			
			
			maven { url 'https://jitpack.io' }
			
		}
	}
	
 
 dependencies {
 
	        implementation 'com.github.raotongGitup:Kapng-Android-master:Tag'
		
	}
 

