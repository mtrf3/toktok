package X;

import android.content.Context;

/* renamed from: X.0Eu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C04280Eu {
    public static int LIZ(Context context, int i) {
        return context.getColor(i);
    }

    public static <T> T LIZIZ(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    public static String LIZJ(Context context, Class<?> cls) {
        return context.getSystemServiceName(cls);
    }
}
