package X;

import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAppLogAudienceSampleRate;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAppLogSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.i0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class CL5 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(java.util.Map map, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        o.LJIIIIZZ(keys, "json.keys()");
        while (keys.hasNext()) {
            String key = keys.next();
            Object obj = jSONObject.get(key);
            o.LJIIIIZZ(key, "key");
            map.put(key, obj.toString());
        }
    }

    public static void LIZIZ(String eventId, JSONObject extra, JSONObject jSONObject, JSONObject jSONObject2, boolean z, int i, boolean z2) {
        String str;
        String LJFF;
        String str2;
        o.LJIIIZ(eventId, "eventId");
        o.LJIIIZ(extra, "extra");
        if (!LiveMatchAppLogSetting.INSTANCE.isEnable()) {
            return;
        }
        int rate = LiveMatchAppLogAudienceSampleRate.INSTANCE.getRate();
        if (!C30922CBq.LIZIZ && !z2 && new Random().nextInt(100) >= rate) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (i == 1) {
            if (z2) {
                str = "livesdk_match_";
            } else {
                str = "livesdk_match_audience_";
            }
        } else if (z2) {
            str = "livesdk_cohost_";
        } else {
            str = "livesdk_cohost_audience_";
        }
        if (ujb.o.LJJJLIIL(eventId, "battle_", false)) {
            LJFF = ujb.o.LJJJJZI(eventId, "battle_", str, false);
        } else {
            LJFF = i0.LJFF(str, eventId);
        }
        LIZ(linkedHashMap, extra);
        LIZ(linkedHashMap, jSONObject2);
        LIZ(linkedHashMap, jSONObject);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_multi", str2);
        BZI LIZ2 = C28787BRn.LIZ(LJFF);
        LIZ2.LJJIFFI(linkedHashMap);
        if (o.LJ("livesdk_match_audience_room_enter_identify", LJFF) && BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
            LIZ2.LJJIJ();
            LIZ2.LJJIIZI();
        } else {
            LIZ2.LJIIZILJ();
            LIZ2.LJJIIJZLJL();
        }
    }
}
