package X;

import android.text.TextUtils;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IPitayaOfflineService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ex5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38083Ex5 {
    public static final long LIZ = System.currentTimeMillis();

    public static List<String> LIZ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("openConfig");
        arrayList.add("config");
        arrayList.add("appInfo");
        arrayList.add("close");
        arrayList.add("gallery");
        C19U.LIZLLL(arrayList, "toggleGalleryBars", "slideShow", "relatedShow", "toast");
        C19U.LIZLLL(arrayList, "slideDownload", "requestChangeOrientation", "adInfo", "sendLog");
        C19U.LIZLLL(arrayList, "openSchoolEdit", "formDialogClose", "openSchoolEdit", "orderResult");
        arrayList.add("sendAnalyticsEvent");
        arrayList.add("showAutofillPopup");
        arrayList.add("x.reportAppLog");
        arrayList.add("x.hideLoading");
        IPitayaOfflineService iPitayaOfflineService = (IPitayaOfflineService) ServiceManager.get().getService(IPitayaOfflineService.class);
        if (iPitayaOfflineService != null) {
            iPitayaOfflineService.LIZJ();
        }
        return arrayList;
    }

    public static List<String> LIZIZ(List<String> list, boolean z) {
        HashSet hashSet;
        long currentTimeMillis;
        String LIZIZ;
        HashSet hashSet2 = new HashSet();
        List<String> jsbSafeHost = C37090Eh4.LIZ.LIZ.getJsbSafeHost();
        if (jsbSafeHost != null) {
            hashSet2.addAll(jsbSafeHost);
        }
        boolean LJ = C19N.LJ("jsb_ignore_gecko_safe_host", true);
        if (!z || !LJ) {
            long currentTimeMillis2 = System.currentTimeMillis();
            String[] strArr = new String[1];
            boolean LJ2 = C19N.LJ("use_bridge_engine_v2", true);
            do {
                C38032EwG c38032EwG = new C38032EwG();
                String LIZ2 = C38943FQd.LIZ();
                List<TimeLineEvent> list2 = null;
                if (list == null || list.isEmpty()) {
                    hashSet = null;
                } else {
                    hashSet = new HashSet();
                    C38060Ewi c38060Ewi = C38113ExZ.LJI;
                    if (c38060Ewi.LIZ() != null) {
                        Iterator<String> it = list.iterator();
                        while (it.hasNext()) {
                            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c38060Ewi.LIZ().LIZJ(it.next(), list2).LIZ;
                            if (!concurrentHashMap.isEmpty()) {
                                for (Map.Entry entry : concurrentHashMap.entrySet()) {
                                    Iterator it2 = ((List) entry.getValue()).iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        if (((C38075Ewx) it2.next()).LIZIZ != EnumC38078Ex0.PUBLIC) {
                                            hashSet.add(entry.getKey());
                                            list2 = null;
                                            break;
                                        }
                                        list2 = null;
                                    }
                                }
                            }
                        }
                    }
                    if (hashSet.isEmpty() && !TextUtils.isEmpty(LIZ2)) {
                        try {
                            String LIZJ = c38032EwG.LIZJ();
                            if (LIZJ != null && !LIZJ.isEmpty()) {
                                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(new JSONObject(LIZJ), "data"), "packages"), LIZ2);
                                for (String str : list) {
                                    for (int i = 0; i < jSONArray.length(); i++) {
                                        JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                                        String string = JSONObjectProtectorUtils.getString(jSONObject, "channel");
                                        if ("host".equals(str)) {
                                            LIZIZ = "_jsb_auth";
                                        } else {
                                            StringBuilder LIZ3 = X1D.LIZ();
                                            LIZ3.append("_jsb_auth.");
                                            LIZ3.append(str);
                                            LIZIZ = X1D.LIZIZ(LIZ3);
                                        }
                                        if (string.equals(LIZIZ)) {
                                            Iterator<String> keys = JSONObjectProtectorUtils.getJSONObject(jSONObject, "content").keys();
                                            while (keys.hasNext()) {
                                                hashSet.add(keys.next());
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (JSONException unused) {
                        }
                    }
                }
                currentTimeMillis = System.currentTimeMillis() - currentTimeMillis2;
                if (!hashSet.isEmpty() || !LJ2 || System.currentTimeMillis() - LIZ > 3000) {
                    break;
                }
            } while (currentTimeMillis < 2000);
            if (hashSet.isEmpty() && LJ2) {
                try {
                    int size = hashSet.size();
                    String abstractCollection = hashSet.toString();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("size", size);
                    jSONObject2.put("content", abstractCollection);
                    if (!TextUtils.isEmpty(strArr[0])) {
                        jSONObject2.put("response", strArr);
                    }
                    C09900aA.LJ("jsb_config_log", jSONObject2);
                } catch (Exception unused2) {
                }
            } else {
                hashSet2.addAll(hashSet);
            }
        }
        return new ArrayList(hashSet2);
    }
}
