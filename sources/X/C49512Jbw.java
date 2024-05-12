package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Jbw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49512Jbw {
    public static int LIZ;
    public static long LIZIZ;
    public static final java.util.Map<String, C49514Jby> LIZJ = new LinkedHashMap();

    public static void LIZ(String str) {
        long j;
        long j2;
        Long l;
        Long l2;
        Long l3;
        if (str == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        java.util.Map<String, C49514Jby> map = LIZJ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        C49514Jby c49514Jby = (C49514Jby) linkedHashMap.get(str);
        if (c49514Jby != null) {
            j = c49514Jby.LIZIZ;
        } else {
            j = 0;
        }
        C49514Jby c49514Jby2 = (C49514Jby) linkedHashMap.get(str);
        if (c49514Jby2 != null && (l3 = c49514Jby2.LIZ) != null) {
            j2 = l3.longValue();
        } else {
            j2 = currentTimeMillis;
        }
        long j3 = (currentTimeMillis - j2) + j;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("BotVisible endCardShow before= ");
        C49514Jby c49514Jby3 = (C49514Jby) linkedHashMap.get(str);
        if (c49514Jby3 != null) {
            l = Long.valueOf(c49514Jby3.LIZIZ);
        } else {
            l = null;
        }
        LIZ2.append(l);
        LIZ2.append(" after= ");
        LIZ2.append(j3);
        LIZ2.append(", startTime= ");
        C49514Jby c49514Jby4 = (C49514Jby) linkedHashMap.get(str);
        if (c49514Jby4 != null) {
            l2 = c49514Jby4.LIZ;
        } else {
            l2 = null;
        }
        LIZ2.append(l2);
        X1D.LIZIZ(LIZ2);
        map.put(str, new C49514Jby(j3, (Long) null));
    }

    public static void LIZLLL(String str) {
        Long l;
        C49514Jby c49514Jby;
        if (str == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("BotVisible startCardShow before= ");
        java.util.Map<String, C49514Jby> map = LIZJ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        C49514Jby c49514Jby2 = (C49514Jby) linkedHashMap.get(str);
        if (c49514Jby2 != null) {
            l = c49514Jby2.LIZ;
        } else {
            l = null;
        }
        LIZ2.append(l);
        LIZ2.append(" after= ");
        LIZ2.append(currentTimeMillis);
        X1D.LIZIZ(LIZ2);
        C49514Jby c49514Jby3 = (C49514Jby) linkedHashMap.get(str);
        if (c49514Jby3 != null) {
            c49514Jby = new C49514Jby(c49514Jby3.LIZIZ, Long.valueOf(currentTimeMillis));
        } else {
            c49514Jby = new C49514Jby(Long.valueOf(currentTimeMillis), 2);
        }
        map.put(str, c49514Jby);
    }

    public static void LJFF(java.util.Map map, JSONObject jSONObject) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (C78685UuP.LJJJZ((String) entry.getValue())) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public static void LIZJ(java.util.Map map, int i, boolean z) {
        long j;
        int i2;
        if (LIZIZ > 0) {
            j = System.currentTimeMillis() - LIZIZ;
        } else {
            j = 0;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            LJFF(map, jSONObject);
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("is_success", i2);
            jSONObject.put("loading_duration", j);
            jSONObject.put("click_times", LIZ);
            if (z) {
                jSONObject.put("text_length", i);
            }
        } catch (Exception unused) {
        }
        AppLogNewUtils.onEventV3("search_result_complete_show", jSONObject);
        LIZIZ = 0L;
    }

    public static void LJ(String str, java.util.Map map, boolean z) {
        if (str == null) {
            return;
        }
        LIZ(str);
        C49514Jby c49514Jby = (C49514Jby) ((LinkedHashMap) LIZJ).get(str);
        if (c49514Jby != null) {
            int i = 0;
            if (c49514Jby.LIZIZ != 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    LJFF(map, jSONObject);
                    jSONObject.put("duration", c49514Jby.LIZIZ);
                    if (z) {
                        i = 1;
                    }
                    jSONObject.put("is_expanded", i);
                } catch (Exception unused) {
                }
                AppLogNewUtils.onEventV3("search_card_exposure_duration", jSONObject);
                LIZIZ = 0L;
            }
        }
    }

    public static void LIZIZ(boolean z, int i, String interactionName, java.util.Map map) {
        String str;
        o.LJIIIZ(interactionName, "interactionName");
        if (z) {
            str = "quick_interaction_show";
        } else {
            str = "quick_interaction_click";
        }
        JSONObject jSONObject = new JSONObject();
        LJFF(map, jSONObject);
        jSONObject.put("rank", String.valueOf(i));
        jSONObject.put("interaction_name", interactionName);
        jSONObject.put("button_type", "click_info");
        jSONObject.put("enter_method", LiveGiftNewGifterBadgeSetting.DEFAULT);
        jSONObject.put("source", "1");
        AppLogNewUtils.onEventV3(str, jSONObject);
    }
}
