package com.ss.android.ugc.aweme.shortvideo.jsbopenrecord;

import X.C0MT;
import X.GPV;
import X.HBY;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CompressConfig implements Parcelable {
    public static final Parcelable.Creator<CompressConfig> CREATOR = new HBY();

    @GPV
    public final Float imageCompress;

    @GPV
    public final ArrayList<Integer> targetSize;

    @GPV
    public final Float videoCompress;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompressConfig)) {
            return false;
        }
        CompressConfig compressConfig = (CompressConfig) obj;
        return o.LJ(this.imageCompress, compressConfig.imageCompress) && o.LJ(this.videoCompress, compressConfig.videoCompress) && o.LJ(this.targetSize, compressConfig.targetSize);
    }

    public final int hashCode() {
        Float f = this.imageCompress;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.videoCompress;
        int hashCode2 = (hashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        ArrayList<Integer> arrayList = this.targetSize;
        return hashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CompressConfig(imageCompress=");
        LIZ.append(this.imageCompress);
        LIZ.append(", videoCompress=");
        LIZ.append(this.videoCompress);
        LIZ.append(", targetSize=");
        LIZ.append(this.targetSize);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Float f = this.imageCompress;
        if (f == null) {
            out.writeInt(0);
        } else {
            C0MT.LIZJ(out, 1, f);
        }
        Float f2 = this.videoCompress;
        if (f2 == null) {
            out.writeInt(0);
        } else {
            C0MT.LIZJ(out, 1, f2);
        }
        ArrayList<Integer> arrayList = this.targetSize;
        if (arrayList == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(arrayList.size());
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            out.writeInt(it.next().intValue());
        }
    }

    public CompressConfig(Float f, Float f2, ArrayList<Integer> arrayList) {
        this.imageCompress = f;
        this.videoCompress = f2;
        this.targetSize = arrayList;
    }
}
