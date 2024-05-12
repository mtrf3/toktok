package com.ss.ugc.effectplatform.model.net;

import X.C78966Uyw;
import X.XDH;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class InfoStickerListResponse extends XDH<InfoStickerListResponse> {
    public InfoStickerListModel data;
    public String message;
    public int status_code;

    /* JADX WARN: Multi-variable type inference failed */
    public InfoStickerListResponse() {
        this(null, 0 == true ? 1 : 0, 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ InfoStickerListResponse copy$default(InfoStickerListResponse infoStickerListResponse, InfoStickerListModel infoStickerListModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            infoStickerListModel = infoStickerListResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = infoStickerListResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = infoStickerListResponse.status_code;
        }
        return infoStickerListResponse.copy(infoStickerListModel, str, i);
    }

    private Object[] getObjects() {
        return new Object[]{this.data, this.message, Integer.valueOf(this.status_code)};
    }

    public final InfoStickerListResponse copy(InfoStickerListModel infoStickerListModel, String str, int i) {
        return new InfoStickerListResponse(infoStickerListModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InfoStickerListResponse) {
            return C78966Uyw.LJIIIZ(((InfoStickerListResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.XDH
    public InfoStickerListResponse getResponseData() {
        return this;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("InfoStickerListResponse:%s,%s,%s", getObjects());
    }

    public final InfoStickerListModel getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // X.XDH
    public /* bridge */ /* synthetic */ InfoStickerListResponse getResponseData() {
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

    public final void setData(InfoStickerListModel infoStickerListModel) {
        this.data = infoStickerListModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public InfoStickerListResponse(InfoStickerListModel infoStickerListModel, String str, int i) {
        this.data = infoStickerListModel;
        this.message = str;
        this.status_code = i;
    }

    public /* synthetic */ InfoStickerListResponse(InfoStickerListModel infoStickerListModel, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : infoStickerListModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
