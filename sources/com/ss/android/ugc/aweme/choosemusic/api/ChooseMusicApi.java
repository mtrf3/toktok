package com.ss.android.ugc.aweme.choosemusic.api;

import X.C00F;
import X.C10K;
import X.C44208HWq;
import X.C46104I7o;
import X.C84887XTf;
import X.E4Q;
import X.E4T;
import X.E6L;
import X.H92;
import X.InterfaceC195787mI;
import X.InterfaceC44209HWr;
import X.InterfaceC51052K1w;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import Y.AgS49S0000000_15;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.choosemusic.model.MusicCollectionFeedResponse;
import com.ss.android.ugc.aweme.choosemusic.model.MusicPickResponse;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.music.model.FavoriteRecommendedMusicResponse;
import com.ss.android.ugc.aweme.music.model.MusicCollection;
import com.ss.android.ugc.aweme.music.model.MusicList;

/* loaded from: classes16.dex */
public final class ChooseMusicApi {
    public static final API LIZ = (API) C46104I7o.LJIIZILJ(InterfaceC51052K1w.LIZ, API.class);

    /* loaded from: classes16.dex */
    public interface API {
        @E4Q("/aweme/v1/music/collect/")
        C10K<BaseResponse> collectMusic(@InterfaceC64989Pez("music_id") String str, @InterfaceC64989Pez("action") int i);

        @E4Q("/aweme/v1/commerce/music/collection/feed/")
        C10K<MusicCollectionFeedResponse> commerceMusicCollectionFeed(@InterfaceC64989Pez("cursor") Integer num, @InterfaceC64989Pez("count") Integer num2);

        @E4Q("/aweme/v1/commerce/music/list/")
        C10K<MusicList> commerceMusicList(@InterfaceC64989Pez("mc_id") String str, @InterfaceC64989Pez("cursor") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("ai_recommend") int i3);

        @E4Q("/aweme/v1/commerce/music/pick/")
        C10K<MusicPickResponse> commerceMusicPick(@InterfaceC64989Pez("radio_cursor") Integer num, @InterfaceC64989Pez("extra_music_ids") String str, @InterfaceC64989Pez("is_commerce_music") Boolean bool);

        @E4Q("aweme/v1/commerce/music/hot/recommend/")
        C10K<MusicList> getCommerceHotMusicList(@InterfaceC64989Pez("song_id") String str, @InterfaceC64989Pez("item_id") String str2);

        @E4Q("/aweme/v1/commerce/music/choices/")
        C10K<MusicList> getCommerceMusicList();

        @E4Q("/aweme/v1/commerce/music/collection/")
        C10K<MusicCollection> getCommerceMusicSheet(@InterfaceC64989Pez("cursor") int i, @InterfaceC64989Pez("count") int i2);

        @E4Q("/tiktok/music/favorite_recommend/v1/")
        C10K<FavoriteRecommendedMusicResponse> getFavoriteRecommendedMusic(@InterfaceC64989Pez("cursor") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("from_scene") int i3);

        @E4Q("/aweme/v1/hot/music/")
        C10K<MusicList> getHotMusicList(@InterfaceC64989Pez("cursor") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("not_duplicate") boolean z, @InterfaceC64989Pez("sound_page_scene") int i3, @InterfaceC64989Pez("is_commercial_sound_page") int i4, @InterfaceC64989Pez("music_recommend_refer") int i5, @InterfaceC64989Pez("video_duration") Long l);

        @E4Q("/aweme/v1/music/collection/")
        C10K<MusicCollection> getMusicSheet(@InterfaceC64989Pez("cursor") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("sound_page_scene") int i3, @InterfaceC64989Pez("collection_type") int i4);

        @E4Q("/aweme/v1/music/recommend/by/video/")
        C10K<MusicList> getRecommendMusicListFromAI(@InterfaceC64989Pez("cursor") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("from") String str, @InterfaceC64989Pez("zip_uri") String str2, @InterfaceC64989Pez("music_ailab_ab") String str3, @InterfaceC64989Pez("creation_id") String str4, @InterfaceC64989Pez("micro_app_id") String str5, @InterfaceC64989Pez("video_duration") long j, @InterfaceC64989Pez("music_id") String str6, @InterfaceC64989Pez("enable_new_format") Integer num, @InterfaceC64989Pez("is_fetching_similar_songs") Integer num2, @InterfaceC64989Pez("is_copyright2") Integer num3, @InterfaceC64989Pez("zip_scenario") Integer num4, @InterfaceC64989Pez("is_ba_replace") int i3);

        @E4Q("/aweme/v1/sticker/music")
        C10K<MusicList> getStickerMusic(@InterfaceC64989Pez("sticker") String str);

        @E4Q("/aweme/v1/music/collection/feed/")
        C10K<MusicCollectionFeedResponse> musicCollectionFeed(@InterfaceC64989Pez("cursor") Integer num, @InterfaceC64989Pez("count") Integer num2, @InterfaceC64989Pez("sound_page_scene") int i);

        @E4Q("/aweme/v1/music/list/")
        C10K<MusicList> musicList(@InterfaceC64989Pez("mc_id") String str, @InterfaceC64989Pez("cursor") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("sound_page_scene") int i3);

