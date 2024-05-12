package com.ss.android.ugc.aweme.tools.music.music.recent.apis;

import X.AbstractC73672Svk;
import X.E8M;
import X.InterfaceC195727mC;
import com.ss.android.ugc.aweme.shortvideo.model.MusicList;

/* loaded from: classes7.dex */
public interface RecentMusicNetworkAPI {
    @E8M("/aweme/v1/music/detail/list/")
    AbstractC73672Svk<MusicList> getMusicDetailByIdList(@InterfaceC195727mC RecentMusicListRequest recentMusicListRequest);
}
