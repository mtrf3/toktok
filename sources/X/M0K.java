package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CountCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotResponse;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM", f = "CustomDotVM.kt", l = {339, 357, 368, 370, 376, 404, 430, 447, 459, 474, 481, 494, 496, 499, 507, 521, 573, 580}, m = "handleNewDotData")
/* loaded from: classes10.dex */
public final class M0K extends C3CS {
    public CustomDotVM LJLIL;
    public CustomDotResponse LJLILLLLZI;
    public C36268ELg LJLJI;
    public Object LJLJJI;
    public Object LJLJJL;
    public Object LJLJJLL;
    public Object LJLJL;
    public Object LJLJLJ;
    public Object LJLJLLL;
    public Object LJLL;
    public Object LJLLI;
    public Object LJLLILLLL;
    public CountCfg LJLLJ;
    public Object LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public long LJZ;
    public /* synthetic */ Object LJZI;
    public final /* synthetic */ CustomDotVM LJZL;
    public int LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0K(CustomDotVM customDotVM, InterfaceC67352kd<? super M0K> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJZL = customDotVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJZI = obj;
        this.LL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJZL.nv0(null, false, null, null, this);
    }
}
