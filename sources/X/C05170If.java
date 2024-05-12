package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostUser;

/* renamed from: X.0If, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05170If {
    public static String LIZ(User user) {
        if (user == null) {
            return "";
        }
        return LIZIZ(user.username, user.nickName);
    }

    public static String LIZJ(User user) {
        String LIZ = LIZ(user);
        if (LIZ.length() > 14) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZ.substring(0, 11));
            LIZ2.append("...");
            return X1D.LIZIZ(LIZ2);
        }
        return LIZ;
    }

    public static String LIZLLL(User user) {
        if (user == null) {
            return "";
        }
        String str = user.nickName;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        str.toString();
        return str;
    }

    public static String LJ(User user) {
        if (user == null) {
            return "";
        }
        String str = user.username;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        str.toString();
        return str;
    }

    public static String LIZIZ(String str, String str2) {
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        if ((iHostAppContext != null && iHostAppContext.appId() == 1233) || str2 == null || str2.isEmpty()) {
            IHostUser iHostUser = (IHostUser) CN1.LIZ(IHostUser.class);
            if (iHostUser != null && str != null && str2 != null) {
                str = iHostUser.getTTDisPlayName(str, str2);
            }
            str2 = str;
        }
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        str2.toString();
        return str2;
    }
}
