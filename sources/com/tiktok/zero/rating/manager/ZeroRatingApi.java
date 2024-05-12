package com.tiktok.zero.rating.manager;

import X.C08380Uo;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.E8L;
import X.E8M;
import X.EKC;
import X.F7M;
import X.F7Q;
import X.InterfaceC30951CCt;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;
import X.InterfaceC65349Pkn;
import X.InterfaceC74236TBo;
import X.TBT;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ZeroRatingApi {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZ;
    public static final C62822Ol8 LIZIZ;
    public static final C62822Ol8 LIZJ;
    public static final ZeroRatingApi LIZLLL;

    /* loaded from: classes7.dex */
    public interface FetchMsisdnApi {
        @E8L("/tiktok/v1/fetch_msisdn")
        @EKC({"x-metasec-bypass-ttnet-features: 1", "User-Agent: custom", "X-SS-No-Cookie: true"})
        InterfaceC37276Ek4<FetchMsisdnResponse> fetchMsisdn(@InterfaceC64986Pew("mcc_mnc_hash") String str, @InterfaceC30951CCt boolean z);
    }

    /* loaded from: classes7.dex */
    public interface MsisdnBindingApi {
        @E8M("/tiktok/v1/carrier_common")
        InterfaceC37276Ek4<CarrierCommonResponse> bindingMsisdn(@InterfaceC64986Pew("mcc_mnc") String str, @InterfaceC64986Pew("encrypted_msisdn") String str2, @InterfaceC64986Pew("masked_msisdn") String str3);
    }

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(ZeroRatingApi.class), "fetchMsisdnApi", "getFetchMsisdnApi()Lcom/tiktok/zero/rating/manager/ZeroRatingApi$FetchMsisdnApi;");
        C65352Pkq.LIZ.getClass();
        LIZ = new InterfaceC74236TBo[]{tbt, new TBT(C65352Pkq.LIZ(ZeroRatingApi.class), "bindingMsisdnApi", "getBindingMsisdnApi()Lcom/tiktok/zero/rating/manager/ZeroRatingApi$MsisdnBindingApi;")};
        LIZLLL = new ZeroRatingApi();
        LIZIZ = C221108m2.LIZIZ(F7M.LJLIL);
        LIZJ = C221108m2.LIZIZ(F7Q.LJLIL);
    }

    /* loaded from: classes7.dex */
    public static final class CarrierCommonResponse {

        @InterfaceC65349Pkn("cooling_interval")
        public final int coolingInterval;

        @InterfaceC65349Pkn("display_level")
        public final int displayLevel;

        @InterfaceC65349Pkn("masked_msisdn")
        public final String maskedMsisdn;

        @InterfaceC65349Pkn("status_code")
        public final int statusCode;

        @InterfaceC65349Pkn("status_msg")
        public final String statusMsg;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CarrierCommonResponse)) {
                return false;
            }
            CarrierCommonResponse carrierCommonResponse = (CarrierCommonResponse) obj;
            return this.statusCode == carrierCommonResponse.statusCode && o.LJ(this.statusMsg, carrierCommonResponse.statusMsg) && o.LJ(this.maskedMsisdn, carrierCommonResponse.maskedMsisdn) && this.coolingInterval == carrierCommonResponse.coolingInterval && this.displayLevel == carrierCommonResponse.displayLevel;
        }

        public final int hashCode() {
            int i = this.statusCode * 31;
            String str = this.statusMsg;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.maskedMsisdn;
            return ((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.coolingInterval) * 31) + this.displayLevel;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CarrierCommonResponse(statusCode=");
            LIZ.append(this.statusCode);
            LIZ.append(", statusMsg=");
            LIZ.append(this.statusMsg);
            LIZ.append(", maskedMsisdn=");
            LIZ.append(this.maskedMsisdn);
            LIZ.append(", coolingInterval=");
            LIZ.append(this.coolingInterval);
            LIZ.append(", displayLevel=");
            return C08380Uo.LIZ(LIZ, this.displayLevel, ")", LIZ);
        }

        public CarrierCommonResponse(int i, String str, String str2, int i2, int i3) {
            this.statusCode = i;
            this.statusMsg = str;
            this.maskedMsisdn = str2;
            this.coolingInterval = i2;
            this.displayLevel = i3;
        }
    }

    /* loaded from: classes7.dex */
    public static final class FetchMsisdnResponse {

        @InterfaceC65349Pkn("cooling_interval")
        public final int coolingInterval;

        @InterfaceC65349Pkn("encrypted_msisdn")
        public final String encryptedMsisdn;

        @InterfaceC65349Pkn("masked_msisdn")
        public final String maskedMsisdn;

        @InterfaceC65349Pkn("status_code")
        public final int statusCode;

        @InterfaceC65349Pkn("status_msg")
        public final String statusMsg;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FetchMsisdnResponse)) {
                return false;
            }
            FetchMsisdnResponse fetchMsisdnResponse = (FetchMsisdnResponse) obj;
            return this.statusCode == fetchMsisdnResponse.statusCode && o.LJ(this.statusMsg, fetchMsisdnResponse.statusMsg) && o.LJ(this.encryptedMsisdn, fetchMsisdnResponse.encryptedMsisdn) && o.LJ(this.maskedMsisdn, fetchMsisdnResponse.maskedMsisdn) && this.coolingInterval == fetchMsisdnResponse.coolingInterval;
        }

        public final int hashCode() {
            int i = this.statusCode * 31;
            String str = this.statusMsg;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.encryptedMsisdn;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.maskedMsisdn;
            return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.coolingInterval;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FetchMsisdnResponse(statusCode=");
            LIZ.append(this.statusCode);
            LIZ.append(", statusMsg=");
            LIZ.append(this.statusMsg);
            LIZ.append(", encryptedMsisdn=");
            LIZ.append(this.encryptedMsisdn);
            LIZ.append(", maskedMsisdn=");
            LIZ.append(this.maskedMsisdn);
            LIZ.append(", coolingInterval=");
            return C08380Uo.LIZ(LIZ, this.coolingInterval, ")", LIZ);
        }

        public FetchMsisdnResponse(int i, String str, String str2, String str3, int i2) {
            this.statusCode = i;
            this.statusMsg = str;
            this.encryptedMsisdn = str2;
            this.maskedMsisdn = str3;
            this.coolingInterval = i2;
        }
    }
}
