package com.ss.ugc.effectplatform.model.net;

import X.C78966Uyw;
import X.XDH;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class UpdateUseEffectResponse extends XDH {
    public String message;
    public int status_code;

    /* JADX WARN: Multi-variable type inference failed */
    public UpdateUseEffectResponse() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UpdateUseEffectResponse copy$default(UpdateUseEffectResponse updateUseEffectResponse, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = updateUseEffectResponse.message;
        }
        if ((i2 & 2) != 0) {
            i = updateUseEffectResponse.status_code;
        }
        return updateUseEffectResponse.copy(str, i);
    }

    private Object[] getObjects() {
        return new Object[]{this.message, Integer.valueOf(this.status_code)};
    }

    @Override // X.XDH
    public boolean checkValue() {
        return true;
    }

    public final UpdateUseEffectResponse copy(String str, int i) {
        return new UpdateUseEffectResponse(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateUseEffectResponse) {
            return C78966Uyw.LJIIIZ(((UpdateUseEffectResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    @Override // X.XDH
    public Void getResponseData() {
        return null;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("UpdateUseEffectResponse:%s,%s", getObjects());
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

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public UpdateUseEffectResponse(String str, int i) {
        this.message = str;
        this.status_code = i;
    }

    public /* synthetic */ UpdateUseEffectResponse(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i);
    }
}
