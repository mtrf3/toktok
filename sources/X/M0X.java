package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM", f = "CustomDotVM.kt", l = {747}, m = "cancelLastTooltipShowProcess")
/* loaded from: classes10.dex */
public final class M0X extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ CustomDotVM LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0X(CustomDotVM customDotVM, InterfaceC67352kd<? super M0X> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = customDotVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.jv0(null, this);
    }
}
