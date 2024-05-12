package com.bytedance.ies.ugc.aweme.commercialize.compliance.advertiser;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class AdvertiserModel implements Serializable {

    @InterfaceC65349Pkn("adv_id")
    public String advId;

    @InterfaceC65349Pkn("adv_name")
    public String advName;

    @InterfaceC65349Pkn("status")
    public Integer advStatus;
    public Boolean advType;

    @InterfaceC65349Pkn("adv_website")
    public String advWebsite;

    /* JADX WARN: Multi-variable type inference failed */
    public AdvertiserModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final String getAdvId() {
        return this.advId;
    }

    public final String getAdvName() {
        return this.advName;
    }

    public final Integer getAdvStatus() {
        return this.advStatus;
    }

    public final Boolean getAdvType() {
        return this.advType;
    }

    public final String getAdvWebsite() {
        return this.advWebsite;
    }

    public final void setAdvId(String str) {
        this.advId = str;
    }

    public final void setAdvName(String str) {
        this.advName = str;
    }

    public final void setAdvStatus(Integer num) {
        this.advStatus = num;
    }

    public final void setAdvType(Boolean bool) {
        this.advType = bool;
    }

    public final void setAdvWebsite(String str) {
        this.advWebsite = str;
    }

    public AdvertiserModel(String str, String str2, String str3, Integer num, Boolean bool) {
        this.advId = str;
        this.advName = str2;
        this.advWebsite = str3;
        this.advStatus = num;
        this.advType = bool;
    }

    public /* synthetic */ AdvertiserModel(String str, String str2, String str3, Integer num, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? num : null, (i & 16) != 0 ? Boolean.FALSE : bool);
    }
}
