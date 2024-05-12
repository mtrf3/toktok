package com.ss.android.ugc.aweme.music.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class MusicReleaseInfo extends F9E implements Serializable {

    @InterfaceC65349Pkn("group_release_date")
    public long groupReleaseDate;

    @InterfaceC65349Pkn("is_new_release_song")
    public boolean isNewReleaseSong;

    public MusicReleaseInfo() {
    }

    public static /* synthetic */ MusicReleaseInfo copy$default(MusicReleaseInfo musicReleaseInfo, boolean z, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            z = musicReleaseInfo.isNewReleaseSong;
        }
        if ((i & 2) != 0) {
            j = musicReleaseInfo.groupReleaseDate;
        }
        return musicReleaseInfo.copy(z, j);
    }

    public final MusicReleaseInfo copy(boolean z, long j) {
        return new MusicReleaseInfo(z, j);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isNewReleaseSong), Long.valueOf(this.groupReleaseDate)};
    }

    public final long getGroupReleaseDate() {
        return this.groupReleaseDate;
    }

    public final boolean isNewReleaseSong() {
        return this.isNewReleaseSong;
    }

    public MusicReleaseInfo(boolean z, long j) {
        this.isNewReleaseSong = z;
        this.groupReleaseDate = j;
    }
}
