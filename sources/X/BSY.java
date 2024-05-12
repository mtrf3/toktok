package X;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes6.dex */
public final class BSY implements InterfaceC15710jX {
    public final /* synthetic */ C34K LJLIL;
    public final /* synthetic */ CountDownLatch LJLILLLLZI;

    @Override // X.InterfaceC15710jX
    public final void onFinish(boolean z) {
        this.LJLIL.element = z;
        this.LJLILLLLZI.countDown();
    }

    public BSY(C34K c34k, CountDownLatch countDownLatch) {
        this.LJLIL = c34k;
        this.LJLILLLLZI = countDownLatch;
    }
}
