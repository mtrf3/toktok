package X;

import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.OHt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61657OHt {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(long j, String str, java.util.Map map) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        long j2 = 0;
        if (j > 0) {
            j2 = System.currentTimeMillis() - j;
        }
        hashMap.put("start_click_to_now", Long.valueOf(j2));
        hashMap.put("subpage_name", str);
        C76542zS.LIZ("rd_tiktokec_enter_page", hashMap);
    }

    public static void LIZIZ(EnumC71845SHp type, boolean z, long j, java.util.Map map) {
        o.LJIIIZ(type, "type");
        HashMap hashMap = new HashMap();
        String lowerCase = type.toString().toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        hashMap.put("type", lowerCase);
        hashMap.put("is_success", Boolean.valueOf(z));
        hashMap.put("duration", Long.valueOf(j));
        hashMap.putAll(map);
        C76542zS.LIZ("rd_tiktokec_request_duration", hashMap);
    }
}
