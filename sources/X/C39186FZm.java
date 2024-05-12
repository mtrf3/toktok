package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* renamed from: X.FZm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39186FZm extends AbstractC65781Prl implements InterfaceC88472Yns<C66300Q0i, Boolean> {
    public final /* synthetic */ SensorManager LJLIL;
    public final /* synthetic */ SensorEventListener LJLILLLLZI;
    public final /* synthetic */ Sensor LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39186FZm(SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor, int i) {
        super(1);
        this.LJLIL = sensorManager;
        this.LJLILLLLZI = sensorEventListener;
        this.LJLJI = sensor;
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C66300Q0i c66300Q0i) {
        boolean registerListener;
        SensorManager sensorManager = this.LJLIL;
        SensorEventListener sensorEventListener = this.LJLILLLLZI;
        Sensor sensor = this.LJLJI;
        int i = this.LJLJJI;
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100700, "android/hardware/SensorManager", "registerListener", sensorManager, new Object[]{sensorEventListener, sensor, Integer.valueOf(i)}, "boolean", new C65300Pk0(false, "(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z", "5482409979476565960"));
        if (LIZJ.LIZ) {
            registerListener = ((Boolean) LIZJ.LIZIZ).booleanValue();
        } else {
            registerListener = sensorManager.registerListener(sensorEventListener, sensor, i);
        }
        return Boolean.valueOf(registerListener);
    }
}
