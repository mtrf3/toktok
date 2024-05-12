package X;

import android.os.Bundle;

/* loaded from: classes6.dex */
public final class CKL<T> implements InterfaceC64592gB {
    public final /* synthetic */ CKJ LJLIL;

    public CKL(CKJ ckj) {
        this.LJLIL = ckj;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        CKJ ckj = this.LJLIL;
        InterfaceC21020s6 interfaceC21020s6 = ckj.LJII;
        if (interfaceC21020s6 != null) {
            C0NB.LIZIZ("CaptureImageUploadController", "capture start");
            Bundle bundle = new Bundle();
            long currentTimeMillis = System.currentTimeMillis();
            bundle.putInt("mode", 1);
            bundle.putBoolean("outputPixelBufferOrigin", true);
            bundle.putBoolean("outputPixelBufferWithEffect", false);
            bundle.putInt("frameCount", 1);
            bundle.putBoolean("keepVideoCatcherAlive", true);
            interfaceC21020s6.LJIILIIL(bundle, new CKK(ckj, currentTimeMillis));
        }
    }
}
