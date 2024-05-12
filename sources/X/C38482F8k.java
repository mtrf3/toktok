package X;

import java.lang.reflect.Field;

/* renamed from: X.F8k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38482F8k {
    public static final Field LIZ;
    public static final Field LIZIZ;

    static {
        try {
            LIZ = Class.forName("android.content.ContextWrapper").getDeclaredField("mBase");
        } catch (Throwable unused) {
        }
        try {
            LIZIZ = Class.forName("android.content.ContextImpl").getDeclaredField("mSharedPrefsPaths");
        } catch (Throwable unused2) {
        }
    }
}
