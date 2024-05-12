package X;

import java.util.LinkedHashMap;

/* renamed from: X.BYj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28965BYj {
    public static final java.util.Map<String, Object> LIZ = new LinkedHashMap();
    public static long LIZIZ = -1;

    public static final void LIZ(boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZ);
        linkedHashMap.put("is_mic", Boolean.valueOf(z));
        LIZIZ("profile_clicked", linkedHashMap);
    }

    public static void LIZJ(String str) {
        BZI LIZ2 = C28787BRn.LIZ("scm_page_view");
        C06540Nm.LJFF((C29374Bfu) B83.LIZ().LIZIZ(), LIZ2, "object_id", str, "page_name");
        LIZ2.LJIJJ(C64707PaR.LIZJ, "country_code");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZIZ(String str, java.util.Map map) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("livesdk_userinfo_");
        LIZ2.append(str);
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        C0K2.LJII(0, LIZIZ2, map);
        map.put("event_name", LIZIZ2);
        C28733BPl.LJIILIIL().LJIIIIZZ("ttlive_room", map);
    }
}
