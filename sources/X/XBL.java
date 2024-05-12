package X;

import Y.ARunnableS51S0100000_15;
import defpackage.b0;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XBL {
    public final C10830bf LIZ;
    public final C10830bf LIZIZ;
    public final C10830bf LIZJ;
    public final C0FT LIZLLL = new C0FT((Object) 0L);
    public final C0FT LJ = new C0FT((Object) 0);
    public final C0FT LJFF = new C0FT((Object) null);
    public final C30941Ji LJI = new C30941Ji(0);
    public final C0FT LJII;
    public final C0FT LJIIIIZZ;
    public final C0FT LJIIIZ;
    public final C40601ia<String, XBR> LJIIJ;
    public final C1IW LJIIJJI;
    public final ARunnableS51S0100000_15 LJIIL;
    public final String LJIILIIL;
    public final int LJIILJJIL;
    public final int LJIILL;
    public long LJIILLIIL;
    public final XC4 LJIIZILJ;
    public final boolean LJIJ;
    public static final XBQ LJIJJ = new XBQ();
    public static final OJD LJIJI = new OJD("[a-z0-9_-]{1,120}");

    public final void LIZIZ() {
        if (!((Boolean) this.LJIIIIZZ.LIZ).booleanValue()) {
        } else {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final void LIZLLL() {
        C30941Ji c30941Ji = this.LJI;
        c30941Ji.LIZIZ();
        try {
            if (!((Boolean) this.LJII.LIZ).booleanValue() || ((Boolean) this.LJIIIIZZ.LIZ).booleanValue()) {
                this.LJIIIIZZ.LIZ = Boolean.TRUE;
            } else {
                Iterator it = new ArrayList(this.LJIIJ.values()).iterator();
                while (it.hasNext()) {
                    XBS xbs = (XBS) ((XBR) it.next()).LIZJ.LIZ;
                    if (xbs != null) {
                        xbs.LIZ();
                    }
                }
                LJIILLIIL();
                C32641Pw c32641Pw = (C32641Pw) this.LJFF.LIZ;
                if (c32641Pw != null) {
                    c32641Pw.close();
                }
                C78685UuP.LJJLJ(this.LJFF, null);
                this.LJIIIIZZ.LIZ = Boolean.TRUE;
            }
            c30941Ji.LIZLLL();
            if (XBM.LJ(this.LJIILIIL)) {
                C10820be.LJIIJJI(this.LJIILIIL);
            }
        } catch (Throwable th) {
            c30941Ji.LIZLLL();
            throw th;
        }
    }

    public final java.util.Set<String> LJI() {
        C30941Ji c30941Ji = this.LJI;
        c30941Ji.LIZIZ();
        try {
            return ORZ.LLJJ(new LinkedHashSet(this.LJIIJ.keySet()));
        } finally {
            c30941Ji.LIZLLL();
        }
    }

    public final void LJII() {
        if (((Boolean) this.LJII.LIZ).booleanValue()) {
            return;
        }
        C30941Ji c30941Ji = this.LJI;
        c30941Ji.LIZIZ();
        try {
            if (C10820be.LJFF(this.LIZJ)) {
                if (C10820be.LJFF(this.LIZ)) {
                    if (C10820be.LJIILLIIL(this.LIZJ) && C10820be.LJFF(this.LIZJ)) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("failed to delete ");
                        LIZ.append(this.LIZJ);
                        throw new C10850bh(X1D.LIZIZ(LIZ));
                    }
                } else {
                    XBQ xbq = LJIJJ;
                    C10830bf c10830bf = this.LIZJ;
                    C10830bf c10830bf2 = this.LIZ;
                    xbq.getClass();
                    XBQ.LIZIZ(c10830bf, c10830bf2, false);
                }
            }
            if (C10820be.LJFF(this.LIZ)) {
                try {
                    LJIIL();
                    LJIIJ();
                    this.LJII.LIZ = Boolean.TRUE;
                    return;
                } catch (C10850bh e) {
                    C12310e3 c12310e3 = C12310e3.LIZIZ;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("DiskLruCache ");
                    LIZ2.append(this.LJIILIIL);
                    LIZ2.append(" is corrupt: ");
                    LIZ2.append(e.getMessage());
                    LIZ2.append(", removing");
                    String LIZIZ = X1D.LIZIZ(LIZ2);
                    c12310e3.getClass();
                    C12310e3.LIZIZ("DiskLruCache", LIZIZ, null);
                    try {
                        LIZLLL();
                    } finally {
                        this.LJIIIIZZ.LIZ = Boolean.FALSE;
                    }
                }
            }
            LJIILJJIL();
            this.LJII.LIZ = Boolean.TRUE;
        } finally {
            c30941Ji.LIZLLL();
        }
    }

    public final boolean LJIIIIZZ() {
        if (((Number) this.LJ.LIZ).intValue() >= 2000 && ((Number) this.LJ.LIZ).intValue() >= this.LJIIJ.size()) {
            return true;
        }
        return false;
    }

    public final void LJIIJ() {
        Double d;
        C10820be.LJIILLIIL(this.LIZIZ);
        Iterator<XBR> it = this.LJIIJ.values().iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            XBR next = it.next();
            C0FT c0ft = next.LIZJ;
            if (c0ft.LIZ == null) {
                int i2 = this.LJIILL;
                while (i < i2) {
                    C0FT c0ft2 = this.LIZLLL;
                    c0ft2.LIZ = Long.valueOf(next.LIZ.get(i).longValue() + ((Number) c0ft2.LIZ).longValue());
                    i++;
                }
            } else {
                c0ft.LIZ = null;
                int i3 = this.LJIILL;
                while (i < i3) {
                    XBM.LIZLLL(next.LIZ(i));
                    XBM.LIZLLL(next.LIZIZ(i));
                    i++;
                }
                it.remove();
            }
        }
        for (Map.Entry<String, XBR> entry : this.LJIIJ.entrySet()) {
            if (entry.getValue().LJ.size() > 0) {
                long j = 0;
                if (entry.getValue().LJ.get(0).longValue() <= 0 && C10820be.LJFF(entry.getValue().LIZ(0))) {
                    C32621Pu LJI = C10820be.LJI(entry.getValue().LIZ(0));
                    if (LJI != null && (d = LJI.LJLJJL) != null) {
                        j = (long) d.doubleValue();
                    }
                    C12310e3 c12310e3 = C12310e3.LIZIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    b0.LJ(LIZ, entry.getKey(), ":modifiedAt:", j);
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    c12310e3.getClass();
                    C12310e3.LIZ("DiskLruCache", LIZIZ);
                    entry.getValue().LJ.set(0, Long.valueOf(j));
                }
            }
        }
    }

    public final void LJIIJJI() {
        C30941Ji c30941Ji = this.LJI;
        c30941Ji.LIZIZ();
        try {
            if (C10820be.LJFF(this.LIZJ)) {
                if (C10820be.LJFF(this.LIZ)) {
                    C10820be.LJIILLIIL(this.LIZJ);
                } else {
                    XBQ xbq = LJIJJ;
                    C10830bf c10830bf = this.LIZJ;
                    C10830bf c10830bf2 = this.LIZ;
                    xbq.getClass();
                    XBQ.LIZIZ(c10830bf, c10830bf2, false);
                }
            }
            if (C10820be.LJFF(this.LIZ)) {
                try {
                    LJIIL();
                    LJIIJ();
                    return;
                } catch (Exception e) {
                    C12310e3 c12310e3 = C12310e3.LIZIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("DiskLruCache ");
                    LIZ.append(this.LJIILIIL);
                    LIZ.append(" is corrupt: ");
                    LIZ.append(e.getMessage());
                    LIZ.append(", removing");
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    c12310e3.getClass();
                    C12310e3.LIZIZ("DiskLruCache", LIZIZ, null);
                    LIZLLL();
                }
            }
            if (!C10820be.LJ(this.LJIILIIL)) {
                C10820be.LJIIJJI(this.LJIILIIL);
            }
            LJIILJJIL();
        } finally {
            c30941Ji.LIZLLL();
        }
    }

    public final void LJIIL() {
        String str;
        int i;
        C10830bf c10830bf = this.LIZ;
        if (c10830bf != null && (str = c10830bf.LIZIZ) != null) {
            FileInputStream fileInputStream = new FileInputStream(new File(str).getAbsoluteFile());
            C32611Pt c32611Pt = new C32611Pt();
            c32611Pt.LIZ = fileInputStream;
            XC5 xc5 = new XC5(c32611Pt, EnumC10800bc.Ascii);
            try {
                try {
                    String LIZIZ = xc5.LIZIZ();
                    String LIZIZ2 = xc5.LIZIZ();
                    String LIZIZ3 = xc5.LIZIZ();
                    String LIZIZ4 = xc5.LIZIZ();
                    String LIZIZ5 = xc5.LIZIZ();
                    boolean z = this.LJIJ ? false : !o.LJ(String.valueOf(this.LJIILJJIL), LIZIZ3);
                    if (!(!o.LJ("libcore.io.DiskLruCache", LIZIZ)) && !(!o.LJ("1", LIZIZ2)) && !z && !(!o.LJ(String.valueOf(this.LJIILL), LIZIZ4)) && !(!o.LJ(LIZIZ5, ""))) {
                        int i2 = 0;
                        while (true) {
                            try {
                                String LIZIZ6 = xc5.LIZIZ();
                                if (LIZIZ6 == null || !LJIILIIL(LIZIZ6)) {
                                    break;
                                } else {
                                    i2++;
                                }
                            } catch (Exception unused) {
                            }
                        }
                        Collection<XBR> values = this.LJIIJ.values();
                        if ((values instanceof Collection) && values.isEmpty()) {
                            i = 0;
                        } else {
                            i = 0;
                            for (XBR xbr : values) {
                                if (xbr.LJ.size() > 0 && xbr.LJ.get(0).longValue() > 0 && (i = i + 1) < 0) {
                                    C47261Igj.LJJJJIZL();
                                    throw null;
                                }
                            }
                        }
                        this.LJ.LIZ = Integer.valueOf((i2 - this.LJIIJ.size()) - i);
                        if (xc5.LIZJ == -1) {
                            LJIILJJIL();
                        } else {
                            C0FT c0ft = this.LJFF;
                            C32631Pv LJIILIIL = C10820be.LJIILIIL(this.LIZ, true);
                            if (LJIILIIL != null) {
                                C78685UuP.LJJLJ(c0ft, new C42351lP(LJIILIIL, EnumC10800bc.Ascii));
                            } else {
                                o.LJIIZILJ();
                                throw null;
                            }
                        }
                        try {
                            xc5.close();
                            return;
                        } catch (Exception e) {
                            C16880lQ.LLLLIIL(e);
                            return;
                        }
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("unexpected journal header: [");
                    LIZ.append(LIZIZ);
                    LIZ.append(", ");
                    LIZ.append(LIZIZ2);
                    LIZ.append(", ");
                    LIZ.append(LIZIZ4);
                    LIZ.append(", ");
                    LIZ.append(LIZIZ5);
                    LIZ.append("]");
                    throw new C10850bh(X1D.LIZIZ(LIZ));
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (Throwable th) {
                try {
                    xc5.close();
                } catch (Exception e3) {
                    C16880lQ.LLLLIIL(e3);
                }
                throw th;
            }
        }
    }

    public final void LJIILJJIL() {
        C32631Pv LJIILIIL;
        C12310e3.LIZIZ.getClass();
        C12310e3.LIZ("DiskLruCache", "rebuildJournal");
        C30941Ji c30941Ji = this.LJI;
        c30941Ji.LIZIZ();
        try {
            C32641Pw c32641Pw = (C32641Pw) this.LJFF.LIZ;
            if (c32641Pw != null) {
                c32641Pw.close();
            }
            try {
                LJIILIIL = C10820be.LJIILIIL(this.LIZIZ, false);
            } catch (Exception unused) {
                C10830bf pathComponent = this.LIZIZ;
                o.LJIIJ(pathComponent, "pathComponent");
                String str = pathComponent.LIZIZ;
                if (str != null) {
                    new File(str).getAbsoluteFile().createNewFile();
                }
                LJIILIIL = C10820be.LJIILIIL(this.LIZIZ, false);
            }
            if (LJIILIIL != null) {
                C42351lP c42351lP = new C42351lP(LJIILIIL, EnumC10800bc.Ascii);
                try {
                    c42351lP.LIZIZ("libcore.io.DiskLruCache");
                    c42351lP.LIZIZ("\n");
                    c42351lP.LIZIZ("1");
                    c42351lP.LIZIZ("\n");
                    if (this.LJIJ) {
                        c42351lP.LIZIZ(String.valueOf(0));
                    } else {
                        c42351lP.LIZIZ(String.valueOf(this.LJIILJJIL));
                    }
                    c42351lP.LIZIZ("\n");
                    c42351lP.LIZIZ(String.valueOf(this.LJIILL));
                    c42351lP.LIZIZ("\n");
                    c42351lP.LIZIZ("\n");
                    for (XBR xbr : this.LJIIJ.values()) {
                        if (xbr.LIZJ.LIZ != null) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("DIRTY ");
                            LIZ.append(xbr.LJFF);
                            LIZ.append('\n');
                            c42351lP.LIZIZ(X1D.LIZIZ(LIZ));
                        } else {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("CLEAN ");
                            LIZ2.append(xbr.LJFF);
                            LIZ2.append(xbr.LIZJ());
                            LIZ2.append('\n');
                            c42351lP.LIZIZ(X1D.LIZIZ(LIZ2));
                        }
                        if (xbr.LJ.size() > 0 && xbr.LJ.get(0).longValue() > 0) {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("USE ");
                            LIZ3.append(xbr.LJFF);
                            LIZ3.append(xbr.LIZLLL());
                            LIZ3.append('\n');
                            c42351lP.LIZIZ(X1D.LIZIZ(LIZ3));
                        }
                    }
                    c42351lP.close();
                    if (C10820be.LJFF(this.LIZ)) {
                        XBQ xbq = LJIJJ;
                        C10830bf c10830bf = this.LIZ;
                        C10830bf c10830bf2 = this.LIZJ;
                        xbq.getClass();
                        XBQ.LIZIZ(c10830bf, c10830bf2, true);
                    }
                    XBQ xbq2 = LJIJJ;
                    C10830bf c10830bf3 = this.LIZIZ;
                    C10830bf c10830bf4 = this.LIZ;
                    xbq2.getClass();
                    XBQ.LIZIZ(c10830bf3, c10830bf4, false);
                    C10820be.LJIILLIIL(this.LIZJ);
                    C0FT c0ft = this.LJFF;
                    C32631Pv LJIILIIL2 = C10820be.LJIILIIL(this.LIZ, true);
                    if (LJIILIIL2 != null) {
                        C78685UuP.LJJLJ(c0ft, new C42351lP(LJIILIIL2, EnumC10800bc.Ascii));
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                } catch (Throwable th) {
                    c42351lP.close();
                    throw th;
                }
            }
        } finally {
            c30941Ji.LIZLLL();
        }
    }

    public final void LJIILLIIL() {
        while (((Number) this.LIZLLL.LIZ).longValue() > this.LJIILLIIL) {
            int size = this.LJIIJ.size();
            int i = 0;
            for (Map.Entry<String, XBR> entry : this.LJIIJ.entrySet()) {
                XC4 xc4 = this.LJIIZILJ;
                if (xc4 != null && xc4.isAllowed(entry.getKey())) {
                    i++;
                } else {
                    if (size - i < 10) {
                        C30941Ji c30941Ji = this.LJI;
                        c30941Ji.LIZIZ();
                        try {
                            long j = this.LJIILLIIL;
                            c30941Ji.LIZLLL();
                            long j2 = j * 2;
                            this.LJI.LIZIZ();
                            try {
                                this.LJIILLIIL = j2;
                                if (((Boolean) this.LJII.LIZ).booleanValue()) {
                                    this.LJIIJJI.execute(this.LJIIL);
                                }
                            } finally {
                            }
                        } finally {
                        }
                    }
                    C12310e3 c12310e3 = C12310e3.LIZIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("remove ");
                    LIZ.append(entry.getKey());
                    LIZ.append(" because exceed to maxSize(");
                    LIZ.append(this.LJIILLIIL);
                    LIZ.append(')');
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    c12310e3.getClass();
                    C12310e3.LIZ("DiskLruCache", LIZIZ);
                    LJIILL(entry.getKey());
                }
            }
        }
    }

    public static boolean LJIIZILJ(String str) {
        return LJIJI.matches(str);
    }

    public final boolean LIZ(String str) {
        long j;
        String str2;
        Long l;
        C30941Ji c30941Ji = this.LJI;
        c30941Ji.LIZIZ();
        try {
            LIZIZ();
            if (LJIIZILJ(str)) {
                XBR xbr = this.LJIIJ.get(str);
                boolean z = false;
                if (xbr == null) {
                    xbr = new XBR(this, str);
                    this.LJIIJ.put(str, xbr);
                } else if (xbr.LIZJ.LIZ != null) {
                    return false;
                }
                C10830bf LIZ = xbr.LIZ(0);
                if (C10820be.LJFF(LIZ)) {
                    long longValue = xbr.LIZ.get(0).longValue();
                    C32621Pu LJI = C10820be.LJI(LIZ);
                    if (LJI != null && (l = LJI.LJLJJLL) != null) {
                        j = l.longValue();
                    } else {
                        j = 0;
                    }
                    if (LJI != null && LJI.LJLJL == EnumC10840bg.Directory) {
                        if (LIZ == null) {
                            str2 = null;
                        } else {
                            str2 = LIZ.LIZIZ;
                        }
                        j = XBM.LJI(str2);
                    }
                    xbr.LIZ.set(0, Long.valueOf(j));
                    C0FT c0ft = this.LIZLLL;
                    c0ft.LIZ = Long.valueOf((((Number) c0ft.LIZ).longValue() - longValue) + j);
                    C0FT c0ft2 = this.LJ;
                    c0ft2.LIZ = Integer.valueOf(((Number) c0ft2.LIZ).intValue() + 1);
                    xbr.LIZJ.LIZ = null;
                    xbr.LIZIZ.LIZ = Boolean.TRUE;
                    C32641Pw c32641Pw = (C32641Pw) this.LJFF.LIZ;
                    if (c32641Pw != null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("CLEAN ");
                        LIZ2.append(xbr.LJFF);
                        LIZ2.append(xbr.LIZJ());
                        LIZ2.append('\n');
                        c32641Pw.LIZIZ(X1D.LIZIZ(LIZ2));
                    }
                    C0FT c0ft3 = this.LJIIIZ;
                    c0ft3.LIZ = Long.valueOf(((Number) c0ft3.LIZ).longValue() + 1);
                    xbr.LIZLLL.LIZ = this.LJIIIZ.LIZ;
                    C32641Pw c32641Pw2 = (C32641Pw) this.LJFF.LIZ;
                    if (c32641Pw2 != null) {
                        c32641Pw2.LIZ();
                    }
                    if (((Number) this.LIZLLL.LIZ).longValue() > this.LJIILLIIL || LJIIIIZZ()) {
                        this.LJIIJJI.execute(this.LJIIL);
                    }
                    z = true;
                } else {
                    this.LJIIJ.remove(xbr.LJFF);
                    C32641Pw c32641Pw3 = (C32641Pw) this.LJFF.LIZ;
                    if (c32641Pw3 != null) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("REMOVE ");
                        LIZ3.append(xbr.LJFF);
                        LIZ3.append('\n');
                        c32641Pw3.LIZIZ(X1D.LIZIZ(LIZ3));
                    }
                }
                return z;
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("keys must match regex [a-z0-9_-]{1,120}: \"");
            LIZ4.append(str);
            LIZ4.append("\"");
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ4));
        } finally {
            c30941Ji.LIZLLL();
        }
    }

    public final XBS LJ(String str) {
        XBS xbs;
        C30941Ji c30941Ji = this.LJI;
        c30941Ji.LIZIZ();
        try {
            LJII();
            LIZIZ();
            if (LJIIZILJ(str)) {
                XBR xbr = this.LJIIJ.get(str);
                if (xbr == null) {
                    xbr = new XBR(this, str);
                    this.LJIIJ.put(str, xbr);
                } else if (xbr.LIZJ.LIZ != null) {
                    C12310e3 c12310e3 = C12310e3.LIZIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("key: ");
                    LIZ.append(str);
                    LIZ.append(" is now in editing, return null!");
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    c12310e3.getClass();
                    C12310e3.LIZ("DiskLruCache", LIZIZ);
                    xbs = null;
                    return xbs;
                }
                xbs = new XBS(this, xbr);
                xbr.LIZJ.LIZ = xbs;
                C32641Pw c32641Pw = (C32641Pw) this.LJFF.LIZ;
                if (c32641Pw != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("DIRTY ");
                    LIZ2.append(str);
                    LIZ2.append('\n');
                    c32641Pw.LIZIZ(X1D.LIZIZ(LIZ2));
                }
                C32641Pw c32641Pw2 = (C32641Pw) this.LJFF.LIZ;
                if (c32641Pw2 != null) {
                    c32641Pw2.LIZ();
                }
                return xbs;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("keys must match regex [a-z0-9_-]{1,120}: \"");
            LIZ3.append(str);
            LIZ3.append("\"");
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ3));
        } finally {
            c30941Ji.LIZLLL();
        }
    }

    public final C84391XAd LJFF(String str) {
        C32611Pt c32611Pt;
        C32611Pt c32611Pt2;
        C30941Ji c30941Ji = this.LJI;
        c30941Ji.LIZIZ();
        try {
            LJII();
            LIZIZ();
            if (LJIIZILJ(str)) {
                XBR xbr = this.LJIIJ.get(str);
                if (xbr == null) {
                    return null;
                }
                if (!((Boolean) xbr.LIZIZ.LIZ).booleanValue()) {
                    return null;
                }
                int i = this.LJIILL;
                C32611Pt[] c32611PtArr = new C32611Pt[i];
                C10830bf[] c10830bfArr = new C10830bf[i];
                for (int i2 = 0; i2 < i; i2++) {
                    try {
                        C10830bf LIZ = xbr.LIZ(i2);
                        c10830bfArr[i2] = LIZ;
                        if (LIZ != null) {
                            String str2 = LIZ.LIZIZ;
                            if (str2 != null) {
                                FileInputStream fileInputStream = new FileInputStream(new File(str2).getAbsoluteFile());
                                c32611Pt2 = new C32611Pt();
                                c32611Pt2.LIZ = fileInputStream;
                            } else {
                                c32611Pt2 = null;
                            }
                            c32611PtArr[i2] = c32611Pt2;
                        }
                    } catch (Exception unused) {
                        for (int i3 = 0; i3 < this.LJIILL && (c32611Pt = c32611PtArr[i3]) != null; i3++) {
                            try {
                                c32611Pt.close();
                            } catch (Exception e) {
                                C16880lQ.LLLLIIL(e);
                            }
                        }
                        return null;
                    }
                }
                C0FT c0ft = this.LJ;
                c0ft.LIZ = Integer.valueOf(((Number) c0ft.LIZ).intValue() + 1);
                C32641Pw c32641Pw = (C32641Pw) this.LJFF.LIZ;
                if (c32641Pw != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("READ ");
                    LIZ2.append(str);
                    LIZ2.append('\n');
                    String csa = X1D.LIZIZ(LIZ2);
                    o.LJIIJ(csa, "csa");
                    c32641Pw.LIZ.append((CharSequence) csa);
                }
                if (LJIIIIZZ()) {
                    this.LJIIJJI.execute(this.LJIIL);
                }
                ((Number) xbr.LIZLLL.LIZ).longValue();
                return new C84391XAd(str, c10830bfArr, c32611PtArr, ORZ.LLJIJIL(xbr.LIZ));
            }
            LJIILL(str);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("keys must match regex [a-z0-9_-]{1,120}: \"");
            LIZ3.append(str);
            LIZ3.append("\"");
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ3));
        } finally {
            c30941Ji.LIZLLL();
        }
    }

    public final void LJIIIZ(String str) {
        C30941Ji c30941Ji = this.LJI;
        c30941Ji.LIZIZ();
        try {
            LJII();
            LIZIZ();
            if (LJIIZILJ(str)) {
                XBR xbr = this.LJIIJ.get(str);
                if (xbr == null) {
                    xbr = new XBR(this, str);
                    this.LJIIJ.put(str, xbr);
                }
                xbr.LJ.set(0, Long.valueOf(System.currentTimeMillis()));
                C32641Pw c32641Pw = (C32641Pw) this.LJFF.LIZ;
                if (c32641Pw != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("USE ");
                    LIZ.append(xbr.LJFF);
                    LIZ.append(xbr.LIZLLL());
                    LIZ.append('\n');
                    c32641Pw.LIZIZ(X1D.LIZIZ(LIZ));
                }
                C32641Pw c32641Pw2 = (C32641Pw) this.LJFF.LIZ;
                if (c32641Pw2 != null) {
                    c32641Pw2.LIZ();
                }
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("keys must match regex [a-z0-9_-]{1,120}: \"");
            LIZ2.append(str);
            LIZ2.append("\"");
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
        } finally {
            c30941Ji.LIZLLL();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0115, code lost:
    
        if (r8 == (-1)) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILIIL(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XBL.LJIILIIL(java.lang.String):boolean");
    }

    public final boolean LJIILL(String str) {
        if (str == null) {
            return false;
        }
        C30941Ji c30941Ji = this.LJI;
        c30941Ji.LIZIZ();
        try {
            LJII();
            LIZIZ();
            if (LJIIZILJ(str)) {
                XBR xbr = this.LJIIJ.get(str);
                if (xbr != null && xbr.LIZJ.LIZ == null) {
                    C0FT c0ft = this.LJ;
                    c0ft.LIZ = Integer.valueOf(((Number) c0ft.LIZ).intValue() + 1);
                    C32641Pw c32641Pw = (C32641Pw) this.LJFF.LIZ;
                    if (c32641Pw != null) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("REMOVE ");
                        LIZ.append(str);
                        LIZ.append('\n');
                        String csa = X1D.LIZIZ(LIZ);
                        o.LJIIJ(csa, "csa");
                        c32641Pw.LIZ.append((CharSequence) csa);
                    }
                    C32641Pw c32641Pw2 = (C32641Pw) this.LJFF.LIZ;
                    if (c32641Pw2 != null) {
                        c32641Pw2.LIZ();
                    }
                    this.LJIIJ.remove(str);
                    int i = this.LJIILL;
                    for (int i2 = 0; i2 < i; i2++) {
                        C10830bf LIZ2 = xbr.LIZ(i2);
                        try {
                            XBM.LIZLLL(LIZ2);
                            C0FT c0ft2 = this.LIZLLL;
                            c0ft2.LIZ = Long.valueOf(((Number) c0ft2.LIZ).longValue() - xbr.LIZ.get(i2).longValue());
                            xbr.LIZ.set(i2, 0L);
                        } catch (Exception unused) {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("failed to delete ");
                            LIZ3.append(LIZ2);
                            throw new Exception(X1D.LIZIZ(LIZ3));
                        }
                    }
                    if (LJIIIIZZ()) {
                        this.LJIIJJI.execute(this.LJIIL);
                    }
                    return true;
                }
                return false;
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("keys must match regex [a-z0-9_-]{1,120}: \"");
            LIZ4.append(str);
            LIZ4.append("\"");
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ4));
        } finally {
            c30941Ji.LIZLLL();
        }
    }

    public final void LIZJ(XBS xbs, boolean z) {
        long j;
        Long l;
        C30941Ji c30941Ji = this.LJI;
        c30941Ji.LIZIZ();
        try {
            XBR xbr = xbs.LIZLLL;
            if (!(!o.LJ((XBS) xbr.LIZJ.LIZ, xbs))) {
                if (z && !((Boolean) xbr.LIZIZ.LIZ).booleanValue()) {
                    int i = this.LJIILL;
                    for (int i2 = 0; i2 < i; i2++) {
                        if (((boolean[]) xbs.LIZ.LIZ)[i2]) {
                            if (xbr.LIZIZ(i2) != null && !C10820be.LJFF(xbr.LIZIZ(i2))) {
                                xbs.LIZ();
                                return;
                            }
                        } else {
                            xbs.LIZ();
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Newly created entry didn't create value for index ");
                            LIZ.append(i2);
                            throw new IllegalStateException(X1D.LIZIZ(LIZ));
                        }
                    }
                }
                int i3 = this.LJIILL;
                for (int i4 = 0; i4 < i3; i4++) {
                    C10830bf LIZIZ = xbr.LIZIZ(i4);
                    if (LIZIZ != null) {
                        if (z) {
                            if (C10820be.LJFF(LIZIZ)) {
                                C10830bf LIZ2 = xbr.LIZ(i4);
                                C10820be.LJIIZILJ(LIZIZ, LIZ2);
                                long longValue = xbr.LIZ.get(i4).longValue();
                                C32621Pu LJI = C10820be.LJI(LIZ2);
                                if (LJI != null && (l = LJI.LJLJJLL) != null) {
                                    j = l.longValue();
                                } else {
                                    j = 0;
                                }
                                xbr.LIZ.set(i4, Long.valueOf(j));
                                C0FT c0ft = this.LIZLLL;
                                c0ft.LIZ = Long.valueOf((((Number) c0ft.LIZ).longValue() - longValue) + j);
                            }
                        } else {
                            XBM.LIZLLL(LIZIZ);
                        }
                    }
                }
                C0FT c0ft2 = this.LJ;
                c0ft2.LIZ = Integer.valueOf(((Number) c0ft2.LIZ).intValue() + 1);
                xbr.LIZJ.LIZ = null;
                if (((Boolean) xbr.LIZIZ.LIZ).booleanValue() | z) {
                    xbr.LIZIZ.LIZ = Boolean.TRUE;
                    C32641Pw c32641Pw = (C32641Pw) this.LJFF.LIZ;
                    if (c32641Pw != null) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("CLEAN ");
                        LIZ3.append(xbr.LJFF);
                        LIZ3.append(xbr.LIZJ());
                        LIZ3.append('\n');
                        c32641Pw.LIZIZ(X1D.LIZIZ(LIZ3));
                    }
                    if (z) {
                        C0FT c0ft3 = this.LJIIIZ;
                        c0ft3.LIZ = Long.valueOf(((Number) c0ft3.LIZ).longValue() + 1);
                        xbr.LIZLLL.LIZ = this.LJIIIZ.LIZ;
                    }
                } else {
                    this.LJIIJ.remove(xbr.LJFF);
                    C32641Pw c32641Pw2 = (C32641Pw) this.LJFF.LIZ;
                    if (c32641Pw2 != null) {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("REMOVE ");
                        LIZ4.append(xbr.LJFF);
                        LIZ4.append('\n');
                        c32641Pw2.LIZIZ(X1D.LIZIZ(LIZ4));
                    }
                }
                C32641Pw c32641Pw3 = (C32641Pw) this.LJFF.LIZ;
                if (c32641Pw3 != null) {
                    c32641Pw3.LIZ();
                }
                if (((Number) this.LIZLLL.LIZ).longValue() > this.LJIILLIIL || LJIIIIZZ()) {
                    this.LJIIJJI.execute(this.LJIIL);
                }
                return;
            }
            throw new IllegalStateException();
        } finally {
            c30941Ji.LIZLLL();
        }
    }

    public XBL(String str, int i, int i2, long j, XC4 xc4, boolean z) {
        this.LJIILIIL = str;
        this.LJIILJJIL = i;
        this.LJIILL = i2;
        this.LJIILLIIL = j;
        this.LJIIZILJ = xc4;
        this.LJIJ = z;
        Boolean bool = Boolean.FALSE;
        this.LJII = new C0FT(bool);
        this.LJIIIIZZ = new C0FT(bool);
        this.LJIIIZ = new C0FT((Object) 0L);
        this.LJIIJ = new C40601ia<>(false);
        this.LJIIJJI = new C1IW();
        this.LJIIL = new ARunnableS51S0100000_15(this, 108);
        C10830bf LIZ = new C10830bf(str).LIZ("journal");
        if (LIZ != null) {
            this.LIZ = LIZ;
            C10830bf LIZ2 = new C10830bf(str).LIZ("journal.tmp");
            if (LIZ2 != null) {
                this.LIZIZ = LIZ2;
                C10830bf LIZ3 = new C10830bf(str).LIZ("journal.bkp");
                if (LIZ3 != null) {
                    this.LIZJ = LIZ3;
                    return;
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
            o.LJIIZILJ();
            throw null;
        }
        o.LJIIZILJ();
        throw null;
    }
}
