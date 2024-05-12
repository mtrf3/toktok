package X;

import Y.ARunnableS44S0100000_8;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class KRJ implements InterfaceC73054Slm {
    public final C73051Slj LIZ;
    public boolean LIZIZ;
    public SurfaceTexture LIZJ;
    public Video LIZLLL;
    public IWF LJ;
    public boolean LJFF;
    public float LJI = -1.0f;
    public int LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public boolean LJIIJ;
    public final List<KRL> LJIIJJI;
    public final C62822Ol8 LJIIL;
    public ARunnableS44S0100000_8 LJIILIIL;
    public final KRI LJIILJJIL;
    public boolean LJIILL;

    @Override // X.InterfaceC73054Slm
    public final void pause() {
        this.LJIIIIZZ = false;
        this.LJI = -1.0f;
        IWF iwf = this.LJ;
        if (iwf != null) {
            ((Handler) this.LJIIL.getValue()).removeCallbacksAndMessages(null);
            iwf.LJIILJJIL();
            iwf.LJJJZ();
        }
    }

    @Override // X.InterfaceC73054Slm
    public final void release() {
        this.LIZIZ = false;
        SurfaceTexture surfaceTexture = this.LIZJ;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.LIZJ = null;
        IWF iwf = this.LJ;
        if (iwf != null) {
            ((Handler) this.LJIIL.getValue()).removeCallbacksAndMessages(null);
            iwf.LLLLLL();
            iwf.LJJJLL(null);
            iwf.LJJIIZ();
            iwf.release();
        }
        this.LJ = null;
    }

    @Override // X.InterfaceC73054Slm
    public final void stop() {
    }

    @Override // X.InterfaceC73054Slm
    public final void LIZIZ() {
        IWF iwf = this.LJ;
        if (iwf != null) {
            iwf.LJIJJ();
        }
        this.LJIILL = true;
    }

    @Override // X.InterfaceC73054Slm
    public final void LJIIIZ() {
        IWF iwf = this.LJ;
        if (iwf != null) {
            iwf.LJJIL();
        }
        this.LJIILL = false;
    }

    @Override // X.InterfaceC73054Slm
    public final void resume() {
        IWF iwf;
        if (this.LIZIZ && (iwf = this.LJ) != null) {
            ((Handler) this.LJIIL.getValue()).removeCallbacksAndMessages(null);
            ARunnableS44S0100000_8 aRunnableS44S0100000_8 = new ARunnableS44S0100000_8(this, 112);
            this.LJIILIIL = aRunnableS44S0100000_8;
            ((Handler) this.LJIIL.getValue()).postDelayed(aRunnableS44S0100000_8, 1000L);
            iwf.LJJJLIIL();
            iwf.LJJJLL(this.LJIILJJIL);
            iwf.LJJLIIIJL(this.LIZLLL, this.LJIILJJIL);
        }
    }

    @Override // X.InterfaceC73054Slm
    public final int getNetworkSpeed() {
        return C47497IkX.LIZJ();
    }

    @Override // X.InterfaceC73054Slm
    public final boolean isMute() {
        return this.LJIILL;
    }

    @Override // X.InterfaceC73054Slm
    public final void retry() {
        resume();
    }

    public KRJ(C73051Slj c73051Slj) {
        this.LIZ = c73051Slj;
        ArrayList arrayList = new ArrayList();
        this.LJIIJJI = arrayList;
        this.LJIIL = C221108m2.LIZIZ(KRM.INSTANCE);
        this.LJ = new IWF();
        arrayList.add(c73051Slj);
        c73051Slj.getVideoView().setSurfaceTextureListener(new KRK(this));
        this.LJIILJJIL = new KRI(this);
    }

    @Override // X.InterfaceC73054Slm
    public final void LJJIIJ(float f) {
        IWF iwf = this.LJ;
        if (iwf != null) {
            iwf.LJI(f);
        }
    }

    @Override // X.InterfaceC73054Slm
    public final void start(int i) {
        if (this.LIZIZ) {
            this.LJFF = false;
            IWF iwf = this.LJ;
            if (iwf != null) {
                ((Handler) this.LJIIL.getValue()).removeCallbacksAndMessages(null);
                ARunnableS44S0100000_8 aRunnableS44S0100000_8 = new ARunnableS44S0100000_8(this, 112);
                this.LJIILIIL = aRunnableS44S0100000_8;
                ((Handler) this.LJIIL.getValue()).postDelayed(aRunnableS44S0100000_8, 1000L);
                iwf.LJJJLL(this.LJIILJJIL);
                iwf.LJJLIIIJILLIZJL(this.LIZLLL, i);
                iwf.LJJJLIIL();
                return;
            }
            return;
        }
        this.LJFF = true;
        this.LJIIIZ = i;
    }

    @Override // X.InterfaceC73054Slm
    public final void LJIIIIZZ(float f, int i) {
        Iterator<KRL> it = this.LJIIJJI.iterator();
        while (it.hasNext()) {
            it.next().LJIIIIZZ(f, i);
        }
    }
}
