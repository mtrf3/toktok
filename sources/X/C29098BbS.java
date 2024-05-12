package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.BbS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29098BbS implements C0K7 {
    public final /* synthetic */ LiveBroadcastFragment LJLIL;
    public final /* synthetic */ Integer LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public C29098BbS(LiveBroadcastFragment liveBroadcastFragment, Integer num, boolean z) {
        this.LJLIL = liveBroadcastFragment;
        this.LJLILLLLZI = num;
        this.LJLJI = z;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        this.LJLIL.lm(C78857UxB.LJJIIJ(1476788483, "bpea-453"));
        B5G.LIZIZ().LJJIJL = true;
        B5G.LIZIZ().LJJIJLIJ = true;
        B5G.LIZIZ().LJJLIL = this.LJLIL.Al();
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
        C7N.LJII().prepareEndBGM();
    }
}
