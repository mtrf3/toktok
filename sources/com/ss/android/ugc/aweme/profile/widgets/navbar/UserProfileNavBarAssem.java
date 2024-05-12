package com.ss.android.ugc.aweme.profile.widgets.navbar;

import X.C235369Lo;
import X.C235809Ng;
import X.C235819Nh;
import X.C235839Nj;
import X.EnumC235349Lm;
import X.EnumC235829Ni;
import X.EnumC235859Nl;
import android.view.View;
import com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavBarAssem;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class UserProfileNavBarAssem extends ProfileNavBarAssem {
    public Map<Integer, View> LJLLJ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavBarAssem
    public void _$_clearFindViewByIdCache() {
        this.LJLLJ.clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavBarAssem
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLJ;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavBarAssem, X.C9PE, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavBarAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C235369Lo startArea = C235369Lo.LJLIL;
        o.LJIIIZ(startArea, "startArea");
        C235809Ng<EnumC235349Lm> c235809Ng = new C235809Ng<>();
        startArea.invoke(c235809Ng);
        F3(c235809Ng.LIZ);
        C235839Nj titleArea = C235839Nj.LJLIL;
        o.LJIIIZ(titleArea, "titleArea");
        C235809Ng<EnumC235859Nl> c235809Ng2 = new C235809Ng<>();
        titleArea.invoke(c235809Ng2);
        C3(c235809Ng2.LIZ);
        C235819Nh endArea = C235819Nh.LJLIL;
        o.LJIIIZ(endArea, "endArea");
        C235809Ng<EnumC235829Ni> c235809Ng3 = new C235809Ng<>();
        endArea.invoke(c235809Ng3);
        E3(c235809Ng3.LIZ);
    }
}
