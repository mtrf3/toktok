package X;

import android.app.Dialog;
import com.ss.android.ugc.aweme.view.profileImageEditor.ProfileNaviProfileImageEditorFragment;

/* renamed from: X.Sdc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class DialogC72548Sdc extends Dialog {
    public final /* synthetic */ ProfileNaviProfileImageEditorFragment LJLIL;

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.LJLIL.wl();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC72548Sdc(ProfileNaviProfileImageEditorFragment profileNaviProfileImageEditorFragment, ActivityC45651qj activityC45651qj, int i) {
        super(activityC45651qj, i);
        this.LJLIL = profileNaviProfileImageEditorFragment;
    }
}
