package X;

import Y.IDfS21S0200000_1;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.StartedLazily$command$1$invokeSuspend$$inlined$collect$1", f = "SharingStarted.kt", l = {137}, m = "emit")
/* renamed from: X.3BK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3BK extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ IDfS21S0200000_1 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3BK(IDfS21S0200000_1 iDfS21S0200000_1, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = iDfS21S0200000_1;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.emit(null, this);
    }
}
