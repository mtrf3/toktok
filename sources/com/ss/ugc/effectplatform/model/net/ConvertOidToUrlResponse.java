package com.ss.ugc.effectplatform.model.net;

import X.XDH;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public class ConvertOidToUrlResponse extends XDH<ConvertOidToUrlResponse> {
    public int status_code;
    public String status_msg;
    public List<? extends ResourceUrl> url_list;

    /* JADX WARN: Multi-variable type inference failed */
    public ConvertOidToUrlResponse() {
        this(null, 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.XDH
    public ConvertOidToUrlResponse getResponseData() {
        return this;
    }

    @Override // X.XDH
    public String getResponseMessage() {
        return getStatus_msg();
    }

    @Override // X.XDH
    public int getStatusCode() {
        return getStatus_code();
    }

    @Override // X.XDH
    public /* bridge */ /* synthetic */ ConvertOidToUrlResponse getResponseData() {
        getResponseData();
        return this;
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public String getStatus_msg() {
        return this.status_msg;
    }

    public List<ResourceUrl> getUrl_list() {
        return this.url_list;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public void setStatus_msg(String str) {
        this.status_msg = str;
    }

    public void setUrl_list(List<? extends ResourceUrl> list) {
        this.url_list = list;
    }

    public ConvertOidToUrlResponse(List<? extends ResourceUrl> list, int i, String str) {
        this.url_list = list;
        this.status_code = i;
        this.status_msg = str;
    }

    public /* synthetic */ ConvertOidToUrlResponse(List list, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str);
    }
}
