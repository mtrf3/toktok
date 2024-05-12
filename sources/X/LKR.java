package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.base.activity.MainActivityGlobalAbility;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LKR {
    public static boolean LIZ;
    public static Fragment LIZIZ;
    public static String LIZJ;
    public static String LIZLLL;
    public static String LJ = "";

    public static Fragment LIZ(ActivityC45651qj activityC45651qj) {
        if (LIZ) {
            return LIZIZ;
        }
        return C116694i1.LIZ(activityC45651qj).mv0();
    }

    public static boolean LIZIZ(ActivityC45651qj activity, String tag) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(activity, "activity");
        com.bytedance.hox.Hox LIZ2 = com.bytedance.hox.Hox.LJLLI.LIZ(activity);
        if (C53765L8f.LJIIIIZZ(tag) != -1) {
            if (LIZ2.vv0(tag)) {
                return true;
            }
            if (KNV.LJFF(activity, "NOTIFICATION")) {
                return TextUtils.equals(tag, "NOTIFICATION");
            }
            if (KNV.LJFF(activity, "page_profile")) {
                return TextUtils.equals(LIZJ, tag);
            }
        }
        return LIZ2.vv0(tag);
    }

    public static boolean LIZJ(ActivityC45651qj activity, String str) {
        o.LJIIIZ(activity, "activity");
        com.bytedance.hox.Hox LIZ2 = com.bytedance.hox.Hox.LJLLI.LIZ(activity);
        if (C53765L8f.LJIIIIZZ(str) != -1) {
            if (LIZ2.wv0(str)) {
                return true;
            }
            MainActivityGlobalAbility mainActivityGlobalAbility = (MainActivityGlobalAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(activity, null), MainActivityGlobalAbility.class, null);
            if (mainActivityGlobalAbility != null && mainActivityGlobalAbility.Tl0() && LIZIZ(activity, str)) {
                return true;
            }
            return false;
        }
        return LIZ2.wv0(str);
    }
}
