package X;

import X.AUS;
import X.L4O;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class L4V<STATE extends L4O, VARIANT extends AUS> implements L21<STATE, VARIANT> {
    public static View LJ(L4V l4v, L4T nodeType, L69 l69) {
        l4v.getClass();
        o.LJIIIZ(nodeType, "nodeType");
        if (l69 == null || l69.getCurrentActiveBusiness().get(l4v.LIZ()) == null) {
            return null;
        }
        if (nodeType == L4T.AVATAR) {
            return l69.getAvatar();
        }
        return l69.findViewById(C79234V7u.LJIIJJI(l4v.LIZ(), nodeType, null, null));
    }
}
