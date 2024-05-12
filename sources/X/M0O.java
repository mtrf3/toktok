package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionData;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionTargetResCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.vm.ShopMainLynxViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.vm.ShopMainLynxViewModel", f = "ShopMainLynxViewModel.kt", l = {447}, m = "getCartTooltipData")
/* loaded from: classes10.dex */
public final class M0O extends C3CS {
    public ShopMainLynxViewModel LJLIL;
    public DiversionData LJLILLLLZI;
    public DiversionTargetResCfg LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ ShopMainLynxViewModel LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0O(ShopMainLynxViewModel shopMainLynxViewModel, InterfaceC67352kd<? super M0O> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = shopMainLynxViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.gv0(null, null, this);
    }
}
