package com.ss.android.ugc.aweme;

import X.C113554cx;
import X.C58096Mr6;
import X.M89;
import X.M8A;
import X.OSZ;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.detail.api.DetailApi;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.detail.ui.DetailFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class DetailFeedServiceImpl implements DetailFeedService {
    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Class<? extends Activity> LJIIIZ() {
        return DetailActivity.class;
    }

    public static DetailFeedService LJIIJ() {
        Object LIZ = C58096Mr6.LIZ(DetailFeedService.class, false);
        if (LIZ != null) {
            return (DetailFeedService) LIZ;
        }
        if (C58096Mr6.LJJLIIIIJ == null) {
            synchronized (DetailFeedService.class) {
                if (C58096Mr6.LJJLIIIIJ == null) {
                    C58096Mr6.LJJLIIIIJ = new DetailFeedServiceImpl();
                }
            }
        }
        return C58096Mr6.LJJLIIIIJ;
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Aweme LIZJ(String str) {
        Aweme LIZ = DetailApi.LIZ(1, 0, str, "");
        o.LJIIIIZZ(LIZ, "queryAwemeForPreload(aid, originType, preloadType)");
        return LIZ;
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Aweme LIZLLL(String str) {
        return DetailApi.LIZ(0, 1, str, "");
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final BatchDetailList LJFF(String str) {
        BatchDetailList LIZLLL = DetailApi.LIZLLL(4, str, null, null, 0, 0, null);
        o.LJIIIIZZ(LIZLLL, "queryBatchAweme(ids, par…riginType, requestSource)");
        return LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Fragment LJI(Activity activity) {
        o.LJIIIZ(activity, "activity");
        M89 LIZIZ = M8A.LIZIZ(activity);
        Bundle bundle = new Bundle();
        bundle.putSerializable("feed_param", LIZIZ);
        DetailFragment detailFragment = new DetailFragment();
        detailFragment.setArguments(bundle);
        return detailFragment;
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final BatchDetailList LJII(String str) {
        BatchDetailList LIZLLL = DetailApi.LIZLLL(0, str, null, null, 0, 0, null);
        o.LJIIIIZZ(LIZLLL, "queryBatchAweme(ids, params, originType)");
        return LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Map<String, View> LJIIIIZZ(View rootView) {
        o.LJIIIZ(rootView, "rootView");
        View findViewById = rootView.findViewById(R.id.f_e);
        View findViewById2 = rootView.findViewById(R.id.ngb);
        if (findViewById != null) {
            Map<String, View> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("search_icon_in_feed", findViewById));
            if (findViewById2 != null) {
                LJJLIIIIJ.put("search_bar_in_feed", findViewById2);
            }
            return LJJLIIIIJ;
        }
        throw new IllegalStateException("no search icon find in your layout");
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Aweme LIZ(String str, String str2) {
        Aweme LIZ = DetailApi.LIZ(0, 0, str, str2);
        o.LJIIIIZZ(LIZ, "queryAweme(aid, originType)");
        return LIZ;
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final String LJ(String str, String str2, String str3) {
        return M8A.LIZ(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final BatchDetailList LIZIZ(String str, String str2, int i, String str3, String str4) {
        BatchDetailList LIZLLL = DetailApi.LIZLLL(0, str, str2, str3, i, 1, str4);
        o.LJIIIIZZ(LIZLLL, "queryBatchAweme(ids, par…sharLinkMode, shareScene)");
        return LIZLLL;
    }
}
