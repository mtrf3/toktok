package com.ss.ugc.effectplatform.model.net;

import X.C78966Uyw;
import X.XDH;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class PanelInfoResponse extends XDH<PanelInfoModel> {
    public PanelInfoModel data;
    public String message;
    public int status_code;

    /* JADX WARN: Multi-variable type inference failed */
    public PanelInfoResponse() {
        this(null, 0 == true ? 1 : 0, 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PanelInfoResponse copy$default(PanelInfoResponse panelInfoResponse, PanelInfoModel panelInfoModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            panelInfoModel = panelInfoResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = panelInfoResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = panelInfoResponse.status_code;
        }
        return panelInfoResponse.copy(panelInfoModel, str, i);
    }

    private Object[] getObjects() {
        return new Object[]{this.data, this.message, Integer.valueOf(this.status_code)};
    }

    public final PanelInfoResponse copy(PanelInfoModel panelInfoModel, String str, int i) {
        return new PanelInfoResponse(panelInfoModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PanelInfoResponse) {
            return C78966Uyw.LJIIIZ(((PanelInfoResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("PanelInfoResponse:%s,%s,%s", getObjects());
    }

    @Override // X.XDH
    public boolean checkValue() {
        if (this.data != null) {
            return true;
        }
        return false;
    }

    public final PanelInfoModel getData() {
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

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.XDH
    public PanelInfoModel getResponseData() {
        return this.data;
    }

    public final void setData(PanelInfoModel panelInfoModel) {
        this.data = panelInfoModel;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public PanelInfoResponse(PanelInfoModel panelInfoModel, String str, int i) {
        this.data = panelInfoModel;
        this.message = str;
        this.status_code = i;
    }

    public /* synthetic */ PanelInfoResponse(PanelInfoModel panelInfoModel, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : panelInfoModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
