package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.SellerMessageListViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.SellerMessageListViewModel", f = "SellerMessageListViewModel.kt", l = {53}, m = "onRefresh")
/* renamed from: X.3dL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88313dL extends C3CS {
    public SellerMessageListViewModel LJLIL;
    public C67982le LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ SellerMessageListViewModel LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C88313dL(SellerMessageListViewModel sellerMessageListViewModel, InterfaceC67352kd<? super C88313dL> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = sellerMessageListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.onRefresh(this);
    }
}
