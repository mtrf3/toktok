package com.ss.ugc.effectplatform.model.net;

import X.XDH;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public class AddCustomizedEffectResponse extends XDH<AddCustomizedEffectResponse> {
    public String effectZipPath;
    public String iconPath;
    public String message;
    public int status_code;

    /* JADX WARN: Multi-variable type inference failed */
    public AddCustomizedEffectResponse() {
        this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.XDH
    public AddCustomizedEffectResponse getResponseData() {
        return this;
    }

    @Override // X.XDH
    public String getResponseMessage() {
        return getMessage();
    }

    @Override // X.XDH
    public int getStatusCode() {
        return getStatus_code();
    }

    public String getEffectZipPath() {
        return this.effectZipPath;
    }

    public String getIconPath() {
        return this.iconPath;
    }

    public String getMessage() {
        return this.message;
    }

    @Override // X.XDH
    public /* bridge */ /* synthetic */ AddCustomizedEffectResponse getResponseData() {
        getResponseData();
        return this;
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public void setEffectZipPath(String str) {
        this.effectZipPath = str;
    }

    public void setIconPath(String str) {
        this.iconPath = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public AddCustomizedEffectResponse(int i, String str, String str2, String str3) {
        this.status_code = i;
        this.message = str;
        this.effectZipPath = str2;
        this.iconPath = str3;
    }

    public /* synthetic */ AddCustomizedEffectResponse(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3);
    }
}
