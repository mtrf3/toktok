package com.ss.android.ugc.aweme.nows.api;

import X.C36922EeM;
import X.C38827FLr;
import X.C47261Igj;
import X.C7XC;
import X.C7XD;
import X.C7XF;
import X.InterfaceC37276Ek4;
import X.InterfaceC88472Yns;
import X.X8M;
import android.os.Bundle;
import android.util.Log;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabPreloadTTLSetting;
import com.ss.android.ugc.aweme.models.NowFeedResponse;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowFeedPreload implements X8M<INowApi, InterfaceC37276Ek4<NowFeedResponse>> {
    public static final C7XC Companion = new Object() { // from class: X.7XC
    };
    public static boolean preloadAbort;

    @Override // X.X8D
    public boolean enable(Bundle bundle) {
        return true;
    }

    @Override // X.X8M
    public C38827FLr getPreloadStrategy(Bundle bundle) {
        return new C38827FLr(FriendsTabPreloadTTLSetting.INSTANCE.getValue(), Api.LIZ, true);
    }

    @Override // X.X8M
    public boolean handleException(Exception exception) {
        o.LJIIIZ(exception, "exception");
        String LIZLLL = C7XD.LIZLLL("NowFeedPreload");
        if (C36922EeM.LIZ) {
            C36922EeM.LIZLLL(6, LIZLLL, Log.getStackTraceString(exception));
            return true;
        }
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.X8M
    public InterfaceC37276Ek4<NowFeedResponse> preload(Bundle bundle, InterfaceC88472Yns<? super Class<INowApi>, ? extends INowApi> create) {
        o.LJIIIZ(create, "create");
        return C7XF.LIZ(create.invoke(INowApi.class), 0L, 20, 1, new PreloadExtraInfo(-1, "", "", "/tiktok/v1/now/feed", C47261Igj.LJJIJIIJI("cursor", "count", "insert_ids", "insert_user_ids")), null, null, 112);
    }
}
