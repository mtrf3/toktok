package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.repository.OrderSubmitRepository", f = "OrderSubmitRepository.kt", l = {182}, m = "tryFetchBillInfoByChunk")
/* renamed from: X.AyU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27978AyU extends C3CS {
    public C27954Ay6 LJLIL;
    public Object LJLILLLLZI;
    public C68322mC LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ C27954Ay6 LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27978AyU(C27954Ay6 c27954Ay6, InterfaceC67352kd<? super C27978AyU> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = c27954Ay6;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.LLZILL(null, false, null, false, this);
    }
}
