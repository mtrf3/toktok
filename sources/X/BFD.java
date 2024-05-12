package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.usermanage.model.AdminUser", f = "AdminUser.kt", l = {37}, m = "checkAdminECommercePermission")
/* loaded from: classes6.dex */
public final class BFD extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ BFC LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BFD(BFC bfc, InterfaceC67352kd<? super BFD> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = bfc;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(null, this);
    }
}
