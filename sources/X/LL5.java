package X;

import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LL5 {
    public static int LIZIZ() {
        return ((Number) LQU.LJ.getValue()).intValue();
    }

    public static void LIZJ(ActivityC45651qj activity, InterfaceC54132LMi interfaceC54132LMi) {
        LLQ Xm0;
        IMFToolBarAbility LJIJJ;
        o.LJIIIZ(activity, "activity");
        if (C40471FuV.LIZ()) {
            MainActivityScope LJJLIIIJJI = C78866UxK.LJJLIIIJJI(activity);
            if (LJJLIIIJJI != null && (LJIJJ = C78923UyF.LJIJJ(LJJLIIIJJI)) != null) {
                LJIJJ.LLJ("USER");
                return;
            }
            return;
        }
        if (interfaceC54132LMi != null && (Xm0 = interfaceC54132LMi.Xm0()) != null) {
            Xm0.LJIILL("USER");
        }
    }

    public static void LIZLLL(ActivityC45651qj activity, InterfaceC54132LMi interfaceC54132LMi) {
        LLQ Xm0;
        IMFToolBarAbility LJIJJ;
        o.LJIIIZ(activity, "activity");
        if (C40471FuV.LIZ()) {
            MainActivityScope LJJLIIIJJI = C78866UxK.LJJLIIIJJI(activity);
            if (LJJLIIIJJI != null && (LJIJJ = C78923UyF.LJIJJ(LJJLIIIJJI)) != null) {
                LJIJJ.LLZLLIL("USER");
                return;
            }
            return;
        }
        if (interfaceC54132LMi != null && (Xm0 = interfaceC54132LMi.Xm0()) != null) {
            Xm0.LJJIJIIJIL("USER");
        }
    }

    public static void LIZ(ActivityC45651qj activityC45651qj, InterfaceC54132LMi interfaceC54132LMi, int i) {
        LLQ Xm0;
        IMFToolBarAbility LJIJJ;
        if (C40471FuV.LIZ()) {
            MainActivityScope LJJLIIIJJI = C78866UxK.LJJLIIIJJI(activityC45651qj);
            if (LJJLIIIJJI != null && (LJIJJ = C78923UyF.LJIJJ(LJJLIIIJJI)) != null) {
                LJIJJ.S3(i, "USER");
                return;
            }
            return;
        }
        if (interfaceC54132LMi != null && (Xm0 = interfaceC54132LMi.Xm0()) != null) {
            Xm0.LJ(i, "USER");
        }
    }
}
