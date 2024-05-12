package com.ss.android.ugc.aweme.shortvideo.cut;

import X.C43855HJb;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class BackgroundVideoCompileConfigure extends CutVideoCompileConfigure {
    public static final Parcelable.Creator<BackgroundVideoCompileConfigure> CREATOR = new C43855HJb();
    public final String audioOutputPath;
    public final String videoOutputPath;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.videoOutputPath);
        out.writeString(this.audioOutputPath);
    }

    public BackgroundVideoCompileConfigure() {
        this("", "");
    }

    public final int hashCode() {
        return this.audioOutputPath.hashCode() + (this.videoOutputPath.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BackgroundVideoCompileConfigure(videoOutputPath=");
        LIZ.append(this.videoOutputPath);
        LIZ.append(", audioOutputPath=");
        return q.LIZIZ(LIZ, this.audioOutputPath, ')', LIZ);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.CutVideoCompileConfigure
    public final String LIZ() {
        return this.audioOutputPath;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.CutVideoCompileConfigure
    public final String LIZIZ() {
        return this.videoOutputPath;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackgroundVideoCompileConfigure)) {
            return false;
        }
        BackgroundVideoCompileConfigure backgroundVideoCompileConfigure = (BackgroundVideoCompileConfigure) obj;
        if (o.LJ(this.videoOutputPath, backgroundVideoCompileConfigure.videoOutputPath) && o.LJ(this.audioOutputPath, backgroundVideoCompileConfigure.audioOutputPath)) {
            return true;
        }
        return false;
    }

    public BackgroundVideoCompileConfigure(String videoOutputPath, String audioOutputPath) {
        o.LJIIIZ(videoOutputPath, "videoOutputPath");
        o.LJIIIZ(audioOutputPath, "audioOutputPath");
        this.videoOutputPath = videoOutputPath;
        this.audioOutputPath = audioOutputPath;
    }
}
