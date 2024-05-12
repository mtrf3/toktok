package com.ss.android.ugc.aweme.ecommerce.mall.customdot.state;

import X.C48339Iy7;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class DiversionTargetData {
    public final DiversionData diversionData;
    public final boolean isBubblePicShow;
    public boolean isBubbleShowed;
    public boolean isDotShowed;
    public final String reachCfgData;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DiversionTargetData() {
        /*
            r8 = this;
            r1 = 0
            r3 = 0
            r6 = 31
            r0 = r8
            r2 = r1
            r4 = r3
            r5 = r3
            r7 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.customdot.state.DiversionTargetData.<init>():void");
    }

    public static /* synthetic */ DiversionTargetData copy$default(DiversionTargetData diversionTargetData, String str, DiversionData diversionData, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = diversionTargetData.reachCfgData;
        }
        if ((i & 2) != 0) {
            diversionData = diversionTargetData.diversionData;
        }
        if ((i & 4) != 0) {
            z = diversionTargetData.isBubblePicShow;
        }
        if ((i & 8) != 0) {
            z2 = diversionTargetData.isBubbleShowed;
        }
        if ((i & 16) != 0) {
            z3 = diversionTargetData.isDotShowed;
        }
        return diversionTargetData.copy(str, diversionData, z, z2, z3);
    }

    public final DiversionTargetData copy(String str, DiversionData diversionData, boolean z, boolean z2, boolean z3) {
        return new DiversionTargetData(str, diversionData, z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiversionTargetData)) {
            return false;
        }
        DiversionTargetData diversionTargetData = (DiversionTargetData) obj;
        return o.LJ(this.reachCfgData, diversionTargetData.reachCfgData) && o.LJ(this.diversionData, diversionTargetData.diversionData) && this.isBubblePicShow == diversionTargetData.isBubblePicShow && this.isBubbleShowed == diversionTargetData.isBubbleShowed && this.isDotShowed == diversionTargetData.isDotShowed;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.reachCfgData;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        DiversionData diversionData = this.diversionData;
        int hashCode2 = (hashCode + (diversionData != null ? diversionData.hashCode() : 0)) * 31;
        boolean z = this.isBubblePicShow;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.isBubbleShowed;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        return ((i2 + i3) * 31) + (this.isDotShowed ? 1 : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DiversionTargetData(reachCfgData=");
        LIZ.append(this.reachCfgData);
        LIZ.append(", diversionData=");
        LIZ.append(this.diversionData);
        LIZ.append(", isBubblePicShow=");
        LIZ.append(this.isBubblePicShow);
        LIZ.append(", isBubbleShowed=");
        LIZ.append(this.isBubbleShowed);
        LIZ.append(", isDotShowed=");
        return C48339Iy7.LIZJ(LIZ, this.isDotShowed, ')', LIZ);
    }

    public final DiversionData getDiversionData() {
        return this.diversionData;
    }

    public final String getReachCfgData() {
        return this.reachCfgData;
    }

    public final boolean isBubblePicShow() {
        return this.isBubblePicShow;
    }

    public final boolean isBubbleShowed() {
        return this.isBubbleShowed;
    }

    public final boolean isDotShowed() {
        return this.isDotShowed;
    }

    public final void setBubbleShowed(boolean z) {
        this.isBubbleShowed = z;
    }

    public final void setDotShowed(boolean z) {
        this.isDotShowed = z;
    }

    public DiversionTargetData(String str, DiversionData diversionData, boolean z, boolean z2, boolean z3) {
        this.reachCfgData = str;
        this.diversionData = diversionData;
        this.isBubblePicShow = z;
        this.isBubbleShowed = z2;
        this.isDotShowed = z3;
    }

    public /* synthetic */ DiversionTargetData(String str, DiversionData diversionData, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) == 0 ? diversionData : null, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3);
    }
}
