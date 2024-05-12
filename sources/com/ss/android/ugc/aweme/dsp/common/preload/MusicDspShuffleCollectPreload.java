package com.ss.android.ugc.aweme.dsp.common.preload;

import X.C16880lQ;
import X.C38827FLr;
import X.C91090Zp0;
import X.EnumC91180ZqS;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.X8M;
import X.YBK;
import X.YBM;
import android.os.Bundle;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.dsp.common.api.MusicDspApi;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;
import com.ss.android.ugc.aweme.dsp.playpage.subpage.model.DSPShuffleCollectResponse;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.List;
import java.util.concurrent.Future;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class MusicDspShuffleCollectPreload implements X8M<MusicDspApi.MusicDspOperatorApi, Future<DSPShuffleCollectResponse>> {
    public static final C91090Zp0 Companion = new C91090Zp0();

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
    public Future<DSPShuffleCollectResponse> preload(Bundle bundle, InterfaceC88472Yns<? super Class<MusicDspApi.MusicDspOperatorApi>, ? extends MusicDspApi.MusicDspOperatorApi> create) {
        String candidateClipIds;
        int i;
        o.LJIIIZ(create, "create");
        List<String> expiredFullClipIds = ExpiredPlayableManager.INSTANCE.getExpiredFullClipIds();
        if (expiredFullClipIds.size() > 1000) {
            expiredFullClipIds = expiredFullClipIds.subList(0, 1000);
        }
        String LLD = ORZ.LLD(expiredFullClipIds, ",", null, null, null, 62);
        String playingClipId = "";
        if (bundle == null) {
            candidateClipIds = "";
        } else {
            candidateClipIds = bundle.getString("candidateClipIds", "");
        }
        if (bundle != null) {
            playingClipId = bundle.getString("playingClipId", "");
        }
        MusicDspApi.MusicDspOperatorApi invoke = create.invoke(MusicDspApi.MusicDspOperatorApi.class);
        o.LJIIIIZZ(candidateClipIds, "candidateClipIds");
        o.LJIIIIZZ(playingClipId, "playingClipId");
        if (ActivityStack.isAppBackGround()) {
            i = 2;
        } else {
            i = 1;
        }
        int type = EnumC91180ZqS.VOD.getType();
        YBM.LIZ.getClass();
        return invoke.preloadShuffleCollectList(LLD, candidateClipIds, playingClipId, 1, i, type, YBM.LIZLLL(), YBM.LIZ().getDspClipShowStrategy());
    }
}
