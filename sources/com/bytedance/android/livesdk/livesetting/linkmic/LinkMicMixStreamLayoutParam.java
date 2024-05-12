package com.bytedance.android.livesdk.livesetting.linkmic;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class LinkMicMixStreamLayoutParam extends F9E {

    @InterfaceC65349Pkn("br")
    public int bitRate;

    @InterfaceC65349Pkn("h")
    public int height;

    @InterfaceC65349Pkn("w")
    public int width;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LinkMicMixStreamLayoutParam() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMixStreamLayoutParam.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.width), Integer.valueOf(this.height), Integer.valueOf(this.bitRate)};
    }

    public LinkMicMixStreamLayoutParam(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.bitRate = i3;
    }

    public /* synthetic */ LinkMicMixStreamLayoutParam(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? -1 : i2, (i4 & 4) != 0 ? -1 : i3);
    }
}
