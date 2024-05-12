package X;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.AbsTypedOutput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.bytex.pthread.base.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ExE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38092ExE {
    public static volatile C38092ExE LJ;
    public volatile String LIZ;
    public volatile boolean LIZIZ;
    public final List<EYN> LIZJ = new CopyOnWriteArrayList();
    public final List<String> LIZLLL = new CopyOnWriteArrayList();

    public static C38092ExE LIZLLL() {
        if (LJ == null) {
            synchronized (C38092ExE.class) {
                if (LJ == null) {
                    LJ = new C38092ExE();
                }
            }
        }
        return LJ;
    }

    public final Request LIZJ(Request request) {
        String str;
        List list;
        List list2;
        if (!this.LIZIZ) {
            Logger.debug();
            return null;
        }
        List<EJ6> headers = request.headers("x-metasec-bypass-ttnet-features");
        if (headers != null && headers.size() > 0 && "1".equals(((EJ6) ListProtector.get(headers, 0)).LIZIZ)) {
            return null;
        }
        String url = request.getUrl();
        if (TextUtils.isEmpty(url)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> LIZLLL = EZX.LIZLLL(url, linkedHashMap);
            if (linkedHashMap.isEmpty() || !LIZIZ(request, linkedHashMap)) {
                return null;
            }
            if (request.isQueryEncryptEnabled() && linkedHashMap.containsKey("x-tt-encrypt-queries") && (list2 = (List) linkedHashMap.get("x-tt-encrypt-queries")) != null && list2.size() > 0) {
                str = (String) ListProtector.get(list2, 0);
                linkedHashMap.remove("x-tt-encrypt-queries");
            } else {
                str = null;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append((String) LIZLLL.first);
            LIZ.append((String) LIZLLL.second);
            EZQ ezq = new EZQ(X1D.LIZIZ(LIZ));
            if (!linkedHashMap.isEmpty()) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (entry != null && entry.getKey() != null && (list = (List) entry.getValue()) != null && !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ezq.LIZJ((String) entry.getKey(), (String) it.next());
                        }
                    }
                }
            }
            C64908Pdg newBuilder = request.newBuilder();
            LJIIIZ(newBuilder, request, str);
            newBuilder.LIZJ(ezq.LIZLLL());
            return newBuilder.LIZ();
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void LJ(String str) {
        Logger.debug();
        if (!this.LIZIZ || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            LJII(str);
        } catch (Throwable unused) {
        }
    }

    public final synchronized void LJII(String str) {
        if (!TextUtils.isEmpty(this.LIZ) && this.LIZ.equals(str)) {
            Logger.debug();
            return;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str);
        for (int i = 0; i < jSONArray.length(); i++) {
            LJFF(arrayList, JSONArrayProtectorUtils.getJSONObject(jSONArray, i));
        }
        Collections.sort(arrayList, new C38095ExH());
        ((CopyOnWriteArrayList) this.LIZJ).clear();
        ((CopyOnWriteArrayList) this.LIZJ).addAll(arrayList);
        this.LIZ = str;
    }

    public final void LJIIIIZZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ((CopyOnWriteArrayList) this.LIZLLL).clear();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                ((CopyOnWriteArrayList) this.LIZLLL).add(JSONArrayProtectorUtils.getString(jSONArray, i));
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LIZ(List<EJ6> list, EnumC38093ExF enumC38093ExF) {
        int i = C38094ExG.LIZ[enumC38093ExF.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                ArrayList arrayList = (ArrayList) list;
                arrayList.add(new EJ6("x-tt-cipher-version", BuildConfig.VERSION_NAME));
                arrayList.add(new EJ6("x-tt-encrypt-info", CardStruct.IStatusCode.DEFAULT));
                return;
            }
            ArrayList arrayList2 = (ArrayList) list;
            arrayList2.add(new EJ6("x-tt-cipher-version", BuildConfig.VERSION_NAME));
            arrayList2.add(new EJ6("x-tt-encrypt-info", "1"));
            return;
        }
        ArrayList arrayList3 = (ArrayList) list;
        arrayList3.add(new EJ6("x-tt-cipher-version", BuildConfig.VERSION_NAME));
        arrayList3.add(new EJ6("x-tt-encrypt-info", "2"));
    }

    public static void LJFF(ArrayList arrayList, JSONObject jSONObject) {
        EYN eyp;
        String string = JSONObjectProtectorUtils.getString(jSONObject, "action");
        int i = JSONObjectProtectorUtils.getInt(jSONObject, "act_priority");
        if (i < 0) {
            return;
        }
        JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "param");
        int optInt = jSONObject.optInt("set_req_priority", i);
        if (optInt == -1) {
            optInt = Integer.MAX_VALUE;
        }
        if (string.equals("rm")) {
            eyp = new C36362EOw(i);
        } else if (!string.equals("encrypt")) {
            return;
        } else {
            eyp = new EYP(i);
        }
        eyp.LIZLLL(jSONObject2);
        eyp.LIZIZ = optInt;
        arrayList.add(eyp);
    }

    public static void LJI(List list, JSONArray jSONArray) {
        if (jSONArray == null || list == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                String string = JSONArrayProtectorUtils.getString(jSONArray, i);
                if (!TextUtils.isEmpty(string)) {
                    list.add(string);
                }
            } catch (JSONException unused) {
                return;
            }
        }
    }

    public final boolean LIZIZ(Request request, java.util.Map<String, List<String>> map) {
        JSONObject jSONObject;
        long j;
        long j2;
        boolean LIZ;
        ArrayList arrayList = new ArrayList();
        request.setQueryFilterPriority(0);
        Iterator it = ((CopyOnWriteArrayList) this.LIZJ).iterator();
        boolean z = false;
        while (it.hasNext()) {
            EYN eyn = (EYN) it.next();
            eyn.getClass();
            C38096ExI c38096ExI = new C38096ExI();
            c38096ExI.LIZJ = SystemClock.uptimeMillis();
            if (request.getQueryFilterPriority() > eyn.LIZ) {
                LIZ = false;
            } else {
                LIZ = eyn.LIZ(request, map);
                if (LIZ) {
                    request.setQueryFilterPriority(eyn.LIZIZ);
                }
            }
            c38096ExI.LIZ = LIZ;
            c38096ExI.LIZIZ = eyn.LIZ;
            c38096ExI.LIZLLL = SystemClock.uptimeMillis();
            arrayList.add(c38096ExI);
            if (LIZ) {
                z = true;
            }
        }
        Logger.debug();
        if (request.getMetrics() != null) {
            C64738Paw metrics = request.getMetrics();
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C38096ExI c38096ExI2 = (C38096ExI) it2.next();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("hit", c38096ExI2.LIZ);
                    jSONObject.put("priority", c38096ExI2.LIZIZ);
                    j = c38096ExI2.LIZJ;
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                if (j >= 0) {
                    long j3 = c38096ExI2.LIZLLL;
                    if (j3 >= 0 && j <= j3) {
                        j2 = j3 - j;
                        jSONObject.put("consume", j2);
                        jSONArray.put(jSONObject);
                    }
                }
                j2 = -1;
                jSONObject.put("consume", j2);
                jSONArray.put(jSONObject);
            }
            Logger.debug();
            metrics.LJJJJ = jSONArray;
        }
        return z;
    }

    public static void LJIIIZ(C64908Pdg c64908Pdg, Request request, String str) {
        boolean z;
        if (request.getBody() instanceof AbsTypedOutput) {
            z = ((AbsTypedOutput) request.getBody()).isBodyEncrypted();
        } else {
            z = false;
        }
        if (!request.isQueryEncryptEnabled() && !request.isBodyEncryptEnabled() && !z) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            C77800Ug8.LJFF("x-tt-encrypt-queries", str, arrayList);
        }
        if (request.getHeaders() != null) {
            arrayList.addAll(request.getHeaders());
        }
        C64738Paw metrics = request.getMetrics();
        if (!z && request.isBodyEncryptEnabled()) {
            TypedOutput body = request.getBody();
            if (body instanceof AbsTypedOutput) {
                long currentTimeMillis = System.currentTimeMillis();
                z = ((AbsTypedOutput) body).interceptRequestBody();
                if (metrics != null) {
                    metrics.LJJJ = System.currentTimeMillis() - currentTimeMillis;
                }
            }
        }
        EnumC38093ExF enumC38093ExF = EnumC38093ExF.ENCRYPT_NONE;
        if (z) {
            if (request.isQueryEncryptEnabled()) {
                enumC38093ExF = EnumC38093ExF.ENCRYPT_BOTH_QUERY_AND_BODY;
                LIZ(arrayList, enumC38093ExF);
            } else {
                enumC38093ExF = EnumC38093ExF.ENCRYPT_BODY;
                LIZ(arrayList, enumC38093ExF);
            }
        } else if (request.isQueryEncryptEnabled()) {
            enumC38093ExF = EnumC38093ExF.ENCRYPT_QUERY;
            LIZ(arrayList, enumC38093ExF);
        }
        if (metrics != null) {
            metrics.LIZ = enumC38093ExF;
        }
        c64908Pdg.LIZJ = arrayList;
    }
}
