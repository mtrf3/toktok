package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {341, 348, 351}, m = "collect")
/* loaded from: classes16.dex */
public final class XLP extends C3CS {
    public XLL LJLIL;
    public InterfaceC64672gJ LJLILLLLZI;
    public XLS LJLJI;
    public InterfaceC79150V4o LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ XLL<T> LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XLP(XLL<T> xll, InterfaceC67352kd<? super XLP> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = xll;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.collect(null, this);
    }
}
