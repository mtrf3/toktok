package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentDetailVideoListViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentDetailVideoListViewModel", f = "PaidContentDetailVideoListViewModel.kt", l = {265}, m = "requestData")
/* renamed from: X.A3v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25623A3v extends C3CS {
    public PaidContentDetailVideoListViewModel LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ PaidContentDetailVideoListViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25623A3v(PaidContentDetailVideoListViewModel paidContentDetailVideoListViewModel, InterfaceC67352kd<? super C25623A3v> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = paidContentDetailVideoListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.jv0(0, this);
    }
}
