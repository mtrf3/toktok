package X;

import com.bytedance.geckox.model.CheckRequestBodyModel;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import ujb.o;

/* loaded from: classes11.dex */
public final class NGW {
    public static final NGW LIZ = new NGW();
    public static final String LIZIZ = "AdHybridGeckoManager";

    public static void LIZ(String str, String str2, List list, java.util.Map map, NGY ngy, java.util.Map map2) {
        if (o.LJJJJJL(str) || list.isEmpty()) {
            C58582Rq.LIZ("preloadGecko accessKey is empty or channelList is Empty", LIZIZ);
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if ((!o.LJJJJJL(str3)) && str3 != null) {
                map.put(str3, str2);
                CheckRequestBodyModel.TargetChannel targetChannel = new CheckRequestBodyModel.TargetChannel();
                targetChannel.channelName = str3;
                linkedHashSet.add(targetChannel);
                C59071NGh c59071NGh = new C59071NGh(str3, str2, null, Integer.valueOf(O3U.LIZ(str, str3) ? 1 : 0), null, 0, null, null, null, null, null, null, null, 16364);
                C59070NGg c59070NGg = new C59070NGg();
                c59070NGg.LJIIIIZZ(c59071NGh);
                String[] strArr = {"gecko_channel", WM7.SCENE_SERVICE};
                if (kotlin.jvm.internal.o.LJ(ngy.LJFF, Boolean.TRUE)) {
                    C58655N0h LJ = C58704N2e.LJ("hybrid_ad", "gecko_resource_exists", String.valueOf(ngy.LIZ), ngy.LIZIZ, ngy.LIZJ);
                    LJ.LIZ(c59070NGg.LJFF((String[]) Arrays.copyOf(strArr, 2)));
                    Object LIZLLL = c59070NGg.LIZLLL("exists");
                    kotlin.jvm.internal.o.LJII(LIZLLL, "null cannot be cast to non-null type kotlin.Int");
                    LJ.LIZIZ(LIZLLL, "exists");
                    LJ.LJI();
                } else {
                    c59070NGg.LJII("gecko_resource_exists", (String[]) Arrays.copyOf(strArr, 2));
                }
                C58582Rq.LIZ("geckoResourceStatus", "AdHybridEventManager");
                C58582Rq.LIZ("trigger  AdHybridEventManager.geckoResourceStatus ", LIZIZ);
            }
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) map2;
        if (linkedHashMap.get(str) == null) {
            map2.put(str, ORZ.LLJILJILJ(linkedHashSet));
        } else {
            List list2 = (List) linkedHashMap.get(str);
            if (list2 != null) {
                list2.addAll(linkedHashSet);
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("initGecko: accessKey = ");
        LIZ2.append(str);
        LIZ2.append(",channel = ");
        LIZ2.append(list);
        LIZ2.append(",scene = ");
        LIZ2.append(str2);
        C58582Rq.LIZ(X1D.LIZIZ(LIZ2), LIZIZ);
    }
}
