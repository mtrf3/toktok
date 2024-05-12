package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.repository.OrderSubmitRepository", f = "OrderSubmitRepository.kt", l = {237}, m = "safeRequest")
/* renamed from: X.AyX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27981AyX extends C3CS {
    public InterfaceC88472Yns LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C27954Ay6 LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27981AyX(C27954Ay6 c27954Ay6, InterfaceC67352kd<? super C27981AyX> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c27954Ay6;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LLLZLL(null, null, null, this);
    }
}
