package X;

import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.K9l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51249K9l {
    public static final C51249K9l LIZ = new C51249K9l();
    public static final java.util.Map<String, C50295JoZ> LIZIZ = new LinkedHashMap();
    public static final List<List<String>> LIZJ = new ArrayList();
    public static final List<List<String>> LIZLLL = new ArrayList();
    public static final List<String> LJ = new ArrayList();
    public static final String LJFF = "";

    public static String LJ() {
        RBY LJFF2 = AccountService.LJIJ().LJFF();
        if (LJFF2.isLogin()) {
            return LJFF2.getCurUserId();
        }
        return "FAKE_USER";
    }

    public static void LIZ(ISearchMiddleForECService iSearchMiddleForECService, ActivityC45651qj activityC45651qj) {
        C51141K5h.LIZ.getClass();
        if (C51141K5h.LIZ(activityC45651qj)) {
            if (iSearchMiddleForECService != null) {
                iSearchMiddleForECService.LJFF();
            }
        } else {
            ((ArrayList) LIZJ).clear();
            ((ArrayList) LIZLLL).clear();
            ((ArrayList) LJ).clear();
        }
    }

    public final String LIZLLL(ISearchMiddleForECService iSearchMiddleForECService, ActivityC45651qj activityC45651qj) {
        C50650JuI immutableData;
        C51141K5h.LIZ.getClass();
        if (C51141K5h.LIZ(activityC45651qj)) {
            if (iSearchMiddleForECService == null) {
                return null;
            }
            return iSearchMiddleForECService.LJIIIIZZ();
        }
        C50652JuK.Companion.getClass();
        C50652JuK LJIIJ = C50651JuJ.LJIIJ(activityC45651qj);
        if (LJIIJ == null || (immutableData = LJIIJ.getImmutableData()) == null) {
            return null;
        }
        return LIZJ(this, immutableData.getSearchVideoModel().getGroupId(), immutableData.getSearchCommonModel().getEnterFrom(), null);
    }

    public static void LIZIZ(String str, ISearchMiddleForECService iSearchMiddleForECService, ActivityC45651qj activityC45651qj) {
        C51141K5h.LIZ.getClass();
        if (C51141K5h.LIZ(activityC45651qj)) {
            if (iSearchMiddleForECService != null) {
                iSearchMiddleForECService.LJII(str);
            }
        } else {
            if (str == null) {
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LJ());
            LIZ2.append(str);
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            java.util.Map<String, C50295JoZ> map = LIZIZ;
            if (!map.containsKey(LIZIZ2)) {
                map.put(LIZIZ2, new C50295JoZ(null));
            }
            C50295JoZ c50295JoZ = (C50295JoZ) ((LinkedHashMap) map).get(LIZIZ2);
            if (c50295JoZ == null) {
                return;
            }
            c50295JoZ.LIZ = true;
        }
    }

    public static String LIZJ(C51249K9l c51249K9l, String str, String str2, ISearchMiddleForECService iSearchMiddleForECService) {
        c51249K9l.getClass();
        C51141K5h.LIZ.getClass();
        if (C51141K5h.LIZ(null)) {
            if (iSearchMiddleForECService == null) {
                return null;
            }
            return iSearchMiddleForECService.LJJJJ(str, str2);
        }
        if (o.LJ("homepage_friends", str2) || o.LJ("discovery", str2)) {
            str = LJFF;
        }
        return str;
    }
}
