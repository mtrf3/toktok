package X;

import Y.AgS113S0200000_10;
import android.os.Bundle;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R4D {
    public static List<String> LIZIZ;
    public static int LIZ = -1;
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(R4H.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(R4G.LJLIL);
    public static String LJ = "";

    public static IAccountUserService LIZ() {
        return (IAccountUserService) LIZJ.getValue();
    }

    public static void LIZIZ(QTX qtx, Bundle bundle, R4B r4b) {
        R41.LJIILIIL(qtx);
        if (bundle == null) {
            o.LJIIIIZZ(C10K.LJIIIIZZ(new Exception("Bundle is empty")), "forError(Exception(\"Bundle is empty\"))");
        } else {
            o.LJIIIIZZ(C40312Frw.LIZIZ(bundle).LJFF(new AgS113S0200000_10(R41.LIZ(), bundle, 4)), "bundle: Bundle?): Task<B…unt(bundle)\n            }");
        }
        HashMap LIZJ2 = C03660Ck.LIZJ("event", "switch account successfully");
        R4J r4j = R4J.LIZ;
        String abstractMap = LIZJ2.toString();
        o.LJIIIIZZ(abstractMap, "map.toString()");
        r4j.LIZIZ(abstractMap);
        Q13.LIZIZ("monitor_switch_account", 0, C36180EHw.LIZ(0, "", ""));
        if (r4b != null) {
            r4b.onSuccess();
        }
    }

    public static final void LIZJ(String str, Bundle bundle, boolean z, boolean z2, R4B r4b) {
        Bundle bundle2;
        String str2;
        String str3;
        if (str == null || str.length() == 0 || ujb.o.LJJJJIZL(str, LIZ().getCurUserId(), true)) {
            return;
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        if (LIZ().isLogin()) {
            str2 = LIZ().getCurUserId();
        } else {
            str2 = LJ;
        }
        bundle2.putString("previous_uid", str2);
        InterfaceC69035R7n interfaceC69035R7n = (InterfaceC69035R7n) LIZLLL.getValue();
        if (z2) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        interfaceC69035R7n.LJIILIIL(str, C51029K0z.LJJIIZI(new OSZ("force_switch", str3)), new R4C(bundle2, r4b, str, z, bundle));
    }
}
