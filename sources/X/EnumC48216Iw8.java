package X;

import android.text.TextUtils;
import android.util.Pair;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Iw8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC48216Iw8 {
    public static final EnumC48216Iw8 INS;
    public static final /* synthetic */ EnumC48216Iw8[] LJLJI;
    public final java.util.Map<C79985VaH, LinkedList<C48217Iw9>> LJLIL = new HashMap();
    public int LJLILLLLZI = 100;

    static {
        EnumC48216Iw8 enumC48216Iw8 = new EnumC48216Iw8();
        INS = enumC48216Iw8;
        LJLJI = new EnumC48216Iw8[]{enumC48216Iw8};
    }

    public static EnumC48216Iw8[] values() {
        return (EnumC48216Iw8[]) LJLJI.clone();
    }

    public static EnumC48216Iw8 valueOf(String str) {
        return (EnumC48216Iw8) V0N.LJJJ(EnumC48216Iw8.class, str);
    }

    public JSONObject getTracesJson(C79985VaH c79985VaH) {
        Pair pair;
        JSONObject jSONObject = new JSONObject();
        if (c79985VaH != null) {
            if (c79985VaH.LIZLLL != null) {
                pair = new Pair("video_model", c79985VaH.LIZ);
            } else if (!TextUtils.isEmpty(null)) {
                pair = new Pair("local_url", null);
            } else if (!TextUtils.isEmpty(c79985VaH.LJ)) {
                pair = new Pair("video_url", c79985VaH.LJ);
            } else {
                pair = new Pair("vid", c79985VaH.LIZ);
            }
        } else {
            pair = null;
        }
        if (pair != null) {
            try {
                jSONObject.put((String) pair.first, pair.second);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        List<C48217Iw9> removeTraceList = removeTraceList(c79985VaH);
        if (removeTraceList == null || removeTraceList.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (C48217Iw9 c48217Iw9 : removeTraceList) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("pathId", c48217Iw9.LIZ);
                jSONObject2.put("id", c48217Iw9.LIZIZ);
                jSONObject2.put("timestamp", c48217Iw9.LIZJ);
                jSONObject2.put("level", c48217Iw9.LIZLLL);
                jSONObject2.put("errCode", 0);
                java.util.Map<String, String> map = c48217Iw9.LJ;
                if (map != null) {
                    HashMap hashMap = (HashMap) map;
                    if (!hashMap.isEmpty()) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (Map.Entry entry : hashMap.entrySet()) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put((String) entry.getKey(), entry.getValue());
                            jSONArray2.put(jSONObject3);
                        }
                        jSONObject2.put("data", jSONArray2);
                    }
                }
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("traces", jSONArray);
            return jSONObject;
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
            return jSONObject;
        }
    }

    public List<C48217Iw9> removeTraceList(C79985VaH c79985VaH) {
        List<C48217Iw9> list = (List) ((HashMap) this.LJLIL).remove(c79985VaH);
        if (list != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("removeTraceList title:");
            c79985VaH.getClass();
            LIZ.append((String) null);
            LIZ.append(" map.size:");
            LIZ.append(((HashMap) this.LJLIL).size());
            X1D.LIZIZ(LIZ);
        }
        return list;
    }

    public void setMaxTraceCount(int i) {
        this.LJLILLLLZI = i;
    }

    public void addTrace(C79985VaH c79985VaH, C48217Iw9 c48217Iw9) {
        if (c79985VaH == null || c48217Iw9 == null) {
            return;
        }
        LinkedList linkedList = (LinkedList) ((HashMap) this.LJLIL).get(c79985VaH);
        if (linkedList == null) {
            LinkedList linkedList2 = new LinkedList();
            ((HashMap) this.LJLIL).put(c79985VaH, linkedList2);
            linkedList2.add(c48217Iw9);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("addTrace title:");
            LIZ.append((String) null);
            LIZ.append(" trace:");
            LIZ.append(c48217Iw9.LIZIZ);
            LIZ.append(" map.size:");
            LIZ.append(((HashMap) this.LJLIL).size());
            X1D.LIZIZ(LIZ);
            return;
        }
        if (this.LJLILLLLZI < linkedList.size()) {
            linkedList.removeFirst();
            linkedList.add(c48217Iw9);
        } else {
            linkedList.add(c48217Iw9);
        }
    }
}
