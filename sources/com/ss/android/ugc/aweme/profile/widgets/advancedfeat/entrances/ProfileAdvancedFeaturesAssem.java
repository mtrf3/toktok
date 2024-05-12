package com.ss.android.ugc.aweme.profile.widgets.advancedfeat.entrances;

import X.C234679Ix;
import X.C9J8;
import X.C9JT;
import android.view.View;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileFeatureBaseAssem;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileAdvancedFeaturesAssem extends ProfileFeatureBaseAssem {
    public Map<Integer, View> LJLZ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileFeatureBaseAssem
    public void _$_clearFindViewByIdCache() {
        this.LJLZ.clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileFeatureBaseAssem
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLZ;
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

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileFeatureBaseAssem, X.C9GK, X.C8VB, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileFeatureBaseAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C234679Ix firstArea = C234679Ix.LJLIL;
        o.LJIIIZ(firstArea, "firstArea");
        C9J8<C9JT> c9j8 = new C9J8<>();
        firstArea.invoke(c9j8);
        E3(c9j8.LIZ);
    }
}
