package com.ss.android.ugc.aweme.search.pages.voice.musicsearch.model;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class MusicRecognitionResult extends F9E {

    @InterfaceC65349Pkn("SongInfo")
    public final List<SongInfo> songInfo;

    public MusicRecognitionResult() {
        this(null, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.songInfo};
    }

    public MusicRecognitionResult(List<SongInfo> songInfo) {
        o.LJIIIZ(songInfo, "songInfo");
        this.songInfo = songInfo;
    }

    public MusicRecognitionResult(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list);
    }
}