        @E4Q("/aweme/v1/music/pick/")
        C10K<MusicPickResponse> musicPick(@InterfaceC64989Pez("radio_cursor") Integer num, @InterfaceC64989Pez("radio_count") Integer num2, @InterfaceC64989Pez("extra_music_ids") String str, @InterfaceC64989Pez("is_commerce_music") Boolean bool, @InterfaceC64989Pez("sound_page_scene") Integer num3, @InterfaceC64989Pez("zip_uri") String str2);

        @InterfaceC195787mI
        @E4T("/aweme/v1/music/pick/")
        C10K<MusicPickResponse> postMusicPick(@InterfaceC64987Pex("radio_cursor") Integer num, @InterfaceC64987Pex("radio_count") Integer num2, @InterfaceC64987Pex("extra_music_ids") String str, @InterfaceC64987Pex("is_commerce_music") Boolean bool, @InterfaceC64987Pex("sound_page_scene") Integer num3, @InterfaceC64987Pex("zip_uri") String str2, @InterfaceC64987Pex("music_consumption") String str3);

        @E6L(3)
        @E4T("/aweme/v1/music/pick/")
        @InterfaceC195787mI
        @InterfaceC44209HWr(4)
        C10K<MusicPickResponse> postMusicPickWithHighPriority(@InterfaceC64987Pex("radio_cursor") Integer num, @InterfaceC64987Pex("radio_count") Integer num2, @InterfaceC64987Pex("extra_music_ids") String str, @InterfaceC64987Pex("is_commerce_music") Boolean bool, @InterfaceC64987Pex("sound_page_scene") Integer num3, @InterfaceC64987Pex("zip_uri") String str2, @InterfaceC64987Pex("music_consumption") String str3);

        @E4Q("/aweme/v1/music/list/")
        C10K<MusicList> secondLevelMusicList(@InterfaceC64989Pez("mc_id") String str, @InterfaceC64989Pez("cursor") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("level") int i3, @InterfaceC64989Pez("sound_page_scene") int i4);

        @E4Q("/aweme/v1/user/music/collect/")
        C10K<CollectedMusicList> userCollectedMusicList(@InterfaceC64989Pez("cursor") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("scene") String str, @InterfaceC64989Pez("sound_page_scene") int i3);
    }

    public static boolean LIZJ() {
        if (CommerceMediaServiceImpl.LIZJ().LJIIIZ() || H92.LJ()) {
            return true;
        }
        return false;
    }

    public static C10K<MusicCollectionFeedResponse> LIZLLL(Integer num, Integer num2, int i) {
        if (LIZJ()) {
            return LIZ.commerceMusicCollectionFeed(num, num2);
        }
        return LIZ.musicCollectionFeed(num, num2, i);
    }

    public static C10K<MusicCollection> LIZIZ(int i, int i2, int i3, int i4) {
        if (LIZJ()) {
            return LIZ.getCommerceMusicSheet(i, i2);
        }
        return LIZ.getMusicSheet(i, i2, i3, i4);
    }

    public static C10K<CollectedMusicList> LJI(int i, int i2, String str, int i3) {
        if (LIZJ() || CommerceMediaServiceImpl.LIZJ().LJ()) {
            return LIZ.userCollectedMusicList(i, i2, "commerce", i3);
        }
        return LIZ.userCollectedMusicList(i, i2, str, i3);
    }

    public static C10K LJ(int i, int i2, int i3, int i4, String str) {
        if (LIZJ()) {
            API api = LIZ;
            H92.LJLIL.getClass();
            return api.commerceMusicList(str, i, i2, H92.LIZLLL() ? 1 : 0);
        }
        if (i3 == 0) {
            return LIZ.musicList(str, i, i2, i4);
        }
        return LIZ.secondLevelMusicList(str, i, i2, i3, i4);
    }

    public static C10K LIZ(int i, String str, boolean z, String str2, int i2, long j, int i3) {
        int i4;
        boolean z2;
        if ("profile_photo".equals(str) || "ai_avatar".equals(str)) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (C00F.LIZ(31744, 0, "studio_recommend_music_remove_duplicate", true) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Long l = null;
        Integer num = null;
        if (z2 && str2 != null) {
            API api = LIZ;
            if (C00F.LIZ(31744, 0, "studio_recommend_music_remove_duplicate", true) == 2) {
                num = 1;
            }
            return api.getRecommendMusicListFromAI(i, i2, "shoot_page", null, "1", str2, null, j, null, null, null, null, num, 0).LIZLLL(new AgS49S0000000_15(1));
        }
        API api2 = LIZ;
        boolean LIZJ = LIZJ();
        if (j > 0) {
            l = Long.valueOf(j);
        }
        return api2.getHotMusicList(i, i2, z, i3, LIZJ ? 1 : 0, i4, l).LIZLLL(new AgS49S0000000_15(2));
    }

    public static C10K<MusicPickResponse> LJFF(Integer num, Integer num2, String str, boolean z, int i, String str2, String str3) {
        if (LIZJ()) {
            return LIZ.commerceMusicPick(num, str, Boolean.valueOf(z));
        }
        if (C84887XTf.LIZ()) {
            if (C44208HWq.LIZ) {
                return LIZ.postMusicPickWithHighPriority(num, num2, str, Boolean.valueOf(z), Integer.valueOf(i), str2, str3);
            }
            return LIZ.postMusicPick(num, num2, str, Boolean.valueOf(z), Integer.valueOf(i), str2, str3);
        }
        return LIZ.musicPick(num, num2, str, Boolean.valueOf(z), Integer.valueOf(i), str2);
    }
}
