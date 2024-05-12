package X;

import android.view.View;
import android.widget.PopupWindow;

/* renamed from: X.0qI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19900qI extends PopupWindow {
    public int LIZ;

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        try {
            super.dismiss();
        } catch (Throwable unused) {
        }
        View contentView = getContentView();
        if (contentView != null) {
            Object parent = contentView.getParent();
            if (parent instanceof View) {
                View view = (View) parent;
                if (view.getVisibility() != 0) {
                    view.setVisibility(0);
                }
            }
        }
    }

    public C19900qI(C43591nP c43591nP) {
        super(c43591nP);
        this.LIZ = 3;
    }
}
