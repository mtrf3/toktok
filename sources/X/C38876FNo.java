package X;

import com.bytedance.ies.abmock.ClientExpManager;

/* renamed from: X.FNo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38876FNo {
    public static final boolean LIZ() {
        FFL LJIIIZ = FFL.LJIIIZ();
        boolean local_notify_4_non_login_users = ClientExpManager.local_notify_4_non_login_users();
        LJIIIZ.getClass();
        try {
            local_notify_4_non_login_users = ((Boolean) LJIIIZ.LJI("local_notify_4_non_login_users", Boolean.valueOf(local_notify_4_non_login_users))).booleanValue();
        } catch (Throwable unused) {
        }
        if (local_notify_4_non_login_users) {
            return true;
        }
        return false;
    }
}
