package com.ss.android.ugc.tiktok.tpsc.data.effectcount;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class NoPAControlSettings extends F9E {

    @InterfaceC65349Pkn("download")
    public final int download;

    @InterfaceC65349Pkn("duet")
    public final int duet;

    @InterfaceC65349Pkn("stitch")
    public final int stitch;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NoPAControlSettings() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.tpsc.data.effectcount.NoPAControlSettings.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.download), Integer.valueOf(this.duet), Integer.valueOf(this.stitch)};
    }

    public NoPAControlSettings(int i, int i2, int i3) {
        this.download = i;
        this.duet = i2;
        this.stitch = i3;
    }

    public /* synthetic */ NoPAControlSettings(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
