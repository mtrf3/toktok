package X;

import Y.IDeS152S0200000_13;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", l = {117, 119}, m = "collect")
/* loaded from: classes14.dex */
public final class UW3 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ IDeS152S0200000_13 LJLJI;
    public IDeS152S0200000_13 LJLJJI;
    public InterfaceC64672gJ LJLJJL;
    public Object LJLJJLL;
    public long LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UW3(IDeS152S0200000_13 iDeS152S0200000_13, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = iDeS152S0200000_13;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.collect(null, this);
    }
}
