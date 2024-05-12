package com.ss.android.ugc.aweme.following.ui;

import X.C2068389v;
import X.C221108m2;
import X.C25771A9n;
import X.C27770Av8;
import X.C53299Kvv;
import X.C62822Ol8;
import X.C73306Spq;
import X.C98J;
import X.InterfaceC57760Mlg;
import X.InterfaceC57910Mo6;
import android.os.Bundle;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SuggestRelationFragment extends BaseRelationFragment {
    public C25771A9n LJLLILLLL;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 355));

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final int Al() {
        return R.layout.axe;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment, com.ss.android.ugc.aweme.base.arch.JediBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment, com.ss.android.ugc.aweme.base.arch.JediBaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLJ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final String getEnterFrom() {
        return "suggested_list";
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final int wl() {
        return R.string.pfd;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final int xl() {
        return R.string.rxi;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final void Jl() {
        InterfaceC57760Mlg interfaceC57760Mlg = (InterfaceC57760Mlg) this.LJLLI.getValue();
        if (interfaceC57760Mlg != null) {
            interfaceC57760Mlg.k0();
        }
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final void LJ() {
        C25771A9n c25771A9n;
        InterfaceC57910Mo6 interfaceC57910Mo6 = (InterfaceC57910Mo6) this.LJLLI.getValue();
        if (interfaceC57910Mo6 != null && (c25771A9n = this.LJLLILLLL) != null) {
            c25771A9n.W7(interfaceC57910Mo6);
        }
        C25771A9n c25771A9n2 = this.LJLLILLLL;
        if (c25771A9n2 != null) {
            c25771A9n2.LJLJLJ(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final void LJJIJL() {
        InterfaceC57760Mlg interfaceC57760Mlg = (InterfaceC57760Mlg) this.LJLLI.getValue();
        if (interfaceC57760Mlg != null) {
            interfaceC57760Mlg.xk0(null);
        }
    }

    public final C73306Spq Ml() {
        if (C53299Kvv.LIZJ()) {
            return null;
        }
        C73306Spq c73306Spq = new C73306Spq();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_large_wifi_slash;
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        c73306Spq.LIZJ = 0;
        c73306Spq.LIZIZ = c2068389v;
        String string = getString(R.string.im9);
        o.LJIIIIZZ(string, "getString(R.string.network_error)");
        c73306Spq.LJFF = string;
        String string2 = getString(R.string.cph);
        o.LJIIIIZZ(string2, "getString(R.string.check_network)");
        c73306Spq.LJI = string2;
        c73306Spq.LJII = new AqS170S0100000_4(this, 384);
        return c73306Spq;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment, com.ss.android.ugc.aweme.base.arch.JediBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C25771A9n c25771A9n;
        super.onDestroyView();
        InterfaceC57910Mo6 interfaceC57910Mo6 = (InterfaceC57910Mo6) this.LJLLI.getValue();
        if (interfaceC57910Mo6 != null && (c25771A9n = this.LJLLILLLL) != null) {
            c25771A9n.K8(interfaceC57910Mo6);
        }
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.mym);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.user_card_layout)");
        C25771A9n c25771A9n = (C25771A9n) findViewById;
        c25771A9n.setVisibility(0);
        C98J.LIZ(c25771A9n, null, this, new AqS170S0100000_4(this, 866), 1);
        c25771A9n.W7(new C27770Av8(this));
        if (!this.LJLJJI) {
            c25771A9n.LJLJLJ(false);
        }
        this.LJLLILLLL = c25771A9n;
    }
}
