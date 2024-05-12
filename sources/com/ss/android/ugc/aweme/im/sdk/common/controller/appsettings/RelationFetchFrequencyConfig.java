package com.ss.android.ugc.aweme.im.sdk.common.controller.appsettings;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes2.dex */
public final class RelationFetchFrequencyConfig extends F9E {
    public final long LJLIL = 600;

    @InterfaceC65349Pkn("coldup_update")
    public final long coldUpDiffUpdateFreq;

    @InterfaceC65349Pkn("font_update")
    public final long fontDiffFreq;

    @InterfaceC65349Pkn("update")
    public final long fullUpdateFreq;

    @InterfaceC65349Pkn("frontier_update")
    public final long wsDiffUpdateFreq;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.fullUpdateFreq), Long.valueOf(this.coldUpDiffUpdateFreq), Long.valueOf(this.wsDiffUpdateFreq), Long.valueOf(this.fontDiffFreq)};
    }

    public RelationFetchFrequencyConfig(long j, long j2, long j3, long j4) {
        this.fullUpdateFreq = j;
        this.coldUpDiffUpdateFreq = j2;
        this.wsDiffUpdateFreq = j3;
        this.fontDiffFreq = j4;
    }
}
