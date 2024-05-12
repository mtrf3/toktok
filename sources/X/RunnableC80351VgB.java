package X;

import android.widget.AutoCompleteTextView;

/* renamed from: X.VgB, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC80351VgB implements Runnable {
    public final /* synthetic */ AutoCompleteTextView LJLIL;
    public final /* synthetic */ C80344Vg4 LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            boolean isPopupShowing = this.LJLIL.isPopupShowing();
            this.LJLILLLLZI.LJLIL.LJ(isPopupShowing);
            this.LJLILLLLZI.LJLIL.LJIIIIZZ = isPopupShowing;
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC80351VgB(C80344Vg4 c80344Vg4, AutoCompleteTextView autoCompleteTextView) {
        this.LJLILLLLZI = c80344Vg4;
        this.LJLIL = autoCompleteTextView;
    }
}
