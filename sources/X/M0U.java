package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM", f = "CustomDotVM.kt", l = {1139}, m = "waitTooltipShowFinish")
/* loaded from: classes10.dex */
public final class M0U extends C3CS {
    public CustomDotVM LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ CustomDotVM LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0U(CustomDotVM customDotVM, InterfaceC67352kd<? super M0U> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = customDotVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.Cv0(null, this);
    }
}