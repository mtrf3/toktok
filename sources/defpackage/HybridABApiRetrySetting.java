package defpackage;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class HybridABApiRetrySetting extends F9E {

    @InterfaceC65349Pkn("delay_ms")
    public final long delayMs;

    @InterfaceC65349Pkn("disable_retry_when_network_change")
    public final boolean disableRetryWhenNetworkChange;

    @InterfaceC65349Pkn("enable_retry")
    public final boolean enableRetry;

    @InterfaceC65349Pkn("enable_when_network_change")
    public final boolean enableWhenNetworkChange;

    @InterfaceC65349Pkn("max_retry_times")
    public final int maxRetryTimes;

    @InterfaceC65349Pkn("max_times_when_network_change")
    public final int maxTimesWhenNetworkChange;

    @InterfaceC65349Pkn("request_after_boot_finish")
    public final boolean requestAfterBootFinish;

    @InterfaceC65349Pkn("retry_interval_ms")
    public final long retryIntervalMs;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HybridABApiRetrySetting() {
        /*
            r13 = this;
            r1 = 0
            r3 = 0
            r11 = 255(0xff, float:3.57E-43)
            r12 = 0
            r0 = r13
            r2 = r1
            r5 = r3
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.HybridABApiRetrySetting.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableRetry), Integer.valueOf(this.maxRetryTimes), Long.valueOf(this.retryIntervalMs), Long.valueOf(this.delayMs), Boolean.valueOf(this.enableWhenNetworkChange), Integer.valueOf(this.maxTimesWhenNetworkChange), Boolean.valueOf(this.disableRetryWhenNetworkChange), Boolean.valueOf(this.requestAfterBootFinish)};
    }

    public HybridABApiRetrySetting(boolean z, int i, long j, long j2, boolean z2, int i2, boolean z3, boolean z4) {
        this.enableRetry = z;
        this.maxRetryTimes = i;
        this.retryIntervalMs = j;
        this.delayMs = j2;
        this.enableWhenNetworkChange = z2;
        this.maxTimesWhenNetworkChange = i2;
        this.disableRetryWhenNetworkChange = z3;
        this.requestAfterBootFinish = z4;
    }

    public /* synthetic */ HybridABApiRetrySetting(boolean z, int i, long j, long j2, boolean z2, int i2, boolean z3, boolean z4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? true : z, (i3 & 2) != 0 ? 3 : i, (i3 & 4) != 0 ? 1500L : j, (i3 & 8) != 0 ? 0L : j2, (i3 & 16) != 0 ? true : z2, (i3 & 32) == 0 ? i2 : 3, (i3 & 64) == 0 ? z3 : true, (i3 & 128) != 0 ? false : z4);
    }
}
