package oupson.apngcreator.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import org.jetbrains.annotations.NotNull;

import java.net.URL;

import oupson.apng.decoder.ApngDecoder;
import oupson.apngcreator.BuildConfig;
import oupson.apngcreator.R;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

public class MainActivity2 extends AppCompatActivity {

    public static String TAG = MainActivity2.class.getCanonicalName();

    private ImageView imageMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageMain = ((ImageView) findViewById(R.id.image_main));
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

    }
}