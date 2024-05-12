package com.ss.videoarch.strategy.strategy.smartStrategy;

import X.C16880lQ;
import X.C64316PMa;
import X.C79346VCc;
import X.C79350VCg;
import X.C79351VCh;
import X.C79353VCj;
import X.C79357VCn;
import X.C79360VCq;
import X.PMU;
import X.PMY;
import X.PMZ;
import X.VD4;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.videoarch.strategy.LiveStrategyManager;
import com.ss.videoarch.strategy.utils.smartStrategy.PitayaWrapper;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class BaseSmartStrategy extends C79360VCq {
    public static String TAG = "BaseSmartStrategy";
    public String mStrategyName = "lsstrategy_base_strategy_model";
    public C79357VCn mStrategyConfigInfo = new C79357VCn();
    public JSONObject mStrategyResult = null;
    public JSONObject mInputFeatures = null;
    public int mIndex = 0;
    public float mRandomFloat = new Random().nextFloat();
    public String mProjectKey = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String mResult = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String mExtraLog = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public int mRunIndex = 0;
    public int mEnableCloudPackage = -1;
    public boolean mFallbackLocal = false;
    public long mTotalCost = -1;
    public long mLoadPackageCost = -1;
    public long mRunCost = -1;
    public double mCpuInc = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    public double mMemoryInc = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;

    private native String nativeRunCloudStrategy(String str, String str2);

    private native void nativeSetObject();

    public JSONObject runLocalStrategy(JSONObject jSONObject) {
        return null;
    }

    private JSONObject createCommonLog() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("stream_type", C79350VCg.LJ().LIZJ(LiveGiftNewGifterBadgeSetting.DEFAULT, "neptuneName")).put("enter_from", C79350VCg.LJ().LIZJ(LiveGiftNewGifterBadgeSetting.DEFAULT, "enter_from")).put("run_index", this.mRunIndex).put("is_preview", C79350VCg.LJ().LIZJ(-1, "is_preview")).put("strategy_name", this.mStrategyName).put("strategy_id", this.mStrategyConfigInfo.LIZIZ).put("pitaya_ab_package_name", this.mStrategyConfigInfo.LIZJ);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    @Override // X.C79360VCq
    public JSONObject createMetric() {
        try {
            return new JSONObject().put("load_cost", this.mLoadPackageCost).put("run_cost", this.mRunCost).put("duration", this.mTotalCost).put("cpu_inc", this.mCpuInc).put("memory_inc", this.mMemoryInc);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public JSONObject fetchData() {
        if (this.mStrategyConfigInfo != null) {
            C79351VCh LIZIZ = C79351VCh.LIZIZ();
            JSONObject jSONObject = this.mStrategyConfigInfo.LJIIJJI;
            String str = this.mProjectKey;
            String str2 = this.mStrategyName;
            LIZIZ.getClass();
            return C79351VCh.LIZ(str, str2, jSONObject);
        }
        return null;
    }

    public void initStrategyConfig() {
        String str;
        int indexOf;
        JSONObject optJSONObject;
        C79357VCn c79357VCn = this.mStrategyConfigInfo;
        if (c79357VCn != null) {
            c79357VCn.getClass();
            if (C79346VCc.LIZLLL().LJIIIIZZ != null) {
                if (C79346VCc.LIZLLL().LJIIIIZZ.has(c79357VCn.LIZ)) {
                    JSONObject optJSONObject2 = C79346VCc.LIZLLL().LJIIIIZZ.optJSONObject(c79357VCn.LIZ);
                    if (optJSONObject2 != null) {
                        if (optJSONObject2.has("StrategyID")) {
                            c79357VCn.LIZIZ = optJSONObject2.optLong("StrategyID");
                        }
                        c79357VCn.LIZLLL = optJSONObject2.optInt("Enable");
                        c79357VCn.LJ = optJSONObject2.optInt("EnableSmartStrategyConfig");
                        c79357VCn.LJFF = optJSONObject2.optInt("EnableCloudStrategyModel");
                        c79357VCn.LJI = optJSONObject2.optJSONObject("InputSettingsParam");
                        if (optJSONObject2.has("FeatureSampleConfig")) {
                            c79357VCn.LJIIIZ = optJSONObject2.optJSONObject("FeatureSampleConfig");
                        } else {
                            c79357VCn.LJIIIZ = null;
                        }
                        optJSONObject2.optJSONObject("GroundTruthRule");
                        if (optJSONObject2.has("InputFeatureList")) {
                            c79357VCn.LJIIIIZZ = optJSONObject2.optJSONArray("InputFeatureList");
                        } else {
                            c79357VCn.LJIIIIZZ = c79357VCn.LJIIJ;
                        }
                    } else {
                        c79357VCn.LJIIIIZZ = c79357VCn.LJIIJ;
                        c79357VCn.LJIIIZ = null;
                    }
                } else {
                    c79357VCn.LJIIIIZZ = c79357VCn.LJIIJ;
                    c79357VCn.LJIIIZ = null;
                }
            }
            if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mPitayaABSettingsJSON != null && C79346VCc.LIZLLL().LJIIL.LIZLLL.mPitayaABSettingsJSON.has(c79357VCn.LIZ) && (optJSONObject = C79346VCc.LIZLLL().LJIIL.LIZLLL.mPitayaABSettingsJSON.optJSONObject(c79357VCn.LIZ)) != null && optJSONObject.has("package_name")) {
                c79357VCn.LIZJ = optJSONObject.optString("package_name");
            }
            JSONArray jSONArray = c79357VCn.LJIIIIZZ;
            if (jSONArray == null) {
                return;
            }
            if (c79357VCn.LJII != null && jSONArray.toString().equals(c79357VCn.LJII.toString())) {
                return;
            }
            c79357VCn.LJII = c79357VCn.LJIIIIZZ;
            c79357VCn.LJIIL = new JSONArray();
            c79357VCn.LJIILIIL = new JSONArray();
            c79357VCn.LJIILJJIL = new JSONArray();
            c79357VCn.LJIILL = new JSONArray();
            c79357VCn.LJIILLIIL = new JSONArray();
            c79357VCn.LJIIZILJ = new JSONArray();
            c79357VCn.LJIJ = new JSONArray();
            c79357VCn.LJIJI = new JSONArray();
            c79357VCn.LJIJJ = new JSONArray();
            c79357VCn.LJIJJLI = new JSONArray();
            for (int i = 0; i < c79357VCn.LJIIIIZZ.length(); i++) {
                try {
                    String string = JSONArrayProtectorUtils.getString(c79357VCn.LJIIIIZZ, i);
                    if (string != null && (indexOf = string.indexOf("-")) > 0) {
                        str = string.substring(0, indexOf);
                    } else {
                        str = "UNKNOWN";
                    }
                    str.getClass();
                    switch (str.hashCode()) {
                        case -1733499378:
                            if (str.equals("NETWORK")) {
                                if (PMZ.LIZJ().LIZIZ != null && ((VD4) PMZ.LIZJ().LIZIZ).LIZLLL != null && ((VD4) PMZ.LIZJ().LIZIZ).LIZLLL.contains(string)) {
                                    c79357VCn.LJIILL.put(string);
                                    continue;
                                } else {
                                    c79357VCn.LJIILJJIL.put(string);
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 2458420:
                            if (str.equals("PLAY")) {
                                if (C79350VCg.LJ().LIZIZ != null && ((VD4) C79350VCg.LJ().LIZIZ).LIZLLL != null && ((VD4) C79350VCg.LJ().LIZIZ).LIZLLL.contains(string)) {
                                    c79357VCn.LJIILIIL.put(string);
                                    continue;
                                } else {
                                    c79357VCn.LJIIL.put(string);
                                    break;
                                }
                            } else {
                                break;
                            }
                            break;
                        case 2467610:
                            if (str.equals("PUSH")) {
                                if (C64316PMa.LIZLLL().LIZIZ != null && ((VD4) C64316PMa.LIZLLL().LIZIZ).LIZLLL != null && ((VD4) C64316PMa.LIZLLL().LIZIZ).LIZLLL.contains(string)) {
                                    c79357VCn.LJIJJLI.put(string);
                                    continue;
                                } else {
                                    c79357VCn.LJIJJ.put(string);
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 2614219:
                            if (!str.equals("USER")) {
                                break;
                            }
                            break;
                        case 1934997173:
                            if (!str.equals("ANCHOR")) {
                                break;
                            }
                            break;
                        case 2013139542:
                            if (str.equals("DEVICE")) {
                                if (PMU.LJ().LIZIZ != null && ((VD4) PMU.LJ().LIZIZ).LIZLLL != null && ((VD4) PMU.LJ().LIZIZ).LIZLLL.contains(string)) {
                                    c79357VCn.LJIIZILJ.put(string);
                                    continue;
                                } else {
                                    c79357VCn.LJIILLIIL.put(string);
                                    break;
                                }
                            } else {
                                break;
                            }
                            break;
                    }
                    if (PMY.LJ().LIZIZ != null && ((VD4) PMY.LJ().LIZIZ).LIZLLL != null && ((VD4) PMY.LJ().LIZIZ).LIZLLL.contains(string)) {
                        c79357VCn.LJIJI.put(string);
                    } else {
                        c79357VCn.LJIJ.put(string);
                    }
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            try {
                c79357VCn.LJIIJJI.put("PlayFeaturesBundle", c79357VCn.LJIIL).put("RTPlayFeaturesBundle", c79357VCn.LJIILIIL).put("NetworkFeaturesBundle", c79357VCn.LJIILJJIL).put("RTNetworkFeaturesBundle", c79357VCn.LJIILL).put("DeviceFeaturesBundle", c79357VCn.LJIILLIIL).put("RTDeviceFeaturesBundle", c79357VCn.LJIIZILJ).put("UserFeaturesBundle", c79357VCn.LJIJ).put("RTUserFeaturesBundle", c79357VCn.LJIJI).put("PushFeaturesBundle", c79357VCn.LJIJJ).put("RTPushFeaturesBundle", c79357VCn.LJIJJLI);
            } catch (JSONException e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
    }

    public JSONObject runStrategy() {
        JSONObject jSONObject;
        if (this.mServiceName == null) {
            this.mServiceName = "live_stream_strategy_common_monitor";
        }
        JSONObject jSONObject2 = null;
        if (getEnableStrategy(this.mStrategyName, 0) != 1) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject fetchData = fetchData();
        this.mInputFeatures = fetchData;
        C79357VCn c79357VCn = this.mStrategyConfigInfo;
        if (c79357VCn == null || (c79357VCn.LJ == 0 && c79357VCn.LJFF == 0)) {
            this.mEnableCloudPackage = 0;
            jSONObject2 = runLocalStrategy(fetchData);
        } else {
            this.mEnableCloudPackage = 1;
            if (fetchData != null && (jSONObject = c79357VCn.LJI) != null) {
                try {
                    fetchData.put("InputSettingsParams", jSONObject);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            C79357VCn c79357VCn2 = this.mStrategyConfigInfo;
            if (c79357VCn2.LJ == 1) {
                jSONObject2 = runSmartStrategy(fetchData);
            } else if (c79357VCn2.LJFF == 1) {
                jSONObject2 = runCloudStrategy(fetchData);
            }
        }
        this.mRunIndex++;
        if (jSONObject2 != null) {
            this.mResult = jSONObject2.toString();
        } else {
            this.mResult = LiveGiftNewGifterBadgeSetting.DEFAULT;
        }
        this.mTotalCost = System.currentTimeMillis() - currentTimeMillis;
        uploadMonitorLog();
        this.mStrategyResult = jSONObject2;
        return jSONObject2;
    }

    public BaseSmartStrategy() {
        if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableNativeStrategyCenter == 1) {
            nativeSetObject();
        }
    }

    @Override // X.C79360VCq
    public JSONObject createCategory() {
        Object LIZJ;
        int i;
        JSONObject createCommonLog = createCommonLog();
        try {
            JSONObject put = createCommonLog.put("caller", this.mProjectKey);
            if (this.mProjectKey == "2") {
                LIZJ = C79350VCg.LJ().LIZJ(LiveGiftNewGifterBadgeSetting.DEFAULT, "stream_session_vv_id");
            } else {
                LIZJ = C64316PMa.LIZLLL().LIZJ(LiveGiftNewGifterBadgeSetting.DEFAULT, "stream_session_vv_id");
            }
            JSONObject put2 = put.put("caller_session_id", LIZJ).put("result", this.mResult);
            if (this.mFallbackLocal) {
                i = 1;
            } else {
                i = 0;
            }
            put2.put("fallback_local", i).put("enable_cloud_package", this.mEnableCloudPackage).put("extra_info", this.mExtraLog);
            return createCommonLog;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public String getInputFeatures() {
        JSONObject fetchData = fetchData();
        if (fetchData != null) {
            return fetchData.toString();
        }
        return "";
    }

    public JSONObject runCloudStrategy(JSONObject jSONObject) {
        String str;
        JSONObject optJSONObject = this.mStrategyConfigInfo.LJI.optJSONObject("cloudStrategyParam");
        JSONObject jSONObject2 = null;
        if (optJSONObject != null) {
            str = nativeRunCloudStrategy(optJSONObject.toString(), jSONObject.toString());
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject2 = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        if (jSONObject2 != null) {
            return jSONObject2;
        }
        return runLocalStrategy(jSONObject);
    }

    public JSONObject runSmartStrategy(JSONObject jSONObject) {
        final JSONObject[] jSONObjectArr = {null};
        PTYTaskResultCallback pTYTaskResultCallback = new PTYTaskResultCallback() { // from class: com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy.1
            @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
            public void onResult(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) {
                if (pTYTaskData != null) {
                    jSONObjectArr[0] = pTYTaskData.getParams();
                }
            }
        };
        PitayaWrapper LIZIZ = PitayaWrapper.LIZIZ();
        String str = this.mStrategyName;
        if (PitayaCoreFactory.getCore(LIZIZ.LIZIZ).isReady()) {
            PitayaCoreFactory.getCore(LIZIZ.LIZIZ).runTask(str, new PTYTaskData(jSONObject), new PTYTaskConfig(true, null, (float) C79346VCc.LIZLLL().LJIIL.LIZLLL.mRunPtyPackageWaitTime), pTYTaskResultCallback);
            JSONObject jSONObject2 = jSONObjectArr[0];
            if (jSONObject2 != null) {
                this.mFallbackLocal = false;
                return jSONObject2;
            }
        }
        this.mFallbackLocal = true;
        return runLocalStrategy(jSONObject);
    }

    public void uploadGroundTruth(JSONObject jSONObject) {
        JSONObject jSONObject2;
        float f;
        C79357VCn c79357VCn = this.mStrategyConfigInfo;
        if (c79357VCn != null && (jSONObject2 = c79357VCn.LJIIIZ) != null && jSONObject2.has("GroundTruthSample")) {
            JSONObject optJSONObject = this.mStrategyConfigInfo.LJIIIZ.optJSONObject("GroundTruthSample");
            if (optJSONObject == null || !optJSONObject.has("Enable") || optJSONObject.optInt("Enable") == -1) {
                return;
            }
            if (optJSONObject.has("ReportRate")) {
                f = (float) optJSONObject.optDouble("ReportRate");
            } else {
                f = 0.1f;
            }
            if (this.mRandomFloat < f) {
                JSONObject createCommonLog = createCommonLog();
                try {
                    JSONObject put = createCommonLog.put("input_features", this.mInputFeatures).put("ground_truth", jSONObject);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(LiveStrategyManager.mLoadLibraryTime);
                    LIZ.append(".");
                    LIZ.append(LiveStrategyManager.inst().mDeviceId);
                    LIZ.append(".");
                    LIZ.append(this.mIndex);
                    put.put("unique_symbol", X1D.LIZIZ(LIZ));
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                AppLogNewUtils.onEventV3("live_stream_strategy_feature_data", createCommonLog);
            }
        }
        this.mIndex++;
        this.mRandomFloat = new Random().nextFloat();
    }

    public void uploadPredictValue(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject optJSONObject;
        float f;
        C79357VCn c79357VCn = this.mStrategyConfigInfo;
        if (c79357VCn == null || (jSONObject2 = c79357VCn.LJIIIZ) == null || !jSONObject2.has("PredictResultSample") || (optJSONObject = this.mStrategyConfigInfo.LJIIIZ.optJSONObject("PredictResultSample")) == null || !optJSONObject.has("Enable") || optJSONObject.optInt("Enable") == -1) {
            return;
        }
        if (optJSONObject.has("ReportRate")) {
            f = (float) optJSONObject.optDouble("ReportRate");
        } else {
            f = 0.1f;
        }
        if (this.mRandomFloat >= f) {
            return;
        }
        JSONObject createCommonLog = createCommonLog();
        try {
            JSONObject put = createCommonLog.put("input_features", this.mInputFeatures).put("predict", jSONObject);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LiveStrategyManager.mLoadLibraryTime);
            LIZ.append(".");
            LIZ.append(LiveStrategyManager.inst().mDeviceId);
            LIZ.append(".");
            LIZ.append(this.mIndex);
            put.put("unique_symbol", X1D.LIZIZ(LIZ));
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        AppLogNewUtils.onEventV3("live_stream_strategy_feature_data", createCommonLog);
    }

    public int getEnableStrategy(String str, int i) {
        if (LiveStrategyManager.inst().mIsRunning) {
            C79357VCn c79357VCn = this.mStrategyConfigInfo;
            if (c79357VCn != null) {
                return c79357VCn.LIZLLL;
            }
            return i;
        }
        JSONObject LJJLI = C79353VCj.LJJLI(C79353VCj.LJLLILLLL, str);
        if (LJJLI == null) {
            return i;
        }
        int optInt = LJJLI.optInt("Enable");
        C79357VCn c79357VCn2 = this.mStrategyConfigInfo;
        if (c79357VCn2 == null) {
            return optInt;
        }
        c79357VCn2.LJI = LJJLI.optJSONObject("InputSettingsParam");
        return optInt;
    }
}
