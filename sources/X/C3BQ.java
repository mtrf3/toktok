package X;

import Y.IDfS12S0300000_1;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$lambda-4$$inlined$collect$1", f = "Limit.kt", l = {136, 137, 139}, m = "emit")
/* renamed from: X.3BQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3BQ extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ IDfS12S0300000_1 LJLJI;
    public IDfS12S0300000_1 LJLJJI;
    public Object LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3BQ(IDfS12S0300000_1 iDfS12S0300000_1, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = iDfS12S0300000_1;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.emit(null, this);
    }
}
