package X;

import Y.ACallableS38S1200000_9;
import android.os.Bundle;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LIA {
    public static String LIZ = "";
    public static int LIZIZ;
    public static int LIZJ;
    public static int LIZLLL;

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.String] */
    public static void LIZ(Bundle args, ActivityC45651qj activityC45651qj) {
        IBottomTabLayoutAbility LJIIIIZZ;
        o.LJIIIZ(args, "args");
        C68322mC c68322mC = new C68322mC();
        ?? string = args.getString("enter_method", "");
        c68322mC.element = string;
        if (string == 0 || string.length() == 0 || o.LJ(c68322mC.element, "duplicated")) {
            return;
        }
        String LJ = C54024LIe.LJ(activityC45651qj, LIZ, null);
        T enterMethod = c68322mC.element;
        o.LJIIIIZZ(enterMethod, "enterMethod");
        if (o.LJ(enterMethod, "click_top")) {
            c68322mC.element = "click_top_icon";
        } else if (o.LJ(enterMethod, "click_bottom")) {
            c68322mC.element = "click_button_icon";
            ActivityC45651qj LIZLLL2 = StateOwner.LJLIL.LIZLLL();
            if (LIZLLL2 != null && (LJIIIIZZ = C53976LGi.LJIIIIZZ(LIZLLL2)) != null) {
                LJIIIIZZ.Hj0();
            }
        }
        C10K.LIZJ(new ACallableS38S1200000_9(activityC45651qj, LJ, c68322mC, 1));
    }
}
