package X;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.HandlerThread;

/* renamed from: X.FaB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class HandlerThreadC39211FaB extends HandlerThread {
    public final /* synthetic */ C39212FaC LJLIL;

    public static Sensor LIZ(SensorManager sensorManager, int i) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Integer.valueOf(i)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)Landroid/hardware/Sensor;", "-8151731097843438750");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(100703, "android/hardware/SensorManager", "getDefaultSensor", sensorManager, objArr, "android.hardware.Sensor", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", null, objArr, sensorManager, c65300Pk0, false);
            return (Sensor) LIZJ.LIZIZ;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(i);
        c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", defaultSensor, objArr, sensorManager, c65300Pk0, true);
        return defaultSensor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b7, code lost:
    
        if (r12 == null) goto L10;
     */
    @Override // android.os.HandlerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLooperPrepared() {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HandlerThreadC39211FaB.onLooperPrepared():void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerThreadC39211FaB(C39212FaC c39212FaC) {
        super("sensor");
        this.LJLIL = c39212FaC;
    }
}
