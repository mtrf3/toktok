package X;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.PdU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64896PdU implements InterfaceC65108Pgu, InterfaceC64900PdY {
    public static final C64896PdU LIZ = new C64896PdU();

    @Override // X.InterfaceC65105Pgr
    public final String LJ() {
        return C64904Pdc.LIZIZ(this);
    }

    @Override // X.InterfaceC64900PdY
    public final void LIZ(C64901PdZ<?> c64901PdZ, C37826Esw c37826Esw) {
        Long l;
        String str = c64901PdZ.LIZ.LJIIIIZZ;
        o.LJIIIIZZ(str, "response.url.originUrl");
        int LJJLIIIJJIZ = s.LJJLIIIJJIZ(str, '?', 0, false, 6);
        if (LJJLIIIJJIZ > 0) {
            String substring = str.substring(0, LJJLIIIJJIZ);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            InterfaceC64898PdW interfaceC64898PdW = C64895PdT.LIZJ;
            if (interfaceC64898PdW != null && (l = C64895PdT.LJFF.get()) != null) {
                l.longValue();
                Long l2 = C64895PdT.LJI.get();
                if (l2 != null) {
                    l2.longValue();
                    SystemClock.currentThreadTimeMillis();
                    System.currentTimeMillis();
                    interfaceC64898PdW.LIZJ(substring);
                }
            }
        }
    }

    @Override // X.InterfaceC65108Pgu
    public final void LJIIIZ(C64907Pdf c64907Pdf, C37826Esw c37826Esw) {
        boolean z;
        String str = c64907Pdf.LIZIZ.LJIIIIZZ;
        o.LJIIIIZZ(str, "mutableUrl.originUrl");
        if (C64895PdT.LIZJ != null) {
            C64895PdT.LJFF.set(Long.valueOf(SystemClock.currentThreadTimeMillis()));
            C64895PdT.LJI.set(Long.valueOf(System.currentTimeMillis()));
        }
        InterfaceC64897PdV interfaceC64897PdV = C64895PdT.LIZIZ;
        if (interfaceC64897PdV != null) {
            String replace = C64895PdT.LJII.replace(str, "");
            int LJJLIIIJJIZ = s.LJJLIIIJJIZ(replace, '?', 0, false, 6);
            if (LJJLIIIJJIZ > 0) {
                replace = replace.substring(0, LJJLIIIJJIZ);
                o.LJIIIIZZ(replace, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            if (replace.length() > 0) {
                if ((interfaceC64897PdV.LIZIZ() & 1) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (interfaceC64897PdV.LIZJ() != 1 ? !(interfaceC64897PdV.LIZJ() != 2 || !interfaceC64897PdV.LIZ().contains(replace)) : !interfaceC64897PdV.LIZLLL().contains(replace))) {
                    InterfaceC64898PdW interfaceC64898PdW = C64895PdT.LIZJ;
                    if (interfaceC64898PdW != null) {
                        interfaceC64898PdW.LJ(str);
                    }
                    int i = 0;
                    while (true) {
                        InterfaceC64897PdV interfaceC64897PdV2 = C64895PdT.LIZIZ;
                        if (interfaceC64897PdV2 == null || interfaceC64897PdV2.LIZIZ() != 1 || i >= 5) {
                            break;
                        }
                        Thread.sleep(C64892PdQ.LIZIZ);
                        i++;
                    }
                }
                if ((interfaceC64897PdV.LIZIZ() & 2) == 2) {
                    long currentTimeMillis = System.currentTimeMillis() - C64895PdT.LIZLLL;
                    if (interfaceC64897PdV.LIZJ() != 1 ? !(interfaceC64897PdV.LIZJ() != 2 || !interfaceC64897PdV.LIZ().contains(replace)) : !interfaceC64897PdV.LIZLLL().contains(replace)) {
                        long j = C64892PdQ.LIZ;
                        if (currentTimeMillis < j) {
                            long j2 = j - currentTimeMillis;
                            if (C64892PdQ.LIZJ) {
                                long j3 = C64895PdT.LJ.get();
                                long j4 = C64892PdQ.LIZ;
                                Long.signum(j3);
                                j2 += j3 * j4;
                            }
                            InterfaceC64898PdW interfaceC64898PdW2 = C64895PdT.LIZJ;
                            if (interfaceC64898PdW2 != null) {
                                interfaceC64898PdW2.LJ(str);
                            }
                            AtomicInteger atomicInteger = C64895PdT.LJ;
                            atomicInteger.incrementAndGet();
                            Thread.sleep(j2);
                            atomicInteger.decrementAndGet();
                        }
                    }
                    C64895PdT.LIZLLL = System.currentTimeMillis();
                }
            }
        }
    }
}
