package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaCheckService;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaCheckService", f = "RomaCheckService.kt", l = {161}, m = "loadCache")
/* loaded from: classes7.dex */
public final class EDX extends C3CS {
    public RomaCheckService LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ RomaCheckService LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EDX(RomaCheckService romaCheckService, InterfaceC67352kd<? super EDX> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = romaCheckService;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJFF(this);
    }
}
