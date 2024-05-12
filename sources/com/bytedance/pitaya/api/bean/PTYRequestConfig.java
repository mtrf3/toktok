package com.bytedance.pitaya.api.bean;

import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class PTYRequestConfig implements ReflectionCall {
    public final boolean download;
    public final String filterStr;

    /* JADX WARN: Multi-variable type inference failed */
    public PTYRequestConfig() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public final boolean getDownload() {
        return this.download;
    }

    public PTYRequestConfig(boolean z, JSONObject jSONObject) {
        String str;
        this.download = z;
        if (jSONObject != null) {
            str = jSONObject.toString();
        } else {
            str = null;
        }
        this.filterStr = str;
    }

    public /* synthetic */ PTYRequestConfig(boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : jSONObject);
    }
}
