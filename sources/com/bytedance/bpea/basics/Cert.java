package com.bytedance.bpea.basics;

import X.OHW;
import java.io.Serializable;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public interface Cert extends Serializable {
    void attachCustomInfo(String str, Object obj);

    void attachCustomInfo(Map<String, ? extends Object> map);

    String authKey();

    String certToken();

    String certType();

    Map<String, Object> customInfo();

    JSONObject toJSON();

    void validate(OHW ohw);
}
