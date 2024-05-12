package X;

import android.content.ClipData;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaMetadataRetriever;

/* loaded from: classes12.dex */
public interface PPT extends InterfaceC39538FfS {
    void LIZ(SensorManager sensorManager, SensorEventListener sensorEventListener);

    void LIZJ(ClipData clipData);

    String LIZLLL(MediaMetadataRetriever mediaMetadataRetriever);

    boolean LJ(SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor, int i);

    String getLocale();

    Camera openCamera(int i);

    void releaseCamera(Camera camera);
}
