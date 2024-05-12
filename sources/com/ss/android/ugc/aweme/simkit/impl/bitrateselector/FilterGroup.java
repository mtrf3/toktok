package com.ss.android.ugc.aweme.simkit.impl.bitrateselector;

import X.C0JT;
import X.C78857UxB;
import X.IYN;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class FilterGroup {

    @InterfaceC65349Pkn("bitrate_range")
    public final int[] bitrateRange;

    @InterfaceC65349Pkn("codec")
    public final List<Integer> codecList;

    @InterfaceC65349Pkn("fps_range")
    public final int[] fpsRange;

    @InterfaceC65349Pkn("height_range")
    public final int[] heightRange;

    @InterfaceC65349Pkn("min_width_range")
    public final int[] minWidthRange;

    @InterfaceC65349Pkn("quality_range")
    public final int[] qualityRange;

    @InterfaceC65349Pkn("width_range")
    public final int[] widthRange;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FilterGroup copy$default(FilterGroup filterGroup, int[] iArr, List list, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int i, Object obj) {
        if ((i & 1) != 0) {
            iArr = filterGroup.qualityRange;
        }
        if ((i & 2) != 0) {
            list = filterGroup.codecList;
        }
        if ((i & 4) != 0) {
            iArr2 = filterGroup.fpsRange;
        }
        if ((i & 8) != 0) {
            iArr3 = filterGroup.bitrateRange;
        }
        if ((i & 16) != 0) {
            iArr4 = filterGroup.minWidthRange;
        }
        if ((i & 32) != 0) {
            iArr5 = filterGroup.widthRange;
        }
        if ((i & 64) != 0) {
            iArr6 = filterGroup.heightRange;
        }
        return filterGroup.copy(iArr, list, iArr2, iArr3, iArr4, iArr5, iArr6);
    }

    public final FilterGroup copy(int[] iArr, List<Integer> list, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6) {
        return new FilterGroup(iArr, list, iArr2, iArr3, iArr4, iArr5, iArr6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterGroup)) {
            return false;
        }
        FilterGroup filterGroup = (FilterGroup) obj;
        return o.LJ(this.qualityRange, filterGroup.qualityRange) && o.LJ(this.codecList, filterGroup.codecList) && o.LJ(this.fpsRange, filterGroup.fpsRange) && o.LJ(this.bitrateRange, filterGroup.bitrateRange) && o.LJ(this.minWidthRange, filterGroup.minWidthRange) && o.LJ(this.widthRange, filterGroup.widthRange) && o.LJ(this.heightRange, filterGroup.heightRange);
    }

    public int hashCode() {
        int[] iArr = this.qualityRange;
        int hashCode = (iArr == null ? 0 : Arrays.hashCode(iArr)) * 31;
        List<Integer> list = this.codecList;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        int[] iArr2 = this.fpsRange;
        int hashCode3 = (hashCode2 + (iArr2 == null ? 0 : Arrays.hashCode(iArr2))) * 31;
        int[] iArr3 = this.bitrateRange;
        int hashCode4 = (hashCode3 + (iArr3 == null ? 0 : Arrays.hashCode(iArr3))) * 31;
        int[] iArr4 = this.minWidthRange;
        int hashCode5 = (hashCode4 + (iArr4 == null ? 0 : Arrays.hashCode(iArr4))) * 31;
        int[] iArr5 = this.widthRange;
        int hashCode6 = (hashCode5 + (iArr5 == null ? 0 : Arrays.hashCode(iArr5))) * 31;
        int[] iArr6 = this.heightRange;
        return hashCode6 + (iArr6 != null ? Arrays.hashCode(iArr6) : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FilterGroup(qualityRange=");
        C0JT.LIZLLL(this.qualityRange, LIZ, ", codecList=");
        LIZ.append(this.codecList);
        LIZ.append(", fpsRange=");
        C0JT.LIZLLL(this.fpsRange, LIZ, ", bitrateRange=");
        C0JT.LIZLLL(this.bitrateRange, LIZ, ", minWidthRange=");
        C0JT.LIZLLL(this.minWidthRange, LIZ, ", widthRange=");
        C0JT.LIZLLL(this.widthRange, LIZ, ", heightRange=");
        LIZ.append(Arrays.toString(this.heightRange));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int[] getBitrateRange() {
        return this.bitrateRange;
    }

    public final List<Integer> getCodecList() {
        return this.codecList;
    }

    public final int[] getFpsRange() {
        return this.fpsRange;
    }

    public final int[] getHeightRange() {
        return this.heightRange;
    }

    public final int[] getMinWidthRange() {
        return this.minWidthRange;
    }

    public final int[] getQualityRange() {
        return this.qualityRange;
    }

    public final int[] getWidthRange() {
        return this.widthRange;
    }

    private final boolean hasContainsCodec(int i) {
        List<Integer> list = this.codecList;
        if (list == null) {
            return true;
        }
        return list.contains(Integer.valueOf(i));
    }

    private final boolean isBitrateInRange(int i) {
        return isInRange(this.bitrateRange, i);
    }

    private final boolean isFpsInRange(int i) {
        return isInRange(this.fpsRange, i);
    }

    private final boolean isHeightInRange(int i) {
        return isInRange(this.heightRange, i);
    }

    private final boolean isMinWidthInRange(int i) {
        return isInRange(this.minWidthRange, i);
    }

    private final boolean isQualityInRange(int i) {
        return isInRange(this.qualityRange, i);
    }

    private final boolean isWidthInRange(int i) {
        return isInRange(this.widthRange, i);
    }

    public final <T extends IYN> boolean isMatch(T t) {
        boolean z = false;
        if (t == null) {
            return false;
        }
        if (isQualityInRange(t.getQualityType()) && hasContainsCodec(t.isBytevc1()) && isFpsInRange((int) t.getFps()) && isMinWidthInRange(Math.min(t.getVideoWidth(), t.getVideoHeight())) && isWidthInRange(t.getVideoWidth()) && isHeightInRange(t.getVideoHeight()) && isBitrateInRange(t.getBitRate())) {
            z = true;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this);
        LIZ.append(": ");
        LIZ.append(C78857UxB.LJJJLL(t));
        LIZ.append(" ==> ");
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0011, code lost:
    
        if (r6[1] == (-1)) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isInRange(int[] r6, int r7) {
        /*
            r5 = this;
            r4 = 0
            r3 = 1
            if (r6 != 0) goto L6
        L4:
            r4 = 1
        L5:
            return r4
        L6:
            int r1 = r6.length
            r0 = 2
            if (r1 != r0) goto L4
            r2 = r6[r4]
            r1 = -1
            if (r2 != r1) goto L14
            r0 = r6[r3]
            if (r0 != r1) goto L16
            goto L4
        L14:
            if (r2 != r1) goto L1b
        L16:
            r0 = r6[r3]
            if (r7 > r0) goto L5
            goto L4
        L1b:
            r0 = r6[r3]
            if (r0 != r1) goto L22
            if (r2 > r7) goto L5
            goto L4
        L22:
            if (r2 > r7) goto L5
            if (r7 > r0) goto L5
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.FilterGroup.isInRange(int[], int):boolean");
    }

    public FilterGroup(int[] iArr, List<Integer> list, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6) {
        this.qualityRange = iArr;
        this.codecList = list;
        this.fpsRange = iArr2;
        this.bitrateRange = iArr3;
        this.minWidthRange = iArr4;
        this.widthRange = iArr5;
        this.heightRange = iArr6;
    }
}
