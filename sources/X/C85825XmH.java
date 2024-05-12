package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerFragment;

/* renamed from: X.XmH, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85825XmH implements InterfaceC81628W1w {
    public final /* synthetic */ PushSettingManagerFragment LIZ;

    @Override // X.InterfaceC81628W1w
    public final void LIZ() {
        if (this.LIZ.mo49getActivity() == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("email_source", V86.DYA_BIND_EMAIL_SOURCE_TYPE_EMAIL_NOTIFICATION.getValue());
        HG3.LJFF().bindEmail(this.LIZ.mo49getActivity(), "email_notification", "click", bundle, null);
    }

    public C85825XmH(PushSettingManagerFragment pushSettingManagerFragment) {
        this.LIZ = pushSettingManagerFragment;
    }
}
