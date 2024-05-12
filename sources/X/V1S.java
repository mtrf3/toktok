package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {173}, m = "single")
/* loaded from: classes14.dex */
public final class V1S<T> extends C3CS {
    public C68322mC LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public int LJLJI;

    public V1S(InterfaceC67352kd<? super V1S> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return V1M.LJJJJJL(null, this);
    }
}
