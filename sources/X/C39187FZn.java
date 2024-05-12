package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.FZn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39187FZn {
    public static OHW LIZ(int i, Cert cert, String str) {
        return new OHW(cert, str, new String[]{"sensor"}, Integer.valueOf(EnumC39200Fa0.BPEA_ENTRY.getType()), "Collect", i);
    }

    public static void LIZLLL(SensorManager unregisterListener, SensorEventListener sensorEventListener, Cert cert) {
        o.LJIIJ(unregisterListener, "$this$unregisterListener");
        OHW LIZ = LIZ(100701, cert, "sensor_unregisterListener");
        C78929UyL.LIZIZ(LIZ, "android/hardware/SensorManager", "unregisterListener(Landroid/hardware/SensorEventListener;)V", C51029K0z.LJJIIZI(new OSZ("listener", sensorEventListener)));
        C39207Fa7.LIZ(LIZ, new AqS137S0200000_6(unregisterListener, sensorEventListener, 5));
    }

    public static boolean LIZJ(SensorManager registerListener, SensorEventListener sensorEventListener, Sensor sensor, int i, Cert cert) {
        o.LJIIJ(registerListener, "$this$registerListener");
        OHW LIZ = LIZ(100700, cert, "sensor_registerListener");
        C78929UyL.LIZIZ(LIZ, "android/hardware/SensorManager", "registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z", C113554cx.LJJL(new OSZ("listener", sensorEventListener), new OSZ("sensor", sensor), new OSZ("samplingPeriodUs", Integer.valueOf(i))));
        return ((Boolean) C39207Fa7.LIZ(LIZ, new C39186FZm(registerListener, sensorEventListener, sensor, i))).booleanValue();
    }

    public static boolean LIZIZ(SensorManager registerListener, SensorEventListener sensorEventListener, Sensor sensor, int i, Handler handler, Cert cert) {
        o.LJIIJ(registerListener, "$this$registerListener");
        OHW LIZ = LIZ(100700, cert, "sensor_registerListener");
        C78929UyL.LIZIZ(LIZ, "android/hardware/SensorManager", "registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;ILandroid/os/Handler;)Z", C113554cx.LJJL(new OSZ("listener", sensorEventListener), new OSZ("sensor", sensor), new OSZ("samplingPeriodUs", Integer.valueOf(i)), new OSZ("handler", handler)));
        return ((Boolean) C39207Fa7.LIZ(LIZ, new C39185FZl(registerListener, sensorEventListener, sensor, i, handler))).booleanValue();
    }
}
