package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import defpackage.g0;
import java.util.List;

/* renamed from: X.0j3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15410j3 {
    public static volatile Boolean LIZ;
    public static volatile Boolean LIZIZ;

    public static boolean LIZ(Context context) {
        ActivityC45651qj LJIILL = g0.LJIILL(context);
        if (LJIILL == null || Build.VERSION.SDK_INT < 28) {
            return false;
        }
        View decorView = LJIILL.getWindow().getDecorView();
        try {
            Object invoke = decorView.getClass().getMethod("getRootWindowInsets", new Class[0]).invoke(decorView, new Object[0]);
            Object invoke2 = invoke.getClass().getDeclaredMethod("getDisplayCutout", new Class[0]).invoke(invoke, new Object[0]);
            List list = (List) invoke2.getClass().getMethod("getBoundingRects", new Class[0]).invoke(invoke2, new Object[0]);
            if (list == null) {
                return false;
            }
            if (list.size() <= 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    public static boolean LIZIZ(Context context) {
        boolean z;
        String string;
        try {
            if (LIZIZ != null) {
                return LIZIZ.booleanValue();
            }
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
            if (identifier > 0 && (string = resources.getString(identifier)) != null && !TextUtils.isEmpty(string)) {
                z = true;
            } else {
                z = false;
            }
            LIZIZ = Boolean.valueOf(z);
            return LIZIZ.booleanValue();
        } catch (Exception unused) {
            LIZIZ = Boolean.FALSE;
            return false;
        }
    }

    public static boolean LIZJ(Context context) {
        boolean z = false;
        if (context instanceof Activity) {
            if (LIZ == null) {
                if (LIZ(context) || new C18340nm(context).LIZ || LIZIZ(context)) {
                    z = true;
                }
                LIZ = Boolean.valueOf(z);
            }
            return LIZ.booleanValue();
        }
        if (!LIZ(context) && !new C18340nm(context).LIZ && !LIZIZ(context)) {
            return false;
        }
        return true;
    }
}
