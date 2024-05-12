package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.1Ql, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32791Ql implements C0Y3 {
    public Object LJLIL;

    @Override // X.C0Y3
    public final List LIZJ() {
        java.util.Map<String, ?> all;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SharedPreferences LIZJ = ((C36231bX) ((InterfaceC25210yr) this.LJLIL)).LIZJ();
        if (LIZJ == null) {
            all = Collections.emptyMap();
        } else {
            all = LIZJ.getAll();
        }
        for (String str : all.keySet()) {
            Object obj = all.get(str);
            if (obj instanceof String) {
                C38531fF LIZ = LIZ((String) obj);
                if (LIZ != null) {
                    if (LIZ.LJIIIZ > 0) {
                        arrayList.add(LIZ);
                    }
                } else {
                    arrayList2.add(str);
                }
            } else {
                arrayList2.add(str);
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                SharedPreferences.Editor LIZIZ = ((C36231bX) ((InterfaceC25210yr) this.LJLIL)).LIZIZ();
                if (LIZIZ != null) {
                    LIZIZ.remove(str2);
                }
            }
            ((C36231bX) ((InterfaceC25210yr) this.LJLIL)).LIZ();
        }
        return arrayList;
    }

    @Override // X.C0Y3
    public final List LJFF() {
        java.util.Map<String, ?> all;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SharedPreferences LIZJ = ((C36231bX) ((InterfaceC25210yr) this.LJLIL)).LIZJ();
        if (LIZJ == null) {
            all = Collections.emptyMap();
        } else {
            all = LIZJ.getAll();
        }
        for (String str : all.keySet()) {
            Object obj = all.get(str);
            if (obj instanceof String) {
                C38531fF LIZ = LIZ((String) obj);
                if (LIZ != null) {
                    arrayList.add(LIZ);
                } else {
                    arrayList2.add(str);
                }
            } else {
                arrayList2.add(str);
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                SharedPreferences.Editor LIZIZ = ((C36231bX) ((InterfaceC25210yr) this.LJLIL)).LIZIZ();
                if (LIZIZ != null) {
                    LIZIZ.remove(str2);
                }
            }
            ((C36231bX) ((InterfaceC25210yr) this.LJLIL)).LIZ();
        }
        return arrayList;
    }

    @Override // X.C0Y3
    public final void LJIIIZ() {
        C36231bX c36231bX = (C36231bX) ((InterfaceC25210yr) this.LJLIL);
        SharedPreferences.Editor LIZIZ = c36231bX.LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.clear();
        }
        c36231bX.LIZ();
    }

    @Override // X.C0Y3
    public final void release() {
        ((C36231bX) ((InterfaceC25210yr) this.LJLIL)).LIZ();
        this.LJLIL = null;
    }

    public C32791Ql(int i) {
        if (i != 1) {
            this.LJLIL = new C36231bX(C35191Zr.LIZIZ().LIZIZ, "ad_tracker_c2s_store_v2_adym3");
            C36231bX c36231bX = C35191Zr.LIZIZ().LJFF;
            if (c36231bX != null) {
                SharedPreferences LIZJ = c36231bX.LIZJ();
                if ((LIZJ != null ? LIZJ.getInt("sp_c2s_store_version", 0) : 0) < 2) {
                    SharedPreferences.Editor LIZIZ = c36231bX.LIZIZ();
                    if (LIZIZ != null) {
                        LIZIZ.putInt("sp_c2s_store_version", 2);
                    }
                    c36231bX.LIZ();
                    return;
                }
                return;
            }
            return;
        }
        this.LJLIL = new AtomicBoolean(false);
    }

    public static C38531fF LIZ(String str) {
        HashMap hashMap;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("uuid");
            String optString2 = jSONObject.optString("tracker_key");
            long optLong = jSONObject.optLong("ad_id");
            boolean optBoolean = jSONObject.optBoolean("is_standard");
            long optLong2 = jSONObject.optLong("non_std_ad_id");
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("urls");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(JSONArrayProtectorUtils.getString(optJSONArray, i));
                }
            }
            String optString3 = jSONObject.optString("log_extra");
            JSONObject optJSONObject = jSONObject.optJSONObject("ad_extra_data");
            try {
                long optLong3 = jSONObject.optLong("create_timestamp");
                String optString4 = jSONObject.optString("track_label");
                if (TextUtils.isEmpty(optString4) && jSONObject.has("track_type")) {
                    switch (jSONObject.optInt("track_type")) {
                        case 0:
                            optString4 = "show";
                            break;
                        case 1:
                            optString4 = "play";
                            break;
                        case 2:
                            optString4 = "click";
                            break;
                        case 3:
                        default:
                            optString4 = "";
                            break;
                        case 4:
                            optString4 = "play_valid";
                            break;
                        case 5:
                            optString4 = "play_over";
                            break;
                        case 6:
                            optString4 = "play_25";
                            break;
                        case 7:
                            optString4 = "play_50";
                            break;
                        case 8:
                            optString4 = "play_75";
                            break;
                        case 9:
                            optString4 = "cpv_6s";
                            break;
                        case 10:
                            optString4 = "cpv_15s";
                            break;
                    }
                }
                int optInt = jSONObject.optInt("tried_count", 0);
                boolean optBoolean2 = jSONObject.optBoolean("retry_when_network_available");
                long optLong4 = jSONObject.optLong("expire_seconds", -1L);
                JSONObject optJSONObject2 = jSONObject.optJSONObject("context_macro_map");
                if (optJSONObject2 != null) {
                    Iterator<String> keys = optJSONObject2.keys();
                    hashMap = null;
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String optString5 = optJSONObject2.optString(next);
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        hashMap.put(next, optString5);
                    }
                } else {
                    hashMap = null;
                }
                C38531fF c38531fF = new C38531fF(optString, optString2, optLong, arrayList, optString4, optBoolean, optLong2, optString3, optJSONObject, optInt, hashMap);
                c38531fF.LJIIIIZZ = optLong3;
                c38531fF.LJIIL = optBoolean2;
                c38531fF.LJIILIIL = optLong4;
                return c38531fF;
            } catch (Throwable unused) {
                return null;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    @Override // X.C0Y3
    public final boolean LJI(C38531fF c38531fF) {
        String str;
        if (c38531fF == null || TextUtils.isEmpty(c38531fF.LIZ)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uuid", c38531fF.LIZ).put("tracker_key", c38531fF.LIZIZ).put("ad_id", c38531fF.LIZJ).put("is_standard", c38531fF.LIZLLL).put("non_std_ad_id", c38531fF.LJ);
            JSONArray jSONArray = new JSONArray();
            List<String> list = c38531fF.LJFF;
            if (list != null) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
            }
            jSONObject.put("urls", jSONArray);
            jSONObject.put("log_extra", c38531fF.LJI).put("ad_extra_data", c38531fF.LJII).put("create_timestamp", c38531fF.LJIIIIZZ).put("track_label", c38531fF.LJIIJ).put("tried_count", c38531fF.LJIIIZ).put("retry_when_network_available", c38531fF.LJIIL).put("expire_seconds", c38531fF.LJIILIIL);
            java.util.Map<String, String> map = c38531fF.LJIIJJI;
            if (map != null && map.size() != 0) {
                jSONObject.putOpt("context_macro_map", new JSONObject(map));
            }
            str = jSONObject.toString();
        } catch (Throwable unused) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        InterfaceC25210yr interfaceC25210yr = (InterfaceC25210yr) this.LJLIL;
        String str2 = c38531fF.LIZ;
        C36231bX c36231bX = (C36231bX) interfaceC25210yr;
        SharedPreferences.Editor LIZIZ = c36231bX.LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.putString(str2, str);
        }
        c36231bX.LIZ();
        return true;
    }

    @Override // X.C0Y3
    public final void LJII(C38531fF c38531fF) {
        if (c38531fF == null || TextUtils.isEmpty(c38531fF.LIZ)) {
            return;
        }
        String str = c38531fF.LIZ;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C36231bX c36231bX = (C36231bX) ((InterfaceC25210yr) this.LJLIL);
        SharedPreferences.Editor LIZIZ = c36231bX.LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.remove(str);
        }
        c36231bX.LIZ();
    }

    @Override // X.C0Y3
    public final void LJIIIIZZ(C38531fF c38531fF) {
        LJI(c38531fF);
    }

    @Override // X.C0Y3
    public final List LJIIJ(List list) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C38531fF c38531fF = (C38531fF) it.next();
            if (!LJI(c38531fF)) {
                arrayList.add(c38531fF);
            }
        }
        return arrayList;
    }
}
