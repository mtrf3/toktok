package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OT1 {
    public static final /* synthetic */ int LIZ = 0;

    public static C61948OSy LIZ(int i, OTS authError, String str) {
        o.LJIIIZ(authError, "authError");
        C61948OSy c61948OSy = new C61948OSy(null, null, null, authError.getValue(), null, null, 55);
        c61948OSy.errorCode = i;
        c61948OSy.errorMsg = str;
        return c61948OSy;
    }

    public static C61948OSy LIZIZ(int i, String str, String str2, String str3) {
        C61948OSy c61948OSy = new C61948OSy(null, null, null, str, str2, null, 39);
        c61948OSy.errorCode = i;
        c61948OSy.errorMsg = str3;
        return c61948OSy;
    }

    public static C61948OSy LIZJ(String str, String str2, String str3, String str4, int i) {
        String str5 = str3;
        String authCode = str;
        String str6 = str2;
        if ((i & 1) != 0) {
            authCode = "";
        }
        String str7 = null;
        if ((i & 2) != 0) {
            str6 = null;
        }
        if ((i & 4) != 0) {
            str5 = null;
        }
        if ((i & 8) == 0) {
            str7 = str4;
        }
        o.LJIIIZ(authCode, "authCode");
        return new C61948OSy(authCode, str5, str6, null, null, str7, 24);
    }
}
