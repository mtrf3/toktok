package X;

import com.ss.android.vesdk.VESensorInfoHolder;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YB1 implements YB0 {
    public static final YB1 LIZIZ = new YB1();
    public static final VESensorInfoHolder LIZJ = VESensorInfoHolder.getInstance();

    static {
        YB0.LIZ.getClass();
    }

    @Override // X.YB0
    public final void LIZ(float[] value) {
        o.LJIIIZ(value, "value");
        LIZJ.setFov(value);
    }

    @Override // X.YB0
    public final void LIZIZ(boolean z) {
        LIZJ.setSensorMode(z);
    }

    @Override // X.YB0
    public final void LIZJ(float[] fArr, double d) {
        LIZJ.setRotationSensorInfo(fArr, d);
    }
}
