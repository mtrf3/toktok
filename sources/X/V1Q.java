package X;

import Y.IDfS126S0100000_1;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "first")
/* loaded from: classes14.dex */
public final class V1Q<T> extends C3CS {
    public C68322mC LJLIL;
    public IDfS126S0100000_1 LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public int LJLJJI;

    public V1Q(InterfaceC67352kd<? super V1Q> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return V1M.LJIILIIL(null, this);
    }
}
