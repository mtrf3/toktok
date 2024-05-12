package X;

import Y.ARunnableS44S0100000_8;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IQ9 implements InterfaceC73068Sm0 {
    public SurfaceTexture LIZ;
    public Video LIZJ;
    public int LIZLLL;
    public long LJ;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public ARunnableS44S0100000_8 LJIIJJI;
    public long LJIIL;
    public Fragment LJIILIIL;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(IQA.LJLIL);
    public float LJI = -1.0f;
    public float LJII = -1.0f;
    public final C62822Ol8 LJIIJ = C221108m2.LIZIZ(C46562IPe.INSTANCE);
    public IPW LJIILL = IPW.PLAYER_IDLE;
    public IWF LJFF = new IWF();
    public boolean LJIILJJIL = C44385HbR.LIZIZ;
    public final IPU LJIILLIIL = new IPU(this);

    @Override // X.InterfaceC73068Sm0
    public final void LIZ() {
    }

    @Override // X.InterfaceC73068Sm0
    public final void LIZJ() {
    }

    @Override // X.InterfaceC73068Sm0
    public final void pause() {
        this.LJIIIZ = false;
        this.LJI = -1.0f;
        IWF iwf = this.LJFF;
        if (iwf != null) {
            ((Handler) this.LJIIJ.getValue()).removeCallbacksAndMessages(null);
            iwf.LJIILJJIL();
            iwf.LJJJZ();
        }
    }

    @Override // X.InterfaceC73068Sm0
    public final void stop() {
    }

    @Override // X.InterfaceC73068Sm0
    public final void LIZIZ() {
        IWF iwf = this.LJFF;
        if (iwf != null) {
            iwf.LJIJJ();
        }
        Iterator<IQB> it = LJ().iterator();
        while (it.hasNext()) {
            it.next().LIZLLL(true);
        }
    }

    public final java.util.Set<IQB> LJ() {
        return (java.util.Set) this.LIZIZ.getValue();
    }

    public final boolean LJFF() {
        IWF iwf = this.LJFF;
        if (iwf != null) {
            return iwf.isPlaying();
        }
        return false;
    }

    public final void LJII() {
        ((Handler) this.LJIIJ.getValue()).removeCallbacksAndMessages(null);
        ARunnableS44S0100000_8 aRunnableS44S0100000_8 = new ARunnableS44S0100000_8(this, 157);
        this.LJIIJJI = aRunnableS44S0100000_8;
        ((Handler) this.LJIIJ.getValue()).postDelayed(aRunnableS44S0100000_8, 1000L);
    }

    @Override // X.InterfaceC73068Sm0
    public final void LJIIIZ() {
        IWF iwf = this.LJFF;
        if (iwf != null) {
            iwf.LJJIL();
        }
        Iterator<IQB> it = LJ().iterator();
        while (it.hasNext()) {
            it.next().LIZLLL(false);
        }
    }

    @Override // X.InterfaceC73068Sm0
    public final boolean isMute() {
        IWF iwf = this.LJFF;
        if (iwf != null) {
            return iwf.isMute();
        }
        return false;
    }

    @Override // X.InterfaceC73068Sm0
    public final void release() {
        IWF iwf = this.LJFF;
        if (iwf != null) {
            this.LJIIL = 0L;
            ((Handler) this.LJIIJ.getValue()).removeCallbacksAndMessages(null);
            iwf.LLLLLL();
            iwf.LJJJLL(null);
            iwf.LJJIIZ();
            iwf.release();
        }
        this.LJFF = null;
    }

    @Override // X.InterfaceC73068Sm0
    public final void resume() {
        IWF iwf;
        if (this.LIZ != null && (iwf = this.LJFF) != null) {
            LJII();
            iwf.LJJJLIIL();
            iwf.LJJJLL(this.LJIILLIIL);
            iwf.LJJLIIIJL(this.LIZJ, this.LJIILLIIL);
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

    public static final boolean LJIIIIZZ(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null && Build.VERSION.SDK_INT >= 26) {
            return surfaceTexture.isReleased();
        }
        return false;
    }

    public final void LIZLLL(IQB uiPlayListener) {
        o.LJIIIZ(uiPlayListener, "uiPlayListener");
        if (!LJ().contains(uiPlayListener)) {
            LJ().add(uiPlayListener);
        }
    }

    public final void LJI(Surface surface) {
        IWF iwf = this.LJFF;
        if (iwf != null) {
            iwf.LIZ.LJII(surface, true);
        }
        if (this.LJIILJJIL) {
            if (this.LIZ != null) {
                this.LJIILJJIL = false;
                IWF iwf2 = this.LJFF;
                if (iwf2 != null) {
                    LJII();
                    iwf2.LJJJLL(this.LJIILLIIL);
                    iwf2.LJJJJI(this.LIZJ, true);
                    iwf2.LJJJLIIL();
                }
            }
            this.LJIILJJIL = false;
        }
    }

    @Override // X.InterfaceC73068Sm0
    public final void LJJIIJ(float f) {
        IWF iwf = this.LJFF;
        if (iwf != null) {
            iwf.LJI(f);
        }
        this.LJII = f;
    }

    @Override // X.InterfaceC73068Sm0
    public final void start(int i) {
        if (this.LIZ == null) {
            return;
        }
        this.LJIILJJIL = false;
        IWF iwf = this.LJFF;
        if (iwf != null) {
            LJII();
            iwf.LJJJLL(this.LJIILLIIL);
            iwf.LJJLIIIJILLIZJL(this.LIZJ, i);
            if (iwf.isMute()) {
                iwf.LJIJJ();
            }
            iwf.LJJJLIIL();
        }
    }
}
