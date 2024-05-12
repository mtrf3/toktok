package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* loaded from: classes16.dex */
public class MusicList extends BaseResponse {

    @InterfaceC65349Pkn("child_collections")
    public List<MusicCollectionItem> childCollections;

    @InterfaceC65349Pkn("cursor")
    public int cursor;

    @InterfaceC65349Pkn("has_more")
    public int hasMore;

    @InterfaceC65349Pkn("is_vertical_playlist")
    public Boolean isVerticalPlaylist;

    @InterfaceC65349Pkn("music_list")
    public List<Music> items;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @InterfaceC65349Pkn("music_type")
    public int mMusicType;

    @InterfaceC65349Pkn("similar_song_ids")
    public List<Long> mSimilarSongIDs;

    @InterfaceC65349Pkn("mc_info")
    public MusicCollectionItem mcInfo;

    @InterfaceC65349Pkn("radio_cursor")
    public int radioCursor;

    @InterfaceC65349Pkn("recall_info_list")
    public List<MusicRecallInfo> recallInfo;

    @InterfaceC65349Pkn("suggestion_id")
    public Long suggestionId;

    public int getCursor() {
        int i = this.radioCursor;
        if (i > 0) {
            return i;
        }
        return this.cursor;
    }

    public Boolean getIsVerticalPlaylist() {
        boolean z;
        Boolean bool = this.isVerticalPlaylist;
        if (bool != null && bool.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z ? 1 : 0;
    }
}
