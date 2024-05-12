package com.ss.android.ugc.aweme.music.model;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class NewReleasedList extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("groups")
    public List<MusicGroup> newReleasedMusicGroups;

    @InterfaceC65349Pkn("musics")
    public List<? extends Music> newReleasedMusicList;

    public NewReleasedList() {
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        this.newReleasedMusicList = c61878OQg;
        this.newReleasedMusicGroups = c61878OQg;
    }

    public final List<MusicGroup> getNewReleasedMusicGroups() {
        return this.newReleasedMusicGroups;
    }

    public final List<Music> getNewReleasedMusicList() {
        return this.newReleasedMusicList;
    }

    public final void setNewReleasedMusicGroups(List<MusicGroup> list) {
        o.LJIIIZ(list, "<set-?>");
        this.newReleasedMusicGroups = list;
    }

    public final void setNewReleasedMusicList(List<? extends Music> list) {
        o.LJIIIZ(list, "<set-?>");
        this.newReleasedMusicList = list;
    }
}
