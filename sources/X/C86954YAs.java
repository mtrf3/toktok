package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import kotlin.jvm.internal.o;

/* renamed from: X.YAs, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86954YAs extends AbstractC86959YAx {
    public final YB2 LJLILLLLZI;
    public final SensorManager LJLJI;
    public final InterfaceC86960YAy LJLJJI;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        o.LJIIIZ(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent event) {
        o.LJIIIZ(event, "event");
        double LIZ = AbstractC86959YAx.LIZ(event);
        if (this.LJLIL) {
            float[] fArr = new float[9];
            if (this.LJLJI != null) {
                SensorManager.getRotationMatrixFromVector(fArr, event.values);
            }
            double[] dArr = new double[9];
            int i = 0;
            do {
                dArr[i] = fArr[i];
                i++;
            } while (i < 9);
            this.LJLJJI.F7(dArr, LIZ);
            YB2 yb2 = this.LJLILLLLZI;
            float[] fArr2 = event.values;
            o.LJIIIIZZ(fArr2, "event.values");
            yb2.LJ(fArr2, LIZ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86954YAs(YB2 mListener, SensorManager sensorManager, InterfaceC86960YAy effectController, boolean z) {
        super(z);
        o.LJIIIZ(mListener, "mListener");
        o.LJIIIZ(effectController, "effectController");
        this.LJLILLLLZI = mListener;
        this.LJLJI = sensorManager;
        this.LJLJJI = effectController;
    }
}
