package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class MusicDetail extends BaseResponse {

    @InterfaceC65349Pkn("ai_recommend_show_type")
    public final int aiRecommendShowType;

    @InterfaceC65349Pkn("ai_recommend_video")
    public final List<Aweme> aiRecommendVideoList;

    @InterfaceC65349Pkn("behind_the_song_exist")
    public final boolean behindTheSongExist;

    @InterfaceC65349Pkn("billboard_type")
    public int billboardType;

    @InterfaceC65349Pkn("edition_uid")
    public int editionUid;

    @InterfaceC65349Pkn("highlight_music")
    public final Music highlightMusic;

    @InterfaceC65349Pkn("bind_commerce_challenge")
    public final boolean isBindCommerceChallenge;
    public boolean isFromCache;

    @InterfaceC65349Pkn("music_info")
    public Music music;

    @InterfaceC65349Pkn("music_chart_rank")
    public MusicChartRankStruct musicChartRankStruct;

    @InterfaceC65349Pkn("music_resource_bit")
    public final MusicResourceBitStruct musicResourceBitStruct;

    @InterfaceC65349Pkn("people_also_like_info")
    public final PeopleAlsoLikeInfoStruct peopleAlsoLikeInfoStruct;

    @InterfaceC65349Pkn("ai_recommend_music")
    public final List<Music> recommendMusicList;

    @InterfaceC65349Pkn("rec_list")
    public List<? extends RelatedChallengeMusic> relatedChallengeMusicList;

    @InterfaceC65349Pkn("should_show_recommend_music")
    public final boolean showRecommendMusic;

    @InterfaceC65349Pkn("similar_music_ids")
    public final List<String> similarMusicIds;

    @InterfaceC65349Pkn("suggestion_id")
    public Long suggestionId;

    @InterfaceC65349Pkn("top_bodydance_avatars")
    public List<? extends UrlModel> topBodydanceAvatars;

    public final Music getHighlightMusic() {
        Music music;
        Music music2 = this.music;
        if (music2 != null && (music = this.highlightMusic) != null) {
            o.LJI(music2);
            music.setHighlightMusicOwnerInfo(music2.getMusicOwnerInfos());
        }
        return this.highlightMusic;
    }
}
