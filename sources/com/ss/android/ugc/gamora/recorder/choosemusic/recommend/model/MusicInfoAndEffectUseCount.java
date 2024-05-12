package com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MusicInfoAndEffectUseCount extends F9E {

    @InterfaceC65349Pkn("music_id")
    public final long musicId;

    @InterfaceC65349Pkn("music_info")
    public final Music musicInfo;

    @InterfaceC65349Pkn("effect_use_count")
    public final long useCount;

    public static /* synthetic */ MusicInfoAndEffectUseCount copy$default(MusicInfoAndEffectUseCount musicInfoAndEffectUseCount, long j, long j2, Music music, int i, Object obj) {
        if ((i & 1) != 0) {
            j = musicInfoAndEffectUseCount.musicId;
        }
        if ((i & 2) != 0) {
            j2 = musicInfoAndEffectUseCount.useCount;
        }
        if ((i & 4) != 0) {
            music = musicInfoAndEffectUseCount.musicInfo;
        }
        return musicInfoAndEffectUseCount.copy(j, j2, music);
    }

    public final MusicInfoAndEffectUseCount copy(long j, long j2, Music musicInfo) {
        o.LJIIIZ(musicInfo, "musicInfo");
        return new MusicInfoAndEffectUseCount(j, j2, musicInfo);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.musicId), Long.valueOf(this.useCount), this.musicInfo};
    }

    public final long getMusicId() {
        return this.musicId;
    }

    public final Music getMusicInfo() {
        return this.musicInfo;
    }

    public final long getUseCount() {
        return this.useCount;
    }

    public MusicInfoAndEffectUseCount(long j, long j2, Music musicInfo) {
        o.LJIIIZ(musicInfo, "musicInfo");
        this.musicId = j;
        this.useCount = j2;
        this.musicInfo = musicInfo;
    }

    public /* synthetic */ MusicInfoAndEffectUseCount(long j, long j2, Music music, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1L : j, (i & 2) != 0 ? 0L : j2, music);
    }
}
