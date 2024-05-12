package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.common.shopbag.ShopBagHelper", f = "ShopBagHelper.kt", l = {32}, m = "checkABSettingForAnchorOrModerator")
/* renamed from: X.Ru5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71021Ru5 extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public int LJLJI;

    public C71021Ru5(InterfaceC67352kd<? super C71021Ru5> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C71020Ru4.LIZ(null, null, this);
    }
}
