package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.BillboardGlobalViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.BillboardGlobalViewModel", f = "BillboardGlobalViewModel.kt", l = {132}, m = "updateEffectAutoDisplayStatus")
/* renamed from: X.S6j, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71553S6j extends C3CS {
    public InterfaceC07990Tb LJLIL;
    public LiveEffect LJLILLLLZI;
    public RootData LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ BillboardGlobalViewModel LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71553S6j(BillboardGlobalViewModel billboardGlobalViewModel, InterfaceC67352kd<? super C71553S6j> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = billboardGlobalViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.iv0(false, this);
    }
}
