package ms.bd.o;

import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public class q2 {
    public static final String LIZ = (String) k.a(16777217, 0, 0, "22cc23", new byte[]{19, 34, 31, 20, 8, 55, 34, 28, 32});
    public static final String LIZIZ = (String) k.a(16777217, 0, 0, "3af967", new byte[]{10, 98, 7, 73, 30, 33, 34, 69});
    public static final String LIZJ = (String) k.a(16777217, 0, 0, "ed4e45", new byte[]{82, 99, 70, 5, 30, 48, 99, 86});
    public static final String LIZLLL = (String) k.a(16777217, 0, 0, "84cb7d", new byte[]{57, 53});
    public static final String LJ = (String) k.a(16777217, 0, 0, "39e7bb", new byte[]{42, 44});
    public static final String LJFF = (String) k.a(16777217, 0, 0, "fc1156", new byte[]{113, 117});
    public static final String LJI = (String) k.a(16777217, 0, 0, "023812", new byte[]{44, 49, 88});
    public static final String LJII = (String) k.a(16777217, 0, 0, "bd5b5d", new byte[]{126, 111, 72});
    public static final String LJIIIIZZ = (String) k.a(16777217, 0, 0, "a07c29", new byte[]{115, 61, 86, 18});
    public static final FileFilter LJIIIZ = new a();

    /* loaded from: classes7.dex */
    public static class a implements FileFilter {
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            return Pattern.matches((String) k.a(16777217, 0, 0L, "37470d", new byte[]{33, 37, 82, 120, 95, 62, 105, 43}), file.getName());
        }
    }

    public static int LIZ() {
        try {
            return new File((String) k.a(16777217, 0, 0L, "645a6d", new byte[]{104, 37, 95, 6, 70, 119, 48, 3, 109, 50, 34, 37, 9, 6, 16, 96, 33, 16, 105, 126, 36, 38, 83, 90})).listFiles(LJIIIZ).length;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x003d, code lost:
    
        if (r1 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(java.lang.String r10) {
        /*
            r6 = 0
            r4 = 1
            r3 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L36
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L36
            boolean r0 = r2.exists()     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L22
            r5 = 16777217(0x1000001, float:2.350989E-38)
            r7 = 0
            java.lang.String r9 = "4e84fb"
            byte[] r10 = new byte[r4]     // Catch: java.lang.Throwable -> L36
            r0 = 117(0x75, float:1.64E-43)
            r10[r6] = r0     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = ms.bd.o.k.a(r5, r6, r7, r9, r10)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L36
            return r0
        L22:
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L36
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L36
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L34
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = r0.readLine()     // Catch: java.lang.Throwable -> L38
            r0.close()     // Catch: java.lang.Throwable -> L3f
            goto L3f
        L34:
            r0 = r3
            goto L38
        L36:
            r1 = r3
            r0 = r3
        L38:
            if (r0 == 0) goto L3d
            r0.close()     // Catch: java.lang.Throwable -> L3d
        L3d:
            if (r1 == 0) goto L42
        L3f:
            r1.close()     // Catch: java.lang.Throwable -> L42
        L42:
            if (r3 != 0) goto L58
            byte[] r10 = new byte[r4]
            r0 = 37
            r10[r6] = r0
            r5 = 16777217(0x1000001, float:2.350989E-38)
            r7 = 0
            java.lang.String r9 = "d4774d"
            java.lang.Object r0 = ms.bd.o.k.a(r5, r6, r7, r9, r10)
            java.lang.String r0 = (java.lang.String) r0
        L57:
            return r0
        L58:
            java.lang.String r0 = r3.trim()
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.q2.LIZIZ(java.lang.String):java.lang.String");
    }

    public static String LIZJ(String str, HashMap hashMap) {
        String str2;
        try {
            str2 = (String) hashMap.get(str);
        } catch (Throwable unused) {
            str2 = null;
        }
        return str2 == null ? "" : str2.trim();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ab, code lost:
    
        if (r3 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap<java.lang.String, java.lang.String> LIZLLL() {
        /*
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r8 = 0
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> La5
            r9 = 16777217(0x1000001, float:2.350989E-38)
            r10 = 0
            r11 = 0
            java.lang.String r13 = "5295e4"
            r0 = 13
            byte[] r14 = new byte[r0]     // Catch: java.lang.Throwable -> La5
            r0 = 107(0x6b, float:1.5E-43)
            r15 = 0
            r14[r10] = r0     // Catch: java.lang.Throwable -> La5
            r0 = 32
            r2 = 1
            r14[r2] = r0     // Catch: java.lang.Throwable -> La5
            r0 = 88
            r1 = 2
            r14[r1] = r0     // Catch: java.lang.Throwable -> La5
            r0 = 78
            r7 = 3
            r14[r7] = r0     // Catch: java.lang.Throwable -> La5
            r5 = 4
            r0 = 89
            r14[r5] = r0     // Catch: java.lang.Throwable -> La5
            r0 = 5
            r6 = 108(0x6c, float:1.51E-43)
            r14[r0] = r6     // Catch: java.lang.Throwable -> La5
            r5 = 6
            r0 = 53
            r14[r5] = r0     // Catch: java.lang.Throwable -> La5
            r0 = 7
            r14[r0] = r7     // Catch: java.lang.Throwable -> La5
            r5 = 8
            r0 = 125(0x7d, float:1.75E-43)
            r14[r5] = r0     // Catch: java.lang.Throwable -> La5
            r0 = 9
            r14[r0] = r6     // Catch: java.lang.Throwable -> La5
            r5 = 10
            r0 = 42
            r14[r5] = r0     // Catch: java.lang.Throwable -> La5
            r5 = 11
            r0 = 54
            r14[r5] = r0     // Catch: java.lang.Throwable -> La5
            r5 = 12
            r0 = 69
            r14[r5] = r0     // Catch: java.lang.Throwable -> La5
            java.lang.Object r0 = ms.bd.o.k.a(r9, r10, r11, r13, r14)     // Catch: java.lang.Throwable -> La5
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> La5
            r3.<init>(r0)     // Catch: java.lang.Throwable -> La5
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> La6
            r7.<init>(r3)     // Catch: java.lang.Throwable -> La6
        L64:
            java.lang.String r6 = r7.readLine()     // Catch: java.lang.Throwable -> La3
            if (r6 != 0) goto L6b
            goto L9f
        L6b:
            r14 = 16777217(0x1000001, float:2.350989E-38)
            r16 = 0
            java.lang.String r18 = "00bc23"
            byte[] r5 = new byte[r2]     // Catch: java.lang.Throwable -> La3
            r0 = 123(0x7b, float:1.72E-43)
            r5[r15] = r0     // Catch: java.lang.Throwable -> La3
            r19 = r5
            java.lang.Object r0 = ms.bd.o.k.a(r14, r15, r16, r18, r19)     // Catch: java.lang.Throwable -> La3
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> La3
            java.lang.String[] r5 = r6.split(r0, r1)     // Catch: java.lang.Throwable -> La3
            int r0 = r5.length     // Catch: java.lang.Throwable -> La3
            if (r0 >= r1) goto L88
            goto L64
        L88:
            r0 = r5[r15]     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = r0.trim()     // Catch: java.lang.Throwable -> La3
            r0 = r5[r2]     // Catch: java.lang.Throwable -> La3
            java.lang.String r5 = r0.trim()     // Catch: java.lang.Throwable -> La3
            java.lang.Object r0 = r4.get(r6)     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto L9b
            goto L64
        L9b:
            r4.put(r6, r5)     // Catch: java.lang.Throwable -> La3
            goto L64
        L9f:
            r7.close()     // Catch: java.lang.Throwable -> Lad
            goto Lad
        La3:
            r8 = r7
            goto La6
        La5:
            r3 = r8
        La6:
            if (r8 == 0) goto Lab
            r8.close()     // Catch: java.lang.Throwable -> Lab
        Lab:
            if (r3 == 0) goto Lb0
        Lad:
            r3.close()     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.q2.LIZLLL():java.util.HashMap");
    }
}
