package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.Qge, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67640Qge implements InterfaceC67680QhI, InterfaceC67679QhH, InterfaceC67677QhF {
    public final CountDownLatch LJLIL = new CountDownLatch(1);

    @Override // X.InterfaceC67680QhI
    public final void LIZ() {
        this.LJLIL.countDown();
    }

    @Override // X.InterfaceC67679QhH
    public final void onFailure(Exception exc) {
        this.LJLIL.countDown();
    }

    @Override // X.InterfaceC67677QhF
    public final void onSuccess(Object obj) {
        this.LJLIL.countDown();
    }
}
