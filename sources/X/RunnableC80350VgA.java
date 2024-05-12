package X;

import android.widget.EditText;

/* renamed from: X.VgA, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC80350VgA implements Runnable {
    public final /* synthetic */ EditText LJLIL;
    public final /* synthetic */ C80349Vg9 LJLILLLLZI;

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

    public RunnableC80350VgA(C80349Vg9 c80349Vg9, EditText editText) {
        this.LJLILLLLZI = c80349Vg9;
        this.LJLIL = editText;
    }
}
