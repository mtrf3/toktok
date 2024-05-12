package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.Iterator;

/* loaded from: classes16.dex */
public class YBI implements SensorEventListener {
    public final /* synthetic */ YBH LJLIL;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public YBI(YBH ybh) {
        this.LJLIL = ybh;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f = this.LJLIL.LIZLLL;
        if (f != 0.0f) {
            float f2 = (((float) sensorEvent.timestamp) - f) * 1.0E-9f;
            float[] fArr = sensorEvent.values;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[2];
            float f6 = f5 * f5;
            float sqrt = (float) Math.sqrt(f6 + (f4 * f4) + (f3 * f3));
            float[] fArr2 = this.LJLIL.LIZJ;
            float f7 = fArr2[0];
            float[] fArr3 = sensorEvent.values;
            fArr2[0] = (fArr3[0] * f2) + f7;
            fArr2[1] = (fArr3[1] * f2) + fArr2[1];
            float f8 = (fArr3[2] * f2) + fArr2[2];
            fArr2[2] = f8;
            float f9 = f8 * f8;
            float sqrt2 = (float) Math.sqrt(f9 + (r2 * r2) + (r4 * r4));
            if (sqrt > 0.5f || sqrt2 > 0.5f) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onSensorChanged omegaMagnitude = ");
                LIZ.append(sqrt);
                LIZ.append(" angle = ");
                LIZ.append(sqrt2);
                C63922P6w.LIZ("Gyro", X1D.LIZIZ(LIZ));
                Iterator<YBJ> it = this.LJLIL.LJ.iterator();
                while (it.hasNext()) {
                    it.next().LIZ();
                }
                this.LJLIL.LIZ();
            }
        }
        this.LJLIL.LIZLLL = (float) sensorEvent.timestamp;
    }
}
