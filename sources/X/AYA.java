package X;

import Y.ARunnableS7S0201000_4;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes5.dex */
public final class AYA {
    public static void LIZIZ(View view) {
        if (view != null) {
            view.getLayoutParams().height = C63081OpJ.LJJJJLI(view.getContext());
        }
    }

    public static void LIZ(Activity activity, View view) {
        if (activity == null) {
            return;
        }
        ((InputMethodManager) C16880lQ.LLILIL(activity, "input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void LIZJ(int i, View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) C16880lQ.LLILL(view.getContext(), "input_method");
        if (!inputMethodManager.showSoftInput(view, i)) {
            view.postDelayed(new ARunnableS7S0201000_4(i, inputMethodManager, view, 4), 100L);
        }
    }
}
