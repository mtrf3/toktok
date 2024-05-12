package X;

import android.app.Activity;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Loq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55408Loq {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(Activity activity, int i) {
        o.LJIIIZ(activity, "activity");
        if (i != -1) {
            return;
        }
        C06O.LIZIZ(activity);
        View decorView = activity.getWindow().getDecorView();
        o.LJIIIIZZ(decorView, "activity.window.decorView");
        decorView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC55413Lov(decorView, activity));
    }
}
