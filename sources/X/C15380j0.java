package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.Locale;

/* renamed from: X.0j0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15380j0 {
    public static int LIZ = 1;

    public static Context LIZLLL() {
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        if (iHostAppContext != null) {
            return iHostAppContext.context();
        }
        return null;
    }

    public static boolean LJIILLIIL() {
        if (LIZ == 1) {
            return true;
        }
        return false;
    }

    public static Resources LJIIJ() {
        Context LIZLLL = LIZLLL();
        if (LIZLLL == null) {
            return null;
        }
        return LIZLLL.getResources();
    }

    public static int LJIIJJI() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static int LJIIL() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static final int LJIILIIL() {
        int identifier;
        Context LIZLLL = LIZLLL();
        if (LIZLLL == null || (identifier = LIZLLL.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
            return 0;
        }
        return LIZLLL.getResources().getDimensionPixelSize(identifier);
    }

    public static boolean LJIIZILJ() {
        boolean z;
        boolean z2;
        if (LIZLLL() == null) {
            return false;
        }
        if ((LIZLLL().getApplicationInfo().flags & 4194304) == 4194304) {
            z = true;
        } else {
            z = false;
        }
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public static int LIZ(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static int LIZIZ(int i) {
        Context LIZLLL = LIZLLL();
        if (LIZLLL == null || LIZLLL.getResources() == null) {
            return 0;
        }
        return LIZLLL.getResources().getColor(i);
    }

    public static Bitmap LJ(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth() / 2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    public static int LJFF(int i) {
        Context LIZLLL = LIZLLL();
        if (LIZLLL == null || LIZLLL.getResources() == null) {
            return 0;
        }
        return (int) LIZLLL.getResources().getDimension(i);
    }

    public static Drawable LJI(int i) {
        Context LIZLLL = LIZLLL();
        if (LIZLLL == null) {
            return null;
        }
        try {
            if (LIZLLL.getResources() == null) {
                return null;
            }
            return LIZLLL.getResources().getDrawable(i);
        } catch (Exception unused) {
            return null;
        }
    }

    public static int LJIIIZ(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (activity != null) {
            activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels;
    }

    public static String LJIILJJIL(int i) {
        Context LIZLLL = LIZLLL();
        if (LIZLLL == null) {
            return null;
        }
        return LIZLLL.getString(i);
    }

    public static float LJIJ(int i) {
        return i / Resources.getSystem().getDisplayMetrics().density;
    }

    public static int LIZJ(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            if (!str.startsWith("#")) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("#");
                LIZ2.append(str);
                str = X1D.LIZIZ(LIZ2);
            }
            return Color.parseColor(str);
        } catch (IllegalArgumentException unused) {
            return i;
        }
    }

    public static String LJII(int i, int i2) {
        Context LIZLLL = LIZLLL();
        String str = null;
        if (LIZLLL == null) {
            return null;
        }
        try {
            str = LIZLLL.getResources().getQuantityString(i, i2);
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    public static String LJIILL(int i, Object... objArr) {
        Context LIZLLL = LIZLLL();
        if (LIZLLL == null) {
            return null;
        }
        return LIZLLL.getString(i, objArr);
    }

    public static String LJIIIIZZ(int i, int i2, Object... objArr) {
        Context LIZLLL = LIZLLL();
        if (LIZLLL != null) {
            try {
                return LIZLLL.getResources().getQuantityString(i, i2, objArr);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
