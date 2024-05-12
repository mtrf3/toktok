package com.ss.android.ugc.aweme.prop.fragment;

import X.AbstractC030309z;
import X.C54959Lhb;
import X.MGX;
import android.os.Bundle;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class EffectDiscoverAwemeListFragment extends DetailAwemeListFragment {
    public static final /* synthetic */ int LLILZ = 0;
    public final Map<Integer, View> LLILLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final int Kl() {
        return 2;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.AbsDetailAwemeListFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLILLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.aweme.challenge.ui.AbsDetailAwemeListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final AbstractC030309z Gl(int i) {
        return new C54959Lhb();
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final SmartRoute wl(MGX param, Aweme aweme) {
        String str;
        String str2;
        String str3;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(param, "param");
        SmartRoute wl = super.wl(param, aweme);
        Bundle arguments = getArguments();
        String str4 = null;
        if (arguments != null) {
            str = arguments.getString("detail_aweme_from");
        } else {
            str = null;
        }
        wl.withParam("detail_aweme_from", str);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str2 = arguments2.getString("creation_id");
        } else {
            str2 = null;
        }
        wl.withParam("creation_id", str2);
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str3 = arguments3.getString("shoot_way");
        } else {
            str3 = null;
        }
        wl.withParam("shoot_way", str3);
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            str4 = arguments4.getString("shoot_tab_name");
        }
        wl.withParam("shoot_tab_name", str4);
        if (o.LJ(str, "from_effect_discover_tab")) {
            wl.withParam("previous_page", "prop_page_discover");
            wl.withParam("refer", "prop_page_discover");
        } else {
            wl.withParam("previous_page", "prop_panel_discover");
            wl.withParam("refer", "video_shoot_page");
        }
        return wl;
    }
}
