package X;

import android.view.View;

/* renamed from: X.Vmf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80753Vmf {
    public static void LIZ(View view, int i, int i2, int i3, int i4) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = (((i3 - i) - measuredWidth) / 2) + i;
        int i6 = (((i4 - i2) - measuredHeight) / 2) + i2;
        view.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }
}
