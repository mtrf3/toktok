package X;

import Y.IDfS26S0200000_13;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "first")
/* loaded from: classes14.dex */
public final class V1O<T> extends C3CS {
    public InterfaceC88471Ynr LJLIL;
    public C68322mC LJLILLLLZI;
    public IDfS26S0200000_13 LJLJI;
    public /* synthetic */ Object LJLJJI;
    public int LJLJJL;

    public V1O(InterfaceC67352kd<? super V1O> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return V1M.LJIILJJIL(null, null, this);
    }
}
