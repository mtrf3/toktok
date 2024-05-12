package com.ss.ugc.effectplatform.model.net;

import X.C78966Uyw;
import X.XDH;
import com.ss.ugc.effectplatform.model.EffectChannelModel;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class EffectNetListResponse extends XDH<EffectChannelModel> {
    public EffectChannelModel data;
    public String message;
    public int status_code;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectNetListResponse() {
        this(null, 0 == true ? 1 : 0, 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EffectNetListResponse copy$default(EffectNetListResponse effectNetListResponse, EffectChannelModel effectChannelModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            effectChannelModel = effectNetListResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = effectNetListResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = effectNetListResponse.status_code;
        }
        return effectNetListResponse.copy(effectChannelModel, str, i);
    }

    private Object[] getObjects() {
        return new Object[]{this.data, this.message, Integer.valueOf(this.status_code)};
    }

    public final EffectNetListResponse copy(EffectChannelModel effectChannelModel, String str, int i) {
        return new EffectNetListResponse(effectChannelModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EffectNetListResponse) {
            return C78966Uyw.LJIIIZ(((EffectNetListResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("EffectNetListResponse:%s,%s,%s", getObjects());
    }

    @Override // X.XDH
    public boolean checkValue() {
        EffectChannelModel effectChannelModel = this.data;
        if (effectChannelModel != null) {
            return effectChannelModel.checkValued();
        }
        return false;
    }

    public final EffectChannelModel getData() {
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
    public EffectChannelModel getResponseData() {
        return this.data;
    }

    public final void setData(EffectChannelModel effectChannelModel) {
        this.data = effectChannelModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public EffectNetListResponse(EffectChannelModel effectChannelModel, String str, int i) {
        this.data = effectChannelModel;
        this.message = str;
        this.status_code = i;
    }

    public /* synthetic */ EffectNetListResponse(EffectChannelModel effectChannelModel, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : effectChannelModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
