package X;

import android.graphics.Bitmap;

/* renamed from: X.SwE, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73702SwE implements InterfaceC73740Swq<Object> {
    public final /* synthetic */ C73701SwD LJLIL;

    @Override // X.InterfaceC73740Swq
    public final void onComplete() {
    }

    @Override // X.InterfaceC73740Swq
    public final void onError(Throwable th) {
    }

    public C73702SwE(C73701SwD c73701SwD) {
        this.LJLIL = c73701SwD;
    }

    @Override // X.InterfaceC73740Swq
    public final void onNext(Object obj) {
        if (obj instanceof Bitmap) {
            this.LJLIL.LIZIZ.setImageBitmap((Bitmap) obj);
        }
    }

    @Override // X.InterfaceC73740Swq
    public final void onSubscribe(InterfaceC73651SvP interfaceC73651SvP) {
        if (interfaceC73651SvP != null) {
            interfaceC73651SvP.request(Long.MAX_VALUE);
        }
        this.LJLIL.LJIIJ = interfaceC73651SvP;
    }
}
