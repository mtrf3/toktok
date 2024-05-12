package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes5.dex */
public final class AX9 {
    public static final List<String> LIZ = C47261Igj.LJJIJIIJI("KeyboardDialogFragment", "GiftAnimationFragment", "SkuPanelFragment");
    public static final HashMap<Integer, C26240ARo> LIZIZ = new HashMap<>();

    public static String LIZ() {
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (!(LJIIIIZZ instanceof ActivityC45651qj)) {
            return "";
        }
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) LJIIIIZZ;
        com.bytedance.hox.Hox LIZ2 = com.bytedance.hox.Hox.LJLLI.LIZ(activityC45651qj);
        if (LIZ2.vv0("For You")) {
            return "For You";
        }
        if (LIZ2.vv0("Following")) {
            return "Following";
        }
        if (LIZ2.vv0("HOME")) {
            return "HOME";
        }
        if (LIZ2.vv0("DISCOVER")) {
            return "DISCOVER";
        }
        if (LIZ2.vv0("FRIENDS_FEED")) {
            return "FRIENDS_FEED";
        }
        if (LIZ2.vv0("PUBLISH")) {
            return "PUBLISH";
        }
        if (LKR.LIZIZ(activityC45651qj, "NOTIFICATION")) {
            return "NOTIFICATION";
        }
        if (LKR.LIZIZ(activityC45651qj, "USER")) {
            return "USER";
        }
        if (LIZ2.vv0("UNLOGIN_NOTIFICATION")) {
            return "UNLOGIN_NOTIFICATION";
        }
        if (LIZ2.vv0("UNLOGIN_PROFILE")) {
            return "UNLOGIN_PROFILE";
        }
        if (LIZ2.vv0("CHANNELS")) {
            return "CHANNELS";
        }
        if (LIZ2.vv0("NEARBY")) {
            return "NEARBY";
        }
        if (LIZ2.vv0("FAMILIAR")) {
            return "FAMILIAR";
        }
        return "UNKNOWN";
    }

    public static boolean LIZIZ() {
        String str;
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ == null || (str = LJIIIIZZ.getClass().getName()) == null) {
            str = "";
        }
        if (!s.LJJJLZIJ(str, "MainActivity", false)) {
            return false;
        }
        return true;
    }

    public static final void LIZJ(C26240ARo alertContext) {
        o.LJIIIZ(alertContext, "alertContext");
        HashMap<Integer, C26240ARo> hashMap = LIZIZ;
        if (hashMap.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Integer, C26240ARo>> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            C26240ARo value = it.next().getValue();
            String str = value.LIZJ;
            Iterator<String> it2 = LIZ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    String next = it2.next();
                    if (str == null || !s.LJJJLZIJ(str, next, false)) {
                    }
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("cur_tab", value.LIZIZ);
                    jSONObject.put("trace", value.LIZLLL);
                    jSONObject.put("class_name", value.LIZJ);
                    String jSONObject2 = jSONObject.toString();
                    o.LJIIIIZZ(jSONObject2, "json.toString()");
                    arrayList.add(jSONObject2);
                    break;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("cur_tab", alertContext.LIZIZ);
            jSONObject3.put("trace", alertContext.LIZLLL);
            jSONObject3.put("class_name", alertContext.LIZJ);
            String jSONObject4 = jSONObject3.toString();
            o.LJIIIIZZ(jSONObject4, "json.toString()");
            ListProtector.add(arrayList, 0, jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("conflict_alert_info", new JSONArray((Collection) arrayList).toString());
            AppLogNewUtils.onEventV3("conflict_alert_monitor", jSONObject5);
        }
    }
}
