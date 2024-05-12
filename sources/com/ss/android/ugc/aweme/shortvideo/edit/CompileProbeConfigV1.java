package com.ss.android.ugc.aweme.shortvideo.edit;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class CompileProbeConfigV1 extends F9E {
    public final long endPointMs;
    public final long startPointMs;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CompileProbeConfigV1() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeConfigV1.<init>():void");
    }

    public static /* synthetic */ CompileProbeConfigV1 copy$default(CompileProbeConfigV1 compileProbeConfigV1, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = compileProbeConfigV1.startPointMs;
        }
        if ((i & 2) != 0) {
            j2 = compileProbeConfigV1.endPointMs;
        }
        return compileProbeConfigV1.copy(j, j2);
    }

    public final CompileProbeConfigV1 copy(long j, long j2) {
        return new CompileProbeConfigV1(j, j2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.startPointMs), Long.valueOf(this.endPointMs)};
    }

    public final long getEndPointMs() {
        return this.endPointMs;
    }

    public final long getStartPointMs() {
        return this.startPointMs;
    }

    public CompileProbeConfigV1(long j, long j2) {
        this.startPointMs = j;
        this.endPointMs = j2;
    }

    public /* synthetic */ CompileProbeConfigV1(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 1000L : j2);
    }
}
