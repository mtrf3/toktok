package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.Build;
import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.YAr, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86953YAr extends AbstractC86959YAx {
    public final YB2 LJLILLLLZI;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        o.LJIIIZ(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent event) {
        int i;
        o.LJIIIZ(event, "event");
        float[] fArr = event.values;
        int i2 = 0;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = 0;
        if (f2 > f3 && Math.abs(f) < f2) {
            i = 0;
        } else if (f > f3 && Math.abs(f2) < f) {
            i = 270;
        } else if (f2 < f3 && Math.abs(f) < (-f2)) {
            i = 180;
        } else {
            i = 90;
        }
        if (!TextUtils.equals(Build.MODEL, "vivo X9")) {
            i2 = i;
        }
        if (this.LJLIL) {
            this.LJLILLLLZI.LIZLLL(i2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86953YAr(YB2 mListener, boolean z) {
        super(z);
        o.LJIIIZ(mListener, "mListener");
        this.LJLILLLLZI = mListener;
    }
}
