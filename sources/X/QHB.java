package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QHB {
    public static final List<String> LIZ = Collections.singletonList("EventPriorityLoader");

    public static void LIZ(QI3 qi3, QH9 qh9, QHA qha, JSONArray jSONArray) {
        JSONArray optJSONArray;
        Object opt;
        JSONArray optJSONArray2;
        qha.LIZJ = new HashMap();
        qha.LJ = new HashMap();
        if (jSONArray != null && jSONArray.length() > 0) {
            qha.LJFF = jSONArray;
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        QHC qhc = new QHC();
                        int optInt = optJSONObject.optInt("priority");
                        qhc.LIZ = optInt;
                        if (optInt > qha.LIZLLL) {
                            qha.LIZLLL = optInt;
                        }
                        qhc.LIZJ = qha.LIZ;
                        int optInt2 = optJSONObject.optInt("interval_multiple");
                        qhc.LIZLLL = optInt2;
                        if (optInt2 <= 0) {
                            qhc.LIZLLL = 1;
                        }
                        long j = qha.LIZIZ * qhc.LIZLLL * 1000;
                        qhc.LJ = j;
                        qhc.LJIIJJI = new QHN(qi3, qh9, j);
                        qhc.LJII = optJSONObject.optString("report_host");
                        qhc.LJIIIIZZ = optJSONObject.optString("report_path");
                        qhc.LJIIL = optJSONObject.optInt("forward_open");
                        qhc.LJIILIIL = optJSONObject.optString("forward_report_host");
                        qhc.LJIILJJIL = optJSONObject.optString("forward_report_path");
                        JSONArray optJSONArray3 = optJSONObject.optJSONArray("events");
                        if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                            for (int i2 = 0; i2 < optJSONArray3.length(); i2++) {
                                String optString = optJSONArray3.optString(i2);
                                if (!TextUtils.isEmpty(optString)) {
                                    ((HashMap) qha.LJ).put(optString, Integer.valueOf(qhc.LIZ));
                                }
                            }
                        }
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("param_keys");
                        if (optJSONObject2 != null) {
                            qhc.LJFF = new HashMap();
                            Iterator<String> keys = optJSONObject2.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                if (!TextUtils.isEmpty(next) && (optJSONArray2 = optJSONObject2.optJSONArray(next)) != null && optJSONArray2.length() > 0) {
                                    ArrayList arrayList = new ArrayList();
                                    for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                                        JSONArray optJSONArray4 = optJSONArray2.optJSONArray(i3);
                                        if (optJSONArray4 != null && optJSONArray4.length() > 0) {
                                            HashSet hashSet = new HashSet();
                                            for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                                                String optString2 = optJSONArray4.optString(i4);
                                                if (!TextUtils.isEmpty(optString2)) {
                                                    hashSet.add(optString2);
                                                }
                                            }
                                            arrayList.add(hashSet);
                                        }
                                    }
                                    ((HashMap) qhc.LJFF).put(next, arrayList);
                                }
                            }
                        }
                        JSONObject optJSONObject3 = optJSONObject.optJSONObject("param_key_values");
                        if (optJSONObject3 != null) {
                            qhc.LJI = new HashMap();
                            Iterator<String> keys2 = optJSONObject3.keys();
                            while (keys2.hasNext()) {
                                String next2 = keys2.next();
                                if (!TextUtils.isEmpty(next2) && (optJSONArray = optJSONObject3.optJSONArray(next2)) != null && optJSONArray.length() > 0) {
                                    ArrayList arrayList2 = new ArrayList();
                                    for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
                                        JSONObject optJSONObject4 = optJSONArray.optJSONObject(i5);
                                        if (optJSONObject4 != null) {
                                            HashMap hashMap = new HashMap();
                                            Iterator<String> keys3 = optJSONObject4.keys();
                                            while (keys3.hasNext()) {
                                                String next3 = keys3.next();
                                                if (!TextUtils.isEmpty(next3) && (opt = optJSONObject4.opt(next3)) != null) {
                                                    hashMap.put(next3, opt);
                                                }
                                            }
                                            arrayList2.add(hashMap);
                                        }
                                    }
                                    ((HashMap) qhc.LJI).put(next2, arrayList2);
                                }
                            }
                        }
                        ((HashMap) qha.LIZJ).put(Integer.valueOf(qhc.LIZ), qhc);
                    }
                } catch (Throwable th) {
                    qi3.LJJIZ.LJIILL(LIZ, "parsePriorityMapFromJsonArray failed", th, new Object[0]);
                    return;
                }
            }
            Iterator it = ((HashMap) qha.LIZJ).values().iterator();
            while (it.hasNext()) {
                ((QHC) it.next()).LIZIZ = qha.LIZLLL;
            }
        }
    }
}
