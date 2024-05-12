package com.bytedance.bdlocation.entity.region;

import X.C16880lQ;
import X.C47135Ieh;
import X.Q89;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.bdlocation.utils.json.JsonUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class RegionBean {
    public String asciName;
    public String code;
    public String errorCode;
    public long expireTime;
    public long geoNameID;
    public String name;
    public int source;

    public boolean isValid() {
        if (!TextUtils.isEmpty(this.errorCode) || TextUtils.isEmpty(this.code) || this.expireTime <= 0 || System.currentTimeMillis() > this.expireTime) {
            return false;
        }
        return true;
    }

    public String parseToJsonString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Code", this.code);
            jSONObject.put("GeoNameID", this.geoNameID);
            jSONObject.put("ASCIName", this.asciName);
            jSONObject.put("Name", this.name);
            jSONObject.put("expire_time", this.expireTime);
            jSONObject.put("source", this.source);
            return jSONObject.toString();
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RegionBean{code='");
        Q89.LIZIZ(LIZ, this.code, '\'', ", geoNameID=");
        LIZ.append(this.geoNameID);
        LIZ.append(", asciName='");
        Q89.LIZIZ(LIZ, this.asciName, '\'', ", name='");
        Q89.LIZIZ(LIZ, this.name, '\'', ", source=");
        LIZ.append(this.source);
        LIZ.append(", expireTime=");
        return C47135Ieh.LIZIZ(LIZ, this.expireTime, '}', LIZ);
    }

    public static RegionBean buildFromErrorCode(String str) {
        RegionBean regionBean = new RegionBean();
        regionBean.errorCode = str;
        return regionBean;
    }

    public static RegionBean buildFromLocal(String str) {
        RegionBean regionBean = new RegionBean();
        regionBean.source = 2;
        regionBean.code = str;
        regionBean.expireTime = System.currentTimeMillis() + 21600000;
        return regionBean;
    }

    public static RegionBean buildFromJsonString(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            RegionBean regionBean = new RegionBean();
            regionBean.code = JsonUtil.safeOptString(jSONObject, "Code", null);
            regionBean.geoNameID = JsonUtil.safeOptLong(jSONObject, "GeoNameID", 0L);
            regionBean.asciName = JsonUtil.safeOptString(jSONObject, "ASCIName", null);
            regionBean.name = JsonUtil.safeOptString(jSONObject, "Name", null);
            regionBean.expireTime = JsonUtil.safeOptLong(jSONObject, "expire_time", System.currentTimeMillis() + 21600000);
            regionBean.source = i;
            return regionBean;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}
