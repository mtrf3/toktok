package com.ss.android.ugc.asve.recorder;

import X.C43872HJs;
import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class RecorderConcatResult extends F9E implements Parcelable {
    public static final C43872HJs CREATOR = new C43872HJs();
    public final String audioPath;
    public final int ret;
    public final String videoPath;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.ret), this.videoPath, this.audioPath};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeInt(this.ret);
        parcel.writeString(this.videoPath);
        parcel.writeString(this.audioPath);
    }

    public RecorderConcatResult(int i, String videoPath, String audioPath) {
        o.LJIIIZ(videoPath, "videoPath");
        o.LJIIIZ(audioPath, "audioPath");
        this.ret = i;
        this.videoPath = videoPath;
        this.audioPath = audioPath;
    }
}
