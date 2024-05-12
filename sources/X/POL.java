package X;

import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class POL {
    public final POH LIZ = new POH();

    public final String LIZ(String spanId) {
        PIO pio;
        String LIZJ;
        o.LJIIIZ(spanId, "spanId");
        POK LIZJ2 = C64375POh.LIZJ(spanId);
        if (LIZJ2 == null) {
            return "";
        }
        this.LIZ.getClass();
        Object obj = LIZJ2.LJI;
        if (!(obj instanceof PIT) || (pio = (PIO) obj) == null || (LIZJ = pio.LIZJ()) == null) {
            return "";
        }
        return LIZJ;
    }

    public final void LIZIZ(long j, String spanId) {
        PIR pir;
        o.LJIIIZ(spanId, "spanId");
        POK LIZJ = C64375POh.LIZJ(spanId);
        if (LIZJ != null) {
            this.LIZ.getClass();
            POM pom = LIZJ.LJ;
            if (pom == null) {
                return;
            }
            POP pop = pom.LIZ;
            Object obj = LIZJ.LJI;
            PIQ piq = null;
            if (!(obj instanceof PIR) || (pir = (PIR) obj) == null) {
                return;
            }
            if (pop == POP.PAGE) {
                boolean z = pom.LIZJ;
                POQ poq = new POQ(z, pom.LIZIZ);
                int i = 1;
                if (z) {
                    if (pom.LIZLLL > 1) {
                        i = 3;
                    }
                } else if (pom.LIZLLL <= 1) {
                    i = 2;
                } else {
                    i = 4;
                }
                poq.LIZ = i;
                piq = poq;
            } else {
                String str = "";
                if (pop == POP.EVENT) {
                    String str2 = pom.LJ;
                    if (str2 != null) {
                        str = str2;
                    }
                    piq = new PIV(str);
                } else if (pop == POP.CUSTOM_EVENT) {
                    String str3 = pom.LJ;
                    if (str3 != null) {
                        str = str3;
                    }
                    piq = new PJ1(str);
                } else if (pop == POP.NET_API) {
                    String path = UriProtector.parse(pom.LJFF).getPath();
                    if (path != null) {
                        str = path;
                    }
                    piq = new C64370POc(pom.LJIIIIZZ, str, pom.LJI, pom.LJII);
                }
            }
            pir.LJI(new PIP(pir, pop.getType(), LIZJ.LIZLLL.getCategory(), piq, LIZJ.LJFF));
            pir.LIZ(pir.getStartTime(), j);
        }
    }

    public final void LIZLLL(String spanId, POY logCategory) {
        o.LJIIIZ(spanId, "spanId");
        o.LJIIIZ(logCategory, "logCategory");
        POK LIZJ = C64375POh.LIZJ(spanId);
        if (LIZJ != null) {
            this.LIZ.getClass();
            LIZJ.LIZLLL = logCategory;
        }
    }

    public final void LJ(String spanId, POM pom) {
        o.LJIIIZ(spanId, "spanId");
        POK LIZJ = C64375POh.LIZJ(spanId);
        if (LIZJ != null) {
            this.LIZ.getClass();
            LIZJ.LJ = pom;
        }
    }

    public final void LIZJ(long j, String traceId, boolean z) {
        PIU piu;
        o.LJIIIZ(traceId, "traceId");
        if (o.LJ(C64375POh.LIZIZ().checkAndReportLog, Boolean.TRUE)) {
            C64375POh.LJI(C64372POe.LJLIL);
        }
        POJ remove = C64375POh.LIZIZ.remove(traceId);
        if (remove != null) {
            this.LIZ.getClass();
            Object obj = remove.LIZLLL;
            if (obj instanceof PIU) {
                piu = (PIU) obj;
            } else {
                piu = null;
            }
            if (z) {
                if (piu != null) {
                    piu.cancel();
                }
            } else if (piu != null) {
                piu.LIZ(j);
            }
            Iterator<Map.Entry<String, POK>> it = C64375POh.LIZJ.entrySet().iterator();
            while (it.hasNext()) {
                if (o.LJ(it.next().getValue().LIZIZ.LIZ, traceId)) {
                    it.remove();
                }
            }
        }
    }
}
