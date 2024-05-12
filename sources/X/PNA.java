package X;

import Y.ACallableS106S0100000_3;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PNA implements Runnable {
    public static final PNA LJLIL = new PNA();

    public static void LIZ() {
        boolean z;
        boolean z2;
        OSZ<Long, Long> LIZJ = PN9.LIZJ();
        long longValue = LIZJ.getFirst().longValue();
        long longValue2 = LIZJ.getSecond().longValue();
        long j = longValue + longValue2;
        if (PN9.LJJIL) {
            PN9.LIZIZ = LIZJ;
        } else {
            long j2 = j - PN9.LJFF;
            if (PN9.LJJJ) {
                PN9.LJI += j2;
            } else {
                PN9.LJIIIIZZ += j2;
            }
        }
        long j3 = PN9.LJI;
        long j4 = PN9.LJIIIIZZ;
        long j5 = PN9.LJIIJ;
        long j6 = PN9.LJIIL;
        long j7 = PN9.LJIILJJIL;
        long j8 = PN9.LJIILLIIL;
        long j9 = PN9.LJIJ;
        long j10 = PN9.LJIJJ;
        long j11 = PN9.LJIL;
        long j12 = PN9.LJJI;
        long j13 = PN9.LJJII;
        long j14 = PN9.LJJIIJ;
        long j15 = PN9.LJJIIZ;
        long j16 = PN9.LJJIJ;
        long j17 = PN9.LJJIJIIJIL;
        if (PN9.LJJJ && !PN9.LJJJIL) {
            z = true;
        } else {
            z = false;
        }
        if (!PN9.LJJJ && !PN9.LJJJIL) {
            z2 = true;
        } else {
            z2 = false;
        }
        PN9.LJJJIL = false;
        long j18 = j - PN9.LIZJ;
        if (j18 < 1024 || j18 > 109951162777600L) {
            return;
        }
        long j19 = longValue - PN9.LIZLLL;
        long j20 = longValue2 - PN9.LJ;
        long j21 = j3 - PN9.LJII;
        long j22 = j4 - PN9.LJIIIZ;
        long j23 = j5 - PN9.LJIIJJI;
        long j24 = j6 - PN9.LJIILIIL;
        long j25 = j7 - PN9.LJIILL;
        long j26 = j8 - PN9.LJIIZILJ;
        long j27 = j9 - PN9.LJIJI;
        long j28 = j10 - PN9.LJIJJLI;
        long j29 = j11 - PN9.LJJ;
        long j30 = j12 - PN9.LJJIFFI;
        long j31 = j13 - PN9.LJJIII;
        long j32 = j14 - PN9.LJJIIJZLJL;
        long j33 = j15 - PN9.LJJIIZI;
        long j34 = j16 - PN9.LJJIJIIJI;
        long j35 = j17 - PN9.LJJIJIL;
        PN9.LIZJ = j;
        PN9.LIZLLL = longValue;
        PN9.LJ = longValue2;
        PN9.LJII = j3;
        PN9.LJIIIZ = j4;
        PN9.LJFF = j;
        PN9.LJIIJJI = j5;
        PN9.LJIILIIL = j6;
        PN9.LJIILL = j7;
        PN9.LJIIZILJ = j8;
        PN9.LJIJI = j9;
        PN9.LJIJJLI = j10;
        PN9.LJJ = j11;
        PN9.LJJIFFI = j12;
        PN9.LJJIII = j13;
        PN9.LJJIIJZLJL = j14;
        PN9.LJJIIZI = j15;
        PN9.LJJIJIIJI = j16;
        PN9.LJJIJIL = j17;
        if (PN9.LJJIL) {
            PN9.LJJIL = false;
            return;
        }
        boolean isNewUser = C2NW.LIZ().isNewUser();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("total_bytes", String.valueOf(j18));
        jSONObject.put("wifi_bytes", String.valueOf(j19));
        jSONObject.put("mobile_bytes", String.valueOf(j20));
        jSONObject.put("foreground_bytes", String.valueOf(j21));
        jSONObject.put("background_bytes", String.valueOf(j22));
        jSONObject.put("rx_bytes", String.valueOf(j23));
        jSONObject.put("tx_bytes", String.valueOf(j24));
        jSONObject.put("all_foreground", z);
        jSONObject.put("all_background", z2);
        jSONObject.put("history_total_bytes", String.valueOf(j));
        jSONObject.put("history_wifi_bytes", String.valueOf(longValue));
        jSONObject.put("history_mobile_bytes", String.valueOf(longValue2));
        jSONObject.put("ttnet_bytes", String.valueOf(j25));
        jSONObject.put("okhttp_bytes", String.valueOf(j26));
        jSONObject.put("url_connection_bytes", String.valueOf(j27));
        jSONObject.put("other_http_bytes", String.valueOf(j28));
        jSONObject.put("ttnet_image_bytes", String.valueOf(j29));
        jSONObject.put("ttnet_stream_bytes", String.valueOf(j30));
        jSONObject.put("web_socket_bytes", String.valueOf(j31));
        jSONObject.put("video_play_bytes", String.valueOf(j32));
        jSONObject.put("video_preload_bytes", String.valueOf(j33));
        jSONObject.put("live_bytes", String.valueOf(j34));
        jSONObject.put("gecko_bytes", String.valueOf(j35));
        jSONObject.put("is_first_install", isNewUser);
        jSONObject.put("is_first_ten_minutes", PN9.LJJIZ);
        C10K.LIZJ(new ACallableS106S0100000_3(jSONObject, 8));
        if (!PN9.LJJIZ) {
            return;
        }
        PN9.LJJIZ = false;
        jSONObject.put("is_first_install", isNewUser);
        C10K.LIZJ(new ACallableS106S0100000_3(jSONObject, 9));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
