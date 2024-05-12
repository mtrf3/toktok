package com.ss.android.ugc.aweme.dsp.common.preload;

import X.C16880lQ;
import X.C38827FLr;
import X.C91088Zoy;
import X.InterfaceC88472Yns;
import X.X8M;
import X.YBK;
import android.os.Bundle;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.dsp.common.api.MusicDspApi;
import com.ss.android.ugc.aweme.dsp.library.net.DSPCollectMusicResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.concurrent.Future;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class MusicDspCollectPreload implements X8M<MusicDspApi.MusicDspOperatorApi, Future<DSPCollectMusicResponse>> {
    public static final C91088Zoy Companion = new C91088Zoy();

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
    public Future<DSPCollectMusicResponse> preload(Bundle bundle, InterfaceC88472Yns<? super Class<MusicDspApi.MusicDspOperatorApi>, ? extends MusicDspApi.MusicDspOperatorApi> create) {
        o.LJIIIZ(create, "create");
        return create.invoke(MusicDspApi.MusicDspOperatorApi.class).preloadCollectList(0L, 50L, "", "", "", CardStruct.IStatusCode.DEFAULT, 1);
    }
}
