package com.ss.android.ugc.aweme.watch.history.core;

import X.A2G;
import X.C188027Zm;
import X.C188067Zq;
import X.C188117Zv;
import X.C188157Zz;
import X.C188167a0;
import X.C188727au;
import X.C2050482y;
import X.C2NU;
import X.C32I;
import X.C33Q;
import X.C42625Go9;
import X.C5S1;
import X.C60482Yy;
import X.C73969T1h;
import X.C8HZ;
import X.EF7;
import X.EnumC188177a1;
import X.FMX;
import X.InterfaceC48038ItG;
import X.InterfaceC64592gB;
import X.InterfaceC67352kd;
import X.InterfaceC73592SuS;
import X.M89;
import X.ORZ;
import X.T16;
import Y.AfS55S0100000_3;
import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.watch.history.api.WatchHistoryApi;
import com.ss.android.ugc.aweme.watch.history.api.WatchHistoryCopyResponse;
import com.ss.android.ugc.aweme.watch.history.api.WatchHistoryDialogCopy;
import com.ss.android.ugc.aweme.watch.history.api.WatchHistoryItemParam;
import com.ss.android.ugc.aweme.watch.history.core.WatchHistoryListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS28S1000000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class WatchHistoryListViewModel extends BaseDetailShareVM<C188027Zm, C188067Zq, C60482Yy> {
    public static final /* synthetic */ int LJLJLJ = 0;
    public final IAccountUserService LJLIL;
    public C60482Yy LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public final Map<String, C188067Zq> LJLJJL;
    public int LJLJJLL;
    public WatchHistoryCopyResponse LJLJL;

    @Override // X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 45;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C188027Zm(0);
    }

    public final void gv0() {
        setState(new AqS169S0100000_3(this, 537));
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("type", kv0().getValue());
        c188727au.LIZLLL(0, "is_success");
        FMX.LJIIL("show_toast_delete_account_history", c188727au.LIZ);
    }

    public final void iv0() {
        String string;
        WatchHistoryDialogCopy watchHistoryDialogCopy;
        WatchHistoryDialogCopy watchHistoryDialogCopy2;
        WatchHistoryDialogCopy watchHistoryDialogCopy3;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("type", kv0().getValue());
        c188727au.LIZLLL(1, "is_success");
        FMX.LJIIL("show_toast_delete_account_history", c188727au.LIZ);
        EnumC188177a1 deleteType = kv0();
        Context LIZIZ = EF7.LIZIZ();
        WatchHistoryCopyResponse watchHistoryCopyResponse = this.LJLJL;
        o.LJIIIZ(deleteType, "deleteType");
        int i = C188167a0.LIZ[deleteType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (watchHistoryCopyResponse == null || (watchHistoryDialogCopy3 = watchHistoryCopyResponse.deleteConfirmationDialogSingle) == null || (string = watchHistoryDialogCopy3.getToastSuccess()) == null) {
                    string = LIZIZ.getString(R.string.tun);
                    o.LJIIIIZZ(string, "ctx.getString(R.string.w…ete_select_success_toast)");
                }
            } else if (watchHistoryCopyResponse == null || (watchHistoryDialogCopy2 = watchHistoryCopyResponse.deleteConfirmationDialogBatched) == null || (string = watchHistoryDialogCopy2.getToastSuccess()) == null) {
                string = LIZIZ.getString(R.string.tun);
                o.LJIIIIZZ(string, "ctx.getString(R.string.w…ete_select_success_toast)");
            }
        } else if (watchHistoryCopyResponse == null || (watchHistoryDialogCopy = watchHistoryCopyResponse.deleteConfirmationDialogAll) == null || (string = watchHistoryDialogCopy.getToastSuccess()) == null) {
            string = LIZIZ.getString(R.string.tup);
            o.LJIIIIZZ(string, "ctx.getString(R.string.w…ory_delete_success_toast)");
        }
        ((LinkedHashMap) this.LJLJJL).clear();
        this.LJLJJI = false;
        this.LJLJI = false;
        setState(new AqS28S1000000_3(string, 6));
    }

    public final EnumC188177a1 kv0() {
        if (this.LJLJJI) {
            return EnumC188177a1.ALL;
        }
        if (this.LJLJJL.size() > 1) {
            return EnumC188177a1.MULTIPLE;
        }
        if (!this.LJLJJL.isEmpty()) {
            return EnumC188177a1.SINGLE;
        }
        return EnumC188177a1.NONE;
    }

    public final void hv0() {
        List<ITEM> listGetAll = listGetAll();
        if (listGetAll != 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listGetAll) {
                if (this.LJLJJL.containsKey(((C188067Zq) obj).LIZ())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C188067Zq c188067Zq = (C188067Zq) it.next();
                String aid = c188067Zq.LJLIL.getAid();
                o.LJIIIIZZ(aid, "it.aweme.aid");
                arrayList2.add(new WatchHistoryItemParam(aid, String.valueOf(c188067Zq.LJLILLLLZI)));
            }
            List LLJI = ORZ.LLJI(arrayList2);
            if (LLJI == null || LLJI.isEmpty()) {
                return;
            }
            setState(C188157Zz.LJLIL);
            WatchHistoryApi.LIZ.getClass();
            disposeOnClear(C188117Zv.LIZIZ.deleteWatchHistory(GsonProtectorUtils.toJson((Gson) C188117Zv.LIZJ.getValue(), LLJI), 2, false).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJIJL(new InterfaceC48038ItG() { // from class: X.7Zt
                @Override // X.InterfaceC48038ItG
                public final Object apply(Object obj2) {
                    BaseResponse response = (BaseResponse) obj2;
                    o.LJIIIZ(response, "response");
                    java.util.Map<String, C188067Zq> map = WatchHistoryListViewModel.this.LJLJJL;
                    ArrayList arrayList3 = new ArrayList(map.size());
                    Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((C188067Zq) ((Map.Entry) it2.next()).getValue()).LJLIL.getAid());
                    }
                    List LJLL = ORZ.LJLL(arrayList3);
                    if (response.status_code != 0) {
                        WatchHistoryListViewModel.this.gv0();
                        return C61878OQg.INSTANCE;
                    }
                    java.util.Set LLJJ = ORZ.LLJJ(LJLL);
                    List<ITEM> listGetAll2 = WatchHistoryListViewModel.this.listGetAll();
                    if (listGetAll2 != 0) {
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj3 : listGetAll2) {
                            if (!LLJJ.contains(((C188067Zq) obj3).LJLIL.getAid())) {
                                arrayList4.add(obj3);
                            }
                        }
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            ((C188067Zq) it3.next()).LJLJI = null;
                        }
                        WatchHistoryListViewModel.this.listSetItems(arrayList4);
                    }
                    WatchHistoryListViewModel.this.iv0();
                    return LJLL;
                }
            }).LJJIFFI(new InterfaceC73592SuS() { // from class: X.7a2
                @Override // X.InterfaceC73592SuS
                public final boolean test(Object obj2) {
                    List it2 = (List) obj2;
                    o.LJIIIZ(it2, "it");
                    return !it2.isEmpty();
                }
            }).LJJLIIIIJ(new InterfaceC48038ItG() { // from class: X.7a4
                @Override // X.InterfaceC48038ItG
                public final Object apply(Object obj2) {
                    List<String> it2 = (List) obj2;
                    o.LJIIIZ(it2, "it");
                    return LW8.LIZIZ.LJIIIIZZ(it2);
                }
            }).LJJJLIIL(new InterfaceC64592gB() { // from class: X.7a3
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                }
            }, new AfS55S0100000_3(this, 39)));
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C42625Go9.LIZJ(this);
    }

    public final void refresh() {
        EF7.LIZIZ();
        if (C2NU.LIZ.LIZIZ()) {
            manualListRefresh();
            return;
        }
        C5S1 c5s1 = new C5S1(EF7.LIZIZ());
        c5s1.LIZJ(R.string.img);
        c5s1.LJ();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
    }

    public WatchHistoryListViewModel(IAccountUserService userService) {
        o.LJIIIZ(userService, "userService");
        this.LJLIL = userService;
        this.LJLJJL = new LinkedHashMap();
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
                if (o.LJ(((C188067Zq) it.next()).LJLIL.getAid(), aid)) {
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
    public final Aweme getAwemeFromItem(C188067Zq c188067Zq) {
        C188067Zq item = c188067Zq;
        o.LJIIIZ(item, "item");
        return item.LJLIL;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C188067Zq> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 538));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<C60482Yy>> interfaceC67352kd) {
        return jv0(new C60482Yy(this.LJLIL.getCurSecUserId(), null), interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c A[Catch: Exception -> 0x01ba, TryCatch #0 {Exception -> 0x01ba, blocks: (B:11:0x0065, B:12:0x0068, B:14:0x006c, B:17:0x0073, B:19:0x0090, B:20:0x009d, B:22:0x00a3, B:24:0x00b5, B:26:0x00ba, B:28:0x00cb, B:29:0x00d9, B:31:0x00df, B:33:0x00e7, B:35:0x00ef, B:37:0x00f7, B:38:0x0103, B:40:0x0107, B:42:0x010d, B:45:0x0117, B:47:0x011b, B:49:0x0127, B:50:0x012c, B:52:0x0131, B:53:0x0134, B:55:0x0137, B:57:0x0135, B:58:0x013e, B:60:0x0146, B:61:0x0154, B:63:0x015a, B:65:0x0162, B:67:0x016a, B:69:0x0172, B:70:0x017e, B:72:0x0182, B:74:0x0188, B:77:0x0192, B:79:0x0196, B:81:0x01a2, B:82:0x01a7, B:84:0x01ac, B:85:0x01af, B:87:0x01b2, B:89:0x01b0, B:93:0x0034, B:95:0x0038, B:96:0x003a), top: B:7:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073 A[Catch: Exception -> 0x01ba, TryCatch #0 {Exception -> 0x01ba, blocks: (B:11:0x0065, B:12:0x0068, B:14:0x006c, B:17:0x0073, B:19:0x0090, B:20:0x009d, B:22:0x00a3, B:24:0x00b5, B:26:0x00ba, B:28:0x00cb, B:29:0x00d9, B:31:0x00df, B:33:0x00e7, B:35:0x00ef, B:37:0x00f7, B:38:0x0103, B:40:0x0107, B:42:0x010d, B:45:0x0117, B:47:0x011b, B:49:0x0127, B:50:0x012c, B:52:0x0131, B:53:0x0134, B:55:0x0137, B:57:0x0135, B:58:0x013e, B:60:0x0146, B:61:0x0154, B:63:0x015a, B:65:0x0162, B:67:0x016a, B:69:0x0172, B:70:0x017e, B:72:0x0182, B:74:0x0188, B:77:0x0192, B:79:0x0196, B:81:0x01a2, B:82:0x01a7, B:84:0x01ac, B:85:0x01af, B:87:0x01b2, B:89:0x01b0, B:93:0x0034, B:95:0x0038, B:96:0x003a), top: B:7:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object jv0(X.C60482Yy r14, X.InterfaceC67352kd<? super X.A2G<X.C60482Yy>> r15) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.watch.history.core.WatchHistoryListViewModel.jv0(X.2Yy, X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC67352kd interfaceC67352kd) {
        return jv0((C60482Yy) obj, interfaceC67352kd);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final C60482Yy getCursorByFeedParam(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        C60482Yy c60482Yy = this.LJLILLLLZI;
        if (c60482Yy == null) {
            return new C60482Yy(this.LJLIL.getCurSecUserId(), CardStruct.IStatusCode.DEFAULT);
        }
        return c60482Yy;
    }
}
