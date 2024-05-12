package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerFragmentSecondVersion;

/* renamed from: X.XmG, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85824XmG implements InterfaceC81628W1w {
    public final /* synthetic */ PushSettingManagerFragmentSecondVersion LIZ;

    @Override // X.InterfaceC81628W1w
    public final void LIZ() {
        if (this.LIZ.mo49getActivity() == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("email_source", V86.DYA_BIND_EMAIL_SOURCE_TYPE_EMAIL_NOTIFICATION.getValue());
        HG3.LJFF().bindEmail(this.LIZ.mo49getActivity(), "email_notification", "click", bundle, null);
        this.LIZ.LLILIL = true;
    }

    public C85824XmG(PushSettingManagerFragmentSecondVersion pushSettingManagerFragmentSecondVersion) {
        this.LIZ = pushSettingManagerFragmentSecondVersion;
    }
}
