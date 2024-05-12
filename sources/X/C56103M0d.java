package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM", f = "CustomDotVM.kt", l = {564}, m = "waitIconShowFinish")
/* renamed from: X.M0d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56103M0d extends C3CS {
    public CustomDotVM LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ CustomDotVM LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56103M0d(CustomDotVM customDotVM, InterfaceC67352kd<? super C56103M0d> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = customDotVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.nv0(null, this);
    }
}
