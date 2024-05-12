package X;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.Vee, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80256Vee {
    public static RectF LIZ(C80261Vej c80261Vej, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!c80261Vej.isTabIndicatorFullWidth() && (view instanceof C80267Vep)) {
            C80267Vep c80267Vep = (C80267Vep) view;
            int contentWidth = c80267Vep.getContentWidth();
            int contentHeight = c80267Vep.getContentHeight();
            int LIZIZ = (int) C80250VeY.LIZIZ(24, c80267Vep.getContext());
            if (contentWidth < LIZIZ) {
                contentWidth = LIZIZ;
            }
            int right = (c80267Vep.getRight() + c80267Vep.getLeft()) / 2;
            int bottom = (c80267Vep.getBottom() + c80267Vep.getTop()) / 2;
            int i = contentWidth / 2;
            return new RectF(right - i, bottom - (contentHeight / 2), i + right, (right / 2) + bottom);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public void LIZIZ(C80261Vej c80261Vej, View view, View view2, float f, Drawable drawable) {
        RectF LIZ = LIZ(c80261Vej, view);
        RectF LIZ2 = LIZ(c80261Vej, view2);
        drawable.setBounds(C80237VeL.LIZ(f, (int) LIZ.left, (int) LIZ2.left), drawable.getBounds().top, C80237VeL.LIZ(f, (int) LIZ.right, (int) LIZ2.right), drawable.getBounds().bottom);
    }
}
