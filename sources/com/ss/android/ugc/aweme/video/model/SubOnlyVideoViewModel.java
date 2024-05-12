package com.ss.android.ugc.aweme.video.model;

import X.A2G;
import X.C2050482y;
import X.C33Q;
import X.C7U4;
import X.C7UE;
import X.C7UF;
import X.C8HZ;
import X.InterfaceC67352kd;
import X.M89;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class SubOnlyVideoViewModel extends BaseDetailShareVM<C7U4, C7UE, C7UF> {
    public boolean LJLIL;
    public long LJLILLLLZI;
    public String LJLJI = "";
    public String LJLJJI = "";
    public C7UF LJLJJL;

    @Override // X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 97;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C7U4(0);
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
                if (o.LJ(((C7UE) it.next()).LJLIL.getAid(), aid)) {
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
    public final Aweme getAwemeFromItem(C7UE c7ue) {
        C7UE item = c7ue;
        o.LJIIIZ(item, "item");
        return item.LJLIL;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C7UE> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 533));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<C7UF>> interfaceC67352kd) {
        return gv0(new C7UF(this.LJLILLLLZI, 0L, 0L, this.LJLJI, this.LJLIL), interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a A[Catch: Exception -> 0x011d, TryCatch #0 {Exception -> 0x011d, blocks: (B:11:0x0053, B:12:0x0056, B:14:0x005a, B:17:0x0061, B:19:0x0067, B:20:0x0074, B:22:0x007a, B:24:0x008c, B:26:0x0092, B:28:0x009c, B:29:0x00a9, B:31:0x00af, B:33:0x00b7, B:35:0x00cb, B:36:0x00ce, B:38:0x00d1, B:40:0x00cf, B:41:0x00d8, B:43:0x00e0, B:44:0x00ed, B:46:0x00f3, B:48:0x00fb, B:50:0x010f, B:51:0x0112, B:53:0x0115, B:55:0x0113, B:59:0x0033), top: B:7:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061 A[Catch: Exception -> 0x011d, TryCatch #0 {Exception -> 0x011d, blocks: (B:11:0x0053, B:12:0x0056, B:14:0x005a, B:17:0x0061, B:19:0x0067, B:20:0x0074, B:22:0x007a, B:24:0x008c, B:26:0x0092, B:28:0x009c, B:29:0x00a9, B:31:0x00af, B:33:0x00b7, B:35:0x00cb, B:36:0x00ce, B:38:0x00d1, B:40:0x00cf, B:41:0x00d8, B:43:0x00e0, B:44:0x00ed, B:46:0x00f3, B:48:0x00fb, B:50:0x010f, B:51:0x0112, B:53:0x0115, B:55:0x0113, B:59:0x0033), top: B:7:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(X.C7UF r15, X.InterfaceC67352kd<? super X.A2G<X.C7UF>> r16) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.model.SubOnlyVideoViewModel.gv0(X.7UF, X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC67352kd interfaceC67352kd) {
        return gv0((C7UF) obj, interfaceC67352kd);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final C7UF getCursorByFeedParam(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        C7UF c7uf = this.LJLJJL;
        if (c7uf == null) {
            return new C7UF(this.LJLILLLLZI, 0L, 0L, this.LJLJI, this.LJLIL);
        }
        return c7uf;
    }
}
