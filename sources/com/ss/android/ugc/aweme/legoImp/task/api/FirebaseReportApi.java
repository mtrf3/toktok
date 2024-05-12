package com.ss.android.ugc.aweme.legoImp.task.api;

import X.AbstractC73672Svk;
import X.C79062V1e;
import X.E8M;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FirebaseReportApi {
    public static final IFirebaseReportApi LIZ = (IFirebaseReportApi) RetrofitFactory.LIZLLL().create("https://ug-sg.byteoversea.com").create(IFirebaseReportApi.class);

    /* loaded from: classes7.dex */
    public static final class ForceLoginConfigResponse {

        @InterfaceC65349Pkn("code")
        public final int code;

        @InterfaceC65349Pkn("data")
        public final ForceLoginConfig data;

        @InterfaceC65349Pkn("message")
        public final String message;

        public static /* synthetic */ ForceLoginConfigResponse copy$default(ForceLoginConfigResponse forceLoginConfigResponse, int i, String str, ForceLoginConfig forceLoginConfig, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = forceLoginConfigResponse.code;
            }
            if ((i2 & 2) != 0) {
                str = forceLoginConfigResponse.message;
            }
            if ((i2 & 4) != 0) {
                forceLoginConfig = forceLoginConfigResponse.data;
            }
            return forceLoginConfigResponse.copy(i, str, forceLoginConfig);
        }

        public final ForceLoginConfigResponse copy(int i, String message, ForceLoginConfig data) {
            o.LJIIIZ(message, "message");
            o.LJIIIZ(data, "data");
            return new ForceLoginConfigResponse(i, message, data);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForceLoginConfigResponse)) {
                return false;
            }
            ForceLoginConfigResponse forceLoginConfigResponse = (ForceLoginConfigResponse) obj;
            return this.code == forceLoginConfigResponse.code && o.LJ(this.message, forceLoginConfigResponse.message) && o.LJ(this.data, forceLoginConfigResponse.data);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ForceLoginConfigResponse(code=");
            LIZ.append(this.code);
            LIZ.append(", message=");
            LIZ.append(this.message);
            LIZ.append(", data=");
            LIZ.append(this.data);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public int hashCode() {
            return this.data.hashCode() + C79062V1e.LJ(this.message, this.code * 31, 31);
        }

        public final boolean isSuccess() {
            if (this.code == 200) {
                return true;
            }
            return false;
        }

        public final int getCode() {
            return this.code;
        }

        public final ForceLoginConfig getData() {
            return this.data;
        }

        public final String getMessage() {
            return this.message;
        }

        public ForceLoginConfigResponse(int i, String message, ForceLoginConfig data) {
            o.LJIIIZ(message, "message");
            o.LJIIIZ(data, "data");
            this.code = i;
            this.message = message;
            this.data = data;
        }
    }

    /* loaded from: classes7.dex */
    public interface IFirebaseReportApi {
        @E8M("/user_in_force_login_country/check")
        AbstractC73672Svk<ForceLoginConfigResponse> getUserForceLoginConfig();
    }

    /* loaded from: classes7.dex */
    public static final class ForceLoginConfig {

        @InterfaceC65349Pkn("idc")
        public final String idc;

        @InterfaceC65349Pkn("region")
        public final String region;

        @InterfaceC65349Pkn("user_in_force_login_country")
        public final boolean userInForceLoginCountry;

        /* JADX WARN: Multi-variable type inference failed */
        public ForceLoginConfig() {
            this(false, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ ForceLoginConfig copy$default(ForceLoginConfig forceLoginConfig, boolean z, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = forceLoginConfig.userInForceLoginCountry;
            }
            if ((i & 2) != 0) {
                str = forceLoginConfig.idc;
            }
            if ((i & 4) != 0) {
                str2 = forceLoginConfig.region;
            }
            return forceLoginConfig.copy(z, str, str2);
        }

        public final ForceLoginConfig copy(boolean z, String str, String str2) {
            return new ForceLoginConfig(z, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForceLoginConfig)) {
                return false;
            }
            ForceLoginConfig forceLoginConfig = (ForceLoginConfig) obj;
            return this.userInForceLoginCountry == forceLoginConfig.userInForceLoginCountry && o.LJ(this.idc, forceLoginConfig.idc) && o.LJ(this.region, forceLoginConfig.region);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r0v8 */
        public int hashCode() {
            boolean z = this.userInForceLoginCountry;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            String str = this.idc;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.region;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ForceLoginConfig(userInForceLoginCountry=");
            LIZ.append(this.userInForceLoginCountry);
            LIZ.append(", idc=");
            LIZ.append(this.idc);
            LIZ.append(", region=");
            return q.LIZIZ(LIZ, this.region, ')', LIZ);
        }

        public final String getIdc() {
            return this.idc;
        }

        public final String getRegion() {
            return this.region;
        }

        public final boolean getUserInForceLoginCountry() {
            return this.userInForceLoginCountry;
        }

        public ForceLoginConfig(boolean z, String str, String str2) {
            this.userInForceLoginCountry = z;
            this.idc = str;
            this.region = str2;
        }

        public /* synthetic */ ForceLoginConfig(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
        }
    }
}
