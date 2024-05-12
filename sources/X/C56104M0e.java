package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM", f = "CustomDotVM.kt", l = {357}, m = "cancelLastIconShowProcess")
/* renamed from: X.M0e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56104M0e extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ CustomDotVM LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56104M0e(CustomDotVM customDotVM, InterfaceC67352kd<? super C56104M0e> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = customDotVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.hv0(null, null, this);
    }
}
