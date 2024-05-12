package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Rxg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71244Rxg implements InterfaceC29176Bci {
    public final /* synthetic */ C71226RxO LJLIL;

    public C71244Rxg(C71226RxO c71226RxO) {
        this.LJLIL = c71226RxO;
    }

    @Override // X.InterfaceC29176Bci
    public final void onStartLive() {
        ((AtomicBoolean) this.LJLIL.LJLJLLL.getValue()).compareAndSet(true, false);
    }
}
