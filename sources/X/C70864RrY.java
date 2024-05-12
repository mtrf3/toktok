package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.RrY, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70864RrY {
    public static final void LIZ(View view, Integer num, Integer num2, Integer num3) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            if (num != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(num.intValue());
            }
            if (num2 != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = num2.intValue();
            }
            if (num3 != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(num3.intValue());
            }
            view.setLayoutParams(layoutParams);
        }
    }

    public static final void LIZIZ(View view, Integer num, Integer num2, Integer num3) {
        int paddingStart;
        int paddingTop;
        int paddingEnd;
        if (view != null) {
            if (num != null) {
                paddingStart = num.intValue();
            } else {
                paddingStart = view.getPaddingStart();
            }
            if (num2 != null) {
                paddingTop = num2.intValue();
            } else {
                paddingTop = view.getPaddingTop();
            }
            if (num3 != null) {
                paddingEnd = num3.intValue();
            } else {
                paddingEnd = view.getPaddingEnd();
            }
            view.setPadding(paddingStart, paddingTop, paddingEnd, view.getPaddingBottom());
        }
    }
}
