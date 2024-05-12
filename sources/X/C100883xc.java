package X;

import com.ss.android.ugc.aweme.ml.events.EventWithPortraitsConfig;
import com.ss.android.ugc.aweme.ml.events.EventWithPortraitsOneItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.3xc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100883xc {
    public static boolean LIZ;
    public static HashMap<String, List<String>> LIZIZ;

    public static void LIZIZ() {
        FFL.LJIIIZ().getClass();
        EventWithPortraitsConfig eventWithPortraitsConfig = (EventWithPortraitsConfig) FFL.LJIJ(false, "event_with_portrait_config", 31744, EventWithPortraitsConfig.class, null);
        if (eventWithPortraitsConfig != null) {
            List<EventWithPortraitsOneItem> events = eventWithPortraitsConfig.getEvents();
            if (eventWithPortraitsConfig.getEnable() && events != null && (!events.isEmpty())) {
                LIZ = true;
                HashMap<String, List<String>> hashMap = new HashMap<>();
                for (EventWithPortraitsOneItem eventWithPortraitsOneItem : events) {
                    LIZ(eventWithPortraitsOneItem.getName(), eventWithPortraitsOneItem.getPortraits(), hashMap);
                    List<String> names = eventWithPortraitsOneItem.getNames();
                    if (names != null) {
                        Iterator<String> it = names.iterator();
                        while (it.hasNext()) {
                            LIZ(it.next(), eventWithPortraitsOneItem.getPortraits(), hashMap);
                        }
                    }
                }
                if (!hashMap.isEmpty()) {
                    LIZIZ = hashMap;
                }
            }
        }
    }

    public static String LIZJ(String str) {
        List<String> list;
        HashMap<String, List<String>> hashMap = LIZIZ;
        if (hashMap != null && (list = hashMap.get(str)) != null) {
            JSONObject jSONObject = new JSONObject();
            for (String str2 : list) {
                jSONObject.putOpt(str2, C48537J3d.LIZ().LIZJ(str2));
            }
            return jSONObject.toString();
        }
        return null;
    }

    public static void LIZ(String str, List list, HashMap hashMap) {
        if (str == null || list == null || list.isEmpty()) {
            return;
        }
        List list2 = (List) hashMap.get(str);
        if (list2 != null) {
            for (Object obj : list) {
                if (!list2.contains(obj)) {
                    list2.add(obj);
                }
            }
            return;
        }
        hashMap.put(str, ORZ.LLJILJILJ(list));
    }
}
