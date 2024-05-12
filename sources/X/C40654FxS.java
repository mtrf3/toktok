package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.google.android.play.core.assetpacks.b0;
import com.google.android.play.core.assetpacks.p0;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/* renamed from: X.FxS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40654FxS {
    public static Object LIZJ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-5247225026861236539"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public static <R, P0> R LJ(Class cls, Class<R> cls2, Class<P0> cls3, P0 p0) {
        try {
            return cls2.cast(LIZJ(null, LJIIIIZZ(cls, "isDexOptNeeded", cls3), new Object[]{p0}));
        } catch (Exception e) {
            throw new C40655FxT(C16880lQ.LLLZ("Failed to invoke static method %s on type %s", new Object[]{"isDexOptNeeded", cls}), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        if (r1.isEnabled() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(android.content.pm.PackageManager r10, android.content.ComponentName r11, int r12) {
        /*
            int r0 = r10.getComponentEnabledSetting(r11)
            r7 = 1
            if (r0 == r7) goto L4e
            r3 = 2
            if (r0 == r3) goto L4b
            java.lang.String r1 = r11.getPackageName()
            java.lang.String r8 = r11.getClassName()
            r0 = r12 | 512(0x200, float:7.17E-43)
            android.content.pm.PackageInfo r2 = X.C16880lQ.LLLLLLZ(r10, r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            r9 = 3
            android.content.pm.ComponentInfo[][] r6 = new android.content.pm.ComponentInfo[r9]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            android.content.pm.ActivityInfo[] r1 = r2.activities     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            r0 = 0
            r6[r0] = r1     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            android.content.pm.ServiceInfo[] r0 = r2.services     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            r6[r7] = r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            android.content.pm.ProviderInfo[] r0 = r2.providers     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            r6[r3] = r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            r5 = 0
        L29:
            r4 = r6[r5]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            if (r4 != 0) goto L2e
            goto L46
        L2e:
            int r3 = r4.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            r2 = 0
        L30:
            if (r2 >= r3) goto L46
            r1 = r4[r2]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            java.lang.String r0 = r1.name     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            boolean r0 = r0.equals(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            if (r0 == 0) goto L43
            boolean r0 = r1.isEnabled()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            if (r0 == 0) goto L4b
            goto L4e
        L43:
            int r2 = r2 + 1
            goto L30
        L46:
            int r5 = r5 + 1
            if (r5 >= r9) goto L4b
            goto L29
        L4b:
            r10.setComponentEnabledSetting(r11, r7, r7)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40654FxS.LJFF(android.content.pm.PackageManager, android.content.ComponentName, int):void");
    }

    public static <T> void LJI(T t) {
        if (t == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static void LJII(b0 b0Var, InputStream inputStream, p0 p0Var, long j) {
        byte[] bArr = new byte[16384];
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int readInt = dataInputStream.readInt();
        if (readInt != -771763713) {
            String valueOf = String.valueOf(C16880lQ.LLLZ("%x", new Object[]{Integer.valueOf(readInt)}));
            throw new C40656FxU(valueOf.length() != 0 ? "Unexpected magic=".concat(valueOf) : new String("Unexpected magic="));
        }
        int read = dataInputStream.read();
        if (read != 4) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Unexpected version=");
            sb.append(read);
            throw new C40656FxU(sb.toString());
        }
        long j2 = 0;
        while (true) {
            long j3 = j - j2;
            try {
                int read2 = dataInputStream.read();
                if (read2 == -1) {
                    throw new IOException("Patch file overrun");
                }
                if (read2 == 0) {
                    return;
                }
                switch (read2) {
                    case 247:
                        read2 = dataInputStream.readUnsignedShort();
                        LJIIJ(bArr, dataInputStream, p0Var, read2, j3);
                        break;
                    case 248:
                        read2 = dataInputStream.readInt();
                        LJIIJ(bArr, dataInputStream, p0Var, read2, j3);
                        break;
                    case 249:
                        long readUnsignedShort = dataInputStream.readUnsignedShort();
                        read2 = dataInputStream.read();
                        if (read2 == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        LJIIJJI(bArr, b0Var, p0Var, readUnsignedShort, read2, j3);
                        break;
                    case LiveCoverMinSizeSetting.DEFAULT /* 250 */:
                        long readUnsignedShort2 = dataInputStream.readUnsignedShort();
                        read2 = dataInputStream.readUnsignedShort();
                        LJIIJJI(bArr, b0Var, p0Var, readUnsignedShort2, read2, j3);
                        break;
                    case 251:
                        long readUnsignedShort3 = dataInputStream.readUnsignedShort();
                        read2 = dataInputStream.readInt();
                        LJIIJJI(bArr, b0Var, p0Var, readUnsignedShort3, read2, j3);
                        break;
                    case 252:
                        long readInt2 = dataInputStream.readInt();
                        read2 = dataInputStream.read();
                        if (read2 == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        LJIIJJI(bArr, b0Var, p0Var, readInt2, read2, j3);
                        break;
                    case 253:
                        long readInt3 = dataInputStream.readInt();
                        read2 = dataInputStream.readUnsignedShort();
                        LJIIJJI(bArr, b0Var, p0Var, readInt3, read2, j3);
                        break;
                    case 254:
                        long readInt4 = dataInputStream.readInt();
                        read2 = dataInputStream.readInt();
                        LJIIJJI(bArr, b0Var, p0Var, readInt4, read2, j3);
                        break;
                    case 255:
                        long readLong = dataInputStream.readLong();
                        read2 = dataInputStream.readInt();
                        LJIIJJI(bArr, b0Var, p0Var, readLong, read2, j3);
                        break;
                    default:
                        LJIIJ(bArr, dataInputStream, p0Var, read2, j3);
                        break;
                }
                j2 += read2;
            } finally {
                p0Var.flush();
            }
        }
    }

    public static Method LJIIIIZZ(Class<?> cls, String str, Class<?>... clsArr) {
        for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new C40655FxT(C16880lQ.LLLZ("Could not find a method named %s with parameters %s in type %s", new Object[]{str, Arrays.asList(clsArr), cls}));
    }

    public static Field LJIIIZ(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new C40655FxT(C16880lQ.LLLZ("Failed to find a field named %s on an object of instance %s", new Object[]{str, obj.getClass().getName()}));
    }

    public static void LJIIJ(byte[] bArr, DataInputStream dataInputStream, p0 p0Var, int i, long j) {
        if (i < 0) {
            throw new IOException("copyLength negative");
        }
        if (i > j) {
            throw new IOException("Output length overrun");
        }
        while (i > 0) {
            try {
                int min = Math.min(i, 16384);
                dataInputStream.readFully(bArr, 0, min);
                p0Var.write(bArr, 0, min);
                i -= min;
            } catch (EOFException unused) {
                throw new IOException("patch underrun");
            }
        }
    }

    public static C40657FxV LIZLLL(Class cls, String str, Object obj) {
        return new C40657FxV(Array.newInstance((Class<?>) cls, 0).getClass(), obj, LJIIIZ(obj, str));
    }

    public static <R, P0> R LIZ(Object obj, String str, Class<R> cls, Class<P0> cls2, P0 p0) {
        try {
            return cls.cast(LIZJ(obj, LJIIIIZZ(obj.getClass(), str, cls2), new Object[]{p0}));
        } catch (Exception e) {
            throw new C40655FxT(C16880lQ.LLLZ("Failed to invoke method %s on an object of type %s", new Object[]{str, obj.getClass()}), e);
        }
    }

    public static void LJIIJJI(byte[] bArr, b0 b0Var, p0 p0Var, long j, int i, long j2) {
        InputStream LIZIZ;
        int i2 = i;
        if (i2 >= 0) {
            if (j >= 0) {
                long j3 = i2;
                if (j3 <= j2) {
                    try {
                        C40653FxR c40653FxR = new C40653FxR(b0Var, j, j3);
                        synchronized (c40653FxR) {
                            LIZIZ = c40653FxR.LIZIZ(0L, c40653FxR.LJLJI - c40653FxR.LJLILLLLZI);
                        }
                        while (i2 > 0) {
                            try {
                                int min = Math.min(i2, 16384);
                                int i3 = 0;
                                while (i3 < min) {
                                    int read = LIZIZ.read(bArr, i3, min - i3);
                                    if (read != -1) {
                                        i3 += read;
                                    } else {
                                        throw new IOException("truncated input stream");
                                    }
                                }
                                p0Var.write(bArr, 0, min);
                                i2 -= min;
                            } finally {
                            }
                        }
                        LIZIZ.close();
                        return;
                    } catch (EOFException e) {
                        throw new IOException("patch underrun", e);
                    }
                }
                throw new IOException("Output length overrun");
            }
            throw new IOException("inputOffset negative");
        }
        throw new IOException("copyLength negative");
    }

    public static <R, P0, P1, P2> R LIZIZ(Object obj, String str, Class<R> cls, Class<P0> cls2, P0 p0, Class<P1> cls3, P1 p1, Class<P2> cls4, P2 p2) {
        try {
            return cls.cast(LIZJ(obj, LJIIIIZZ(obj.getClass(), str, cls2, cls3, cls4), new Object[]{p0, p1, p2}));
        } catch (Exception e) {
            throw new C40655FxT(C16880lQ.LLLZ("Failed to invoke method %s on an object of type %s", new Object[]{str, obj.getClass()}), e);
        }
    }
}
