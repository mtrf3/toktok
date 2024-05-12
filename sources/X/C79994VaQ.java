package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;

/* renamed from: X.VaQ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79994VaQ {
    public static final C79995VaR LJIILIIL = new C79995VaR();
    public boolean LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public C79995VaR LJIIJJI;
    public boolean LJIIL;

    public static C79994VaQ LIZ() {
        C79994VaQ c79994VaQ = new C79994VaQ();
        c79994VaQ.LIZ = true;
        c79994VaQ.LJII = 0;
        c79994VaQ.LJIIIIZZ = 1;
        c79994VaQ.LIZIZ = 200;
        c79994VaQ.LJIIIZ = 1;
        c79994VaQ.LIZJ = true;
        c79994VaQ.LIZLLL = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        c79994VaQ.LJ = false;
        c79994VaQ.LJFF = false;
        c79994VaQ.LJIIJJI = LJIILIIL;
        c79994VaQ.LJIIL = true;
        c79994VaQ.LJIIJ = 1;
        c79994VaQ.LJI = -16777216;
        return c79994VaQ;
    }

    public C79994VaQ() {
        this.LIZIZ = 200;
        this.LJIIIZ = 1;
        this.LJIIJ = 1;
    }

    public C79994VaQ(C79987VaJ c79987VaJ) {
        this.LIZ = true;
        this.LJII = c79987VaJ.LIZ;
        this.LJIIIIZZ = 1;
        this.LIZIZ = 200;
        this.LIZJ = true;
        this.LIZLLL = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        this.LJFF = c79987VaJ.LIZJ;
        this.LJ = c79987VaJ.LIZIZ;
        this.LJIIIZ = c79987VaJ.LJ;
        this.LJIIJ = c79987VaJ.LIZLLL;
        this.LJIIJJI = null;
        this.LJIIL = false;
        this.LJI = -16777216;
    }
}
