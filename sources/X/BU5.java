package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes6.dex */
public final class BU5 {
    public static final List<String> LIZ = C47261Igj.LJJIJ("livesdk_send_gift");
    public static final List<String> LIZIZ = C47261Igj.LJJIJ("livesdk_recharge_success");
    public static final java.util.Map<String, List<String>> LIZJ = C113554cx.LJJLIIIIJ(new OSZ("livesdk_send_gift", C47261Igj.LJJIJIIJI("money", "gift_info", "gift_cnt")), new OSZ("livesdk_recharge_success", Collections.singletonList("money")));

    public static void LIZ(String str, java.util.Map map) {
        List list = (List) ((LinkedHashMap) LIZJ).get(str);
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
    }
}
