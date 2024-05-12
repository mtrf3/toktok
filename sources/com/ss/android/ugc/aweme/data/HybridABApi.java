package com.ss.android.ugc.aweme.data;

import X.AbstractC73672Svk;
import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC64986Pew;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public interface HybridABApi {
    @E8M("/tiktok/v1/hybrid/ab/")
    AbstractC73672Svk<HybridExperimentResponse> getHybridExperimentsByPost(@InterfaceC64986Pew("feature_name") String str, @InterfaceC64986Pew("is_first_hybridab_request") boolean z, @InterfaceC64986Pew("is_first_app_session") boolean z2, @InterfaceC64986Pew("ssaid") String str2, @InterfaceC64986Pew("mock_hybridab_id") String str3, @InterfaceC195727mC HybridABBody hybridABBody);

    /* loaded from: classes7.dex */
    public static final class HybridABBody {

        @InterfaceC65349Pkn("vids")
        public final String vids;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HybridABBody) && o.LJ(this.vids, ((HybridABBody) obj).vids);
        }

        public final int hashCode() {
            String str = this.vids;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HybridABBody(vids=");
            return q.LIZIZ(LIZ, this.vids, ')', LIZ);
        }

        public HybridABBody(String str) {
            this.vids = str;
        }
    }

    /* loaded from: classes7.dex */
    public static final class HybridABConfig {

        @InterfaceC65349Pkn("val")
        public final Object value;

        @InterfaceC65349Pkn("vid")
        public final String vid;

        /* JADX WARN: Multi-variable type inference failed */
        public HybridABConfig() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HybridABConfig)) {
                return false;
            }
            HybridABConfig hybridABConfig = (HybridABConfig) obj;
            return o.LJ(this.value, hybridABConfig.value) && o.LJ(this.vid, hybridABConfig.vid);
        }

        public final int hashCode() {
            Object obj = this.value;
            int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            String str = this.vid;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HybridABConfig(value=");
            LIZ.append(this.value);
            LIZ.append(", vid=");
            return q.LIZIZ(LIZ, this.vid, ')', LIZ);
        }

        public HybridABConfig(Object obj, String str) {
            this.value = obj;
            this.vid = str;
        }

        public /* synthetic */ HybridABConfig(Object obj, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : str);
        }
    }

    /* loaded from: classes7.dex */
    public static final class HybridABExtra {

        @InterfaceC65349Pkn("logid")
        public final String logId;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HybridABExtra) && o.LJ(this.logId, ((HybridABExtra) obj).logId);
        }

        public final int hashCode() {
            String str = this.logId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HybridABExtra(logId=");
            return q.LIZIZ(LIZ, this.logId, ')', LIZ);
        }

        public HybridABExtra(String str) {
            this.logId = str;
        }
    }

    /* loaded from: classes7.dex */
    public static final class HybridExperimentResponse {

        @InterfaceC65349Pkn("closed_experiments")
        public final Map<String, HybridABConfig> closedExperiment;

        @InterfaceC65349Pkn("config_map")
        public final Map<String, Map<String, HybridABConfig>> configMap;

        @InterfaceC65349Pkn("extra")
        public final HybridABExtra extra;

        @InterfaceC65349Pkn("status_code")
        public final int statusCode;

        /* JADX WARN: Multi-variable type inference failed */
        public HybridExperimentResponse() {
            this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HybridExperimentResponse)) {
                return false;
            }
            HybridExperimentResponse hybridExperimentResponse = (HybridExperimentResponse) obj;
            return this.statusCode == hybridExperimentResponse.statusCode && o.LJ(this.configMap, hybridExperimentResponse.configMap) && o.LJ(this.closedExperiment, hybridExperimentResponse.closedExperiment) && o.LJ(this.extra, hybridExperimentResponse.extra);
        }

        public final int hashCode() {
            int i = this.statusCode * 31;
            Map<String, Map<String, HybridABConfig>> map = this.configMap;
            int hashCode = (i + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, HybridABConfig> map2 = this.closedExperiment;
            int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
            HybridABExtra hybridABExtra = this.extra;
            return hashCode2 + (hybridABExtra != null ? hybridABExtra.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HybridExperimentResponse(statusCode=");
            LIZ.append(this.statusCode);
            LIZ.append(", configMap=");
            LIZ.append(this.configMap);
            LIZ.append(", closedExperiment=");
            LIZ.append(this.closedExperiment);
            LIZ.append(", extra=");
            LIZ.append(this.extra);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public HybridExperimentResponse(int i, Map<String, ? extends Map<String, HybridABConfig>> map, Map<String, HybridABConfig> map2, HybridABExtra hybridABExtra) {
            this.statusCode = i;
            this.configMap = map;
            this.closedExperiment = map2;
            this.extra = hybridABExtra;
        }

        public /* synthetic */ HybridExperimentResponse(int i, Map map, Map map2, HybridABExtra hybridABExtra, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : map, (i2 & 4) != 0 ? null : map2, (i2 & 8) != 0 ? null : hybridABExtra);
        }
    }
}
