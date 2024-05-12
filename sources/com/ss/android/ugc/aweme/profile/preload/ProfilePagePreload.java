package com.ss.android.ugc.aweme.profile.preload;

import X.C16880lQ;
import X.C38827FLr;
import X.C76L;
import X.InterfaceC88472Yns;
import X.X8M;
import android.os.Bundle;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.app.api.Api;
import java.util.ArrayList;
import java.util.concurrent.Future;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ProfilePagePreload implements X8M<Api.NetApi, Future<String>> {
    @Override // X.X8D
    public boolean enable(Bundle bundle) {
        if (bundle != null && bundle.getString("preload_profile_page_url") != null) {
            return true;
        }
        return false;
    }

    @Override // X.X8M
    public C38827FLr getPreloadStrategy(Bundle bundle) {
        if (bundle != null && bundle.containsKey("profile_aweme_ttl")) {
            return new C38827FLr(bundle.getInt("profile_aweme_ttl"), Api.LIZ, false);
        }
        return new C38827FLr(0, Api.LIZ, false, 5);
    }

    @Override // X.X8M
    public boolean handleException(Exception exception) {
        o.LJIIIZ(exception, "exception");
        C16880lQ.LLLLIIL(exception);
        return true;
    }

    @Override // X.X8M
    public Future<String> preload(Bundle bundle, InterfaceC88472Yns<? super Class<Api.NetApi>, ? extends Api.NetApi> create) {
        String str;
        o.LJIIIZ(create, "create");
        Parcelable parcelable = null;
        if (bundle != null) {
            str = bundle.getString("preload_profile_page_url");
        } else {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        if (bundle != null) {
            parcelable = bundle.getParcelable("preload_profile_page_extra_info");
        }
        C76L<String> doGet = create.invoke(Api.NetApi.class).doGet(str, arrayList, parcelable);
        o.LJIIIIZZ(doGet, "create.invoke(Api.NetApi…rsList, preloadExtraInfo)");
        return doGet;
    }
}
