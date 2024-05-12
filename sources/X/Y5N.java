package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;

/* loaded from: classes16.dex */
public final class Y5N implements SensorEventListener {
    public final SensorManager LJLIL;
    public final Sensor LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public long LJLJJLL;
    public int LJLJL;
    public Y6K LJLJLJ;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public Y5N(Context context) {
        Sensor defaultSensor;
        SensorManager sensorManager = (SensorManager) C16880lQ.LLILL(context, "sensor");
        this.LJLIL = sensorManager;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {1};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)Landroid/hardware/Sensor;", "1967622647663670777");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(100703, "android/hardware/SensorManager", "getDefaultSensor", sensorManager, objArr, "android.hardware.Sensor", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", null, objArr, sensorManager, c65300Pk0, false);
            defaultSensor = (Sensor) LIZJ.LIZIZ;
        } else {
            defaultSensor = sensorManager.getDefaultSensor(1);
            c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", defaultSensor, objArr, sensorManager, c65300Pk0, true);
        }
        this.LJLILLLLZI = defaultSensor;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.LJLJJLL >= 1000 && sensorEvent.sensor.getType() == 1) {
            float[] fArr = sensorEvent.values;
            int i = (int) fArr[0];
            int i2 = (int) fArr[1];
            int i3 = (int) fArr[2];
            if (this.LJLJL != 0) {
                int abs = Math.abs(this.LJLJI - i);
                int abs2 = Math.abs(this.LJLJJI - i2);
                int abs3 = Math.abs(this.LJLJJL - i3);
                if (Math.sqrt((abs3 * abs3) + (abs2 * abs2) + (abs * abs)) >= 1.4d) {
                    this.LJLJL = 2;
                } else {
                    if (this.LJLJL == 2) {
                        this.LJLJJLL = elapsedRealtime;
                        Y6K y6k = this.LJLJLJ;
                        if (y6k != null && y6k.LIZ.LIZIZ()) {
                            y6k.LIZ.LIZ.LLILLIZIL();
                        }
                    }
                    this.LJLJL = 1;
                }
            } else {
                this.LJLJJLL = elapsedRealtime;
                this.LJLJL = 1;
            }
            this.LJLJI = i;
            this.LJLJJI = i2;
            this.LJLJJL = i3;
        }
    }
}
