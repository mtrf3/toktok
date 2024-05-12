package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragment;

/* loaded from: classes6.dex */
public final class BE5 implements C0K7 {
    public final /* synthetic */ ModeratorPermissionEditFragment LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public BE5(ModeratorPermissionEditFragment moderatorPermissionEditFragment, int i, boolean z) {
        this.LJLIL = moderatorPermissionEditFragment;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
        this.LJLIL.Gl(this.LJLILLLLZI, "ok", this.LJLJI);
    }
}
