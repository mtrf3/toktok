package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.OrderSubmitApi$Companion", f = "OrderSubmitApi.kt", l = {155}, m = "cancelOrder")
/* renamed from: X.Ayi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27992Ayi extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C27965AyH LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27992Ayi(C27965AyH c27965AyH, InterfaceC67352kd<? super C27992Ayi> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c27965AyH;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(null, this);
    }
}
