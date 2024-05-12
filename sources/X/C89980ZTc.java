package X;

import android.graphics.SurfaceTexture;

/* renamed from: X.ZTc, reason: case insensitive filesystem */
/* loaded from: classes19.dex */
public class C89980ZTc implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ C89982ZTe LJLIL;

    public C89980ZTc(C89982ZTe c89982ZTe) {
        this.LJLIL = c89982ZTe;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.LJLIL.LJIILIIL) {
            C89982ZTe c89982ZTe = this.LJLIL;
            c89982ZTe.LJIILJJIL = true;
            c89982ZTe.LJIILIIL.notify();
        }
    }
}
