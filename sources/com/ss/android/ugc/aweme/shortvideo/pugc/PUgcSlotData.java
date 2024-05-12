package com.ss.android.ugc.aweme.shortvideo.pugc;

import X.C47959Irz;
import X.C79062V1e;
import X.G9U;
import X.JBR;
import X.X1D;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PUgcSlotData implements Parcelable {
    public static final Parcelable.Creator<PUgcSlotData> CREATOR = new G9U();
    public Bitmap cover;
    public final float extraDuration;
    public boolean isFixed;
    public final boolean isVideoType;
    public final long slotStartTime;
    public final float startTime;
    public final String uuid;
    public final String videoPath;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PUgcSlotData)) {
            return false;
        }
        PUgcSlotData pUgcSlotData = (PUgcSlotData) obj;
        return o.LJ(this.uuid, pUgcSlotData.uuid) && o.LJ(this.videoPath, pUgcSlotData.videoPath) && Float.compare(this.extraDuration, pUgcSlotData.extraDuration) == 0 && this.isVideoType == pUgcSlotData.isVideoType && this.isFixed == pUgcSlotData.isFixed && this.slotStartTime == pUgcSlotData.slotStartTime && Float.compare(this.startTime, pUgcSlotData.startTime) == 0 && o.LJ(this.cover, pUgcSlotData.cover);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PUgcSlotData(uuid=");
        LIZ.append(this.uuid);
        LIZ.append(", videoPath=");
        LIZ.append(this.videoPath);
        LIZ.append(", extraDuration=");
        LIZ.append(this.extraDuration);
        LIZ.append(", isVideoType=");
        LIZ.append(this.isVideoType);
        LIZ.append(", isFixed=");
        LIZ.append(this.isFixed);
        LIZ.append(", slotStartTime=");
        LIZ.append(this.slotStartTime);
        LIZ.append(", startTime=");
        LIZ.append(this.startTime);
        LIZ.append(", cover=");
        LIZ.append(this.cover);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.uuid);
        out.writeString(this.videoPath);
        out.writeFloat(this.extraDuration);
        out.writeInt(this.isVideoType ? 1 : 0);
        out.writeInt(this.isFixed ? 1 : 0);
        out.writeLong(this.slotStartTime);
        out.writeFloat(this.startTime);
        out.writeParcelable(this.cover, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LIZIZ = C47959Irz.LIZIZ(this.extraDuration, C79062V1e.LJ(this.videoPath, this.uuid.hashCode() * 31, 31), 31);
        boolean z = this.isVideoType;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (LIZIZ + i2) * 31;
        if (!this.isFixed) {
            i = 0;
        }
        int LIZIZ2 = C47959Irz.LIZIZ(this.startTime, JBR.LIZJ(this.slotStartTime, (i3 + i) * 31, 31), 31);
        Bitmap bitmap = this.cover;
        if (bitmap == null) {
            hashCode = 0;
        } else {
            hashCode = bitmap.hashCode();
        }
        return LIZIZ2 + hashCode;
    }

    public PUgcSlotData(String uuid, String videoPath, float f, boolean z, boolean z2, long j, float f2, Bitmap bitmap) {
        o.LJIIIZ(uuid, "uuid");
        o.LJIIIZ(videoPath, "videoPath");
        this.uuid = uuid;
        this.videoPath = videoPath;
        this.extraDuration = f;
        this.isVideoType = z;
        this.isFixed = z2;
        this.slotStartTime = j;
        this.startTime = f2;
        this.cover = bitmap;
    }
}
