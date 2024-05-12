package X;

import Y.ARunnableS44S0100000_8;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.IPw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46580IPw implements InterfaceC73068Sm0 {
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
    public long LJIILJJIL;
    public final IPV LJIILLIIL;
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C46565IPh.LJLIL);
    public float LJIIIZ = -1.0f;
    public final C62822Ol8 LJIIL = C221108m2.LIZIZ(C46561IPd.INSTANCE);
    public final C62822Ol8 LJIILL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 517));
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
            this.LJIILJJIL = 0L;
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

    public final Fragment LJ() {
        return (Fragment) this.LJIILL.getValue();
    }

    public final List<IPR> LJFF() {
        return (List) this.LIZLLL.getValue();
    }

    public final void LJI() {
        ((Handler) this.LJIIL.getValue()).removeCallbacksAndMessages(null);
        ARunnableS44S0100000_8 aRunnableS44S0100000_8 = new ARunnableS44S0100000_8(this, 91);
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
            LJI();
            iwf.LJJJLIIL();
            iwf.LJJJLL(this.LJIILLIIL);
            iwf.LJJLIIIJL(this.LJ, this.LJIILLIIL);
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

    public C46580IPw(C73062Slu c73062Slu) {
        this.LIZ = c73062Slu;
        LIZLLL(c73062Slu);
        c73062Slu.getVideoView().setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC46583IPz(this));
        this.LJIILLIIL = new IPV(this);
    }

    public final void LIZLLL(IPR uiPlayListener) {
        o.LJIIIZ(uiPlayListener, "uiPlayListener");
        if (!LJFF().contains(uiPlayListener)) {
            LJFF().add(uiPlayListener);
        }
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
                LJI();
                iwf.LJJJLL(this.LJIILLIIL);
                iwf.LJJLIIIJILLIZJL(this.LJ, i);
                iwf.LJJJLIIL();
                return;
            }
            return;
        }
        this.LJIIIIZZ = true;
    }
}
