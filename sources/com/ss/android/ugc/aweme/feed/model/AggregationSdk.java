package com.ss.android.ugc.aweme.feed.model;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AggregationSdk implements Serializable {

    @InterfaceC65349Pkn("common_data")
    public Object commonData;

    public JSONObject getCommonData() {
        try {
            return new JSONObject(GsonProtectorUtils.toJson(new Gson(), this.commonData));
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}
