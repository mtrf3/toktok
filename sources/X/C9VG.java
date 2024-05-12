package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditNicknameFragment;

/* renamed from: X.9VG, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9VG {
    public static ProfileEditNicknameFragment LIZ(Bundle bundle, String str) {
        ProfileEditNicknameFragment profileEditNicknameFragment = new ProfileEditNicknameFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString("current_nickname", str);
        bundle2.putAll(bundle);
        profileEditNicknameFragment.setArguments(bundle2);
        return profileEditNicknameFragment;
    }
}
