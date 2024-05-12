package com.ss.ugc.effectplatform.model.net;

import X.C78966Uyw;
import X.XDH;
import com.ss.ugc.effectplatform.model.ProviderEffectModel;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class ProviderEffectListResponse extends XDH<ProviderEffectModel> {
    public ProviderEffectModel data;
    public String message;
    public int status_code;

    /* JADX WARN: Multi-variable type inference failed */
    public ProviderEffectListResponse() {
        this(null, 0 == true ? 1 : 0, 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ProviderEffectListResponse copy$default(ProviderEffectListResponse providerEffectListResponse, ProviderEffectModel providerEffectModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            providerEffectModel = providerEffectListResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = providerEffectListResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = providerEffectListResponse.status_code;
        }
        return providerEffectListResponse.copy(providerEffectModel, str, i);
    }

    private Object[] getObjects() {
        return new Object[]{this.data, this.message, Integer.valueOf(this.status_code)};
    }

    public final ProviderEffectListResponse copy(ProviderEffectModel providerEffectModel, String str, int i) {
        return new ProviderEffectListResponse(providerEffectModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProviderEffectListResponse) {
            return C78966Uyw.LJIIIZ(((ProviderEffectListResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("ProviderEffectListResponse:%s,%s,%s", getObjects());
    }

    public final ProviderEffectModel getData() {
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
    public ProviderEffectModel getResponseData() {
        return this.data;
    }

    public final void setData(ProviderEffectModel providerEffectModel) {
        this.data = providerEffectModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public ProviderEffectListResponse(ProviderEffectModel providerEffectModel, String str, int i) {
        this.data = providerEffectModel;
        this.message = str;
        this.status_code = i;
    }

    public /* synthetic */ ProviderEffectListResponse(ProviderEffectModel providerEffectModel, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : providerEffectModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
