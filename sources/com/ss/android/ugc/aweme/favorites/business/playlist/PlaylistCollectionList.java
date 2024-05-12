package com.ss.android.ugc.aweme.favorites.business.playlist;

import X.AnonymousClass886;
import X.C186877Vb;
import X.C186897Vd;
import X.C214298b3;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoriteListAssem;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PlaylistCollectionList extends BaseFavoriteListAssem<C186897Vd, AnonymousClass886, Integer> {
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

    public PlaylistCollectionList() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PlaylistCollectionVM.class);
        this.LJLLI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 275), C186877Vb.INSTANCE, null);
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 274));
        this.LJLLJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 273));
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoriteListAssem
    public final AssemListViewModel<C186897Vd, AnonymousClass886, Integer> H3() {
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
        F3().LLLF.LJZL(PlaylistCollectionCell.class);
        C8YN.LJII(this, (AssemViewModel) this.LJLLI.getValue(), new TBT() { // from class: X.7Vc
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C186897Vd) obj).LJLILLLLZI;
            }
        }, null, new AqS185S0100000_3(this, 45), 6);
    }
}
