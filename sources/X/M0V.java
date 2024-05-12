package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.vm.ShopMainLynxViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.vm.ShopMainLynxViewModel", f = "ShopMainLynxViewModel.kt", l = {397}, m = "handleCartTooltip")
/* loaded from: classes10.dex */
public final class M0V extends C3CS {
    public ShopMainLynxViewModel LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ ShopMainLynxViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0V(ShopMainLynxViewModel shopMainLynxViewModel, InterfaceC67352kd<? super M0V> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = shopMainLynxViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.iv0(null, this);
    }
}
