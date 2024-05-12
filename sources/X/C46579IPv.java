package X;

import Y.ARunnableS44S0100000_8;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;

/* renamed from: X.IPv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46579IPv implements InterfaceC73068Sm0 {
    public final C73062Slu LIZ;
    public final SK0 LIZIZ;
    public boolean LIZJ;
    public SurfaceTexture LIZLLL;
    public final C73062Slu LJ;
    public Video LJFF;
    public long LJI;
    public boolean LJIIIIZZ;
    public int LJIIJ;
    public boolean LJIIJJI;
    public int LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public ARunnableS44S0100000_8 LJIILLIIL;
    public InterfaceC46568IPk LJIIZILJ;
    public final C46567IPj LJIJ;
    public boolean LJIJI;
    public float LJIIIZ = -1.0f;
    public final C62822Ol8 LJIILL = C221108m2.LIZIZ(C46569IPl.INSTANCE);
    public IWF LJII = new IWF();

    @Override // X.InterfaceC73068Sm0
    public final void LIZ() {
    }

    @Override // X.InterfaceC73068Sm0
    public final void LIZJ() {
    }

    @Override // X.InterfaceC73068Sm0
    public final void pause() {
        this.LJIIJJI = false;
        this.LJIIIZ = -1.0f;
        IWF iwf = this.LJII;
        if (iwf != null) {
            ((Handler) this.LJIILL.getValue()).removeCallbacksAndMessages(null);
            iwf.LJIILJJIL();
            iwf.LJJJZ();
        }
        SK0 sk0 = this.LIZIZ;
        if (sk0 == null) {
            return;
        }
        sk0.setVisibility(0);
    }

    @Override // X.InterfaceC73068Sm0
    public final void release() {
        this.LIZJ = false;
        SurfaceTexture surfaceTexture = this.LIZLLL;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.LIZLLL = null;
        IWF iwf = this.LJII;
        if (iwf != null) {
            ((Handler) this.LJIILL.getValue()).removeCallbacksAndMessages(null);
            iwf.LLLLLL();
            iwf.LJJJLL(null);
            iwf.LJJIIZ();
            iwf.release();
        }
        this.LJII = null;
    }

    @Override // X.InterfaceC73068Sm0
    public final void stop() {
    }

    @Override // X.InterfaceC73068Sm0
    public final void LIZIZ() {
        IWF iwf = this.LJII;
        if (iwf != null) {
            iwf.LJIJJ();
        }
        this.LJIJI = true;
    }

    @Override // X.InterfaceC73068Sm0
    public final void LJIIIZ() {
        IWF iwf = this.LJII;
        if (iwf != null) {
            iwf.LJJIL();
        }
        this.LJIJI = false;
    }

    @Override // X.InterfaceC73068Sm0
    public final void resume() {
        if (!this.LIZJ) {
            return;
        }
        IWF iwf = this.LJII;
        if (iwf != null) {
            ((Handler) this.LJIILL.getValue()).removeCallbacksAndMessages(null);
            ARunnableS44S0100000_8 aRunnableS44S0100000_8 = new ARunnableS44S0100000_8(this, 5);
            this.LJIILLIIL = aRunnableS44S0100000_8;
            ((Handler) this.LJIILL.getValue()).postDelayed(aRunnableS44S0100000_8, 1000L);
            iwf.LJJJLIIL();
            iwf.LJJJLL(this.LJIJ);
            iwf.LJJLIIIJL(this.LJFF, this.LJIJ);
        }
        SK0 sk0 = this.LIZIZ;
        if (sk0 == null) {
            return;
        }
        sk0.setVisibility(0);
    }

    @Override // X.InterfaceC73068Sm0
    public final int getNetworkSpeed() {
        return C47497IkX.LIZJ();
    }

    @Override // X.InterfaceC73068Sm0
    public final boolean isMute() {
        return this.LJIJI;
    }

    @Override // X.InterfaceC73068Sm0
    public final void retry() {
        resume();
    }

    public C46579IPv(C73062Slu c73062Slu) {
        SK0 sk0;
        this.LIZ = c73062Slu;
        this.LJ = c73062Slu;
        View findViewById = c73062Slu.findViewById(R.id.hso);
        if (findViewById != null) {
            sk0 = (SK0) findViewById.findViewById(R.id.hro);
        } else {
            sk0 = null;
        }
        this.LIZIZ = sk0;
        c73062Slu.getVideoView().setSurfaceTextureListener(new IQ0(this));
        this.LJIJ = new C46567IPj(this);
    }

    @Override // X.InterfaceC73068Sm0
    public final void LJJIIJ(float f) {
        IWF iwf = this.LJII;
        if (iwf != null) {
            iwf.LJI(f);
        }
        SK0 sk0 = this.LIZIZ;
        if (sk0 == null) {
            return;
        }
        sk0.setVisibility(0);
    }

    @Override // X.InterfaceC73068Sm0
    public final void start(int i) {
        if (this.LIZJ) {
            this.LJIIIIZZ = false;
            IWF iwf = this.LJII;
            if (iwf != null) {
                ((Handler) this.LJIILL.getValue()).removeCallbacksAndMessages(null);
                ARunnableS44S0100000_8 aRunnableS44S0100000_8 = new ARunnableS44S0100000_8(this, 5);
                this.LJIILLIIL = aRunnableS44S0100000_8;
                ((Handler) this.LJIILL.getValue()).postDelayed(aRunnableS44S0100000_8, 1000L);
                iwf.LJJJLL(this.LJIJ);
                iwf.LJJLIIIJILLIZJL(this.LJFF, i);
                iwf.LJJJLIIL();
            }
        } else {
            this.LJIIIIZZ = true;
            this.LJIIL = i;
        }
        SK0 sk0 = this.LIZIZ;
        if (sk0 == null) {
            return;
        }
        sk0.setVisibility(0);
    }
}
