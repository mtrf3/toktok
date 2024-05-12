package com.ss.android.ugc.aweme.music.model;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class OriginalMusicList extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("cursor")
    public int cursor;

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("groups")
    public List<MusicGroup> musicGroups;

    @InterfaceC65349Pkn("music")
    public List<? extends Music> musicList;

    public OriginalMusicList() {
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        this.musicList = c61878OQg;
        this.musicGroups = c61878OQg;
    }

    public final int getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<MusicGroup> getMusicGroups() {
        return this.musicGroups;
    }

    public final List<Music> getMusicList() {
        return this.musicList;
    }

    public final void setCursor(int i) {
        this.cursor = i;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setMusicGroups(List<MusicGroup> list) {
        o.LJIIIZ(list, "<set-?>");
        this.musicGroups = list;
    }

    public final void setMusicList(List<? extends Music> list) {
        o.LJIIIZ(list, "<set-?>");
        this.musicList = list;
    }
}
