package com.ss.android.ugc.aweme.feed.assem.music.artistprofile;

import X.C33Q;
import X.C72250SXe;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes13.dex */
public final class VideoMusicCacheDataVM extends FeedBaseViewModel<C33Q> {
    public final ConcurrentHashMap<String, List<MusicOwnerInfo>> LJLJLLL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Integer> LJLL = new ConcurrentHashMap<>();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C72250SXe();
    }
}
