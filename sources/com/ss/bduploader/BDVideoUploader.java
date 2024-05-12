package com.ss.bduploader;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.bduploader.smartserver.SmartRouting;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class BDVideoUploader extends BDVideoUploaderBase {
    public boolean hasInit;
    public int mEstimatedFileSize = -1;
    public int mEstimatedVideoDuration;
    public JSONObject mEstimatedVideoInfo;
    public int mEstimatedVideoRate;
    public SmartRouting mSmartRouting;

    private void preloadModel() {
        SmartRouting smartRouting = this.mSmartRouting;
        if (smartRouting != null) {
            smartRouting.preloadEnv();
        }
    }

    @Override // com.ss.bduploader.BDVideoUploaderBase
    public void allowMergeUpload() {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._mergeUpload(j);
    }

    public void cancelUpload() {
        this.mWriteLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.mWriteLock.unlock();
        } else {
            BDVideoUploaderBase._cancelUpload(j);
            this.mWriteLock.unlock();
        }
    }

    private void checkAndInit(String str) {
        if (this.hasInit) {
            return;
        }
        this.hasInit = true;
        SmartRouting smartRouting = new SmartRouting();
        this.mSmartRouting = smartRouting;
        smartRouting.init();
        this.mSmartRouting.parseUrl(str);
        this.mSmartRouting.configServer();
    }

    private String insertFileSizeInfo(String str) {
        JSONObject jSONObject;
        try {
            int i = this.mEstimatedVideoDuration * this.mEstimatedVideoRate;
            if (i <= 0) {
                i = this.mEstimatedFileSize;
            }
            this.mEstimatedFileSize = i;
            jSONObject = new JSONObject(str);
            jSONObject.put("est_file_size", this.mEstimatedFileSize / 1024);
        } catch (Exception unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return str;
        }
        return jSONObject.toString();
    }

    private float predictIntelligentTCPQUIC(String str) {
        if (this.mSmartRouting == null) {
            return -1.0f;
        }
        try {
            return this.mSmartRouting.predictSpeedSync(new JSONObject(str));
        } catch (Exception unused) {
            return -1.0f;
        }
    }

    private JSONObject processIntelligentPrediction(float f) {
        JSONObject jSONObject = new JSONObject();
        if (f < 0.0f || f > 1.0f) {
            return null;
        }
        try {
            if (f < 0.5d) {
                jSONObject.put("intelligentRoutingResult", 0);
            } else {
                jSONObject.put("intelligentRoutingResult", 1);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public void setAuthType(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 416, i);
    }

    public void setConfig(TreeMap<String, Object> treeMap) {
        String mapToString;
        if (this.mHandle == 0 || treeMap == null || (mapToString = BDUploadUtil.mapToString(treeMap)) == null) {
            return;
        }
        setStringValue(56, mapToString);
    }

    public void setContext(String str) {
        long j = this.mHandle;
        if (j == 0 || str == null) {
            return;
        }
        BDVideoUploaderBase._setContext(j, str);
    }

    public void setCustomConfig(TreeMap<String, Object> treeMap) {
        JSONObject mapToJSON;
        if (this.mHandle == 0 || treeMap == null || (mapToJSON = BDUploadUtil.mapToJSON(treeMap)) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("custom_config", mapToJSON);
            String jSONObject2 = jSONObject.toString();
            if (TextUtils.isEmpty(jSONObject2)) {
                return;
            }
            setStringValue(63, jSONObject2);
        } catch (Throwable unused) {
        }
    }

    public void setDataTransportProtocol(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 411, i);
    }

    public void setEstimatedVideoInfo(TreeMap<String, Object> treeMap) {
        if (this.mHandle == 0 || treeMap.isEmpty()) {
            return;
        }
        JSONObject mapToJSON = BDUploadUtil.mapToJSON(treeMap);
        this.mEstimatedVideoInfo = mapToJSON;
        if (mapToJSON == null) {
            return;
        }
        try {
            this.mEstimatedVideoDuration = JSONObjectProtectorUtils.getInt(mapToJSON, "durationMs") / 1000;
            this.mEstimatedVideoRate = JSONObjectProtectorUtils.getInt(this.mEstimatedVideoInfo, "bitrateKb");
            BDVideoUploaderBase._setStringValue(this.mHandle, 436, this.mEstimatedVideoInfo.toString());
        } catch (JSONException unused) {
        }
    }

    public void setExternFileReader(BDExternalFileReader bDExternalFileReader) {
        long j = this.mHandle;
        if (j == 0 || bDExternalFileReader == null) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 71, 1);
        BDVideoUploaderBase._setObject(this.mHandle, 200, bDExternalFileReader);
    }

    public void setExternMinSIze(int i) {
        long j = this.mHandle;
        if (j == 0 || i <= 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 77, i);
    }

    public void setExternalReaderMode(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 412, i);
    }

    public void setPolicyParams(TreeMap<String, Object> treeMap) {
        if (this.mHandle == 0 || treeMap == null) {
            return;
        }
        String mapToString = BDUploadUtil.mapToString(treeMap);
        if (TextUtils.isEmpty(mapToString)) {
            return;
        }
        setStringValue(55, mapToString);
    }

    @Override // com.ss.bduploader.BDVideoUploaderBase
    public void setPreUploadEncryptionMode(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 74, i);
    }

    public void setPrivateVideo(boolean z) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 414, z ? 1 : 0);
    }

    public void setProcessActionType(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 65, i);
    }

    public void setQueryAuth(String str) {
        long j = this.mHandle;
        if (j == 0 || str == null) {
            return;
        }
        BDVideoUploaderBase._setStringValue(j, 15, str);
    }

    public void setRetryStatesOption(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 434, i);
    }

    public void setSpeedTestThresh(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 406, i);
    }

    public void setSpeedTestValue(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 405, i);
    }

    public void setTTNetEngineFallbackOption(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 437, i);
    }

    public void setUserReference(String str) {
        long j = this.mHandle;
        if (j == 0 || str == null) {
            return;
        }
        BDVideoUploaderBase._setStringValue(j, 62, str);
    }

    @Override // com.ss.bduploader.BDAbstractUpload
    public String intelligentInterface(int i, String str) {
        JSONObject processIntelligentPrediction;
        if (i != 0) {
            if (i != 1 || (processIntelligentPrediction = processIntelligentPrediction(predictIntelligentTCPQUIC(insertFileSizeInfo(str)))) == null) {
                return "";
            }
            return processIntelligentPrediction.toString();
        }
        checkAndInit(str);
        preloadModel();
        return "";
    }

    public void setNetworkType(int i, int i2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, i, i2);
    }

    public void setCustomNetworkTimeoutParams(int i, int i2, int i3, int i4, int i5) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 422, i);
        BDVideoUploaderBase._setIntValue(this.mHandle, 423, i2);
        BDVideoUploaderBase._setIntValue(this.mHandle, 424, i3);
        BDVideoUploaderBase._setIntValue(this.mHandle, 425, i4);
        BDVideoUploaderBase._setIntValue(this.mHandle, 427, i5);
    }
}
