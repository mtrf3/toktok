package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.model.PdpV2EnterParams;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdpv2.repository.PdpRepoOperator", f = "PdpRepoOperator.kt", l = {64}, m = "getSemiProductInfo")
/* renamed from: X.Rda, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69998Rda extends C3CS {
    public C69997RdZ LJLIL;
    public C70300RiS LJLILLLLZI;
    public PdpV2EnterParams LJLJI;
    public boolean LJLJJI;
    public long LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ C69997RdZ LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69998Rda(C69997RdZ c69997RdZ, InterfaceC67352kd<? super C69998Rda> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = c69997RdZ;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.LJLLILLLL(null, false, this);
    }
}
