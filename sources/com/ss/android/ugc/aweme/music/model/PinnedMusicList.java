package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PinnedMusicList extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("highlight_group")
    public MusicGroup highlightedGroup;

    @InterfaceC65349Pkn("highlight_music")
    public Music highlightedMusic;

    @InterfaceC65349Pkn("music")
    public List<Music> musicList = new ArrayList();

    @InterfaceC65349Pkn("avalible_capicity")
    public int avalibleCapicity = 3;

    @InterfaceC65349Pkn("pinned_group")
    public List<MusicGroup> musicGroups = new ArrayList();

    public static /* synthetic */ void getHighlightedMusic$annotations() {
    }

    public static /* synthetic */ void getMusicList$annotations() {
    }

    public final int getAvalibleCapicity() {
        return this.avalibleCapicity;
    }

    public final MusicGroup getHighlightedGroup() {
        return this.highlightedGroup;
    }

    public final Music getHighlightedMusic() {
        return this.highlightedMusic;
    }

    public final List<MusicGroup> getMusicGroups() {
        return this.musicGroups;
    }

    public final List<Music> getMusicList() {
        return this.musicList;
    }

    public final void setAvalibleCapicity(int i) {
        this.avalibleCapicity = i;
    }

    public final void setHighlightedGroup(MusicGroup musicGroup) {
        this.highlightedGroup = musicGroup;
    }

    public final void setHighlightedMusic(Music music) {
        this.highlightedMusic = music;
    }

    public final void setMusicGroups(List<MusicGroup> list) {
        o.LJIIIZ(list, "<set-?>");
        this.musicGroups = list;
    }

    public final void setMusicList(List<Music> list) {
        o.LJIIIZ(list, "<set-?>");
        this.musicList = list;
    }
}
