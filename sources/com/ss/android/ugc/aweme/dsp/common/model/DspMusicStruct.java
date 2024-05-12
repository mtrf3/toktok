package com.ss.android.ugc.aweme.dsp.common.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.music.model.Dsp;
import com.ss.android.ugc.aweme.music.model.Music;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class DspMusicStruct implements Serializable {

    @InterfaceC65349Pkn("chorus_only")
    public boolean chorusOnly;

    @InterfaceC65349Pkn("count_played")
    public Long countPlayed;

    @InterfaceC65349Pkn("cover_main_color_rgb")
    public final String coverMainColor;

    @InterfaceC65349Pkn("is_hot")
    public Boolean isHot;

    @InterfaceC65349Pkn("is_new_release")
    public Boolean isNewRelease;

    @InterfaceC65349Pkn("music")
    public final Music music;

    @InterfaceC65349Pkn("music_dsp_info")
    public final Dsp musicDspInfo;

    @InterfaceC65349Pkn("new_release_start_time")
    public Long newReleaseStartTime;

    @InterfaceC65349Pkn("play_info")
    public MusicPlayInfo playInfo = new MusicPlayInfo();

    public final boolean getChorusOnly() {
        return this.chorusOnly;
    }

    public final Long getCountPlayed() {
        return this.countPlayed;
    }

    public final String getCoverMainColor() {
        return this.coverMainColor;
    }

    public final Music getMusic() {
        return this.music;
    }

    public final Dsp getMusicDspInfo() {
        return this.musicDspInfo;
    }

    public final Long getNewReleaseStartTime() {
        return this.newReleaseStartTime;
    }

    public final MusicPlayInfo getPlayInfo() {
        return this.playInfo;
    }

    public final Boolean isHot() {
        return this.isHot;
    }

    public final Boolean isNewRelease() {
        return this.isNewRelease;
    }

    public final void setChorusOnly(boolean z) {
        this.chorusOnly = z;
    }

    public final void setCountPlayed(Long l) {
        this.countPlayed = l;
    }

    public final void setHot(Boolean bool) {
        this.isHot = bool;
    }

    public final void setNewRelease(Boolean bool) {
        this.isNewRelease = bool;
    }

    public final void setNewReleaseStartTime(Long l) {
        this.newReleaseStartTime = l;
    }

    public final void setPlayInfo(MusicPlayInfo musicPlayInfo) {
        o.LJIIIZ(musicPlayInfo, "<set-?>");
        this.playInfo = musicPlayInfo;
    }
}
