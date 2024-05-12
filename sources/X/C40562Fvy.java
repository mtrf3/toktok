package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.Fvy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40562Fvy implements InterfaceC40563Fvz, InterfaceC40570Fw6 {
    public final CountDownLatch LJLIL = new CountDownLatch(1);

    @Override // X.InterfaceC40570Fw6
    public final void onFailure(Exception exc) {
        this.LJLIL.countDown();
    }

    @Override // X.InterfaceC40563Fvz
    public final void onSuccess(Object obj) {
        this.LJLIL.countDown();
    }
}
