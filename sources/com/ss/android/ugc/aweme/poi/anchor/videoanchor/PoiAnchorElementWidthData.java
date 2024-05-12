package com.ss.android.ugc.aweme.poi.anchor.videoanchor;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class PoiAnchorElementWidthData extends F9E {
    public final int expectSuffixWidth;
    public final int expectTag1Width;
    public final int expectTag2Width;
    public final int expectTitleWidth;
    public final int suffixWidth;
    public final int tag1Width;
    public final int tag2Width;
    public final int tagDividerWidth;
    public final int tagLineWidth;
    public final int titleDividerWidth;
    public final int titleLineWidth;
    public final int titleWidth;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PoiAnchorElementWidthData() {
        /*
            r15 = this;
            r1 = 0
            r13 = 4095(0xfff, float:5.738E-42)
            r14 = 0
            r0 = r15
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r1
            r12 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.anchor.videoanchor.PoiAnchorElementWidthData.<init>():void");
    }

    public static /* synthetic */ PoiAnchorElementWidthData copy$default(PoiAnchorElementWidthData poiAnchorElementWidthData, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i = poiAnchorElementWidthData.expectTitleWidth;
        }
        if ((i13 & 2) != 0) {
            i2 = poiAnchorElementWidthData.expectSuffixWidth;
        }
        if ((i13 & 4) != 0) {
            i3 = poiAnchorElementWidthData.expectTag1Width;
        }
        if ((i13 & 8) != 0) {
            i4 = poiAnchorElementWidthData.expectTag2Width;
        }
        if ((i13 & 16) != 0) {
            i5 = poiAnchorElementWidthData.titleWidth;
        }
        if ((i13 & 32) != 0) {
            i6 = poiAnchorElementWidthData.titleDividerWidth;
        }
        if ((i13 & 64) != 0) {
            i7 = poiAnchorElementWidthData.suffixWidth;
        }
        if ((i13 & 128) != 0) {
            i8 = poiAnchorElementWidthData.titleLineWidth;
        }
        if ((i13 & 256) != 0) {
            i9 = poiAnchorElementWidthData.tag1Width;
        }
        if ((i13 & 512) != 0) {
            i10 = poiAnchorElementWidthData.tagDividerWidth;
        }
        if ((i13 & 1024) != 0) {
            i11 = poiAnchorElementWidthData.tag2Width;
        }
        if ((i13 & 2048) != 0) {
            i12 = poiAnchorElementWidthData.tagLineWidth;
        }
        return poiAnchorElementWidthData.copy(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12);
    }

    public final PoiAnchorElementWidthData copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        return new PoiAnchorElementWidthData(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.expectTitleWidth), Integer.valueOf(this.expectSuffixWidth), Integer.valueOf(this.expectTag1Width), Integer.valueOf(this.expectTag2Width), Integer.valueOf(this.titleWidth), Integer.valueOf(this.titleDividerWidth), Integer.valueOf(this.suffixWidth), Integer.valueOf(this.titleLineWidth), Integer.valueOf(this.tag1Width), Integer.valueOf(this.tagDividerWidth), Integer.valueOf(this.tag2Width), Integer.valueOf(this.tagLineWidth)};
    }

    public final int getExpectSuffixWidth() {
        return this.expectSuffixWidth;
    }

    public final int getExpectTag1Width() {
        return this.expectTag1Width;
    }

    public final int getExpectTag2Width() {
        return this.expectTag2Width;
    }

    public final int getExpectTitleWidth() {
        return this.expectTitleWidth;
    }

    public final int getSuffixWidth() {
        return this.suffixWidth;
    }

    public final int getTag1Width() {
        return this.tag1Width;
    }

    public final int getTag2Width() {
        return this.tag2Width;
    }

    public final int getTagDividerWidth() {
        return this.tagDividerWidth;
    }

    public final int getTagLineWidth() {
        return this.tagLineWidth;
    }

    public final int getTitleDividerWidth() {
        return this.titleDividerWidth;
    }

    public final int getTitleLineWidth() {
        return this.titleLineWidth;
    }

    public final int getTitleWidth() {
        return this.titleWidth;
    }

    public PoiAnchorElementWidthData(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.expectTitleWidth = i;
        this.expectSuffixWidth = i2;
        this.expectTag1Width = i3;
        this.expectTag2Width = i4;
        this.titleWidth = i5;
        this.titleDividerWidth = i6;
        this.suffixWidth = i7;
        this.titleLineWidth = i8;
        this.tag1Width = i9;
        this.tagDividerWidth = i10;
        this.tag2Width = i11;
        this.tagLineWidth = i12;
    }

    public /* synthetic */ PoiAnchorElementWidthData(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i, (i13 & 2) != 0 ? 0 : i2, (i13 & 4) != 0 ? 0 : i3, (i13 & 8) != 0 ? 0 : i4, (i13 & 16) != 0 ? 0 : i5, (i13 & 32) != 0 ? 0 : i6, (i13 & 64) != 0 ? 0 : i7, (i13 & 128) != 0 ? 0 : i8, (i13 & 256) != 0 ? 0 : i9, (i13 & 512) != 0 ? 0 : i10, (i13 & 1024) != 0 ? 0 : i11, (i13 & 2048) == 0 ? i12 : 0);
    }
}
