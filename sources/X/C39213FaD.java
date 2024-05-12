package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.Iterator;

/* renamed from: X.FaD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39213FaD implements SensorEventListener {
    public final /* synthetic */ C39212FaC LJLIL;

    public C39213FaD(C39212FaC c39212FaC) {
        this.LJLIL = c39212FaC;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        synchronized (this.LJLIL.LJFF) {
            Iterator<SensorEventListener> it = this.LJLIL.LJFF.iterator();
            while (it.hasNext()) {
                it.next().onSensorChanged(sensorEvent);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        synchronized (this.LJLIL.LJFF) {
            Iterator<SensorEventListener> it = this.LJLIL.LJFF.iterator();
            while (it.hasNext()) {
                it.next().onAccuracyChanged(sensor, i);
            }
        }
    }
}
