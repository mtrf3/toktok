package com.ss.android.ugc.aweme.account.login.v2.network;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EdmUserPropertiesResponse extends BaseResponse {

    @InterfaceC65349Pkn("data")
    public final Data data;

    /* JADX WARN: Multi-variable type inference failed */
    public EdmUserPropertiesResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EdmUserPropertiesResponse copy$default(EdmUserPropertiesResponse edmUserPropertiesResponse, Data data, int i, Object obj) {
        if ((i & 1) != 0) {
            data = edmUserPropertiesResponse.data;
        }
        return edmUserPropertiesResponse.copy(data);
    }

    public final EdmUserPropertiesResponse copy(Data data) {
        return new EdmUserPropertiesResponse(data);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EdmUserPropertiesResponse) && o.LJ(this.data, ((EdmUserPropertiesResponse) obj).data);
    }

    public int hashCode() {
        Data data = this.data;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EdmUserPropertiesResponse(data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Data getData() {
        return this.data;
    }

    public EdmUserPropertiesResponse(Data data) {
        this.data = data;
    }

    public /* synthetic */ EdmUserPropertiesResponse(Data data, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : data);
    }
}
