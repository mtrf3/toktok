package X;

import android.content.Context;
import android.graphics.Rect;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.3qY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96503qY {
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C96523qa.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C96633ql.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C96753qx.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C96773qz.LJLIL);
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C96743qw.LJLIL);
    public static final C62822Ol8 LJI = C221108m2.LIZIZ(C96733qv.LJLIL);
    public static final C62822Ol8 LJII = C221108m2.LIZIZ(C96763qy.LJLIL);
    public static final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(C96723qu.LJLIL);
    public final Context LIZ;

    public final SY9 LIZIZ() {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_3pt_exclamation_mark_circle;
        c2068389v.LJ = Integer.valueOf(R.attr.e7);
        c2068389v.LIZIZ = C96613qj.LIZIZ();
        c2068389v.LIZJ = C96613qj.LIZIZ();
        return c2068389v.LIZ(this.LIZ);
    }

    public C96503qY(Context context) {
        this.LIZ = context;
    }

    public static Integer LIZ(int i) {
        C62822Ol8 c62822Ol8 = LJIIIIZZ;
        if (((java.util.Map) c62822Ol8.getValue()).get(Integer.valueOf(i)) == null) {
            ((java.util.Map) c62822Ol8.getValue()).put(Integer.valueOf(i), C79045V0n.LJI(i, C97343ru.LIZ));
        }
        return (Integer) ((java.util.Map) c62822Ol8.getValue()).get(Integer.valueOf(i));
    }

    public final SY9 LIZJ(EnumC96553qd enumC96553qd) {
        if (enumC96553qd != null) {
            int i = C96583qg.LIZ[enumC96553qd.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && C43J.LIZLLL()) {
                            C2068389v c2068389v = new C2068389v();
                            c2068389v.LIZ = R.raw.icon_tick_circle;
                            c2068389v.LJ = Integer.valueOf(R.attr.gp);
                            c2068389v.LIZIZ = C96613qj.LIZIZ();
                            c2068389v.LIZJ = C96613qj.LIZIZ();
                            return c2068389v.LIZ(this.LIZ);
                        }
                    } else if (C43J.LIZLLL()) {
                        C2068389v c2068389v2 = new C2068389v();
                        c2068389v2.LIZ = R.raw.icon_arrow_topleft_circle_ltr;
                        c2068389v2.LJ = Integer.valueOf(R.attr.gp);
                        c2068389v2.LIZIZ = C96613qj.LIZIZ();
                        c2068389v2.LIZJ = C96613qj.LIZIZ();
                        return c2068389v2.LIZ(this.LIZ);
                    }
                } else {
                    return LIZIZ();
                }
            } else {
                if (!C43J.LIZLLL()) {
                    C2068389v c2068389v3 = new C2068389v();
                    c2068389v3.LIZ = R.raw.icon_arrow_left_circle_ltr;
                    c2068389v3.LJ = Integer.valueOf(R.attr.gv);
                    c2068389v3.LIZIZ = C96613qj.LIZIZ();
                    c2068389v3.LIZJ = C96613qj.LIZIZ();
                    return c2068389v3.LIZ(this.LIZ);
                }
                C113524cu c113524cu = new C113524cu(this.LIZ, R.raw.icon_spinner_thin);
                c113524cu.LJFF(R.attr.gp, this.LIZ);
                Rect bounds = c113524cu.getBounds();
                bounds.left = 0;
                bounds.right = C96613qj.LIZIZ();
                bounds.top = 0;
                bounds.bottom = C96613qj.LIZIZ();
                c113524cu.LJIIIIZZ();
                return c113524cu;
            }
        }
        return null;
    }

    public static String LIZLLL(Context context, C3TU c3tu) {
        Long LJJIZ;
        Long LJJIZ2;
        long j = 0;
        if (C3TE.LIZIZ()) {
            String timeForDisplay = c3tu.getTimeForDisplay();
            if (timeForDisplay != null && (LJJIZ2 = C38350F3i.LJJIZ(timeForDisplay)) != null) {
                j = LJJIZ2.longValue();
            }
            return C57105Mb7.LIZLLL(j, context);
        }
        String timeForDisplay2 = c3tu.getTimeForDisplay();
        if (timeForDisplay2 != null && (LJJIZ = C38350F3i.LJJIZ(timeForDisplay2)) != null) {
            j = LJJIZ.longValue();
        }
        Locale LIZJ2 = C85999Xp5.LIZJ(context, null, null);
        o.LJIIIIZZ(LIZJ2, "getLocaleSetting(context)");
        return C86036Xpg.LIZLLL(j, LIZJ2, c3tu instanceof C3TP);
    }
}
