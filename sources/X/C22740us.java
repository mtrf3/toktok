package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import java.io.File;

/* renamed from: X.0us, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22740us {
    public static final Keva LIZ = Keva.getRepo("storage_info");

    public static long LIZ(Context context) {
        long j = 0;
        try {
            String str = context.getApplicationInfo().publicSourceDir;
            if (str != null) {
                File file = new File(str);
                if (file.exists()) {
                    j = file.length();
                }
            }
            String[] strArr = context.getApplicationInfo().splitPublicSourceDirs;
            if (strArr != null && strArr.length > 0) {
                for (String str2 : strArr) {
                    File file2 = new File(str2);
                    if (file2.exists()) {
                        j += file2.length();
                    }
                }
            }
        } catch (Exception unused) {
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b A[Catch: Exception -> 0x007f, TRY_LEAVE, TryCatch #0 {Exception -> 0x007f, blocks: (B:19:0x0074, B:33:0x007b), top: B:18:0x0074 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C65304Pk4 r10, android.content.Context r11) {
        /*
            if (r10 != 0) goto L3
            return
        L3:
            com.bytedance.keva.Keva r3 = X.C22740us.LIZ
            java.lang.String r2 = "STORAGE_INFO_LAST_REPORT_TIME"
            r4 = 0
            long r0 = r3.getLong(r2, r4)
            boolean r0 = X.SU4.LIZLLL(r0)
            if (r0 == 0) goto L14
            return
        L14:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lb2
            r3.storeLong(r2, r0)     // Catch: java.lang.Exception -> Lb2
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lb2
            r8.<init>()     // Catch: java.lang.Exception -> Lb2
            java.io.File r0 = X.C16880lQ.LLIIIL(r11)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r0 = r0.getParent()     // Catch: java.lang.Exception -> Lb2
            long r6 = X.C56463MDz.LJ(r0)     // Catch: java.lang.Exception -> Lb2
            java.io.File r0 = X.C16880lQ.LLIIIZ(r11)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r0 = r0.getParent()     // Catch: java.lang.Exception -> Lb2
            long r2 = X.C56463MDz.LJ(r0)     // Catch: java.lang.Exception -> Lb2
            java.io.File r0 = X.P8H.LJIIIIZZ(r11)     // Catch: java.lang.Exception -> Lb2
            if (r0 == 0) goto L5e
            java.lang.String r0 = r0.getParent()     // Catch: java.lang.Exception -> Lb2
            long r0 = X.C56463MDz.LJ(r0)     // Catch: java.lang.Exception -> Lb2
        L46:
            java.lang.String r9 = "private_size"
            r8.put(r9, r6)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r9 = "external_size"
            r8.put(r9, r2)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r9 = "sdcard_size"
            r8.put(r9, r0)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r0 = "total_size"
            long r6 = r6 + r2
            r8.put(r0, r6)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r2 = "device_size"
            goto L61
        L5e:
            r0 = 0
            goto L46
        L61:
            java.io.File r0 = X.C16880lQ.LLIIIZ(r11)     // Catch: java.lang.Exception -> L6d
            if (r0 != 0) goto L68
            goto L6d
        L68:
            long r0 = r0.getTotalSpace()     // Catch: java.lang.Exception -> L6d
            goto L6f
        L6d:
            r0 = 0
        L6f:
            r8.put(r2, r0)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r1 = "available_size"
            java.io.File r0 = X.C16880lQ.LLIIIZ(r11)     // Catch: java.lang.Exception -> L7f
            if (r0 != 0) goto L7b
            goto L7f
        L7b:
            long r4 = r0.getFreeSpace()     // Catch: java.lang.Exception -> L7f
        L7f:
            r8.put(r1, r4)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r2 = "apk_size"
            long r0 = LIZ(r11)     // Catch: java.lang.Exception -> Lb2
            r8.put(r2, r0)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r1 = "strategy_enabled"
            boolean r0 = X.P8H.LJIIJJI()     // Catch: java.lang.Exception -> Lb2
            if (r0 == 0) goto La5
            X.P8G r0 = X.P8G.LIZ(r11)     // Catch: java.lang.Exception -> Lb2
            if (r0 == 0) goto La5
            X.P8G r0 = X.P8G.LIZ(r11)     // Catch: java.lang.Exception -> Lb2
            boolean r0 = r0.LIZJ()     // Catch: java.lang.Exception -> Lb2
            if (r0 == 0) goto La5
            r0 = 1
            goto La6
        La5:
            r0 = 0
        La6:
            r8.put(r1, r0)     // Catch: java.lang.Exception -> Lb2
            X.C22680um.LIZ(r11, r8)     // Catch: java.lang.Exception -> Lb2
            r10.LIZJ(r8)     // Catch: java.lang.Exception -> Lb2
            r8.toString()     // Catch: java.lang.Exception -> Lb2
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22740us.LIZIZ(X.Pk4, android.content.Context):void");
    }
}
