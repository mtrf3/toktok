package X;

import android.graphics.Bitmap;
import java.util.Map;

/* renamed from: X.FgZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class RunnableC39607FgZ implements Runnable {
    public final void LIZ() {
        System.gc();
        synchronized (this) {
            for (Map.Entry<Bitmap, C39614Fgg> entry : C39606FgY.LIZ.LIZ.entrySet()) {
                entry.getValue().getClass();
                C39614Fgg.LIZIZ();
                InterfaceC39600FgS interfaceC39600FgS = C39599FgR.LIZIZ;
                if (interfaceC39600FgS != null) {
                    entry.getValue().getClass();
                    interfaceC39600FgS.LIZIZ(C39614Fgg.LIZ());
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
