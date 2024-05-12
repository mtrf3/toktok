package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.dialog.GameLinkGuestBeInvitedDialog;

/* renamed from: X.TVf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74747TVf implements C0K7 {
    public final /* synthetic */ GameLinkGuestBeInvitedDialog LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    public C74747TVf(GameLinkGuestBeInvitedDialog gameLinkGuestBeInvitedDialog, long j, long j2) {
        this.LJLIL = gameLinkGuestBeInvitedDialog;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        C74746TVe.LJ("click", "confirm");
        GameLinkGuestBeInvitedDialog gameLinkGuestBeInvitedDialog = this.LJLIL;
        long j = this.LJLILLLLZI;
        long j2 = this.LJLJI;
        if (!gameLinkGuestBeInvitedDialog.LJLJJLL) {
            gameLinkGuestBeInvitedDialog.LJLJJLL = true;
            TVA tva = gameLinkGuestBeInvitedDialog.LJLJJL;
            if (tva != null) {
                tva.LIZ(j, j2);
            }
            C74746TVe.LJFF("click", Long.valueOf(gameLinkGuestBeInvitedDialog.LJLLJ), Boolean.valueOf(gameLinkGuestBeInvitedDialog.xl()), "cancel");
        }
        liveDialog.dismiss();
    }
}
