package X;

import Y.IDfS26S0200000_13;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {144}, m = "emit")
/* renamed from: X.V1h, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79065V1h extends C3CS {
    public IDfS26S0200000_13 LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ IDfS26S0200000_13 LJLJJI;
    public Object LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79065V1h(IDfS26S0200000_13 iDfS26S0200000_13, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = iDfS26S0200000_13;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.emit(null, this);
    }
}
