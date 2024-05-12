package X;

import Y.ACallableS109S0100000_6;
import Y.AgS123S0100000_6;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.Frw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40312Frw {
    public static String LIZ(User user) {
        if (user == null) {
            return "";
        }
        if (TextUtils.isEmpty(user.getUniqueId())) {
            if (user.getShortId() == null) {
                return "";
            }
            return user.getShortId();
        }
        return user.getUniqueId();
    }

    public static C10K<Bundle> LIZIZ(Bundle bundle) {
        if (!C56662Kg.LIZ().LJII("cold_boot_login_success_to_signup_destroy")) {
            C56662Kg.LIZ().LIZJ("cold_boot_login_success_to_signup_destroy", false);
        }
        if (!C56662Kg.LIZ().LJII("cold_boot_query_user_sync_duration")) {
            C56662Kg.LIZ().LIZJ("cold_boot_query_user_sync_duration", false);
        }
        C10K<Bundle> LJ = C10K.LIZJ(new ACallableS109S0100000_6(bundle, 10)).LJ(new AgS123S0100000_6(bundle, 5), C10K.LJIIIIZZ, null);
        if (!C56662Kg.LIZ().LJIIIIZZ("cold_boot_query_user_sync_duration")) {
            C56662Kg.LIZ().LJFF("cold_boot_query_user_sync_duration", false);
        }
        return LJ;
    }
}
