package X;

import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: X.77g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1806877g {
    public static final void LIZ(AppCompatTextView appCompatTextView) {
        int i;
        if (appCompatTextView != null) {
            boolean LIZIZ = C90193gN.LIZIZ(appCompatTextView.getContext());
            appCompatTextView.setTextDirection(2);
            if (LIZIZ) {
                i = 5;
            } else {
                i = 3;
            }
            appCompatTextView.setGravity(i);
        }
    }
}
