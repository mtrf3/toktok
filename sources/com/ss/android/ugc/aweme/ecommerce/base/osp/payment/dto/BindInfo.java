package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BindInfo {

    @InterfaceC65349Pkn("bind_status")
    public final String bindStatus;

    @InterfaceC65349Pkn("button_text")
    public final String buttonText;

    @InterfaceC65349Pkn("is_need_pre_fetch_activate_url")
    public final Boolean needPrefetchActivateUrl;

    @InterfaceC65349Pkn("note")
    public final String note;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("supported_bind_commute_types")
    public final List<CommuteInfo> supportedBindCommuteTypes;

    @InterfaceC65349Pkn("title")
    public final String title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindInfo)) {
            return false;
        }
        BindInfo bindInfo = (BindInfo) obj;
        return o.LJ(this.buttonText, bindInfo.buttonText) && o.LJ(this.note, bindInfo.note) && o.LJ(this.title, bindInfo.title) && o.LJ(this.schema, bindInfo.schema) && o.LJ(this.bindStatus, bindInfo.bindStatus) && o.LJ(this.needPrefetchActivateUrl, bindInfo.needPrefetchActivateUrl) && o.LJ(this.supportedBindCommuteTypes, bindInfo.supportedBindCommuteTypes);
    }

    public final int hashCode() {
        String str = this.buttonText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.note;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.schema;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bindStatus;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.needPrefetchActivateUrl;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<CommuteInfo> list = this.supportedBindCommuteTypes;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BindInfo(buttonText=");
        LIZ.append(this.buttonText);
        LIZ.append(", note=");
        LIZ.append(this.note);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", schema=");
        LIZ.append(this.schema);
        LIZ.append(", bindStatus=");
        LIZ.append(this.bindStatus);
        LIZ.append(", needPrefetchActivateUrl=");
        LIZ.append(this.needPrefetchActivateUrl);
        LIZ.append(", supportedBindCommuteTypes=");
        return C1NE.LIZIZ(LIZ, this.supportedBindCommuteTypes, ')', LIZ);
    }

    public BindInfo(String str, String str2, String str3, String str4, String str5, Boolean bool, List<CommuteInfo> list) {
        this.buttonText = str;
        this.note = str2;
        this.title = str3;
        this.schema = str4;
        this.bindStatus = str5;
        this.needPrefetchActivateUrl = bool;
        this.supportedBindCommuteTypes = list;
    }
}
