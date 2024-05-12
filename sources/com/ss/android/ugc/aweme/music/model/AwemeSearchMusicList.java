package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.Extra;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* loaded from: classes9.dex */
public class AwemeSearchMusicList {

    @InterfaceC65349Pkn("query_correct_info")
    public MusicSearchCorrectInfo correctInfo;

    @InterfaceC65349Pkn("cursor")
    public int cursor;

    @InterfaceC65349Pkn("extra")
    public Extra extra;

    @InterfaceC65349Pkn("global_doodle_config")
    public com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig globalDoodleConfig;

    @InterfaceC65349Pkn("has_more")
    public int hasMore;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @InterfaceC65349Pkn("music_info_list")
    public List<SearchMusic> searchMusicList;

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }
}
