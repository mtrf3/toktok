package X;

import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.W8m, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81800W8m {
    public static final Class LIZ;
    public static C81828W9o LIZIZ;
    public static C81828W9o LIZJ;
    public static Method LIZLLL;

    static {
        try {
            LIZ = Class.forName("com.bytedance.fresco.avif.AvifDecoder");
        } catch (Throwable unused) {
            W58.LJI("AvifFormatUtil", "No AvifDecoder class");
        }
    }

    public static int[] LIZ(InputStream inputStream) {
        Class cls;
        int available = inputStream.available();
        byte[] bArr = new byte[available];
        inputStream.reset();
        int[] iArr = null;
        if (inputStream.read(bArr, 0, available) == -1 || (cls = LIZ) == null) {
            return null;
        }
        try {
            if (LIZLLL == null) {
                LIZLLL = cls.getDeclaredMethod("parseSimpleMeta", byte[].class, Integer.TYPE);
            }
            Method method = LIZLLL;
            if (method == null) {
                return null;
            }
            method.setAccessible(true);
            iArr = (int[]) LIZLLL.invoke(null, bArr, Integer.valueOf(available));
            return iArr;
        } catch (IllegalAccessException unused) {
            W58.LJI("AvifFormatUtil", "IllegalAccessException happened when invoke parseSimpleMeta");
            return iArr;
        } catch (NoSuchMethodException unused2) {
            W58.LJI("AvifFormatUtil", "No parseSimpleMeta method AvifDecoder");
            return iArr;
        } catch (InvocationTargetException unused3) {
            W58.LJI("AvifFormatUtil", "InvocationTargetException happened when invoke parseSimpleMeta");
            return iArr;
        } catch (Throwable unused4) {
            W58.LJI("AvifFormatUtil", "Exception happened when invoke parseSimpleMeta");
            return iArr;
        }
    }
}
