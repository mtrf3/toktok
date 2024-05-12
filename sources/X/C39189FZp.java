package X;

import Y.ARunnableS10S0101000_6;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import kotlin.jvm.internal.o;

/* renamed from: X.FZp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39189FZp implements SensorEventListener {
    public static SensorManager LJLIL;
    public static Handler LJLILLLLZI;
    public static ARunnableS10S0101000_6 LJLJI;
    public static final C39189FZp LJLJLJ = new C39189FZp();
    public static java.util.Map<String, ? extends Object> LJLJJI = C113554cx.LJJJLIIL();
    public static final float[] LJLJJL = new float[4];
    public static final float[] LJLJJLL = new float[9];
    public static final float[] LJLJL = new float[3];

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        o.LJIIJ(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent event) {
        o.LJIIJ(event, "event");
        Sensor sensor = event.sensor;
        o.LJFF(sensor, "event.sensor");
        if (sensor.getType() == 15) {
            float[] fArr = event.values;
            float[] fArr2 = LJLJJL;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float[] fArr3 = LJLJJLL;
            SensorManager.getRotationMatrixFromVector(fArr3, fArr2);
            float[] fArr4 = LJLJL;
            SensorManager.getOrientation(fArr3, fArr4);
            LJLJJI = C113554cx.LJJL(new OSZ("yaw", Float.valueOf(-fArr4[0])), new OSZ("pitch", Float.valueOf(-fArr4[1])), new OSZ("roll", Float.valueOf(fArr4[2])));
        }
    }

    public final void LIZ(Integer num, String str) {
        Handler handler;
        C78862UxG LJJIIJ;
        try {
            SensorManager sensorManager = LJLIL;
            if (sensorManager != null) {
                C39187FZn c39187FZn = C39188FZo.LIZ;
                if (num != null) {
                    LJJIIJ = C78857UxB.LJJIIJ(num.intValue(), "bpea-x_bridge_sensor");
                    if (str != null) {
                        LJJIIJ.attachCustomInfo("jsb_referer_url", str);
                    }
                } else {
                    LJJIIJ = C78857UxB.LJJIIJ(1476415497, "bpea-x_bridge_sensor");
                }
                c39187FZn.getClass();
                C39187FZn.LIZLLL(sensorManager, this, LJJIIJ);
            }
        } catch (Q0C unused) {
        }
        ARunnableS10S0101000_6 aRunnableS10S0101000_6 = LJLJI;
        if (aRunnableS10S0101000_6 != null && (handler = LJLILLLLZI) != null) {
            handler.removeCallbacks(aRunnableS10S0101000_6);
        }
        LJLIL = null;
        LJLILLLLZI = null;
        LJLJI = null;
        LJLJJI = C113554cx.LJJJLIIL();
    }
}
