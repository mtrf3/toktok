package X;

import com.ss.android.ugc.aweme.experiment.NewPopupRules;
import kotlin.jvm.internal.o;

/* renamed from: X.Kta, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53154Kta {
    public static final NewPopupRules LIZ = new NewPopupRules(0, 0, null, null, 15, null);

    public static NewPopupRules LIZ() {
        FFL LJIIIZ = FFL.LJIIIZ();
        NewPopupRules newPopupRules = LIZ;
        LJIIIZ.getClass();
        NewPopupRules newPopupRules2 = (NewPopupRules) FFL.LJIJ(true, "permission_pop_up_frequency_control_reask", 31744, NewPopupRules.class, newPopupRules);
        if (newPopupRules2 != null) {
            newPopupRules = newPopupRules2;
        }
        o.LJIIIIZZ(newPopupRules, "ABManager.getInstance().…k::class.java) ?: DEFAULT");
        return newPopupRules;
    }
}
