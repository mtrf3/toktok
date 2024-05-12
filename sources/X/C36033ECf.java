package X;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.ECf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36033ECf {
    public static final C36033ECf LIZ = new C36033ECf();
    public static final java.util.Map<String, java.util.Map<String, EnumC35691Dzb>> LIZIZ;
    public static final java.util.Map<String, java.util.Map<String, C35689DzZ>> LIZJ;
    public static final java.util.Map<String, LinkedList<java.util.Map<String, Object>>> LIZLLL;

    static {
        EnumC35691Dzb enumC35691Dzb = EnumC35691Dzb.OVERRIDE;
        EnumC35691Dzb enumC35691Dzb2 = EnumC35691Dzb.ACCUMULATE;
        EnumC35691Dzb enumC35691Dzb3 = EnumC35691Dzb.MERGE;
        LIZIZ = C113554cx.LJJLIIIIJ(new OSZ("goods_view_action", C113554cx.LJJLIIIIJ(new OSZ("query", enumC35691Dzb), new OSZ("filter_data", enumC35691Dzb), new OSZ("sorter_data", enumC35691Dzb), new OSZ("timestamp", enumC35691Dzb), new OSZ("id_str", enumC35691Dzb), new OSZ("pid_str", enumC35691Dzb), new OSZ("type_i32", enumC35691Dzb), new OSZ("aid_str", enumC35691Dzb), new OSZ("favorite", enumC35691Dzb), new OSZ("enter_from_merge", enumC35691Dzb), new OSZ("stay_time", enumC35691Dzb2), new OSZ("clk_cnt", enumC35691Dzb2), new OSZ("cart", enumC35691Dzb3), new OSZ("buy", enumC35691Dzb3))), new OSZ("live_view_action", C113554cx.LJJLIIIIJ(new OSZ("product_id_list", enumC35691Dzb), new OSZ("room_id", enumC35691Dzb), new OSZ("author_id", enumC35691Dzb), new OSZ("timestamp", enumC35691Dzb))), new OSZ("video_view_action", C113554cx.LJJLIIIIJ(new OSZ("video_id", enumC35691Dzb), new OSZ("has_good_anchor", enumC35691Dzb), new OSZ("author_id", enumC35691Dzb), new OSZ("product_id_list", enumC35691Dzb), new OSZ("like", enumC35691Dzb), new OSZ("fav", enumC35691Dzb), new OSZ("duration", enumC35691Dzb2), new OSZ("video_duration", enumC35691Dzb), new OSZ("timestamp", enumC35691Dzb), new OSZ("play_time", enumC35691Dzb))), new OSZ("search_action", C113554cx.LJJLIIIIJ(new OSZ("query", enumC35691Dzb), new OSZ("channel", enumC35691Dzb), new OSZ("search_method", enumC35691Dzb), new OSZ("timestamp", enumC35691Dzb))));
        LIZJ = new LinkedHashMap();
        LIZLLL = new LinkedHashMap();
    }

    public static String LIZ() {
        java.util.Map<String, LinkedList<java.util.Map<String, Object>>> map;
        try {
            map = LIZLLL;
        } catch (Exception unused) {
        }
        if (!map.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            return C75792yF.LIZIZ().LJIILL(linkedHashMap);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:3:0x000a, B:5:0x0015, B:7:0x0021, B:11:0x002d, B:13:0x0038, B:15:0x003e, B:17:0x004c, B:18:0x0050, B:22:0x0057), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[Catch: Exception -> 0x002c, TRY_LEAVE, TryCatch #0 {Exception -> 0x002c, blocks: (B:3:0x000a, B:5:0x0015, B:7:0x0021, B:11:0x002d, B:13:0x0038, B:15:0x003e, B:17:0x004c, B:18:0x0050, B:22:0x0057), top: B:2:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(java.lang.String r6) {
        /*
            int r5 = X.EH7.LIZ(r6)
            java.lang.String r0 = "actType"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            r4 = 0
            java.util.Map<java.lang.String, java.util.LinkedList<java.util.Map<java.lang.String, java.lang.Object>>> r3 = X.C36033ECf.LIZLLL     // Catch: java.lang.Exception -> L2c
            r0 = r3
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Exception -> L2c
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Exception -> L2c
            if (r0 == 0) goto L2c
            r0 = r3
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Exception -> L2c
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Exception -> L2c
            java.util.LinkedList r0 = (java.util.LinkedList) r0     // Catch: java.lang.Exception -> L2c
            r2 = 0
            if (r0 == 0) goto L29
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Exception -> L2c
            r0 = 1
            if (r1 != r0) goto L29
            goto L2a
        L29:
            r0 = 0
        L2a:
            if (r0 == 0) goto L2d
        L2c:
            return r4
        L2d:
            r0 = r3
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Exception -> L2c
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Exception -> L2c
            java.util.LinkedList r0 = (java.util.LinkedList) r0     // Catch: java.lang.Exception -> L2c
            if (r0 == 0) goto L2c
            int r0 = r0.size()     // Catch: java.lang.Exception -> L2c
            if (r5 >= r0) goto L57
            com.google.gson.Gson r1 = X.C75792yF.LIZIZ()     // Catch: java.lang.Exception -> L2c
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch: java.lang.Exception -> L2c
            java.lang.Object r0 = r3.get(r6)     // Catch: java.lang.Exception -> L2c
            java.util.LinkedList r0 = (java.util.LinkedList) r0     // Catch: java.lang.Exception -> L2c
            if (r0 == 0) goto L55
            java.util.List r0 = r0.subList(r2, r5)     // Catch: java.lang.Exception -> L2c
        L50:
            java.lang.String r4 = r1.LJIILL(r0)     // Catch: java.lang.Exception -> L2c
            goto L2c
        L55:
            r0 = r4
            goto L50
        L57:
            com.google.gson.Gson r1 = X.C75792yF.LIZIZ()     // Catch: java.lang.Exception -> L2c
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch: java.lang.Exception -> L2c
            java.lang.Object r0 = r3.get(r6)     // Catch: java.lang.Exception -> L2c
            java.lang.String r4 = r1.LJIILL(r0)     // Catch: java.lang.Exception -> L2c
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36033ECf.LIZJ(java.lang.String):java.lang.String");
    }

    public static String LIZIZ(Integer num, java.util.Map map) {
        try {
            java.util.Map<String, LinkedList<java.util.Map<String, Object>>> map2 = LIZLLL;
            if (map2.isEmpty()) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map2).entrySet()) {
                if (num != null) {
                    if (num.intValue() < ((LinkedList) entry.getValue()).size()) {
                        Object key = entry.getKey();
                        List subList = ((LinkedList) entry.getValue()).subList(0, num.intValue());
                        o.LJIIIIZZ(subList, "entry.value.subList(0, size)");
                        linkedHashMap.put(key, subList);
                    } else {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                } else {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (map != null) {
                if (!(!map.isEmpty())) {
                    map = null;
                }
                if (map != null) {
                    linkedHashMap.putAll(map);
                }
            }
            return C75792yF.LIZIZ().LJIILL(linkedHashMap);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void LIZLLL(String str, String str2, java.util.Map map) {
        if (str2 == null || str2.length() == 0) {
            return;
        }
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZ, null, new C36002EBa(str, str2, map, null), 2);
    }
}
