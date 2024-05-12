package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.FMf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38841FMf extends AbstractC06100Lu {
    public final /* synthetic */ C38840FMe LJLILLLLZI;

    @Override // X.AbstractC06100Lu
    public final boolean LJIIJJI() {
        return true;
    }

    public C38841FMf(C38840FMe c38840FMe) {
        this.LJLILLLLZI = c38840FMe;
    }

    @Override // X.AbstractC06100Lu
    public final void LJIIIZ(long j, long j2, long j3, long j4, boolean z) {
        boolean z2;
        long j5;
        boolean z3;
        long j6;
        long j7;
        this.LJLIL = false;
        C38840FMe c38840FMe = this.LJLILLLLZI;
        long[] jArr = c38840FMe.LIZ;
        if (jArr == null || jArr.length < 2) {
            return;
        }
        long j8 = jArr[1] / 1000000;
        if (!z || j3 - j8 < 48) {
            return;
        }
        c38840FMe.getClass();
        if (z) {
            if (j3 - j8 < 48) {
                if (C38844FMi.LIZIZ == null) {
                    synchronized (C38840FMe.class) {
                        if (C38844FMi.LIZIZ == null) {
                            C38844FMi.LIZIZ = new C38844FMi();
                        }
                    }
                }
                C38844FMi.LIZIZ.LIZ.clear();
            } else {
                HashMap hashMap = new HashMap();
                long[] jArr2 = c38840FMe.LIZ;
                if (jArr2 != null && jArr2.length >= 9) {
                    long j9 = jArr2[1] / 1000000;
                    long j10 = jArr2[5] / 1000000;
                    long j11 = j10 - j9;
                    if (j11 <= 60000) {
                        long nanoTime = System.nanoTime() / 1000000;
                        long j12 = nanoTime - j9;
                        long[] jArr3 = c38840FMe.LIZ;
                        long j13 = jArr3[6] / 1000000;
                        long j14 = jArr3[7] / 1000000;
                        long j15 = jArr3[8] / 1000000;
                        long j16 = j13 - j10;
                        long j17 = j14 - j13;
                        if (j15 >= j14) {
                            z2 = true;
                            j5 = j15 - j14;
                        } else {
                            z2 = false;
                            j5 = 0;
                        }
                        long j18 = c38840FMe.LJI;
                        if (j18 > 0 && j18 > j14) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2 && z3) {
                            j6 = j18 - j15;
                        } else {
                            j6 = 0;
                        }
                        long j19 = nanoTime - j18;
                        if (!z3) {
                            if (z2) {
                                j7 = nanoTime - j15;
                            } else {
                                j7 = nanoTime - j14;
                            }
                            j19 = j7;
                        }
                        hashMap.put("frame_wait", Long.valueOf(C38840FMe.LIZIZ(j11)));
                        hashMap.put("frame_input", Long.valueOf(C38840FMe.LIZIZ(j16)));
                        hashMap.put("frame_animation", Long.valueOf(C38840FMe.LIZIZ(j17)));
                        hashMap.put("frame_layout_measure", Long.valueOf(C38840FMe.LIZIZ(j5)));
                        hashMap.put("frame_draw", Long.valueOf(C38840FMe.LIZIZ(j6)));
                        hashMap.put("frame_commit", Long.valueOf(C38840FMe.LIZIZ(j19)));
                        hashMap.put("frame_total", Long.valueOf(C38840FMe.LIZIZ(j12)));
                    }
                }
                Iterator it = ((ConcurrentHashMap) c38840FMe.LIZJ).keySet().iterator();
                while (it.hasNext()) {
                    ((ConcurrentHashMap) c38840FMe.LIZJ).get(it.next());
                }
                ((ConcurrentHashMap) c38840FMe.LIZJ).clear();
                C38844FMi.LIZ().LIZ.clear();
                for (InterfaceC120964ou interfaceC120964ou : c38840FMe.LJIIIIZZ) {
                    if (interfaceC120964ou != null) {
                        interfaceC120964ou.LIZ(hashMap);
                    }
                }
            }
        }
        this.LJLILLLLZI.LJI = 0L;
    }
}
