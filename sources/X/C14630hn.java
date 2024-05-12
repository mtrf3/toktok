package X;

import android.content.Context;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: X.0hn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14630hn extends View {
    public static volatile Field LJLIL;

    public static void LIZJ(Context context, View view) {
        view.mContext = context;
    }

    public static Field getViewContextField() {
        Field field = LJLIL;
        if (field == null) {
            synchronized (C14630hn.class) {
                field = LJLIL;
                if (field == null) {
                    field = View.class.getDeclaredField("mContext");
                    LJLIL = field;
                }
            }
        }
        return field;
    }

    public static void LIZ(View view) {
        if (view != null) {
            view.onFinishInflate();
        }
    }

    public static void LIZIZ(Context context, View view) {
        if (context != null) {
            try {
                try {
                    LIZJ(context, view);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                Field viewContextField = getViewContextField();
                viewContextField.setAccessible(true);
                viewContextField.set(view, context);
            }
        }
    }
}
