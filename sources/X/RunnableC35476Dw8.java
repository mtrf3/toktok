package X;

import android.os.Build;
import java.util.Iterator;
import java.util.List;
import ujb.o;

/* renamed from: X.Dw8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC35476Dw8 implements Runnable {
    public static final RunnableC35476Dw8 LJLIL = new RunnableC35476Dw8();

    public static void LIZ() {
        C34582Dhi.LIZJ("ss");
        C34582Dhi.LIZIZ("ss");
        C34582Dhi.LIZ("ss");
        C35478DwA c35478DwA = C35478DwA.LIZ;
        if (C35478DwA.LIZ() != 0) {
            C35478DwA.LIZJ = true;
        } else {
            synchronized (c35478DwA) {
                if (C35478DwA.LIZ() == 0) {
                    System.currentTimeMillis();
                    String str = Build.MODEL;
                    Iterator it = ((List) C35478DwA.LJ.getValue()).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (o.LJJJJIZL((String) it.next(), str, true)) {
                                C35478DwA.LIZIZ.storeInt("local_low_device_init", 2);
                                C35478DwA.LIZJ(2);
                                C35478DwA.LIZJ = true;
                                break;
                            }
                        } else {
                            C35478DwA.LIZIZ.storeInt("local_low_device_init", 1);
                            Iterator it2 = ((List) C35478DwA.LJFF.getValue()).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (o.LJJJJIZL((String) it2.next(), str, true)) {
                                        C35478DwA.LIZIZ.storeInt("local_low_device_init", 3);
                                        C35478DwA.LIZJ(3);
                                        C35478DwA.LIZJ = true;
                                        break;
                                    }
                                } else {
                                    C35478DwA.LIZJ(4);
                                    C35478DwA.LIZJ = true;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (((Boolean) C33791DNz.LIZ.getValue()).booleanValue()) {
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
