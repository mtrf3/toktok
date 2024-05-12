package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditContentFragment;

/* renamed from: X.9V9, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9V9 {
    public static ProfileEditContentFragment LIZ(String str, String str2, String str3) {
        ProfileEditContentFragment profileEditContentFragment = new ProfileEditContentFragment();
        Bundle LIZJ = AnonymousClass036.LIZJ("content_name", str, "content_value", str2);
        LIZJ.putBoolean("is_edit_enabled", true);
        LIZJ.putString("edit_hint", str3);
        LIZJ.putInt("content_max_length", 0);
        LIZJ.putBoolean("is_enable_null", true);
        profileEditContentFragment.setArguments(LIZJ);
        return profileEditContentFragment;
    }
}
