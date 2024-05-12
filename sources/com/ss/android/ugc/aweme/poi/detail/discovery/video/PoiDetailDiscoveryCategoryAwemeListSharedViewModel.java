package com.ss.android.ugc.aweme.poi.detail.discovery.video;

import X.A2F;
import X.A2G;
import X.C188447aS;
import X.C188457aT;
import X.C33Q;
import X.C7UA;
import X.C8HZ;
import X.InterfaceC67352kd;
import X.M89;
import X.ORZ;
import X.X1D;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiDetailDiscoveryCategoryAwemeListSharedViewModel extends BaseDetailShareVM<C7UA, C188457aT, Long> {
    public String LJLIL;
    public List<? extends Aweme> LJLILLLLZI;

    @Override // X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 45;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C7UA(0);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int deleteItemByAid(String aid) {
        o.LJIIIZ(aid, "aid");
        List<ITEM> listGetAll = listGetAll();
        int i = -1;
        if (listGetAll != 0) {
            Iterator it = listGetAll.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (o.LJ(((C188457aT) it.next()).LJLILLLLZI.getAid(), aid)) {
                    i = i2;
                    if (i2 >= 0) {
                        listRemoveItemAt(i2);
                    }
                } else {
                    i2++;
                }
            }
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme getAwemeFromItem(C188457aT c188457aT) {
        C188457aT item = c188457aT;
        o.LJIIIZ(item, "item");
        return item.LJLILLLLZI;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C188457aT> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS134S0200000_3(this, (PoiDetailDiscoveryCategoryAwemeListSharedViewModel) newListState, (C8HZ<C188457aT>) 122));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        return gv0(0L, interfaceC67352kd);
    }

    public final Object gv0(long j, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        ArrayList arrayList = new ArrayList();
        List<? extends Aweme> list = this.LJLILLLLZI;
        if (list != null) {
            Iterator it = ((ArrayList) ORZ.LJLL(list)).iterator();
            while (it.hasNext()) {
                arrayList.add(new C188457aT(this.LJLIL, (Aweme) it.next()));
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aweme - vm loadmore: ");
        LIZ.append(arrayList);
        LIZ.append(", poiId:");
        LIZ.append(this.LJLIL);
        LIZ.append(", awemelist: ");
        LIZ.append(this.LJLILLLLZI);
        C188447aS.LIZ(X1D.LIZIZ(LIZ));
        A2G.LIZ.getClass();
        return A2F.LIZ(arrayList);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Object obj, InterfaceC67352kd interfaceC67352kd) {
        return gv0(((Number) obj).longValue(), interfaceC67352kd);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Long getCursorByFeedParam(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        return 0L;
    }
}
