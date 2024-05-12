package com.ss.android.ugc.aweme.ui;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C214298b3;
import X.C26045AKb;
import X.C2K0;
import X.C34K;
import X.C47704Ins;
import X.C54045LIz;
import X.C54508LaK;
import X.C54510LaM;
import X.C54512LaO;
import X.C54514LaQ;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C86V;
import X.C8VV;
import X.C8YN;
import X.C9BE;
import X.InterfaceC55102Lju;
import X.InterfaceC65784Pro;
import X.LJ6;
import X.LJ7;
import X.LZV;
import X.Q8U;
import X.TBT;
import X.X1D;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.panel.NearbyFeedFragmentPanel;
import com.ss.android.ugc.aweme.placediscovery.ui.CategoryEntranceAbility;
import com.ss.android.ugc.aweme.roaming.RegionSearchViewModel;
import com.ss.android.ugc.aweme.settings.NearbyTabConfig;
import com.ss.android.ugc.aweme.vm.NearbyFeedListViewModel;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.AqS98S0300000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NearbyFeedContentAssem extends UIContentAssem implements INearbyContentAssemAbility, InterfaceC55102Lju {
    public final C55749LuL LJLIL;
    public NearbyFeedFragmentPanel LJLILLLLZI;
    public final C214298b3 LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public C54510LaM LJLJL;
    public final C214298b3 LJLJLJ;

    @Override // com.ss.android.ugc.aweme.ui.INearbyContentAssemAbility
    public final boolean LJJIJIIJI() {
        this.LJLJJI = true;
        LJJJJJ();
        return true;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 2058607272) {
            return null;
        }
        return this;
    }

    public NearbyFeedContentAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LIZJ(this, LZV.class, "NearbyFeedContentHierarchyData"), checkSupervisorPrepared());
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(NearbyFeedListViewModel.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 686), C54512LaO.INSTANCE, null);
        this.LJLJJLL = true;
        C65776Prg LIZ2 = C65352Pkq.LIZ(RegionSearchViewModel.class);
        this.LJLJLJ = C78926UyI.LJ(this, LIZ2, c9be, new AqS159S0100000_9(LIZ2, 687), C54514LaQ.INSTANCE, null);
    }

    @Override // com.ss.android.ugc.aweme.ui.INearbyContentAssemAbility
    public final void LJJJJJ() {
        NearbyFeedFragmentPanel nearbyFeedFragmentPanel = this.LJLILLLLZI;
        if (nearbyFeedFragmentPanel != null) {
            nearbyFeedFragmentPanel.LJLJJI = this.LJLJJI;
            v3().manualListLoadMore(0L);
        } else {
            o.LJIJI("panel");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.INearbyContentAssemAbility
    public final void LJJJZ() {
        NearbyFeedFragmentPanel nearbyFeedFragmentPanel = this.LJLILLLLZI;
        if (nearbyFeedFragmentPanel != null) {
            nearbyFeedFragmentPanel.LJLJJI = this.LJLJJI;
            v3().LJLJLJ = "network_loading";
            v3().manualListRefresh();
            return;
        }
        o.LJIJI("panel");
        throw null;
    }

    public final NearbyFeedListViewModel v3() {
        return (NearbyFeedListViewModel) this.LJLJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ui.INearbyContentAssemAbility
    public final boolean LJIILJJIL() {
        return ((Boolean) withState(v3(), C54508LaK.LJLIL)).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.ui.INearbyContentAssemAbility
    public final void Vg() {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null || C55096Ljo.LIZ(C55230Lly.LIZLLL(LIZ, null), CategoryEntranceAbility.class, null) == null) {
            C8VV.LIZJ(this, new AqS175S0100000_9(this, 335));
        }
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.ui.INearbyContentAssemAbility
    public final boolean LJJZZI() {
        return this.LJLJJI;
    }

    @Override // com.ss.android.ugc.aweme.ui.INearbyContentAssemAbility
    public final void Cd(String str) {
        if (NearbyTabConfig.LIZLLL()) {
            C54045LIz.LIZ.getClass();
            if (!C54045LIz.LIZIZ() || str.length() == 0) {
                return;
            }
            Keva keva = LJ6.LIZ;
            if (o.LJ(keva.getString(LJ6.LIZJ("last_region_name_show_in_region_changed_toast"), null), str)) {
                return;
            }
            keva.storeString(LJ6.LIZJ("last_region_name_show_in_region_changed_toast"), str);
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            if (LIZ == null) {
                return;
            }
            String LJFF = C86V.LJFF(R.string.ilg);
            o.LJIIIIZZ(LJFF, "getString(R.string.nearb…layregion_turnon_android)");
            String LIZIZ = Q8U.LIZIZ(new Object[]{str}, 1, LJFF, "format(format, *args)");
            C26045AKb c26045AKb = new C26045AKb(LIZ);
            c26045AKb.LJIIIZ(LIZIZ);
            c26045AKb.LJIIJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.INearbyContentAssemAbility
    public final boolean LJJIJLIJ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return ((Boolean) withState(v3(), new AqS140S0200000_9(aweme, this, 34))).booleanValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LJLILLLLZI = ((LZV) this.LJLIL.getValue()).LJLIL;
        C8YN.LJII(this, v3(), new TBT() { // from class: X.LaP
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C54665Lcr) obj).LJLJI);
            }
        }, null, new AqS191S0100000_9(this, 58), 6);
        AssemViewModel.asyncSubscribe$default(v3(), new TBT() { // from class: X.LaN
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C54665Lcr) obj).getRefreshState();
            }
        }, null, new AqS175S0100000_9(this, 337), new AqS159S0100000_9(this, 684), new AqS175S0100000_9(this, 338), 2, null);
        AssemViewModel.asyncSubscribe$default(v3(), new TBT() { // from class: X.LaL
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C54665Lcr) obj).getLoadMoreState();
            }
        }, null, new AqS175S0100000_9(this, 339), new AqS159S0100000_9(this, 685), new AqS175S0100000_9(this, 336), 2, null);
        if (NearbyTabConfig.LJFF()) {
            LJJJZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.INearbyContentAssemAbility
    public final void wp(ActivityC45651qj activity, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        LocationRegion LIZJ;
        o.LJIIIZ(activity, "activity");
        C54045LIz.LIZ.getClass();
        if (C54045LIz.LIZ() || !NearbyTabConfig.LIZLLL() || (LIZJ = NearbyTabConfig.LIZJ()) == null) {
            return;
        }
        String string = LJ6.LIZ.getString("last_popular_l2_shown_in_nearby", "");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LIZJ.getName());
        LIZ.append('+');
        LIZ.append(LIZJ.getParentName());
        if (o.LJ(string, X1D.LIZIZ(LIZ))) {
            return;
        }
        C34K c34k = new C34K();
        withState(v3(), new AqS175S0100000_9(c34k, 334));
        if (!c34k.element || !LJ7.LIZ(activity)) {
            return;
        }
        if (this.LJLJL == null) {
            this.LJLJL = new C54510LaM(activity, new AqS98S0300000_9(activity, (ActivityC45651qj) this, (NearbyFeedContentAssem) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 12));
        }
        C54510LaM c54510LaM = this.LJLJL;
        if (c54510LaM == null) {
            return;
        }
        PopupManager.LJIIL(c54510LaM);
    }
}
