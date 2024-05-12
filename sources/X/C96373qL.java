package X;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.o;

/* renamed from: X.3qL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96373qL {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view) {
        o.LJIIIZ(view, "view");
        Object LLILL = C16880lQ.LLILL(view.getContext(), "input_method");
        o.LJII(LLILL, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) LLILL).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
