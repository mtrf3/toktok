package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.YAt, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86955YAt extends AbstractC86959YAx {
    public final YB2 LJLILLLLZI;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        o.LJIIIZ(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent event) {
        o.LJIIIZ(event, "event");
        if (this.LJLIL) {
            YB2 yb2 = this.LJLILLLLZI;
            float[] fArr = event.values;
            o.LJIIIIZZ(fArr, "event.values");
            yb2.LJ(fArr, AbstractC86959YAx.LIZ(event));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86955YAt(YB2 mListener, boolean z) {
        super(z);
        o.LJIIIZ(mListener, "mListener");
        this.LJLILLLLZI = mListener;
    }
}
