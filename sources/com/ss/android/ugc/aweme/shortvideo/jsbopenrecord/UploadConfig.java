package com.ss.android.ugc.aweme.shortvideo.jsbopenrecord;

import X.C05040Hs;
import X.C1FJ;
import X.GPV;
import X.HCU;
import X.JBR;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class UploadConfig implements Parcelable {
    public static final Parcelable.Creator<UploadConfig> CREATOR = new HCU();

    @GPV
    public final Long maxVideoDuration;

    @GPV
    public final Long minVideoDuration;

    @GPV
    public final boolean multiSelect;

    @GPV
    public final Integer selectUpPhotos;

    @GPV
    public final Integer selectUpVideos;

    @GPV
    public final TabType tabType;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadConfig)) {
            return false;
        }
        UploadConfig uploadConfig = (UploadConfig) obj;
        return this.tabType == uploadConfig.tabType && o.LJ(this.selectUpVideos, uploadConfig.selectUpVideos) && o.LJ(this.selectUpPhotos, uploadConfig.selectUpPhotos) && this.multiSelect == uploadConfig.multiSelect && o.LJ(this.minVideoDuration, uploadConfig.minVideoDuration) && o.LJ(this.maxVideoDuration, uploadConfig.maxVideoDuration);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.tabType.hashCode() * 31;
        Integer num = this.selectUpVideos;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.selectUpPhotos;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        boolean z = this.multiSelect;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        Long l = this.minVideoDuration;
        int hashCode4 = (i2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.maxVideoDuration;
        return hashCode4 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UploadConfig(tabType=");
        LIZ.append(this.tabType);
        LIZ.append(", selectUpVideos=");
        LIZ.append(this.selectUpVideos);
        LIZ.append(", selectUpPhotos=");
        LIZ.append(this.selectUpPhotos);
        LIZ.append(", multiSelect=");
        LIZ.append(this.multiSelect);
        LIZ.append(", minVideoDuration=");
        LIZ.append(this.minVideoDuration);
        LIZ.append(", maxVideoDuration=");
        return JBR.LJ(LIZ, this.maxVideoDuration, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.tabType.writeToParcel(out, i);
        Integer num = this.selectUpVideos;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Integer num2 = this.selectUpPhotos;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        out.writeInt(this.multiSelect ? 1 : 0);
        Long l = this.minVideoDuration;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        Long l2 = this.maxVideoDuration;
        if (l2 == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l2);
        }
    }

    public UploadConfig(TabType tabType, Integer num, Integer num2, boolean z, Long l, Long l2) {
        o.LJIIIZ(tabType, "tabType");
        this.tabType = tabType;
        this.selectUpVideos = num;
        this.selectUpPhotos = num2;
        this.multiSelect = z;
        this.minVideoDuration = l;
        this.maxVideoDuration = l2;
    }
}
