package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog;

/* renamed from: X.TYp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74835TYp implements C0K7 {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ MultiGuestV3GuestBeInvitedDialog LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;

    public C74835TYp(boolean z, MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog, long j, long j2) {
        this.LJLIL = z;
        this.LJLILLLLZI = multiGuestV3GuestBeInvitedDialog;
        this.LJLJI = j;
        this.LJLJJI = j2;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        if (this.LJLIL) {
            InterfaceC30442Bx8.c0.LIZ(Boolean.TRUE);
            C74824TYe.LJJJJJL("click", "confirm");
        }
        C29556Biq.LIZ().getClass();
        C74751TVj.LJFF("click", "confirm", C74983Tbn.LIZJ());
        MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog = this.LJLILLLLZI;
        long j = this.LJLJI;
        long j2 = this.LJLJJI;
        if (!multiGuestV3GuestBeInvitedDialog.LJLJLLL) {
            multiGuestV3GuestBeInvitedDialog.LJLJLLL = true;
            TY7 ty7 = multiGuestV3GuestBeInvitedDialog.LJLJJLL;
            if (ty7 != null) {
                ty7.LJ(j, j2);
            }
        }
        liveDialog.dismiss();
    }
}
