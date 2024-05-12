package X;

import com.ss.ttvideoengine.TTVideoEngine;
import kotlin.jvm.internal.AqS165S0100000_15;

/* renamed from: X.XaP, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85089XaP {
    public static final String LJII = C16880lQ.LJLLJ(C85089XaP.class);
    public final InterfaceC85092XaS LIZ;
    public volatile boolean LIZIZ;
    public volatile boolean LIZJ;
    public volatile boolean LIZLLL;
    public volatile boolean LJ;
    public final C32240Cl2 LJFF = new C32240Cl2();
    public final C62822Ol8 LJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 814));

    public final long LIZ() {
        if (this.LIZIZ) {
            return LIZIZ().LJIL();
        }
        return 0L;
    }

    public final TTVideoEngine LIZIZ() {
        return (TTVideoEngine) this.LJI.getValue();
    }

    public final void LIZJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this);
        LIZ.append("  -> play() pending: -> ");
        LIZ.append(this.LIZLLL);
        LIZ.append("  isPrepared: ");
        LIZ.append(this.LIZJ);
        X1D.LIZIZ(LIZ);
        this.LIZLLL = true;
        try {
            LIZIZ().LJJLI();
        } catch (Exception e) {
            C78983UzD.LJIJ(e, "realPlay");
        }
    }

    public final void LIZLLL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this);
        LIZ.append("  -> resetParams()");
        X1D.LIZIZ(LIZ);
        this.LJ = false;
        this.LIZJ = false;
        this.LIZLLL = false;
    }

    public C85089XaP(C85090XaQ c85090XaQ) {
        this.LIZ = c85090XaQ;
    }

    public final void LJFF(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this);
        LIZ.append("  -> setStartPlayTime(): -> ");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        if (i >= 0) {
            LIZIZ().LLIIZ(i);
        }
    }

    public final void LJ(String str, String str2, Double d, Double d2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this);
        LIZ.append("  -> setDirectUrlUseDataLoader(): -> cacheKey = ");
        LIZ.append(str2);
        LIZ.append(" playUrl = ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        LIZLLL();
        if (d != null && d2 != null) {
            float volLoudUnity = IUB.LIZIZ().getVolLoudUnity();
            LIZIZ().LJLLLL(329, 1);
            LIZIZ().LJLLLL(343, 1);
            LIZIZ().LJLLILLLL(volLoudUnity, 344);
            LIZIZ().LJLLILLLL((float) d.doubleValue(), 345);
            LIZIZ().LJLLILLLL((float) d2.doubleValue(), 346);
            LIZIZ().LJLLLL(347, 1);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(this);
            LIZ2.append("  -> setVolumeBalance: -> loudness:");
            LIZ2.append(d);
            LIZ2.append(", peak:");
            LIZ2.append(d2);
            LIZ2.append(", targetLoudness:");
            LIZ2.append(volLoudUnity);
            X1D.LIZIZ(LIZ2);
        } else {
            LIZIZ().LJLLLL(329, 0);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(this);
            LIZ3.append("  -> setVolumeBalance: -> Turn Off");
            X1D.LIZIZ(LIZ3);
        }
        LIZIZ().LJLJL(str, str2);
    }
}
