package X;

import android.app.Dialog;
import com.facebook.login.DeviceAuthDialog;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Q4v, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class DialogC66417Q4v extends Dialog {
    public final /* synthetic */ DeviceAuthDialog LJLIL;

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.LJLIL.getClass();
        super.onBackPressed();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC66417Q4v(DeviceAuthDialog deviceAuthDialog, ActivityC45651qj activityC45651qj) {
        super(activityC45651qj, R.style.a5p);
        this.LJLIL = deviceAuthDialog;
    }
}
