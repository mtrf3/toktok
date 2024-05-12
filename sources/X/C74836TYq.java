package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog;

/* renamed from: X.TYq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74836TYq implements C0K7 {
    public final /* synthetic */ MultiGuestV3GuestBeInvitedDialog LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    public C74836TYq(MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog, boolean z) {
        this.LJLIL = multiGuestV3GuestBeInvitedDialog;
        this.LJLILLLLZI = z;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        C41051jJ c41051jJ = this.LJLIL.LJZI;
        if (c41051jJ != null) {
            c41051jJ.setChecked(false);
        }
        if (this.LJLILLLLZI) {
            InterfaceC30442Bx8.c0.LIZ(Boolean.TRUE);
            C74824TYe.LJJJJJL("click", "status_setting");
            this.LJLIL.Hl("decline_popup");
        }
        C29556Biq.LIZ().getClass();
        C74751TVj.LJFF("click", "cancel", C74983Tbn.LIZJ());
        liveDialog.dismiss();
    }
}
