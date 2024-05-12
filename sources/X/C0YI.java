package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0YI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0YI {
    public static String LIZ(View view) {
        if (view == null) {
            return "null";
        }
        if (view.getId() == -1) {
            return "no-id";
        }
        try {
            String resourceName = view.getResources().getResourceName(view.getId());
            int indexOf = resourceName.indexOf("id/");
            if (indexOf >= 0) {
                return resourceName.substring(indexOf + 3);
            }
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return "id-not-found";
        }
    }

    public static String LIZIZ(ViewGroup viewGroup) {
        StringBuilder sb = new StringBuilder(100);
        sb.append(LIZ(viewGroup));
        sb.append("[");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            sb.append(LIZ(childAt));
            sb.append("(");
            if (childAt == null) {
                sb.append("null");
            } else {
                sb.append(C16880lQ.LJLLJ(childAt.getClass()));
            }
            sb.append(")");
            if (i < childCount - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
