package X;

import android.view.View;
import java.util.HashMap;

/* renamed from: X.0ly, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17220ly {
    public static Object LIZ(View view, String str) {
        Object obj;
        if (view != null) {
            Object tag = view.getTag();
            if ((tag instanceof C17210lx) && (obj = ((HashMap) tag).get(str)) != null) {
                return obj;
            }
        }
        return null;
    }

    public static void LIZIZ(View view, final String str, final Object obj) {
        if (view != null) {
            Object tag = view.getTag();
            if (tag instanceof C17210lx) {
                ((HashMap) tag).put(str, obj);
            } else {
                view.setTag(new HashMap<String, Object>(str, obj) { // from class: X.0lx
                    {
                        put(str, obj);
                    }
                });
            }
        }
    }
}
