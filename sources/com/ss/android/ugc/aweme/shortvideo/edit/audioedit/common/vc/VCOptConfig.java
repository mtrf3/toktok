package com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class VCOptConfig extends F9E {

    @InterfaceC65349Pkn("bit_rate")
    public final int bitRate;

    @InterfaceC65349Pkn("channel")
    public final int channels;

    @InterfaceC65349Pkn("sample_rate")
    public final int sampleRate;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VCOptConfig() {
        /*
            r6 = this;
            r1 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc.VCOptConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.channels), Integer.valueOf(this.sampleRate), Integer.valueOf(this.bitRate)};
    }

    public VCOptConfig(int i, int i2, int i3) {
        this.channels = i;
        this.sampleRate = i2;
        this.bitRate = i3;
    }

    public /* synthetic */ VCOptConfig(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 2 : i, (i4 & 2) != 0 ? 44100 : i2, (i4 & 4) != 0 ? 128000 : i3);
    }
}
