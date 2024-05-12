package com.ss.android.ugc.aweme.sticker.model;

import X.AnonymousClass629;
import X.HHC;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DiyPropVideo implements Serializable, Parcelable {
    public static final Parcelable.Creator<DiyPropVideo> CREATOR = new HHC();

    @InterfaceC65349Pkn("endTime")
    public long endTime;

    @InterfaceC65349Pkn("maxDuration")
    public final long maxDuration;

    @InterfaceC65349Pkn("uid")
    public final String uid;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("videoPath")
    public final String videoPath;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.videoPath);
        parcel.writeLong(this.maxDuration);
        parcel.writeLong(this.endTime);
        parcel.writeString(this.uid);
    }

    public int hashCode() {
        return this.videoPath.hashCode();
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getMaxDuration() {
        return this.maxDuration;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public boolean equals(Object obj) {
        if (obj instanceof BackgroundVideo) {
            return o.LJ(this.videoPath, ((BackgroundVideo) obj).getVideoPath());
        }
        return false;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public DiyPropVideo(String videoPath, long j, long j2, String uid) {
        o.LJIIIZ(videoPath, "videoPath");
        o.LJIIIZ(uid, "uid");
        this.videoPath = videoPath;
        this.maxDuration = j;
        this.endTime = j2;
        this.uid = uid;
    }

    public /* synthetic */ DiyPropVideo(String str, long j, long j2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? AnonymousClass629.LIZ("UUID.randomUUID().toString()") : str2);
    }
}
