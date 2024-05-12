package X;

import com.google.gson.internal.b;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.9o4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C247849o4 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        long j;
        Long LJJIZ;
        String pinTrackString = C9X3.LIZ.LIZIZ("showcase_pin_product_duration_track", "");
        o.LJIIIIZZ(pinTrackString, "pinTrackString");
        if (!ujb.o.LJJJJJL(pinTrackString)) {
            try {
                HashMap hashMap = (HashMap) C75792yF.LIZIZ().LJII(pinTrackString, new TypeToken<HashMap<String, String>>() { // from class: X.9o5
                }.getType());
                if (hashMap != null) {
                    String str2 = (String) hashMap.get("start_pin_time");
                    if (str2 != null && (LJJIZ = C38350F3i.LJJIZ(str2)) != null) {
                        j = LJJIZ.longValue();
                    } else {
                        j = 0;
                    }
                    if (o.LJ(str, hashMap.get("room_id"))) {
                        hashMap.put("duration", String.valueOf(System.currentTimeMillis() - j));
                        b.LJJIJIIJI("livesdk_tiktokec_pin_product_duration", hashMap);
                    }
                }
            } catch (Exception unused) {
            }
            C9X3.LIZ.LIZ.erase("showcase_pin_product_duration_track");
        }
    }
}
