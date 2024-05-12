package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.profile.editprofile.pronouns.ui.ProfileEditPronounsFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.9UF, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9UF {
    public static ProfileEditPronounsFragment LIZ(String contentName, String contentValue) {
        o.LJIIIZ(contentName, "contentName");
        o.LJIIIZ(contentValue, "contentValue");
        ProfileEditPronounsFragment profileEditPronounsFragment = new ProfileEditPronounsFragment();
        Bundle bundle = new Bundle();
        bundle.putString("content_name", contentName);
        bundle.putString("content_value", contentValue);
        profileEditPronounsFragment.setArguments(bundle);
        return profileEditPronounsFragment;
    }
}
