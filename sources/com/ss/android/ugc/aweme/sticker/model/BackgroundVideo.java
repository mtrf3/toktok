package com.ss.android.ugc.aweme.sticker.model;

import X.AnonymousClass629;
import X.ESV;
import X.HH1;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class BackgroundVideo implements Serializable, Parcelable {
    public static final Parcelable.Creator<BackgroundVideo> CREATOR = new ESV();

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("audioPath")
    public final String audioPath;

    @InterfaceC65349Pkn("endTime")
    public long endTime;

    @InterfaceC65349Pkn("isMultiBgVideo")
    public final boolean isMultiBgVideo;

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
        parcel.writeString(this.audioPath);
        parcel.writeLong(this.maxDuration);
        parcel.writeInt(this.isMultiBgVideo ? 1 : 0);
        parcel.writeLong(this.endTime);
        parcel.writeString(this.uid);
    }

    public int hashCode() {
        return this.videoPath.hashCode();
    }

    public final String getAudioPath() {
        return this.audioPath;
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

    public final boolean isMultiBgVideo() {
        return this.isMultiBgVideo;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BackgroundVideo)) {
            return false;
        }
        BackgroundVideo backgroundVideo = (BackgroundVideo) obj;
        if (!o.LJ(this.videoPath, backgroundVideo.videoPath) || !o.LJ(this.audioPath, backgroundVideo.audioPath)) {
            return false;
        }
        return true;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public BackgroundVideo(String str, String str2, long j, boolean z, long j2, String str3) {
        HH1.LIZ(str, "videoPath", str2, "audioPath", str3, "uid");
        this.videoPath = str;
        this.audioPath = str2;
        this.maxDuration = j;
        this.isMultiBgVideo = z;
        this.endTime = j2;
        this.uid = str3;
    }

    public /* synthetic */ BackgroundVideo(String str, String str2, long j, boolean z, long j2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, (i & 8) != 0 ? false : z, (i & 16) != 0 ? 0L : j2, (i & 32) != 0 ? AnonymousClass629.LIZ("UUID.randomUUID().toString()") : str3);
    }
}
