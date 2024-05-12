package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.o;

/* renamed from: X.9UE */
/* loaded from: classes5.dex */
public final class C9UE {
    public static final /* synthetic */ int LIZ = 0;

    public static /* synthetic */ void LIZIZ(Context context) {
        View view;
        Activity LJIJJ;
        Window window;
        View decorView;
        if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null && (window = LJIJJ.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            view = decorView.findFocus();
        } else {
            view = null;
        }
        LIZ(context, view);
    }

    public static final void LIZ(Context context, View view) {
        if (context == null || view == null) {
            return;
        }
        try {
            Object LLILL = C16880lQ.LLILL(context, "input_method");
            o.LJII(LLILL, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) LLILL).hideSoftInputFromWindow(view.getWindowToken(), 0);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        view.clearFocus();
    }
}
