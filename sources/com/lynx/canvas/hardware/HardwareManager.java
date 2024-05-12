package com.lynx.canvas.hardware;

import X.C03880Dg;
import X.C39254Fas;
import X.C39519Ff9;
import X.C65300Pk0;
import X.PPT;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* loaded from: classes7.dex */
public class HardwareManager {
    public static volatile HardwareManager LJI;
    public long LIZ;
    public SensorManager LIZIZ;
    public PPT LIZJ;
    public Sensor LIZLLL;
    public C39254Fas LJ;
    public Sensor LJFF;

    public static Sensor LIZIZ(SensorManager sensorManager, int i) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Integer.valueOf(i)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)Landroid/hardware/Sensor;", "5651861671582015755");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(100703, "android/hardware/SensorManager", "getDefaultSensor", sensorManager, objArr, "android.hardware.Sensor", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", null, objArr, sensorManager, c65300Pk0, false);
            return (Sensor) LIZJ.LIZIZ;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(i);
        c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", defaultSensor, objArr, sensorManager, c65300Pk0, true);
        return defaultSensor;
    }

    public static void LIZJ(SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor, int i) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100700, "android/hardware/SensorManager", "registerListener", sensorManager, new Object[]{sensorEventListener, sensor, Integer.valueOf(i)}, "boolean", new C65300Pk0(false, "(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z", "5651861671582015755"));
        if (LIZJ.LIZ) {
            ((Boolean) LIZJ.LIZIZ).booleanValue();
        } else {
            sensorManager.registerListener(sensorEventListener, sensor, i);
        }
    }

    public static void LIZLLL(SensorManager sensorManager, SensorEventListener sensorEventListener) {
        if (new C03880Dg(2).LIZJ(100701, "android/hardware/SensorManager", "unregisterListener", sensorManager, new Object[]{sensorEventListener}, "void", new C65300Pk0(false, "(Landroid/hardware/SensorEventListener;)V", "5651861671582015755")).LIZ) {
            return;
        }
        sensorManager.unregisterListener(sensorEventListener);
    }

    public static native void nativeNotifyGyroscopeData(long j, float f, float f2, float f3, long j2);

    public static native void nativeNotifyOrientationData(long j, float f, float f2, float f3, long j2);

    public static HardwareManager LIZ() {
        if (LJI == null) {
            synchronized (HardwareManager.class) {
                if (LJI == null) {
                    LJI = new HardwareManager();
                }
            }
        }
        return LJI;
    }

    public static void StopMonitorGyroscope() {
        HardwareManager LIZ = LIZ();
        PPT ppt = LIZ.LIZJ;
        if (ppt != null) {
            ppt.LIZ(LIZ.LIZIZ, LIZ.LJ);
        } else {
            LIZLLL(LIZ.LIZIZ, LIZ.LJ);
        }
    }

    public static void StartMonitorGyroscope(int i) {
        HardwareManager LIZ = LIZ();
        SensorManager sensorManager = LIZ.LIZIZ;
        if (sensorManager == null) {
            return;
        }
        if (LIZ.LIZLLL == null) {
            LIZ.LIZLLL = LIZIZ(sensorManager, 4);
        }
        if (LIZ.LJFF == null) {
            LIZ.LJFF = LIZIZ(LIZ.LIZIZ, 15);
        }
        if (LIZ.LJ == null) {
            LIZ.LJ = new C39254Fas(LIZ);
        }
        int i2 = i * 1000;
        PPT ppt = LIZ.LIZJ;
        if (ppt != null) {
            ppt.LIZ(LIZ.LIZIZ, LIZ.LJ);
            LIZ.LIZJ.LJ(LIZ.LIZIZ, LIZ.LJ, LIZ.LJFF, i2);
            LIZ.LIZJ.LJ(LIZ.LIZIZ, LIZ.LJ, LIZ.LIZLLL, i2);
        } else {
            LIZLLL(LIZ.LIZIZ, LIZ.LJ);
            LIZJ(LIZ.LIZIZ, LIZ.LJ, LIZ.LJFF, i2);
            LIZJ(LIZ.LIZIZ, LIZ.LJ, LIZ.LIZLLL, i2);
        }
    }

    public static void attachNativeInstancePtr(long j) {
        LIZ().LIZ = j;
    }
}
