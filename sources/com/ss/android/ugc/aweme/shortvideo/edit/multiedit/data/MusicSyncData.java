package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data;

import X.C43917HLl;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MusicSyncData extends F9E implements Serializable, Parcelable {
    public static final Parcelable.Creator<MusicSyncData> CREATOR = new C43917HLl();

    @InterfaceC65349Pkn("music_sync_video_duration")
    public final long videoDuration;

    @InterfaceC65349Pkn("music_sync_end")
    public final long videoEnd;

    @InterfaceC65349Pkn("music_sync_start")
    public final long videoStart;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MusicSyncData() {
        /*
            r9 = this;
            r1 = 0
            r7 = 7
            r8 = 0
            r0 = r9
            r3 = r1
            r5 = r1
            r0.<init>(r1, r3, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MusicSyncData.<init>():void");
    }

    public static /* synthetic */ MusicSyncData copy$default(MusicSyncData musicSyncData, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = musicSyncData.videoStart;
        }
        if ((i & 2) != 0) {
            j2 = musicSyncData.videoEnd;
        }
        if ((i & 4) != 0) {
            j3 = musicSyncData.videoDuration;
        }
        return musicSyncData.copy(j, j2, j3);
    }

    public final MusicSyncData copy(long j, long j2, long j3) {
        return new MusicSyncData(j, j2, j3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.videoStart), Long.valueOf(this.videoEnd), Long.valueOf(this.videoDuration)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeLong(this.videoStart);
        out.writeLong(this.videoEnd);
        out.writeLong(this.videoDuration);
    }

    public final long getVideoDuration() {
        return this.videoDuration;
    }

    public final long getVideoEnd() {
        return this.videoEnd;
    }

    public final long getVideoStart() {
        return this.videoStart;
    }

    public MusicSyncData(long j, long j2, long j3) {
        this.videoStart = j;
        this.videoEnd = j2;
        this.videoDuration = j3;
    }

    public /* synthetic */ MusicSyncData(long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3);
    }
}
