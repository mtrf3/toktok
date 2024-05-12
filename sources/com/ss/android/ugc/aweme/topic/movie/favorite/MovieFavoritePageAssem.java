package com.ss.android.ugc.aweme.topic.movie.favorite;

import X.C182337Dp;
import X.C184817Nd;
import X.C214298b3;
import X.C221108m2;
import X.C26338AVi;
import X.C32151Nz;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C7VI;
import X.C9BE;
import X.O6R;
import X.SYL;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoriteListAssem;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MovieFavoritePageAssem extends BaseFavoriteListAssem<C182337Dp, C184817Nd, Long> {
    public final C214298b3 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final Map<Integer, View> LJLLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoriteListAssem, com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePageAssem
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public MovieFavoritePageAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MovieFavoriteListVM.class);
        this.LJLLI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 1081), C7VI.INSTANCE, null);
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1080));
        this.LJLLJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1079));
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoriteListAssem
    public final AssemListViewModel<C182337Dp, C184817Nd, Long> H3() {
        return (AssemListViewModel) this.LJLLI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePageAssem
    public final String v3() {
        return (String) this.LJLLJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePageAssem
    public final String x3() {
        return (String) this.LJLLILLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoriteListAssem, com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePageAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        SYL F3 = F3();
        C26338AVi.LJ(F3, 0, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), 0, 0, true);
        F3.LLLF.LJZL(MovieFavoriteItemCell.class);
        F3.getContext();
        F3.setLayoutManager(new LinearLayoutManager(1, false));
    }
}
