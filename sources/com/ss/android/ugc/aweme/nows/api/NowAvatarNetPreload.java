package com.ss.android.ugc.aweme.nows.api;

import X.C38827FLr;
import X.C47261Igj;
import X.C7XB;
import X.C7XF;
import X.InterfaceC37276Ek4;
import X.InterfaceC88472Yns;
import X.X8M;
import android.os.Bundle;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.models.NowFeedResponse;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowAvatarNetPreload implements X8M<INowApi, InterfaceC37276Ek4<NowFeedResponse>> {
    public static final C7XB Companion = new Object() { // from class: X.7XB
    };

    @Override // X.X8D
    public boolean enable(Bundle bundle) {
        return true;
    }

    @Override // X.X8M
    public boolean handleException(Exception exception) {
        o.LJIIIZ(exception, "exception");
        return true;
    }

    @Override // X.X8M
    public C38827FLr getPreloadStrategy(Bundle bundle) {
        return new C38827FLr(0, Api.LIZ, false, 5);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.X8M
    public InterfaceC37276Ek4<NowFeedResponse> preload(Bundle bundle, InterfaceC88472Yns<? super Class<INowApi>, ? extends INowApi> create) {
        ArrayList<String> arrayList;
        o.LJIIIZ(create, "create");
        if (bundle != null) {
            arrayList = bundle.getStringArrayList("insert_user_ids");
        } else {
            arrayList = null;
        }
        return C7XF.LIZ(create.invoke(INowApi.class), 0L, 20, 1, new PreloadExtraInfo(-1, "", "", "/tiktok/v1/now/feed", C47261Igj.LJJIJIIJI("cursor", "count", "insert_ids", "insert_user_ids")), String.valueOf(arrayList), null, 80);
    }
}
