package X;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.3oF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95073oF {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.bottomMargin = (int) KL2.LIZJ(view.getContext(), i);
            view.setLayoutParams(marginLayoutParams);
        }
    }
}
