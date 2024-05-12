package X;

import com.ss.android.ugc.aweme.shortvideo.SafeHandler;

/* renamed from: X.67T, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C67T {
    public InterfaceC1552467k LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJ;
    public long LJFF;
    public float LJI;
    public float LJII;
    public boolean LJIIIIZZ;
    public int LJIIJJI;
    public int LJIIL;
    public boolean LJIILIIL;
    public SafeHandler LJIILJJIL;
    public C67P LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public C67Y LJIJI;
    public C68C LJIJJ;
    public final C68K LJIJJLI;
    public final C82622Wbi LJIL;
    public C63D LJJI;
    public int LJIIIZ = 2;
    public int LJIIJ = 3000;
    public RunnableC1552067g LJIILL = new RunnableC1552067g(this);
    public C66N LJJ = AnonymousClass647.LJLIL;

    public final boolean LIZ() {
        C68K c68k = this.LJIJJLI;
        if (c68k != null) {
            return c68k.LIZ();
        }
        C82622Wbi c82622Wbi = this.LJIL;
        if (c82622Wbi != null) {
            if (this.LJJI == null) {
                this.LJJI = (C63D) c82622Wbi.LJIIIIZZ(null, C63D.class);
            }
            C63D c63d = this.LJJI;
            if (c63d != null) {
                return c63d.LJIIIIZZ();
            }
        }
        return false;
    }

    public final void LIZJ(boolean z) {
        boolean z2;
        String str;
        this.LJIIIIZZ = z;
        RunnableC1552067g runnableC1552067g = this.LJIILL;
        if (runnableC1552067g != null) {
            this.LJIILLIIL.removeCallbacks(runnableC1552067g);
            this.LJIILL = null;
        }
        if (z && this.LJIILJJIL != null && this.LJIILL == null) {
            RunnableC1552067g runnableC1552067g2 = new RunnableC1552067g(this);
            this.LJIILL = runnableC1552067g2;
            this.LJIILLIIL.postDelayed(runnableC1552067g2, this.LJIIJ);
        }
        this.LJIILLIIL.invalidate();
        C67Y c67y = this.LJIJI;
        if (c67y != null) {
            if (this.LJIILLIIL.getData() != null) {
                z2 = this.LJIILLIIL.getData().getHasReadTextAudio();
            } else {
                z2 = false;
            }
            if (this.LJIILLIIL.getData() != null && this.LJIILLIIL.getData().getTtsVoiceModel() != null) {
                str = "auto";
            } else {
                str = "user_click";
            }
            c67y.LIZ(str, z, false, z2);
        }
    }

    public C67T(C68K c68k, C82622Wbi c82622Wbi) {
        this.LJIJJLI = c68k;
        this.LJIL = c82622Wbi;
    }

    public final boolean LIZIZ(float f, float f2) {
        this.LJFF = System.currentTimeMillis();
        float f3 = f - this.LJIIJJI;
        float f4 = f2 - this.LJIIL;
        this.LIZLLL = f3;
        this.LJ = f4;
        boolean z = false;
        if (this.LJIJ) {
            this.LJIIIZ = 2;
            this.LJIJ = false;
        }
        if (this.LJIIIZ == 2 || LIZ()) {
            boolean LJIIIZ = this.LJIILLIIL.LJIIIZ(f3, f4);
            this.LJIILIIL = LJIIIZ;
            if (LJIIIZ) {
                this.LJIIIZ = 3;
                this.LJI = f3;
                this.LJII = f4;
                z = true;
                InterfaceC1552467k interfaceC1552467k = this.LIZ;
                if (interfaceC1552467k != null) {
                    interfaceC1552467k.LJIIIZ(this.LJIILLIIL);
                }
            }
        }
        return z;
    }
}
