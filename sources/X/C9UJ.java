package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditBioFragment;

/* renamed from: X.9UJ, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9UJ {
    public static ProfileEditBioFragment LIZ(String str, String str2, Bundle bundle) {
        ProfileEditBioFragment profileEditBioFragment = new ProfileEditBioFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString("content_name", str);
        bundle2.putString("content_value", str2);
        bundle2.putAll(bundle);
        profileEditBioFragment.setArguments(bundle2);
        return profileEditBioFragment;
    }
}
