package com.ss.android.ugc.tiktok.addyours.ui.assem;

import X.C214298b3;
import X.C218738iD;
import X.C218768iG;
import X.C219148is;
import X.C221108m2;
import X.C221118m3;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72912tb;
import X.C73305Spp;
import X.C73306Spq;
import X.C78926UyI;
import X.C9BE;
import X.SYL;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.tiktok.addyours.ui.vm.SearchResultListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class SearchResultListAssem extends InvitableListAssem<SearchResultListViewModel> {
    public final C214298b3 LJLJI;
    public final String LJLJJI;
    public final C5H3 LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1438));

    @Override // com.ss.android.ugc.tiktok.addyours.ui.assem.InvitableListAssem
    public final boolean H3() {
        return true;
    }

    public SearchResultListAssem() {
        C65776Prg LIZ = C65352Pkq.LIZ(SearchResultListViewModel.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ, C9BE.LIZ, new AqS153S0100000_3(LIZ, 1440), C219148is.INSTANCE, null);
        this.LJLJJI = "addyours_invite_search";
        this.LJLJJL = C221118m3.LIZ(new AqS153S0100000_3(this, 1437));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final AssemListViewModel A3() {
        return (AssemListViewModel) this.LJLJI.getValue();
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.assem.InvitableListAssem
    public final C73306Spq E3() {
        return (C73306Spq) this.LJLJJL.getValue();
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.assem.InvitableListAssem
    public final C73305Spp I3() {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(R.id.jhm));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView != null && (view = containerView.findViewById(R.id.jhm)) != null) {
                linkedHashMap.put(Integer.valueOf(R.id.jhm), view);
            } else {
                view = null;
            }
        }
        return (C73305Spp) view;
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.assem.InvitableListAssem
    public final boolean K3() {
        C218738iD c218738iD = (C218738iD) ((AssemViewModel) this.LJLJI.getValue()).getState();
        c218738iD.getClass();
        List<C218768iG> list = c218738iD.getListState().LJLJJI;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.assem.InvitableListAssem
    public final boolean L3() {
        C218738iD c218738iD = (C218738iD) ((AssemViewModel) this.LJLJI.getValue()).getState();
        c218738iD.getClass();
        return c218738iD.getListState().LJLIL instanceof C72912tb;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.assem.InvitableListAssem
    public final String F3() {
        return this.LJLJJI;
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.assem.InvitableListAssem, com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLJI.getValue(), new TBT() { // from class: X.8iw
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C218738iD c218738iD = (C218738iD) obj;
                c218738iD.getClass();
                return C208708Ha.LIZLLL(c218738iD);
            }
        }, null, new AqS169S0100000_3(this, 607), new AqS153S0100000_3(this, 1439), new AqS169S0100000_3(this, 608), 2, null);
    }
}
