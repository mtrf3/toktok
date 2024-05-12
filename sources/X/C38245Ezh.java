package X;

import com.ss.android.ugc.aweme.compliance.sandbox.settings.PnsNetSandboxDfidConfigModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ezh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38245Ezh {
    public static List<String> LIZ;

    public static boolean LIZ(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        if (LIZ == null) {
            LIZ = ((PnsNetSandboxDfidConfigModel) C38246Ezi.LIZ.getValue()).hostWhiteList;
        }
        List<String> list = LIZ;
        if (list == null) {
            return true;
        }
        for (String str2 : list) {
            if (o.LJ(str, str2) || ujb.o.LJJJJ(str, str2, false)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZIZ(String str, String str2) {
        if (str == null) {
            str = C64707PaR.LIZJ;
        }
        if (str2 == null) {
            str2 = C64707PaR.LIZLLL;
        }
        if ((ujb.o.LJJJJIZL("did", str2, true) || ujb.o.LJJJJIZL("uid", str2, true)) && str != null && str.length() != 0) {
            return true;
        }
        return false;
    }
}
