package X;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.9ov, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC248379ov implements Runnable {
    public final /* synthetic */ View LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            ((InputMethodManager) C16880lQ.LLILL(this.LJLIL.getContext(), "input_method")).showSoftInput(this.LJLIL, 1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC248379ov(View view) {
        this.LJLIL = view;
    }
}
