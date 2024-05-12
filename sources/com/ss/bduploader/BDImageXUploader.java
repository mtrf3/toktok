package com.ss.bduploader;

import android.text.TextUtils;
import java.util.TreeMap;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class BDImageXUploader extends BDImageXUploaderBase {
    public void setPreUpload(boolean z) {
    }

    public void startPreHeat() {
        setPreheatUploader(2);
        start();
    }

    public void allowContinueUpload() {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDImageXUploaderBase._allowContinueUpload(j);
    }

    public void allowMergeUpload() {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDImageXUploaderBase._mergeUpload(j);
    }

    public void cancelUpload() {
        this.mWriteLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.mWriteLock.unlock();
        } else {
            BDImageXUploaderBase._cancelUpload(j);
            this.mWriteLock.unlock();
        }
    }

    public void SetExtraParams(JSONObject jSONObject) {
        if (this.mHandle == 0 || jSONObject == null) {
            return;
        }
        setStringValue(61, jSONObject.toString());
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
        BDImageXUploaderBase._setIntValue(j, 411, i);
    }

    public void setEnableCommitUpload(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDImageXUploaderBase._setIntValue(j, 401, i);
    }

    public void setEnableEnd2EndEncryption(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        this.mEnd2EndEncryptionOption = i;
        BDImageXUploaderBase._setIntValue(j, 439, i);
    }

    public void setEnableSkipMeta(boolean z) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDImageXUploaderBase._setIntValue(j, 435, z ? 1 : 0);
    }

    public void setEnd2EndEncryptionAESKey(String str) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        this.mEnd2EndEncryptionAESKey = str;
        BDImageXUploaderBase._setStringValue(j, 441, str);
    }

    public void setEnd2EndEncryptionPublicKey(String str) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDImageXUploaderBase._setStringValue(j, 440, str);
    }

    public void setObjectType(String str) {
        setStringValue(54, str);
    }

    public void setPreUploadEncryptionMode(int i) {
        String uuid;
        if (this.mHandle == 0) {
            return;
        }
        if (i == 2 && (uuid = UUID.randomUUID().toString()) != null && uuid.length() > 0) {
            BDImageXUploaderBase._setStringValue(this.mHandle, 420, uuid);
        }
        BDImageXUploaderBase._setIntValue(this.mHandle, 74, i);
    }

    public void setPreheatUploader(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDImageXUploaderBase._setIntValue(j, 419, i);
    }

    public void setEnableCommitUpload(boolean z) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDImageXUploaderBase._setIntValue(j, 401, z ? 1 : 0);
    }

    public void setPreheatUploader(boolean z) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDImageXUploaderBase._setIntValue(j, 419, z ? 1 : 0);
    }

    public void setNetworkType(int i, int i2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDImageXUploaderBase._setIntValue(j, i, i2);
    }

    public void setCustomNetworkTimeoutParams(int i, int i2, int i3, int i4, int i5) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDImageXUploaderBase._setIntValue(j, 422, i);
        BDImageXUploaderBase._setIntValue(this.mHandle, 423, i2);
        BDImageXUploaderBase._setIntValue(this.mHandle, 424, i3);
        BDImageXUploaderBase._setIntValue(this.mHandle, 425, i4);
        BDImageXUploaderBase._setIntValue(this.mHandle, 427, i5);
    }
}
