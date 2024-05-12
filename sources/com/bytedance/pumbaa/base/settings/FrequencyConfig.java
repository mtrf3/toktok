package com.bytedance.pumbaa.base.settings;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FrequencyConfig extends F9E {

    @InterfaceC65349Pkn("guard_range")
    public final GuardRange guardRange;

    @InterfaceC65349Pkn("max_called_times")
    public final int maxCalledTimes;

    @InterfaceC65349Pkn("max_store_size")
    public final int maxStoreSize;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("time_interval")
    public final long timeInterval;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FrequencyConfig() {
        /*
            r9 = this;
            r1 = 0
            r2 = 0
            r5 = 0
            r7 = 31
            r0 = r9
            r4 = r1
            r6 = r5
            r8 = r5
            r0.<init>(r1, r2, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pumbaa.base.settings.FrequencyConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.maxCalledTimes), Long.valueOf(this.timeInterval), Integer.valueOf(this.maxStoreSize), this.name, this.guardRange};
    }

    public FrequencyConfig(int i, long j, int i2, String name, GuardRange guardRange) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(guardRange, "guardRange");
        this.maxCalledTimes = i;
        this.timeInterval = j;
        this.maxStoreSize = i2;
        this.name = name;
        this.guardRange = guardRange;
    }

    public /* synthetic */ FrequencyConfig(int i, long j, int i2, String str, GuardRange guardRange, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 10 : i, (i3 & 2) != 0 ? TimeUnit.MINUTES.toMillis(1L) : j, (i3 & 4) != 0 ? 100 : i2, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? new GuardRange(null, null, null, 7, null) : guardRange);
    }
}
