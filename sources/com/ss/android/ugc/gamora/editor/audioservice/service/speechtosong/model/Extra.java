package com.ss.android.ugc.gamora.editor.audioservice.service.speechtosong.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Extra extends F9E {

    @InterfaceC65349Pkn("cost_time")
    public final JSONObject costTime;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.costTime};
    }

    public Extra(JSONObject costTime) {
        o.LJIIIZ(costTime, "costTime");
        this.costTime = costTime;
    }
}
