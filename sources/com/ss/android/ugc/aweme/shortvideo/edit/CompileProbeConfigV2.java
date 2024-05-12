package com.ss.android.ugc.aweme.shortvideo.edit;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class CompileProbeConfigV2 {

    @InterfaceC65349Pkn("bitrateRange")
    public final String bitrateRange;

    @InterfaceC65349Pkn("bitrateStrategy")
    public final int bitrateStrategy;

    @InterfaceC65349Pkn("endPointMs")
    public final long endPointMs;

    @InterfaceC65349Pkn("probeType")
    public final int probeType;

    @InterfaceC65349Pkn("startPointMs")
    public final long startPointMs;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CompileProbeConfigV2() {
        /*
            r10 = this;
            r1 = 0
            r5 = 0
            r7 = 0
            r8 = 31
            r0 = r10
            r3 = r1
            r6 = r5
            r9 = r7
            r0.<init>(r1, r3, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeConfigV2.<init>():void");
    }

    public String getBitrateRange() {
        return this.bitrateRange;
    }

    public int getBitrateStrategy() {
        return this.bitrateStrategy;
    }

    public long getEndPointMs() {
        return this.endPointMs;
    }

    public int getProbeType() {
        return this.probeType;
    }

    public long getStartPointMs() {
        return this.startPointMs;
    }

    public CompileProbeConfigV2(long j, long j2, int i, int i2, String bitrateRange) {
        o.LJIIIZ(bitrateRange, "bitrateRange");
        this.startPointMs = j;
        this.endPointMs = j2;
        this.probeType = i;
        this.bitrateStrategy = i2;
        this.bitrateRange = bitrateRange;
    }

    public /* synthetic */ CompileProbeConfigV2(long j, long j2, int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 3000L : j, (i3 & 2) != 0 ? 4000L : j2, (i3 & 4) != 0 ? 2 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? "" : str);
    }
}
