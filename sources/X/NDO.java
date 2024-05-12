package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.ss.android.ugc.aweme.ecommercelive.business.hybrid.HardwareAccelerometer$init$2;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NDO implements SensorEventListener {
    public static final NDO LJLIL = new NDO();
    public static SensorManager LJLILLLLZI;
    public static boolean LJLJI;
    public static HardwareAccelerometer$init$2 LJLJJI;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        o.LJIIIZ(sensor, "sensor");
    }

    public final void LIZ() {
        try {
            SensorManager sensorManager = LJLILLLLZI;
            if (sensorManager != null) {
                C39187FZn c39187FZn = C39188FZo.LIZ;
                C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476415492, "bpea-e_commerce_jsb_unregister_sensor");
                c39187FZn.getClass();
                C39187FZn.LIZLLL(sensorManager, this, LJJIIJ);
            }
        } catch (Q0C unused) {
        }
        LJLILLLLZI = null;
        LJLJI = false;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f;
        float f2;
        Float LJJJIL;
        Float LJJJIL2;
        Float LJJJIL3;
        if (sensorEvent == null || sensorEvent.sensor.getType() != 1) {
            return;
        }
        float[] fArr = sensorEvent.values;
        float f3 = 0.0f;
        if (fArr != null && (LJJJIL3 = ORY.LJJJIL(0, fArr)) != null) {
            f = LJJJIL3.floatValue();
        } else {
            f = 0.0f;
        }
        float[] fArr2 = sensorEvent.values;
        if (fArr2 != null && (LJJJIL2 = ORY.LJJJIL(1, fArr2)) != null) {
            f2 = LJJJIL2.floatValue();
        } else {
            f2 = 0.0f;
        }
        float[] fArr3 = sensorEvent.values;
        if (fArr3 != null && (LJJJIL = ORY.LJJJIL(2, fArr3)) != null) {
            f3 = LJJJIL.floatValue();
        }
        C72818Shy.LIZ(new C76052yf(0L, new C78529Urt(new JSONObject(C113554cx.LJJL(new OSZ("x", Float.valueOf(f)), new OSZ("y", Float.valueOf(f2)), new OSZ("z", Float.valueOf(f3))))), "onAccelerometerChange"));
    }
}
