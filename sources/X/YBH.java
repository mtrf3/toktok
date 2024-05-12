package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import com.bytedance.bpea.basics.Cert;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes16.dex */
public final class YBH {
    public final SensorManager LIZ;
    public final Sensor LIZIZ;
    public float LIZLLL;
    public final float[] LIZJ = new float[3];
    public final CopyOnWriteArrayList<YBJ> LJ = new CopyOnWriteArrayList<>();
    public final YBI LJFF = new YBI(this);

    public final void LIZ() {
        C63922P6w.LIZ("Gyro", "clearAngle");
        float[] fArr = this.LIZJ;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
    }

    public YBH(Context context) {
        Sensor defaultSensor;
        C63922P6w.LIZ("Gyro", "Gyro");
        if (context != null) {
            SensorManager sensorManager = (SensorManager) C16880lQ.LLILL(context, "sensor");
            this.LIZ = sensorManager;
            C03880Dg c03880Dg = new C03880Dg(2);
            Object[] objArr = {4};
            C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)Landroid/hardware/Sensor;", "-2809779985696503825");
            C39519Ff9 LIZJ = c03880Dg.LIZJ(100703, "android/hardware/SensorManager", "getDefaultSensor", sensorManager, objArr, "android.hardware.Sensor", c65300Pk0);
            if (LIZJ.LIZ) {
                c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", null, objArr, sensorManager, c65300Pk0, false);
                defaultSensor = (Sensor) LIZJ.LIZIZ;
            } else {
                defaultSensor = sensorManager.getDefaultSensor(4);
                c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", defaultSensor, objArr, sensorManager, c65300Pk0, true);
            }
            this.LIZIZ = defaultSensor;
            return;
        }
        this.LIZ = null;
        this.LIZIZ = null;
        C63922P6w.LIZIZ("Gyro", "Gyro init failed, no context");
    }

    public final void LIZJ(YQR yqr, Cert cert) {
        if (this.LIZ == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("unregister sensor, Cert: ");
        LIZ.append(cert);
        C63922P6w.LIZLLL("Gyro", X1D.LIZIZ(LIZ));
        this.LJ.remove(yqr);
        if (this.LJ.isEmpty()) {
            try {
                C39188FZo.LIZ(this.LIZ, this.LJFF, this.LIZIZ, cert);
            } catch (Exception e) {
                C63922P6w.LJFF("Gyro", "sensorManager unregister listener exception occurred.", e);
            }
            C63922P6w.LIZ("Gyro", "sensorManager unregister listener");
        }
        LIZ();
    }

    public final void LIZIZ(YQR yqr, Handler handler, Cert cert) {
        if (this.LIZ == null || this.LJ.contains(yqr)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("register sensor, Cert: ");
        LIZ.append(cert);
        C63922P6w.LIZLLL("Gyro", X1D.LIZIZ(LIZ));
        this.LJ.add(yqr);
        if (this.LJ.size() == 1) {
            try {
                SensorManager sensorManager = this.LIZ;
                YBI ybi = this.LJFF;
                Sensor sensor = this.LIZIZ;
                C39188FZo.LIZ.getClass();
                C39187FZn.LIZIZ(sensorManager, ybi, sensor, 3, handler, cert);
            } catch (Exception e) {
                C63922P6w.LJFF("Gyro", "sensorManager register listener exception occurred.", e);
                this.LJ.remove(yqr);
            }
            C63922P6w.LIZ("Gyro", "sensorManager register listener");
        }
        LIZ();
    }
}
