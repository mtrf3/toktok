package X;

import android.widget.EditText;

/* renamed from: X.Vfp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC80329Vfp implements Runnable {
    public final /* synthetic */ EditText LJLIL;
    public final /* synthetic */ C80328Vfo LJLILLLLZI;

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

    public RunnableC80329Vfp(C80328Vfo c80328Vfo, EditText editText) {
        this.LJLILLLLZI = c80328Vfo;
        this.LJLIL = editText;
    }
}
