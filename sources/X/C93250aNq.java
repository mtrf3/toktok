package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: X.aNq, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93250aNq implements SensorEventListener {
    public final /* synthetic */ C93251aNr LJLIL;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public C93250aNq(C93251aNr c93251aNr) {
        this.LJLIL = c93251aNr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.LJLIL.LJIILJJIL = sensorEvent.values;
    }
}
