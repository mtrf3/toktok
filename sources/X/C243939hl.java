package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountService;

/* renamed from: X.9hl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C243939hl {
    public static final Keva LIZ = Keva.getRepo("music_authorization_repo");

    public static String LIZ(String str) {
        String curSecUserId = AccountService.LJIJ().LJFF().getCurSecUserId();
        if (curSecUserId == null || curSecUserId.length() == 0) {
            return "";
        }
        return Q8U.LIZIZ(new Object[]{curSecUserId}, 1, str, "format(format, *args)");
    }

    public static void LIZIZ(String str) {
        String LIZ2 = LIZ("music_resso_openid_%s");
        if (LIZ2.length() == 0) {
            return;
        }
        LIZ.storeString(LIZ2, str);
    }
}
