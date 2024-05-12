package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: X.J8i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48672J8i {
    public static Activity LIZ(Context context) {
        if (context == null) {
            return null;
        }
        if (Activity.class.isInstance(context)) {
            return (Activity) context;
        }
        if (!ContextWrapper.class.isInstance(context)) {
            return null;
        }
        return LIZ(((ContextWrapper) context).getBaseContext());
    }

    public static void LIZIZ(C79985VaH c79985VaH, Object obj) {
        if (c79985VaH != null) {
            try {
                Object obj2 = null;
                if (java.util.Map.class.isInstance(null)) {
                    obj2 = java.util.Map.class.cast(null);
                }
                java.util.Map map = (java.util.Map) obj2;
                if (map != null) {
                    map.put("release_reason", obj);
                }
            } catch (Exception unused) {
            }
        }
    }
}
