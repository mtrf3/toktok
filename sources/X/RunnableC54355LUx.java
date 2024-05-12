package X;

import Y.ARunnableS45S0100000_9;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.LUx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class RunnableC54355LUx implements Runnable {
    public static void LIZ() {
        int i;
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((CopyOnWriteArrayList) PEI.LJFF).iterator();
            while (it.hasNext()) {
                C54356LUy c54356LUy = (C54356LUy) it.next();
                boolean z = c54356LUy.LJ;
                long[] jArr = C54356LUy.LJI;
                if (!z && c54356LUy.LIZJ.get() == null) {
                    c54356LUy.LJ = true;
                    int i2 = 0;
                    do {
                        i = i2 + 1;
                        jArr[i2] = jArr[i];
                        i2 = i;
                    } while (i <= 1);
                    jArr[i2] = SystemClock.uptimeMillis();
                }
                if (c54356LUy.LIZ.get() == null) {
                    ((CopyOnWriteArrayList) PEI.LJFF).remove(c54356LUy);
                } else if (c54356LUy.LIZ.get() != null && c54356LUy.LIZJ.get() == null && jArr[0] - c54356LUy.LIZLLL >= PEI.LJIILIIL && !c54356LUy.LJFF) {
                    arrayList.add(c54356LUy);
                    ((CopyOnWriteArrayList) PEI.LJFF).remove(c54356LUy);
                }
            }
            PEI.LIZ.post(new ARunnableS45S0100000_9(arrayList, 223));
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
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
