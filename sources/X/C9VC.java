package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlFragment;

/* renamed from: X.9VC, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9VC {
    public static ProfileEditBioUrlFragment LIZ(String str) {
        ProfileEditBioUrlFragment profileEditBioUrlFragment = new ProfileEditBioUrlFragment();
        Bundle bundle = new Bundle();
        bundle.putString("content_value", str);
        bundle.putBoolean("is_edit_enabled", true);
        bundle.putString("edit_hint", "");
        bundle.putInt("content_max_length", 0);
        bundle.putBoolean("is_enable_null", true);
        profileEditBioUrlFragment.setArguments(bundle);
        return profileEditBioUrlFragment;
    }
}
