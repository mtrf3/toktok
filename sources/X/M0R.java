package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM", f = "CustomDotVM.kt", l = {1068}, m = "waitIconHideFinish")
/* loaded from: classes10.dex */
public final class M0R extends C3CS {
    public CustomDotVM LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ CustomDotVM LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0R(CustomDotVM customDotVM, InterfaceC67352kd<? super M0R> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = customDotVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.zv0(null, this);
    }
}