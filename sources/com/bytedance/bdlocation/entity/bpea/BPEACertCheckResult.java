package com.bytedance.bdlocation.entity.bpea;

import org.json.JSONObject;

/* loaded from: classes16.dex */
public class BPEACertCheckResult {
    public int code;
    public String msg;
    public JSONObject params;

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public JSONObject getParams() {
        return this.params;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setParams(JSONObject jSONObject) {
        this.params = jSONObject;
    }
}
