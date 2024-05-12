package com.ss.android.ugc.aweme.hybridkit.forest;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ForestStrategy {

    @InterfaceC65349Pkn("default_page_size")
    public Integer defaultPageSize;

    @InterfaceC65349Pkn("enable_parallel_h5_loading")
    public boolean enableParallelLoadingInH5;

    @InterfaceC65349Pkn("force_meta")
    public Boolean forceMeta;

    @InterfaceC65349Pkn("forest_buffer_strategy")
    public int forestBufferStrategy;

    @InterfaceC65349Pkn("max_expiration_time")
    public Long maxExpirationTime;

    @InterfaceC65349Pkn("meta_threshold")
    public Integer metaThreshold;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ForestStrategy() {
        /*
            r9 = this;
            r1 = 0
            r2 = 0
            r7 = 63
            r0 = r9
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r1
            r8 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hybridkit.forest.ForestStrategy.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForestStrategy)) {
            return false;
        }
        ForestStrategy forestStrategy = (ForestStrategy) obj;
        return this.forestBufferStrategy == forestStrategy.forestBufferStrategy && o.LJ(this.maxExpirationTime, forestStrategy.maxExpirationTime) && o.LJ(this.forceMeta, forestStrategy.forceMeta) && o.LJ(this.metaThreshold, forestStrategy.metaThreshold) && o.LJ(this.defaultPageSize, forestStrategy.defaultPageSize) && this.enableParallelLoadingInH5 == forestStrategy.enableParallelLoadingInH5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = this.forestBufferStrategy * 31;
        Long l = this.maxExpirationTime;
        int hashCode = (i + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.forceMeta;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.metaThreshold;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.defaultPageSize;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z = this.enableParallelLoadingInH5;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ForestStrategy(forestBufferStrategy=");
        LIZ.append(this.forestBufferStrategy);
        LIZ.append(", maxExpirationTime=");
        LIZ.append(this.maxExpirationTime);
        LIZ.append(", forceMeta=");
        LIZ.append(this.forceMeta);
        LIZ.append(", metaThreshold=");
        LIZ.append(this.metaThreshold);
        LIZ.append(", defaultPageSize=");
        LIZ.append(this.defaultPageSize);
        LIZ.append(", enableParallelLoadingInH5=");
        return C48339Iy7.LIZJ(LIZ, this.enableParallelLoadingInH5, ')', LIZ);
    }

    public ForestStrategy(int i, Long l, Boolean bool, Integer num, Integer num2, boolean z) {
        this.forestBufferStrategy = i;
        this.maxExpirationTime = l;
        this.forceMeta = bool;
        this.metaThreshold = num;
        this.defaultPageSize = num2;
        this.enableParallelLoadingInH5 = z;
    }

    public /* synthetic */ ForestStrategy(int i, Long l, Boolean bool, Integer num, Integer num2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : l, (i2 & 4) != 0 ? null : bool, (i2 & 8) != 0 ? null : num, (i2 & 16) == 0 ? num2 : null, (i2 & 32) != 0 ? false : z);
    }
}
