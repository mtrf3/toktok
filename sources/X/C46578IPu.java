package X;

import Y.ARunnableS44S0100000_8;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.List;

/* renamed from: X.IPu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46578IPu implements InterfaceC73068Sm0 {
    public final C73062Slu LIZ;
    public boolean LIZIZ;
    public SurfaceTexture LIZJ;
    public Video LJ;
    public int LJFF;
    public long LJI;
    public boolean LJIIIIZZ;
    public int LJIIJ;
    public boolean LJIIJJI;
    public ARunnableS44S0100000_8 LJIILIIL;
    public final IPQ LJIILJJIL;
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C46564IPg.LJLIL);
    public float LJIIIZ = -1.0f;
    public final C62822Ol8 LJIIL = C221108m2.LIZIZ(C46560IPc.INSTANCE);
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
            ((Handler) this.LJIIL.getValue()).removeCallbacksAndMessages(null);
            iwf.LJIILJJIL();
            iwf.LJJJZ();
        }
    }

    @Override // X.InterfaceC73068Sm0
    public final void release() {
        this.LIZIZ = false;
        SurfaceTexture surfaceTexture = this.LIZJ;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.LIZJ = null;
        IWF iwf = this.LJII;
        if (iwf != null) {
            ((Handler) this.LJIIL.getValue()).removeCallbacksAndMessages(null);
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
    }

    public final List<IPR> LIZLLL() {
        return (List) this.LIZLLL.getValue();
    }

    public final void LJ() {
        ((Handler) this.LJIIL.getValue()).removeCallbacksAndMessages(null);
        ARunnableS44S0100000_8 aRunnableS44S0100000_8 = new ARunnableS44S0100000_8(this, 76);
        this.LJIILIIL = aRunnableS44S0100000_8;
        ((Handler) this.LJIIL.getValue()).postDelayed(aRunnableS44S0100000_8, 1000L);
    }

    @Override // X.InterfaceC73068Sm0
    public final void LJIIIZ() {
        IWF iwf = this.LJII;
        if (iwf != null) {
            iwf.LJJIL();
        }
    }

    @Override // X.InterfaceC73068Sm0
    public final boolean isMute() {
        IWF iwf = this.LJII;
        if (iwf != null) {
            return iwf.isMute();
        }
        return false;
    }

    @Override // X.InterfaceC73068Sm0
    public final void resume() {
        IWF iwf;
        if (this.LIZIZ && (iwf = this.LJII) != null) {
            LJ();
            iwf.LJJJLIIL();
            iwf.LJJJLL(this.LJIILJJIL);
            iwf.LJJLIIIJL(this.LJ, this.LJIILJJIL);
        }
    }

    @Override // X.InterfaceC73068Sm0
    public final int getNetworkSpeed() {
        return C47497IkX.LIZJ();
    }

    @Override // X.InterfaceC73068Sm0
    public final void retry() {
        resume();
    }

    public C46578IPu(C73062Slu c73062Slu) {
        this.LIZ = c73062Slu;
        LIZLLL().add(c73062Slu);
        c73062Slu.getVideoView().setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC46582IPy(this));
        this.LJIILJJIL = new IPQ(this);
    }

    @Override // X.InterfaceC73068Sm0
    public final void LJJIIJ(float f) {
        IWF iwf = this.LJII;
        if (iwf != null) {
            iwf.LJI(f);
        }
    }

    @Override // X.InterfaceC73068Sm0
    public final void start(int i) {
        if (this.LIZIZ) {
            this.LJIIIIZZ = false;
            IWF iwf = this.LJII;
            if (iwf != null) {
                LJ();
                iwf.LJJJLL(this.LJIILJJIL);
                iwf.LJJLIIIJILLIZJL(this.LJ, i);
                iwf.LJJJLIIL();
                return;
            }
            return;
        }
        this.LJIIIIZZ = true;
    }
}
