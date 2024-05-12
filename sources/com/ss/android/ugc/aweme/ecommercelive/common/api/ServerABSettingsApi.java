package com.ss.android.ugc.aweme.ecommercelive.common.api;

import X.C71018Ru2;
import X.C78920UyC;
import X.E8L;
import X.InterfaceC64986Pew;
import X.InterfaceC65349Pkn;
import X.InterfaceC65404Plg;
import X.InterfaceC67352kd;
import X.X1D;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public interface ServerABSettingsApi {
    public static final C71018Ru2 LIZ = C71018Ru2.LIZ;

    @E8L("/api/v1/oec/affiliate/ab_test/get")
    Object getABTestResultForBroadcaster(@InterfaceC64986Pew("author_id") String str, InterfaceC67352kd<? super BaseResponse<AnchorABTestResult>> interfaceC67352kd);

    /* loaded from: classes13.dex */
    public static final class AtmosphereConfig {

        @InterfaceC65349Pkn("anchor_hot_tag_show")
        public final Boolean canHotTagShow;

        @InterfaceC65349Pkn("anchor_under_stock_show")
        public final Boolean canLowStockShow;

        @InterfaceC65349Pkn("anchor_barrage_show")
        public final Boolean canShowBarrage;

        @InterfaceC65349Pkn("anchor_top_sales_show")
        public final Boolean canTopSaleShow;

        public static /* synthetic */ AtmosphereConfig copy$default(AtmosphereConfig atmosphereConfig, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = atmosphereConfig.canShowBarrage;
            }
            if ((i & 2) != 0) {
                bool2 = atmosphereConfig.canHotTagShow;
            }
            if ((i & 4) != 0) {
                bool3 = atmosphereConfig.canTopSaleShow;
            }
            if ((i & 8) != 0) {
                bool4 = atmosphereConfig.canLowStockShow;
            }
            return atmosphereConfig.copy(bool, bool2, bool3, bool4);
        }

        public final AtmosphereConfig copy(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
            return new AtmosphereConfig(bool, bool2, bool3, bool4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtmosphereConfig)) {
                return false;
            }
            AtmosphereConfig atmosphereConfig = (AtmosphereConfig) obj;
            return o.LJ(this.canShowBarrage, atmosphereConfig.canShowBarrage) && o.LJ(this.canHotTagShow, atmosphereConfig.canHotTagShow) && o.LJ(this.canTopSaleShow, atmosphereConfig.canTopSaleShow) && o.LJ(this.canLowStockShow, atmosphereConfig.canLowStockShow);
        }

        public int hashCode() {
            Boolean bool = this.canShowBarrage;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.canHotTagShow;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.canTopSaleShow;
            int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.canLowStockShow;
            return hashCode3 + (bool4 != null ? bool4.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AtmosphereConfig(canShowBarrage=");
            LIZ.append(this.canShowBarrage);
            LIZ.append(", canHotTagShow=");
            LIZ.append(this.canHotTagShow);
            LIZ.append(", canTopSaleShow=");
            LIZ.append(this.canTopSaleShow);
            LIZ.append(", canLowStockShow=");
            return C78920UyC.LIZIZ(LIZ, this.canLowStockShow, ')', LIZ);
        }

        public final Boolean getCanHotTagShow() {
            return this.canHotTagShow;
        }

        public final Boolean getCanLowStockShow() {
            return this.canLowStockShow;
        }

        public final Boolean getCanShowBarrage() {
            return this.canShowBarrage;
        }

        public final Boolean getCanTopSaleShow() {
            return this.canTopSaleShow;
        }

        public AtmosphereConfig(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
            this.canShowBarrage = bool;
            this.canHotTagShow = bool2;
            this.canTopSaleShow = bool3;
            this.canLowStockShow = bool4;
        }
    }

    /* loaded from: classes13.dex */
    public static final class AnchorABTestResult {

        @InterfaceC65349Pkn("host_atmosphere")
        @InterfaceC65404Plg(StringJsonAdapterFactory.class)
        public final AtmosphereConfig atmosphereConfig;

        public static /* synthetic */ AnchorABTestResult copy$default(AnchorABTestResult anchorABTestResult, AtmosphereConfig atmosphereConfig, int i, Object obj) {
            if ((i & 1) != 0) {
                atmosphereConfig = anchorABTestResult.atmosphereConfig;
            }
            return anchorABTestResult.copy(atmosphereConfig);
        }

        public final AnchorABTestResult copy(AtmosphereConfig atmosphereConfig) {
            o.LJIIIZ(atmosphereConfig, "atmosphereConfig");
            return new AnchorABTestResult(atmosphereConfig);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AnchorABTestResult) && o.LJ(this.atmosphereConfig, ((AnchorABTestResult) obj).atmosphereConfig);
        }

        public int hashCode() {
            return this.atmosphereConfig.hashCode();
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AnchorABTestResult(atmosphereConfig=");
            LIZ.append(this.atmosphereConfig);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public final AtmosphereConfig getAtmosphereConfig() {
            return this.atmosphereConfig;
        }

        public AnchorABTestResult(AtmosphereConfig atmosphereConfig) {
            o.LJIIIZ(atmosphereConfig, "atmosphereConfig");
            this.atmosphereConfig = atmosphereConfig;
        }
    }
}
