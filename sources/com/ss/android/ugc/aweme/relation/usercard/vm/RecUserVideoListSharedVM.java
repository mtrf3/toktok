package com.ss.android.ugc.aweme.relation.usercard.vm;

import X.C182367Ds;
import X.C2050482y;
import X.C223208pQ;
import X.C32I;
import X.C33Q;
import X.C57712Mku;
import X.C57720Ml2;
import X.C72912tb;
import X.C78613UtF;
import X.C8HZ;
import X.InterfaceC57699Mkh;
import X.M89;
import X.MGQ;
import X.MGS;
import X.ORZ;
import X.QD3;
import X.XIA;
import X.XKW;
import X.XKX;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class RecUserVideoListSharedVM extends BaseDetailShareVM<C182367Ds, C57712Mku, C57720Ml2> {
    public static final C57720Ml2 LJLJJLL = new C57720Ml2(0);
    public final User LJLIL;
    public final InterfaceC57699Mkh LJLILLLLZI;
    public final XKW LJLJI;
    public C57720Ml2 LJLJJI;
    public List<? extends Aweme> LJLJJL;

    @Override // X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 0;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C182367Ds(0);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListRefresh() {
        super.manualListRefresh();
        XKX.LIZLLL(getAssemVMScope(), this.LJLJI, null, new MGQ(this, null), 2);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        EventBus.LIZJ().LJIILJJIL(this);
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
                if (o.LJ(((C57712Mku) it.next()).LJLIL.getAid(), aid)) {
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
    public final Aweme getAwemeFromItem(C57712Mku c57712Mku) {
        C57712Mku item = c57712Mku;
        o.LJIIIZ(item, "item");
        return item.LJLIL;
    }

    public final void iv0(List<? extends Aweme> topAwemeList) {
        boolean z;
        o.LJIIIZ(topAwemeList, "topAwemeList");
        this.LJLJJL = topAwemeList;
        ArrayList arrayList = new ArrayList(C32I.LJJL(topAwemeList, 10));
        Iterator<? extends Aweme> it = topAwemeList.iterator();
        while (it.hasNext()) {
            arrayList.add(new C57712Mku(it.next()));
        }
        if (topAwemeList.size() >= 3) {
            z = true;
        } else {
            z = false;
        }
        setState(new AqS134S0200000_3(new C72912tb(new C223208pQ(z, 1)), (C72912tb<C223208pQ>) arrayList, (List<C57712Mku>) UserLevelGeckoUpdateSetting.DEFAULT));
        InterfaceC57699Mkh interfaceC57699Mkh = this.LJLILLLLZI;
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(topAwemeList, 10));
        Iterator<? extends Aweme> it2 = topAwemeList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().getAid());
        }
        interfaceC57699Mkh.LIZLLL(arrayList2);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListLoadMore(Object obj) {
        C57720Ml2 c57720Ml2 = (C57720Ml2) obj;
        super.manualListLoadMore(c57720Ml2);
        XKX.LIZLLL(getAssemVMScope(), this.LJLJI, null, new MGS(this, c57720Ml2, null), 2);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C57712Mku> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 412));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onFollowEvent(FollowStatusEvent followStatusEvent) {
        o.LJIIIZ(followStatusEvent, "followStatusEvent");
        FollowStatus followStatus = followStatusEvent.status;
        if (!o.LJ(followStatus.userId, this.LJLIL.getUid())) {
            return;
        }
        Iterator<Aweme> it = getAwemeList().iterator();
        while (it.hasNext()) {
            it.next().getAuthor().setFollowStatus(followStatus.followStatus);
        }
        this.LJLIL.setFollowStatus(followStatus.followStatus);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC67352kd<? super X.A2G<X.C57720Ml2>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C57704Mkm
            if (r0 == 0) goto La7
            r5 = r7
            X.Mkm r5 = (X.C57704Mkm) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La7
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r4 = r5.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r2 = 1
            if (r0 == 0) goto L8b
            if (r0 != r2) goto Lae
            com.ss.android.ugc.aweme.relation.usercard.vm.RecUserVideoListSharedVM r2 = r5.LJLIL
            X.C141335gf.LIZJ(r4)
        L22:
            X.Mkr r4 = (X.AbstractC57709Mkr) r4
            java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r3 = r2.LJLJJL
            if (r3 != 0) goto L5c
        L28:
            r3 = r4
        L29:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "onRefresh, "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", compose result: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "[UserCard]_videoVM"
            X.C221018lt.LJFF(r0, r1)
            X.Mkt r0 = X.C57711Mkt.LJLIL
            X.A2G r1 = X.C77123UOp.LJJJZ(r3, r0)
            boolean r0 = r1 instanceof X.A2V
            if (r0 == 0) goto L5b
            r0 = r1
            X.A2V r0 = (X.A2V) r0
            T r0 = r0.LIZJ
            X.Ml2 r0 = (X.C57720Ml2) r0
            if (r0 == 0) goto L5b
            r2.LJLJJI = r0
        L5b:
            return r1
        L5c:
            boolean r0 = r4 instanceof X.C57714Mkw
            if (r0 == 0) goto L65
            X.Mks r3 = X.C57713Mkv.LIZ(r3)
            goto L29
        L65:
            boolean r0 = r4 instanceof X.C57710Mks
            if (r0 == 0) goto L77
            r0 = r4
            X.Mks r0 = (X.C57710Mks) r0
            java.util.List<T> r0 = r0.LIZIZ
            java.util.List r0 = r2.gv0(r0, r3)
            X.Mks r3 = X.C57713Mkv.LIZ(r0)
            goto L29
        L77:
            boolean r0 = r4 instanceof X.C57708Mkq
            if (r0 == 0) goto L28
            r0 = r4
            X.Mkq r0 = (X.C57708Mkq) r0
            Params r1 = r0.LIZIZ
            java.util.List<T> r0 = r0.LIZJ
            java.util.List r0 = r2.gv0(r0, r3)
            X.Mkq r3 = X.C57713Mkv.LIZIZ(r1, r0)
            goto L29
        L8b:
            X.C141335gf.LIZJ(r4)
            X.Mkh r0 = r6.LJLILLLLZI
            r0.reset()
            X.Mkh r1 = r6.LJLILLLLZI
            r5.LJLIL = r6
            r5.LJLJJI = r2
            X.MkF r0 = r1.LIZJ()
            java.lang.Object r4 = r1.LIZ(r0, r5)
            if (r4 != r3) goto La4
            return r3
        La4:
            r2 = r6
            goto L22
        La7:
            X.Mkm r5 = new X.Mkm
            r5.<init>(r6, r7)
            goto L12
        Lae:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.usercard.vm.RecUserVideoListSharedVM.onRefresh(X.2kd):java.lang.Object");
    }

    public RecUserVideoListSharedVM(User curUser, InterfaceC57699Mkh repository) {
        XIA ioDispatch = C78613UtF.LIZJ;
        o.LJIIIZ(curUser, "curUser");
        o.LJIIIZ(repository, "repository");
        o.LJIIIZ(ioDispatch, "ioDispatch");
        this.LJLIL = curUser;
        this.LJLILLLLZI = repository;
        this.LJLJI = ioDispatch;
        this.LJLJJI = LJLJJLL;
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
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: hv0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C57720Ml2 r6, X.InterfaceC67352kd<? super X.A2G<X.C57720Ml2>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C57705Mkn
            if (r0 == 0) goto L61
            r4 = r7
            X.Mkn r4 = (X.C57705Mkn) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L4f
            if (r0 != r1) goto L67
            com.ss.android.ugc.aweme.relation.usercard.vm.RecUserVideoListSharedVM r2 = r4.LJLIL
            X.C141335gf.LIZJ(r3)
        L22:
            X.Mkr r3 = (X.AbstractC57709Mkr) r3
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "onLoadMore, "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "[UserCard]_videoVM"
            X.C221018lt.LJFF(r0, r1)
            X.Mko r0 = X.C57706Mko.LJLIL
            X.A2G r1 = X.C77123UOp.LJJJZ(r3, r0)
            boolean r0 = r1 instanceof X.A2V
            if (r0 == 0) goto L4e
            r0 = r1
            X.A2V r0 = (X.A2V) r0
            T r0 = r0.LIZJ
            X.Ml2 r0 = (X.C57720Ml2) r0
            if (r0 == 0) goto L4e
            r2.LJLJJI = r0
        L4e:
            return r1
        L4f:
            X.C141335gf.LIZJ(r3)
            X.Mkh r0 = r5.LJLILLLLZI
            r4.LJLIL = r5
            r4.LJLJJI = r1
            java.lang.Object r3 = r0.LIZ(r6, r4)
            if (r3 != r2) goto L5f
            return r2
        L5f:
            r2 = r5
            goto L22
        L61:
            X.Mkn r4 = new X.Mkn
            r4.<init>(r5, r7)
            goto L12
        L67:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.usercard.vm.RecUserVideoListSharedVM.onLoadMore(X.Ml2, X.2kd):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final C57720Ml2 getCursorByFeedParam(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        return this.LJLJJI;
    }
}
