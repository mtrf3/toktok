package X;

import android.os.Handler;

/* renamed from: X.Iwu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48264Iwu {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public volatile boolean LIZLLL;
    public volatile boolean LJ;
    public final C79445VFx LJFF;
    public C48265Iwv LJI;
    public InterfaceC47887Iqp LJII;
    public boolean LJIIIIZZ;

    public final void LIZ() {
        C79445VFx c79445VFx;
        C79445VFx c79445VFx2 = this.LJFF;
        if (c79445VFx2 != null) {
            int texType = c79445VFx2.texType();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stop, isStarted: ");
            LIZ.append(this.LJIIIIZZ);
            C48284IxE.LIZ(2, texType, "FrameRenderChecker", X1D.LIZIZ(LIZ));
        }
        if (!this.LJIIIIZZ) {
            return;
        }
        this.LJIIIIZZ = false;
        this.LJ = false;
        this.LIZLLL = false;
        this.LIZIZ = 0L;
        this.LIZ = 0L;
        C48265Iwv c48265Iwv = this.LJI;
        if (c48265Iwv != null && (c79445VFx = this.LJFF) != null) {
            int texType2 = c79445VFx.texType();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("decrease, VideoSurfaceTexture ");
            LIZ2.append(c79445VFx);
            C48284IxE.LIZ(2, texType2, "RenderCheckDispatcher", X1D.LIZIZ(LIZ2));
            c48265Iwv.LIZLLL.remove(c79445VFx);
            if (c48265Iwv.LIZIZ <= 0) {
                return;
            }
            c48265Iwv.LIZIZ--;
            if (c48265Iwv.LIZIZ != 0) {
                return;
            }
            C48284IxE.LIZ(2, c48265Iwv.LJ, "RenderCheckDispatcher", "doStop");
            Handler handler = c48265Iwv.LIZJ;
            if (handler == null) {
                return;
            }
            handler.sendEmptyMessage(39);
        }
    }

    public C48264Iwu(C48265Iwv c48265Iwv, C79445VFx c79445VFx) {
        this.LJI = c48265Iwv;
        this.LJFF = c79445VFx;
    }
}
