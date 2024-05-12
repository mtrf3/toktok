package X;

import java.nio.charset.Charset;
import java.util.Formatter;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F9D {
    public static String LIZ(String str) {
        Charset charset = PVC.LIZ;
        byte[] bytes = str.getBytes(charset);
        o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "HmacSHA256");
        javax.crypto.Mac mac = javax.crypto.Mac.getInstance("HmacSHA256");
        mac.init(secretKeySpec);
        byte[] bytes2 = "slardar".getBytes(charset);
        o.LJIIIIZZ(bytes2, "this as java.lang.String).getBytes(charset)");
        byte[] doFinal = mac.doFinal(bytes2);
        o.LJIIIIZZ(doFinal, "mac.doFinal(data.toByteArray())");
        Formatter formatter = new Formatter();
        for (byte b : doFinal) {
            formatter.format("%02x", Byte.valueOf(b));
        }
        String formatter2 = formatter.toString();
        o.LJIIIIZZ(formatter2, "formatter.toString()");
        return formatter2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:17:0x0002, B:4:0x000d, B:6:0x0016, B:8:0x0028, B:10:0x002c, B:14:0x0033), top: B:16:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZIZ(java.lang.String r4) {
        /*
            if (r4 == 0) goto L8
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L39
            if (r0 != 0) goto La
        L8:
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            if (r0 != 0) goto L33
            java.lang.String r0 = "0"
            boolean r0 = kotlin.jvm.internal.o.LJ(r4, r0)     // Catch: java.lang.Throwable -> L39
            if (r0 != 0) goto L33
        L16:
            com.bytedance.ies.abmock.SettingsManager r3 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L39
            java.lang.Class<com.bytedance.pns.scopedid.ScopedDeviceIdModel> r2 = com.bytedance.pns.scopedid.ScopedDeviceIdModel.class
            com.bytedance.pns.scopedid.ScopedDeviceIdModel r1 = X.F91.LIZ     // Catch: java.lang.Throwable -> L39
            java.lang.String r0 = "pns_scoped_device_id_settings"
            java.lang.Object r0 = r3.LJIIIIZZ(r0, r2, r1)     // Catch: java.lang.Throwable -> L39
            com.bytedance.pns.scopedid.ScopedDeviceIdModel r0 = (com.bytedance.pns.scopedid.ScopedDeviceIdModel) r0     // Catch: java.lang.Throwable -> L39
            if (r0 != 0) goto L31
        L28:
            boolean r0 = r1.enabled     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L33
            java.lang.String r0 = LIZ(r4)     // Catch: java.lang.Throwable -> L39
            return r0
        L31:
            r1 = r0
            goto L28
        L33:
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L39
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L39
            goto L41
        L39:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        L41:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F9D.LIZIZ(java.lang.String):java.lang.String");
    }
}
