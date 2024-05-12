package X;

import android.text.TextUtils;

/* renamed from: X.Oom, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63048Oom {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(long j, String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("confirm_content", "go_private");
        c188727au.LJIIIZ("cancel_content", "skip");
        c188727au.LJIIIZ("button_design", "left_right");
        c188727au.LJ(j, "stay_time");
        FMX.LJIIL(str, c188727au.LIZ);
    }

    public static final void LIZIZ(String str, boolean z) {
        String str2;
        if (TextUtils.equals(str, "privacy_account_setting_show")) {
            str2 = "force_account_privacy_show";
        } else {
            str2 = "force_account_privacy_confirm";
        }
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(!z ? 1 : 0, "is_register");
        FMX.LJIIL(str2, c188727au.LIZ);
    }

    public static final void LIZJ(String str, boolean z) {
        String str2;
        if (TextUtils.equals(str, "privacy_account_setting_show")) {
            str2 = "account_privacy_show";
        } else {
            str2 = "account_privacy_confirm";
        }
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(!z ? 1 : 0, "is_register");
        FMX.LJIIL(str2, c188727au.LIZ);
    }
}
