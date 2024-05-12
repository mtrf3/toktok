package com.ss.android.ugc.aweme.relation.storage.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class StorageConfig {

    @InterfaceC65349Pkn("enable")
    public final Integer enable;

    @InterfaceC65349Pkn("enable_poor_network")
    public final int enablePoorNetworkOptimize;

    @InterfaceC65349Pkn("full_update_cycle")
    public final Long fullUpdateCycle;

    @InterfaceC65349Pkn("max_retry_count_for_paging")
    public final Integer maxRetryCount;

    @InterfaceC65349Pkn("max_validity_period_of_data")
    public final Long maxValidityPeriod;

    @InterfaceC65349Pkn("monitor_sampling")
    public final JSONObject monitorSampling;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageConfig)) {
            return false;
        }
        StorageConfig storageConfig = (StorageConfig) obj;
        return o.LJ(this.enable, storageConfig.enable) && o.LJ(this.fullUpdateCycle, storageConfig.fullUpdateCycle) && o.LJ(this.maxValidityPeriod, storageConfig.maxValidityPeriod) && o.LJ(this.maxRetryCount, storageConfig.maxRetryCount) && o.LJ(this.monitorSampling, storageConfig.monitorSampling) && this.enablePoorNetworkOptimize == storageConfig.enablePoorNetworkOptimize;
    }

    public final int hashCode() {
        Integer num = this.enable;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.fullUpdateCycle;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.maxValidityPeriod;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num2 = this.maxRetryCount;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        JSONObject jSONObject = this.monitorSampling;
        return ((hashCode4 + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31) + this.enablePoorNetworkOptimize;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StorageConfig(enable=");
        LIZ.append(this.enable);
        LIZ.append(", fullUpdateCycle=");
        LIZ.append(this.fullUpdateCycle);
        LIZ.append(", maxValidityPeriod=");
        LIZ.append(this.maxValidityPeriod);
        LIZ.append(", maxRetryCount=");
        LIZ.append(this.maxRetryCount);
        LIZ.append(", monitorSampling=");
        LIZ.append(this.monitorSampling);
        LIZ.append(", enablePoorNetworkOptimize=");
        return b0.LIZJ(LIZ, this.enablePoorNetworkOptimize, ')', LIZ);
    }

    public StorageConfig(Integer num, Long l, Long l2, Integer num2, JSONObject jSONObject, int i) {
        this.enable = num;
        this.fullUpdateCycle = l;
        this.maxValidityPeriod = l2;
        this.maxRetryCount = num2;
        this.monitorSampling = jSONObject;
        this.enablePoorNetworkOptimize = i;
    }

    public /* synthetic */ StorageConfig(Integer num, Long l, Long l2, Integer num2, JSONObject jSONObject, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, l, l2, num2, (i2 & 16) != 0 ? null : jSONObject, (i2 & 32) != 0 ? 0 : i);
    }
}
