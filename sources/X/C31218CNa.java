package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.CNa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31218CNa {
    public static final void LIZIZ(long j, String containerId, String cardName, String str, String url) {
        o.LJIIIZ(containerId, "containerId");
        o.LJIIIZ(cardName, "cardName");
        o.LJIIIZ(url, "url");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("container_id", containerId);
        linkedHashMap.put("card_name", cardName);
        linkedHashMap.put("container_name", str);
        linkedHashMap.put("url", url);
        linkedHashMap.put("duration", Long.valueOf(j));
        C0K2.LJII(0, "ttlive_card_view_load_succeed", linkedHashMap);
        linkedHashMap.put("event_name", "ttlive_card_view_load_succeed");
        C28733BPl.LJIILIIL().LJIIIIZZ("ttlive_hybrid", linkedHashMap);
    }

    public static final void LIZ(String containerId, String cardName, Integer num, String str, String url, String str2) {
        o.LJIIIZ(containerId, "containerId");
        o.LJIIIZ(cardName, "cardName");
        o.LJIIIZ(url, "url");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("container_id", containerId);
        linkedHashMap.put("card_name", cardName);
        linkedHashMap.put("container_name", str);
        linkedHashMap.put("url", url);
        linkedHashMap.put("error_code", num);
        linkedHashMap.put("error_reason", str2);
        C0K2.LJII(1, "ttlive_card_view_load_failed", linkedHashMap);
        linkedHashMap.put("event_name", "ttlive_card_view_load_failed");
        C28733BPl.LJIILIIL().LJ("ttlive_hybrid", linkedHashMap);
    }
}
