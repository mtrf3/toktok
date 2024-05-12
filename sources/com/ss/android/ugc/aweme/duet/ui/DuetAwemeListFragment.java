package com.ss.android.ugc.aweme.duet.ui;

import X.MGX;
import Y.ARunnableS45S0100000_9;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class DuetAwemeListFragment extends DetailAwemeListFragment {
    public static final /* synthetic */ int LLILZ = 0;
    public final Map<Integer, View> LLILLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.challenge.ui.AbsDetailAwemeListFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLILLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.aweme.challenge.ui.AbsDetailAwemeListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.T6F
    public final void refresh() {
        View view = getView();
        if (view != null) {
            view.post(new ARunnableS45S0100000_9(this, 25));
        }
        J4(false, false);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final SmartRoute wl(MGX mgx, Aweme aweme) {
        SmartRoute wl = super.wl(mgx, aweme);
        o.LJIIIIZZ(wl, "super.createRoute(aweme, param)");
        return wl;
    }
}
