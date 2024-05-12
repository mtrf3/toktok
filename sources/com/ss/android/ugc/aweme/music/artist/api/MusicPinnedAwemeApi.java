package com.ss.android.ugc.aweme.music.artist.api;

import X.AbstractC73672Svk;
import X.C9T0;
import X.E8L;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.music.artist.model.ArtistMusicAwemeResponse;

/* loaded from: classes5.dex */
public interface MusicPinnedAwemeApi {
    public static final C9T0 LIZ = C9T0.LIZ;

    @E8M("/tiktok/music/pinned_aweme/delete/v1/")
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse> deletePinnedAweme(@InterfaceC64985Pev("music_id") String str, @InterfaceC64985Pev("aweme_id") String str2);

    @E8L("/tiktok/v1/music/aweme/list/")
    AbstractC73672Svk<ArtistMusicAwemeResponse> getArtistMusicAwemeList(@InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("filter_mid") String str);

    @E8M("/tiktok/music/pinned_aweme/update/v1/")
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse> updatePinnedAweme(@InterfaceC64985Pev("music_id") String str, @InterfaceC64985Pev("aweme_id") String str2);
}
