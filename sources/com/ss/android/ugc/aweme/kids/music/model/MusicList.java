package com.ss.android.ugc.aweme.kids.music.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.List;

/* loaded from: classes16.dex */
public class MusicList extends BaseResponse {

    @InterfaceC65349Pkn("child_collections")
    public List<MusicCollectionItem> childCollections;

    @InterfaceC65349Pkn("cursor")
    public int cursor;

    @InterfaceC65349Pkn("has_more")
    public int hasMore;

    @InterfaceC65349Pkn("music_list")
    public List<Music> items;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @InterfaceC65349Pkn("music_type")
    public int mMusicType;

    @InterfaceC65349Pkn("mc_info")
    public MusicCollectionItem mcInfo;

    @InterfaceC65349Pkn("radio_cursor")
    public int radioCursor;
}
