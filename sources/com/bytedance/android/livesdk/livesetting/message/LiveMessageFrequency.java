package com.bytedance.android.livesdk.livesetting.message;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public class LiveMessageFrequency {

    @InterfaceC65349Pkn("frequency_count")
    public long frequencyCount;

    @InterfaceC65349Pkn("frequency_time_ms")
    public long frequencyTimeMs;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveMessageFrequency() {
        /*
            r7 = this;
            r1 = 0
            r5 = 3
            r6 = 0
            r0 = r7
            r3 = r1
            r0.<init>(r1, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.message.LiveMessageFrequency.<init>():void");
    }

    public final long getFrequencyCount() {
        return this.frequencyCount;
    }

    public final long getFrequencyTimeMs() {
        return this.frequencyTimeMs;
    }

    public final void setFrequencyCount(long j) {
        this.frequencyCount = j;
    }

    public final void setFrequencyTimeMs(long j) {
        this.frequencyTimeMs = j;
    }

    public LiveMessageFrequency(long j, long j2) {
        this.frequencyTimeMs = j;
        this.frequencyCount = j2;
    }

    public /* synthetic */ LiveMessageFrequency(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1000L : j, (i & 2) != 0 ? 1000L : j2);
    }
}
