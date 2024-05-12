package com.bytedance.monitor.collector;

import X.C16880lQ;
import X.P5U;
import X.PEL;
import android.util.Log;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class BinderMonitor extends PEL {
    public static final List<P5U> LJ = new ArrayList(200);
    public static final Object LJFF = new Object();
    public static volatile int LJI = 0;

    @Override // X.PEL
    public final void LIZLLL(int i) {
    }

    public static String getStacktrace() {
        return Log.getStackTraceString(new Exception());
    }

    @Override // X.PEL
    public final Pair<String, String> LIZ() {
        try {
            return new Pair<>(this.LIZ, LJ.toString());
        } catch (Throwable unused) {
            return null;
        }
    }

    public BinderMonitor(int i) {
        super(i, "binder_monitor");
    }

    @Override // X.PEL
    public final Pair<String, String> LIZIZ(long j, long j2) {
        P5U p5u;
        try {
            String str = this.LIZ;
            ArrayList arrayList = new ArrayList();
            synchronized (LJFF) {
                int i = 0;
                if (((ArrayList) LJ).size() < 200) {
                    while (true) {
                        List<P5U> list = LJ;
                        if (i >= ((ArrayList) list).size()) {
                            break;
                        }
                        arrayList.add(((ArrayList) list).get(i));
                        i++;
                    }
                } else {
                    while (i < 200) {
                        arrayList.add(((ArrayList) LJ).get(((LJI + i) + 1) % 200));
                        i++;
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            do {
                size--;
                if (size < 0) {
                    break;
                }
                p5u = (P5U) ListProtector.get(arrayList, size);
                if (p5u.LIZ < j2 || p5u.LIZIZ > j) {
                    arrayList2.add(p5u);
                }
            } while (p5u.LIZIZ >= j);
            return new Pair<>(str, arrayList2.toString());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void saveBinderInfo(long j, long j2, long j3) {
        StackTraceElement[] stackTrace = C16880lQ.LLLLIIIILLL().getStackTrace();
        synchronized (LJFF) {
            if (LJI >= 200) {
                LJI -= 200;
            }
            List<P5U> list = LJ;
            if (((ArrayList) list).size() >= 200) {
                P5U p5u = (P5U) ((ArrayList) list).get(LJI);
                p5u.LIZ = j;
                p5u.LIZIZ = j2;
                p5u.LIZJ = j3;
                p5u.LIZLLL = stackTrace;
            } else {
                P5U p5u2 = new P5U();
                p5u2.LIZ = j;
                p5u2.LIZIZ = j2;
                p5u2.LIZJ = j3;
                p5u2.LIZLLL = stackTrace;
                ((ArrayList) list).add(p5u2);
            }
            LJI++;
        }
    }
}
