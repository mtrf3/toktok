package X;

import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.Uhl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77901Uhl {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(String enterFrom, String cId, String str) {
        String str2;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(cId, "cId");
        C58655N0h LJ = C58704N2e.LJ("draw_ad", "otherclick", cId, str, null);
        LJ.LIZJ("expired_reminder_window", "refer");
        if (TextUtils.equals(enterFrom, "draw_ad")) {
            str2 = "1";
        } else {
            str2 = "2";
        }
        LJ.LIZIZ(str2, "window_type");
        LJ.LJI();
    }

    public static /* synthetic */ void LIZIZ(String str, String str2, String str3, String str4, Boolean bool) {
        LIZ(bool, str, str2, str3, str4, false);
    }

    public static void LIZ(Boolean bool, String enterFrom, String cId, String str, String str2, boolean z) {
        String str3;
        int i;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(cId, "cId");
        C58655N0h LJ = C58704N2e.LJ("draw_ad", "otherclick", cId, str, null);
        LJ.LIZJ("reminder_window", "refer");
        if (TextUtils.equals(enterFrom, "draw_ad")) {
            str3 = "1";
        } else {
            str3 = "2";
        }
        LJ.LIZIZ(str3, "window_type");
        LJ.LIZIZ(str2, "window_click_type");
        LJ.LIZIZ(Integer.valueOf(z ? 1 : 0), "is_auto_click");
        if (bool != null) {
            if (bool.booleanValue()) {
                i = 1;
            } else {
                i = 2;
            }
            LJ.LIZIZ(Integer.valueOf(i), "register_status");
        }
        LJ.LJI();
    }
}
