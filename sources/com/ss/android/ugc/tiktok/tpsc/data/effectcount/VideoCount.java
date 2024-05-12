package com.ss.android.ugc.tiktok.tpsc.data.effectcount;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class VideoCount extends F9E {

    @InterfaceC65349Pkn("video_off_count")
    public final int offCount;

    @InterfaceC65349Pkn("video_on_count")
    public final int onCount;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoCount() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.tpsc.data.effectcount.VideoCount.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.onCount), Integer.valueOf(this.offCount)};
    }

    public VideoCount(int i, int i2) {
        this.onCount = i;
        this.offCount = i2;
    }

    public /* synthetic */ VideoCount(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
