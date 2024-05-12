package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {212}, m = "collect")
/* loaded from: classes14.dex */
public final class UX0 extends C3CS {
    public C77427Ua7 LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ UX1<T> LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UX0(UX1<T> ux1, InterfaceC67352kd<? super UX0> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = ux1;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.collect(null, this);
    }
}
