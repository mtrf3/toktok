package X;

import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Iwv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48265Iwv {
    public volatile boolean LIZ;
    public volatile int LIZIZ;
    public final Handler LIZJ;
    public final ConcurrentHashMap<C79445VFx, C48264Iwu> LIZLLL = new ConcurrentHashMap<>();
    public final int LJ;

    public C48265Iwv(int i, Handler handler) {
        this.LJ = -1;
        this.LIZJ = handler;
        this.LJ = i;
    }

    public final void LIZ(C79445VFx c79445VFx, C48264Iwu c48264Iwu) {
        if (c79445VFx != null) {
            int texType = c79445VFx.texType();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("increase, VideoSurfaceTexture ");
            LIZ.append(c79445VFx);
            C48284IxE.LIZ(2, texType, "RenderCheckDispatcher", X1D.LIZIZ(LIZ));
            this.LIZLLL.put(c79445VFx, c48264Iwu);
            if (this.LIZIZ == 0) {
                C48284IxE.LIZ(2, this.LJ, "RenderCheckDispatcher", "doStart");
                Handler handler = this.LIZJ;
                if (handler != null) {
                    handler.sendEmptyMessage(38);
                }
            }
            this.LIZIZ++;
        }
    }
}
