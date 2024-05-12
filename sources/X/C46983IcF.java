package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import kotlin.jvm.internal.o;

/* renamed from: X.IcF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46983IcF implements SensorEventListener {
    public float LJLIL = -1.0f;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        o.LJIIIZ(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent event) {
        o.LJIIIZ(event, "event");
        try {
            this.LJLIL = event.values[0];
        } catch (Throwable unused) {
        }
    }
}
