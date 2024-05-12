package com.bytedance.android.livesdkapi.depend.model.live.bubble;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class BubbleSettingData implements Serializable {

    @InterfaceC65349Pkn("cache_interval")
    public long cacheInterval;

    @InterfaceC65349Pkn("show_interval")
    public long showInterval;

    @InterfaceC65349Pkn("stay_interval")
    public long stayInterval;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BubbleSettingData() {
        /*
            r9 = this;
            r1 = 0
            r7 = 7
            r8 = 0
            r0 = r9
            r3 = r1
            r5 = r1
            r0.<init>(r1, r3, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdkapi.depend.model.live.bubble.BubbleSettingData.<init>():void");
    }

    public final long getCacheInterval() {
        return this.cacheInterval;
    }

    public final long getShowInterval() {
        return this.showInterval;
    }

    public final long getStayInterval() {
        return this.stayInterval;
    }

    public final void setCacheInterval(long j) {
        this.cacheInterval = j;
    }

    public final void setShowInterval(long j) {
        this.showInterval = j;
    }

    public final void setStayInterval(long j) {
        this.stayInterval = j;
    }

    public BubbleSettingData(long j, long j2, long j3) {
        this.showInterval = j;
        this.stayInterval = j2;
        this.cacheInterval = j3;
    }

    public /* synthetic */ BubbleSettingData(long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3);
    }
}
