package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.4H1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4H1 {
    public static void LIZ(ViewGroup viewGroup, StringBuilder sb) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                LIZ((ViewGroup) childAt, sb);
            }
            if (childAt != null) {
                sb.append("child view info:");
                sb.append(childAt.toString());
                sb.append("\n");
            }
        }
    }
}
