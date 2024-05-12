package com.ss.android.ugc.aweme.dsp.common.preload;

import X.C16880lQ;
import X.C38827FLr;
import X.C91089Zoz;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.X8M;
import X.YBK;
import X.YBM;
import android.os.Bundle;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.dsp.common.api.MusicDspApi;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;
import com.ss.android.ugc.aweme.dsp.playpage.model.DspFeedResponse;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class MusicDspPreload implements X8M<MusicDspApi.MusicDspOperatorApi, Future<DspFeedResponse>> {
    public static final C91089Zoz Companion = new C91089Zoz();

    @Override // X.X8D
    public boolean enable(Bundle bundle) {
        return true;
    }

    @Override // X.X8M
    public C38827FLr getPreloadStrategy(Bundle bundle) {
        return new C38827FLr(YBK.LIZ().firstFrameOpt.getPreloadTtl(), Api.LIZ, true);
    }

    @Override // X.X8M
    public boolean handleException(Exception exception) {
        o.LJIIIZ(exception, "exception");
        C16880lQ.LLLLIIL(exception);
        return true;
    }

    @Override // X.X8M
    public Future<DspFeedResponse> preload(Bundle bundle, InterfaceC88472Yns<? super Class<MusicDspApi.MusicDspOperatorApi>, ? extends MusicDspApi.MusicDspOperatorApi> create) {
        List<String> expiredPreviewFullClipIds;
        o.LJIIIZ(create, "create");
        YBM.LIZ.getClass();
        if (YBM.LIZIZ()) {
            expiredPreviewFullClipIds = ExpiredPlayableManager.INSTANCE.getExpiredFullClipIds();
        } else {
            ExpiredPlayableManager expiredPlayableManager = ExpiredPlayableManager.INSTANCE;
            expiredPreviewFullClipIds = expiredPlayableManager.getExpiredPreviewFullClipIds();
            if (expiredPreviewFullClipIds.isEmpty()) {
                expiredPreviewFullClipIds = expiredPlayableManager.getExpiredFullClipIds();
            }
        }
        MusicDspApi.MusicDspOperatorApi invoke = create.invoke(MusicDspApi.MusicDspOperatorApi.class);
        String LLD = ORZ.LLD(expiredPreviewFullClipIds, ",", null, null, null, 62);
        ArrayList arrayList = new ArrayList();
        arrayList.add("channel");
        arrayList.add("use_pre_ca");
        return invoke.preloadMusicFeed(1, LLD, 1, new PreloadExtraInfo(0, "track_reco", null, "/tiktok/music/dsp/feed/get/v2/", arrayList), 1, YBM.LIZLLL(), YBM.LIZ().getDspClipShowStrategy(), true);
    }
}
