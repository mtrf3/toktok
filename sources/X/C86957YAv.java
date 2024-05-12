package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.YAv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86957YAv extends AbstractC86959YAx {
    public final InterfaceC86960YAy LJLILLLLZI;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        o.LJIIIZ(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent event) {
        o.LJIIIZ(event, "event");
        double LIZ = AbstractC86959YAx.LIZ(event);
        if (this.LJLIL) {
            InterfaceC86960YAy interfaceC86960YAy = this.LJLILLLLZI;
            float[] fArr = event.values;
            interfaceC86960YAy.LLIIII(fArr[0], fArr[1], fArr[2], LIZ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86957YAv(InterfaceC86960YAy processor, boolean z) {
        super(z);
        o.LJIIIZ(processor, "processor");
        this.LJLILLLLZI = processor;
    }
}
