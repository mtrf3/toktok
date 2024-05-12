package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {386, 398, 403}, m = "collect")
/* loaded from: classes16.dex */
public final class XLO extends C3CS {
    public XLM LJLIL;
    public InterfaceC64672gJ LJLILLLLZI;
    public XLR LJLJI;
    public InterfaceC79150V4o LJLJJI;
    public Object LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ XLM<T> LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XLO(XLM<T> xlm, InterfaceC67352kd<? super XLO> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = xlm;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.collect(null, this);
    }
}
