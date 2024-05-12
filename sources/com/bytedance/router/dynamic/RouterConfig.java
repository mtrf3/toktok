package com.bytedance.router.dynamic;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.router.util.Logger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class RouterConfig {
    public Map<String, String> mIncMapping = Collections.emptyMap();
    public Map<String, String> mRewriteMapping = Collections.emptyMap();
    public String mTag;

    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tag", this.mTag);
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<String, String> entry : this.mIncMapping.entrySet()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(entry.getKey());
                LIZ.append(",");
                LIZ.append(entry.getValue());
                jSONArray.put(X1D.LIZIZ(LIZ));
            }
            jSONObject.put("incMapping", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (Map.Entry<String, String> entry2 : this.mRewriteMapping.entrySet()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(entry2.getKey());
                LIZ2.append(",");
                LIZ2.append(entry2.getValue());
                jSONArray2.put(X1D.LIZIZ(LIZ2));
            }
            jSONObject.put("rewriteMapping", jSONArray2);
            return jSONObject.toString();
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return "";
        }
    }

    public Map<String, String> getIncMapping() {
        return this.mIncMapping;
    }

    public Map<String, String> getRewriteMapping() {
        return this.mRewriteMapping;
    }

    public RouterConfig(String str) {
        this.mTag = "";
        this.mTag = str;
    }

    public static RouterConfig load(String str) {
        return parse(str);
    }

    public static RouterConfig parse(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            RouterConfig routerConfig = new RouterConfig(jSONObject.optString("tag"));
            routerConfig.setIncMapping(parseJsonArray(jSONObject.optJSONArray("incMapping")));
            routerConfig.setRewriteMapping(parseJsonArray(jSONObject.optJSONArray("rewriteMapping")));
            return routerConfig;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DynamicMapping#load failed: ");
            LIZ.append(str);
            Logger.e(X1D.LIZIZ(LIZ));
            return null;
        }
    }

    public static Map<String, String> parseJsonArray(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    String[] split = optString.split(",");
                    if (split.length != 2) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("DynamicMapping#parseJsonArray illegal schema mapping: ");
                        LIZ.append(optString);
                        Logger.e(X1D.LIZIZ(LIZ));
                    } else {
                        String str = split[0];
                        if (str == null || split[1] == null) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("DynamicMapping#parseJsonArray illegal schema mapping(null): ");
                            LIZ2.append(optString);
                            Logger.e(X1D.LIZIZ(LIZ2));
                        } else {
                            split[0] = str.trim();
                            split[1] = split[1].trim();
                            if (TextUtils.isEmpty(split[0]) || TextUtils.isEmpty(split[1])) {
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("DynamicMapping#parseJsonArray illegal schema mapping empty: ");
                                LIZ3.append(optString);
                                Logger.e(X1D.LIZIZ(LIZ3));
                            } else {
                                hashMap.put(split[0], split[1]);
                            }
                        }
                    }
                }
            }
            return hashMap;
        }
        return null;
    }

    public void setIncMapping(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            this.mIncMapping = Collections.emptyMap();
        } else {
            this.mIncMapping = map;
        }
    }

    public void setRewriteMapping(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            this.mRewriteMapping = Collections.emptyMap();
        } else {
            this.mRewriteMapping = map;
        }
    }

    public static boolean isExpired(Context context, RouterConfig routerConfig) {
        if (context == null || routerConfig == null) {
            return true;
        }
        String str = "";
        try {
            PackageInfo LLLLLLZ = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 128);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("");
            LIZ.append(LLLLLLZ.versionCode);
            str = X1D.LIZIZ(LIZ);
            Bundle bundle = C16880lQ.LLLLLLLLL(context.getPackageManager(), context.getPackageName(), 128).metaData;
            if (bundle != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str);
                LIZ2.append("_");
                LIZ2.append(String.valueOf(bundle.getInt("UPDATE_VERSION_CODE")));
                str = X1D.LIZIZ(LIZ2);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (TextUtils.isEmpty(str) || !str.equals(routerConfig.mTag)) {
            return true;
        }
        return false;
    }
}
