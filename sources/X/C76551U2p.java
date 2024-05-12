package X;

import com.bytedance.android.live.design.app.LiveDialog;
import webcast.data.multi_guest_play.ShowListUser;

/* renamed from: X.U2p, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76551U2p implements C0K7 {
    public final /* synthetic */ C76549U2n LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    public C76551U2p(C76549U2n c76549U2n, long j) {
        this.LJLIL = c76549U2n;
        this.LJLILLLLZI = j;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        ShowListUser showListUser;
        liveDialog.dismiss();
        C76549U2n c76549U2n = this.LJLIL;
        C76553U2r c76553U2r = c76549U2n.LJLJI;
        if (c76553U2r != null && (showListUser = c76553U2r.LJLIL) != null) {
            long j = showListUser.userId;
            InterfaceC76555U2t interfaceC76555U2t = c76549U2n.LJLIL;
            if (interfaceC76555U2t != null) {
                interfaceC76555U2t.LIZJ(j);
            }
        }
        long j2 = this.LJLILLLLZI;
        java.util.Map LIZIZ = C76548U2m.LIZIZ();
        LIZIZ.put("guest_id", String.valueOf(j2));
        C76548U2m.LJIIZILJ("livesdk_anchor_multiguest_liveshow_guest_replay_confirm", LIZIZ);
    }
}
