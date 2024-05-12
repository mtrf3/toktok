package com.ss.ugc.effectplatform.model.net;

import X.XDH;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class QueryCustomizedEffectsResponse extends XDH<QueryCustomizedEffectsData> {
    public QueryCustomizedEffectsData data;
    public String message;
    public int status_code;

    /* JADX WARN: Multi-variable type inference failed */
    public QueryCustomizedEffectsResponse() {
        this(0, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final QueryCustomizedEffectsData getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // X.XDH
    public String getResponseMessage() {
        return this.message;
    }

    @Override // X.XDH
    public int getStatusCode() {
        return this.status_code;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.XDH
    public QueryCustomizedEffectsData getResponseData() {
        return this.data;
    }

    public final void setData(QueryCustomizedEffectsData queryCustomizedEffectsData) {
        this.data = queryCustomizedEffectsData;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public QueryCustomizedEffectsResponse(int i, String str, QueryCustomizedEffectsData queryCustomizedEffectsData) {
        this.status_code = i;
        this.message = str;
        this.data = queryCustomizedEffectsData;
    }

    public /* synthetic */ QueryCustomizedEffectsResponse(int i, String str, QueryCustomizedEffectsData queryCustomizedEffectsData, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : queryCustomizedEffectsData);
    }
}
