package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.o;

/* renamed from: X.aVg, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93736aVg {
    public static void LIZ(Context context) {
        if (context == null) {
            return;
        }
        try {
            Object LLILL = C16880lQ.LLILL(context, "input_method");
            if (LLILL != null) {
                Window window = ((Activity) context).getWindow();
                o.LJIIIIZZ(window, "(context as Activity).window");
                View decorView = window.getDecorView();
                o.LJIIIIZZ(decorView, "(context as Activity).window.decorView");
                ((InputMethodManager) LLILL).hideSoftInputFromWindow(decorView.getWindowToken(), 0);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            C94034aaU.LIZLLL(message);
        }
    }

    public static void LIZIZ(Context context, View view) {
        o.LJIIIZ(view, "view");
        if (context != null) {
            try {
                Object LLILL = C16880lQ.LLILL(context, "input_method");
                if (LLILL != null) {
                    ((InputMethodManager) LLILL).showSoftInput(view, 1);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            } catch (Exception e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                C94034aaU.LIZLLL(message);
            }
        }
    }
}
