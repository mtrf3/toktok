package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.YAu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86956YAu extends AbstractC86959YAx {
    public final YB0 LJLILLLLZI;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent event) {
        o.LJIIIZ(event, "event");
        double LIZ = AbstractC86959YAx.LIZ(event);
        if (this.LJLIL) {
            this.LJLILLLLZI.LIZJ(event.values, LIZ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86956YAu(boolean z, YB0 holder) {
        super(z);
        o.LJIIIZ(holder, "holder");
        this.LJLILLLLZI = holder;
    }
}
