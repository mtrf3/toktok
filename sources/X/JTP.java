package X;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes9.dex */
public final class JTP {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(JTQ.LJLIL);

    public static void LIZ(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                LIZ((ViewGroup) childAt);
                if (childAt instanceof C60726NsQ) {
                    ((C60726NsQ) childAt).LJI(true);
                }
            }
        }
    }
}
