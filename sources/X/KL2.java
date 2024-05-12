package X;

import Y.ARunnableS0S0104000_3;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Toast;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.common.utility.Logger;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes9.dex */
public final class KL2 {
    public static String LIZ = "";
    public static int LIZIZ = -1;

    public static boolean LJIILIIL() {
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            return true;
        }
        return false;
    }

    public static void LIZ(View view) {
        if (view.getAnimation() == null) {
            return;
        }
        view.clearAnimation();
    }

    public static void LIZIZ(View view) {
        if (view == null || view.getParent() == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            return;
        }
        try {
            C16880lQ.LJLLL(view, (ViewGroup) parent);
        } catch (Exception e) {
            Logger.throwException(e);
        }
    }

    public static int LJIIIIZZ(Context context) {
        if (LIZIZ == -1 && context != null) {
            LIZIZ = C16880lQ.LLLLL(context).getResources().getDisplayMetrics().densityDpi;
        }
        return LIZIZ;
    }

    public static int LJIIIZ(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return 0;
        }
        return displayMetrics.heightPixels;
    }

    public static String LJIIJ(Context context) {
        if (C38354F3m.LJ(LIZ) && context != null) {
            int LJIIJJI = LJIIJJI(context);
            int LJIIIZ = LJIIIZ(context);
            if (LJIIJJI > 0 && LJIIIZ > 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LJIIJJI);
                LIZ2.append("*");
                LIZ2.append(LJIIIZ);
                LIZ = X1D.LIZIZ(LIZ2);
            }
        }
        return LIZ;
    }

    public static int LJIIJJI(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return 0;
        }
        return displayMetrics.widthPixels;
    }

    public static int LJIIL(Context context) {
        int identifier;
        if (context == null || (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(identifier);
    }

    public static boolean LJIILJJIL(View view) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public static float LIZJ(Context context, float f) {
        if (context != null) {
            return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
        }
        return 0.0f;
    }

    public static void LIZLLL(int i, Context context) {
        LJ(context, 0, context.getString(i));
    }

    public static void LJI(int i, Context context) {
        LJ(context, R.drawable.cpa, context.getString(i));
    }

    public static int LJIILL(Context context, float f) {
        if (context != null) {
            return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
        }
        return 0;
    }

    public static void LJIILLIIL(int i, View view) {
        if (view != null && view.getVisibility() != i) {
            if (i == 0 || i == 8 || i == 4) {
                view.setVisibility(i);
            }
        }
    }

    public static float LJIIZILJ(Context context, float f) {
        if (context != null) {
            return TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    public static void LJ(Context context, int i, String str) {
        LJFF(context, i, 0, 17, str);
    }

    public static void LJIJ(int i, int i2, View view) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            if (layoutParams.width == i && layoutParams.height == i2) {
                return;
            }
            if (i != -3) {
                layoutParams.width = i;
            }
            if (i2 != -3) {
                layoutParams.height = i2;
            }
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJFF(Context context, int i, int i2, int i3, String str) {
        if (context == 0 || C38354F3m.LJ(str)) {
            return;
        }
        if (!LJIILIIL()) {
            new Handler(C16880lQ.LLJJJJ()).post(new RunnableC46371IHv(context, i, i2, i3, str));
            return;
        }
        if (context instanceof KL3) {
            if (i2 == 1) {
                ((KL3) context).showCustomLongToast(i, str);
                return;
            }
            KL3 kl3 = (KL3) context;
            if (i2 == 0) {
                i2 = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
            }
            kl3.showCustomToast(i, str, i2, i3);
            return;
        }
        try {
            Toast makeText = Toast.makeText(context, str, i2);
            if (makeText == null) {
                return;
            }
            makeText.setGravity(i3, 0, 0);
            C16880lQ.LLZILL(makeText);
        } catch (Exception e) {
            Logger.throwException(e);
        }
    }

    public static void LJII(TuxIconView tuxIconView, int i, int i2, int i3, int i4) {
        tuxIconView.post(new ARunnableS0S0104000_3(tuxIconView, i2, i4, i, i3, 1));
    }
}
