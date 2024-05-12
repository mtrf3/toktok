package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM", f = "CustomDotVM.kt", l = {507}, m = "waitInboxPopupHide")
/* renamed from: X.M0b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56101M0b extends C3CS {
    public CustomDotVM LJLIL;
    public M18 LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ CustomDotVM LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56101M0b(CustomDotVM customDotVM, InterfaceC67352kd<? super C56101M0b> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = customDotVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.ov0(null, this);
    }
}
