package com.ss.android.ugc.tiktok.addyours.hub.assem;

import X.C0CM;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C219608jc;
import X.C219988kE;
import X.C220108kQ;
import X.C220118kR;
import X.C220138kT;
import X.C220188kY;
import X.C221108m2;
import X.C51073K2r;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C74053T4n;
import X.C78926UyI;
import X.C87673cJ;
import X.C8YN;
import X.C9BE;
import X.InterfaceC222798ol;
import X.InterfaceC74055T4p;
import X.KEI;
import X.KOV;
import X.TBT;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.tiktok.addyours.hub.ability.AddYoursHubAbility;
import com.ss.android.ugc.tiktok.addyours.hub.ability.AddYoursTabAbility;
import com.ss.android.ugc.tiktok.addyours.hub.cell.AddYoursHubListCell;
import com.ss.android.ugc.tiktok.addyours.hub.viewmodel.AddYoursHubTabViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS13S2100000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AddYoursMultiHubAssem extends UISlotAssem implements AddYoursTabAbility {
    public final C214298b3 LJLJLLL;
    public final C62822Ol8 LJLL;
    public boolean LJLLI;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
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

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.gn;
    }

    public AddYoursMultiHubAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(AddYoursHubTabViewModel.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 1429), C220138kT.INSTANCE, null);
        this.LJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1428));
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, AddYoursTabAbility.class, null);
        }
    }

    public final int H3(int i) {
        C219988kE c219988kE;
        KEI LJI = ((C74053T4n) _$_findCachedViewById(R.id.ky7)).LJI(i);
        if (LJI != null) {
            Object obj = LJI.LIZ;
            if ((obj instanceof C219988kE) && (c219988kE = (C219988kE) obj) != null) {
                return c219988kE.LJLJJI.LIZIZ;
            }
        }
        return 0;
    }

    @Override // com.ss.android.ugc.tiktok.addyours.hub.ability.AddYoursTabAbility
    public final void iq0(List<C220108kQ> tabTopicCountInfoList) {
        String str;
        C219608jc mB;
        C219988kE c219988kE;
        o.LJIIIZ(tabTopicCountInfoList, "tabTopicCountInfoList");
        for (C220108kQ c220108kQ : tabTopicCountInfoList) {
            KEI LJI = ((C74053T4n) _$_findCachedViewById(R.id.ky7)).LJI(c220108kQ.LIZ);
            if (LJI != null) {
                Object obj = LJI.LIZ;
                if ((obj instanceof C219988kE) && (c219988kE = (C219988kE) obj) != null) {
                    c219988kE.LJLJJI.LIZIZ = c220108kQ.LIZIZ;
                    LJI.LIZIZ(_$_findCachedViewById(R.id.ky7).getContext().getResources().getString(c219988kE.LJLILLLLZI, Integer.valueOf(c220108kQ.LIZIZ)));
                }
            }
        }
        if (!this.LJLLI) {
            this.LJLLI = true;
            AddYoursHubAbility addYoursHubAbility = (AddYoursHubAbility) this.LJLL.getValue();
            if (addYoursHubAbility == null || (mB = addYoursHubAbility.mB()) == null || (str = mB.LIZLLL) == null) {
                str = "click_add_yours_button";
            }
            withState((AssemViewModel) this.LJLJLLL.getValue(), new AqS13S2100000_3(this, str, "added", 8));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        InterfaceC222798ol viewItemOperator = ((KOV) _$_findCachedViewById(R.id.n9y)).getViewItemOperator();
        C220188kY c220188kY = new C220188kY();
        c220188kY.LIZ = 1;
        c220188kY.LIZIZ = false;
        c220188kY.LIZLLL = false;
        c220188kY.LIZJ = "add_yours_hub_tab";
        viewItemOperator.LIZIZ(c220188kY);
        viewItemOperator.LJFF(AddYoursHubListCell.class);
        ((AssemListViewModel) this.LJLJLLL.getValue()).setListState(((KOV) _$_findCachedViewById(R.id.n9y)).getViewItemOperator().getState());
        C8YN.LJII(this, (AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.8kS
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C220168kW c220168kW = (C220168kW) obj;
                c220168kW.getClass();
                return C208708Ha.LIZ(c220168kW);
            }
        }, C213688a4.LIZLLL(), C220118kR.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.8kU
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C220168kW) obj).LJLIL);
            }
        }, C213688a4.LIZLLL(), C87673cJ.LJLIL, 4);
        ViewGroup viewGroup = (ViewGroup) _$_findCachedViewById(R.id.n9y);
        if (viewGroup.getChildCount() > 0 && 1 != 0 && (viewGroup.getChildAt(0) instanceof C0CM)) {
            View childAt = viewGroup.getChildAt(0);
            o.LJII(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
            final C0CM c0cm = (C0CM) childAt;
            C74053T4n tabBar = (C74053T4n) _$_findCachedViewById(R.id.ky7);
            o.LJIIIIZZ(tabBar, "tabBar");
            tabBar.LIZ(new InterfaceC74055T4p() { // from class: X.8kX
                @Override // X.InterfaceC74055T4p
                public final void LIZIZ(KEI kei) {
                }

                @Override // X.InterfaceC74055T4p
                public final void LIZJ(KEI tab) {
                    o.LJIIIZ(tab, "tab");
                }

                @Override // X.InterfaceC74055T4p
                public final void LIZ(KEI tab) {
                    o.LJIIIZ(tab, "tab");
                    C0CM.this.setCurrentItem(tab.LIZLLL);
                }
            });
            c0cm.LIZIZ(new C51073K2r(tabBar));
        }
        C8YN.LJII(this, (AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.8kV
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C220168kW) obj).LJLILLLLZI);
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 193), 4);
    }
}
