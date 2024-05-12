package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.JQt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49151JQt {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, View view) {
        o.LJIIIZ(context, "context");
        Resources resources = context.getResources();
        o.LJIIIIZZ(resources, "context.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        o.LJIIIIZZ(displayMetrics, "context.resources.displayMetrics");
        if (((int) (J83.LIZIZ(context) / displayMetrics.density)) < 756) {
            view.setScaleX(0.75f);
            view.setScaleY(0.75f);
        }
    }
}
