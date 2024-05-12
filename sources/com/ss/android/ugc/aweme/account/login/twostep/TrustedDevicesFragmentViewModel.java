package com.ss.android.ugc.aweme.account.login.twostep;

import X.A2F;
import X.A2G;
import X.C10K;
import X.C221108m2;
import X.C33Q;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C69084R9k;
import X.C85144XbI;
import X.C85166Xbe;
import X.C85169Xbh;
import X.C85170Xbi;
import X.C85172Xbk;
import X.C85173Xbl;
import X.C8HZ;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.InterfaceC26157AOj;
import X.InterfaceC67352kd;
import X.R41;
import Y.AgS41S0110000_15;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.account.login.twostep.AuthDeviceResponse;
import com.ss.android.ugc.aweme.services.TwoStepVerificationService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class TrustedDevicesFragmentViewModel extends AssemListViewModel<C85169Xbh, C85173Xbl, Integer> {
    public List<Device> LJLIL = new ArrayList();
    public final C55749LuL LJLILLLLZI = new C55749LuL(C47704Ins.LIZLLL(this, C85170Xbi.class, "trusted_devices_hierarchy_data_key"), true);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 115));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 116));
    public final TwoStepVerificationService LJLJJL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C85169Xbh(0);
    }

    public final Collection<C85173Xbl> iv0() {
        ArrayList arrayList = new ArrayList();
        Iterator<Device> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            arrayList.add(new C85173Xbl(it.next()));
        }
        return arrayList;
    }

    public TrustedDevicesFragmentViewModel() {
        InterfaceC26157AOj LJIIL = R41.LIZIZ.LJIIL();
        o.LJII(LJIIL, "null cannot be cast to non-null type com.ss.android.ugc.aweme.services.TwoStepVerificationService");
        this.LJLJJL = (TwoStepVerificationService) LJIIL;
    }

    public final void gv0(boolean z) {
        AuthDeviceResponse.Data data;
        List<Device> auth_device;
        setStateImmediate(C85172Xbk.LJLIL);
        AuthDeviceResponse previousAuthDeviceListStatus = this.LJLJJL.getPreviousAuthDeviceListStatus();
        if (previousAuthDeviceListStatus != null && (data = previousAuthDeviceListStatus.getData()) != null && (auth_device = data.getAuth_device()) != null) {
            this.LJLIL = auth_device;
            this.LJLJJL.setAuthDeviceListStatus(previousAuthDeviceListStatus);
            withState(new AqS146S0200000_15(this, previousAuthDeviceListStatus, 84));
            if (z) {
                C85144XbI.LJJIIJ(this.LJLIL.size(), (String) this.LJLJI.getValue());
                return;
            }
            return;
        }
        TwoStepAuthApi.LIZ.getClass();
        TwoStepAuthApi.LIZIZ().getAuthDeviceList().LJ(new AgS41S0110000_15(this, z, 1), C10K.LJI, null);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C85173Xbl> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS181S0100000_15((C8HZ) newListState, (C8HZ<C85166Xbe>) 34));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        A2F a2f = A2G.LIZ;
        C85169Xbh c85169Xbh = (C85169Xbh) getState();
        c85169Xbh.getClass();
        List list = c85169Xbh.getListState().LJLJJI;
        if (list == null) {
            list = new ArrayList();
        }
        a2f.getClass();
        return A2F.LIZ(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Integer num, InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        num.intValue();
        A2F a2f = A2G.LIZ;
        C85169Xbh c85169Xbh = (C85169Xbh) getState();
        c85169Xbh.getClass();
        List list = c85169Xbh.getListState().LJLJJI;
        if (list == null) {
            list = new ArrayList();
        }
        a2f.getClass();
        return A2F.LIZ(list);
    }

    public static C69084R9k hv0(TrustedDevicesFragmentViewModel trustedDevicesFragmentViewModel, Integer num, String str, int i) {
        int i2;
        String str2 = str;
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        trustedDevicesFragmentViewModel.getClass();
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = -2;
        }
        if (str2 == null) {
            str2 = "";
        }
        return new C69084R9k(i2, str2, EnumC69116RAq.NONE, EnumC69113RAn.NONE, null, "");
    }
}
