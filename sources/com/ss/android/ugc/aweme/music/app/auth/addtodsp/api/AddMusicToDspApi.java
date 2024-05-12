package com.ss.android.ugc.aweme.music.app.auth.addtodsp.api;

import X.E8L;
import X.E8M;
import X.InterfaceC195787mI;
import X.InterfaceC64986Pew;
import X.InterfaceC64987Pex;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.AddSongToMusicAppResponse;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.DspPlaylistsResponse;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.SongCheckResponse;

/* loaded from: classes34.dex */
public interface AddMusicToDspApi {
    @InterfaceC195787mI
    @E8M("/tiktok/music/tt_to_dsp/playlist/song/update/v1")
    Object addSongToMusicApp(@InterfaceC64987Pex("platform") int i, @InterfaceC64987Pex("song_id") String str, @InterfaceC64987Pex("auth_token") String str2, @InterfaceC64987Pex("action") int i2, InterfaceC67352kd<? super AddSongToMusicAppResponse> interfaceC67352kd);

    @InterfaceC195787mI
    @E8M("/tiktok/music/tt_to_dsp/playlist/create/v1")
    Object createDspPlaylist(@InterfaceC64987Pex("platform") int i, @InterfaceC64987Pex("auth_token") String str, @InterfaceC64987Pex("pre_added_song_id") String str2, @InterfaceC64987Pex("title") String str3, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);

    @E8L("/tiktok/music/tt_to_dsp/playlist/list/v1")
    Object getDspPlaylists(@InterfaceC64986Pew("platform") int i, @InterfaceC64986Pew("auth_token") String str, @InterfaceC64986Pew("offset") Long l, @InterfaceC64986Pew("offset_str") String str2, @InterfaceC64986Pew("count") int i2, InterfaceC67352kd<? super DspPlaylistsResponse> interfaceC67352kd);

    @InterfaceC195787mI
    @E8M("/tiktok/music/tt_to_dsp/playlist/select/v1")
    Object selectDspPlaylist(@InterfaceC64987Pex("platform") int i, @InterfaceC64987Pex("song_id") String str, @InterfaceC64987Pex("playlist_id") String str2, @InterfaceC64987Pex("auth_token") String str3, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);

    @E8L("/tiktok/music/tt_to_dsp/song/check/v1")
    Object songCheckForDsp(@InterfaceC64986Pew("platform") int i, @InterfaceC64986Pew("song_id") String str, @InterfaceC64986Pew("auth_token") String str2, @InterfaceC64986Pew("region") String str3, InterfaceC67352kd<? super SongCheckResponse> interfaceC67352kd);
}
