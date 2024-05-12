package com.ss.ugc.effectplatform.model.net;

import X.XDH;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public class SearchEffectResponseV2 extends XDH<SearchEffectResponseV2> {
    public SearchEffectModel data;
    public String message;
    public SearchNilInfo search_nil_info;
    public int status_code;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchEffectResponseV2() {
        this(null, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.XDH
    public SearchEffectResponseV2 getResponseData() {
        return this;
    }

    @Override // X.XDH
    public boolean checkValue() {
        if (this.data != null) {
            return true;
        }
        return false;
    }

    public final SearchEffectModel getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // X.XDH
    public /* bridge */ /* synthetic */ SearchEffectResponseV2 getResponseData() {
        getResponseData();
        return this;
    }

    @Override // X.XDH
    public String getResponseMessage() {
        return this.message;
    }

    public final SearchNilInfo getSearch_nil_info() {
        return this.search_nil_info;
    }

    @Override // X.XDH
    public int getStatusCode() {
        return this.status_code;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final void setData(SearchEffectModel searchEffectModel) {
        this.data = searchEffectModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setSearch_nil_info(SearchNilInfo searchNilInfo) {
        this.search_nil_info = searchNilInfo;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public SearchEffectResponseV2(SearchEffectModel searchEffectModel, SearchNilInfo searchNilInfo, int i, String str) {
        this.data = searchEffectModel;
        this.search_nil_info = searchNilInfo;
        this.status_code = i;
        this.message = str;
    }

    public /* synthetic */ SearchEffectResponseV2(SearchEffectModel searchEffectModel, SearchNilInfo searchNilInfo, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : searchEffectModel, (i2 & 2) != 0 ? null : searchNilInfo, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : str);
    }
}
