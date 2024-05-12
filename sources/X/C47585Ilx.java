package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import kotlin.jvm.internal.o;

/* renamed from: X.Ilx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47585Ilx implements SensorEventListener {
    public final double LJLIL;
    public final InterfaceC88472Yns<Double, C76800UCe> LJLILLLLZI;
    public float LJLJI;
    public int LJLJJI;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f;
        float f2;
        float f3;
        o.LJIIIZ(sensorEvent, "sensorEvent");
        float[] fArr = sensorEvent.values;
        if (fArr != null) {
            f = fArr[0];
        } else {
            f = 0.0f;
        }
        if (fArr != null) {
            f2 = fArr[1];
        } else {
            f2 = 0.0f;
        }
        if (fArr != null) {
            f3 = fArr[2];
        } else {
            f3 = 0.0f;
        }
        double sqrt = Math.sqrt(Math.pow(f3, 2.0d) + Math.pow(f2, 2.0d) + Math.pow(f, 2.0d));
        if (sqrt >= this.LJLIL && this.LJLJI * f <= 0.0f) {
            this.LJLJJI++;
            this.LJLJI = f;
        }
        if (this.LJLJJI >= 2) {
            this.LJLILLLLZI.invoke(Double.valueOf(sqrt));
            this.LJLJI = 0.0f;
            this.LJLJJI = 0;
        }
    }

    public C47585Ilx(double d, NC8 nc8) {
        this.LJLIL = d;
        this.LJLILLLLZI = nc8;
    }
}
