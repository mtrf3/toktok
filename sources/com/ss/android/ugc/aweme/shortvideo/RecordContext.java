package com.ss.android.ugc.aweme.shortvideo;

import X.F9E;
import X.HBX;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.filter.StrArray;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class RecordContext extends F9E implements Parcelable {
    public static final Parcelable.Creator<RecordContext> CREATOR = new HBX();
    public final StrArray eyesLables;
    public final StrArray filterEnterMethod;
    public final StrArray filterIds;
    public final StrArray filterLabels;
    public final StrArray filterValues;
    public final StrArray reshapeLabels;
    public final StrArray smoothSkinLabels;
    public final StrArray tanningLabels;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RecordContext() {
        /*
            r9 = this;
            r1 = 0
            r8 = 255(0xff, float:3.57E-43)
            r0 = r9
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.RecordContext.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.filterLabels, this.filterIds, this.filterValues, this.filterEnterMethod, this.smoothSkinLabels, this.reshapeLabels, this.eyesLables, this.tanningLabels};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeParcelable(this.filterLabels, i);
        parcel.writeParcelable(this.filterIds, i);
        parcel.writeParcelable(this.filterValues, i);
        parcel.writeParcelable(this.filterEnterMethod, i);
        parcel.writeParcelable(this.smoothSkinLabels, i);
        parcel.writeParcelable(this.reshapeLabels, i);
        parcel.writeParcelable(this.eyesLables, i);
        parcel.writeParcelable(this.tanningLabels, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ RecordContext(com.ss.android.ugc.aweme.filter.StrArray r2, com.ss.android.ugc.aweme.filter.StrArray r3, com.ss.android.ugc.aweme.filter.StrArray r4, com.ss.android.ugc.aweme.filter.StrArray r5, com.ss.android.ugc.aweme.filter.StrArray r6, com.ss.android.ugc.aweme.filter.StrArray r7, com.ss.android.ugc.aweme.filter.StrArray r8, int r9) {
        /*
            r1 = this;
            r0 = r9 & 1
            if (r0 == 0) goto L9
            com.ss.android.ugc.aweme.filter.StrArray r2 = new com.ss.android.ugc.aweme.filter.StrArray
            r2.<init>()
        L9:
            r0 = r9 & 2
            if (r0 == 0) goto L12
            com.ss.android.ugc.aweme.filter.StrArray r3 = new com.ss.android.ugc.aweme.filter.StrArray
            r3.<init>()
        L12:
            r0 = r9 & 4
            if (r0 == 0) goto L1b
            com.ss.android.ugc.aweme.filter.StrArray r4 = new com.ss.android.ugc.aweme.filter.StrArray
            r4.<init>()
        L1b:
            r0 = r9 & 8
            if (r0 == 0) goto L24
            com.ss.android.ugc.aweme.filter.StrArray r5 = new com.ss.android.ugc.aweme.filter.StrArray
            r5.<init>()
        L24:
            r0 = r9 & 16
            if (r0 == 0) goto L2d
            com.ss.android.ugc.aweme.filter.StrArray r6 = new com.ss.android.ugc.aweme.filter.StrArray
            r6.<init>()
        L2d:
            r0 = r9 & 32
            if (r0 == 0) goto L36
            com.ss.android.ugc.aweme.filter.StrArray r7 = new com.ss.android.ugc.aweme.filter.StrArray
            r7.<init>()
        L36:
            r0 = r9 & 64
            if (r0 == 0) goto L3f
            com.ss.android.ugc.aweme.filter.StrArray r8 = new com.ss.android.ugc.aweme.filter.StrArray
            r8.<init>()
        L3f:
            r0 = r9 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L4c
            com.ss.android.ugc.aweme.filter.StrArray r9 = new com.ss.android.ugc.aweme.filter.StrArray
            r9.<init>()
        L48:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L4c:
            r9 = 0
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.RecordContext.<init>(com.ss.android.ugc.aweme.filter.StrArray, com.ss.android.ugc.aweme.filter.StrArray, com.ss.android.ugc.aweme.filter.StrArray, com.ss.android.ugc.aweme.filter.StrArray, com.ss.android.ugc.aweme.filter.StrArray, com.ss.android.ugc.aweme.filter.StrArray, com.ss.android.ugc.aweme.filter.StrArray, int):void");
    }

    public RecordContext(StrArray filterLabels, StrArray filterIds, StrArray filterValues, StrArray filterEnterMethod, StrArray smoothSkinLabels, StrArray reshapeLabels, StrArray eyesLables, StrArray tanningLabels) {
        o.LJIIIZ(filterLabels, "filterLabels");
        o.LJIIIZ(filterIds, "filterIds");
        o.LJIIIZ(filterValues, "filterValues");
        o.LJIIIZ(filterEnterMethod, "filterEnterMethod");
        o.LJIIIZ(smoothSkinLabels, "smoothSkinLabels");
        o.LJIIIZ(reshapeLabels, "reshapeLabels");
        o.LJIIIZ(eyesLables, "eyesLables");
        o.LJIIIZ(tanningLabels, "tanningLabels");
        this.filterLabels = filterLabels;
        this.filterIds = filterIds;
        this.filterValues = filterValues;
        this.filterEnterMethod = filterEnterMethod;
        this.smoothSkinLabels = smoothSkinLabels;
        this.reshapeLabels = reshapeLabels;
        this.eyesLables = eyesLables;
        this.tanningLabels = tanningLabels;
    }
}
