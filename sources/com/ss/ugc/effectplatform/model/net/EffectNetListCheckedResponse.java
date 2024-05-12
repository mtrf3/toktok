package com.ss.ugc.effectplatform.model.net;

import X.C78966Uyw;
import X.XDH;
import com.ss.ugc.effectplatform.model.EffectChannelModel;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class EffectNetListCheckedResponse extends XDH<EffectChannelModel> {
    public EffectChannelModel data;
    public String message;
    public int status_code;
    public Boolean updated;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectNetListCheckedResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EffectNetListCheckedResponse copy$default(EffectNetListCheckedResponse effectNetListCheckedResponse, EffectChannelModel effectChannelModel, String str, Boolean bool, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            effectChannelModel = effectNetListCheckedResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = effectNetListCheckedResponse.message;
        }
        if ((i2 & 4) != 0) {
            bool = effectNetListCheckedResponse.updated;
        }
        if ((i2 & 8) != 0) {
            i = effectNetListCheckedResponse.status_code;
        }
        return effectNetListCheckedResponse.copy(effectChannelModel, str, bool, i);
    }

    private Object[] getObjects() {
        return new Object[]{this.data, this.message, this.updated, Integer.valueOf(this.status_code)};
    }

    public final EffectNetListCheckedResponse copy(EffectChannelModel effectChannelModel, String str, Boolean bool, int i) {
        return new EffectNetListCheckedResponse(effectChannelModel, str, bool, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EffectNetListCheckedResponse) {
            return C78966Uyw.LJIIIZ(((EffectNetListCheckedResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("EffectNetListCheckedResponse:%s,%s,%s,%s", getObjects());
    }

    @Override // X.XDH
    public boolean checkValue() {
        if (!o.LJ(this.updated, Boolean.TRUE) || this.data != null) {
            return true;
        }
        return false;
    }

    public final EffectChannelModel getData() {
        return this.data;
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

    public final Boolean getUpdated() {
        return this.updated;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.XDH
    public EffectChannelModel getResponseData() {
        return this.data;
    }

    public final void setData(EffectChannelModel effectChannelModel) {
        this.data = effectChannelModel;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public final void setUpdated(Boolean bool) {
        this.updated = bool;
    }

    public EffectNetListCheckedResponse(EffectChannelModel effectChannelModel, String str, Boolean bool, int i) {
        this.data = effectChannelModel;
        this.message = str;
        this.updated = bool;
        this.status_code = i;
    }

    public /* synthetic */ EffectNetListCheckedResponse(EffectChannelModel effectChannelModel, String str, Boolean bool, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : effectChannelModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? Boolean.TRUE : bool, (i2 & 8) != 0 ? 0 : i);
    }
}
