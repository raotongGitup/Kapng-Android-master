# Kapng-Android 
### An android library to create or display apng

# Example of apng :

![apng-example](https://upload.wikimedia.org/wikipedia/commons/1/14/Animated_PNG_example_bouncing_beach_ball.png)

# How to use this library :

## To load an animated png to an imageView : 
   String imageUrl = "http://res.halolive.net/room/background/1/9.png";


        ApngDecoder.decodeApngAsyncInto(MainActivity2.this, imageUrl, imageMain, 1f, new ApngDecoder.Callback() {
            @Override
            public void onSuccess(@NotNull Drawable drawable) {
                if (BuildConfig.DEBUG)
                    Log.i(TAG, "Success");
            }

            @Override
            public void onError(@NotNull Exception error) {
                Log.e(TAG, "Error : " + error.toString());
            }
        });
```

You can load a file, an uri, a resource int, an url, or an inputStream.

导库的方式：

allprojects {

		repositories {
			
			
			maven { url 'https://jitpack.io' }
			
		}
	}
	
 
 dependencies {
 
	        implementation 'com.github.raotongGitup:Kapng-Android-master:v1.0'
		
	}
 

