package com.ss.android.ugc.aweme.roaming;

import X.C16880lQ;
import X.C214298b3;
import X.C221108m2;
import X.C2K0;
import X.C54678Ld4;
import X.C55096Ljo;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C78926UyI;
import X.C7MY;
import X.C9BE;
import X.InterfaceC55102Lju;
import X.SYL;
import X.TBT;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class RegionSearchListAssem extends UIListContentAssem implements IRegionSearchListAbility, InterfaceC55102Lju {
    public final C62822Ol8 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public C73305Spp LJLJI;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1298294848) {
            return null;
        }
        return this;
    }

    public RegionSearchListAssem() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 604));
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(RegionSearchViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 606), C54678Ld4.INSTANCE, null);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final AssemListViewModel A3() {
        return (AssemListViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        return (SYL) this.LJLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZ = 5;
        c57939MoZ.LIZIZ = false;
        c57939MoZ.LIZJ = LoadingFooterCell.class;
        return c57939MoZ;
    }

    public final void C3() {
        View containerView = getContainerView();
        o.LJII(containerView, "null cannot be cast to non-null type android.view.ViewGroup");
        if (((ViewGroup) containerView).indexOfChild(v3()) != -1) {
            View containerView2 = getContainerView();
            o.LJII(containerView2, "null cannot be cast to non-null type android.widget.FrameLayout");
            C16880lQ.LJLLLL(v3(), (FrameLayout) containerView2);
        }
    }

    @Override // com.ss.android.ugc.aweme.roaming.IRegionSearchListAbility
    public final void hide() {
        v3().getState().LJFF();
        C3();
        C73305Spp c73305Spp = this.LJLJI;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(8);
        } else {
            o.LJIJI("statusView");
            throw null;
        }
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.roaming.IRegionSearchListAbility
    public final void show() {
        C3();
        C73305Spp c73305Spp = this.LJLJI;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
            C73305Spp c73305Spp2 = this.LJLJI;
            if (c73305Spp2 != null) {
                c73305Spp2.LJFF();
                return;
            } else {
                o.LJIJI("statusView");
                throw null;
            }
        }
        o.LJIJI("statusView");
        throw null;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        v3().LLLF.LJZL(NearbyRegionCell.class);
        Object parent = view.getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.View");
        View findViewById = ((View) parent).findViewById(R.id.jhm);
        o.LJIIIIZZ(findViewById, "view.parent as View).fin…(R.id.search_status_view)");
        C73305Spp c73305Spp = (C73305Spp) findViewById;
        this.LJLJI = c73305Spp;
        c73305Spp.setTopMargin(C7MY.LIZIZ(73));
        C73305Spp c73305Spp2 = this.LJLJI;
        if (c73305Spp2 != null) {
            c73305Spp2.setButtonTopMargin(C7MY.LIZIZ(205));
            AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.Ld3
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    C54662Lco c54662Lco = (C54662Lco) obj;
                    c54662Lco.getClass();
                    return C208708Ha.LIZLLL(c54662Lco);
                }
            }, null, new AqS175S0100000_9(this, 259), new AqS159S0100000_9(this, 605), new AqS175S0100000_9(this, 260), 2, null);
        } else {
            o.LJIJI("statusView");
            throw null;
        }
    }
}
