package com.ss.android.ugc.aweme.mention.viewmodel;

import X.A2F;
import X.A2G;
import X.C2050482y;
import X.C217798gh;
import X.C217808gi;
import X.C217938gv;
import X.C217958gx;
import X.C218018h3;
import X.C218028h4;
import X.C218038h5;
import X.C221108m2;
import X.C32I;
import X.C33Q;
import X.C62822Ol8;
import X.C8HZ;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import X.Y9G;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SearchUserSugResponse;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoCaptionMentionSearchViewModel extends AssemListViewModel<C218018h3, InterfaceC57784Mm4, Boolean> {
    public C217798gh LJLILLLLZI;
    public String LJLIL = "";
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C218038h5.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C218018h3(0);
    }

    public final A2G<Boolean> gv0(boolean z) {
        SearchUserSugResponse LIZ;
        SugExtraInfo sugExtraInfo;
        try {
            if (!z) {
                LIZ = C217938gv.LIZ(this.LJLIL, (Set) this.LJLJI.getValue());
            } else {
                ((Set) this.LJLJI.getValue()).clear();
                LIZ = C217938gv.LIZ(this.LJLIL, new LinkedHashSet());
            }
            List<? extends SearchSugEntity> list = LIZ.sugList;
            if (list != null && (!list.isEmpty())) {
                Iterator<? extends SearchSugEntity> it = list.iterator();
                while (it.hasNext() && ((sugExtraInfo = it.next().sugExtraInfo) == null || sugExtraInfo.getHasUserRelation())) {
                }
            }
            C217808gi LIZIZ = C217958gx.LIZIZ(LIZ, this.LJLIL);
            List<Y9G> list2 = LIZIZ.LJLILLLLZI;
            Set set = (Set) this.LJLJI.getValue();
            ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
            Iterator<Y9G> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LIZ);
            }
            set.addAll(arrayList);
            this.LJLILLLLZI = LIZIZ.LJLIL;
            if (LIZ.LIZ()) {
                return A2F.LJ(A2G.LIZ, null, Boolean.TRUE, hv0(LIZIZ.LJLILLLLZI), 1);
            }
            A2F a2f = A2G.LIZ;
            List<C218028h4> hv0 = hv0(LIZIZ.LJLILLLLZI);
            a2f.getClass();
            return A2F.LIZ(hv0);
        } catch (Exception e) {
            A2G.LIZ.getClass();
            return A2F.LIZJ(e);
        }
    }

    public final List<C218028h4> hv0(List<Y9G> list) {
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<Y9G> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C218028h4(it.next()));
        }
        return arrayList;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<InterfaceC57784Mm4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 254));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Boolean>> interfaceC67352kd) {
        return gv0(true);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Boolean bool, InterfaceC67352kd<? super A2G<Boolean>> interfaceC67352kd) {
        bool.booleanValue();
        return gv0(false);
    }
}
