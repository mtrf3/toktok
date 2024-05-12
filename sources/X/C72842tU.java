package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.shopbag.ShopBagPreview", f = "ShopBagPreview.kt", l = {66, 81}, m = "fetchShoppingBagPreview")
/* renamed from: X.2tU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72842tU extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C72852tV LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72842tU(C72852tV c72852tV, InterfaceC67352kd<? super C72842tU> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c72852tV;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZ(null, null, false, false, false, this);
    }
}
