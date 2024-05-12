package X;

import android.widget.Toast;
import java.lang.reflect.Field;

/* renamed from: X.4Zr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111634Zr {
    public static final Field LIZ;
    public static final Field LIZIZ;

    static {
        try {
            Field declaredField = Toast.class.getDeclaredField("mTN");
            LIZ = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = declaredField.getType().getDeclaredField("mHandler");
            LIZIZ = declaredField2;
            declaredField2.setAccessible(true);
        } catch (Exception e) {
            C36922EeM.LJFF(e);
            C16880lQ.LLLLIIL(e);
        }
    }
}
