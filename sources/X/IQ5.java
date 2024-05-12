package X;

import android.graphics.SurfaceTexture;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IQ5 implements InterfaceC73068Sm0 {
    public final C27605AsT LIZ;
    public final C73062Slu LIZIZ;
    public final IWF LIZJ;
    public Video LIZLLL;
    public SurfaceTexture LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public String LJIIIIZZ;
    public final IGW LJIIIZ;
    public final C27611AsZ LJIIJ;

    @Override // X.InterfaceC73068Sm0
    public final void LIZ() {
    }

    @Override // X.InterfaceC73068Sm0
    public final void LIZJ() {
    }

    @Override // X.InterfaceC73068Sm0
    public final int getNetworkSpeed() {
        return 0;
    }

    @Override // X.InterfaceC73068Sm0
    public final void retry() {
        start(0);
    }

    @Override // X.InterfaceC73068Sm0
    public final void stop() {
    }

    @Override // X.InterfaceC73068Sm0
    public final void LIZIZ() {
        this.LIZJ.LJIJJ();
    }

    @Override // X.InterfaceC73068Sm0
    public final void LJIIIZ() {
        this.LIZJ.LJJIL();
    }

    @Override // X.InterfaceC73068Sm0
    public final boolean isMute() {
        return this.LIZJ.isMute();
    }

    @Override // X.InterfaceC73068Sm0
    public final void pause() {
        this.LIZJ.LJIILJJIL();
    }

    @Override // X.InterfaceC73068Sm0
    public final void release() {
        IWF iwf = this.LIZJ;
        iwf.LLLLLL();
        iwf.LJJJLL(null);
        iwf.LJJIIZ();
        iwf.release();
    }

    @Override // X.InterfaceC73068Sm0
    public final void resume() {
        if (!this.LJFF) {
            return;
        }
        IWF iwf = this.LIZJ;
        iwf.LJJJLIIL();
        iwf.LJJJLL(this.LJIIIZ);
        iwf.LJJLIIIJLLLLLLLZ(this.LIZLLL, false, this.LJIIIZ, 0);
    }

    @Override // X.InterfaceC73068Sm0
    public final void LJJIIJ(float f) {
        this.LIZJ.LJI(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0 A[Catch: Exception -> 0x0103, TryCatch #0 {Exception -> 0x0103, blocks: (B:37:0x0095, B:39:0x00a0, B:40:0x00a5, B:42:0x00ab, B:44:0x00b3, B:46:0x00fa, B:47:0x00fd, B:49:0x00fe), top: B:36:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012e  */
    @Override // X.InterfaceC73068Sm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start(int r25) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IQ5.start(int):void");
    }

    public IQ5(C27605AsT viewHolder, C73062Slu c73062Slu, IWF iwf) {
        o.LJIIIZ(viewHolder, "viewHolder");
        this.LIZ = viewHolder;
        this.LIZIZ = c73062Slu;
        this.LIZJ = iwf;
        this.LJIIIIZZ = "";
        c73062Slu.getVideoView().setSurfaceTextureListener(new IQ2(this));
        this.LJIIIZ = new IGW(this);
        this.LJIIJ = new C27611AsZ(this);
    }
}
