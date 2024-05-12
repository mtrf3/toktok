package com.ss.ugc.effectplatform.model.net;

import X.C78966Uyw;
import X.XDH;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class ProviderEffectDetailResponse extends XDH<ProviderEffect> {
    public ProviderEffect data;
    public String message;
    public int status_code;

    /* JADX WARN: Multi-variable type inference failed */
    public ProviderEffectDetailResponse() {
        this(null, 0 == true ? 1 : 0, 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ProviderEffectDetailResponse copy$default(ProviderEffectDetailResponse providerEffectDetailResponse, ProviderEffect providerEffect, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            providerEffect = providerEffectDetailResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = providerEffectDetailResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = providerEffectDetailResponse.status_code;
        }
        return providerEffectDetailResponse.copy(providerEffect, str, i);
    }

    private Object[] getObjects() {
        return new Object[]{this.data, this.message, Integer.valueOf(this.status_code)};
    }

    public final ProviderEffectDetailResponse copy(ProviderEffect providerEffect, String str, int i) {
        return new ProviderEffectDetailResponse(providerEffect, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProviderEffectDetailResponse) {
            return C78966Uyw.LJIIIZ(((ProviderEffectDetailResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("ProviderEffectDetailResponse:%s,%s,%s", getObjects());
    }

    public final ProviderEffect getData() {
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
    public ProviderEffect getResponseData() {
        return this.data;
    }

    public final void setData(ProviderEffect providerEffect) {
        this.data = providerEffect;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public ProviderEffectDetailResponse(ProviderEffect providerEffect, String str, int i) {
        this.data = providerEffect;
        this.message = str;
        this.status_code = i;
    }

    public /* synthetic */ ProviderEffectDetailResponse(ProviderEffect providerEffect, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : providerEffect, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
