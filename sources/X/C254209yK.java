package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentCollectionListAssemViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentCollectionListAssemViewModel", f = "PaidContentCollectionListAssemViewModel.kt", l = {64}, m = "requestData")
/* renamed from: X.9yK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C254209yK extends C3CS {
    public PaidContentCollectionListAssemViewModel LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ PaidContentCollectionListAssemViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C254209yK(PaidContentCollectionListAssemViewModel paidContentCollectionListAssemViewModel, InterfaceC67352kd<? super C254209yK> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = paidContentCollectionListAssemViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.iv0(0L, 0, this);
    }
}
