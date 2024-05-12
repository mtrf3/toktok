package com.ss.android.ugc.aweme.paidcontent.viewmodel;

import X.A2G;
import X.C113554cx;
import X.C19N;
import X.C221108m2;
import X.C254149yE;
import X.C254169yG;
import X.C254179yH;
import X.C254189yI;
import X.C254199yJ;
import X.C254229yM;
import X.C254549ys;
import X.C254559yt;
import X.C33Q;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C8HZ;
import X.EF7;
import X.EnumC25627A3z;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidCollectionListResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS28S0210000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidContentCollectionListAssemViewModel extends AssemListViewModel<C254149yE, C254559yt, Integer> {
    public int LJLIL = -1;
    public final C55749LuL LJLILLLLZI = new C55749LuL(C47704Ins.LIZLLL(this, C254229yM.class, "paid_content_collection_list_hierarchy_data_key"), true);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C254549ys.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C254149yE(0);
    }

    public final C254229yM gv0() {
        return (C254229yM) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C254559yt> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS170S0100000_4(newListState, (C8HZ<InterfaceC57784Mm4>) 510));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        return iv0(gv0().LJLIL, gv0().LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void hv0(C254559yt c254559yt, int i) {
        String str;
        C254559yt listGetAt;
        PaidCollectionListResponse paidCollectionListResponse;
        List<CollectionDetailModel> list;
        if (gv0().LJLJJLL) {
            if (c254559yt != null) {
                int i2 = this.LJLIL;
                if (i2 == i) {
                    this.LJLIL = -1;
                    jv0(c254559yt.LJLIL, false);
                } else {
                    if (i2 != -1 && (listGetAt = listGetAt(i2)) != null) {
                        jv0(listGetAt.LJLIL, false);
                    }
                    jv0(c254559yt.LJLIL, true);
                    this.LJLIL = i;
                }
                if (this.LJLIL == -1) {
                    setState(C254179yH.LJLIL);
                } else {
                    setState(C254189yI.LJLIL);
                }
                if (C19N.LJ("creator_m10n_android_paid_content_anchor_awareness_enabled", false) && gv0().LJLJJLL && (paidCollectionListResponse = ((C254149yE) getState()).LJLIL) != null && (list = paidCollectionListResponse.collectionList) != null && list.size() == 1) {
                    setState(C254199yJ.LJLIL);
                    return;
                }
                return;
            }
            return;
        }
        if (c254559yt == null) {
            return;
        }
        CollectionDetailModel collectionDetailModel = c254559yt.LJLIL;
        if (gv0().LJLJL) {
            Map LJJLIL = C113554cx.LJJLIL(((C254149yE) getState()).LJLJI);
            if (LJJLIL.containsKey(Long.valueOf(collectionDetailModel.getCollectionId()))) {
                LJJLIL.remove(Long.valueOf(collectionDetailModel.getCollectionId()));
                setState(new AqS170S0100000_4(LJJLIL, (Map<Integer, String>) 900));
                jv0(collectionDetailModel, false);
                return;
            } else {
                if (LJJLIL.size() == 10) {
                    setState(C254169yG.LJLIL);
                    return;
                }
                LJJLIL.put(Long.valueOf(collectionDetailModel.getCollectionId()), collectionDetailModel);
                setState(new AqS170S0100000_4(LJJLIL, (Map<Integer, String>) 901));
                jv0(collectionDetailModel, true);
                return;
            }
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(EF7.LIZIZ(), "aweme://paidcontent/collections/detail");
        buildRoute.withParam("collection_id", collectionDetailModel.getCollectionId());
        User collectionCreator = collectionDetailModel.getCollectionCreator();
        if (collectionCreator != null) {
            str = collectionCreator.getUid();
        } else {
            str = null;
        }
        buildRoute.withParam("owner_id", str);
        buildRoute.withParam("from_collection_list", true);
        buildRoute.withParam("enter_from", gv0().LJLJI);
        buildRoute.withParam("session_id", gv0().LJLJJI);
        buildRoute.withParam("entry_source", EnumC25627A3z.SERIES_LIST);
        buildRoute.open();
    }

    public final void jv0(CollectionDetailModel collectionModel, boolean z) {
        o.LJIIIZ(collectionModel, "collectionModel");
        withState(new AqS28S0210000_4(collectionModel, z, this, 2));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Integer num, InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        num.intValue();
        return iv0(gv0().LJLIL, gv0().LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c A[Catch: Exception -> 0x0091, TryCatch #0 {Exception -> 0x0091, blocks: (B:11:0x0043, B:12:0x0046, B:14:0x004c, B:15:0x005b, B:17:0x0061, B:19:0x007d, B:23:0x007b, B:27:0x0031), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b A[Catch: Exception -> 0x0091, TryCatch #0 {Exception -> 0x0091, blocks: (B:11:0x0043, B:12:0x0046, B:14:0x004c, B:15:0x005b, B:17:0x0061, B:19:0x007d, B:23:0x007b, B:27:0x0031), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object iv0(long r12, int r14, X.InterfaceC67352kd r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof X.C254209yK
            if (r0 == 0) goto L20
            r4 = r15
            X.9yK r4 = (X.C254209yK) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r2 = r4.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentCollectionListAssemViewModel r4 = r4.LJLIL
            goto L43
        L20:
            X.9yK r4 = new X.9yK
            r4.<init>(r11, r15)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C141335gf.LIZJ(r2)
            r0 = 0
            X.Svk r0 = X.A4J.LIZIZ(r0, r12, r14)     // Catch: java.lang.Exception -> L91
            r4.LJLIL = r11     // Catch: java.lang.Exception -> L91
            r4.LJLJJI = r1     // Catch: java.lang.Exception -> L91
            java.lang.Object r2 = X.C77318UWc.LIZIZ(r0, r4)     // Catch: java.lang.Exception -> L91
            if (r2 != r3) goto L41
            return r3
        L41:
            r4 = r11
            goto L46
        L43:
            X.C141335gf.LIZJ(r2)     // Catch: java.lang.Exception -> L91
        L46:
            com.ss.android.ugc.aweme.model.PaidCollectionListResponse r2 = (com.ss.android.ugc.aweme.model.PaidCollectionListResponse) r2     // Catch: java.lang.Exception -> L91
            java.util.List<com.ss.android.ugc.aweme.model.CollectionDetailModel> r1 = r2.collectionList     // Catch: java.lang.Exception -> L91
            if (r1 == 0) goto L7b
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> L91
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)     // Catch: java.lang.Exception -> L91
            r3.<init>(r0)     // Catch: java.lang.Exception -> L91
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L91
        L5b:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Exception -> L91
            if (r0 == 0) goto L7d
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Exception -> L91
            com.ss.android.ugc.aweme.model.CollectionDetailModel r6 = (com.ss.android.ugc.aweme.model.CollectionDetailModel) r6     // Catch: java.lang.Exception -> L91
            X.9yt r5 = new X.9yt     // Catch: java.lang.Exception -> L91
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            X.9yM r0 = r4.gv0()     // Catch: java.lang.Exception -> L91
            java.lang.String r9 = r0.LJLJJI     // Catch: java.lang.Exception -> L91
            r10 = 1
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L91
            r3.add(r5)     // Catch: java.lang.Exception -> L91
            goto L5b
        L7b:
            X.OQg r3 = X.C61878OQg.INSTANCE     // Catch: java.lang.Exception -> L91
        L7d:
            kotlin.jvm.internal.AqS170S0100000_4 r1 = new kotlin.jvm.internal.AqS170S0100000_4     // Catch: java.lang.Exception -> L91
            r0 = 902(0x386, float:1.264E-42)
            r1.<init>(r2, r0)     // Catch: java.lang.Exception -> L91
            r4.setState(r1)     // Catch: java.lang.Exception -> L91
            X.A2F r0 = X.A2G.LIZ     // Catch: java.lang.Exception -> L91
            r0.getClass()     // Catch: java.lang.Exception -> L91
            X.A2H r0 = X.A2F.LIZ(r3)     // Catch: java.lang.Exception -> L91
            return r0
        L91:
            r1 = move-exception
            X.A2F r0 = X.A2G.LIZ
            r0.getClass()
            X.A2I r0 = X.A2F.LIZJ(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentCollectionListAssemViewModel.iv0(long, int, X.2kd):java.lang.Object");
    }
}
