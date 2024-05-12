package X;

import com.bytedance.pitaya.api.bean.PTYClass;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.bytedance.pitaya.inner.api.bean.TaskData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.aOu, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93316aOu {
    public static TaskData LIZ(PTYTaskData pTYTaskData) {
        String str;
        if (pTYTaskData == null) {
            return null;
        }
        try {
            List LJFF = LJFF(pTYTaskData.getParams());
            JSONObject params = pTYTaskData.getParams();
            if (params != null) {
                str = params.toString();
            } else {
                str = null;
            }
            TaskData taskData = new TaskData(str, LJFF);
            pTYTaskData.getDataFetcher();
            taskData.setDataFetcher(null);
            return taskData;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0066 A[Catch: Exception -> 0x000d, TRY_LEAVE, TryCatch #0 {Exception -> 0x000d, blocks: (B:9:0x0014, B:11:0x001b, B:14:0x002b, B:15:0x0034, B:17:0x003a, B:20:0x0058, B:26:0x0066), top: B:8:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.pitaya.api.bean.PTYTaskData LIZIZ(com.bytedance.pitaya.inner.api.bean.TaskData r6) {
        /*
            r5 = 0
            if (r6 == 0) goto L13
            java.lang.String r0 = r6.getStrParams$pitaya_i18nTocRelease()
            java.util.List r2 = r6.getPyBufferList$pitaya_i18nTocRelease()
            if (r0 != 0) goto L14
        Ld:
            com.bytedance.pitaya.api.bean.PTYTaskData r0 = new com.bytedance.pitaya.api.bean.PTYTaskData
            r0.<init>(r5)
            r5 = r0
        L13:
            return r5
        L14:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> Ld
            r6.<init>(r0)     // Catch: java.lang.Exception -> Ld
            if (r2 == 0) goto L55
            r0 = 10
            int r0 = X.C32I.LJJL(r2, r0)     // Catch: java.lang.Exception -> Ld
            int r1 = X.C51029K0z.LJJIIZ(r0)     // Catch: java.lang.Exception -> Ld
            r0 = 16
            if (r1 >= r0) goto L2b
            r1 = 16
        L2b:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> Ld
            r4.<init>(r1)     // Catch: java.lang.Exception -> Ld
            java.util.Iterator r3 = r2.iterator()     // Catch: java.lang.Exception -> Ld
        L34:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Exception -> Ld
            if (r0 == 0) goto L56
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Exception -> Ld
            com.bytedance.pitaya.api.bean.PTYClass r1 = (com.bytedance.pitaya.api.bean.PTYClass) r1     // Catch: java.lang.Exception -> Ld
            X.OSZ r2 = new X.OSZ     // Catch: java.lang.Exception -> Ld
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> Ld
            r2.<init>(r0, r1)     // Catch: java.lang.Exception -> Ld
            java.lang.Object r1 = r2.getFirst()     // Catch: java.lang.Exception -> Ld
            java.lang.Object r0 = r2.getSecond()     // Catch: java.lang.Exception -> Ld
            r4.put(r1, r0)     // Catch: java.lang.Exception -> Ld
            goto L34
        L55:
            r4 = r5
        L56:
            if (r4 == 0) goto L61
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Exception -> Ld
            if (r0 == 0) goto L5f
            goto L61
        L5f:
            r0 = 0
            goto L62
        L61:
            r0 = 1
        L62:
            if (r0 == 0) goto L66
        L64:
            r5 = r6
            goto Ld
        L66:
            LIZLLL(r4, r6)     // Catch: java.lang.Exception -> Ld
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93316aOu.LIZIZ(com.bytedance.pitaya.inner.api.bean.TaskData):com.bytedance.pitaya.api.bean.PTYTaskData");
    }

    public static List LJ(JSONArray jSONArray) {
        List LJ;
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof PTYClass) {
                arrayList.add(obj);
            } else if (obj instanceof JSONObject) {
                List LJFF = LJFF((JSONObject) obj);
                if (LJFF != null) {
                    arrayList.addAll(LJFF);
                }
            } else if ((obj instanceof JSONArray) && (LJ = LJ((JSONArray) obj)) != null) {
                arrayList.addAll(LJ);
            }
        }
        return arrayList;
    }

    public static List LJFF(JSONObject jSONObject) {
        List LJ;
        if (jSONObject == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        o.LJFF(keys, "json.keys()");
        while (keys.hasNext()) {
            Object obj = jSONObject.get(keys.next());
            if (obj instanceof PTYClass) {
                arrayList.add(obj);
            } else if (obj instanceof JSONObject) {
                List LJFF = LJFF((JSONObject) obj);
                if (LJFF != null) {
                    arrayList.addAll(LJFF);
                }
            } else if ((obj instanceof JSONArray) && (LJ = LJ((JSONArray) obj)) != null) {
                arrayList.addAll(LJ);
            }
        }
        return arrayList;
    }

    public static void LIZJ(java.util.Map map, JSONArray jSONArray) {
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof String) {
                if (map.containsKey(obj)) {
                    jSONArray.put(i, map.get(obj));
                }
            } else if (obj instanceof JSONObject) {
                LIZLLL(map, (JSONObject) obj);
                jSONArray.put(i, obj);
            } else if (obj instanceof JSONArray) {
                LIZJ(map, (JSONArray) obj);
                jSONArray.put(i, obj);
            }
        }
    }

    public static void LIZLLL(java.util.Map map, JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        o.LJFF(keys, "json.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof String) {
                if (map.containsKey(obj)) {
                    jSONObject.put(next, map.get(obj));
                }
            } else if (obj instanceof JSONObject) {
                LIZLLL(map, (JSONObject) obj);
                jSONObject.put(next, obj);
            } else if (obj instanceof JSONArray) {
                LIZJ(map, (JSONArray) obj);
                jSONObject.put(next, obj);
            }
        }
    }
}
