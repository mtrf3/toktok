package ms.bd.o;

import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class q1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        d2 LIZ = d2.LIZ(a.LIZIZ.LIZ);
        synchronized (LIZ) {
            if (!LIZ.LJLJI) {
                HandlerThread handlerThread = new HandlerThread((String) k.a(16777217, 0, 0L, "9576a3", new byte[]{59, 50, 74, 81, 81, 54, 14, 28, 116, 99, 41, 51}));
                LIZ.LJLILLLLZI = handlerThread;
                handlerThread.start();
                LIZ.LJLIL = new Handler(LIZ.LJLILLLLZI.getLooper());
                System.currentTimeMillis();
                synchronized (LIZ) {
                    try {
                        SensorManager sensorManager = LIZ.LJLJJI;
                        if (sensorManager != null) {
                            d2.LIZJ(sensorManager, LIZ, d2.LIZIZ(sensorManager, 10), LIZ.LJLIL);
                            SensorManager sensorManager2 = LIZ.LJLJJI;
                            d2.LIZJ(sensorManager2, LIZ, d2.LIZIZ(sensorManager2, 9), LIZ.LJLIL);
                            SensorManager sensorManager3 = LIZ.LJLJJI;
                            d2.LIZJ(sensorManager3, LIZ, d2.LIZIZ(sensorManager3, 4), LIZ.LJLIL);
                            SensorManager sensorManager4 = LIZ.LJLJJI;
                            d2.LIZJ(sensorManager4, LIZ, d2.LIZIZ(sensorManager4, 11), LIZ.LJLIL);
                            SensorManager sensorManager5 = LIZ.LJLJJI;
                            d2.LIZJ(sensorManager5, LIZ, d2.LIZIZ(sensorManager5, 1), LIZ.LJLIL);
                            SensorManager sensorManager6 = LIZ.LJLJJI;
                            d2.LIZJ(sensorManager6, LIZ, d2.LIZIZ(sensorManager6, 2), LIZ.LJLIL);
                        }
                    } catch (Exception unused) {
                    }
                    LIZ.LJLJI = true;
                }
            }
        }
        return null;
    }
}
