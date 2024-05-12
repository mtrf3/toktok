package com.ss.ugc.effectplatform.model.net;

import X.C78966Uyw;
import X.XDH;
import com.ss.ugc.effectplatform.model.GifProviderEffectModel;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class GifProviderEffectListResponse extends XDH<GifProviderEffectModel> {
    public GifProviderEffectModel data;
    public String message;
    public int status_code;

    /* JADX WARN: Multi-variable type inference failed */
    public GifProviderEffectListResponse() {
        this(null, 0 == true ? 1 : 0, 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ GifProviderEffectListResponse copy$default(GifProviderEffectListResponse gifProviderEffectListResponse, GifProviderEffectModel gifProviderEffectModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            gifProviderEffectModel = gifProviderEffectListResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = gifProviderEffectListResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = gifProviderEffectListResponse.status_code;
        }
        return gifProviderEffectListResponse.copy(gifProviderEffectModel, str, i);
    }

    private Object[] getObjects() {
        return new Object[]{this.data, this.message, Integer.valueOf(this.status_code)};
    }

    public final GifProviderEffectListResponse copy(GifProviderEffectModel gifProviderEffectModel, String str, int i) {
        return new GifProviderEffectListResponse(gifProviderEffectModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GifProviderEffectListResponse) {
            return C78966Uyw.LJIIIZ(((GifProviderEffectListResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("GifProviderEffectListResponse:%s,%s,%s", getObjects());
    }

    public final GifProviderEffectModel getData() {
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
    public GifProviderEffectModel getResponseData() {
        return this.data;
    }

    public final void setData(GifProviderEffectModel gifProviderEffectModel) {
        this.data = gifProviderEffectModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public GifProviderEffectListResponse(GifProviderEffectModel gifProviderEffectModel, String str, int i) {
        this.data = gifProviderEffectModel;
        this.message = str;
        this.status_code = i;
    }

    public /* synthetic */ GifProviderEffectListResponse(GifProviderEffectModel gifProviderEffectModel, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : gifProviderEffectModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
