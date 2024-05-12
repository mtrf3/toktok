package com.bytedance.monitor.collector;

import X.P5V;
import X.PEL;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class IOMonitor extends PEL {
    public static final List<P5V> LJ = new ArrayList(100);
    public static final Object LJFF = new Object();
    public static volatile int LJI = 0;

    public IOMonitor() {
        throw null;
    }

    @Override // X.PEL
    public final void LIZLLL(int i) {
    }

    @Override // X.PEL
    public final Pair<String, ?> LIZ() {
        try {
            return new Pair<>(this.LIZ, LJ.toString());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String LJ(long j, long j2) {
        P5V p5v;
        ArrayList arrayList = new ArrayList();
        synchronized (LJFF) {
            int i = 0;
            if (((ArrayList) LJ).size() < 100) {
                while (true) {
                    List<P5V> list = LJ;
                    if (i >= ((ArrayList) list).size()) {
                        break;
                    }
                    arrayList.add(((ArrayList) list).get(i));
                    i++;
                }
            } else {
                while (i < 100) {
                    arrayList.add(((ArrayList) LJ).get(((LJI + i) + 1) % 100));
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
            p5v = (P5V) ListProtector.get(arrayList, size);
            if (p5v.LIZ < j2 || p5v.LIZIZ > j) {
                arrayList2.add(p5v);
            }
        } while (p5v.LIZIZ >= j);
        return arrayList2.toString();
    }

    @Override // X.PEL
    public final Pair<String, ?> LIZIZ(long j, long j2) {
        try {
            return new Pair<>(this.LIZ, LJ(j, j2));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void saveIOInfo(long j, long j2, long j3, long j4, String str, String str2) {
        synchronized (LJFF) {
            if (LJI >= 100) {
                LJI -= 100;
            }
            List<P5V> list = LJ;
            if (((ArrayList) list).size() >= 100) {
                P5V p5v = (P5V) ((ArrayList) list).get(LJI);
                p5v.LIZ = j;
                p5v.LIZIZ = j2;
                p5v.LIZJ = j4;
                p5v.LIZLLL = str;
                p5v.LJ = str2;
            } else {
                P5V p5v2 = new P5V();
                p5v2.LIZ = j;
                p5v2.LIZIZ = j2;
                p5v2.LIZJ = j4;
                p5v2.LIZLLL = str;
                p5v2.LJ = str2;
                ((ArrayList) list).add(p5v2);
            }
            LJI++;
        }
    }
}
