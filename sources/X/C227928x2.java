package X;

import android.text.TextUtils;
import com.ss.android.tracker.event.utils.ParamDiffValue;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8x2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C227928x2 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, java.util.Map map, AbstractC63695OzD abstractC63695OzD) {
        String str2;
        HashMap hashMap = (HashMap) map;
        if (!hashMap.isEmpty()) {
            java.util.Map<String, String> LIZJ = abstractC63695OzD.LIZJ();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : LIZJ.entrySet()) {
                if (entry.getKey().length() != 0) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            java.util.Set keySet = hashMap.keySet();
            java.util.Set keySet2 = linkedHashMap.keySet();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(keySet);
            linkedHashSet.retainAll(keySet2);
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            linkedHashSet2.addAll(keySet);
            linkedHashSet2.addAll(keySet2);
            java.util.Set<String> LLJILLL = ORZ.LLJILLL(linkedHashSet2);
            LLJILLL.removeAll(keySet2);
            linkedHashSet2.removeAll(keySet);
            C227938x3 c227938x3 = new C227938x3(LLJILLL, linkedHashSet2, linkedHashSet);
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            LinkedHashSet linkedHashSet4 = new LinkedHashSet();
            LinkedHashSet linkedHashSet5 = new LinkedHashSet();
            if (!LLJILLL.isEmpty()) {
                for (String str3 : LLJILLL) {
                    String str4 = (String) hashMap.get(str3);
                    if (str4 != null) {
                        abstractC63695OzD.LIZLLL(hashMap.get(str3), str3);
                        linkedHashSet5.add(new ParamDiffValue(str3, null, str4));
                    }
                }
            }
            if (!c227938x3.LIZJ.isEmpty()) {
                for (String str5 : c227938x3.LIZJ) {
                    if (!o.LJ(hashMap.get(str5), linkedHashMap.get(str5)) && (str2 = (String) hashMap.get(str5)) != null) {
                        abstractC63695OzD.LIZLLL(hashMap.get(str5), str5);
                        String str6 = (String) linkedHashMap.get(str5);
                        if (str6 != null) {
                            linkedHashSet4.add(new ParamDiffValue(str5, str6, str2));
                        }
                    }
                }
            }
            if (!c227938x3.LIZIZ.isEmpty()) {
                for (String str7 : c227938x3.LIZIZ) {
                    String str8 = (String) linkedHashMap.get(str7);
                    if (str8 != null) {
                        linkedHashSet3.add(new ParamDiffValue(str7, str8, null));
                    }
                }
            }
            if ((!linkedHashSet3.isEmpty()) || (!linkedHashSet4.isEmpty()) || (!linkedHashSet5.isEmpty())) {
                C188727au c188727au = new C188727au();
                JSONObject jSONObject = new JSONObject();
                for (String str9 : hashMap.keySet()) {
                    try {
                        String str10 = (String) hashMap.get(str9);
                        if (TextUtils.equals("log_pb", str9)) {
                            if (str10 != null) {
                                jSONObject.put(str9, new JSONObject(str10));
                            }
                        } else {
                            jSONObject.put(str9, str10);
                        }
                    } catch (JSONException e) {
                        C36922EeM.LJFF(e);
                    }
                }
                c188727au.LJIIIZ("old_param", jSONObject.toString());
                c188727au.LJIIIZ("diff_event_name", str);
                if (!linkedHashSet3.isEmpty()) {
                    c188727au.LJFF(linkedHashSet3, "additional");
                }
                if (!linkedHashSet4.isEmpty()) {
                    c188727au.LJFF(linkedHashSet4, "diff");
                }
                if (!linkedHashSet5.isEmpty()) {
                    c188727au.LJFF(linkedHashSet5, "less");
                }
                FMX.LJIIL("feed_event_optimize", c188727au.LIZ);
            }
        }
    }
}
