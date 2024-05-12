package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.jvm.internal.o;

/* renamed from: X.89n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2067589n {
    public ValueAnimator LIZ;
    public boolean LIZIZ;

    public static void LIZ(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View child = viewGroup.getChildAt(i);
                if (child instanceof ViewGroup) {
                    LIZ(child);
                } else {
                    o.LJIIIIZZ(child, "child");
                    LIZIZ(child);
                }
            }
            return;
        }
        LIZIZ(view);
    }

    public static boolean LIZIZ(View view) {
        if (view.getVisibility() == 0 && (view instanceof W5G)) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() != null && !imageView.getDrawable().isVisible()) {
                imageView.getDrawable().setVisible(true, false);
                return true;
            }
        }
        return false;
    }
}
