package X;

import android.view.View;

/* renamed from: X.0YF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0YF {
    public static void LIZ(final View.OnClickListener onClickListener, View view) {
        if (view != null) {
            if (onClickListener == null) {
                C16880lQ.LJIIJ(null, view);
            } else {
                C16880lQ.LJIIJ(new C0YE() { // from class: X.1Oh
                    @Override // X.C0YE
                    public final void LIZ(View view2) {
                        onClickListener.onClick(view2);
                    }
                }, view);
            }
        }
    }
}
