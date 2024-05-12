package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.TDb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74275TDb {
    public static final /* synthetic */ int LIZ = 0;

    public static final float LIZ(float f) {
        Resources system = Resources.getSystem();
        o.LJIIIIZZ(system, "Resources.getSystem()");
        return (f * system.getDisplayMetrics().density) + 0.5f;
    }

    public static final int LIZLLL(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        o.LJIIIIZZ(resources, "context.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (displayMetrics == null) {
            return 0;
        }
        return displayMetrics.heightPixels;
    }

    public static final int LJ(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        o.LJIIIIZZ(resources, "context.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (displayMetrics == null) {
            return 0;
        }
        return displayMetrics.widthPixels;
    }

    public static final boolean LJFF(Context context) {
        o.LJIIIZ(context, "context");
        Resources resources = context.getResources();
        o.LJIIIIZZ(resources, "resources");
        Configuration configuration = resources.getConfiguration();
        o.LJIIIIZZ(configuration, "configuration");
        if (configuration.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean LJI(View view) {
        o.LJIIIZ(view, "view");
        if (C16310kV.LIZLLL(view) == 1) {
            return true;
        }
        return false;
    }

    public static final float LIZIZ(Context context, float f) {
        o.LJIIIZ(context, "context");
        Resources resources = context.getResources();
        o.LJIIIIZZ(resources, "context.resources");
        return (f * resources.getDisplayMetrics().density) + 0.5f;
    }

    public static int LIZJ(double d, Context context) {
        o.LJIIIZ(context, "context");
        o.LJIIIIZZ(context.getResources(), "context.resources");
        return (int) ((d * r1.getDisplayMetrics().density) + 0.5f);
    }

    public static final int LJII(Context context, float f) {
        o.LJIIIZ(context, "context");
        Resources resources = context.getResources();
        o.LJIIIIZZ(resources, "context.resources");
        return (int) ((f / resources.getDisplayMetrics().density) + 0.5f);
    }
}
