package X;

import android.text.TextUtils;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OTL {
    public static String LIZ(OT6 ot6) {
        StringBuilder sb = new StringBuilder();
        sb.append(ot6.LJII);
        if (!TextUtils.isEmpty(ot6.LJIIIIZZ)) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) != ',') {
                sb.append(",");
            }
            sb.append(ot6.LJIIIIZZ);
        }
        if (!TextUtils.isEmpty(ot6.LJIIIZ)) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) != ',') {
                sb.append(",");
            }
            sb.append(ot6.LJIIIZ);
        }
        return sb.toString();
    }

    public static C61952OTc LIZIZ(String str) {
        if (str == null) {
            return null;
        }
        C61952OTc c61952OTc = new C61952OTc();
        try {
            LIZJ(c61952OTc, str);
            if (c61952OTc.LIZ) {
                JSONObject jSONObject = c61952OTc.LIZLLL;
                if (jSONObject != null) {
                    c61952OTc.LJ = jSONObject.optString("client_name");
                    c61952OTc.LIZLLL.optString("client_icon");
                    JSONArray optJSONArray = c61952OTc.LIZLLL.optJSONArray("scopes");
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            c61952OTc.LJFF.add(optJSONArray.optString(i));
                        }
                    }
                    c61952OTc.LIZLLL.optJSONObject("scope_dict");
                    JSONObject optJSONObject = c61952OTc.LIZLLL.optJSONObject("alert_scope");
                    if (optJSONObject != null) {
                        new C169096kL();
                        optJSONObject.optString("scope_name");
                        optJSONObject.optString("title");
                        optJSONObject.optString("content");
                        optJSONObject.optString("negative_button");
                        optJSONObject.optString("positive_button");
                    }
                    JSONObject optJSONObject2 = c61952OTc.LIZLLL.optJSONObject("customized_scopes");
                    if (optJSONObject2 != null) {
                        c61952OTc.LJI = LIZLLL(optJSONObject2);
                    }
                    c61952OTc.LIZLLL.optJSONObject("scope_description");
                    JSONObject optJSONObject3 = c61952OTc.LIZLLL.optJSONObject("normal_scopes");
                    if (optJSONObject3 != null) {
                        new EP0(optJSONObject3);
                    }
                    JSONObject optJSONObject4 = c61952OTc.LIZLLL.optJSONObject("sensitive_scopes");
                    if (optJSONObject4 != null) {
                        new EP0(optJSONObject4);
                    }
                    c61952OTc.LIZLLL.optBoolean("flipchat_conceal");
                    c61952OTc.LIZLLL.optBoolean("has_mobile");
                    c61952OTc.LIZLLL.optBoolean("login");
                    c61952OTc.LIZLLL.optBoolean("need_bind_mobile");
                    c61952OTc.LIZLLL.optBoolean("qq_conceal");
                    c61952OTc.LIZLLL.optBoolean("toutiao_conceal");
                    c61952OTc.LIZLLL.optBoolean("weibo_conceal");
                    c61952OTc.LIZLLL.optBoolean("wx_conceal");
                    c61952OTc.LIZLLL.optBoolean("contains_invalid_scope");
                    c61952OTc.LIZLLL.optString("tips");
                    c61952OTc.LJII = c61952OTc.LIZLLL.optBoolean("can_skip_confirm");
                } else {
                    c61952OTc.LIZIZ = -1;
                }
                return c61952OTc;
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return c61952OTc;
    }

    public static java.util.Map<String, java.util.Map<String, Integer[][]>> LIZLLL(JSONObject jSONObject) {
        HashMap hashMap;
        HashMap hashMap2 = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONArray optJSONArray = jSONObject.optJSONArray(next);
            if (optJSONArray == null || optJSONArray.length() == 0) {
                hashMap = null;
            } else {
                hashMap = new HashMap();
                String str = null;
                Integer[][] numArr = null;
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        str = optJSONObject.optString("style");
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("range");
                        if (optJSONArray2 == null || optJSONArray2.length() == 0) {
                            numArr = null;
                        } else {
                            numArr = (Integer[][]) Array.newInstance((Class<?>) Integer.class, optJSONArray2.length(), 2);
                            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                                JSONArray optJSONArray3 = optJSONArray2.optJSONArray(i2);
                                if (optJSONArray3 != null && optJSONArray3.length() == 2) {
                                    numArr[i2][0] = Integer.valueOf(optJSONArray3.optInt(0));
                                    numArr[i2][1] = Integer.valueOf(optJSONArray3.optInt(1));
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str) && numArr != null) {
                        hashMap.put(str, numArr);
                    }
                }
            }
            if (!TextUtils.isEmpty(next) && hashMap != null) {
                hashMap2.put(next, hashMap);
            }
        }
        return hashMap2;
    }

    public static void LIZJ(C61953OTd c61953OTd, String str) {
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            if ("success".equals(jSONObject.optString("message"))) {
                c61953OTd.LIZ = true;
                c61953OTd.LIZLLL = jSONObject.optJSONObject("data");
                return;
            }
            c61953OTd.LIZ = false;
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                return;
            }
            c61953OTd.LIZIZ = optJSONObject.optInt("error_code");
            c61953OTd.LIZJ = optJSONObject.optString("description");
            return;
        }
        throw new IllegalArgumentException("argument is null");
    }
}
