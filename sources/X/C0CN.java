package X;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: X.0CN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0CN {
    public static final ViewGroup.MarginLayoutParams LIZIZ;
    public final LinearLayoutManager LIZ;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        LIZIZ = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public C0CN(LinearLayoutManager linearLayoutManager) {
        this.LIZ = linearLayoutManager;
    }

    public static boolean LIZ(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (LIZ(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }
}
