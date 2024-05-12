package com.bytedance.android.livesdk.model.message.linkcore;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class RTCBitRateMap extends F9E {

    @InterfaceC65349Pkn("xx1")
    public int xx_1;

    @InterfaceC65349Pkn("xx2")
    public int xx_2;

    @InterfaceC65349Pkn("xx3")
    public int xx_3;

    @InterfaceC65349Pkn("xx4")
    public int xx_4;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RTCBitRateMap() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.model.message.linkcore.RTCBitRateMap.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.xx_1), Integer.valueOf(this.xx_2), Integer.valueOf(this.xx_3), Integer.valueOf(this.xx_4)};
    }

    public RTCBitRateMap(int i, int i2, int i3, int i4) {
        this.xx_1 = i;
        this.xx_2 = i2;
        this.xx_3 = i3;
        this.xx_4 = i4;
    }

    public /* synthetic */ RTCBitRateMap(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
