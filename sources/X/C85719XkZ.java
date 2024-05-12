package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.email.EmailPopUpFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.XkZ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85719XkZ {
    public static EmailPopUpFragment LIZ(ActivityC45651qj activity, int i, boolean z, boolean z2, M78 m78) {
        o.LJIIIZ(activity, "activity");
        EmailPopUpFragment emailPopUpFragment = new EmailPopUpFragment(activity, i, z, z2, m78);
        Bundle bundle = new Bundle();
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    bundle.putInt("current_scene", EnumC69116RAq.BIND_EMAIL_FROM_PROFILE.getValue());
                }
            } else {
                bundle.putInt("current_scene", EnumC69116RAq.BIND_EMAIL_FROM_INBOX.getValue());
            }
        } else {
            bundle.putInt("current_scene", EnumC69116RAq.BIND_EMAIL_FROM_FEED.getValue());
        }
        emailPopUpFragment.setArguments(bundle);
        return emailPopUpFragment;
    }
}
