package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.lynx.canvas.hardware.HardwareManager;

/* renamed from: X.Fas, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39254Fas implements SensorEventListener {
    public final float[] LJLIL = new float[16];
    public final float[] LJLILLLLZI = new float[3];
    public final /* synthetic */ HardwareManager LJLJI;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public C39254Fas(HardwareManager hardwareManager) {
        this.LJLJI = hardwareManager;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 15) {
            if (this.LJLJI.LIZ != 0) {
                SensorManager.getRotationMatrixFromVector(this.LJLIL, sensorEvent.values);
                SensorManager.getOrientation(this.LJLIL, this.LJLILLLLZI);
                long j = this.LJLJI.LIZ;
                float[] fArr = this.LJLILLLLZI;
                HardwareManager.nativeNotifyOrientationData(j, fArr[2], -fArr[1], -fArr[0], sensorEvent.timestamp);
                return;
            }
            return;
        }
        if (sensorEvent.sensor.getType() != 4) {
            return;
        }
        long j2 = this.LJLJI.LIZ;
        if (j2 == 0) {
            return;
        }
        float[] fArr2 = sensorEvent.values;
        HardwareManager.nativeNotifyGyroscopeData(j2, fArr2[0], fArr2[1], fArr2[2], sensorEvent.timestamp);
    }
}
