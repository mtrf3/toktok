package com.ss.android.ugc.aweme.beauty;

import X.HYB;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class MBeautyStateInfo implements HYB {

    @InterfaceC65349Pkn("beautify_on")
    public final int beautyStatus;

    @InterfaceC65349Pkn("is_mbeautify")
    public final int modeChosen;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MBeautyStateInfo() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.beauty.MBeautyStateInfo.<init>():void");
    }

    public final int hashCode() {
        return (this.beautyStatus * 31) + this.modeChosen;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MBeautyStateInfo(beautyStatus=");
        LIZ.append(this.beautyStatus);
        LIZ.append(", modeChosen=");
        return b0.LIZJ(LIZ, this.modeChosen, ')', LIZ);
    }

    @Override // X.HYB
    public final int getBeautyStatus() {
        return this.beautyStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MBeautyStateInfo)) {
            return false;
        }
        MBeautyStateInfo mBeautyStateInfo = (MBeautyStateInfo) obj;
        if (this.beautyStatus == mBeautyStateInfo.beautyStatus && this.modeChosen == mBeautyStateInfo.modeChosen) {
            return true;
        }
        return false;
    }

    public MBeautyStateInfo(int i, int i2) {
        this.beautyStatus = i;
        this.modeChosen = i2;
    }

    public /* synthetic */ MBeautyStateInfo(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
