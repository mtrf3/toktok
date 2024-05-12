package X;

import android.os.Build;
import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

/* renamed from: X.QQc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66970QQc {
    public final QRR LIZ;

    public final java.util.Map<String, String> LIZ() {
        HashMap hashMap = new HashMap();
        QRG.LIZIZ().getClass();
        QQO.LIZ().LIZIZ(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("push_sdk_version", String.valueOf(30204));
        hashMap2.put("push_sdk_version_name", "3.2.4-alpha.29");
        String str = (String) hashMap.get("install_id");
        if (!C38354F3m.LJ(str)) {
            hashMap2.put("iid", str);
        }
        String str2 = (String) hashMap.get("device_id");
        if (!C38354F3m.LJ(str2)) {
            hashMap2.put("device_id", str2);
        }
        String LLJILJILJ = C16880lQ.LLJILJILJ(this.LIZ.LIZ);
        if (!C38354F3m.LJ(LLJILJILJ)) {
            hashMap2.put("ac", LLJILJILJ);
        }
        InterfaceC66999QRf interfaceC66999QRf = QRM.LJIIIIZZ.LIZIZ.LJIJJ;
        if (interfaceC66999QRf != null) {
            String secUid = interfaceC66999QRf.getSecUid();
            if (!C38354F3m.LJ(secUid)) {
                hashMap2.put("sec_uid", secUid);
            }
        }
        String str3 = this.LIZ.LJI;
        if (str3 != null) {
            hashMap2.put("channel", str3);
        }
        hashMap2.put("aid", String.valueOf(this.LIZ.LIZIZ));
        String str4 = this.LIZ.LJIIIIZZ;
        if (str4 != null) {
            hashMap2.put("app_name", str4);
        }
        hashMap2.put("version_code", String.valueOf(this.LIZ.LIZJ));
        hashMap2.put("version_name", this.LIZ.LJ);
        hashMap2.put("update_version_code", String.valueOf(this.LIZ.LIZLLL));
        hashMap2.put("device_type", Build.MODEL);
        hashMap2.put("device_brand", Build.BRAND);
        hashMap2.put("os_api", String.valueOf(Build.VERSION.SDK_INT));
        try {
            String str5 = Build.VERSION.RELEASE;
            if (str5 != null && str5.length() > 10) {
                str5 = str5.substring(0, 10);
            }
            hashMap2.put("os_version", str5);
        } catch (Exception unused) {
        }
        int LJIIIIZZ = KL2.LJIIIIZZ(this.LIZ.LIZ);
        if (LJIIIIZZ > 0) {
            hashMap2.put("dpi", String.valueOf(LJIIIIZZ));
        }
        hashMap2.put("rom", C16880lQ.LLIIIILZ());
        hashMap2.put("os", "android");
        hashMap2.put("package", this.LIZ.LIZ.getPackageName());
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        if (timeZone != null) {
            hashMap2.put("tz_offset", String.valueOf(timeZone.getOffset(System.currentTimeMillis()) / 1000));
            hashMap2.put("tz_name", timeZone.getID());
        }
        try {
            if (this.LIZ.LJIILL != null) {
                hashMap2.putAll(C47956Irw.LIZ());
            }
            hashMap2.put("rom_version", PCH.LIZJ);
        } catch (Exception unused2) {
        }
        return hashMap2;
    }

    public C66970QQc(QRR qrr) {
        this.LIZ = qrr;
    }
}
