package com.ss.android.ugc.aweme.tools.music.music.recent.apis;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class RecentMusicListRequest {
    public static final /* synthetic */ int LIZ = 0;

    @InterfaceC65349Pkn("music_ids")
    public final String[] musicIds;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecentMusicListRequest) && o.LJ(this.musicIds, ((RecentMusicListRequest) obj).musicIds);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.musicIds);
    }

    public final String toString() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("RecentMusicListRequest(musicIds=");
        return q.LIZIZ(LIZ2, Arrays.toString(this.musicIds), ')', LIZ2);
    }

    public RecentMusicListRequest(String[] musicIds) {
        o.LJIIIZ(musicIds, "musicIds");
        this.musicIds = musicIds;
    }
}
