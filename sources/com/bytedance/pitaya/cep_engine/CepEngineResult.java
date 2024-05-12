package com.bytedance.pitaya.cep_engine;

import com.bytedance.pitaya.cep_engine.helper.ListProxyHelper;
import com.bytedance.pitaya.cep_engine.port.CepKeeper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* loaded from: classes7.dex */
public final class CepEngineResult implements CepKeeper {
    public final String error;
    public JSONArray events;
    public final String ruleName;
    public final boolean success;

    public final String getError() {
        return this.error;
    }

    public final JSONArray getEvents() {
        return this.events;
    }

    public final String getRuleName() {
        return this.ruleName;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final void setEvents(JSONArray jSONArray) {
        this.events = jSONArray;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CepEngineResult(boolean z, String ruleName, String error, ListProxyHelper events) {
        this(z, ruleName, error, events.getData());
        o.LJIIIZ(ruleName, "ruleName");
        o.LJIIIZ(error, "error");
        o.LJIIIZ(events, "events");
    }

    public CepEngineResult(boolean z, String ruleName, String error, JSONArray jSONArray) {
        o.LJIIIZ(ruleName, "ruleName");
        o.LJIIIZ(error, "error");
        this.success = z;
        this.ruleName = ruleName;
        this.error = error;
        this.events = jSONArray;
    }

    public /* synthetic */ CepEngineResult(boolean z, String str, String str2, JSONArray jSONArray, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, str2, (i & 8) != 0 ? null : jSONArray);
    }
}
