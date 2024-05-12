package X;

import android.content.Context;
import com.bytedance.android.live.broadcast.model.AcademyCourseTheme;
import com.bytedance.android.live.broadcast.model.SurveyAnswer;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Opc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63100Opc {
    public static AcademyCourseTheme LIZ;
    public static SurveyAnswer LIZIZ;
    public static String LIZJ = "";
    public static String LIZLLL = "";
    public static int LJ = -1;
    public static String LJFF;
    public static String LJI;
    public static Long LJII;

    public static void LIZ() {
        LIZ = null;
        LIZIZ = null;
        LIZJ = "";
        LIZLLL = "";
        LJ = -1;
        LJFF = null;
        LJI = null;
        LJII = null;
    }

    public static void LIZIZ(Boolean bool, String str) {
        if (str == null || bool == null || o.LJ(bool, Boolean.FALSE)) {
            return;
        }
        LiveOuterService.LJJJLL().LJJIJIL().LJJ(Long.valueOf(CastLongProtector.parseLong(str)), new C63081OpJ());
    }

    public static void LIZJ(Context context, String str, String str2, boolean z) {
        if (context != null) {
            if (z) {
                C5S1 c5s1 = new C5S1(context);
                c5s1.LIZLLL(context.getString(R.string.n6s));
                c5s1.LIZ(R.raw.icon_tick_fill_small);
                int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.e8, context);
                C26045AKb c26045AKb = c5s1.LIZIZ;
                if (c26045AKb != null) {
                    c26045AKb.LJI(LJIIIIZZ);
                }
                c5s1.LJ();
            } else {
                C5S1 c5s12 = new C5S1(context);
                c5s12.LIZLLL(context.getString(R.string.n6n));
                c5s12.LJ();
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(0, "A");
        linkedHashMap.put(1, "B");
        linkedHashMap.put(2, "C");
        linkedHashMap.put(3, "Other");
        String str3 = LIZLLL;
        String str4 = (String) linkedHashMap.get(Integer.valueOf(LJ));
        if (str4 == null) {
            str4 = "";
        }
        C63110Opm.LIZJ(false, true, z, str, str3, "submit", str4, str2, LJII, LJI, LJFF);
        LIZ();
    }
}
