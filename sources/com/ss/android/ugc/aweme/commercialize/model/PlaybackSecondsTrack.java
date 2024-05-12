package com.ss.android.ugc.aweme.commercialize.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PlaybackSecondsTrack {

    @InterfaceC65349Pkn("seconds")
    public final int seconds;

    @InterfaceC65349Pkn("url_list")
    public final List<String> urlList;

    /* JADX WARN: Multi-variable type inference failed */
    public PlaybackSecondsTrack() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaybackSecondsTrack)) {
            return false;
        }
        PlaybackSecondsTrack playbackSecondsTrack = (PlaybackSecondsTrack) obj;
        return this.seconds == playbackSecondsTrack.seconds && o.LJ(this.urlList, playbackSecondsTrack.urlList);
    }

    public final int hashCode() {
        int i = this.seconds * 31;
        List<String> list = this.urlList;
        return i + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlaybackSecondsTrack(seconds=");
        LIZ.append(this.seconds);
        LIZ.append(", urlList=");
        return C1NE.LIZIZ(LIZ, this.urlList, ')', LIZ);
    }

    public PlaybackSecondsTrack(int i, List<String> list) {
        this.seconds = i;
        this.urlList = list;
    }

    public /* synthetic */ PlaybackSecondsTrack(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : list);
    }
}
