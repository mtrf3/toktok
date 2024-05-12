package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* renamed from: X.1Ja, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30861Ja extends C07390Qt {
    public static final Class<?> LIZ;
    public static final Constructor<?> LIZIZ;
    public static final Method LIZJ;
    public static final Method LIZLLL;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        LIZIZ = constructor;
        LIZ = cls;
        LIZJ = method2;
        LIZLLL = method;
    }

    @Override // X.C07390Qt
    public final Typeface LIZIZ(Context context, C12180dq[] c12180dqArr, int i) {
        Object obj;
        Typeface typeface;
        try {
            obj = LIZIZ.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        C0MA c0ma = new C0MA();
        for (C12180dq c12180dq : c12180dqArr) {
            android.net.Uri uri = c12180dq.LIZ;
            ByteBuffer byteBuffer = (ByteBuffer) c0ma.getOrDefault(uri, null);
            if (byteBuffer == null) {
                byteBuffer = C07410Qv.LJ(context, uri);
                c0ma.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !LJI(obj, byteBuffer, c12180dq.LIZIZ, c12180dq.LIZJ, c12180dq.LIZLLL)) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(LIZ, 1);
            Array.set(newInstance, 0, obj);
            typeface = (Typeface) LIZLLL.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            typeface = null;
        }
        if (typeface == null) {
            return null;
        }
        return Typeface.create(typeface, i);
    }

    @Override // X.C07390Qt
    public final Typeface LIZ(Context context, C1IU c1iu, Resources resources, int i) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = LIZIZ.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (C0OT c0ot : c1iu.LIZ) {
            int i2 = c0ot.LJFF;
            File LIZLLL2 = C07410Qv.LIZLLL(context);
            if (LIZLLL2 != null) {
                try {
                    if (C07410Qv.LIZIZ(LIZLLL2, resources, i2)) {
                        try {
                            fileInputStream = new FileInputStream(LIZLLL2);
                        } catch (IOException unused2) {
                            mappedByteBuffer = null;
                        }
                        try {
                            FileChannel channel = fileInputStream.getChannel();
                            mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                            fileInputStream.close();
                            if (mappedByteBuffer != null || !LJI(obj, mappedByteBuffer, c0ot.LJ, c0ot.LIZIZ, c0ot.LIZJ)) {
                                return null;
                            }
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                            break;
                        }
                    }
                } finally {
                    C16880lQ.LLLZZIL(LIZLLL2);
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(LIZ, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) LIZLLL.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }

    public static boolean LJI(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) LIZJ.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}
