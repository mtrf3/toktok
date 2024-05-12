package com.ss.ugc.effectplatform.model.net;

import X.XDH;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public class GetCustomizedEffectIDResponse extends XDH<GetCustomizedEffectIDData> {
    public GetCustomizedEffectIDData data;
    public String message;
    public int status_code;

    /* JADX WARN: Multi-variable type inference failed */
    public GetCustomizedEffectIDResponse() {
        this(null, 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.XDH
    public GetCustomizedEffectIDData getResponseData() {
        return getData();
    }

    @Override // X.XDH
    public String getResponseMessage() {
        return getMessage();
    }

    @Override // X.XDH
    public int getStatusCode() {
        return getStatus_code();
    }

    public GetCustomizedEffectIDData getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public void setData(GetCustomizedEffectIDData getCustomizedEffectIDData) {
        this.data = getCustomizedEffectIDData;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public GetCustomizedEffectIDResponse(GetCustomizedEffectIDData getCustomizedEffectIDData, int i, String str) {
        this.data = getCustomizedEffectIDData;
        this.status_code = i;
        this.message = str;
    }

    public /* synthetic */ GetCustomizedEffectIDResponse(GetCustomizedEffectIDData getCustomizedEffectIDData, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : getCustomizedEffectIDData, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str);
    }
}
