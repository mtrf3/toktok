package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.BSf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28805BSf implements InterfaceC15710jX {
    public final /* synthetic */ C34K LJLIL;
    public final /* synthetic */ CountDownLatch LJLILLLLZI;

    @Override // X.InterfaceC15710jX
    public final void onFinish(boolean z) {
        this.LJLIL.element = z;
        this.LJLILLLLZI.countDown();
    }

    public C28805BSf(C34K c34k, CountDownLatch countDownLatch) {
        this.LJLIL = c34k;
        this.LJLILLLLZI = countDownLatch;
    }
}
