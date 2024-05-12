package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import kotlin.jvm.internal.o;

/* renamed from: X.BbF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29085BbF implements C0K7 {
    public final /* synthetic */ C29084BbE LJLIL;
    public final /* synthetic */ Integer LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public C29085BbF(C29084BbE c29084BbE, Integer num, boolean z) {
        this.LJLIL = c29084BbE;
        this.LJLILLLLZI = num;
        this.LJLJI = z;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        this.LJLIL.LIZJ(C78857UxB.LJJIIJ(1476788483, "bpea-581"));
        liveDialog.dismiss();
        Integer num = this.LJLILLLLZI;
        if (num != null && num.intValue() == 4) {
            C7N.LJIIIIZZ().logBoostCardLiveEndClick(1);
        }
        if (this.LJLJI) {
            InterfaceC06390Mx LIZ = CN1.LIZ(ISubscribeService.class);
            o.LJIIIIZZ(LIZ, "getService(T::class.java)");
            ((ISubscribeService) LIZ).Rv();
            C28959BYd.LIZ(true);
        }
    }
}
