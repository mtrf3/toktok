package X;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.internal.AqS110S0300000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.FZo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39188FZo {
    public static final C39187FZn LIZ = new C39187FZn();

    public static final void LIZ(SensorManager unregisterListener, YBI ybi, Sensor sensor, Cert cert) {
        LIZ.getClass();
        o.LJIIJ(unregisterListener, "$this$unregisterListener");
        OHW LIZ2 = C39187FZn.LIZ(100701, cert, "sensor_unregisterListener");
        C78929UyL.LIZIZ(LIZ2, "android/hardware/SensorManager", "unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V", C113554cx.LJJL(new OSZ("listener", ybi), new OSZ("sensor", sensor)));
        C39207Fa7.LIZ(LIZ2, new AqS110S0300000_6(unregisterListener, ybi, sensor, 3));
    }
}
