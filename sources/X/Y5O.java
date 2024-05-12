package X;

import android.hardware.Sensor;
import android.hardware.SensorManager;

/* loaded from: classes16.dex */
public final class Y5O implements VKC {
    public final Y5K LIZ;
    public Y5N LIZIZ;

    @Override // X.VKC
    public final void LIZ() {
    }

    public final boolean LIZIZ() {
        if (this.LIZ != null) {
            return true;
        }
        return false;
    }

    public final void LIZJ() {
        Y5N y5n = this.LIZIZ;
        Sensor sensor = y5n.LJLILLLLZI;
        if (sensor != null) {
            SensorManager sensorManager = y5n.LJLIL;
            if (new C03880Dg(2).LIZJ(100701, "android/hardware/SensorManager", "unregisterListener", sensorManager, new Object[]{y5n, sensor}, "void", new C65300Pk0(false, "(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V", "1967622647663670777")).LIZ) {
                return;
            }
            sensorManager.unregisterListener(y5n, sensor);
        }
    }

    public Y5O(Y5K y5k) {
        this.LIZ = y5k;
    }
}
