package com.bytedance.helios.api.config;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class StorageConfig {

    @InterfaceC65349Pkn("include_callstack")
    public final boolean includeCallstack;

    @InterfaceC65349Pkn("monitor_rate")
    public final double monitorRate;

    @InterfaceC65349Pkn("nvwa_aggregate_size")
    public final int nvwaAggregateSize;

    @InterfaceC65349Pkn("report_type")
    public final int reportType;

    @InterfaceC65349Pkn("storage_policy")
    public final StorageInterceptConfig storageInterceptConfig;

    @InterfaceC65349Pkn("storage_lib_regex_whitelist")
    public final String[] storageLibRegexWhitelist;

    /* JADX WARN: Multi-variable type inference failed */
    public StorageConfig() {
        this(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageConfig)) {
            return false;
        }
        StorageConfig storageConfig = (StorageConfig) obj;
        return Double.compare(this.monitorRate, storageConfig.monitorRate) == 0 && this.reportType == storageConfig.reportType && this.nvwaAggregateSize == storageConfig.nvwaAggregateSize && this.includeCallstack == storageConfig.includeCallstack && o.LJ(this.storageInterceptConfig, storageConfig.storageInterceptConfig) && o.LJ(this.storageLibRegexWhitelist, storageConfig.storageLibRegexWhitelist);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.monitorRate);
        int i = ((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + this.reportType) * 31) + this.nvwaAggregateSize) * 31;
        boolean z = this.includeCallstack;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        StorageInterceptConfig storageInterceptConfig = this.storageInterceptConfig;
        int hashCode = (i3 + (storageInterceptConfig != null ? storageInterceptConfig.hashCode() : 0)) * 31;
        String[] strArr = this.storageLibRegexWhitelist;
        return hashCode + (strArr != null ? Arrays.hashCode(strArr) : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StorageConfig(monitorRate=");
        LIZ.append(this.monitorRate);
        LIZ.append(", reportType=");
        LIZ.append(this.reportType);
        LIZ.append(", nvwaAggregateSize=");
        LIZ.append(this.nvwaAggregateSize);
        LIZ.append(", includeCallstack=");
        LIZ.append(this.includeCallstack);
        LIZ.append(", storageInterceptConfig=");
        LIZ.append(this.storageInterceptConfig);
        LIZ.append(", storageLibRegexWhitelist=");
        return JBR.LJFF(LIZ, Arrays.toString(this.storageLibRegexWhitelist), ")", LIZ);
    }

    public StorageConfig(double d, int i, int i2, boolean z, StorageInterceptConfig storageInterceptConfig, String[] storageLibRegexWhitelist) {
        o.LJIIIZ(storageInterceptConfig, "storageInterceptConfig");
        o.LJIIIZ(storageLibRegexWhitelist, "storageLibRegexWhitelist");
        this.monitorRate = d;
        this.reportType = i;
        this.nvwaAggregateSize = i2;
        this.includeCallstack = z;
        this.storageInterceptConfig = storageInterceptConfig;
        this.storageLibRegexWhitelist = storageLibRegexWhitelist;
    }

    public /* synthetic */ StorageConfig(double d, int i, int i2, boolean z, StorageInterceptConfig storageInterceptConfig, String[] strArr, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 1.0d : d, (i3 & 2) != 0 ? 1 : i, (i3 & 4) != 0 ? 100 : i2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? new StorageInterceptConfig(false, false, null, null, 15, null) : storageInterceptConfig, (i3 & 32) != 0 ? new String[0] : strArr);
    }
}
