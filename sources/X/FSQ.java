package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.io.File;
import java.io.FileFilter;

/* loaded from: classes7.dex */
public final class FSQ {
    public static final String LIZ;
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final String LJ;
    public static final String LJFF;
    public static boolean LJI;
    public static String LJII;
    public static final Object LJIIIIZZ;
    public static int LJIIIZ;
    public static final Object LJIIJ;
    public static final FSR LJIIJJI;

    /* JADX WARN: Type inference failed for: r0v10, types: [X.FSR] */
    static {
        C16880lQ.LJLLJ(FSQ.class);
        LIZ = "/proc/cpuinfo";
        LIZIZ = "/sys/devices/system/cpu/possible";
        LIZJ = "/sys/devices/system/cpu/present";
        LIZLLL = "/sys/devices/system/cpu/";
        LJ = "Hardware";
        LJFF = "vendor";
        LJII = "unknown";
        LJIIIIZZ = new Object();
        LJIIJ = new Object();
        LJIIJJI = new FileFilter() { // from class: X.FSR
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                String name = file.getName();
                if (name.startsWith("cpu")) {
                    for (int i = 3; i < name.length(); i++) {
                        if (Character.isDigit(name.charAt(i))) {
                        }
                    }
                    return true;
                }
                return false;
            }
        };
    }

    public static boolean LIZ() {
        if (!LIZIZ(LIZIZ) && !LIZIZ(LIZJ)) {
            File[] listFiles = new File(LIZLLL).listFiles(LJIIJJI);
            if (listFiles == null) {
                return false;
            }
            synchronized (LJIIJ) {
                LJIIIZ = listFiles.length;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x004b, code lost:
    
        if (0 != 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(java.lang.String r6) {
        /*
            r0 = 0
            java.io.FileReader r5 = new java.io.FileReader     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L57
            r5.<init>(r6)     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L57
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4b
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4b
            java.lang.String r3 = r4.readLine()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
            r2 = 1
            r1 = -1
            if (r0 != 0) goto L36
            java.lang.String r0 = "0-"
            boolean r0 = r3.startsWith(r0)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
            if (r0 == 0) goto L36
            r0 = 2
            java.lang.String r0 = r3.substring(r0)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
            int r0 = LIZJ(r0)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
            int r0 = r0 + 1
            if (r0 == r1) goto L36
            java.lang.Object r1 = X.FSQ.LJIIJ
            monitor-enter(r1)
            X.FSQ.LJIIIZ = r0     // Catch: java.lang.Throwable -> L33
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L33
            goto L36
        L33:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L33
            throw r0
        L36:
            r4.close()     // Catch: java.lang.Exception -> L39
        L39:
            r5.close()     // Catch: java.lang.Exception -> L3c
        L3c:
            return r2
        L3d:
            r0 = move-exception
            r4.close()     // Catch: java.lang.Exception -> L41
        L41:
            if (r5 == 0) goto L58
            goto L47
        L44:
            r0 = r4
            goto L4d
        L46:
            r0 = move-exception
        L47:
            r5.close()     // Catch: java.lang.Exception -> L58
            goto L58
        L4b:
            if (r0 == 0) goto L50
        L4d:
            r0.close()     // Catch: java.lang.Exception -> L50
        L50:
            if (r5 == 0) goto L55
            r5.close()     // Catch: java.lang.Exception -> L55
        L55:
            r0 = 0
            return r0
        L57:
            r0 = move-exception
        L58:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FSQ.LIZIZ(java.lang.String):boolean");
    }

    public static int LIZJ(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            if (i2 < str.length()) {
                if (Character.isDigit(str.charAt(i2))) {
                    i = i2 + 1;
                    while (i < str.length() && Character.isDigit(str.charAt(i))) {
                        i++;
                    }
                } else {
                    i2++;
                }
            } else {
                i2 = 0;
                i = 0;
                break;
            }
        }
        try {
            return CastIntegerProtector.parseInt(str.substring(i2, i));
        } catch (Exception unused) {
            return 0;
        }
    }
}
