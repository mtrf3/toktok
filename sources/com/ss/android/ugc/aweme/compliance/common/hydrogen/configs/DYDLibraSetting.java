package com.ss.android.ugc.aweme.compliance.common.hydrogen.configs;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class DYDLibraSetting {
    public static final DYDSettingModel LIZ = new DYDSettingModel(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);

    /* loaded from: classes11.dex */
    public static final class DYDSettingModel {

        @InterfaceC65349Pkn("dyd_guest_download")
        public final String dydGuestDownload;

        @InterfaceC65349Pkn("dyd_guest_uri")
        public final String dydGuestUri;

        @InterfaceC65349Pkn("dyd_main_uri")
        public final String dydMainUri;

        @InterfaceC65349Pkn("dyd_unregistered_user")
        public final String dydUnregistered;

        @InterfaceC65349Pkn("dyd_unregistered_user_download")
        public final String dydUnregisteredDownload;

        /* JADX WARN: Multi-variable type inference failed */
        public DYDSettingModel() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DYDSettingModel)) {
                return false;
            }
            DYDSettingModel dYDSettingModel = (DYDSettingModel) obj;
            return o.LJ(this.dydGuestDownload, dYDSettingModel.dydGuestDownload) && o.LJ(this.dydGuestUri, dYDSettingModel.dydGuestUri) && o.LJ(this.dydMainUri, dYDSettingModel.dydMainUri) && o.LJ(this.dydUnregistered, dYDSettingModel.dydUnregistered) && o.LJ(this.dydUnregisteredDownload, dYDSettingModel.dydUnregisteredDownload);
        }

        public final int hashCode() {
            String str = this.dydGuestDownload;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.dydGuestUri;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.dydMainUri;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.dydUnregistered;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.dydUnregisteredDownload;
            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DYDSettingModel(dydGuestDownload=");
            LIZ.append(this.dydGuestDownload);
            LIZ.append(", dydGuestUri=");
            LIZ.append(this.dydGuestUri);
            LIZ.append(", dydMainUri=");
            LIZ.append(this.dydMainUri);
            LIZ.append(", dydUnregistered=");
            LIZ.append(this.dydUnregistered);
            LIZ.append(", dydUnregisteredDownload=");
            return q.LIZIZ(LIZ, this.dydUnregisteredDownload, ')', LIZ);
        }

        public DYDSettingModel(String str, String str2, String str3, String str4, String str5) {
            this.dydGuestDownload = str;
            this.dydGuestUri = str2;
            this.dydMainUri = str3;
            this.dydUnregistered = str4;
            this.dydUnregisteredDownload = str5;
        }

        public /* synthetic */ DYDSettingModel(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) == 0 ? str5 : null);
        }
    }
}
