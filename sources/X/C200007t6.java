package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.7t6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200007t6 {
    public static EnumC199997t5 LIZ(User user) {
        if (user != null) {
            if (user.getFollowerStatus() == 1) {
                return EnumC199997t5.MUTUAL;
            }
            return EnumC199997t5.SINGLE;
        }
        return null;
    }
}
