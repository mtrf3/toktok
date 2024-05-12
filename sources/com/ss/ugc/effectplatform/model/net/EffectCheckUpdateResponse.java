package com.ss.ugc.effectplatform.model.net;

import X.C78966Uyw;
import X.XDH;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class EffectCheckUpdateResponse extends XDH<Boolean> {
    public String message;
    public int status_code;
    public boolean updated;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectCheckUpdateResponse() {
        this(false, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EffectCheckUpdateResponse copy$default(EffectCheckUpdateResponse effectCheckUpdateResponse, boolean z, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = effectCheckUpdateResponse.updated;
        }
        if ((i2 & 2) != 0) {
            str = effectCheckUpdateResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = effectCheckUpdateResponse.status_code;
        }
        return effectCheckUpdateResponse.copy(z, str, i);
    }

    private Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.updated), this.message, Integer.valueOf(this.status_code)};
    }

    public final EffectCheckUpdateResponse copy(boolean z, String str, int i) {
        return new EffectCheckUpdateResponse(z, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EffectCheckUpdateResponse) {
            return C78966Uyw.LJIIIZ(((EffectCheckUpdateResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("EffectCheckUpdateResponse:%s,%s,%s", getObjects());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.XDH
    public Boolean getResponseData() {
        return Boolean.valueOf(this.updated);
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

    public final boolean getUpdated() {
        return this.updated;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public final void setUpdated(boolean z) {
        this.updated = z;
    }

    public EffectCheckUpdateResponse(boolean z, String str, int i) {
        this.updated = z;
        this.message = str;
        this.status_code = i;
    }

    public /* synthetic */ EffectCheckUpdateResponse(boolean z, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
