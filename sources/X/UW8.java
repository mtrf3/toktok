package X;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes14.dex */
public final class UW8 extends MB6 implements CoroutineExceptionHandler {
    public final /* synthetic */ UWM LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns LJLJI;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(MBA mba, Throwable th) {
        UWM uwm = this.LJLIL;
        int i = this.LJLILLLLZI;
        C77286UUw c77286UUw = uwm.LIZIZ;
        InterfaceC88472Yns interfaceC88472Yns = this.LJLJI;
        C0NB.LJ("GiftListManager", th.getMessage());
        if (th instanceof CancellationException) {
            return;
        }
        XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new UWD(th, c77286UUw, i, uwm, interfaceC88472Yns, null), 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UW8(AnonymousClass315 anonymousClass315, UWM uwm, int i, UWC uwc) {
        super(anonymousClass315);
        this.LJLIL = uwm;
        this.LJLILLLLZI = i;
        this.LJLJI = uwc;
    }
}
