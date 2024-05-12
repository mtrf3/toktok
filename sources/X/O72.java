package X;

import android.os.SystemClock;
import android.text.TextUtils;
import defpackage.a1;
import defpackage.b1;
import java.net.URLEncoder;
import java.util.List;
import ujb.o;

/* loaded from: classes11.dex */
public final class O72 {
    public static C64797Pbt LIZ(C56438MDa c56438MDa) {
        Long l;
        String str;
        String str2;
        C64797Pbt<String> c64797Pbt;
        C64738Paw c64738Paw;
        O7E o7e;
        String LJIILL = O77.LJIILL();
        String str3 = null;
        if (LJIILL == null) {
            return null;
        }
        String LJJJJZ = o.LJJJJZ(LJIILL, "/api/ad/v2/ack/splash/", "/api/ad/v1/realtime_menu", false);
        SystemClock.elapsedRealtime();
        C61360O6i.LIZJ().getClass();
        List<O7E> list = O7I.LIZIZ().LIZ;
        if (list != null && (o7e = (O7E) ORZ.LJLLLL(list)) != null) {
            l = Long.valueOf(o7e.LJLL);
        } else {
            l = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJJJJZ);
        LIZ.append("&splashId=");
        LIZ.append(l);
        String LIZIZ = X1D.LIZIZ(LIZ);
        NPU LIZ2 = NW6.LIZ();
        if (LIZ2 != null) {
            str = LIZ2.getCurUserId();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            LIZIZ = a1.LJ(LIZIZ, "&user_id=", str);
        }
        String LIZIZ2 = FLE.LIZIZ();
        if (!TextUtils.isEmpty(LIZIZ2)) {
            StringBuilder LIZJ = b1.LIZJ(LIZIZ, "&ad_user_agent=");
            LIZJ.append(URLEncoder.encode(LIZIZ2));
            LIZIZ = X1D.LIZIZ(LIZJ);
        }
        StringBuilder LIZJ2 = b1.LIZJ(LIZIZ, "&cmpl_enc=");
        NPU LIZ3 = NW6.LIZ();
        if (LIZ3 != null) {
            str2 = LIZ3.LJIILL();
        } else {
            str2 = null;
        }
        LIZJ2.append(str2);
        String LIZIZ3 = X1D.LIZIZ(LIZJ2);
        SystemClock.elapsedRealtime();
        StringBuilder LIZ4 = X1D.LIZ();
        String LJFF = JBR.LJFF(LIZ4, C42952GtQ.LIZ, LIZIZ3, LIZ4);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        InterfaceC37276Ek4<String> executeGet = C61367O6p.LIZ().executeGet(0, LJFF);
        if (executeGet != null) {
            c64797Pbt = executeGet.execute();
        } else {
            c64797Pbt = null;
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (c56438MDa != null) {
            Long valueOf = Long.valueOf(elapsedRealtime2 - elapsedRealtime);
            java.util.Map<String, Long> map = c56438MDa.LIZ;
            C56569MIb.LIZ.getClass();
            map.put(C56569MIb.LJI.LIZ, valueOf);
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("realtime_splash_request  ttnet retrofitMetrics detail time：");
        if (c64797Pbt != null && (c64738Paw = c64797Pbt.LIZLLL) != null) {
            str3 = c64738Paw.LIZLLL();
        }
        LIZ5.append(str3);
        X1D.LIZIZ(LIZ5);
        return c64797Pbt;
    }
}
