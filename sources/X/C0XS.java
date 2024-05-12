package X;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import kotlin.jvm.internal.o;

/* renamed from: X.0XS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0XS {
    public static final OSZ<Integer, Integer> LIZ = new OSZ<>(0, 0);

    public static final TextDirectionHeuristic LIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                TextDirectionHeuristic FIRSTSTRONG_LTR = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                                o.LJIIIIZZ(FIRSTSTRONG_LTR, "FIRSTSTRONG_LTR");
                                return FIRSTSTRONG_LTR;
                            }
                            TextDirectionHeuristic LOCALE = TextDirectionHeuristics.LOCALE;
                            o.LJIIIIZZ(LOCALE, "LOCALE");
                            return LOCALE;
                        }
                        TextDirectionHeuristic ANYRTL_LTR = TextDirectionHeuristics.ANYRTL_LTR;
                        o.LJIIIIZZ(ANYRTL_LTR, "ANYRTL_LTR");
                        return ANYRTL_LTR;
                    }
                    TextDirectionHeuristic FIRSTSTRONG_RTL = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    o.LJIIIIZZ(FIRSTSTRONG_RTL, "FIRSTSTRONG_RTL");
                    return FIRSTSTRONG_RTL;
                }
                TextDirectionHeuristic FIRSTSTRONG_LTR2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                o.LJIIIIZZ(FIRSTSTRONG_LTR2, "FIRSTSTRONG_LTR");
                return FIRSTSTRONG_LTR2;
            }
            TextDirectionHeuristic RTL = TextDirectionHeuristics.RTL;
            o.LJIIIIZZ(RTL, "RTL");
            return RTL;
        }
        TextDirectionHeuristic LTR = TextDirectionHeuristics.LTR;
        o.LJIIIIZZ(LTR, "LTR");
        return LTR;
    }
}
