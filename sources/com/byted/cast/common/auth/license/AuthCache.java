package com.byted.cast.common.auth.license;

import X.C16880lQ;
import X.X1D;
import android.text.TextUtils;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.auth.AuthService;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class AuthCache {
    public static final String TAG = C16880lQ.LJLLJ(AuthCache.class);
    public String mLicenseAppId;
    public String mLicenseBusinessId;
    public String mLicenseChannelId;
    public String mLicenseId;
    public final Object mLicenseLock = new Object();
    public String mLicenseProjectId;
    public Map<String, AuthService> mLicenseServiceMap;
    public CastLogger mLogger;
    public String mValidLicenseContent;

    public String getLicenseAppId() {
        return this.mLicenseAppId;
    }

    public String getLicenseBusinessId() {
        return this.mLicenseBusinessId;
    }

    public String getLicenseChannelId() {
        return this.mLicenseChannelId;
    }

    public String getLicenseId() {
        return this.mLicenseId;
    }

    public String getLicenseProjectId() {
        return this.mLicenseProjectId;
    }

    public AuthCache(ContextManager.CastContext castContext) {
        this.mLogger = ContextManager.getLogger(castContext);
    }

    public AuthService getAvailableServiceByName(String str) {
        CastLogger castLogger = this.mLogger;
        String str2 = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getAvailableServiceByName: ");
        LIZ.append(str);
        castLogger.d(str2, X1D.LIZIZ(LIZ));
        if (this.mLicenseServiceMap == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.mLicenseServiceMap.get(str);
    }

    private void parseLicenseContent(String str, String str2) {
        CastLogger castLogger = this.mLogger;
        String str3 = TAG;
        castLogger.d(str3, "parseLicenseContent");
        this.mLicenseProjectId = str;
        if (TextUtils.isEmpty(str2)) {
            this.mLogger.d(str3, "clear license");
            this.mLicenseId = null;
            this.mLicenseBusinessId = null;
            this.mLicenseAppId = null;
            this.mLicenseChannelId = null;
            Map<String, AuthService> map = this.mLicenseServiceMap;
            if (map != null) {
                map.clear();
            }
            this.mValidLicenseContent = null;
            return;
        }
        this.mLogger.d(str3, "parse license");
        try {
            JSONObject jSONObject = new JSONObject(str2);
            this.mLicenseId = jSONObject.optString("id");
            this.mLicenseBusinessId = jSONObject.optString("businessId");
            this.mLicenseAppId = jSONObject.optString("appId");
            this.mLicenseChannelId = jSONObject.optString("channelId");
            if (this.mLicenseServiceMap == null) {
                this.mLicenseServiceMap = new HashMap();
            }
            this.mLicenseServiceMap.clear();
            JSONArray optJSONArray = jSONObject.optJSONArray("services");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(optJSONArray, i);
                    if (jSONObject2 != null) {
                        String optString = jSONObject2.optString("name");
                        if (!TextUtils.isEmpty(optString) && TextUtils.equals(str, jSONObject2.optString("projectId"))) {
                            AuthService authService = new AuthService(optString);
                            JSONArray optJSONArray2 = jSONObject2.optJSONArray("content");
                            if (optJSONArray2 != null) {
                                int length2 = optJSONArray2.length();
                                ArrayList arrayList = new ArrayList();
                                for (int i2 = 0; i2 < length2; i2++) {
                                    String string = JSONArrayProtectorUtils.getString(optJSONArray2, i2);
                                    if (!TextUtils.isEmpty(string)) {
                                        arrayList.add(string);
                                    }
                                }
                                if (TextUtils.equals("protocols_mirror", optString) || TextUtils.equals("protocols_link", optString)) {
                                    if (!arrayList.contains("source_LeLink")) {
                                        arrayList.add("source_LeLink");
                                    }
                                    if (!arrayList.contains("sink_LeLink")) {
                                        arrayList.add("sink_LeLink");
                                    }
                                }
                                authService.setContentList(arrayList);
                            }
                            this.mLicenseServiceMap.put(optString, authService);
                        }
                    }
                }
            }
            this.mValidLicenseContent = str2;
        } catch (Exception e) {
            CastLogger castLogger2 = this.mLogger;
            String str4 = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("parse license error: ");
            LIZ.append(e.getMessage());
            castLogger2.d(str4, X1D.LIZIZ(LIZ));
            e.printStackTrace();
        }
    }

    public void cacheLicenseContentInUse(String str, String str2) {
        this.mLogger.d(TAG, "cacheLicenseContentInUse");
        if (!TextUtils.equals(str2, this.mValidLicenseContent)) {
            synchronized (this.mLicenseLock) {
                if (!TextUtils.equals(str2, this.mValidLicenseContent)) {
                    parseLicenseContent(str, str2);
                }
            }
        }
    }
}
