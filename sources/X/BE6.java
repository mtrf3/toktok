package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragmentSheet;

/* loaded from: classes6.dex */
public final class BE6 implements C0K7 {
    public final /* synthetic */ ModeratorPermissionEditFragmentSheet LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public BE6(ModeratorPermissionEditFragmentSheet moderatorPermissionEditFragmentSheet, int i, boolean z) {
        this.LJLIL = moderatorPermissionEditFragmentSheet;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
        this.LJLIL.Rl(this.LJLILLLLZI, "ok", this.LJLJI);
    }
}
