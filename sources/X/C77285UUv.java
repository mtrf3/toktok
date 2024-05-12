package X;

import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import defpackage.b0;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.UUv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77285UUv {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ() {
        Object obj;
        String valueOf = String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        java.util.Map map = (java.util.Map) DataChannelGlobal.LJLJJI.mv0(C29824BnA.class);
        if (map == null || (obj = map.get("anchor_id")) == null) {
            obj = 0;
        }
        return o.LJ(valueOf, obj) ? 1 : 0;
    }

    public static void LIZIZ(C77286UUw info, int i) {
        o.LJIIIZ(info, "info");
        Long l = info.LJFF;
        if (l != null) {
            long longValue = l.longValue();
            String str = info.LJI;
            if (str == null) {
                return;
            }
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - longValue);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("logGiftListSuccess ");
            b0.LJ(LIZ2, info.LJI, " takes ", millis);
            LIZ2.append(" ms");
            C0NB.LJIIIZ("GiftListV2Monitor", X1D.LIZIZ(LIZ2));
            LIZLLL(str, millis, i, info, 0, null, null, null);
        }
    }

    public static void LIZJ(long j, String str, String str2, Integer num) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", j);
        jSONObject.put("static_url", str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("error_msg", str2);
        jSONObject2.put("error_code", num);
        BZI LIZ2 = C28787BRn.LIZ("gift_list_cold_data_download_info");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(Integer.valueOf(LIZ()), "is_anchor");
        LIZ2.LJJ(jSONObject);
        LIZ2.LJJ(jSONObject2);
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZLLL(String str, long j, int i, C77286UUw c77286UUw, Integer num, Integer num2, String str2, String str3) {
        String str4;
        String str5 = str2;
        JSONObject LIZLLL = Q7K.LIZLLL("duration", j);
        LIZLLL.put("dynamic_latest_hash", c77286UUw.LIZ);
        LIZLLL.put("static_latest_hash", c77286UUw.LIZIZ);
        LIZLLL.put("dynamic_gift_count", c77286UUw.LIZJ);
        LIZLLL.put("static_gift_count", c77286UUw.LIZLLL);
        LIZLLL.put("fetch_giftlist_from", C32710Csc.LIZ(i));
        int hashCode = str.hashCode();
        if (hashCode != -1754048796) {
            if (hashCode != -265673579) {
                if (hashCode == 1930747159 && str.equals("gift_list_dynamic_data_fetch")) {
                    LIZLLL.put("log_id", c77286UUw.LJIIIIZZ);
                    if (num2 != null) {
                        LIZLLL.put("server_error_code", num2.intValue());
                    }
                    LIZLLL.put("is_full_gift_data", c77286UUw.LJIIIZ);
                }
            } else if (str.equals("gift_list_data_merge")) {
                LIZLLL.put("merge_type", c77286UUw.LJII);
            }
        } else if (str.equals("gift_list_static_data_fetch")) {
            if (num2 != null) {
                LIZLLL.put("server_error_code", num2.intValue());
            }
            String str6 = c77286UUw.LJ;
            if (str6 != null) {
                LIZLLL.put("static_url", str6);
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error_code", num);
        if (str5 == null) {
            str4 = "";
        } else {
            str4 = str5;
        }
        jSONObject.put("error_msg", str4);
        jSONObject.put("extra_msg", str3);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("error_code", num);
        if (str5 == null) {
            str5 = "";
        }
        jSONObject2.put("error_msg", str5);
        jSONObject2.put("extra_msg", str3);
        if ((!o.LJ("gift_list_dynamic_data_fetch", str) || LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_gift_list_dynamic_data_fetch", 0.1d)) && (!o.LJ("gift_list_data_merge", str) || LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_gift_list_data_merge", 0.1d))) {
            BZI LIZ2 = C28787BRn.LIZ(str);
            LIZ2.LJIIZILJ();
            LIZ2.LJIJJ(Integer.valueOf(LIZ()), "is_anchor");
            LIZ2.LJJ(LIZLLL);
            LIZ2.LJJ(jSONObject);
            LIZ2.LJJ(jSONObject2);
            LIZ2.LJJIIJZLJL();
        }
        if (num == null || num.intValue() != 0) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(str);
            LIZ3.append("_error");
            C0K2.LJI(X1D.LIZIZ(LIZ3), jSONObject, LIZLLL, jSONObject2);
            return;
        }
        C0K2.LJI(str, jSONObject, LIZLLL, jSONObject2);
    }
}
