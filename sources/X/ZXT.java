package X;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ProgressBar;
import com.zhiliaoapp.musically.R;

/* loaded from: classes29.dex */
public final class ZXT {
    public static int LIZIZ(Context context) {
        int LJII = LJII(R.attr.ay, context);
        if (LJII == 0) {
            return LJFF(context);
        }
        return LJII;
    }

    public static int LIZJ(Context context) {
        if (C07290Qj.LJI(-1, LJI(R.attr.a4r, context)) >= 3.0d) {
            return -1;
        }
        return -570425344;
    }

    public static float LIZLLL(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static int LJFF(Context context) {
        if (LJIIIIZZ(context)) {
            if (LIZJ(context) == -570425344) {
                return R.style.u;
            }
            return R.style.v;
        }
        if (LIZJ(context) == -570425344) {
            return R.style.w;
        }
        return R.style.t;
    }

    public static boolean LJIIIIZZ(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.ai9, typedValue, true) && typedValue.data != 0) {
            return true;
        }
        return false;
    }

    public static Context LIZ(Context context, boolean z) {
        int i;
        if (!z) {
            i = R.attr.a_0;
        } else {
            i = R.attr.vg;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, LJII(i, context));
        if (LJII(R.attr.ay, contextThemeWrapper) != 0) {
            return new ContextThemeWrapper(contextThemeWrapper, LJFF(contextThemeWrapper));
        }
        return contextThemeWrapper;
    }

    public static Drawable LJ(int i, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        Drawable LJFF = C07840Sm.LJFF(obtainStyledAttributes.getDrawable(0));
        if (LJIIIIZZ(context)) {
            C07820Sk.LJI(LJFF, C04330Ez.LIZIZ(context, R.color.a9));
        }
        obtainStyledAttributes.recycle();
        return LJFF;
    }

    public static int LJI(int i, Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.resourceId != 0) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        return typedValue.data;
    }

    public static int LJII(int i, Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static void LJIIIZ(Context context, Dialog dialog) {
        int i;
        View decorView = dialog.getWindow().getDecorView();
        if (LJIIIIZZ(context)) {
            i = R.color.a5;
        } else {
            i = R.color.a4;
        }
        decorView.setBackgroundColor(C04330Ez.LIZIZ(context, i));
    }

    public static void LJIIJ(Context context, ProgressBar progressBar) {
        int i;
        if (!progressBar.isIndeterminate()) {
            return;
        }
        if (LJIIIIZZ(context)) {
            i = R.color.a1;
        } else {
            i = R.color.a0;
        }
        progressBar.getIndeterminateDrawable().setColorFilter(C04330Ez.LIZIZ(context, i), PorterDuff.Mode.SRC_IN);
    }

    public static void LJIIJJI(Context context, C90572Zge c90572Zge, View view) {
        int LIZJ = LIZJ(context);
        if (Color.alpha(LIZJ) != 255) {
            LIZJ = C07290Qj.LJIIIZ(LIZJ, ((Integer) view.getTag()).intValue());
        }
        if (c90572Zge.LJLJJL != LIZJ) {
            Color.alpha(LIZJ);
            c90572Zge.LJLJJL = LIZJ;
        }
        if (c90572Zge.LJLJJLL != LIZJ) {
            Color.alpha(LIZJ);
            c90572Zge.LJLJJLL = LIZJ;
        }
    }
}
