package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.utils.EcActionReport", f = "EcActionReport.kt", l = {21}, m = "reportAction")
/* renamed from: X.Rmr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70573Rmr extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C70572Rmq LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70573Rmr(C70572Rmq c70572Rmq, InterfaceC67352kd<? super C70573Rmr> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c70572Rmq;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(null, 0, this);
    }
}
