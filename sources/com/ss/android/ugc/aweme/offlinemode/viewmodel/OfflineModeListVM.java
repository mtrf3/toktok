package com.ss.android.ugc.aweme.offlinemode.viewmodel;

import X.A2G;
import X.AQP;
import X.C185907Ri;
import X.C208708Ha;
import X.C214188as;
import X.C240039bT;
import X.C26222AQw;
import X.C32I;
import X.C33Q;
import X.C78404Ups;
import X.C8HZ;
import X.C9SN;
import X.C9ST;
import X.EnumC237129Si;
import X.InterfaceC236979Rt;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import X.M89;
import X.X1D;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class OfflineModeListVM extends BaseDetailShareVM<C240039bT, C185907Ri, Integer> implements AQP {
    public static volatile long LJLJI;
    public static final /* synthetic */ int LJLJJI = 0;
    public final C214188as LJLIL = C78404Ups.LIZJ(this, C9ST.LJLIL);
    public final C26222AQw LJLILLLLZI = new C26222AQw("OfflineModeListVM");

    @Override // X.AQP
    public final void Fu(int i) {
    }

    @Override // X.AQP
    public final void Xh(boolean z) {
    }

    @Override // X.AQP
    public final void fY(EnumC237129Si enumC237129Si) {
    }

    @Override // X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 50;
    }

    @Override // X.AQP
    public final void hD(int i) {
    }

    @Override // X.AQP
    public final void zn0(double d) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C240039bT(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        C26222AQw c26222AQw = this.LJLILLLLZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("listVM cleared ");
        LIZ.append(this);
        c26222AQw.LIZIZ("CSF", null, X1D.LIZIZ(LIZ));
        super.onCleared();
        ((InterfaceC236979Rt) this.LJLIL.getValue().getOperator()).LJJIL(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        C26222AQw c26222AQw = this.LJLILLLLZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("listVM Prepared ");
        LIZ.append(this);
        c26222AQw.LIZ(null, X1D.LIZIZ(LIZ));
        super.onPrepared();
        ((InterfaceC236979Rt) this.LJLIL.getValue().getOperator()).LJJLJLI(this);
    }

    @Override // X.AQP
    public final void Xk(C9SN state) {
        o.LJIIIZ(state, "state");
    }

    @Override // X.AQP
    public final void Xk0(List<String> aids) {
        o.LJIIIZ(aids, "aids");
        List<Aweme> awemeList = getAwemeList();
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : awemeList) {
            if (!aids.contains(aweme.getAid())) {
                arrayList.add(aweme);
            }
        }
        if (arrayList.size() != getAwemeList().size()) {
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C185907Ri((Aweme) it.next()));
            }
            listSetItems(arrayList2);
            setState(new AqS170S0100000_4(arrayList, (List<? extends Object>) 462));
        }
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
                if (o.LJ(((C185907Ri) it.next()).LJLILLLLZI.getAid(), aid)) {
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
    public final Aweme getAwemeFromItem(C185907Ri c185907Ri) {
        C185907Ri item = c185907Ri;
        o.LJIIIZ(item, "item");
        return item.LJLILLLLZI;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C185907Ri> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS170S0100000_4(newListState, (C8HZ<InterfaceC57784Mm4>) 461));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        return gv0(0, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0098 A[Catch: Exception -> 0x0121, TryCatch #1 {Exception -> 0x0121, blocks: (B:11:0x0050, B:12:0x0053, B:13:0x0092, B:15:0x0098, B:18:0x00a9, B:23:0x00ad, B:24:0x00bc, B:26:0x00c2, B:29:0x00d3, B:30:0x00e9, B:32:0x00ef, B:34:0x00fe, B:37:0x0103, B:39:0x010b, B:41:0x0117), top: B:10:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2 A[Catch: Exception -> 0x0121, LOOP:1: B:24:0x00bc->B:26:0x00c2, LOOP_END, TryCatch #1 {Exception -> 0x0121, blocks: (B:11:0x0050, B:12:0x0053, B:13:0x0092, B:15:0x0098, B:18:0x00a9, B:23:0x00ad, B:24:0x00bc, B:26:0x00c2, B:29:0x00d3, B:30:0x00e9, B:32:0x00ef, B:34:0x00fe, B:37:0x0103, B:39:0x010b, B:41:0x0117), top: B:10:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3 A[Catch: Exception -> 0x0121, TryCatch #1 {Exception -> 0x0121, blocks: (B:11:0x0050, B:12:0x0053, B:13:0x0092, B:15:0x0098, B:18:0x00a9, B:23:0x00ad, B:24:0x00bc, B:26:0x00c2, B:29:0x00d3, B:30:0x00e9, B:32:0x00ef, B:34:0x00fe, B:37:0x0103, B:39:0x010b, B:41:0x0117), top: B:10:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0103 A[Catch: Exception -> 0x0121, TryCatch #1 {Exception -> 0x0121, blocks: (B:11:0x0050, B:12:0x0053, B:13:0x0092, B:15:0x0098, B:18:0x00a9, B:23:0x00ad, B:24:0x00bc, B:26:0x00c2, B:29:0x00d3, B:30:0x00e9, B:32:0x00ef, B:34:0x00fe, B:37:0x0103, B:39:0x010b, B:41:0x0117), top: B:10:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(int r12, X.InterfaceC67352kd<? super X.A2G<java.lang.Integer>> r13) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM.gv0(int, X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Object obj, InterfaceC67352kd interfaceC67352kd) {
        return gv0(((Number) obj).intValue(), interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Integer getCursorByFeedParam(int i, M89 feedParam, int i2, boolean z) {
        int i3;
        o.LJIIIZ(feedParam, "feedParam");
        C240039bT c240039bT = (C240039bT) getState();
        c240039bT.getClass();
        List LIZ = C208708Ha.LIZ(c240039bT);
        if (LIZ != null) {
            i3 = LIZ.size();
        } else {
            i3 = 0;
        }
        return Integer.valueOf(i3);
    }
}
