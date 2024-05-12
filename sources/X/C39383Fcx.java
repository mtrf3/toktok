package X;

import android.content.Context;
import android.content.res.Resources;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

/* renamed from: X.Fcx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39383Fcx {
    public static final C39384Fcy LIZ;
    public static C39384Fcy LIZIZ;

    static {
        C39384Fcy c39384Fcy = new C39384Fcy();
        c39384Fcy.LJFF = 2;
        c39384Fcy.LIZ = "";
        c39384Fcy.LJ = System.currentTimeMillis() + 21600000;
        LIZ = c39384Fcy;
        LIZIZ = null;
    }

    public static C39384Fcy LIZ(Context context) {
        String str;
        try {
            str = C60903NvH.LJFF((TelephonyManager) C16880lQ.LLILL(context, "phone"));
        } catch (Throwable unused) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) C16880lQ.LLILL(context, "phone");
                C39405FdJ.LJFF.getClass();
                str = C39571Ffz.LJ(telephonyManager);
            } catch (Throwable unused2) {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                try {
                    str = C39399FdD.LIZ(Resources.getSystem().getConfiguration().locale);
                } catch (Throwable unused3) {
                    str = null;
                }
            }
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C39384Fcy c39384Fcy = new C39384Fcy();
        c39384Fcy.LJFF = 2;
        c39384Fcy.LIZ = str;
        c39384Fcy.LJ = System.currentTimeMillis() + 21600000;
        return c39384Fcy;
    }
}
