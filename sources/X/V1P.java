package X;

import Y.IDfS26S0200000_13;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "firstOrNull")
/* loaded from: classes14.dex */
public final class V1P<T> extends C3CS {
    public C68322mC LJLIL;
    public IDfS26S0200000_13 LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public int LJLJJI;

    public V1P(InterfaceC67352kd<? super V1P> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return V1M.LJIILL(null, null, this);
    }
}
