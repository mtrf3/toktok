package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.bnpl.biz.bill.statements.StatementsViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.bill.statements.StatementsViewModel", f = "StatementsViewModel.kt", l = {66}, m = "onRefresh")
/* renamed from: X.aCw, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92574aCw extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ StatementsViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92574aCw(StatementsViewModel statementsViewModel, InterfaceC67352kd<? super C92574aCw> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = statementsViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.onRefresh(this);
    }
}
