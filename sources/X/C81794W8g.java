package X;

import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.W8g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81794W8g {
    public static volatile Class LIZ;
    public static final Class LIZIZ;
    public static C81828W9o LIZJ;
    public static C81828W9o LIZLLL;
    public static Method LJ;
    public static Method LJFF;

    static {
        try {
            LIZIZ = Class.forName("com.bytedance.fresco.heif.HeifDecoder");
        } catch (ClassNotFoundException e) {
            W58.LJII("HeifFormatUtil", "Heif init ", e);
        }
    }

    public static synchronized Class LIZ() {
        Class cls;
        synchronized (C81794W8g.class) {
            if (LIZ == null) {
                try {
                    LIZ = Class.forName("com.bytedance.fresco.nativeheif.Heif");
                } catch (ClassNotFoundException e) {
                    W58.LJII("HeifFormatUtil", "Heif init ", e);
                }
            }
            cls = LIZ;
        }
        return cls;
    }

    public static C81828W9o LIZIZ() {
        C81828W9o c81828W9o = LIZLLL;
        if (c81828W9o != null) {
            return c81828W9o;
        }
        Class cls = LIZIZ;
        if (cls == null) {
            return null;
        }
        try {
            LIZLLL = (C81828W9o) cls.getDeclaredField("HEIF_FORMAT_ANIMATED").get(null);
        } catch (IllegalAccessException e) {
            W58.LJII("HeifFormatUtil", "HEIF_FORMAT_ANIMATED init ", e);
        } catch (NoSuchFieldException e2) {
            W58.LJII("HeifFormatUtil", "HEIF_FORMAT_ANIMATED init ", e2);
        } catch (Exception e3) {
            C16880lQ.LLLLIIL(e3);
        }
        return LIZLLL;
    }

    public static int[] LIZJ(InputStream inputStream) {
        Class LIZ2;
        int available = inputStream.available();
        byte[] bArr = new byte[available];
        inputStream.reset();
        int[] iArr = null;
        if (inputStream.read(bArr, 0, available) == -1 || (LIZ2 = LIZ()) == null) {
            return null;
        }
        try {
            if (LJ == null) {
                LJ = LIZ2.getDeclaredMethod("parseSimpleMeta", byte[].class, Integer.TYPE);
            }
            Method method = LJ;
            if (method == null) {
                return null;
            }
            method.setAccessible(true);
            iArr = (int[]) LJ.invoke(null, bArr, Integer.valueOf(available));
            return iArr;
        } catch (IllegalAccessException e) {
            C16880lQ.LLLLIIL(e);
            return iArr;
        } catch (NoSuchMethodException e2) {
            C16880lQ.LLLLIIL(e2);
            return iArr;
        } catch (InvocationTargetException e3) {
            C16880lQ.LLLLIIL(e3);
            return iArr;
        } catch (Exception e4) {
            C16880lQ.LLLLIIL(e4);
            return iArr;
        }
    }

    public static int[] LIZLLL(InputStream inputStream) {
        Class LIZ2;
        int[] iArr = null;
        if (inputStream == null) {
            return null;
        }
        int available = inputStream.available();
        byte[] bArr = new byte[available];
        inputStream.reset();
        if (inputStream.read(bArr, 0, available) == -1 || (LIZ2 = LIZ()) == null) {
            return null;
        }
        try {
            if (LJFF == null) {
                LJFF = LIZ2.getDeclaredMethod("parseThumbMeta", byte[].class, Integer.TYPE);
            }
            Method method = LJFF;
            if (method == null) {
                return null;
            }
            method.setAccessible(true);
            iArr = (int[]) LJFF.invoke(null, bArr, Integer.valueOf(available));
            return iArr;
        } catch (IllegalAccessException e) {
            C16880lQ.LLLLIIL(e);
            return iArr;
        } catch (NoSuchMethodException e2) {
            C16880lQ.LLLLIIL(e2);
            return iArr;
        } catch (InvocationTargetException e3) {
            C16880lQ.LLLLIIL(e3);
            return iArr;
        } catch (Exception e4) {
            C16880lQ.LLLLIIL(e4);
            return iArr;
        }
    }
}
