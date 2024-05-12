package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JIK {
    public static String LIZ;
    public static String LIZIZ;
    public static String LIZJ;
    public static Integer LIZLLL;
    public static Integer LJ;
    public static Boolean LJFF;
    public static String LJI;
    public static String LJII = "";

    public static final boolean LIZ(Context context, Aweme aweme) {
        Boolean bool;
        boolean z;
        if (context == null || aweme == null || (bool = LJFF) == null) {
            return false;
        }
        bool.booleanValue();
        if (LIZJ == null) {
            return false;
        }
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        if (C47699Inn.LIZIZ(aid) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!o.LJ(aweme.getAid(), LJI) || !z || !o.LJ(LJFF, Boolean.TRUE) || !ujb.o.LJJJJIZL(LIZJ, "live_center", false)) {
            return false;
        }
        return true;
    }
}
