package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;

/* renamed from: X.0YG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0YG {
    public static void LIZ(Context context) {
        if (context != null) {
            context.getTheme().applyStyle(C259710f.LIZ.LJFF(context), false);
        }
    }

    public static String LIZIZ(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.replace((char) 65532, ' ');
    }

    public static LayoutInflater LIZJ(LayoutInflater layoutInflater, int i) {
        return layoutInflater.cloneInContext(new ContextThemeWrapper(layoutInflater.getContext(), i));
    }
}
