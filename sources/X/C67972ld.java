package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.SellerMessageAPI$Companion", f = "SellerMessageAPI.kt", l = {41}, m = "fetchUserConversations")
/* renamed from: X.2ld, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67972ld extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C67962lc LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67972ld(C67962lc c67962lc, InterfaceC67352kd<? super C67972ld> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c67962lc;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(null, this);
    }
}
