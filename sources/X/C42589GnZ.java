package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.anchor.api.SuspendApi$Companion", f = "AnchorApi.kt", l = {53}, m = "getCreatorSaleMode")
/* renamed from: X.GnZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42589GnZ extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C42590Gna LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42589GnZ(C42590Gna c42590Gna, InterfaceC67352kd<? super C42589GnZ> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c42590Gna;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(0L, 0, null, this);
    }
}
