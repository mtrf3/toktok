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
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes7.dex */
public final class e2 implements SensorEventListener {
    public static volatile e2 LJLJJLL;
    public final SensorManager LJLIL;
    public int LJLILLLLZI;
    public int LJLJI = 0;
    public float[] LJLJJI = new float[3];
    public List<JSONArray> LJLJJL = new ArrayList();

    static {
        new DecimalFormat((String) k.a(16777217, 0, 0L, "7bca19", new byte[]{118, 46, 64}));
        LJLJJLL = null;
    }

    public e2(Context context) {
        this.LJLIL = null;
        Context LLLLL = C16880lQ.LLLLL(context);
        if (LLLLL != null) {
            this.LJLIL = (SensorManager) C16880lQ.LLILL(LLLLL, (String) k.a(16777217, 0, 0L, "b097ea", new byte[]{96, 55, 68, 80, 85, 100}));
        }
    }

    public static e2 LIZ(Context context) {
        if (LJLJJLL == null) {
            synchronized (e2.class) {
                if (LJLJJLL == null) {
                    LJLJJLL = new e2(context);
                }
            }
        }
        return LJLJJLL;
    }

    public static Sensor LIZJ(SensorManager sensorManager) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {1};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)Landroid/hardware/Sensor;", "2981384262718545");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(100703, "android/hardware/SensorManager", "getDefaultSensor", sensorManager, objArr, "android.hardware.Sensor", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", null, objArr, sensorManager, c65300Pk0, false);
            return (Sensor) LIZJ.LIZIZ;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", defaultSensor, objArr, sensorManager, c65300Pk0, true);
        return defaultSensor;
    }

    public static boolean LIZLLL(SensorManager sensorManager, e2 e2Var, Sensor sensor) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100700, "android/hardware/SensorManager", "registerListener", sensorManager, new Object[]{e2Var, sensor, 3}, "boolean", new C65300Pk0(false, "(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z", "2981384262718545"));
        return LIZJ.LIZ ? ((Boolean) LIZJ.LIZIZ).booleanValue() : sensorManager.registerListener(e2Var, sensor, 3);
    }

    public static void LJ(SensorManager sensorManager, SensorEventListener sensorEventListener) {
        if (new C03880Dg(2).LIZJ(100701, "android/hardware/SensorManager", "unregisterListener", sensorManager, new Object[]{sensorEventListener}, "void", new C65300Pk0(false, "(Landroid/hardware/SensorEventListener;)V", "2981384262718545")).LIZ) {
            return;
        }
        sensorManager.unregisterListener(sensorEventListener);
    }

    public final synchronized void LIZIZ() {
        try {
            SensorManager sensorManager = this.LJLIL;
            if (sensorManager != null) {
                int i = this.LJLILLLLZI - 1;
                this.LJLILLLLZI = i;
                if (i == 0) {
                    LJ(sensorManager, this);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            this.LJLJJI = sensorEvent.values;
            this.LJLJI = 1;
        }
    }
}
