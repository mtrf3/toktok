package com.bytedance.android.live.effect.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class StreamSize extends F9E {

    @InterfaceC65349Pkn("surface_height")
    public int surfaceHeight;

    @InterfaceC65349Pkn("surface_width")
    public int surfaceWidth;

    @InterfaceC65349Pkn("video_height")
    public int videoHeight;

    @InterfaceC65349Pkn("video_width")
    public int videoWidth;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public StreamSize() {
        /*
            r7 = this;
            r1 = 0
            r5 = 15
            r6 = 0
            r0 = r7
            r2 = r1
            r3 = r1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.model.StreamSize.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.surfaceWidth), Integer.valueOf(this.surfaceHeight), Integer.valueOf(this.videoWidth), Integer.valueOf(this.videoHeight)};
    }

    public StreamSize(int i, int i2, int i3, int i4) {
        this.surfaceWidth = i;
        this.surfaceHeight = i2;
        this.videoWidth = i3;
        this.videoHeight = i4;
    }

    public /* synthetic */ StreamSize(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
