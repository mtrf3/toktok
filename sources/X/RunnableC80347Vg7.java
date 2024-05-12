package X;

import android.widget.AutoCompleteTextView;

/* renamed from: X.Vg7, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC80347Vg7 implements Runnable {
    public final /* synthetic */ AutoCompleteTextView LJLIL;
    public final /* synthetic */ C80346Vg6 LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.removeTextChangedListener(this.LJLILLLLZI.LIZ.LIZLLL);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC80347Vg7(C80346Vg6 c80346Vg6, AutoCompleteTextView autoCompleteTextView) {
        this.LJLILLLLZI = c80346Vg6;
        this.LJLIL = autoCompleteTextView;
    }
}
