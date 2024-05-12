package X;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes6.dex */
public final class CXZ implements InterfaceC15710jX {
    public final /* synthetic */ CountDownLatch LJLIL;

    public CXZ(CountDownLatch countDownLatch) {
        this.LJLIL = countDownLatch;
    }

    @Override // X.InterfaceC15710jX
    public final void onFinish(boolean z) {
        this.LJLIL.countDown();
    }
}
