package X;

import Y.ARunnableS44S0100000_8;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.IPx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46581IPx implements InterfaceC75370Ti2 {
    public final TextureView LIZ;
    public boolean LIZIZ;
    public SurfaceTexture LIZJ;
    public Surface LIZLLL;
    public final C62822Ol8 LJ;
    public Video LJFF;
    public IWF LJI;
    public boolean LJII;
    public float LJIIIIZZ;
    public int LJIIIZ;
    public boolean LJIIJ;
    public final C62822Ol8 LJIIJJI;
    public ARunnableS44S0100000_8 LJIIL;
    public final IPT LJIILIIL;

    @Override // X.InterfaceC75370Ti2
    public final void pause() {
        this.LJIIJ = false;
        this.LJIIIIZZ = -1.0f;
        this.LJII = false;
        IWF iwf = this.LJI;
        if (iwf != null) {
            ((Handler) this.LJIIJJI.getValue()).removeCallbacksAndMessages(null);
            iwf.LJIILJJIL();
            iwf.LJJJZ();
        }
    }

    @Override // X.InterfaceC75370Ti2
    public final void release() {
        this.LIZIZ = false;
        Surface surface = this.LIZLLL;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture = this.LIZJ;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.LIZJ = null;
        this.LIZLLL = null;
        LIZ().clear();
        this.LIZ.setSurfaceTextureListener(null);
        IWF iwf = this.LJI;
        if (iwf != null) {
            ((Handler) this.LJIIJJI.getValue()).removeCallbacksAndMessages(null);
            iwf.LLLLLL();
            iwf.LJJJLL(null);
            iwf.LJJIIZ();
            iwf.release();
        }
        this.LJI = null;
    }

    public final List<IPR> LIZ() {
        return (List) this.LJ.getValue();
    }

    @Override // X.InterfaceC75370Ti2
    public final void start() {
        if (this.LIZIZ) {
            this.LJII = false;
            IWF iwf = this.LJI;
            if (iwf != null) {
                ((Handler) this.LJIIJJI.getValue()).removeCallbacksAndMessages(null);
                ARunnableS44S0100000_8 aRunnableS44S0100000_8 = new ARunnableS44S0100000_8(this, 12);
                this.LJIIL = aRunnableS44S0100000_8;
                ((Handler) this.LJIIJJI.getValue()).postDelayed(aRunnableS44S0100000_8, 1000L);
                iwf.LJJJLL(this.LJIILIIL);
                iwf.LJJJJI(this.LJFF, true);
                iwf.LJJJLIIL();
                Surface surface = this.LIZLLL;
                if (surface != null) {
                    iwf.setSurface(surface);
                    return;
                }
                return;
            }
            return;
        }
        this.LJII = true;
    }

    public C46581IPx(TextureView videoView) {
        o.LJIIIZ(videoView, "videoView");
        this.LIZ = videoView;
        this.LJ = C221108m2.LIZIZ(C46563IPf.LJLIL);
        this.LJIIIIZZ = -1.0f;
        this.LJIIJJI = C221108m2.LIZIZ(C46559IPb.INSTANCE);
        this.LJI = new IWF();
        videoView.setSurfaceTextureListener(new IQ1(this));
        this.LJIILIIL = new IPT(this);
    }

    @Override // X.InterfaceC75370Ti2
    public final void LJJIIJ(float f) {
        IWF iwf = this.LJI;
        if (iwf != null) {
            iwf.LJI(f);
        }
    }
}
