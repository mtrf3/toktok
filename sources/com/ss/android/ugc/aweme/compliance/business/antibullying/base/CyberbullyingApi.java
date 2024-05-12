package com.ss.android.ugc.aweme.compliance.business.antibullying.base;

import X.AbstractC73672Svk;
import X.C78920UyC;
import X.E8L;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64986Pew;
import X.InterfaceC64987Pex;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public interface CyberbullyingApi {
    @E8L("/tiktok/comment/cyberbullying/get_settings/v1")
    AbstractC73672Svk<CyberBullyingSettingsResp> getCyberBullyingSettings();

    @E8L("/tiktok/comment/cyberbullying/get_settings/v1")
    AbstractC73672Svk<CyberBullyingSettingsResp> getCyberBullyingSettings(@InterfaceC64986Pew("aweme_id") String str);

    @E8M("/tiktok/comment/cyberbullying/update_settings/v1")
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse> updateCyberBullyingSettings(@InterfaceC64987Pex("aweme_id") String str, @InterfaceC64987Pex("filter_unfriendly_user_comments") boolean z, @InterfaceC64987Pex("filter_stranger_comments") boolean z2, @InterfaceC64987Pex("care_mode") boolean z3);

    @E8M("/tiktok/comment/cyberbullying/update_settings/v1")
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse> updateCyberBullyingSettings(@InterfaceC64987Pex("care_mode") boolean z);

    /* loaded from: classes8.dex */
    public static final class CyberBullyingSettingsResp extends BaseResponse {

        @InterfaceC65349Pkn("care_mode")
        public final Boolean careMode;

        @InterfaceC65349Pkn("filter_stranger_comments")
        public final Boolean filterStrangerComments;

        @InterfaceC65349Pkn("filter_unfriendly_user_comments")
        public final Boolean filterUnfriendlyUserComments;

        @InterfaceC65349Pkn("has_update_bullying_settings")
        public final Boolean hasUpdateBullyingSettings;

        /* JADX WARN: Multi-variable type inference failed */
        public CyberBullyingSettingsResp() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CyberBullyingSettingsResp)) {
                return false;
            }
            CyberBullyingSettingsResp cyberBullyingSettingsResp = (CyberBullyingSettingsResp) obj;
            return o.LJ(this.hasUpdateBullyingSettings, cyberBullyingSettingsResp.hasUpdateBullyingSettings) && o.LJ(this.filterUnfriendlyUserComments, cyberBullyingSettingsResp.filterUnfriendlyUserComments) && o.LJ(this.filterStrangerComments, cyberBullyingSettingsResp.filterStrangerComments) && o.LJ(this.careMode, cyberBullyingSettingsResp.careMode);
        }

        public final int hashCode() {
            Boolean bool = this.hasUpdateBullyingSettings;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.filterUnfriendlyUserComments;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.filterStrangerComments;
            int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.careMode;
            return hashCode3 + (bool4 != null ? bool4.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CyberBullyingSettingsResp(hasUpdateBullyingSettings=");
            LIZ.append(this.hasUpdateBullyingSettings);
            LIZ.append(", filterUnfriendlyUserComments=");
            LIZ.append(this.filterUnfriendlyUserComments);
            LIZ.append(", filterStrangerComments=");
            LIZ.append(this.filterStrangerComments);
            LIZ.append(", careMode=");
            return C78920UyC.LIZIZ(LIZ, this.careMode, ')', LIZ);
        }

        public CyberBullyingSettingsResp(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
            this.hasUpdateBullyingSettings = bool;
            this.filterUnfriendlyUserComments = bool2;
            this.filterStrangerComments = bool3;
            this.careMode = bool4;
        }

        public /* synthetic */ CyberBullyingSettingsResp(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : bool4);
        }
    }
}
