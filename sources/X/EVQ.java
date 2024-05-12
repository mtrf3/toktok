package X;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.Field;

/* loaded from: classes7.dex */
public final class EVQ {
    public static final Class LIZ;
    public static final Field LIZIZ;

    static {
        String str = Build.BRAND;
        if (str != null) {
            String lowerCase = str.toLowerCase();
            if (TextUtils.equals(lowerCase, "oppo") || TextUtils.equals(lowerCase, "oneplus") || TextUtils.equals(lowerCase, "realme")) {
                try {
                    LIZ = Class.forName("android.view.OppoBaseTextureView");
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        try {
            Field declaredField = SurfaceTexture.class.getDeclaredField("mOnFrameAvailableHandler");
            LIZIZ = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused2) {
        }
    }
}
