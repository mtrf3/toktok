package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CountCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.IconCfg;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM", f = "CustomDotVM.kt", l = {203, 215, 230, 236, 247, 249, 252, 258, 271, 310, 317}, m = "handleNewDotData")
/* loaded from: classes10.dex */
public final class M0Z extends C3CS {
    public CustomDotVM LJLIL;
    public M18 LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public Object LJLJJL;
    public IconCfg LJLJJLL;
    public CountCfg LJLJL;
    public Object LJLJLJ;
    public boolean LJLJLLL;
    public int LJLL;
    public long LJLLI;
    public /* synthetic */ Object LJLLILLLL;
    public final /* synthetic */ CustomDotVM LJLLJ;
    public int LJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0Z(CustomDotVM customDotVM, InterfaceC67352kd<? super M0Z> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLLJ = customDotVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLLILLLL = obj;
        this.LJLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLLJ.kv0(null, false, null, null, this);
    }
}
