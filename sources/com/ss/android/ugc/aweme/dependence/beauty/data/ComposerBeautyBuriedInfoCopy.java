package com.ss.android.ugc.aweme.dependence.beauty.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ComposerBeautyBuriedInfoCopy {

    @InterfaceC65349Pkn("beautify_info")
    public final List<BeautifyInfo> beautifyInfo;

    @InterfaceC65349Pkn("beautify_used")
    public final int beautifyUsed;

    @InterfaceC65349Pkn("beautify_on")
    public final int beautyStatus;

    @InterfaceC65349Pkn("is_composer")
    public final int modeChosen;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ComposerBeautyBuriedInfoCopy() {
        /*
            r7 = this;
            r1 = 0
            r4 = 0
            r5 = 15
            r0 = r7
            r2 = r1
            r3 = r1
            r6 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfoCopy.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComposerBeautyBuriedInfoCopy copy$default(ComposerBeautyBuriedInfoCopy composerBeautyBuriedInfoCopy, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = composerBeautyBuriedInfoCopy.beautifyUsed;
        }
        if ((i4 & 2) != 0) {
            i2 = composerBeautyBuriedInfoCopy.getModeChosen();
        }
        if ((i4 & 4) != 0) {
            i3 = composerBeautyBuriedInfoCopy.getBeautyStatus();
        }
        if ((i4 & 8) != 0) {
            list = composerBeautyBuriedInfoCopy.beautifyInfo;
        }
        return composerBeautyBuriedInfoCopy.copy(i, i2, i3, list);
    }

    public final int component2() {
        return getModeChosen();
    }

    public final int component3() {
        return getBeautyStatus();
    }

    public final ComposerBeautyBuriedInfoCopy copy(int i, int i2, int i3, List<BeautifyInfo> beautifyInfo) {
        o.LJIIIZ(beautifyInfo, "beautifyInfo");
        return new ComposerBeautyBuriedInfoCopy(i, i2, i3, beautifyInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposerBeautyBuriedInfoCopy)) {
            return false;
        }
        ComposerBeautyBuriedInfoCopy composerBeautyBuriedInfoCopy = (ComposerBeautyBuriedInfoCopy) obj;
        return this.beautifyUsed == composerBeautyBuriedInfoCopy.beautifyUsed && getModeChosen() == composerBeautyBuriedInfoCopy.getModeChosen() && getBeautyStatus() == composerBeautyBuriedInfoCopy.getBeautyStatus() && o.LJ(this.beautifyInfo, composerBeautyBuriedInfoCopy.beautifyInfo);
    }

    public int hashCode() {
        int beautyStatus = (getBeautyStatus() + ((getModeChosen() + (this.beautifyUsed * 31)) * 31)) * 31;
        List<BeautifyInfo> list = this.beautifyInfo;
        return beautyStatus + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ComposerBeautyBuriedInfoCopy(beautifyUsed=");
        LIZ.append(this.beautifyUsed);
        LIZ.append(", modeChosen=");
        LIZ.append(getModeChosen());
        LIZ.append(", beautyStatus=");
        LIZ.append(getBeautyStatus());
        LIZ.append(", beautifyInfo=");
        LIZ.append(this.beautifyInfo);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public final List<BeautifyInfo> getBeautifyInfo() {
        return this.beautifyInfo;
    }

    public final int getBeautifyUsed() {
        return this.beautifyUsed;
    }

    public int getBeautyStatus() {
        return this.beautyStatus;
    }

    public int getModeChosen() {
        return this.modeChosen;
    }

    public ComposerBeautyBuriedInfoCopy(int i, int i2, int i3, List<BeautifyInfo> beautifyInfo) {
        o.LJIIIZ(beautifyInfo, "beautifyInfo");
        this.beautifyUsed = i;
        this.modeChosen = i2;
        this.beautyStatus = i3;
        this.beautifyInfo = beautifyInfo;
    }

    public /* synthetic */ ComposerBeautyBuriedInfoCopy(int i, int i2, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? new ArrayList() : list);
    }
}
