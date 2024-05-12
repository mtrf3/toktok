package com.ss.android.ugc.aweme.search.pages.voice.musicsearch.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class SongInfo extends F9E {

    @InterfaceC65349Pkn("ArtistName")
    public final String artistName;

    @InterfaceC65349Pkn("ID")
    public final String songId;

    @InterfaceC65349Pkn("SongName")
    public final String songName;

    /* JADX WARN: Multi-variable type inference failed */
    public SongInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.songId, this.songName, this.artistName};
    }

    public SongInfo(String songId, String songName, String artistName) {
        o.LJIIIZ(songId, "songId");
        o.LJIIIZ(songName, "songName");
        o.LJIIIZ(artistName, "artistName");
        this.songId = songId;
        this.songName = songName;
        this.artistName = artistName;
    }

    public /* synthetic */ SongInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
