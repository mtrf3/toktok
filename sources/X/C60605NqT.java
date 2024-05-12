package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.LocaleList;
import android.os.PowerManager;
import android.provider.Settings;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.NqT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60605NqT {
    public static int LIZ;

    public static String LIZ() {
        Locale locale;
        if (Build.VERSION.SDK_INT >= 24) {
            locale = LocaleList.getDefault().get(0);
            o.LJFF(locale, "LocaleList.getDefault()[0]");
        } else {
            locale = Locale.getDefault();
            o.LJFF(locale, "Locale.getDefault()");
        }
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(locale.getLanguage());
            LIZ2.append("-");
            C39399FdD.LIZIZ.getClass();
            LIZ2.append(C39567Ffv.LIZIZ(locale));
            return X1D.LIZIZ(LIZ2);
        } catch (Q0C unused) {
            return "";
        } catch (Throwable unused2) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(locale.getLanguage());
            LIZ3.append("-");
            LIZ3.append(locale.getCountry());
            return X1D.LIZIZ(LIZ3);
        }
    }

    public static int LIZIZ(Context context) {
        o.LJIIJ(context, "context");
        return LIZJ(context);
    }

    public static int LIZJ(Context context) {
        o.LJIIJ(context, "context");
        try {
            if (LIZLLL(context)[1] > 0) {
                return LIZLLL(context)[1];
            }
        } catch (Throwable unused) {
        }
        return 0;
    }

    public static int[] LIZLLL(Context context) {
        if (context == null) {
            return new int[]{-1, -1};
        }
        try {
            Object LLILL = C16880lQ.LLILL(context, "window");
            if (LLILL != null) {
                Display defaultDisplay = ((WindowManager) LLILL).getDefaultDisplay();
                Point point = new Point();
                if (defaultDisplay == null) {
                    return new int[]{-1, -1};
                }
                defaultDisplay.getRealSize(point);
                return new int[]{point.x, point.y};
            }
            throw new C37692Eqm("null cannot be cast to non-null type android.view.WindowManager");
        } catch (Exception e) {
            C39048FUe c39048FUe = C39048FUe.LIZIZ;
            String message = e.getMessage();
            if (message == null) {
                message = e.toString();
            }
            c39048FUe.LIZ(message, EnumC39866Fkk.E, "DevicesUtil");
            return new int[]{-1, -1};
        }
    }

    public static int LJ(Context context) {
        o.LJIIJ(context, "context");
        return LJFF(context);
    }

    public static int LJFF(Context context) {
        o.LJIIJ(context, "context");
        try {
            if (LIZLLL(context)[0] <= 0) {
                return 0;
            }
            return LIZLLL(context)[0];
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int LJI(Context context) {
        int LIZ2;
        o.LJIIJ(context, "context");
        int i = LIZ;
        if (i > 0) {
            return i;
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0 || (LIZ2 = context.getResources().getDimensionPixelSize(identifier)) == 0) {
            LIZ2 = (int) C92923km.LIZ(context, 25.0f);
        }
        LIZ = LIZ2;
        return LIZ2;
    }

    public static boolean LJII(Context context) {
        o.LJIIJ(context, "context");
        if (Build.VERSION.SDK_INT <= 21) {
            return false;
        }
        try {
            Object LLILL = C16880lQ.LLILL(context, "power");
            if (!(LLILL instanceof PowerManager)) {
                LLILL = null;
            }
            PowerManager powerManager = (PowerManager) LLILL;
            if (powerManager == null) {
                return false;
            }
            return powerManager.isPowerSaveMode();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean LJIIIIZZ(Context context) {
        o.LJIIJ(context, "context");
        Resources resources = context.getResources();
        o.LJFF(resources, "context.resources");
        if ((resources.getConfiguration().screenLayout & 15) >= 3) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIZ(Context context) {
        o.LJIIJ(context, "context");
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "touch_exploration_enabled", 0) == 0) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C39048FUe c39048FUe = C39048FUe.LIZIZ;
            String message = th.getMessage();
            if (message == null) {
                message = "get talk back status failed";
            }
            c39048FUe.LIZ(message, EnumC39866Fkk.E, "DevicesUtil");
            return false;
        }
    }

    public static int LJIIJ(double d, Context context) {
        o.LJIIJ(context, "context");
        o.LJFF(context.getResources(), "context.resources");
        return (int) ((d / r1.getDisplayMetrics().density) + 0.5f);
    }

    public static int LJIIJJI(Activity activity, int i) {
        int LJIIJ;
        try {
            Rect rect = new Rect();
            Window window = activity.getWindow();
            o.LJFF(window, "context.window");
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            if (LJIIJ(rect.top, activity) >= i) {
                LJIIJ = LJIIJ(rect.height(), activity);
            } else {
                LJIIJ = LJIIJ(rect.height(), activity) - i;
            }
            return LJIIJ;
        } catch (Throwable th) {
            C39048FUe c39048FUe = C39048FUe.LIZIZ;
            String message = th.getMessage();
            if (message == null) {
                message = th.toString();
            }
            c39048FUe.LIZ(message, EnumC39866Fkk.E, "DevicesUtil");
            Resources resources = activity.getResources();
            o.LJFF(resources, "context.resources");
            return resources.getDisplayMetrics().heightPixels;
        }
    }
}
