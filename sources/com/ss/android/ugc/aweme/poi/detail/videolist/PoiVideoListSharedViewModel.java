package com.ss.android.ugc.aweme.poi.detail.videolist;

import X.A2G;
import X.C188457aT;
import X.C189027bO;
import X.C190087d6;
import X.C33Q;
import X.C65352Pkq;
import X.C78404Ups;
import X.C8HZ;
import X.EV6;
import X.InterfaceC67352kd;
import X.M89;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.detail.videolist.model.PoiDetailVideoListModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiVideoListSharedViewModel extends BaseDetailShareVM<C189027bO, C188457aT, Long> {
    public long LJLIL;
    public PoiDetailVideoListModel LJLILLLLZI;
    public long LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public final List<Aweme> LJLJL = new ArrayList();
    public final EV6 LJLJLJ = C78404Ups.LIZIZ(this, C65352Pkq.LIZ(C190087d6.class));

    @Override // X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 44;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C189027bO(0);
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
        setState(new AqS134S0200000_3(this, (PoiVideoListSharedViewModel) newListState, (C8HZ<C188457aT>) 125));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        ((ArrayList) this.LJLJL).clear();
        this.LJLJJLL = null;
        return gv0(0L, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01a7 A[Catch: Exception -> 0x026a, TryCatch #0 {Exception -> 0x026a, blocks: (B:12:0x019e, B:13:0x01a1, B:15:0x01a7, B:17:0x01ab, B:18:0x01af, B:20:0x01b1, B:23:0x01be, B:24:0x01c0, B:26:0x01c6, B:27:0x01d1, B:29:0x01d7, B:32:0x01ea, B:34:0x020b, B:35:0x021a, B:37:0x0220, B:39:0x023d, B:41:0x0241, B:43:0x024b, B:45:0x0252, B:47:0x0256, B:48:0x025a, B:51:0x023b, B:57:0x0104, B:58:0x0107, B:60:0x010d, B:62:0x0111, B:63:0x0115, B:65:0x0117, B:68:0x0124, B:69:0x0128, B:71:0x012e, B:77:0x006c, B:79:0x0074, B:81:0x0086, B:83:0x0092, B:84:0x0094, B:87:0x00a1, B:89:0x00b8, B:90:0x00ba, B:92:0x00c2, B:96:0x00d1, B:99:0x00e3, B:103:0x00cf, B:106:0x0149, B:108:0x0160, B:112:0x016a, B:116:0x0168), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01c6 A[Catch: Exception -> 0x026a, TryCatch #0 {Exception -> 0x026a, blocks: (B:12:0x019e, B:13:0x01a1, B:15:0x01a7, B:17:0x01ab, B:18:0x01af, B:20:0x01b1, B:23:0x01be, B:24:0x01c0, B:26:0x01c6, B:27:0x01d1, B:29:0x01d7, B:32:0x01ea, B:34:0x020b, B:35:0x021a, B:37:0x0220, B:39:0x023d, B:41:0x0241, B:43:0x024b, B:45:0x0252, B:47:0x0256, B:48:0x025a, B:51:0x023b, B:57:0x0104, B:58:0x0107, B:60:0x010d, B:62:0x0111, B:63:0x0115, B:65:0x0117, B:68:0x0124, B:69:0x0128, B:71:0x012e, B:77:0x006c, B:79:0x0074, B:81:0x0086, B:83:0x0092, B:84:0x0094, B:87:0x00a1, B:89:0x00b8, B:90:0x00ba, B:92:0x00c2, B:96:0x00d1, B:99:0x00e3, B:103:0x00cf, B:106:0x0149, B:108:0x0160, B:112:0x016a, B:116:0x0168), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01d7 A[Catch: Exception -> 0x026a, TryCatch #0 {Exception -> 0x026a, blocks: (B:12:0x019e, B:13:0x01a1, B:15:0x01a7, B:17:0x01ab, B:18:0x01af, B:20:0x01b1, B:23:0x01be, B:24:0x01c0, B:26:0x01c6, B:27:0x01d1, B:29:0x01d7, B:32:0x01ea, B:34:0x020b, B:35:0x021a, B:37:0x0220, B:39:0x023d, B:41:0x0241, B:43:0x024b, B:45:0x0252, B:47:0x0256, B:48:0x025a, B:51:0x023b, B:57:0x0104, B:58:0x0107, B:60:0x010d, B:62:0x0111, B:63:0x0115, B:65:0x0117, B:68:0x0124, B:69:0x0128, B:71:0x012e, B:77:0x006c, B:79:0x0074, B:81:0x0086, B:83:0x0092, B:84:0x0094, B:87:0x00a1, B:89:0x00b8, B:90:0x00ba, B:92:0x00c2, B:96:0x00d1, B:99:0x00e3, B:103:0x00cf, B:106:0x0149, B:108:0x0160, B:112:0x016a, B:116:0x0168), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ea A[Catch: Exception -> 0x026a, TryCatch #0 {Exception -> 0x026a, blocks: (B:12:0x019e, B:13:0x01a1, B:15:0x01a7, B:17:0x01ab, B:18:0x01af, B:20:0x01b1, B:23:0x01be, B:24:0x01c0, B:26:0x01c6, B:27:0x01d1, B:29:0x01d7, B:32:0x01ea, B:34:0x020b, B:35:0x021a, B:37:0x0220, B:39:0x023d, B:41:0x0241, B:43:0x024b, B:45:0x0252, B:47:0x0256, B:48:0x025a, B:51:0x023b, B:57:0x0104, B:58:0x0107, B:60:0x010d, B:62:0x0111, B:63:0x0115, B:65:0x0117, B:68:0x0124, B:69:0x0128, B:71:0x012e, B:77:0x006c, B:79:0x0074, B:81:0x0086, B:83:0x0092, B:84:0x0094, B:87:0x00a1, B:89:0x00b8, B:90:0x00ba, B:92:0x00c2, B:96:0x00d1, B:99:0x00e3, B:103:0x00cf, B:106:0x0149, B:108:0x0160, B:112:0x016a, B:116:0x0168), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010d A[Catch: Exception -> 0x026a, TryCatch #0 {Exception -> 0x026a, blocks: (B:12:0x019e, B:13:0x01a1, B:15:0x01a7, B:17:0x01ab, B:18:0x01af, B:20:0x01b1, B:23:0x01be, B:24:0x01c0, B:26:0x01c6, B:27:0x01d1, B:29:0x01d7, B:32:0x01ea, B:34:0x020b, B:35:0x021a, B:37:0x0220, B:39:0x023d, B:41:0x0241, B:43:0x024b, B:45:0x0252, B:47:0x0256, B:48:0x025a, B:51:0x023b, B:57:0x0104, B:58:0x0107, B:60:0x010d, B:62:0x0111, B:63:0x0115, B:65:0x0117, B:68:0x0124, B:69:0x0128, B:71:0x012e, B:77:0x006c, B:79:0x0074, B:81:0x0086, B:83:0x0092, B:84:0x0094, B:87:0x00a1, B:89:0x00b8, B:90:0x00ba, B:92:0x00c2, B:96:0x00d1, B:99:0x00e3, B:103:0x00cf, B:106:0x0149, B:108:0x0160, B:112:0x016a, B:116:0x0168), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012e A[Catch: Exception -> 0x026a, TryCatch #0 {Exception -> 0x026a, blocks: (B:12:0x019e, B:13:0x01a1, B:15:0x01a7, B:17:0x01ab, B:18:0x01af, B:20:0x01b1, B:23:0x01be, B:24:0x01c0, B:26:0x01c6, B:27:0x01d1, B:29:0x01d7, B:32:0x01ea, B:34:0x020b, B:35:0x021a, B:37:0x0220, B:39:0x023d, B:41:0x0241, B:43:0x024b, B:45:0x0252, B:47:0x0256, B:48:0x025a, B:51:0x023b, B:57:0x0104, B:58:0x0107, B:60:0x010d, B:62:0x0111, B:63:0x0115, B:65:0x0117, B:68:0x0124, B:69:0x0128, B:71:0x012e, B:77:0x006c, B:79:0x0074, B:81:0x0086, B:83:0x0092, B:84:0x0094, B:87:0x00a1, B:89:0x00b8, B:90:0x00ba, B:92:0x00c2, B:96:0x00d1, B:99:0x00e3, B:103:0x00cf, B:106:0x0149, B:108:0x0160, B:112:0x016a, B:116:0x0168), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v8, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(long r24, X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r26) {
        /*
            Method dump skipped, instructions count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListSharedViewModel.gv0(long, X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Object obj, InterfaceC67352kd interfaceC67352kd) {
        return gv0(((Number) obj).longValue(), interfaceC67352kd);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Long getCursorByFeedParam(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        return Long.valueOf(this.LJLIL);
    }
}
