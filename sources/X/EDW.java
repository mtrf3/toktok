package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaCheckService;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaCheckService", f = "RomaCheckService.kt", l = {146}, m = "fetchData")
/* loaded from: classes7.dex */
public final class EDW extends C3CS {
    public RomaCheckService LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ RomaCheckService LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EDW(RomaCheckService romaCheckService, InterfaceC67352kd<? super EDW> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = romaCheckService;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZLLL(this);
    }
}
