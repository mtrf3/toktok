package X;

import android.text.TextUtils;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.FuR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40467FuR extends AbstractC40468FuS {
    public static final C40467FuR LIZ = new C40467FuR();

    @Override // X.AbstractC40468FuS
    public final String LIZ() {
        return "Login";
    }

    public static final void LJ(String str) {
        HashMap LIZ2 = C45243HpH.LIZ("event", "on update user info result check", "errorMsg", str);
        C40467FuR c40467FuR = LIZ;
        String abstractMap = LIZ2.toString();
        o.LJIIIIZZ(abstractMap, "map.toString()");
        c40467FuR.LIZIZ(abstractMap);
    }

    public static final void LIZJ(String str, String str2, EnumC35464Dvw enumC35464Dvw) {
        String str3;
        HashMap LIZJ = C03660Ck.LIZJ("event", "login part fail");
        if (str == null) {
            str = "";
        }
        LIZJ.put("errorCode", str);
        if (str2 == null) {
            str2 = "";
        }
        LIZJ.put("errorMsg", str2);
        if (enumC35464Dvw == null || (str3 = enumC35464Dvw.name()) == null) {
            str3 = "";
        }
        LIZJ.put("part", str3);
        LIZJ.put("loginMethod", "");
        LIZJ.put("extra", "");
        C40467FuR c40467FuR = LIZ;
        String abstractMap = LIZJ.toString();
        o.LJIIIIZZ(abstractMap, "map.toString()");
        c40467FuR.LIZIZ(abstractMap);
    }

    public static final void LIZLLL(int i, String str, boolean z, boolean z2) {
        HashMap LIZJ = C03660Ck.LIZJ("event", "Auto fill SMS verification code");
        LIZJ.put("success", String.valueOf(z));
        LIZJ.put("hasSimCard", String.valueOf(z2));
        LIZJ.put("googleAvailability", String.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                str = "";
            }
            LIZJ.put("errorMsg", str);
        }
        C40467FuR c40467FuR = LIZ;
        String abstractMap = LIZJ.toString();
        o.LJIIIIZZ(abstractMap, "map.toString()");
        c40467FuR.LIZIZ(abstractMap);
    }
}
