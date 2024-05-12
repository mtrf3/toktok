package com.bytedance.pitaya.api.bean;

import X.F9E;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class PTYNativeTaskData extends F9E implements ReflectionCall {
    public final Object data;
    public final JSONObject extra;

    /* JADX WARN: Multi-variable type inference failed */
    public PTYNativeTaskData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PTYNativeTaskData copy$default(PTYNativeTaskData pTYNativeTaskData, Object obj, JSONObject jSONObject, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = pTYNativeTaskData.data;
        }
        if ((i & 2) != 0) {
            jSONObject = pTYNativeTaskData.extra;
        }
        return pTYNativeTaskData.copy(obj, jSONObject);
    }

    public final PTYNativeTaskData copy(Object obj, JSONObject jSONObject) {
        return new PTYNativeTaskData(obj, jSONObject);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.data, this.extra};
    }

    public final Object getData() {
        return this.data;
    }

    public final JSONObject getExtra() {
        return this.extra;
    }

    public PTYNativeTaskData(Object obj, JSONObject jSONObject) {
        this.data = obj;
        this.extra = jSONObject;
    }

    public /* synthetic */ PTYNativeTaskData(Object obj, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : jSONObject);
    }
}
