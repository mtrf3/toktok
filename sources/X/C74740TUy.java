package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* renamed from: X.TUy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74740TUy extends AbstractC28788BRo<Integer> {
    public static C74740TUy LJIILIIL;
    public long LIZLLL;
    public int LJ = 2;
    public LiveEffect LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public LiveEffect LJIIL;

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Integer] */
    public final void LJII() {
        this.LIZIZ = 0;
        this.LIZLLL = 0L;
        this.LJ = 2;
        this.LJFF = null;
        this.LJIIIIZZ = "";
        this.LJIIIZ = false;
        this.LJIIJ = 0;
        this.LJIIJJI = 0;
        this.LJI = "";
        this.LJII = "";
        this.LJIIL = null;
    }

    public static C74740TUy LIZLLL() {
        if (LJIILIIL == null) {
            LJIILIIL = new C74740TUy();
        }
        return LJIILIIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJ() {
        if (((Integer) this.LIZIZ).intValue() == 2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJFF() {
        if (((Integer) this.LIZIZ).intValue() == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Integer] */
    public C74740TUy() {
        this.LIZIZ = 0;
    }

    public final void LJI(Integer num) {
        if (num == null || num.intValue() < 0 || num.intValue() > 2) {
            return;
        }
        num.intValue();
        LIZIZ(num);
    }

    public final void LJIIIIZZ(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(C74740TUy.class));
        LIZ.append("_setCurrentTicket currentTicket:");
        LIZ.append(j);
        C0NB.LIZIZ("voice_chat", X1D.LIZIZ(LIZ));
        if (j > this.LIZLLL) {
            this.LIZLLL = j;
        }
    }
}
