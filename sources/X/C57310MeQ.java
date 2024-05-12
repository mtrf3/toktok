package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.MeQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57310MeQ {
    public static final /* synthetic */ int LIZ = 0;

    public static java.util.Map LIZIZ(C57285Me1 c57285Me1) {
        o.LJIIIZ(c57285Me1, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("user_id", c57285Me1.LIZ);
        linkedHashMap.put("sec_user_id", c57285Me1.LIZIZ);
        linkedHashMap.put("type", String.valueOf(c57285Me1.LIZJ));
        String str = c57285Me1.LJFF;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("channel_id", String.valueOf(C55688LtM.LIZ(str)));
        linkedHashMap.put("from", String.valueOf(c57285Me1.LIZLLL));
        if (o.LJ(linkedHashMap.get("type"), "1")) {
            linkedHashMap.put("from_pre", String.valueOf(C55888Lwa.LIZIZ.LJII(String.valueOf(c57285Me1.LIZLLL), String.valueOf(c57285Me1.LJ))));
        } else {
            linkedHashMap.put("from_pre", String.valueOf(c57285Me1.LJ));
        }
        if (C78685UuP.LJJJZ(c57285Me1.LJIILL)) {
            String str2 = c57285Me1.LJIILL;
            if (str2 != null) {
                linkedHashMap.put("rec_type", str2);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        String str3 = c57285Me1.LJI;
        if (str3 != null) {
            linkedHashMap.put("item_id", str3);
        }
        java.util.Map<String, String> map = c57285Me1.LJIIJJI;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.put("action_time", String.valueOf(System.currentTimeMillis()));
        linkedHashMap.put("is_network_available", String.valueOf(C48203Ivv.LJ(EF7.LIZIZ())));
        return linkedHashMap;
    }

    public static InterfaceC65462ha LIZ(String uid, java.util.Map map) {
        o.LJIIIZ(uid, "uid");
        XGR LIZ2 = XGJ.LIZ().LIZ(new C57312MeS(map));
        LIZ2.LIZ(new C84566XGw(new C57331Mel()));
        LIZ2.LIZ(new XH4(new XHW(uid)));
        return LIZ2.LIZIZ();
    }
}
