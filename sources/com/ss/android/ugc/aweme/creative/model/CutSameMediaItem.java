package com.ss.android.ugc.aweme.creative.model;

import X.C47959Irz;
import X.C79062V1e;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import X.JBR;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CutSameMediaItem;
import com.ss.android.ugc.aweme.creative.model.CutSameMediaItemCrop;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class CutSameMediaItem implements Parcelable {
    public static final Parcelable.Creator<CutSameMediaItem> CREATOR = new Parcelable.Creator<CutSameMediaItem>() { // from class: X.6qx
        @Override // android.os.Parcelable.Creator
        public final CutSameMediaItem createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            long readLong = parcel.readLong();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new CutSameMediaItem(readString, readLong, z, readString2, z2, z3, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readFloat(), CutSameMediaItemCrop.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final CutSameMediaItem[] newArray(int i) {
            return new CutSameMediaItem[i];
        }
    };

    @InterfaceC65349Pkn("alignMode")
    public final String alignMode;

    @InterfaceC65349Pkn("cartoonType")
    public final int cartoonType;

    @InterfaceC65349Pkn("crop")
    public final CutSameMediaItemCrop crop;

    @InterfaceC65349Pkn("cropScale")
    public final float cropScale;

    @InterfaceC65349Pkn("duration")
    public final long duration;

    @InterfaceC65349Pkn("gamePlayAlgorithm")
    public final String gamePlayAlgorithm;

    @InterfaceC65349Pkn("height")
    public final int height;

    @InterfaceC65349Pkn("isMutable")
    public final boolean isMutable;

    @InterfaceC65349Pkn("isReverse")
    public final boolean isReverse;

    @InterfaceC65349Pkn("isSubVideo")
    public final boolean isSubVideo;

    @InterfaceC65349Pkn("materialId")
    public final String materialId;

    @InterfaceC65349Pkn("mediaSrc")
    public final String mediaSrc;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("source")
    public final String source;

    @InterfaceC65349Pkn("sourceStartTime")
    public final long sourceStartTime;

    @InterfaceC65349Pkn("targetEndTime")
    public final long targetEndTime;

    @InterfaceC65349Pkn("targetStartTime")
    public final long targetStartTime;

    @InterfaceC65349Pkn("type")
    public final String type;

    @InterfaceC65349Pkn("volume")
    public final float volume;

    @InterfaceC65349Pkn("width")
    public final int width;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CutSameMediaItem() {
        /*
            r26 = this;
            r1 = 0
            r2 = 0
            r4 = 0
            r16 = 0
            r24 = 524287(0x7ffff, float:7.34683E-40)
            r0 = r26
            r5 = r1
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r11 = r2
            r13 = r1
            r14 = r2
            r17 = r1
            r18 = r1
            r19 = r1
            r20 = r1
            r21 = r2
            r23 = r16
            r25 = r1
            r0.<init>(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r16, r17, r18, r19, r20, r21, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.CutSameMediaItem.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutSameMediaItem)) {
            return false;
        }
        CutSameMediaItem cutSameMediaItem = (CutSameMediaItem) obj;
        return o.LJ(this.materialId, cutSameMediaItem.materialId) && this.targetStartTime == cutSameMediaItem.targetStartTime && this.isMutable == cutSameMediaItem.isMutable && o.LJ(this.alignMode, cutSameMediaItem.alignMode) && this.isSubVideo == cutSameMediaItem.isSubVideo && this.isReverse == cutSameMediaItem.isReverse && this.cartoonType == cutSameMediaItem.cartoonType && this.width == cutSameMediaItem.width && this.height == cutSameMediaItem.height && this.duration == cutSameMediaItem.duration && o.LJ(this.source, cutSameMediaItem.source) && this.sourceStartTime == cutSameMediaItem.sourceStartTime && Float.compare(this.cropScale, cutSameMediaItem.cropScale) == 0 && o.LJ(this.crop, cutSameMediaItem.crop) && o.LJ(this.type, cutSameMediaItem.type) && o.LJ(this.mediaSrc, cutSameMediaItem.mediaSrc) && o.LJ(this.gamePlayAlgorithm, cutSameMediaItem.gamePlayAlgorithm) && this.targetEndTime == cutSameMediaItem.targetEndTime && Float.compare(this.volume, cutSameMediaItem.volume) == 0;
    }

    public final String toString() {
        return "CutSameMediaItem(materialId=" + this.materialId + ", targetStartTime=" + this.targetStartTime + ", isMutable=" + this.isMutable + ", alignMode=" + this.alignMode + ", isSubVideo=" + this.isSubVideo + ", isReverse=" + this.isReverse + ", cartoonType=" + this.cartoonType + ", width=" + this.width + ", height=" + this.height + ", duration=" + this.duration + ", source=" + this.source + ", sourceStartTime=" + this.sourceStartTime + ", cropScale=" + this.cropScale + ", crop=" + this.crop + ", type=" + this.type + ", mediaSrc=" + this.mediaSrc + ", gamePlayAlgorithm=" + this.gamePlayAlgorithm + ", targetEndTime=" + this.targetEndTime + ", volume=" + this.volume + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.materialId);
        out.writeLong(this.targetStartTime);
        out.writeInt(this.isMutable ? 1 : 0);
        out.writeString(this.alignMode);
        out.writeInt(this.isSubVideo ? 1 : 0);
        out.writeInt(this.isReverse ? 1 : 0);
        out.writeInt(this.cartoonType);
        out.writeInt(this.width);
        out.writeInt(this.height);
        out.writeLong(this.duration);
        out.writeString(this.source);
        out.writeLong(this.sourceStartTime);
        out.writeFloat(this.cropScale);
        this.crop.writeToParcel(out, i);
        out.writeString(this.type);
        out.writeString(this.mediaSrc);
        out.writeString(this.gamePlayAlgorithm);
        out.writeLong(this.targetEndTime);
        out.writeFloat(this.volume);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.targetStartTime, this.materialId.hashCode() * 31, 31);
        boolean z = this.isMutable;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int LJ = C79062V1e.LJ(this.alignMode, (LIZJ + i2) * 31, 31);
        boolean z2 = this.isSubVideo;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (LJ + i3) * 31;
        if (!this.isReverse) {
            i = 0;
        }
        int LIZJ2 = JBR.LIZJ(this.duration, (((((((i4 + i) * 31) + this.cartoonType) * 31) + this.width) * 31) + this.height) * 31, 31);
        String str = this.source;
        int i5 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.mediaSrc, C79062V1e.LJ(this.type, (this.crop.hashCode() + C47959Irz.LIZIZ(this.cropScale, JBR.LIZJ(this.sourceStartTime, (LIZJ2 + hashCode) * 31, 31), 31)) * 31, 31), 31);
        String str2 = this.gamePlayAlgorithm;
        if (str2 != null) {
            i5 = str2.hashCode();
        }
        return Float.floatToIntBits(this.volume) + JBR.LIZJ(this.targetEndTime, (LJ2 + i5) * 31, 31);
    }

    public CutSameMediaItem(String materialId, long j, boolean z, String alignMode, boolean z2, boolean z3, int i, int i2, int i3, long j2, String str, long j3, float f, CutSameMediaItemCrop crop, String type, String mediaSrc, String str2, long j4, float f2) {
        o.LJIIIZ(materialId, "materialId");
        o.LJIIIZ(alignMode, "alignMode");
        o.LJIIIZ(crop, "crop");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(mediaSrc, "mediaSrc");
        this.materialId = materialId;
        this.targetStartTime = j;
        this.isMutable = z;
        this.alignMode = alignMode;
        this.isSubVideo = z2;
        this.isReverse = z3;
        this.cartoonType = i;
        this.width = i2;
        this.height = i3;
        this.duration = j2;
        this.source = str;
        this.sourceStartTime = j3;
        this.cropScale = f;
        this.crop = crop;
        this.type = type;
        this.mediaSrc = mediaSrc;
        this.gamePlayAlgorithm = str2;
        this.targetEndTime = j4;
        this.volume = f2;
    }

    public /* synthetic */ CutSameMediaItem(String str, long j, boolean z, String str2, boolean z2, boolean z3, int i, int i2, int i3, long j2, String str3, long j3, float f, CutSameMediaItemCrop cutSameMediaItemCrop, String str4, String str5, String str6, long j4, float f2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0L : j, (i4 & 4) != 0 ? false : z, (i4 & 8) != 0 ? "" : str2, (i4 & 16) != 0 ? false : z2, (i4 & 32) != 0 ? false : z3, (i4 & 64) != 0 ? 0 : i, (i4 & 128) != 0 ? 0 : i2, (i4 & 256) == 0 ? i3 : 0, (i4 & 512) != 0 ? 0L : j2, (i4 & 1024) != 0 ? "" : str3, (i4 & 2048) != 0 ? 0L : j3, (i4 & 4096) != 0 ? 0.0f : f, (i4 & FileUtils.BUFFER_SIZE) != 0 ? new CutSameMediaItemCrop(0.0f, 0.0f, 0.0f, 0.0f, 15, null) : cutSameMediaItemCrop, (i4 & 16384) != 0 ? "" : str4, (32768 & i4) != 0 ? "" : str5, (65536 & i4) == 0 ? str6 : "", (131072 & i4) != 0 ? 0L : j4, (i4 & 262144) == 0 ? f2 : 0.0f);
    }
}
