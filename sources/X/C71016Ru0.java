package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.audience.api.AudienceApi$Companion", f = "AudienceApi.kt", l = {39}, m = "reportAction")
/* renamed from: X.Ru0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71016Ru0 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C71017Ru1 LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71016Ru0(C71017Ru1 c71017Ru1, InterfaceC67352kd<? super C71016Ru0> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c71017Ru1;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(null, null, null, 0, this);
    }
}
