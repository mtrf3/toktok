package com.ss.videoarch.strategy.strategy.networkStrategy;

import X.C79326VBi;
import X.C79346VCc;
import X.VD4;
import X.VD7;
import X.VDB;
import android.text.TextUtils;
import com.ss.videoarch.strategy.dataCenter.config.model.settingsmodel.CharacterConfig;
import com.ss.videoarch.strategy.dataCenter.config.model.settingsmodel.LSStrategySDKSettings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class SettingsManager {
    public Map<String, List<VDB>> mCallBackMap;

    /* loaded from: classes15.dex */
    public static class LSToggles {
        public boolean mEnableSelectNode;
        public String mNodeInfos;
        public int mBasePostRequestInterval = 300;
        public String mDomianInfos = "";
        public String mRequestId = "";
        public String mSettings = "";
        public String mProjectSettings = "";
        public String mStrategyConfigJSON = "";
        public String mFeatureConfigJSON = "";
        public String mCommonConfigJSON = "";
        public String mUidFeatureJSON = "";
    }

    private native boolean nativeGetCharacterConfig(String str, String str2, CharacterConfig characterConfig);

    private native boolean nativeGetLSSettings(String str, LSToggles lSToggles);

    private native String nativeGetStrategyConfigByName(String str, String str2);

    private native LSStrategySDKSettings nativeGetStrategySDKSettings(String str, LSStrategySDKSettings lSStrategySDKSettings);

    private native void nativeLoadDB();

    private native void nativeRegisterStrategyConfigUpdate(String str);

    private native void nativeSendRequest(String str, ResponseData responseData);

    private native void nativeSetSDKParams(String str);

    public SettingsManager() {
        this.mCallBackMap = new HashMap();
    }

    public void loadDB() {
        if (C79346VCc.LIZLLL().LJJIL == 1 && C79326VBi.LIZ()) {
            nativeLoadDB();
        }
    }

    public static SettingsManager getInstance() {
        return VD7.LIZ;
    }

    /* loaded from: classes15.dex */
    public class ResponseData {
        public String responseJsonStr = "";
        public int statusCode;

        public ResponseData() {
        }
    }

    public void SetSDKParams(String str) {
        if (!C79326VBi.LIZ() || C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableSetSDKParams != 1) {
            return;
        }
        nativeSetSDKParams(str);
    }

    public ResponseData sendRequest(String str) {
        ResponseData responseData = new ResponseData();
        if (!C79326VBi.LIZ()) {
            return responseData;
        }
        nativeSendRequest(str, responseData);
        return responseData;
    }

    public boolean getFeatureConfig(String str, VD4 vd4) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        if (!C79326VBi.LIZ()) {
            return false;
        }
        CharacterConfig characterConfig = new CharacterConfig();
        if (nativeGetCharacterConfig(str, vd4.LIZ, characterConfig)) {
            try {
                if (characterConfig.mFeaturesList.isEmpty()) {
                    jSONArray = vd4.LIZIZ;
                } else {
                    jSONArray = new JSONArray((Collection) characterConfig.mFeaturesList);
                }
                vd4.LIZIZ = jSONArray;
                if (!characterConfig.mRTFeaturesList.isEmpty()) {
                    JSONArray jSONArray2 = new JSONArray((Collection) characterConfig.mRTFeaturesList);
                    vd4.LIZJ = jSONArray2;
                    vd4.LIZLLL = jSONArray2.toString();
                }
                if (TextUtils.isEmpty(characterConfig.mFeaturesCollectRules)) {
                    jSONObject = vd4.LJ;
                } else {
                    jSONObject = new JSONObject(characterConfig.mFeaturesCollectRules);
                }
                vd4.LJ = jSONObject;
                return true;
            } catch (JSONException unused) {
            }
        }
        return false;
    }

    public String getStrategyConfigByName(String str, String str2) {
        if (!C79326VBi.LIZ()) {
            return "";
        }
        return nativeGetStrategyConfigByName(str, str2);
    }

    public LSStrategySDKSettings getStrategySDKSettings(String str, LSStrategySDKSettings lSStrategySDKSettings) {
        if (TextUtils.isEmpty(str) || !C79326VBi.LIZ()) {
            return lSStrategySDKSettings;
        }
        return nativeGetStrategySDKSettings(str, lSStrategySDKSettings);
    }

    public boolean initLSSettings(String str, C79346VCc c79346VCc) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        JSONObject jSONObject6;
        JSONObject jSONObject7;
        if (!TextUtils.isEmpty(str) && C79326VBi.LIZ()) {
            LSToggles lSToggles = new LSToggles();
            if (nativeGetLSSettings(str, lSToggles)) {
                c79346VCc.LJJIFFI = lSToggles.mBasePostRequestInterval;
                c79346VCc.LJIILL = lSToggles.mEnableSelectNode;
                c79346VCc.LIZLLL = lSToggles.mRequestId;
                try {
                    if (TextUtils.isEmpty(lSToggles.mDomianInfos)) {
                        jSONArray = c79346VCc.LIZJ;
                    } else {
                        jSONArray = new JSONArray(lSToggles.mDomianInfos);
                    }
                    c79346VCc.LIZJ = jSONArray;
                    if (TextUtils.isEmpty(lSToggles.mNodeInfos)) {
                        jSONObject = c79346VCc.LJ;
                    } else {
                        jSONObject = new JSONObject(lSToggles.mNodeInfos);
                    }
                    c79346VCc.LJ = jSONObject;
                    if (TextUtils.isEmpty(lSToggles.mSettings)) {
                        jSONObject2 = c79346VCc.LIZ;
                    } else {
                        jSONObject2 = new JSONObject(lSToggles.mSettings);
                    }
                    c79346VCc.LIZ = jSONObject2;
                    if (TextUtils.isEmpty(lSToggles.mProjectSettings)) {
                        jSONObject3 = c79346VCc.LIZIZ;
                    } else {
                        jSONObject3 = new JSONObject(lSToggles.mProjectSettings);
                    }
                    c79346VCc.LIZIZ = jSONObject3;
                    if (TextUtils.isEmpty(lSToggles.mStrategyConfigJSON)) {
                        jSONObject4 = c79346VCc.LJIIIIZZ;
                    } else {
                        jSONObject4 = new JSONObject(lSToggles.mStrategyConfigJSON);
                    }
                    c79346VCc.LJIIIIZZ = jSONObject4;
                    if (TextUtils.isEmpty(lSToggles.mFeatureConfigJSON)) {
                        jSONObject5 = c79346VCc.LJIIIZ;
                    } else {
                        jSONObject5 = new JSONObject(lSToggles.mFeatureConfigJSON);
                    }
                    c79346VCc.LJIIIZ = jSONObject5;
                    if (TextUtils.isEmpty(lSToggles.mCommonConfigJSON)) {
                        jSONObject6 = c79346VCc.LJIIJ;
                    } else {
                        jSONObject6 = new JSONObject(lSToggles.mCommonConfigJSON);
                    }
                    c79346VCc.LJIIJ = jSONObject6;
                    if (TextUtils.isEmpty(lSToggles.mUidFeatureJSON)) {
                        jSONObject7 = c79346VCc.LJIIJJI;
                    } else {
                        jSONObject7 = new JSONObject(lSToggles.mUidFeatureJSON);
                    }
                    c79346VCc.LJIIJJI = jSONObject7;
                    return true;
                } catch (JSONException unused) {
                }
            }
        }
        return false;
    }

    public void onConfigUpdate(String str, String str2) {
        List<VDB> list;
        if (!this.mCallBackMap.containsKey(str) || (list = this.mCallBackMap.get(str)) == null) {
            return;
        }
        for (VDB vdb : list) {
            if (vdb != null) {
                vdb.LIZ();
            }
        }
    }

    public void registerStrategyConfigUpdate(String str, VDB vdb) {
        if (this.mCallBackMap.containsKey(str)) {
            List<VDB> list = this.mCallBackMap.get(str);
            Objects.requireNonNull(list);
            list.add(vdb);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(vdb);
            this.mCallBackMap.put(str, arrayList);
        }
        if (!C79326VBi.LIZ()) {
            return;
        }
        nativeRegisterStrategyConfigUpdate(str);
    }
}
