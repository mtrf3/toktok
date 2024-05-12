package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.9Wb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238099Wb {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C238109Wc.LJLIL);

    public static Keva LIZ() {
        return (Keva) LIZ.getValue();
    }

    public static boolean LIZIZ(String newUsername) {
        String uniqueId;
        o.LJIIIZ(newUsername, "newUsername");
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (TextUtils.isEmpty(curUser.getUniqueId())) {
            uniqueId = curUser.getShortId();
        } else {
            uniqueId = curUser.getUniqueId();
        }
        return !o.LJ(newUsername, uniqueId);
    }
}
