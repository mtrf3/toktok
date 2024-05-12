package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.Oo9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnTouchListenerC63009Oo9 implements View.OnTouchListener {
    public static final ViewOnTouchListenerC63009Oo9 LJLIL = new ViewOnTouchListenerC63009Oo9();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        o.LJII(view, "null cannot be cast to non-null type android.webkit.WebView");
        ((ViewGroup) view).requestDisallowInterceptTouchEvent(true);
        return false;
    }
}
