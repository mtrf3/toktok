package X;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.ss.android.ugc.aweme.commerce.InteractiveBrandedEffectInfo;
import kotlin.jvm.internal.AqS160S0100000_10;

/* loaded from: classes11.dex */
public final class NDP extends NDW implements NDS {
    public boolean LJI;
    public final C62822Ol8 LJII;
    public final C62822Ol8 LJIIIIZZ;

    public static Sensor LJI(SensorManager sensorManager) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {1};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)Landroid/hardware/Sensor;", "1701332115858451521");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(100703, "android/hardware/SensorManager", "getDefaultSensor", sensorManager, objArr, "android.hardware.Sensor", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", null, objArr, sensorManager, c65300Pk0, false);
            return (Sensor) LIZJ.LIZIZ;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", defaultSensor, objArr, sensorManager, c65300Pk0, true);
        return defaultSensor;
    }

    @Override // X.NDW
    public final void LJ() {
        this.LJI = true;
    }

    @Override // X.NDW
    public final void LJFF() {
        this.LJI = false;
    }

    @Override // X.NDW
    public final void LIZLLL() {
        InteractiveBrandedEffectInfo interactiveBrandedEffectInfo = this.LIZIZ;
        if (interactiveBrandedEffectInfo != null && interactiveBrandedEffectInfo.getEnableShake()) {
            try {
                SensorManager sensorManager = (SensorManager) this.LJIIIIZZ.getValue();
                if (sensorManager != null) {
                    C39187FZn c39187FZn = C39188FZo.LIZ;
                    NDT ndt = (NDT) this.LJII.getValue();
                    C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476415492, "bpea-commerce_ibe_unregister_sensor");
                    c39187FZn.getClass();
                    C39187FZn.LIZLLL(sensorManager, ndt, LJJIIJ);
                }
            } catch (Q0C unused) {
            }
        }
    }

    public final void LJII() {
        Sensor sensor;
        InteractiveBrandedEffectInfo interactiveBrandedEffectInfo = this.LIZIZ;
        if (interactiveBrandedEffectInfo != null && interactiveBrandedEffectInfo.getEnableShake()) {
            try {
                SensorManager sensorManager = (SensorManager) this.LJIIIIZZ.getValue();
                if (sensorManager != null) {
                    C39187FZn c39187FZn = C39188FZo.LIZ;
                    NDT ndt = (NDT) this.LJII.getValue();
                    SensorManager sensorManager2 = (SensorManager) this.LJIIIIZZ.getValue();
                    if (sensorManager2 != null) {
                        sensor = LJI(sensorManager2);
                    } else {
                        sensor = null;
                    }
                    C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476415492, "bpea-commerce_ibe_register_sensor");
                    c39187FZn.getClass();
                    C39187FZn.LIZJ(sensorManager, ndt, sensor, 2, LJJIIJ);
                }
            } catch (Q0C unused) {
            }
        }
    }

    @Override // X.NDS
    public final boolean LIZIZ() {
        return this.LJI;
    }

    public NDP(String str, InteractiveBrandedEffectInfo interactiveBrandedEffectInfo) {
        super(str, interactiveBrandedEffectInfo, 0, 56);
        this.LJII = C221108m2.LIZIZ(new AqS160S0100000_10(this, 12));
        this.LJIIIIZZ = C221108m2.LIZIZ(C58970NCk.INSTANCE);
    }
}
