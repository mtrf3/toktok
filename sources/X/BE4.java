package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragmentSheet;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes6.dex */
public final class BE4 implements C0K7 {
    public final /* synthetic */ ModeratorPermissionEditFragmentSheet LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public BE4(ModeratorPermissionEditFragmentSheet moderatorPermissionEditFragmentSheet, int i, boolean z) {
        this.LJLIL = moderatorPermissionEditFragmentSheet;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this.LJLIL);
        if (LJIILIIL != null) {
            BBP bbp = BBP.MODERATOR_LIST;
            bbp.next();
            LJIILIIL.rv0(BroadcastDialogPageChannel.class, bbp);
        }
        liveDialog.dismiss();
        this.LJLIL.Rl(this.LJLILLLLZI, "manage", this.LJLJI);
    }
}
