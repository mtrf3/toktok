package com.ss.android.ugc.aweme.account.login.twostep;

import X.A2F;
import X.A2G;
import X.AnonymousClass036;
import X.C10K;
import X.C221108m2;
import X.C33Q;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C69084R9k;
import X.C85163Xbb;
import X.C85164Xbc;
import X.C85166Xbe;
import X.C85168Xbg;
import X.C8HZ;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.InterfaceC26157AOj;
import X.InterfaceC67352kd;
import X.R41;
import Y.AgS41S0110000_15;
import android.os.Bundle;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.services.TwoStepVerificationService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class RecentDevicesFragmentViewModel extends AssemListViewModel<C85168Xbg, C85166Xbe, Integer> {
    public List<RecommendDevice> LJLIL = new ArrayList();
    public final C55749LuL LJLILLLLZI = new C55749LuL(C47704Ins.LIZLLL(this, C85164Xbc.class, "recent_devices_hierarchy_data_key"), true);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 83));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 84));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 82));
    public final TwoStepVerificationService LJLJJLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C85168Xbg(0);
    }

    public final String getEnterFrom() {
        return (String) this.LJLJI.getValue();
    }

    public final Bundle iv0() {
        Bundle LIZJ = AnonymousClass036.LIZJ("enter_from", "add_trust_device", "enter_method", "normal");
        LIZJ.putBoolean("is_idv", true);
        return LIZJ;
    }

    public final Collection<C85166Xbe> jv0() {
        ArrayList arrayList = new ArrayList();
        Iterator<RecommendDevice> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            arrayList.add(new C85166Xbe(it.next()));
        }
        return arrayList;
    }

    public final void kv0() {
        setState(new AqS181S0100000_15(this, 274));
    }

    public RecentDevicesFragmentViewModel() {
        InterfaceC26157AOj LJIIL = R41.LIZIZ.LJIIL();
        o.LJII(LJIIL, "null cannot be cast to non-null type com.ss.android.ugc.aweme.services.TwoStepVerificationService");
        this.LJLJJLL = (TwoStepVerificationService) LJIIL;
    }

    public final void gv0(boolean z) {
        if (!z) {
            setStateImmediate(C85163Xbb.LJLIL);
        }
        TwoStepAuthApi.LIZ.getClass();
        TwoStepAuthApi.LIZIZ().getRecommendDeviceList(TwoStepAuthApi.LIZJ("/passport/safe/recommend_device/list/")).LJ(new AgS41S0110000_15(this, z, 0), C10K.LJI, null);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C85166Xbe> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS181S0100000_15((C8HZ) newListState, (C8HZ<C85166Xbe>) 26));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        A2F a2f = A2G.LIZ;
        C85168Xbg c85168Xbg = (C85168Xbg) getState();
        c85168Xbg.getClass();
        List list = c85168Xbg.getListState().LJLJJI;
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
        C85168Xbg c85168Xbg = (C85168Xbg) getState();
        c85168Xbg.getClass();
        List list = c85168Xbg.getListState().LJLJJI;
        if (list == null) {
            list = new ArrayList();
        }
        a2f.getClass();
        return A2F.LIZ(list);
    }

    public static C69084R9k hv0(RecentDevicesFragmentViewModel recentDevicesFragmentViewModel, Integer num, String str, int i) {
        int i2;
        String str2 = str;
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        recentDevicesFragmentViewModel.getClass();
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
