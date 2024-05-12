package X;

import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.ecommerce.ab.EcomEventMonitorSettings;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes9.dex */
public final class JDX {
    public static final C62822Ol8 LIZ;
    public static List<String> LIZIZ;
    public static final JDY LIZJ;
    public static final JDZ LIZLLL;
    public static volatile boolean LJ;
    public static final LinkedList<C28786BRm> LJFF;

    static {
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(C48794JDa.LJLIL);
        LIZ = LIZIZ2;
        Object value = LIZIZ2.getValue();
        o.LJIIIIZZ(value, "<get-repo>(...)");
        String string = ((Keva) value).getString("slark_events_monitor_list", "");
        o.LJIIIIZZ(string, "repo.getString(Key.SLARK_EVENTS_MONITOR_LIST, \"\")");
        LIZIZ = s.LJLJJL(string, new String[]{","}, 0, 6);
        LIZJ = JDY.LIZ;
        LIZLLL = new JDZ();
        LJFF = new LinkedList<>();
    }

    public static HashMap LIZ(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            String value = JSONObjectProtectorUtils.getString(jSONObject, key);
            o.LJIIIIZZ(key, "key");
            o.LJIIIIZZ(value, "value");
            hashMap.put(key, value);
        }
        return hashMap;
    }

    public static void LIZIZ(Object obj, String str) {
        if (o.LJ(str, "tiktokec_product_click")) {
            long eventPairDetectThreshold = EcomEventMonitorSettings.LIZ().getEventPairDetectThreshold();
            C28786BRm c28786BRm = new C28786BRm(str, SystemClock.elapsedRealtime());
            c28786BRm.LIZJ = XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C28785BRl(eventPairDetectThreshold, str, obj, c28786BRm, null), 2);
            LinkedList<C28786BRm> linkedList = LJFF;
            synchronized (linkedList) {
                linkedList.addLast(c28786BRm);
            }
            return;
        }
        if (o.LJ(str, "tiktokec_enter_product_detail")) {
            LinkedList<C28786BRm> linkedList2 = LJFF;
            synchronized (linkedList2) {
                C28786BRm c28786BRm2 = (C28786BRm) ORS.LJJLJLI(linkedList2);
                if (c28786BRm2 == null) {
                    if (obj != null) {
                        LIZJ(obj, "EC_ENTER_MISS_CLICK");
                    }
                } else {
                    XKQ xkq = c28786BRm2.LIZJ;
                    if (xkq != null) {
                        xkq.LIZIZ(null);
                    }
                    c28786BRm2.LIZJ = null;
                }
            }
        }
    }

    public static void LIZJ(Object obj, String str) {
        JSONObject jSONObject;
        if ((obj instanceof HashMap) && obj != null) {
            C78983UzD.LJIILLIIL(str, (java.util.Map) obj);
        } else {
            if (!(obj instanceof JSONObject) || (jSONObject = (JSONObject) obj) == null) {
                return;
            }
            C78983UzD.LJIILLIIL(str, LIZ(jSONObject));
        }
    }
}
