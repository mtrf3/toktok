package com.ss.android.ugc.aweme.account.login.twostep;

import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C78926UyI;
import X.C85197Xc9;
import X.C9BE;
import X.DialogC25756A8y;
import X.SYL;
import X.TBT;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.account.login.twostep.RecommendDeviceResponse;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class RecentDevicesFragmentAssem extends UIListContentAssem<RecentDevicesFragmentViewModel> {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C214298b3 LJLJJLL;

    public RecentDevicesFragmentAssem() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 75));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 81));
        this.LJLJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 76));
        this.LJLJJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 79));
        this.LJLJJL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 74));
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(RecentDevicesFragmentViewModel.class);
        this.LJLJJLL = C78926UyI.LJ(this, LIZ, c9be, new AqS165S0100000_15(LIZ, 80), C85197Xc9.INSTANCE, null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.ext_power_list.AssemListViewModel, com.ss.android.ugc.aweme.account.login.twostep.RecentDevicesFragmentViewModel] */
    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final RecentDevicesFragmentViewModel A3() {
        return (AssemListViewModel) this.LJLJJLL.getValue();
    }

    public final DialogC25756A8y C3() {
        return (DialogC25756A8y) this.LJLJI.getValue();
    }

    public final C73305Spp E3() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        return (C73305Spp) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        return new C57939MoZ();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C3().dismiss();
    }

    public final void F3(RecommendDeviceResponse recommendDeviceResponse) {
        boolean z;
        int i;
        RecommendDeviceResponse.Data data;
        List<RecommendDevice> deviceInfo;
        C3().hide();
        if (recommendDeviceResponse != null && (data = recommendDeviceResponse.getData()) != null && (deviceInfo = data.getDeviceInfo()) != null) {
            z = deviceInfo.isEmpty();
        } else {
            z = true;
        }
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-recentDeviceListContainer>(...)");
        View view = (View) value;
        int i2 = 0;
        if (!z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        Object value2 = this.LJLJJL.getValue();
        o.LJIIIIZZ(value2, "<get-emptyListContainer>(...)");
        View view2 = (View) value2;
        if (!z) {
            i2 = 8;
        }
        view2.setVisibility(i2);
        E3().setVisibility(8);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        SYL v3 = v3();
        getContainerView().getContext();
        v3.setLayoutManager(new LinearLayoutManager());
        ((AssemViewModel) this.LJLJJLL.getValue()).asyncSubscribe(new TBT() { // from class: X.Xbs
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C85168Xbg) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), new AqS181S0100000_15(this, 22), new AqS165S0100000_15(this, 77), new AqS181S0100000_15(this, 23));
        ((AssemViewModel) this.LJLJJLL.getValue()).asyncSubscribe(new TBT() { // from class: X.Xbt
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C85168Xbg) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), new AqS181S0100000_15(this, 24), new AqS165S0100000_15(this, 78), new AqS181S0100000_15(this, 25));
        ((RecentDevicesFragmentViewModel) this.LJLJJLL.getValue()).gv0(false);
    }
}
