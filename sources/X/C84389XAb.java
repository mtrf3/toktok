package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.XAb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84389XAb extends XBK {
    public final C84376X9o LJIIIIZZ;

    @Override // X.XBK
    public final void LJFF() {
        super.LJFF();
        C30941Ji c30941Ji = C84390XAc.LIZ;
        c30941Ji.LIZIZ();
        try {
            C84390XAc.LIZIZ.clear();
            C84390XAc.LIZJ.LIZLLL(false);
        } finally {
            c30941Ji.LIZLLL();
        }
    }

    @Override // X.XBK, X.InterfaceC84458XCs
    public final void LIZIZ(String str) {
        java.util.Set<String> LJI;
        String str2;
        XBL LJ;
        XBL LJ2 = LJ();
        if (LJ2 != null && (LJI = LJ2.LJI()) != null) {
            Iterator<String> it = LJI.iterator();
            while (true) {
                if (it.hasNext()) {
                    str2 = it.next();
                    String LIZJ = XAN.LIZJ(str2);
                    XBL.LJIJJ.getClass();
                    if (o.LJ(LIZJ, XBQ.LIZJ(str))) {
                        break;
                    }
                } else {
                    str2 = null;
                    break;
                }
            }
            String str3 = str2;
            if (str3 != null && (LJ = LJ()) != null) {
                LJ.LJIIIZ(str3);
            }
        }
    }

    public final XAO LJII(String name) {
        java.util.Set<String> LJI;
        String str;
        C84391XAd c84391XAd;
        String str2;
        o.LJIIJ(name, "name");
        XBL.LJIJJ.getClass();
        String LIZJ = XBQ.LIZJ(name);
        XBL LJ = LJ();
        XAO xao = null;
        if (LJ != null && (LJI = LJ.LJI()) != null) {
            Iterator<String> it = LJI.iterator();
            while (true) {
                if (it.hasNext()) {
                    str = it.next();
                    if (o.LJ(XAN.LIZJ(str), LIZJ)) {
                        break;
                    }
                } else {
                    str = null;
                    break;
                }
            }
            String str3 = str;
            if (str3 != null) {
                try {
                    XBL LJ2 = LJ();
                    if (LJ2 != null) {
                        c84391XAd = LJ2.LJFF(str3);
                        if (c84391XAd != null) {
                            try {
                                try {
                                    C10830bf c10830bf = c84391XAd.LIZ[0];
                                    if (c10830bf != null && (str2 = c10830bf.LIZIZ) != null) {
                                        xao = XAP.LIZ(str2);
                                    }
                                    c84391XAd.close();
                                    return xao;
                                } catch (Exception e) {
                                    e = e;
                                    C12310e3 c12310e3 = C12310e3.LIZIZ;
                                    String message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    c12310e3.getClass();
                                    C12310e3.LIZIZ("DiskLruCache", message, null);
                                    if (c84391XAd != null) {
                                        c84391XAd.close();
                                    }
                                    return null;
                                }
                            } catch (Throwable th) {
                                if (c84391XAd != null) {
                                    c84391XAd.close();
                                    throw th;
                                }
                                throw th;
                            }
                        }
                    }
                    return null;
                } catch (Exception e2) {
                    e = e2;
                    c84391XAd = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84389XAb(XCG effectConfig, String cacheDir, int i, C84376X9o c84376X9o) {
        super(cacheDir, i, Long.MAX_VALUE, null, effectConfig.LJJJJJ, 20);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(cacheDir, "cacheDir");
        this.LJIIIIZZ = c84376X9o;
    }
}
