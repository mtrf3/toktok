package com.ss.bduploader;

import X.C16880lQ;
import X.V0N;
import android.text.TextUtils;
import com.ss.bduploader.logupload.AppLogEngineUploader;
import com.ss.bduploader.logupload.VideoEventEngineUploader;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public enum UploadEventManager {
    instance;

    public VideoEventEngineUploader mEngineUploader;
    public JSONArray mJsonArray = new JSONArray();
    public boolean mEnableUseEngineUploader = true;

    public JSONArray popAllEvents() {
        JSONArray jSONArray = this.mJsonArray;
        synchronized (UploadEventManager.class) {
            this.mJsonArray = new JSONArray();
        }
        return jSONArray;
    }

    public static UploadEventManager valueOf(String str) {
        return (UploadEventManager) V0N.LJJJ(UploadEventManager.class, str);
    }

    public void addEvent(JSONObject jSONObject) {
        String str;
        synchronized (UploadEventManager.class) {
            if (jSONObject != null) {
                if (this.mEngineUploader != null && this.mEnableUseEngineUploader) {
                    try {
                        str = jSONObject.getString("event");
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        this.mEngineUploader.onEventV3(str, jSONObject);
                    }
                } else {
                    this.mJsonArray.put(jSONObject);
                }
            }
        }
    }

    public void putEvent(JSONObject jSONObject) {
        synchronized (UploadEventManager.class) {
            this.mJsonArray.put(jSONObject);
        }
    }

    public synchronized void setEngineUploader(VideoEventEngineUploader videoEventEngineUploader) {
        this.mEngineUploader = videoEventEngineUploader;
    }

    public void setUseEngineUploader(boolean z) {
        this.mEnableUseEngineUploader = z;
    }

    UploadEventManager() {
        setEngineUploader(AppLogEngineUploader.getInstance());
    }
}
