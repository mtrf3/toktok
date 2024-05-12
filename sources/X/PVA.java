package X;

import Y.IDComparatorS39S0000000_11;
import com.bytedance.mt.protector.impl.PatternProtector;
import defpackage.b1;
import defpackage.i0;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes12.dex */
public final class PVA {
    public static final byte[] LIZ;
    public static final String[] LIZIZ = new String[0];
    public static final PVM LIZJ;
    public static final C64537PUn LIZLLL;
    public static final C64537PUn LJ;
    public static final C64537PUn LJFF;
    public static final C64537PUn LJI;
    public static final C64537PUn LJII;
    public static final Charset LJIIIIZZ;
    public static final Charset LJIIIZ;
    public static final Charset LJIIJ;
    public static final Charset LJIIJJI;
    public static final Charset LJIIL;
    public static final TimeZone LJIILIIL;
    public static final IDComparatorS39S0000000_11 LJIILJJIL;
    public static final Method LJIILL;
    public static final Pattern LJIILLIIL;

    static {
        byte[] bArr = new byte[0];
        LIZ = bArr;
        Method method = null;
        LIZJ = PVM.create((C39745Fin) null, bArr);
        PVP.LIZLLL(null, bArr);
        LIZLLL = C64537PUn.decodeHex("efbbbf");
        LJ = C64537PUn.decodeHex("feff");
        LJFF = C64537PUn.decodeHex("fffe");
        LJI = C64537PUn.decodeHex("0000ffff");
        LJII = C64537PUn.decodeHex("ffff0000");
        LJIIIIZZ = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        LJIIIZ = Charset.forName("UTF-16BE");
        LJIIJ = Charset.forName("UTF-16LE");
        LJIIJJI = Charset.forName("UTF-32BE");
        LJIIL = Charset.forName("UTF-32LE");
        LJIILIIL = TimeZone.getTimeZone("GMT");
        LJIILJJIL = new IDComparatorS39S0000000_11(20);
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        LJIILL = method;
        LJIILLIIL = PatternProtector.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    public static int LJI(char c) {
        if (c < '0') {
            return -1;
        }
        if (c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        } else if (c > 'f') {
            return -1;
        }
        return (c - c2) + 10;
    }

    public static void LJIJ(Object obj, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "5932217633577348724")).LIZ) {
            return;
        }
        method.invoke(obj, objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x00d1, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PVA.LIZJ(java.lang.String):java.lang.String");
    }

    public static void LJ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void LJFF(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (LJIILLIIL(e)) {
                } else {
                    throw e;
                }
            } catch (RuntimeException e2) {
                if ("bio == null".equals(e2.getMessage())) {
                } else {
                    throw e2;
                }
            } catch (Exception unused) {
            }
        }
    }

    public static <T> List<T> LJIILIIL(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <T> List<T> LJIILJJIL(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static boolean LJIILLIIL(AssertionError assertionError) {
        if (assertionError.getCause() != null && assertionError.getMessage() != null && assertionError.getMessage().contains("getsockname failed")) {
            return true;
        }
        return false;
    }

    public static C64606PXe LJIL(List<PWL> list) {
        C64605PXd c64605PXd = new C64605PXd();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            PWL pwl = (PWL) it.next();
            C64586PWk c64586PWk = AbstractC64554PVe.LIZ;
            String utf8 = pwl.LIZ.utf8();
            String utf82 = pwl.LIZIZ.utf8();
            c64586PWk.getClass();
            c64605PXd.LIZIZ(utf8, utf82);
        }
        return new C64606PXe(c64605PXd);
    }

    public static AssertionError LIZ(Exception exc, String str) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    public static Charset LIZIZ(PW3 pw3, Charset charset) {
        if (pw3.LJJLJ(LIZLLL)) {
            pw3.skip(r1.size());
            return LJIIIIZZ;
        }
        if (pw3.LJJLJ(LJ)) {
            pw3.skip(r1.size());
            return LJIIIZ;
        }
        if (pw3.LJJLJ(LJFF)) {
            pw3.skip(r1.size());
            return LJIIJ;
        }
        if (pw3.LJJLJ(LJI)) {
            pw3.skip(r1.size());
            return LJIIJJI;
        }
        if (pw3.LJJLJ(LJII)) {
            pw3.skip(r1.size());
            return LJIIL;
        }
        return charset;
    }

    public static int LIZLLL(long j, TimeUnit timeUnit) {
        if (j >= 0) {
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis <= 2147483647L) {
                    if (millis != 0 || j <= 0) {
                        return (int) millis;
                    }
                    throw new IllegalArgumentException(i0.LJFF("timeout", " too small."));
                }
                throw new IllegalArgumentException(i0.LJFF("timeout", " too large."));
            }
            throw new NullPointerException("unit == null");
        }
        throw new IllegalArgumentException(i0.LJFF("timeout", " < 0"));
    }

    public static boolean LJIIJ(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    public static String LJIIJJI(String str, Object... objArr) {
        return C16880lQ.LLLZI(Locale.US, str, objArr);
    }

    public static String LJIIL(C64626PXy c64626PXy, boolean z) {
        String str;
        if (c64626PXy.LIZLLL.contains(":")) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[");
            str = JBR.LJFF(LIZ2, c64626PXy.LIZLLL, "]", LIZ2);
        } else {
            str = c64626PXy.LIZLLL;
        }
        if (z || c64626PXy.LJ != C64626PXy.LIZLLL(c64626PXy.LIZ)) {
            StringBuilder LIZJ2 = b1.LIZJ(str, ":");
            LIZJ2.append(c64626PXy.LJ);
            return X1D.LIZIZ(LIZJ2);
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.net.InetAddress LJII(int r13, int r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PVA.LJII(int, int, java.lang.String):java.net.InetAddress");
    }

    public static String[] LJIILL(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean LJIIZILJ(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean LJIJI(PUC puc, int i, TimeUnit timeUnit) {
        long j;
        long nanoTime = System.nanoTime();
        if (puc.timeout().LJ()) {
            j = puc.timeout().LIZJ() - nanoTime;
        } else {
            j = Long.MAX_VALUE;
        }
        puc.timeout().LIZLLL(Math.min(j, timeUnit.toNanos(i)) + nanoTime);
        try {
            C64533PUj c64533PUj = new C64533PUj();
            while (puc.read(c64533PUj, 8192L) != -1) {
                c64533PUj.LIZ();
            }
            if (j == Long.MAX_VALUE) {
                puc.timeout().LIZ();
                return true;
            }
            puc.timeout().LIZLLL(nanoTime + j);
            return true;
        } catch (InterruptedIOException unused) {
            if (j == Long.MAX_VALUE) {
                puc.timeout().LIZ();
                return false;
            }
            puc.timeout().LIZLLL(nanoTime + j);
            return false;
        } catch (Throwable th) {
            if (j == Long.MAX_VALUE) {
                puc.timeout().LIZ();
            } else {
                puc.timeout().LIZLLL(nanoTime + j);
            }
            throw th;
        }
    }

    public static int LJIJJ(int i, int i2, String str) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int LJIJJLI(int i, int i2, String str) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char charAt = str.charAt(i3);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    public static String LJJ(int i, int i2, String str) {
        int LJIJJ = LJIJJ(i, i2, str);
        return str.substring(LJIJJ, LJIJJLI(LJIJJ, i2, str));
    }

    public static int LJIIIIZZ(int i, int i2, String str, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int LJIIIZ(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }
}
