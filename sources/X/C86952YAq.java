package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.YAq, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86952YAq extends AbstractC86959YAx {
    public final C86953YAr LJLILLLLZI;
    public final InterfaceC86960YAy LJLJI;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        o.LJIIIZ(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent event) {
        o.LJIIIZ(event, "event");
        if (this.LJLIL) {
            double LIZ = AbstractC86959YAx.LIZ(event);
            InterfaceC86960YAy interfaceC86960YAy = this.LJLJI;
            float[] fArr = event.values;
            interfaceC86960YAy.K3(fArr[0], fArr[1], fArr[2], LIZ);
            this.LJLILLLLZI.onSensorChanged(event);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86952YAq(InterfaceC86960YAy effectController, boolean z) {
        super(z);
        o.LJIIIZ(effectController, "effectController");
        this.LJLJI = effectController;
        this.LJLILLLLZI = new C86953YAr(effectController.LIZIZ(), z);
    }
}
