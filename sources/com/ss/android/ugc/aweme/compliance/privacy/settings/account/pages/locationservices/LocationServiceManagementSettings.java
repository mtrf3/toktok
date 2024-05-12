package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices;

import X.C79062V1e;
import X.HH1;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LocationServiceManagementSettings {
    public static final LocationServiceManagementModel LIZ = new LocationServiceManagementModel("account-and-privacy/account-privacy-settings/location-services-on-tiktok", "https://support.tiktok.com", "account-and-privacy/account-privacy-settings/location-services-on-tiktok#3");

    /* loaded from: classes4.dex */
    public static final class LocationServiceManagementModel {

        @InterfaceC65349Pkn("center_location_path")
        public final String centerLocationPath;

        @InterfaceC65349Pkn("center_path")
        public final String centerPath;

        @InterfaceC65349Pkn("domain")
        public final String domain;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocationServiceManagementModel)) {
                return false;
            }
            LocationServiceManagementModel locationServiceManagementModel = (LocationServiceManagementModel) obj;
            return o.LJ(this.centerPath, locationServiceManagementModel.centerPath) && o.LJ(this.domain, locationServiceManagementModel.domain) && o.LJ(this.centerLocationPath, locationServiceManagementModel.centerLocationPath);
        }

        public final int hashCode() {
            return this.centerLocationPath.hashCode() + C79062V1e.LJ(this.domain, this.centerPath.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LocationServiceManagementModel(centerPath=");
            LIZ.append(this.centerPath);
            LIZ.append(", domain=");
            LIZ.append(this.domain);
            LIZ.append(", centerLocationPath=");
            return q.LIZIZ(LIZ, this.centerLocationPath, ')', LIZ);
        }

        public LocationServiceManagementModel(String str, String str2, String str3) {
            HH1.LIZ(str, "centerPath", str2, "domain", str3, "centerLocationPath");
            this.centerPath = str;
            this.domain = str2;
            this.centerLocationPath = str3;
        }
    }
}
