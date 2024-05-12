package com.ss.ugc.effectplatform.model.net;

import X.C78966Uyw;
import X.XDH;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class QueryInfoStickerResponse extends XDH<QueryInfoStickerResponse> {
    public QueryInfoStickerListModel data;
    public String message;
    public int status_code;

    /* JADX WARN: Multi-variable type inference failed */
    public QueryInfoStickerResponse() {
        this(null, 0 == true ? 1 : 0, 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ QueryInfoStickerResponse copy$default(QueryInfoStickerResponse queryInfoStickerResponse, QueryInfoStickerListModel queryInfoStickerListModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            queryInfoStickerListModel = queryInfoStickerResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = queryInfoStickerResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = queryInfoStickerResponse.status_code;
        }
        return queryInfoStickerResponse.copy(queryInfoStickerListModel, str, i);
    }

    private Object[] getObjects() {
        return new Object[]{this.data, this.message, Integer.valueOf(this.status_code)};
    }

    public final QueryInfoStickerResponse copy(QueryInfoStickerListModel queryInfoStickerListModel, String str, int i) {
        return new QueryInfoStickerResponse(queryInfoStickerListModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QueryInfoStickerResponse) {
            return C78966Uyw.LJIIIZ(((QueryInfoStickerResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.XDH
    public QueryInfoStickerResponse getResponseData() {
        return this;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("QueryInfoStickerResponse:%s,%s,%s", getObjects());
    }

    public final QueryInfoStickerListModel getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // X.XDH
    public /* bridge */ /* synthetic */ QueryInfoStickerResponse getResponseData() {
        getResponseData();
        return this;
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

    public final void setData(QueryInfoStickerListModel queryInfoStickerListModel) {
        this.data = queryInfoStickerListModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public QueryInfoStickerResponse(QueryInfoStickerListModel queryInfoStickerListModel, String str, int i) {
        this.data = queryInfoStickerListModel;
        this.message = str;
        this.status_code = i;
    }

    public /* synthetic */ QueryInfoStickerResponse(QueryInfoStickerListModel queryInfoStickerListModel, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : queryInfoStickerListModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
