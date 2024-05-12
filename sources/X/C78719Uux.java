package X;

import android.view.View;

/* renamed from: X.Uux, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78719Uux implements C0C4 {
    @Override // X.C0C4
    public final void LIZ(View view, float f) {
        float f2;
        View view2 = (View) view.getParent();
        int left = (view.getLeft() - view2.getPaddingLeft()) - view2.getScrollX();
        int measuredWidth = (view2.getMeasuredWidth() - view2.getPaddingLeft()) - view2.getPaddingRight();
        if (measuredWidth != 0) {
            f2 = left / measuredWidth;
        } else {
            f2 = 0.0f;
        }
        float min = Math.min(9.0f, Math.max(-9.0f, f2 * 9.0f));
        view.setCameraDistance(1280.0f);
        view.setRotationY(-min);
    }
}
