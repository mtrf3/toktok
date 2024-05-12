package X;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import kotlin.jvm.internal.o;

/* renamed from: X.WwC, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C83892WwC implements InterfaceC86960YAy, YB2 {
    public final InterfaceC83727WtX LIZ;
    public final InterfaceC83863Wvj LIZIZ;
    public final C83892WwC LIZJ;

    @Override // X.InterfaceC86960YAy
    public final C83892WwC LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.YB2
    public final void LIZLLL(float f) {
        this.LIZIZ.LJIJJLI(f);
    }

    public C83892WwC(InterfaceC83727WtX effectController, InterfaceC83863Wvj cameraController) {
        o.LJIIIZ(effectController, "effectController");
        o.LJIIIZ(cameraController, "cameraController");
        this.LIZ = effectController;
        this.LIZIZ = cameraController;
        this.LIZJ = this;
    }

    @Override // X.InterfaceC86960YAy
    public final void F7(double[] dArr, double d) {
        this.LIZ.F7(dArr, d);
    }

    @Override // X.YB3
    public final Sensor LIZJ(SensorManager sensorManager, int i) {
        if (sensorManager != null) {
            C03880Dg c03880Dg = new C03880Dg(2);
            Object[] objArr = {Integer.valueOf(i)};
            C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)Landroid/hardware/Sensor;", "-3518547540579616951");
            C39519Ff9 LIZJ = c03880Dg.LIZJ(100703, "android/hardware/SensorManager", "getDefaultSensor", sensorManager, objArr, "android.hardware.Sensor", c65300Pk0);
            if (LIZJ.LIZ) {
                c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", null, objArr, sensorManager, c65300Pk0, false);
                return (Sensor) LIZJ.LIZIZ;
            }
            Sensor defaultSensor = sensorManager.getDefaultSensor(i);
            c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", defaultSensor, objArr, sensorManager, c65300Pk0, true);
            return defaultSensor;
        }
        return null;
    }

    @Override // X.YB2
    public final void LJ(float[] fArr, double d) {
        this.LIZIZ.LJJIJIIJIL(fArr, d);
    }

    @Override // X.InterfaceC86960YAy
    public final void E7(double d, double d2, double d3, double d4) {
        this.LIZ.E7(d, d2, d3, d4);
    }

    @Override // X.InterfaceC86960YAy
    public final void H7(boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ.H7(z, z2, z3, z4);
    }

    @Override // X.InterfaceC86960YAy
    public final void K3(double d, double d2, double d3, double d4) {
        this.LIZ.K3(d, d2, d3, d4);
    }

    @Override // X.InterfaceC86960YAy
    public final void LLIIII(double d, double d2, double d3, double d4) {
        this.LIZ.LLIIII(d, d2, d3, d4);
    }
}
