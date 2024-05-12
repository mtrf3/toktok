package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.repository.OrderSubmitRepository", f = "OrderSubmitRepository.kt", l = {113, LiveTryModeCountDownThresholdSetting.DEFAULT}, m = "tryFetchBillInfo")
/* renamed from: X.AyT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27977AyT extends C3CS {
    public C27954Ay6 LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public C68322mC LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public /* synthetic */ Object LJLJL;
    public final /* synthetic */ C27954Ay6 LJLJLJ;
    public int LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27977AyT(C27954Ay6 c27954Ay6, InterfaceC67352kd<? super C27977AyT> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLJ = c27954Ay6;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJL = obj;
        this.LJLJLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJLJ.LLLZZIL(null, false, null, false, this);
    }
}
