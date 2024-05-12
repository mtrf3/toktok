package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Gcw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41930Gcw {
    public static final C41930Gcw LIZ = new C41930Gcw();
    public static AbstractC41925Gcr LIZIZ;

    public static final void LIZJ() {
        AbstractC41925Gcr abstractC41925Gcr = LIZIZ;
        if (abstractC41925Gcr != null) {
            abstractC41925Gcr.LIZIZ();
        }
        LIZIZ = null;
    }

    public static String LIZLLL() {
        AbstractC41925Gcr abstractC41925Gcr = LIZIZ;
        if (abstractC41925Gcr != null) {
            return abstractC41925Gcr.LJI.LJJZZIII();
        }
        return null;
    }

    public static final String LJ() {
        AbstractC41925Gcr abstractC41925Gcr = LIZIZ;
        if (abstractC41925Gcr != null) {
            return abstractC41925Gcr.LJI.LJJZZIII();
        }
        return null;
    }

    public static final boolean LJI() {
        if (LIZIZ != null) {
            return true;
        }
        return false;
    }

    public static final void LJII() {
        AbstractC41925Gcr abstractC41925Gcr = LIZIZ;
        if (abstractC41925Gcr != null) {
            abstractC41925Gcr.LJIIJ();
        }
    }

    public final C73426Srm LJFF() {
        AbstractC41925Gcr abstractC41925Gcr = LIZIZ;
        if (abstractC41925Gcr != null) {
            C73849Syb<String> c73849Syb = abstractC41925Gcr.LJI;
            return C42193GhB.LIZJ(c73849Syb, c73849Syb);
        }
        return null;
    }

    public static final void LIZIZ(QXX qxx) {
        AbstractC41925Gcr abstractC41925Gcr;
        if (LIZIZ != null) {
            return;
        }
        if (qxx instanceof C41932Gcy) {
            abstractC41925Gcr = new C41929Gcv((C41932Gcy) qxx);
        } else if (qxx instanceof C41931Gcx) {
            abstractC41925Gcr = new C41911Gcd((C41931Gcx) qxx);
        } else if (qxx instanceof C42362Gju) {
            abstractC41925Gcr = new C41922Gco((C42362Gju) qxx);
        } else if (qxx instanceof C42361Gjt) {
            abstractC41925Gcr = new C41906GcY((C42361Gjt) qxx);
        } else {
            abstractC41925Gcr = null;
        }
        LIZIZ = abstractC41925Gcr;
    }

    public static final void LIZ(InterfaceC153045zY interfaceC153045zY, String str) {
        C41906GcY c41906GcY;
        AbstractC41925Gcr abstractC41925Gcr = LIZIZ;
        if ((abstractC41925Gcr instanceof C41906GcY) && (c41906GcY = (C41906GcY) abstractC41925Gcr) != null && o.LJ(str, c41906GcY.LJIIIIZZ.LJLIL)) {
            c41906GcY.LJIIJ.setValue(interfaceC153045zY);
        }
    }
}
