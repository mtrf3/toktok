package com.ss.android.ugc.aweme.setting.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class RegionStatus extends BaseResponse implements Serializable {
    public static final int $stable = 0;

    @InterfaceC65349Pkn("is_change_region_enabled")
    public final Boolean enable;

    @InterfaceC65349Pkn("localized_country")
    public final String localizedCountry;

    @InterfaceC65349Pkn("redirect_url")
    public final String redirectUrl;

    @InterfaceC65349Pkn("status_event")
    public final String statusEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public RegionStatus() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RegionStatus copy$default(RegionStatus regionStatus, String str, Boolean bool, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = regionStatus.localizedCountry;
        }
        if ((i & 2) != 0) {
            bool = regionStatus.enable;
        }
        if ((i & 4) != 0) {
            str2 = regionStatus.statusEvent;
        }
        if ((i & 8) != 0) {
            str3 = regionStatus.redirectUrl;
        }
        return regionStatus.copy(str, bool, str2, str3);
    }

    public final RegionStatus copy(String str, Boolean bool, String str2, String str3) {
        return new RegionStatus(str, bool, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegionStatus)) {
            return false;
        }
        RegionStatus regionStatus = (RegionStatus) obj;
        return o.LJ(this.localizedCountry, regionStatus.localizedCountry) && o.LJ(this.enable, regionStatus.enable) && o.LJ(this.statusEvent, regionStatus.statusEvent) && o.LJ(this.redirectUrl, regionStatus.redirectUrl);
    }

    public int hashCode() {
        String str = this.localizedCountry;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.enable;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.statusEvent;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.redirectUrl;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RegionStatus(localizedCountry=");
        LIZ.append(this.localizedCountry);
        LIZ.append(", enable=");
        LIZ.append(this.enable);
        LIZ.append(", statusEvent=");
        LIZ.append(this.statusEvent);
        LIZ.append(", redirectUrl=");
        return q.LIZIZ(LIZ, this.redirectUrl, ')', LIZ);
    }

    public final Boolean getEnable() {
        return this.enable;
    }

    public final String getLocalizedCountry() {
        return this.localizedCountry;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final String getStatusEvent() {
        return this.statusEvent;
    }

    public RegionStatus(String str, Boolean bool, String str2, String str3) {
        this.localizedCountry = str;
        this.enable = bool;
        this.statusEvent = str2;
        this.redirectUrl = str3;
    }

    public /* synthetic */ RegionStatus(String str, Boolean bool, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Boolean.FALSE : bool, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }
}
