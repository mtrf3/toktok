package com.ss.ugc.effectplatform.model.net;

import X.C78966Uyw;
import X.XDH;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PanelInfoPagingCheckedResponse extends XDH<PanelInfoModel> {
    public CategoryEffectListResponse CategoryEffectsResponse;
    public PanelInfoCheckedResponse PanelInfoResponse;
    public String message;
    public int status_code;

    /* JADX WARN: Multi-variable type inference failed */
    public PanelInfoPagingCheckedResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PanelInfoPagingCheckedResponse copy$default(PanelInfoPagingCheckedResponse panelInfoPagingCheckedResponse, PanelInfoCheckedResponse panelInfoCheckedResponse, CategoryEffectListResponse categoryEffectListResponse, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            panelInfoCheckedResponse = panelInfoPagingCheckedResponse.PanelInfoResponse;
        }
        if ((i2 & 2) != 0) {
            categoryEffectListResponse = panelInfoPagingCheckedResponse.CategoryEffectsResponse;
        }
        if ((i2 & 4) != 0) {
            str = panelInfoPagingCheckedResponse.message;
        }
        if ((i2 & 8) != 0) {
            i = panelInfoPagingCheckedResponse.status_code;
        }
        return panelInfoPagingCheckedResponse.copy(panelInfoCheckedResponse, categoryEffectListResponse, str, i);
    }

    private Object[] getObjects() {
        return new Object[]{this.PanelInfoResponse, this.CategoryEffectsResponse, this.message, Integer.valueOf(this.status_code)};
    }

    public final PanelInfoPagingCheckedResponse copy(PanelInfoCheckedResponse panelInfoCheckedResponse, CategoryEffectListResponse categoryEffectListResponse, String str, int i) {
        return new PanelInfoPagingCheckedResponse(panelInfoCheckedResponse, categoryEffectListResponse, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PanelInfoPagingCheckedResponse) {
            return C78966Uyw.LJIIIZ(((PanelInfoPagingCheckedResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("PanelInfoPagingCheckedResponse:%s,%s,%s,%s", getObjects());
    }

    @Override // X.XDH
    public boolean checkValue() {
        PanelInfoCheckedResponse panelInfoCheckedResponse;
        PanelInfoCheckedResponse panelInfoCheckedResponse2 = this.PanelInfoResponse;
        if (panelInfoCheckedResponse2 == null) {
            return false;
        }
        if (o.LJ(panelInfoCheckedResponse2.getUpdated(), Boolean.TRUE) && ((panelInfoCheckedResponse = this.PanelInfoResponse) == null || panelInfoCheckedResponse.getData() == null)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.XDH
    public PanelInfoModel getResponseData() {
        return new PanelInfoPagingCheckedModel(this.PanelInfoResponse, this.CategoryEffectsResponse).getPanelInfo();
    }

    public final CategoryEffectListResponse getCategoryEffectsResponse() {
        return this.CategoryEffectsResponse;
    }

    public final PanelInfoCheckedResponse getPanelInfoResponse() {
        return this.PanelInfoResponse;
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

    public final void setCategoryEffectsResponse(CategoryEffectListResponse categoryEffectListResponse) {
        this.CategoryEffectsResponse = categoryEffectListResponse;
    }

    public final void setPanelInfoResponse(PanelInfoCheckedResponse panelInfoCheckedResponse) {
        this.PanelInfoResponse = panelInfoCheckedResponse;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public PanelInfoPagingCheckedResponse(PanelInfoCheckedResponse panelInfoCheckedResponse, CategoryEffectListResponse categoryEffectListResponse, String str, int i) {
        this.PanelInfoResponse = panelInfoCheckedResponse;
        this.CategoryEffectsResponse = categoryEffectListResponse;
        this.message = str;
        this.status_code = i;
    }

    public /* synthetic */ PanelInfoPagingCheckedResponse(PanelInfoCheckedResponse panelInfoCheckedResponse, CategoryEffectListResponse categoryEffectListResponse, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : panelInfoCheckedResponse, (i2 & 2) != 0 ? null : categoryEffectListResponse, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? 0 : i);
    }
}
