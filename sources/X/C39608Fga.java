package X;

import android.os.Build;
import java.lang.reflect.Field;

/* renamed from: X.Fga, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39608Fga {
    public static final Field LIZ;

    static {
        Field field = null;
        if (Build.VERSION.SDK_INT < 23) {
            try {
                field = Class.forName("android.text.TextLine").getDeclaredField("sCached");
                field.setAccessible(true);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        LIZ = field;
    }
}
