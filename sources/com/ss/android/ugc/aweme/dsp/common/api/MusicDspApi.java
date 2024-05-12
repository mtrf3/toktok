package com.ss.android.ugc.aweme.dsp.common.api;

import X.AbstractC73672Svk;
import X.C76L;
import X.C91086Zow;
import X.E8L;
import X.E8M;
import X.EJ6;
import X.InterfaceC195737mD;
import X.InterfaceC195757mF;
import X.InterfaceC195767mG;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.dsp.common.model.DspDetailListResponse;
import com.ss.android.ugc.aweme.dsp.common.model.DspPlayInfoResponse;
import com.ss.android.ugc.aweme.dsp.library.net.DSPCollectMusicResponse;
import com.ss.android.ugc.aweme.dsp.playpage.model.DspFeedResponse;
import com.ss.android.ugc.aweme.dsp.playpage.subpage.model.DSPShuffleCollectResponse;
import java.util.List;

/* loaded from: classes22.dex */
public final class MusicDspApi {
    public static MusicDspOperatorApi LIZ;

    /* loaded from: classes22.dex */
    public interface MusicDspOperatorApi {
        @E8M("/tiktok/music/dsp/collect_song/v2/")
        @InterfaceC195757mF
        AbstractC73672Svk<BaseResponse> collectSong(@InterfaceC64985Pev("full_clip_id") String str, @InterfaceC64985Pev("action") int i, @InterfaceC64985Pev("music_id") String str2);

        @E8L("/tiktok/music/dsp/detail/list/v2/")
        AbstractC73672Svk<DspDetailListResponse> getDspDetail(@InterfaceC64986Pew("full_clip_ids") String str, @InterfaceC64986Pew("chorus_only_wmg") boolean z, @InterfaceC64986Pew("chorus_only_count") int i);

        @E8L("/tiktok/music/dsp/landing_page/v2/")
        Object getLandingPageInfo(@InterfaceC64986Pew("upsell_style_opt") int i, InterfaceC67352kd<? super DspDetailListResponse> interfaceC67352kd);

        @E8L("/tiktok/music/dsp/play_info/v2/")
        AbstractC73672Svk<DspPlayInfoResponse> getPlayInfo(@InterfaceC64986Pew("media_id") String str, @InterfaceC64986Pew("media_type") int i);

        @E8L("/tiktok/music/dsp/user/collect_song/list/v2/")
        AbstractC73672Svk<DSPCollectMusicResponse> loadCollectList(@InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") long j2, @InterfaceC64986Pew("full_clip_ids") String str, @InterfaceC64986Pew("clip_ids") String str2, @InterfaceC64986Pew("item_ids") String str3, @InterfaceC64986Pew("action") String str4, @InterfaceC64986Pew("media_type") int i, @InterfaceC195767mG List<EJ6> list);

        @E8M("/tiktok/music/dsp/feed/shuffle/v2/")
        @InterfaceC195757mF
        AbstractC73672Svk<DSPShuffleCollectResponse> loadShuffleCollectList(@InterfaceC64985Pev("played_clip_ids") String str, @InterfaceC64985Pev("candidate_clip_ids") String str2, @InterfaceC64985Pev("playing_clip_id") String str3, @InterfaceC64985Pev("media_type") int i, @InterfaceC64985Pev("load_type") int i2, @InterfaceC64985Pev("plug_type") int i3, @InterfaceC64985Pev("unplayed_clip_ids") String str4, @InterfaceC64985Pev("played_infos") String str5, @InterfaceC64985Pev("play_scene") int i4, @InterfaceC64985Pev("chorus_only_wmg") boolean z, @InterfaceC64985Pev("chorus_only_count") int i5, @InterfaceC195767mG List<EJ6> list);

        @E8L("/tiktok/music/dsp/user/collect_song/list/v2/")
        C76L<DSPCollectMusicResponse> preloadCollectList(@InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") long j2, @InterfaceC64986Pew("full_clip_ids") String str, @InterfaceC64986Pew("clip_ids") String str2, @InterfaceC64986Pew("item_ids") String str3, @InterfaceC64986Pew("action") String str4, @InterfaceC64986Pew("media_type") int i);

        @E8M("/tiktok/music/dsp/feed/get/v2/")
        @InterfaceC195757mF
        C76L<DspFeedResponse> preloadMusicFeed(@InterfaceC64985Pev("pull_type") int i, @InterfaceC64985Pev("played_clip_ids") String str, @InterfaceC64985Pev("media_type") int i2, @InterfaceC195737mD Object obj, @InterfaceC64985Pev("play_scene") int i3, @InterfaceC64985Pev("chorus_only_wmg") boolean z, @InterfaceC64985Pev("chorus_only_count") int i4, @InterfaceC64986Pew("use_pre_ca") boolean z2);

        @E8M("/tiktok/music/dsp/feed/shuffle/v2/")
        @InterfaceC195757mF
        C76L<DSPShuffleCollectResponse> preloadShuffleCollectList(@InterfaceC64985Pev("played_clip_ids") String str, @InterfaceC64985Pev("candidate_clip_ids") String str2, @InterfaceC64985Pev("playing_clip_id") String str3, @InterfaceC64985Pev("media_type") int i, @InterfaceC64985Pev("play_scene") int i2, @InterfaceC64985Pev("load_type") int i3, @InterfaceC64985Pev("chorus_only_wmg") boolean z, @InterfaceC64985Pev("chorus_only_count") int i4);

        @E8M("/tiktok/music/dsp/feed/get/v2/")
        @InterfaceC195757mF
        AbstractC73672Svk<DspFeedResponse> queryMusicFeed(@InterfaceC64985Pev("played_clip_ids") String str, @InterfaceC64985Pev("media_type") int i, @InterfaceC64985Pev("playing_clip_id") String str2, @InterfaceC64986Pew("use_pre_ca") boolean z, @InterfaceC64985Pev("unplayed_clip_ids") String str3, @InterfaceC64985Pev("played_infos") String str4, @InterfaceC64985Pev("play_scene") int i2, @InterfaceC64985Pev("need_retrieved_clip_ids") String str5, @InterfaceC64985Pev("chorus_only_wmg") boolean z2, @InterfaceC64985Pev("chorus_only_count") int i3, @InterfaceC195767mG List<EJ6> list);
    }

    static {
        new C91086Zow();
    }
}
