package X;

import android.view.PointerIcon;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.04E, reason: invalid class name */
/* loaded from: classes.dex */
public final class C04E {
    public static final C04E LIZ = new C04E();

    public static final void LIZ(View view, C11M c11m) {
        PointerIcon systemIcon;
        o.LJIIIZ(view, "view");
        if (c11m instanceof C37451dV) {
            c11m.getClass();
            systemIcon = null;
        } else if (c11m instanceof C37461dW) {
            systemIcon = PointerIcon.getSystemIcon(view.getContext(), ((C37461dW) c11m).LIZ);
        } else {
            systemIcon = PointerIcon.getSystemIcon(view.getContext(), 1000);
        }
        if (!o.LJ(view.getPointerIcon(), systemIcon)) {
            view.setPointerIcon(systemIcon);
        }
    }
}
