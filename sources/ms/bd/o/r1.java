package ms.bd.o;

import android.hardware.SensorManager;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class r1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        d2 LIZ = d2.LIZ(a.LIZIZ.LIZ);
        synchronized (LIZ) {
            if (LIZ.LJLJI) {
                synchronized (LIZ) {
                    try {
                        SensorManager sensorManager = LIZ.LJLJJI;
                        if (sensorManager != null) {
                            d2.LIZLLL(sensorManager, LIZ);
                        }
                    } catch (Exception unused) {
                    }
                    LIZ.LJLILLLLZI.quit();
                    LIZ.LJLJI = false;
                }
            }
        }
        return null;
    }
}
