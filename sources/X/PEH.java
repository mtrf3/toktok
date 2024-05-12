package X;

import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PEH {
    public static void LIZIZ(String str) {
        StackTraceElement stackTraceElement;
        if (C78983UzD.LJLLLL != null) {
            C78983UzD.LJIILL(str);
            return;
        }
        StackTraceElement[] stackTrace = C16880lQ.LLLLIIIILLL().getStackTrace();
        if (stackTrace == null) {
            return;
        }
        try {
            if (stackTrace.length > 4 && (stackTraceElement = stackTrace[3]) != null) {
                String className = stackTraceElement.getClassName();
                String methodName = stackTraceElement.getMethodName();
                int lineNumber = stackTraceElement.getLineNumber();
                String LIZIZ = C39016FSy.LIZIZ(stackTrace);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event_type", "exception");
                jSONObject.put("timestamp", System.currentTimeMillis());
                jSONObject.put("class_ref", className);
                jSONObject.put("method", methodName);
                jSONObject.put("line_num", lineNumber);
                jSONObject.put("stack", LIZIZ);
                jSONObject.put("exception_type", 1);
                jSONObject.put("is_core", 1);
                if (!TextUtils.isEmpty(str)) {
                    if (str.length() <= 1024) {
                        jSONObject.put("message", str);
                    } else {
                        jSONObject.put("message", str.substring(0, 1024));
                    }
                }
                LIZ(null, jSONObject);
                PDU.LIZJ().LIZ("core_exception_monitor", jSONObject.toString(), str, true);
            }
        } catch (Throwable unused) {
        }
    }

    public static void LIZJ(Throwable th) {
        if (C78983UzD.LJLLLL != null) {
            C78983UzD.LJIIZILJ(th);
        } else {
            if (!LJFF(th)) {
                return;
            }
            LJI(C16880lQ.LLLLIIIILLL().getStackTrace(), th, null, true, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x005a, code lost:
    
        if ((r4 instanceof javax.net.ssl.SSLHandshakeException) != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJFF(java.lang.Throwable r4) {
        /*
            X.PDU r0 = X.PDU.LIZJ()
            r0.getClass()
            com.bytedance.apm.internal.ApmDelegate r3 = X.OIO.LIZ
            boolean r0 = r3.LJLJL
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L5e
            java.lang.String r0 = "exception_filter_network"
            boolean r0 = r3.LIZJ(r0)
            if (r0 != 0) goto L5e
            if (r4 != 0) goto L1c
        L19:
            r0 = r2 ^ 1
            return r0
        L1c:
            boolean r0 = r4 instanceof org.apache.http.conn.ConnectTimeoutException     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L21
            goto L5c
        L21:
            boolean r0 = r4 instanceof java.net.SocketTimeoutException     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L26
            goto L5c
        L26:
            boolean r0 = r4 instanceof java.net.BindException     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L2b
            goto L5c
        L2b:
            boolean r0 = r4 instanceof java.net.ConnectException     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L30
            goto L5c
        L30:
            boolean r0 = r4 instanceof java.net.NoRouteToHostException     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L35
            goto L5c
        L35:
            boolean r0 = r4 instanceof java.net.PortUnreachableException     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L3a
            goto L5c
        L3a:
            boolean r0 = r4 instanceof java.net.SocketException     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L3f
            goto L5c
        L3f:
            boolean r0 = r4 instanceof java.net.UnknownHostException     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L44
            goto L5c
        L44:
            boolean r0 = r4 instanceof java.net.NoRouteToHostException     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L49
            goto L5c
        L49:
            boolean r0 = r4 instanceof java.net.ProtocolException     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L4e
            goto L5c
        L4e:
            boolean r0 = r4 instanceof javax.net.ssl.SSLException     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L53
            goto L5c
        L53:
            boolean r0 = r4 instanceof org.apache.http.conn.ConnectTimeoutException     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L58
            goto L5c
        L58:
            boolean r0 = r4 instanceof javax.net.ssl.SSLHandshakeException     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L19
        L5c:
            r2 = 1
            goto L19
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PEH.LJFF(java.lang.Throwable):boolean");
    }

    public static void LIZ(java.util.Map<String, String> map, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (map != null) {
                for (String str : map.keySet()) {
                    jSONObject2.put(str, map.get(str));
                }
                jSONObject.put("custom", jSONObject2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void LIZLLL(Throwable th, String str) {
        if (C78983UzD.LJLLLL != null) {
            C78983UzD.LJIJ(th, str);
        } else {
            if (!LJFF(th)) {
                return;
            }
            LJI(C16880lQ.LLLLIIIILLL().getStackTrace(), th, str, true, null);
        }
    }

    public static void LJ(Throwable th, String str, java.util.Map<String, String> map) {
        if (C78983UzD.LJLLLL != null) {
            C78983UzD.LJIJI(th, str, map);
        } else {
            if (!LJFF(th)) {
                return;
            }
            LJI(C16880lQ.LLLLIIIILLL().getStackTrace(), th, str, false, map);
        }
    }

    public static void LJI(StackTraceElement[] stackTraceElementArr, Throwable th, String str, boolean z, java.util.Map map) {
        if (th == null) {
            return;
        }
        try {
            StackTraceElement stackTraceElement = stackTraceElementArr[3];
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            int lineNumber = stackTraceElement.getLineNumber();
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            Throwable cause = th.getCause();
            if (cause != null) {
                cause.printStackTrace(printWriter);
                Throwable cause2 = cause.getCause();
                if (cause2 != null) {
                    cause2.printStackTrace(printWriter);
                }
            }
            String stringWriter2 = stringWriter.toString();
            printWriter.close();
            if (stringWriter2.length() > 1024) {
                stringWriter2 = stringWriter2.substring(0, 1024);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event_type", "exception");
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("class_ref", className);
            jSONObject.put("method", methodName);
            jSONObject.put("line_num", lineNumber);
            jSONObject.put("stack", stringWriter2);
            jSONObject.put("exception_type", 0);
            if (!z) {
                jSONObject.put("is_core", 0);
            } else {
                jSONObject.put("is_core", 1);
            }
            if (!TextUtils.isEmpty(str)) {
                if (str.length() <= 1024) {
                    jSONObject.put("message", str);
                } else {
                    jSONObject.put("message", str.substring(0, 1024));
                }
            }
            LIZ(map, jSONObject);
            PDU.LIZJ().LIZ("core_exception_monitor", jSONObject.toString(), str, true);
        } catch (Throwable unused) {
        }
    }
}
