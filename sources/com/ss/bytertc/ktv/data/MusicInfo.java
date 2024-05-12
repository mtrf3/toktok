package com.ss.bytertc.ktv.data;

import X.X1D;

/* loaded from: classes33.dex */
public class MusicInfo {
    public int climaxEndTime;
    public int climaxStartTime;
    public int duration;
    public boolean enableScore;
    public LyricStatus lyricStatus;
    public String musicId;
    public String musicName;
    public String posterUrl;
    public String singer;
    public long updateTimestamp;
    public String vendorId;
    public String vendorName;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Music{musicId='");
        LIZ.append(this.musicId);
        LIZ.append('\'');
        LIZ.append(", musicName='");
        LIZ.append(this.musicName);
        LIZ.append('\'');
        LIZ.append(", singer='");
        LIZ.append(this.singer);
        LIZ.append('\'');
        LIZ.append(", vendorId='");
        LIZ.append(this.vendorId);
        LIZ.append('\'');
        LIZ.append(", vendorName='");
        LIZ.append(this.vendorName);
        LIZ.append('\'');
        LIZ.append(", updateTimestamp=");
        LIZ.append(this.updateTimestamp);
        LIZ.append(", posterUrl='");
        LIZ.append(this.posterUrl);
        LIZ.append('\'');
        LIZ.append(", lyricStatus=");
        LIZ.append(this.lyricStatus);
        LIZ.append(", duration=");
        LIZ.append(this.duration);
        LIZ.append(", enableScore=");
        LIZ.append(this.enableScore);
        LIZ.append(", climaxStartTime=");
        LIZ.append(this.climaxStartTime);
        LIZ.append(", climaxEndTime=");
        LIZ.append(this.climaxEndTime);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public MusicInfo(String str, String str2, String str3, String str4, String str5, long j, String str6, LyricStatus lyricStatus, int i, boolean z, int i2, int i3) {
        this.musicId = str;
        this.musicName = str2;
        this.singer = str3;
        this.vendorId = str4;
        this.vendorName = str5;
        this.updateTimestamp = j;
        this.posterUrl = str6;
        this.lyricStatus = lyricStatus;
        this.duration = i;
        this.enableScore = z;
        this.climaxStartTime = i2;
        this.climaxEndTime = i3;
    }
}
