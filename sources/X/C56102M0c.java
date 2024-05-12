package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM", f = "CustomDotVM.kt", l = {595}, m = "waitIconHideFinish")
/* renamed from: X.M0c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56102M0c extends C3CS {
    public CustomDotVM LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ CustomDotVM LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56102M0c(CustomDotVM customDotVM, InterfaceC67352kd<? super C56102M0c> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = customDotVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.mv0(null, this);
    }
}
