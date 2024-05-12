package com.bytedance.pitaya.api.bean;

import X.C7OB;
import X.F9E;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class PTYTaskData extends F9E implements ReflectionCall {
    public C7OB dataFetcher;
    public final JSONObject params;

    public static /* synthetic */ PTYTaskData copy$default(PTYTaskData pTYTaskData, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = pTYTaskData.params;
        }
        return pTYTaskData.copy(jSONObject);
    }

    public final PTYTaskData copy(JSONObject jSONObject) {
        return new PTYTaskData(jSONObject);
    }

    public final C7OB getDataFetcher() {
        return null;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.params};
    }

    public final void setDataFetcher(C7OB c7ob) {
    }

    public final JSONObject getParams() {
        return this.params;
    }

    public PTYTaskData(JSONObject jSONObject) {
        this.params = jSONObject;
    }
}
