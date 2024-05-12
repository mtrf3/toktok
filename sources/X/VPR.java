package X;

import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.utils.DisplayMetricsHolder;

/* loaded from: classes15.dex */
public final class VPR {
    public static float LIZIZ(String str, float f) {
        return LIZLLL(str, 0.0f, 0.0f, 0.0f, 0.0f, f, DisplayMetricsHolder.LIZIZ());
    }

    public static float LIZJ(String str, float f, float f2) {
        return LIZLLL(str, f, f2, 0.0f, 0.0f, 0.0f, DisplayMetricsHolder.LIZIZ());
    }

    public static float LJ(String str, float f, DisplayMetrics displayMetrics) {
        int length;
        float f2 = 0.0f;
        if (!TextUtils.isEmpty(str) && (length = str.length()) > 1) {
            try {
            } catch (Throwable unused) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Number parse error from value = ");
                LIZ.append(str);
                LIZ.append(" to px!");
                LLog.LIZLLL(3, "lynx", X1D.LIZIZ(LIZ));
            }
            if (str.endsWith("%")) {
                f2 = (CastFloatProtector.parseFloat(str.substring(0, length - 1)) * f) / 100.0f;
                return f2;
            }
        }
        f2 = LIZLLL(str, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, displayMetrics);
        return f2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r1 > 2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c6, code lost:
    
        if (r1 > 0) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float LIZLLL(java.lang.String r7, float r8, float r9, float r10, float r11, float r12, android.util.DisplayMetrics r13) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r3 = 0
            if (r0 == 0) goto L8
        L7:
            return r12
        L8:
            int r1 = r7.length()
            r2 = 3
            if (r1 <= r2) goto L3c
            java.lang.String r0 = "rpx"
            boolean r0 = r7.endsWith(r0)     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto L2a
            int r1 = r1 - r2
            java.lang.String r0 = r7.substring(r3, r1)     // Catch: java.lang.Throwable -> Lce
            float r12 = com.bytedance.mt.protector.impl.string2number.CastFloatProtector.parseFloat(r0)     // Catch: java.lang.Throwable -> Lce
            int r0 = r13.widthPixels     // Catch: java.lang.Throwable -> Lce
            float r1 = (float) r0     // Catch: java.lang.Throwable -> Lce
            float r1 = r1 * r12
            r0 = 1144750080(0x443b8000, float:750.0)
            float r12 = r1 / r0
            goto L7
        L2a:
            java.lang.String r0 = "ppx"
            boolean r0 = r7.endsWith(r0)     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto L3c
            int r1 = r1 - r2
            java.lang.String r0 = r7.substring(r3, r1)     // Catch: java.lang.Throwable -> Lce
            float r12 = com.bytedance.mt.protector.impl.string2number.CastFloatProtector.parseFloat(r0)     // Catch: java.lang.Throwable -> Lce
            goto L7
        L3c:
            r4 = 2
            if (r1 <= r4) goto L55
            java.lang.String r0 = "px"
            boolean r0 = r7.endsWith(r0)     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto L55
            int r1 = r1 - r4
            java.lang.String r0 = r7.substring(r3, r1)     // Catch: java.lang.Throwable -> Lce
            float r0 = com.bytedance.mt.protector.impl.string2number.CastFloatProtector.parseFloat(r0)     // Catch: java.lang.Throwable -> Lce
            float r12 = X.V9Y.LIZ(r0)     // Catch: java.lang.Throwable -> Lce
            goto L7
        L55:
            r6 = 1
            r5 = 1120403456(0x42c80000, float:100.0)
            if (r1 <= r6) goto Lc6
            java.lang.String r0 = "%"
            boolean r0 = r7.endsWith(r0)     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto L6d
            int r1 = r1 - r6
            java.lang.String r0 = r7.substring(r3, r1)     // Catch: java.lang.Throwable -> Lce
            float r12 = com.bytedance.mt.protector.impl.string2number.CastFloatProtector.parseFloat(r0)     // Catch: java.lang.Throwable -> Lce
            float r12 = r12 / r5
            goto L7
        L6d:
            if (r1 <= r2) goto L83
            java.lang.String r0 = "rem"
            boolean r0 = r7.endsWith(r0)     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto L85
            int r1 = r1 - r2
            java.lang.String r0 = r7.substring(r3, r1)     // Catch: java.lang.Throwable -> Lce
            float r0 = com.bytedance.mt.protector.impl.string2number.CastFloatProtector.parseFloat(r0)     // Catch: java.lang.Throwable -> Lce
            float r12 = r8 * r0
            goto L7
        L83:
            if (r1 <= r4) goto Lc6
        L85:
            java.lang.String r0 = "em"
            boolean r0 = r7.endsWith(r0)     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto L9a
            int r1 = r1 - r4
            java.lang.String r0 = r7.substring(r3, r1)     // Catch: java.lang.Throwable -> Lce
            float r0 = com.bytedance.mt.protector.impl.string2number.CastFloatProtector.parseFloat(r0)     // Catch: java.lang.Throwable -> Lce
            float r12 = r9 * r0
            goto L7
        L9a:
            java.lang.String r0 = "vw"
            boolean r0 = r7.endsWith(r0)     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto Lb0
            int r1 = r1 - r4
            java.lang.String r0 = r7.substring(r3, r1)     // Catch: java.lang.Throwable -> Lce
            float r0 = com.bytedance.mt.protector.impl.string2number.CastFloatProtector.parseFloat(r0)     // Catch: java.lang.Throwable -> Lce
            float r10 = r10 * r0
            float r12 = r10 / r5
            goto L7
        Lb0:
            java.lang.String r0 = "vh"
            boolean r0 = r7.endsWith(r0)     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto Lc8
            int r1 = r1 - r4
            java.lang.String r0 = r7.substring(r3, r1)     // Catch: java.lang.Throwable -> Lce
            float r0 = com.bytedance.mt.protector.impl.string2number.CastFloatProtector.parseFloat(r0)     // Catch: java.lang.Throwable -> Lce
            float r11 = r11 * r0
            float r12 = r11 / r5
            goto L7
        Lc6:
            if (r1 <= 0) goto L7
        Lc8:
            float r12 = com.bytedance.mt.protector.impl.string2number.CastFloatProtector.parseFloat(r7)     // Catch: java.lang.Throwable -> Lce
            goto L7
        Lce:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Number parse error from value = "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " to px!"
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "lynx"
            com.lynx.tasm.base.LLog.LIZLLL(r2, r0, r1)
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VPR.LIZLLL(java.lang.String, float, float, float, float, float, android.util.DisplayMetrics):float");
    }
}
