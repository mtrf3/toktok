package X;

import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T7F {
    public static final /* synthetic */ T7F LIZ = new T7F();

    public static void LIZIZ(String str, boolean z) {
        String str2;
        C188727au LIZLLL = KNV.LIZLLL(str, "questionId");
        if (z) {
            str2 = "qa_personal_profile";
        } else {
            str2 = "qa_others_profile";
        }
        LIZLLL.LJIIIZ("enter_from", str2);
        LIZLLL.LJIIIZ("question_id", str);
        FMX.LJIIL("tap_question", LIZLLL.LIZ);
    }

    public static void LIZ(String questionId, T7H bottomSheetActionEnum, boolean z) {
        T7G t7g;
        String str;
        o.LJIIIZ(questionId, "questionId");
        o.LJIIIZ(bottomSheetActionEnum, "bottomSheetActionEnum");
        T7G.Companion.getClass();
        int i = T7J.LIZ[bottomSheetActionEnum.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        t7g = T7G.VIEW_MORE_ANSWERS;
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    t7g = T7G.DELETE;
                }
            } else {
                t7g = T7G.TRANSLATE;
            }
        } else {
            t7g = T7G.SHOW_ORIGINAL;
        }
        C188727au c188727au = new C188727au();
        if (z) {
            str = "qa_personal_profile";
        } else {
            str = "qa_others_profile";
        }
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("question_id", questionId);
        String lowerCase = t7g.name().toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        c188727au.LJIIIZ("question_type", lowerCase);
        FMX.LJIIL("click_qa_option", c188727au.LIZ);
    }
}
