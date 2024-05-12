package com.bytedance.android.live.effect.music;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.C76800UCe;
import X.E8L;
import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.bytedance.android.live.effect.music.entity.AccompanimentsResponse;
import com.bytedance.android.live.effect.music.entity.AlbumsResponse;
import tikcast.api.anchor.FavouritesSongsResponse;
import tikcast.api.anchor.PlaylistAddReq;
import tikcast.api.anchor.PlaylistAddResponse;
import tikcast.api.anchor.PlaylistDeleteResponse;
import tikcast.api.anchor.PlaylistSongsResponse;
import webcast.api.room.CollectionSongsResponse;
import webcast.api.room.MusicResponse;

/* loaded from: classes.dex */
public interface AccompanimentApi {
    @E8M("/webcast/anchor/music/favourites/add/")
    @InterfaceC195757mF
    Object addFavoriteSong(@InterfaceC64985Pev("song_id") long j, InterfaceC67352kd<? super C28467BFf<C76800UCe>> interfaceC67352kd);

    @E8M("/webcast/anchor/music/playlist/add/")
    Object addPlaylistSong(@InterfaceC195727mC PlaylistAddReq playlistAddReq, InterfaceC67352kd<? super C28467BFf<PlaylistAddResponse.ResponseData>> interfaceC67352kd);

    @E8M("/webcast/anchor/music/favourites/delete/")
    @InterfaceC195757mF
    Object deleteFavoriteSong(@InterfaceC64985Pev("song_id") long j, InterfaceC67352kd<? super C28467BFf<C76800UCe>> interfaceC67352kd);

    @E8L("/webcast/anchor/music/playlist/songs/")
    Object fetchPlaylist(@InterfaceC64986Pew("offset") long j, @InterfaceC64986Pew("count") long j2, InterfaceC67352kd<? super C28467BFf<PlaylistSongsResponse.ResponseData>> interfaceC67352kd);

    @E8L("/webcast/room/music/collection/songs/")
    AbstractC73672Svk<C28467BFf<AccompanimentsResponse>> getAccompanimentsWithAlbumId(@InterfaceC64986Pew("collection_id") long j, @InterfaceC64986Pew("offset") long j2, @InterfaceC64986Pew("count") long j3);

    @E8L("/webcast/room/music/")
    AbstractC73672Svk<C28467BFf<AlbumsResponse>> getAlbums();

    @E8L("/webcast/room/music/")
    Object initData(@InterfaceC64986Pew("last_playlist_song_id") long j, InterfaceC67352kd<? super C28467BFf<MusicResponse.Packs>> interfaceC67352kd);

    @E8L("/webcast/anchor/music/favourites/songs/")
    Object loadMoreFavoriteSongs(@InterfaceC64986Pew("offset") long j, @InterfaceC64986Pew("count") long j2, InterfaceC67352kd<? super C28467BFf<FavouritesSongsResponse.ResponseData>> interfaceC67352kd);

    @E8L("/webcast/room/music/collection/songs/")
    Object loadMoreSongs(@InterfaceC64986Pew("collection_id") long j, @InterfaceC64986Pew("offset") long j2, @InterfaceC64986Pew("count") long j3, InterfaceC67352kd<? super C28467BFf<CollectionSongsResponse.PageSongs>> interfaceC67352kd);

    @E8M("/webcast/anchor/music/playlist/delete/")
    @InterfaceC195757mF
    Object removePlaylistSong(@InterfaceC64985Pev("song_id") long j, InterfaceC67352kd<? super C28467BFf<PlaylistDeleteResponse.ResponseData>> interfaceC67352kd);
}
