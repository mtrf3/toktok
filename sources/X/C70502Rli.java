package X;

import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;

/* renamed from: X.Rli, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70502Rli<T> implements InterfaceC64592gB {
    public final /* synthetic */ C34K LJLIL;
    public final /* synthetic */ IPdpStarter.PdpEnterParam LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ C70006Rdi LJLJJLL;
    public final /* synthetic */ ActivityC45651qj LJLJL;
    public final /* synthetic */ C70500Rlg LJLJLJ;
    public final /* synthetic */ long LJLJLLL;

    public C70502Rli(C34K c34k, IPdpStarter.PdpEnterParam pdpEnterParam, boolean z, long j, long j2, C70006Rdi c70006Rdi, ActivityC45651qj activityC45651qj, C70500Rlg c70500Rlg, long j3) {
        this.LJLIL = c34k;
        this.LJLILLLLZI = pdpEnterParam;
        this.LJLJI = z;
        this.LJLJJI = j;
        this.LJLJJL = j2;
        this.LJLJJLL = c70006Rdi;
        this.LJLJL = activityC45651qj;
        this.LJLJLJ = c70500Rlg;
        this.LJLJLLL = j3;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        ProductPackStruct productPackStruct = (ProductPackStruct) obj;
        C34K c34k = this.LJLIL;
        if (c34k.element) {
            u.LJJIIJZLJL("wait error 1", this.LJLILLLLZI.getTrackParams());
            return;
        }
        c34k.element = true;
        if (!this.LJLJI && System.currentTimeMillis() - this.LJLJJI > this.LJLJJL) {
            u.LJJIIJZLJL("wait time out 1", this.LJLILLLLZI.getTrackParams());
            return;
        }
        C70006Rdi c70006Rdi = this.LJLJJLL;
        if (c70006Rdi.LIZLLL == null) {
            c70006Rdi.LIZLLL = productPackStruct;
        }
        if (this.LJLJL.isFinishing() || this.LJLJL.isDestroyed() || !V1B.LJJZZI(this.LJLJL, false)) {
            u.LJJIIJZLJL("wait context error", this.LJLILLLLZI.getTrackParams());
            return;
        }
        u.LJJIIJZLJL("wait response", this.LJLILLLLZI.getTrackParams());
        if (!C70500Rlg.LIZ(this.LJLJL, this.LJLJJLL, this.LJLILLLLZI, this.LJLJLLL)) {
            return;
        }
        u.LJJIIJZLJL("wait finish", this.LJLILLLLZI.getTrackParams());
    }
}
