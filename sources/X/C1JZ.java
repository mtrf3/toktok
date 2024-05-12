package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.1JZ, reason: invalid class name */
/* loaded from: classes.dex */
public class C1JZ extends C07390Qt {
    public static Class<?> LIZ;
    public static Constructor<?> LIZIZ;
    public static Method LIZJ;
    public static Method LIZLLL;
    public static boolean LJ;

    public static void LJII() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (LJ) {
            return;
        }
        LJ = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
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
    public Typeface LIZIZ(Context context, C12180dq[] c12180dqArr, int i) {
        File file;
        String readlink;
        if (c12180dqArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(LJFF(i, c12180dqArr).LIZ, "r", null);
            if (openFileDescriptor == null) {
                return null;
            }
            try {
                try {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("/proc/self/fd/");
                    LIZ2.append(openFileDescriptor.getFd());
                    readlink = Os.readlink(X1D.LIZIZ(LIZ2));
                } finally {
                }
            } catch (ErrnoException unused) {
            }
            try {
                if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                    file = new File(readlink);
                    if (file != null || !file.canRead()) {
                        FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                        Typeface LIZJ2 = LIZJ(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return LIZJ2;
                    }
                    Typeface LJJLIIIJLJLI = C16880lQ.LJJLIIIJLJLI(file);
                    openFileDescriptor.close();
                    return LJJLIIIJLJLI;
                }
                Typeface LIZJ22 = LIZJ(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return LIZJ22;
            } finally {
            }
            file = null;
            if (file != null) {
            }
            FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
        } catch (IOException unused2) {
            return null;
        }
    }

    public static boolean LJI(int i, Object obj, String str, boolean z) {
        LJII();
        try {
            return ((Boolean) LIZJ.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // X.C07390Qt
    public Typeface LIZ(Context context, C1IU c1iu, Resources resources, int i) {
        LJII();
        try {
            Object newInstance = LIZIZ.newInstance(new Object[0]);
            for (C0OT c0ot : c1iu.LIZ) {
                File LIZLLL2 = C07410Qv.LIZLLL(context);
                if (LIZLLL2 == null) {
                    return null;
                }
                try {
                    if (!C07410Qv.LIZIZ(LIZLLL2, resources, c0ot.LJFF)) {
                        return null;
                    }
                    if (!LJI(c0ot.LIZIZ, newInstance, LIZLLL2.getPath(), c0ot.LIZJ)) {
                        return null;
                    }
                    C16880lQ.LLLZZIL(LIZLLL2);
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    C16880lQ.LLLZZIL(LIZLLL2);
                }
            }
            LJII();
            try {
                Object newInstance2 = Array.newInstance(LIZ, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) LIZLLL.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
