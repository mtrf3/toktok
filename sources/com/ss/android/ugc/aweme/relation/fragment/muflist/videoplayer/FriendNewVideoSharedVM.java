package com.ss.android.ugc.aweme.relation.fragment.muflist.videoplayer;

import X.C32I;
import X.C33Q;
import X.C57715Mkx;
import X.C57716Mky;
import X.C57727Ml9;
import X.C78613UtF;
import X.C88833eB;
import X.C8HZ;
import X.EnumC57724Ml6;
import X.InterfaceC57784Mm4;
import X.M89;
import X.MGR;
import X.MGT;
import X.ORZ;
import X.XKX;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FriendNewVideoSharedVM extends BaseDetailShareVM<C88833eB, C57727Ml9, C57716Mky> {
    public static final C57716Mky LJLJJI = new C57716Mky("", "", EnumC57724Ml6.UNKNOWN, "", 10);
    public final List<Aweme> LJLIL;
    public final C57715Mkx LJLILLLLZI;
    public C57716Mky LJLJI;

    @Override // X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 0;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C88833eB(0);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListRefresh() {
        super.manualListRefresh();
        XKX.LIZLLL(getAssemVMScope(), C78613UtF.LIZJ, null, new MGR(this, null), 2);
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
                if (o.LJ(((C57727Ml9) it.next()).LJLIL.getAid(), aid)) {
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
    public final Aweme getAwemeFromItem(C57727Ml9 c57727Ml9) {
        C57727Ml9 item = c57727Ml9;
        o.LJIIIZ(item, "item");
        return item.LJLIL;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListLoadMore(Object obj) {
        C57716Mky c57716Mky = (C57716Mky) obj;
        super.manualListLoadMore(c57716Mky);
        XKX.LIZLLL(getAssemVMScope(), C78613UtF.LIZJ, null, new MGT(this, c57716Mky, null), 2);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C57727Ml9> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS167S0100000_1(newListState, (C8HZ<InterfaceC57784Mm4>) 189));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC67352kd<? super X.A2G<X.C57716Mky>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C57717Mkz
            if (r0 == 0) goto L9a
            r3 = r6
            X.Mkz r3 = (X.C57717Mkz) r3
            int r2 = r3.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9a
            int r2 = r2 - r1
            r3.LJLJJI = r2
        L12:
            java.lang.Object r4 = r3.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r3.LJLJJI
            r0 = 1
            if (r1 == 0) goto L84
            if (r1 != r0) goto La1
            com.ss.android.ugc.aweme.relation.fragment.muflist.videoplayer.FriendNewVideoSharedVM r3 = r3.LJLIL
            X.C141335gf.LIZJ(r4)
        L22:
            X.Mkr r4 = (X.AbstractC57709Mkr) r4
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "onRefresh loadResult:"
            r1.append(r0)
            java.util.List r0 = r4.LIZ()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "MUF-LIST VideoVM"
            X.C221018lt.LJFF(r0, r1)
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r3.LJLIL
            if (r2 != 0) goto L57
        L41:
            X.Ml8 r0 = X.C57726Ml8.LJLIL
            X.A2G r1 = X.C77123UOp.LJJJZ(r4, r0)
            boolean r0 = r1 instanceof X.A2V
            if (r0 == 0) goto L56
            r0 = r1
            X.A2V r0 = (X.A2V) r0
            T r0 = r0.LIZJ
            X.Mky r0 = (X.C57716Mky) r0
            if (r0 == 0) goto L56
            r3.LJLJI = r0
        L56:
            return r1
        L57:
            boolean r0 = r4 instanceof X.C57714Mkw
            if (r0 == 0) goto L60
            X.Mks r4 = X.C57713Mkv.LIZ(r2)
            goto L41
        L60:
            boolean r0 = r4 instanceof X.C57710Mks
            if (r0 == 0) goto L71
            X.Mks r4 = (X.C57710Mks) r4
            java.util.List<T> r0 = r4.LIZIZ
            java.util.List r0 = r3.gv0(r0, r2)
            X.Mks r4 = X.C57713Mkv.LIZ(r0)
            goto L41
        L71:
            boolean r0 = r4 instanceof X.C57708Mkq
            if (r0 == 0) goto L41
            X.Mkq r4 = (X.C57708Mkq) r4
            Params r1 = r4.LIZIZ
            java.util.List<T> r0 = r4.LIZJ
            java.util.List r0 = r3.gv0(r0, r2)
            X.Mkq r4 = X.C57713Mkv.LIZIZ(r1, r0)
            goto L41
        L84:
            X.C141335gf.LIZJ(r4)
            X.Mkx r1 = r5.LJLILLLLZI
            r3.LJLIL = r5
            r3.LJLJJI = r0
            X.MkF r0 = r1.LIZJ()
            java.lang.Object r4 = r1.LIZ(r0, r3)
            if (r4 != r2) goto L98
            return r2
        L98:
            r3 = r5
            goto L22
        L9a:
            X.Mkz r3 = new X.Mkz
            r3.<init>(r5, r6)
            goto L12
        La1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.fragment.muflist.videoplayer.FriendNewVideoSharedVM.onRefresh(X.2kd):java.lang.Object");
    }

    public final List<Aweme> gv0(List<? extends Aweme> list, List<? extends Aweme> list2) {
        ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
        Iterator<? extends Aweme> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getAid());
        }
        Set LLJJ = ORZ.LLJJ(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Aweme aweme : list) {
            if (!LLJJ.contains(aweme.getAid())) {
                arrayList2.add(aweme);
            }
        }
        List<Aweme> LLJILJILJ = ORZ.LLJILJILJ(arrayList2);
        ((ArrayList) LLJILJILJ).addAll(0, list2);
        return LLJILJILJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: hv0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C57716Mky r6, X.InterfaceC67352kd<? super X.A2G<X.C57716Mky>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C57718Ml0
            if (r0 == 0) goto L65
            r4 = r7
            X.Ml0 r4 = (X.C57718Ml0) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L65
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L53
            if (r0 != r1) goto L6b
            com.ss.android.ugc.aweme.relation.fragment.muflist.videoplayer.FriendNewVideoSharedVM r2 = r4.LJLIL
            X.C141335gf.LIZJ(r3)
        L22:
            X.Mkr r3 = (X.AbstractC57709Mkr) r3
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "onLoadMore loadResult:"
            r1.append(r0)
            java.util.List r0 = r3.LIZ()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "MUF-LIST VideoVM"
            X.C221018lt.LJFF(r0, r1)
            X.Ml7 r0 = X.C57725Ml7.LJLIL
            X.A2G r1 = X.C77123UOp.LJJJZ(r3, r0)
            boolean r0 = r1 instanceof X.A2V
            if (r0 == 0) goto L52
            r0 = r1
            X.A2V r0 = (X.A2V) r0
            T r0 = r0.LIZJ
            X.Mky r0 = (X.C57716Mky) r0
            if (r0 == 0) goto L52
            r2.LJLJI = r0
        L52:
            return r1
        L53:
            X.C141335gf.LIZJ(r3)
            X.Mkx r0 = r5.LJLILLLLZI
            r4.LJLIL = r5
            r4.LJLJJI = r1
            java.lang.Object r3 = r0.LIZ(r6, r4)
            if (r3 != r2) goto L63
            return r2
        L63:
            r2 = r5
            goto L22
        L65:
            X.Ml0 r4 = new X.Ml0
            r4.<init>(r5, r7)
            goto L12
        L6b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.fragment.muflist.videoplayer.FriendNewVideoSharedVM.onLoadMore(X.Mky, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FriendNewVideoSharedVM(User author, EnumC57724Ml6 scene, List<? extends Aweme> list) {
        o.LJIIIZ(author, "author");
        o.LJIIIZ(scene, "scene");
        this.LJLIL = list;
        String uid = author.getUid();
        uid = uid == null ? "" : uid;
        String secUid = author.getSecUid();
        this.LJLILLLLZI = new C57715Mkx(new C57716Mky(uid, secUid == null ? "" : secUid, scene, "", 10));
        this.LJLJI = LJLJJI;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final C57716Mky getCursorByFeedParam(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        return this.LJLJI;
    }
}
