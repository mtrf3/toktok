package com.ss.android.ugc.aweme.music.api;

import X.C10K;
import X.C76L;
import X.E8L;
import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC195757mF;
import X.InterfaceC195797mJ;
import X.InterfaceC36229EJt;
import X.InterfaceC37276Ek4;
import X.InterfaceC51052K1w;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.PVP;
import X.X1D;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.mime.TypedInput;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.music.model.MusicCollection;
import com.ss.android.ugc.aweme.music.model.MusicList;
import com.ss.android.ugc.aweme.music.model.SimpleMusicDetail;
import java.util.Map;

/* loaded from: classes16.dex */
public final class MusicApi {
    public static final MusicService LIZ;

    /* loaded from: classes16.dex */
    public interface MusicService {
        @E8L("/aweme/v1/commerce/music/collection/")
        C76L<MusicCollection> fetchCommerceMusicCollection(@InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") int i);

        @E8L("/aweme/v1/commerce/music/pick/")
        C76L<MusicList> fetchCommerceMusicHotList(@InterfaceC64986Pew("radio_cursor") long j);

        @E8L("/aweme/v1/commerce/music/list")
        C76L<MusicList> fetchCommerceMusicList(@InterfaceC64986Pew("mc_id") String str, @InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") int i);

        @E8L("/aweme/v1/commerce/music/beats/songs/")
        C76L<com.ss.android.ugc.aweme.shortvideo.model.MusicList> fetchCommerceStickPointMusicList(@InterfaceC64986Pew("cursor") int i, @InterfaceC64986Pew("count") int i2, @InterfaceC64986Pew("video_count") int i3, @InterfaceC64986Pew("video_duration") String str);

        @E8L("/aweme/v1/music/collection/")
        C76L<MusicCollection> fetchMusicCollection(@InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("sound_page_scene") int i2);

        @E8L("/aweme/v1/music/pick/")
        C76L<MusicList> fetchMusicHotList(@InterfaceC64986Pew("radio_cursor") long j, @InterfaceC64986Pew("sound_page_scene") int i);

        @E8L("/aweme/v1/music/list/")
        C76L<MusicList> fetchMusicList(@InterfaceC64986Pew("mc_id") String str, @InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("sound_page_scene") int i2);

        @E8L("/aweme/v1/music/beats/songs/")
        C76L<com.ss.android.ugc.aweme.shortvideo.model.MusicList> fetchStickPointMusicList(@InterfaceC64986Pew("cursor") int i, @InterfaceC64986Pew("count") int i2, @InterfaceC64986Pew("video_count") int i3, @InterfaceC64986Pew("video_duration") String str);

        @E8M("/tiktok/autocut/http-proxy/music/recommend/v1/")
        C10K<String> getAutoCutMusicList(@InterfaceC195727mC PVP pvp, @InterfaceC64986Pew("creation_id") String str, @InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("image_info_req_json") String str2, @InterfaceC64986Pew("account_type") int i2, @InterfaceC64986Pew("new_path") int i3, @InterfaceC64986Pew("featurebits") String str3, @InterfaceC64986Pew("media_count") int i4);

        @E8L("/tiktok/movie/studio/music/recommend/v1/")
        C10K<String> getAutoCutMusicList(@InterfaceC64986Pew("zip_uri") String str, @InterfaceC64986Pew("creation_id") String str2, @InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("image_info_req_json") String str3, @InterfaceC64986Pew("new_path") int i2, @InterfaceC64986Pew("featurebits") String str4, @InterfaceC64986Pew("media_count") int i3);

        @E8M("/tiktok/movie/studio/music/recommend/v1/")
        @InterfaceC195757mF
        C10K<String> getAutoCutMusicListByNewPath(@InterfaceC64986Pew("zip_uri") String str, @InterfaceC64986Pew("creation_id") String str2, @InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("image_info_req_json") String str3, @InterfaceC64986Pew("new_path") int i2, @InterfaceC64985Pev("rec_config") String str4, @InterfaceC64986Pew("featurebits") String str5, @InterfaceC64986Pew("media_count") int i3);

        @E8M("/media/api/music/pic/conf/")
        @InterfaceC195757mF
        C10K<String> getAutoCutNLEModel(@InterfaceC64985Pev("rec_config") String str, @InterfaceC64986Pew("rec_key") String str2);

        @E8L
        C76L<TypedInput> isUrlExpired(@InterfaceC195797mJ String str);

        @E8L("/aweme/v1/music/detail/")
        C76L<SimpleMusicDetail> queryMusic(@InterfaceC64986Pew("music_id") String str, @InterfaceC64986Pew("click_reason") int i);

        @E8L("/tiktok/v1/capcut/template/")
        C76L<SimpleMusicDetail> queryMusicByTemplateId(@InterfaceC64986Pew("template_id") String str);

        @E8M("/aweme/v1/upload/file/")
        C10K<String> uploadLocalMusic(@InterfaceC195727mC PVP pvp);

        @E8M("/aweme/v1/music/user/create/")
        @InterfaceC195757mF
        InterfaceC37276Ek4<String> uploadLocalMusicInfo(@InterfaceC36229EJt Map<String, String> map);
    }

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        String str = InterfaceC51052K1w.LIZ;
        LIZ2.append(str);
        LIZ2.append("/aweme/v1/upload/file/");
        X1D.LIZIZ(LIZ2);
        LIZ = (MusicService) RetrofitFactory.LIZLLL().LIZ(str).LJFF().LIZ.LIZ(MusicService.class);
    }

    public static SimpleMusicDetail LIZIZ(String str) {
        MusicService musicService = LIZ;
        if (str != null) {
            str = str.trim();
        }
        return musicService.queryMusic(str, 0).get();
    }

    public static MusicList LIZ(int i, int i2, String str) {
        if (CommerceMediaServiceImpl.LIZJ().LIZ() || CommerceMediaServiceImpl.LIZJ().LJIIIZ()) {
            return LIZ.fetchCommerceMusicList(str, i, i2).get();
        }
        return LIZ.fetchMusicList(str, i, i2, 0).get();
    }
}
