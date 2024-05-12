package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;

/* renamed from: X.Rlk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC70504Rlk implements Runnable {
    public final /* synthetic */ ActivityC45651qj LJLIL;
    public final /* synthetic */ IPdpStarter.PdpEnterParam LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C70006Rdi LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJLL;
    public final /* synthetic */ C70500Rlg LJLJL;
    public final /* synthetic */ long LJLJLJ;

    public RunnableC70504Rlk(ActivityC45651qj activityC45651qj, IPdpStarter.PdpEnterParam pdpEnterParam, String str, C70006Rdi c70006Rdi, boolean z, C70069Rej c70069Rej, C70500Rlg c70500Rlg, long j) {
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = pdpEnterParam;
        this.LJLJI = str;
        this.LJLJJI = c70006Rdi;
        this.LJLJJL = z;
        this.LJLJJLL = c70069Rej;
        this.LJLJL = c70500Rlg;
        this.LJLJLJ = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LJLIL), null, null, new C70501Rlh(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLIL, this.LJLJL, this.LJLJLJ, null), 3);
        } finally {
            if (LIZ) {
            }
        }
    }
}
