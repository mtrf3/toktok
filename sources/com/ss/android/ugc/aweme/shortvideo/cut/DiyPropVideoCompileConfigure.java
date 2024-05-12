package com.ss.android.ugc.aweme.shortvideo.cut;

import X.C43854HJa;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DiyPropVideoCompileConfigure extends CutVideoCompileConfigure {
    public static final Parcelable.Creator<DiyPropVideoCompileConfigure> CREATOR = new C43854HJa();
    public final String videoOutputPath;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.videoOutputPath);
    }

    public DiyPropVideoCompileConfigure() {
        this("");
    }

    public final int hashCode() {
        return this.videoOutputPath.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DiyPropVideoCompileConfigure(videoOutputPath=");
        return q.LIZIZ(LIZ, this.videoOutputPath, ')', LIZ);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.CutVideoCompileConfigure
    public final String LIZIZ() {
        return this.videoOutputPath;
    }

    public DiyPropVideoCompileConfigure(String videoOutputPath) {
        o.LJIIIZ(videoOutputPath, "videoOutputPath");
        this.videoOutputPath = videoOutputPath;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DiyPropVideoCompileConfigure) && o.LJ(this.videoOutputPath, ((DiyPropVideoCompileConfigure) obj).videoOutputPath)) {
            return true;
        }
        return false;
    }
}
