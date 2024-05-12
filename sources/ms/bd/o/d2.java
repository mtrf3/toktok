package ms.bd.o;

import X.C03880Dg;
import X.C16880lQ;
import X.C39519Ff9;
import X.C65300Pk0;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes7.dex */
public class d2 implements SensorEventListener {
    public static volatile d2 LJLLI;
    public HandlerThread LJLILLLLZI;
    public final SensorManager LJLJJI;
    public Handler LJLIL = null;
    public boolean LJLJI = false;
    public float[] LJLJJL = new float[3];
    public float[] LJLJJLL = new float[3];
    public float[] LJLJL = new float[3];
    public final float[] LJLJLJ = new float[3];
    public float[] LJLJLLL = new float[3];
    public float[] LJLL = new float[3];

    public d2(Context context) {
        this.LJLJJI = null;
        Context LLLLL = C16880lQ.LLLLL(context);
        if (LLLLL != null) {
            this.LJLJJI = (SensorManager) C16880lQ.LLILL(LLLLL, (String) k.a(16777217, 0, 0L, "828a1f", new byte[]{58, 53, 69, 6, 1, 99}));
        }
    }

    public static d2 LIZ(Context context) {
        if (LJLLI == null) {
            synchronized (e2.class) {
                if (LJLLI == null) {
                    LJLLI = new d2(context);
                }
            }
        }
        return LJLLI;
    }

    public static Sensor LIZIZ(SensorManager sensorManager, int i) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Integer.valueOf(i)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)Landroid/hardware/Sensor;", "2981384262718514");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(100703, "android/hardware/SensorManager", "getDefaultSensor", sensorManager, objArr, "android.hardware.Sensor", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", null, objArr, sensorManager, c65300Pk0, false);
            return (Sensor) LIZJ.LIZIZ;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(i);
        c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", defaultSensor, objArr, sensorManager, c65300Pk0, true);
        return defaultSensor;
    }

    public static void LIZJ(SensorManager sensorManager, d2 d2Var, Sensor sensor, Handler handler) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100700, "android/hardware/SensorManager", "registerListener", sensorManager, new Object[]{d2Var, sensor, 3, handler}, "boolean", new C65300Pk0(false, "(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;ILandroid/os/Handler;)Z", "2981384262718514"));
        if (LIZJ.LIZ) {
            ((Boolean) LIZJ.LIZIZ).booleanValue();
        } else {
            sensorManager.registerListener(d2Var, sensor, 3, handler);
        }
    }

    public static void LIZLLL(SensorManager sensorManager, d2 d2Var) {
        if (new C03880Dg(2).LIZJ(100701, "android/hardware/SensorManager", "unregisterListener", sensorManager, new Object[]{d2Var}, "void", new C65300Pk0(false, "(Landroid/hardware/SensorEventListener;)V", "2981384262718514")).LIZ) {
            return;
        }
        sensorManager.unregisterListener(d2Var);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        System.currentTimeMillis();
        float[] fArr = new float[9];
        float[] fArr2 = new float[3];
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            this.LJLJLLL = sensorEvent.values;
            return;
        }
        if (type == 2) {
            this.LJLL = sensorEvent.values;
            return;
        }
        if (type == 4) {
            this.LJLJL = sensorEvent.values;
            return;
        }
        switch (type) {
            case 9:
                this.LJLJJLL = sensorEvent.values;
                return;
            case 10:
                this.LJLJJL = sensorEvent.values;
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                SensorManager.getRotationMatrixFromVector(fArr, sensorEvent.values);
                SensorManager.getOrientation(fArr, fArr2);
                this.LJLJLJ[0] = (float) Math.toDegrees(fArr2[0]);
                this.LJLJLJ[1] = (float) Math.toDegrees(fArr2[1]);
                this.LJLJLJ[2] = (float) Math.toDegrees(fArr2[2]);
                return;
            default:
                return;
        }
    }
}
