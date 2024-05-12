package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.broadcaster.duringlive.slot.quickproduct.QuickProductUtil", f = "QuickProductUtil.kt", l = {18}, m = "prefetchCreationData")
/* renamed from: X.2jX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66672jX extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C66682jY LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66672jX(C66682jY c66682jY, InterfaceC67352kd<? super C66672jX> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c66682jY;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(this);
    }
}
