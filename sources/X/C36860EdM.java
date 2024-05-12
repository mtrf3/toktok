package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.Closeable;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.EdM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36860EdM {
    public static String LIZ;
    public static volatile Boolean LIZIZ;

    static {
        "0123456789ABCDEF".toCharArray();
    }

    public static boolean LIZ(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str) || "unknown".equalsIgnoreCase(str) || "Null".equalsIgnoreCase(str)) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i < str.length()) {
                if (str.charAt(i) != '0') {
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        return !z;
    }

    public static void LIZIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cd, code lost:
    
        if (r4 != null) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(android.content.Context r6) {
        /*
            java.lang.Boolean r0 = X.C36860EdM.LIZIZ
            if (r0 != 0) goto L1c
            if (r6 == 0) goto Ld8
            java.lang.String r1 = X.C36860EdM.LIZ
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L23
        Le:
            java.lang.String r0 = r6.getPackageName()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C36860EdM.LIZIZ = r0
        L1c:
            java.lang.Boolean r0 = X.C36860EdM.LIZIZ
            boolean r0 = r0.booleanValue()
            return r0
        L23:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L36
            java.lang.String r1 = android.app.Application.getProcessName()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L36
            X.C36860EdM.LIZ = r1
            goto Le
        L36:
            r5 = 0
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class r3 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = "currentProcessName"
            r2 = 0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L57
            java.lang.reflect.Method r1 = r3.getDeclaredMethod(r1, r0)     // Catch: java.lang.Throwable -> L57
            r0 = 1
            r1.setAccessible(r0)     // Catch: java.lang.Throwable -> L57
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L57
            java.lang.Object r1 = r1.invoke(r5, r0)     // Catch: java.lang.Throwable -> L57
            boolean r0 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L57
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L57
            goto L58
        L57:
            r1 = r5
        L58:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L61
            X.C36860EdM.LIZ = r1
            goto Le
        L61:
            int r3 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L8a
            java.lang.String r0 = "activity"
            java.lang.Object r0 = X.C16880lQ.LLILL(r6, r0)     // Catch: java.lang.Exception -> L8a
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch: java.lang.Exception -> L8a
            java.util.List r0 = r0.getRunningAppProcesses()     // Catch: java.lang.Exception -> L8a
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> L8a
        L75:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L8a
            if (r0 == 0) goto L8e
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> L8a
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1     // Catch: java.lang.Exception -> L8a
            int r0 = r1.pid     // Catch: java.lang.Exception -> L8a
            if (r0 != r3) goto L75
            java.lang.String r0 = r1.processName     // Catch: java.lang.Exception -> L8a
            X.C36860EdM.LIZ = r0     // Catch: java.lang.Exception -> L8a
            goto L8e
        L8a:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L8e:
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Exception -> Ld2
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> Ld2
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Exception -> Ld2
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Exception -> Ld2
            java.lang.String r0 = "/proc/"
            r1.append(r0)     // Catch: java.lang.Exception -> Ld2
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Exception -> Ld2
            r1.append(r0)     // Catch: java.lang.Exception -> Ld2
            java.lang.String r0 = "/cmdline"
            r1.append(r0)     // Catch: java.lang.Exception -> Ld2
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Exception -> Ld2
            r2.<init>(r0)     // Catch: java.lang.Exception -> Ld2
            java.lang.String r0 = "iso-8859-1"
            r3.<init>(r2, r0)     // Catch: java.lang.Exception -> Ld2
            r4.<init>(r3)     // Catch: java.lang.Exception -> Ld2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcd
            r1.<init>()     // Catch: java.lang.Throwable -> Lcd
        Lbd:
            int r0 = r4.read()     // Catch: java.lang.Throwable -> Lcd
            if (r0 <= 0) goto Lc8
            char r0 = (char) r0     // Catch: java.lang.Throwable -> Lcd
            r1.append(r0)     // Catch: java.lang.Throwable -> Lcd
            goto Lbd
        Lc8:
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> Lcd
            goto Lcf
        Lcd:
            if (r4 == 0) goto Ld2
        Lcf:
            r4.close()
        Ld2:
            X.C36860EdM.LIZ = r5
            java.lang.String r1 = X.C36860EdM.LIZ
            goto Le
        Ld8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "context is null"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36860EdM.LIZLLL(android.content.Context):boolean");
    }

    public static boolean LJ(String str) {
        int length;
        if (str == null || (length = str.length()) < 13 || length > 128) {
            return false;
        }
        int i = 0;
        do {
            char charAt = str.charAt(i);
            if (charAt >= '0') {
                if (charAt > '9') {
                    if (charAt >= 'a') {
                        if (charAt > 'f') {
                            return false;
                        }
                    } else if (charAt >= 'A') {
                        if (charAt > 'F') {
                            return false;
                        }
                    }
                }
                i++;
            }
            if (charAt != '-') {
                return false;
            }
            i++;
        } while (i < length);
        return true;
    }

    public static void LIZJ(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        try {
            synchronized (C66791QJf.class) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            }
        } catch (JSONException unused) {
        }
    }

    public static void LJI(SharedPreferences sharedPreferences, String[] strArr) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        boolean z = false;
        for (String str : strArr) {
            if (sharedPreferences.contains(str)) {
                edit.remove(str);
                z = true;
            }
        }
        if (z) {
            edit.apply();
        }
    }

    public static void LJFF(String str, String str2, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put(str, str2);
        }
    }
}
