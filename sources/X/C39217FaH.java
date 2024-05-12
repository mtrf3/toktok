package X;

import android.view.View;
import android.view.ViewGroup;
import java.io.PrintStream;

/* renamed from: X.FaH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39217FaH {
    public static void LIZ(ViewGroup viewGroup, StringBuilder sb) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                LIZ((ViewGroup) childAt, sb);
            }
            if (childAt != null) {
                if (!(childAt.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                    PrintStream printStream = System.err;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("exception layout params, view:---->");
                    LIZ.append(childAt.toString());
                    LIZ.append(" layout param:");
                    LIZ.append(childAt.getLayoutParams().toString());
                    printStream.println(X1D.LIZIZ(LIZ));
                }
                sb.append("child view info:");
                sb.append(childAt.toString());
                sb.append(" layout params:");
                sb.append(childAt.getLayoutParams().toString());
                sb.append("\n");
            }
        }
    }
}
