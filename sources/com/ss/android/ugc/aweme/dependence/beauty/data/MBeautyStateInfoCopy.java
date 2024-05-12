package com.ss.android.ugc.aweme.dependence.beauty.data;

import X.C08380Uo;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class MBeautyStateInfoCopy {

    @InterfaceC65349Pkn("beautify_on")
    public final int beautyStatus;

    @InterfaceC65349Pkn("is_mbeautify")
    public final int modeChosen;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MBeautyStateInfoCopy() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dependence.beauty.data.MBeautyStateInfoCopy.<init>():void");
    }

    public final int hashCode() {
        return (this.beautyStatus * 31) + this.modeChosen;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MBeautyStateInfoCopy(beautyStatus=");
        LIZ.append(this.beautyStatus);
        LIZ.append(", modeChosen=");
        return C08380Uo.LIZ(LIZ, this.modeChosen, ")", LIZ);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MBeautyStateInfoCopy) {
                MBeautyStateInfoCopy mBeautyStateInfoCopy = (MBeautyStateInfoCopy) obj;
                if (this.beautyStatus == mBeautyStateInfoCopy.beautyStatus && this.modeChosen == mBeautyStateInfoCopy.modeChosen) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public MBeautyStateInfoCopy(int i, int i2) {
        this.beautyStatus = i;
        this.modeChosen = i2;
    }

    public /* synthetic */ MBeautyStateInfoCopy(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
