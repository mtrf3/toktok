package com.bytedance.vcloud.networkpredictor;

import X.C16880lQ;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class SpeedPredictorResultItem {
    public float mbandwidth;
    public String mhost;
    public String mloadType;
    public int mtrackType;

    public JSONObject toJsonObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = this.mloadType;
            if (str != null) {
                jSONObject.put("loadType", str);
            }
            String str2 = this.mhost;
            if (str2 != null) {
                jSONObject.put("host", str2);
            }
            jSONObject.put("bandwidth", this.mbandwidth);
            jSONObject.put("trackType", this.mtrackType);
            return jSONObject;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public float getBandwidth() {
        return this.mbandwidth;
    }

    public String getHost() {
        return this.mhost;
    }

    public String getLoadType() {
        return this.mloadType;
    }

    public int getTrackType() {
        return this.mtrackType;
    }

    public void setBandwidth(float f) {
        this.mbandwidth = f;
    }

    public void setHost(String str) {
        this.mhost = str;
    }

    public void setLoadType(String str) {
        this.mloadType = str;
    }

    public void setTrackType(int i) {
        this.mtrackType = i;
    }

    public SpeedPredictorResultItem(String str, String str2, float f, int i) {
        this.mloadType = str;
        this.mhost = str2;
        this.mbandwidth = f;
        this.mtrackType = i;
    }
}
