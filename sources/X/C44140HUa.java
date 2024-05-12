package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.HUa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44140HUa {
    public static final /* synthetic */ int LIZ = 0;

    public static java.util.Map LIZIZ(String awemeId, String str, boolean z) {
        o.LJIIIZ(awemeId, "awemeId");
        HashMap hashMap = new HashMap();
        hashMap.put("item_id", awemeId);
        hashMap.put("group_id", awemeId);
        hashMap.put("disable_collect", String.valueOf(z));
        hashMap.put("enter_from", "single_song");
        hashMap.put("upsell_reason", "click_play_full_song");
        if (str != null) {
            hashMap.put("process_id", str);
        }
        return hashMap;
    }

    public static java.util.Map LIZ(String enterFrom, String str, String str2, String str3) {
        o.LJIIIZ(enterFrom, "enterFrom");
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", enterFrom);
        hashMap.put("upsell_reason", str);
        if (str2 != null) {
            hashMap.put("request_id", str2);
        }
        if (str3 != null) {
            hashMap.put("process_id", str3);
        }
        return hashMap;
    }
}
