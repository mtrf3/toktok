package X;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.435, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass435 {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(Context context, View view) {
        InputMethodManager inputMethodManager;
        if (context == null || view == null) {
            return;
        }
        Object LLILL = C16880lQ.LLILL(context, "input_method");
        if (!(LLILL instanceof InputMethodManager) || (inputMethodManager = (InputMethodManager) LLILL) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
