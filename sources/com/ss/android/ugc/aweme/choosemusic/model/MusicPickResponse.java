package com.ss.android.ugc.aweme.choosemusic.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import java.util.List;

/* loaded from: classes16.dex */
public class MusicPickResponse extends BaseResponse {

    @InterfaceC65349Pkn("banner_list")
    public List<Banner> bannerList;

    @InterfaceC65349Pkn("extra_music_list")
    public List<Music> extraMusicList;

    @InterfaceC65349Pkn("has_more")
    public int hasMore;

    @InterfaceC65349Pkn("mc_list")
    public List<MusicCollectionItem> musicCollectionList;

    @InterfaceC65349Pkn("music_list")
    public List<Music> musicList;

    @InterfaceC65349Pkn("music_list_type")
    public int musicListType;

    @InterfaceC65349Pkn("radio_cursor")
    public int radioCursor;
}
