package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Q0f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66297Q0f {
    public static C66297Q0f LJIIJ;
    public static int LJIIJJI;
    public OHW LIZ;
    public int LIZJ;
    public String LIZLLL;
    public Throwable LJI;
    public java.util.Map<String, Object> LJII;
    public C66297Q0f LJIIIIZZ;
    public static final C66299Q0h LJIIL = new C66299Q0h();
    public static final Object LJIIIZ = new Object();
    public String LIZIZ = "unknown";
    public C66301Q0j LJ = new C66301Q0j();
    public EnumC66303Q0l LJFF = EnumC66303Q0l.INFO;

    public final void LIZIZ() {
        this.LIZ = null;
        this.LIZIZ = "unknown";
        this.LIZJ = 0;
        this.LIZLLL = null;
        this.LJFF = EnumC66303Q0l.INFO;
        this.LJI = null;
        this.LJII = null;
        C66301Q0j c66301Q0j = this.LJ;
        C66302Q0k c66302Q0k = c66301Q0j.LIZ;
        c66302Q0k.LIZ = 0L;
        C66302Q0k c66302Q0k2 = c66301Q0j.LIZIZ;
        c66302Q0k2.LIZ = 0L;
        C66302Q0k c66302Q0k3 = c66301Q0j.LIZJ;
        c66302Q0k3.LIZ = 0L;
        c66302Q0k.LIZIZ = 0L;
        c66302Q0k2.LIZIZ = 0L;
        c66302Q0k3.LIZIZ = 0L;
        c66301Q0j.LIZLLL = false;
        c66301Q0j.LJ = false;
        synchronized (LJIIIZ) {
            int i = LJIIJJI;
            if (i < 50) {
                this.LJIIIIZZ = LJIIJ;
                LJIIJ = this;
                LJIIJJI = i + 1;
            }
        }
    }

    public final C66297Q0f LIZ() {
        C66297Q0f c66297Q0f = new C66297Q0f();
        c66297Q0f.LIZ = this.LIZ;
        c66297Q0f.LIZIZ = this.LIZIZ;
        c66297Q0f.LIZJ = this.LIZJ;
        c66297Q0f.LIZLLL = this.LIZLLL;
        C66301Q0j c66301Q0j = this.LJ;
        c66301Q0j.getClass();
        C66301Q0j c66301Q0j2 = new C66301Q0j();
        C66302Q0k c66302Q0k = c66301Q0j2.LIZIZ;
        C66302Q0k c66302Q0k2 = c66301Q0j.LIZIZ;
        c66302Q0k.LIZ = c66302Q0k2.LIZ;
        c66302Q0k.LIZIZ = c66302Q0k2.LIZIZ;
        C66302Q0k c66302Q0k3 = c66301Q0j2.LIZ;
        C66302Q0k c66302Q0k4 = c66301Q0j.LIZ;
        c66302Q0k3.LIZ = c66302Q0k4.LIZ;
        c66302Q0k3.LIZIZ = c66302Q0k4.LIZIZ;
        C66302Q0k c66302Q0k5 = c66301Q0j2.LIZJ;
        C66302Q0k c66302Q0k6 = c66301Q0j.LIZJ;
        c66302Q0k5.LIZ = c66302Q0k6.LIZ;
        c66302Q0k5.LIZIZ = c66302Q0k6.LIZIZ;
        c66301Q0j2.LIZLLL = c66301Q0j.LIZLLL;
        c66301Q0j2.LJ = c66301Q0j.LJ;
        c66297Q0f.LJ = c66301Q0j2;
        c66297Q0f.LJFF = this.LJFF;
        c66297Q0f.LJI = this.LJI;
        c66297Q0f.LJII = this.LJII;
        return c66297Q0f;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Event(context=");
        LIZ.append(this.LIZ);
        LIZ.append(", eventType='");
        LIZ.append(this.LIZIZ);
        LIZ.append("', status=");
        LIZ.append(this.LIZJ);
        LIZ.append(", msg=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", timeAnchor=");
        C66302Q0k c66302Q0k = this.LJ.LIZIZ;
        LIZ.append(((float) (c66302Q0k.LIZIZ - c66302Q0k.LIZ)) / 1000000.0f);
        LIZ.append(", eventLevel=");
        LIZ.append(this.LJFF);
        LIZ.append(", stack=");
        LIZ.append(this.LJI);
        LIZ.append(", extraMap=");
        return C15890jp.LIZ(LIZ, this.LJII, ')', LIZ);
    }

    public final void LIZJ(EnumC66303Q0l enumC66303Q0l) {
        o.LJIIJ(enumC66303Q0l, "<set-?>");
        this.LJFF = enumC66303Q0l;
    }
}
