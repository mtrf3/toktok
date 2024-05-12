package X;

import android.content.Context;
import android.graphics.Typeface;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.aVB, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93705aVB {
    public final ConcurrentHashMap LIZ = new ConcurrentHashMap();

    static {
        C16880lQ.LJLLJ(C93705aVB.class);
    }

    public static Typeface LIZ(Context context, String str) {
        C93705aVB c93705aVB = C93706aVC.LIZ;
        ConcurrentHashMap concurrentHashMap = c93705aVB.LIZ;
        if (concurrentHashMap != null) {
            Typeface typeface = (Typeface) concurrentHashMap.get(str);
            if (typeface == null) {
                Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), str);
                if (createFromAsset != null) {
                    c93705aVB.LIZ.put(str, createFromAsset);
                    return createFromAsset;
                }
                return createFromAsset;
            }
            return typeface;
        }
        return null;
    }
}
