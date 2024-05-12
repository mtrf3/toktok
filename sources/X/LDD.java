package X;

import android.animation.Animator;
import android.view.View;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LDD {
    public static final java.util.Map<String, LDE> LIZ = new LinkedHashMap();

    public static void LIZ(String tag, LDE lde) {
        o.LJIIIZ(tag, "tag");
        java.util.Map<String, LDE> map = LIZ;
        if (map.containsKey(tag)) {
            return;
        }
        map.put(tag, lde);
    }

    public static final void LIZIZ(String tag, Animator animator, View view) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(animator, "animator");
        LDE lde = (LDE) ((LinkedHashMap) LIZ).get(tag);
        if (lde != null) {
            if (!lde.y4() && view != null) {
                view.setVisibility(8);
            }
            if (lde.enable()) {
                lde.LIZ();
                animator.start();
            }
        }
    }
}
