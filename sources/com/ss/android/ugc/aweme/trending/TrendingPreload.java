package com.ss.android.ugc.aweme.trending;

import X.AbstractC73672Svk;
import X.C38827FLr;
import X.C47261Igj;
import X.EFJ;
import X.InterfaceC88472Yns;
import X.X8M;
import android.os.Bundle;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import com.ss.android.ugc.aweme.search.TrendingItems;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TrendingPreload implements X8M<TrendingDetailApi, AbstractC73672Svk<TrendingItems>> {
    @Override // X.X8D
    public boolean enable(Bundle bundle) {
        if (bundle == null || !bundle.getBoolean("enablePreload")) {
            return false;
        }
        return true;
    }

    @Override // X.X8M
    public C38827FLr getPreloadStrategy(Bundle bundle) {
        return new C38827FLr(20000, EFJ.LIZJ, false, 4);
    }

    @Override // X.X8M
    public boolean handleException(Exception exception) {
        o.LJIIJ(exception, "exception");
        throw exception;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.X8M
    public AbstractC73672Svk<TrendingItems> preload(Bundle bundle, InterfaceC88472Yns<? super Class<TrendingDetailApi>, ? extends TrendingDetailApi> create) {
        String str;
        o.LJIIIZ(create, "create");
        String str2 = null;
        if (bundle != null) {
            str = bundle.getString("trending_event_id");
            str2 = bundle.getString("outer_aweme_id");
        } else {
            str = null;
        }
        return create.invoke(TrendingDetailApi.class).getTrendingDetailFYP(str, 0, 10, str2, 0, null, null, true, 1, new PreloadExtraInfo(-1, "", "", "tiktok/trends/inflow/video/v1/", C47261Igj.LJJIJ("event_id")));
    }
}
