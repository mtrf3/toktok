package com.ss.android.ugc.aweme.video.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class JatoBoostConfig extends F9E {

    @InterfaceC65349Pkn("cpu")
    public final long cpuBoost;

    @InterfaceC65349Pkn("gc")
    public final long gcBlock;

    @InterfaceC65349Pkn("gpu")
    public final long gpuBoost;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public JatoBoostConfig() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.experiment.JatoBoostConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.cpuBoost), Long.valueOf(this.gpuBoost), Long.valueOf(this.gcBlock)};
    }

    public final boolean L() {
        if (this.cpuBoost > 0 || this.gpuBoost > 0 || this.gcBlock > 0) {
            return true;
        }
        return false;
    }

    public JatoBoostConfig(long j, long j2, long j3) {
        this.cpuBoost = j;
        this.gpuBoost = j2;
        this.gcBlock = j3;
    }

    public /* synthetic */ JatoBoostConfig(long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3);
    }
}
