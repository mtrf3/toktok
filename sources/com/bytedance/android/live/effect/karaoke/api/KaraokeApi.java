package com.bytedance.android.live.effect.karaoke.api;

import X.C28467BFf;
import X.C76800UCe;
import X.E8L;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import tikcast.api.anchor.KaraokeQueueListResponse;
import tikcast.api.anchor.KaraokeReqListResponse;
import tikcast.api.anchor.KaraokeSearchResponse;
import tikcast.api.anchor.KaraokeTabListResponse;
import tikcast.api.anchor.KaraokeTabsListResponse;

/* loaded from: classes.dex */
public interface KaraokeApi {
    @E8L("/webcast/anchor/karaoke/queue/list/")
    Object getQueueSongList(@InterfaceC64986Pew("role") int i, @InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("offset") int i2, InterfaceC67352kd<? super C28467BFf<KaraokeQueueListResponse.Data>> interfaceC67352kd);

    @E8L("/webcast/anchor/karaoke/requests/list/")
    Object getRequestSongList(@InterfaceC64986Pew("role") int i, @InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("offset") int i2, @InterfaceC64986Pew("timestamp") long j2, @InterfaceC64986Pew("host_id") String str, InterfaceC67352kd<? super C28467BFf<KaraokeReqListResponse.Data>> interfaceC67352kd);

    @E8L("/webcast/anchor/karaoke/tab/list/")
    Object getSongListByOffset(@InterfaceC64986Pew("role") int i, @InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("tab_id") long j2, @InterfaceC64986Pew("offset") int i2, @InterfaceC64986Pew("host_id") String str, InterfaceC67352kd<? super C28467BFf<KaraokeTabListResponse.Data>> interfaceC67352kd);

    @E8L("/webcast/anchor/karaoke/tabs/list/")
    Object getTabWithSongList(@InterfaceC64986Pew("role") int i, @InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("host_id") String str, InterfaceC67352kd<? super C28467BFf<KaraokeTabsListResponse.Data>> interfaceC67352kd);

    @E8M("/webcast/anchor/karaoke/queue/update/")
    @InterfaceC195757mF
    Object nextQueueOnlyOne(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("song_id") long j2, @InterfaceC64985Pev("update_type") int i, InterfaceC67352kd<? super C28467BFf<C76800UCe>> interfaceC67352kd);

    @E8M("/webcast/anchor/karaoke/requests/update/")
    @InterfaceC195757mF
    Object requestSong(@InterfaceC64985Pev("song_id") long j, @InterfaceC64985Pev("update_type") int i, @InterfaceC64985Pev("room_id") long j2, @InterfaceC64985Pev("host_id") String str, InterfaceC67352kd<? super C28467BFf<C76800UCe>> interfaceC67352kd);

    @E8L("/webcast/anchor/karaoke/search/")
    Object searchSong(@InterfaceC64986Pew("role") int i, @InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("keywords") String str, @InterfaceC64986Pew("offset") int i2, InterfaceC67352kd<? super C28467BFf<KaraokeSearchResponse.Data>> interfaceC67352kd);

    @E8M("/webcast/anchor/karaoke/favorite/update/")
    @InterfaceC195757mF
    Object updateFavoriteStatus(@InterfaceC64985Pev("song_id") long j, @InterfaceC64985Pev("update_type") int i, InterfaceC67352kd<? super C28467BFf<C76800UCe>> interfaceC67352kd);

    @E8M("/webcast/anchor/karaoke/status/")
    @InterfaceC195757mF
    Object updateKaraokeState(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("op_type") int i, @InterfaceC64985Pev("status") int i2, @InterfaceC64985Pev("host_id") String str, InterfaceC67352kd<? super C28467BFf<C76800UCe>> interfaceC67352kd);

    @E8M("/webcast/anchor/karaoke/queue/update/")
    @InterfaceC195757mF
    Object updateQueueList(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("current_song_id") long j2, @InterfaceC64985Pev("update_type") int i, @InterfaceC64985Pev("next_song_id") long j3, InterfaceC67352kd<? super C28467BFf<C76800UCe>> interfaceC67352kd);
}
