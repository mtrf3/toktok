package X;

import com.bytedance.crash.util.NativeTools;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes12.dex */
public final class PKW {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new StackTraceElement("", "", "", 0);
    }

    public static String LIZ(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i = i2 + 1;
            cArr2[i2] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0027 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject LIZIZ(java.lang.String r14) {
        /*
            java.lang.String r6 = ")"
            java.lang.String r5 = "("
            r13 = 0
            java.util.Map r2 = java.lang.Thread.getAllStackTraces()     // Catch: java.lang.Throwable -> Ld5
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld5
            r4.<init>()     // Catch: java.lang.Throwable -> Ld5
            if (r2 != 0) goto L11
            return r13
        L11:
            java.lang.String r1 = "thread_all_count"
            int r0 = r2.size()     // Catch: java.lang.Throwable -> Ld5
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> Ld5
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Ld5
            r3.<init>()     // Catch: java.lang.Throwable -> Ld5
            java.util.Set r0 = r2.entrySet()     // Catch: java.lang.Throwable -> Ld5
            java.util.Iterator r12 = r0.iterator()     // Catch: java.lang.Throwable -> Ld5
        L27:
            boolean r0 = r12.hasNext()     // Catch: java.lang.Throwable -> Ld5
            if (r0 == 0) goto Lcf
            java.lang.Object r9 = r12.next()     // Catch: java.lang.Throwable -> Ld5
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch: java.lang.Throwable -> Ld5
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld5
            r2.<init>()     // Catch: java.lang.Throwable -> Ld5
            java.lang.Object r10 = r9.getKey()     // Catch: java.lang.Throwable -> Ld5
            java.lang.Thread r10 = (java.lang.Thread) r10     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r1 = r10.getName()     // Catch: java.lang.Throwable -> Ld5
            if (r14 == 0) goto L57
            boolean r0 = r14.equals(r1)     // Catch: java.lang.Throwable -> Ld5
            if (r0 != 0) goto L27
            boolean r0 = r1.startsWith(r14)     // Catch: java.lang.Throwable -> Ld5
            if (r0 != 0) goto L27
            boolean r0 = r1.endsWith(r14)     // Catch: java.lang.Throwable -> Ld5
            if (r0 == 0) goto L57
            goto L27
        L57:
            java.lang.String r8 = "thread_name"
            java.lang.StringBuilder r7 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r0 = r10.getName()     // Catch: java.lang.Throwable -> Ld5
            r7.append(r0)     // Catch: java.lang.Throwable -> Ld5
            r7.append(r5)     // Catch: java.lang.Throwable -> Ld5
            long r0 = r10.getId()     // Catch: java.lang.Throwable -> Ld5
            r7.append(r0)     // Catch: java.lang.Throwable -> Ld5
            r7.append(r6)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r0 = X.X1D.LIZIZ(r7)     // Catch: java.lang.Throwable -> Ld5
            r2.put(r8, r0)     // Catch: java.lang.Throwable -> Ld5
            java.lang.Object r10 = r9.getValue()     // Catch: java.lang.Throwable -> Ld5
            java.lang.StackTraceElement[] r10 = (java.lang.StackTraceElement[]) r10     // Catch: java.lang.Throwable -> Ld5
            if (r10 == 0) goto Lc7
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Ld5
            r9.<init>()     // Catch: java.lang.Throwable -> Ld5
            int r8 = r10.length     // Catch: java.lang.Throwable -> Ld5
            r7 = 0
        L87:
            if (r7 >= r8) goto Lb9
            r11 = r10[r7]     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r0 = r11.getClassName()     // Catch: java.lang.Throwable -> Ld5
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> Ld5
            r1.append(r0)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r0 = "."
            r1.append(r0)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r0 = r11.getMethodName()     // Catch: java.lang.Throwable -> Ld5
            r1.append(r0)     // Catch: java.lang.Throwable -> Ld5
            r1.append(r5)     // Catch: java.lang.Throwable -> Ld5
            int r0 = r11.getLineNumber()     // Catch: java.lang.Throwable -> Ld5
            r1.append(r0)     // Catch: java.lang.Throwable -> Ld5
            r1.append(r6)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> Ld5
            r9.put(r0)     // Catch: java.lang.Throwable -> Ld5
            int r7 = r7 + 1
            goto L87
        Lb9:
            java.lang.String r0 = "thread_stack"
            r2.put(r0, r9)     // Catch: java.lang.Throwable -> Ld5
            int r0 = r9.length()     // Catch: java.lang.Throwable -> Ld5
            if (r0 <= 0) goto Lc5
            goto Lc7
        Lc5:
            r0 = 0
            goto Lc8
        Lc7:
            r0 = 1
        Lc8:
            if (r0 == 0) goto L27
            r3.put(r2)     // Catch: java.lang.Throwable -> Ld5
            goto L27
        Lcf:
            java.lang.String r0 = "thread_stacks"
            r4.put(r0, r3)     // Catch: java.lang.Throwable -> Ld5
            return r4
        Ld5:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PKW.LIZIZ(java.lang.String):org.json.JSONObject");
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    public static String LIZJ(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            LJIIJJI(th, printWriter);
            String stringWriter2 = stringWriter.toString();
            printWriter.close();
            return stringWriter2;
        } catch (Throwable unused) {
            printWriter.close();
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(java.lang.String r7) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r2 = 0
            if (r0 == 0) goto L8
            return r2
        L8:
            java.io.File r1 = new java.io.File
            r1.<init>(r7)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L14
            return r2
        L14:
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r5 = 10
            r4 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L53
            java.io.FileReader r0 = new java.io.FileReader     // Catch: java.lang.Throwable -> L53
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L53
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L53
            r2 = 0
        L2c:
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L4e
            r1 = 256(0x100, float:3.59E-43)
            if (r2 > r1) goto L3d
            r6.append(r0)     // Catch: java.lang.Throwable -> L52
            r6.append(r5)     // Catch: java.lang.Throwable -> L52
            goto L4b
        L3d:
            r7.add(r0)     // Catch: java.lang.Throwable -> L52
            int r0 = r7.size()     // Catch: java.lang.Throwable -> L52
            if (r0 <= r1) goto L4b
            r7.poll()     // Catch: java.lang.Throwable -> L52
            int r4 = r4 + 1
        L4b:
            int r2 = r2 + 1
            goto L2c
        L4e:
            X.FPX.LIZIZ(r3)
            goto L56
        L52:
            r2 = r3
        L53:
            X.FPX.LIZIZ(r2)
        L56:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L7c
            if (r4 == 0) goto L65
            java.lang.String r1 = "\t... skip "
            java.lang.String r0 = " lines\n"
            X.V1I.LIZLLL(r6, r1, r4, r0)
        L65:
            java.util.Iterator r1 = r7.iterator()
        L69:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            r6.append(r0)
            r6.append(r5)
            goto L69
        L7c:
            java.lang.String r0 = r6.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PKW.LIZLLL(java.lang.String):java.lang.String");
    }

    public static String LJ(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            LJFF(stackTraceElement, sb);
        }
        return sb.toString();
    }

    public static boolean LJI(Throwable th) {
        if (th == null) {
            return false;
        }
        int i = 0;
        do {
            try {
                if (!(th instanceof OutOfMemoryError)) {
                    if (i > 20) {
                        return false;
                    }
                    i++;
                    th = th.getCause();
                } else {
                    return true;
                }
            } catch (Throwable unused) {
            }
        } while (th != null);
        return false;
    }

    public static void LJFF(StackTraceElement stackTraceElement, StringBuilder sb) {
        String className = stackTraceElement.getClassName();
        sb.append("  at ");
        sb.append(className);
        sb.append(".");
        sb.append(stackTraceElement.getMethodName());
        sb.append("(");
        sb.append(stackTraceElement.getFileName());
        sb.append(":");
        sb.append(stackTraceElement.getLineNumber());
        sb.append(")\n");
    }

    public static void LJII(int i, String str) {
        NativeTools.LJIILJJIL().LJJIL(i, str);
    }

    public static void LJIIJ(int i, Throwable th) {
        if (th == null || i <= 0) {
            return;
        }
        LJIILIIL(i, th);
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            LJIIL(stackTraceElement, i);
        }
        for (Throwable th2 : th.getSuppressed()) {
            LJIIIIZZ(i, "Suppressed: ", "\t", th2);
        }
        Throwable cause = th.getCause();
        if (cause == null) {
            return;
        }
        LJIIIIZZ(i, "Caused by: ", "", cause);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        if (r7 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJJI(java.lang.Throwable r13, java.io.PrintWriter r14) {
        /*
            if (r13 == 0) goto La3
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            java.util.Set r11 = java.util.Collections.newSetFromMap(r0)
            r11.add(r13)
            r8 = r14
            r8.println(r13)
            java.lang.StackTraceElement[] r3 = r13.getStackTrace()
            int r1 = r3.length
            r0 = 384(0x180, float:5.38E-43)
            if (r1 <= r0) goto L7c
            r7 = 1
        L1c:
            int r6 = r3.length
            r5 = 0
            r2 = 0
        L1f:
            java.lang.String r4 = "\tat "
            if (r5 >= r6) goto L79
            r1 = r3[r5]
            if (r7 == 0) goto L63
            r0 = 256(0x100, float:3.59E-43)
            if (r2 <= r0) goto L63
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "\t... skip "
            r1.append(r0)
            int r0 = r3.length
            int r0 = r0 - r2
            int r0 = r0 + (-128)
            r1.append(r0)
            java.lang.String r0 = " lines"
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r8.println(r0)
        L47:
            int r0 = r3.length
            int r2 = r0 + (-128)
        L4a:
            int r0 = r3.length
            if (r2 >= r0) goto L7e
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r4)
            r0 = r3[r2]
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r8.println(r0)
            int r2 = r2 + 1
            goto L4a
        L63:
            java.lang.StringBuilder r0 = X.X1D.LIZ()
            r0.append(r4)
            r0.append(r1)
            java.lang.String r0 = X.X1D.LIZIZ(r0)
            r8.println(r0)
            int r2 = r2 + 1
            int r5 = r5 + 1
            goto L1f
        L79:
            if (r7 == 0) goto L7e
            goto L47
        L7c:
            r7 = 0
            goto L1c
        L7e:
            java.lang.Throwable[] r2 = r13.getSuppressed()
            int r1 = r2.length
            r0 = 0
        L84:
            if (r0 >= r1) goto L94
            r7 = r2[r0]
            java.lang.String r9 = "Suppressed: "
            java.lang.String r10 = "\t"
            r12 = 128(0x80, float:1.8E-43)
            LJIIIZ(r7, r8, r9, r10, r11, r12)
            int r0 = r0 + 1
            goto L84
        L94:
            java.lang.Throwable r7 = r13.getCause()
            if (r7 == 0) goto La3
            java.lang.String r9 = "Caused by: "
            java.lang.String r10 = ""
            r12 = 128(0x80, float:1.8E-43)
            LJIIIZ(r7, r8, r9, r10, r11, r12)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PKW.LJIIJJI(java.lang.Throwable, java.io.PrintWriter):void");
    }

    public static void LJIIL(StackTraceElement stackTraceElement, int i) {
        try {
            LJII(i, "\tat ");
            LJII(i, stackTraceElement.getClassName());
            LJII(i, ".");
            LJII(i, stackTraceElement.getMethodName());
            if (stackTraceElement.isNativeMethod()) {
                LJII(i, "(Native Method)");
            } else if (stackTraceElement.getFileName() != null) {
                if (stackTraceElement.getLineNumber() >= 0) {
                    LJII(i, "(");
                    LJII(i, stackTraceElement.getFileName());
                    LJII(i, ":");
                    LJII(i, String.valueOf(stackTraceElement.getLineNumber()));
                    LJII(i, ")");
                } else {
                    LJII(i, "(");
                    LJII(i, stackTraceElement.getFileName());
                    LJII(i, ")");
                }
            } else if (stackTraceElement.getLineNumber() >= 0) {
                LJII(i, "(Unknown Source:");
                LJII(i, String.valueOf(stackTraceElement.getLineNumber()));
                LJII(i, ")");
            } else {
                LJII(i, "(Unknown Source)");
            }
            LJII(i, "\n");
        } catch (Throwable unused) {
        }
    }

    public static void LJIILIIL(int i, Throwable th) {
        String localizedMessage = th.getLocalizedMessage();
        try {
            LJII(i, th.getClass().getName());
            if (localizedMessage != null) {
                LJII(i, ": ");
                LJII(i, localizedMessage);
            }
            LJII(i, "\n");
        } catch (Throwable unused) {
        }
    }

    public static void LJIIIIZZ(int i, String str, String str2, Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        try {
            NativeTools.LJIILJJIL().LJJIL(i, str2);
            NativeTools.LJIILJJIL().LJJIL(i, str);
        } catch (Throwable unused) {
        }
        LJIILIIL(i, th);
        for (StackTraceElement stackTraceElement : stackTrace) {
            LJIIL(stackTraceElement, i);
        }
        for (Throwable th2 : th.getSuppressed()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str2);
            LIZ2.append("\t");
            LJIIIIZZ(i, "Suppressed: ", X1D.LIZIZ(LIZ2), th2);
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            LJIIIIZZ(i, "Caused by: ", str2, cause);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
    
        r2 = r3.length - (r16 / 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        if (r2 >= r3.length) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("\tat ");
        r1.append(r3[r2]);
        r12.println(X.X1D.LIZIZ(r1));
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a3, code lost:
    
        if (r11 != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIZ(java.lang.Throwable r11, java.io.PrintWriter r12, java.lang.String r13, java.lang.String r14, java.util.Set r15, int r16) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PKW.LJIIIZ(java.lang.Throwable, java.io.PrintWriter, java.lang.String, java.lang.String, java.util.Set, int):void");
    }
}
