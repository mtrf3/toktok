package com.ss.android.ugc.aweme.topic.book.detail.vm;

import X.A2G;
import X.C16880lQ;
import X.C185887Rg;
import X.C185907Ri;
import X.C185917Rj;
import X.C2050482y;
import X.C33Q;
import X.C42625Go9;
import X.C50420Jqa;
import X.C8HZ;
import X.InterfaceC67352kd;
import X.M89;
import X.QD3;
import android.os.Bundle;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS28S0001000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class BookVideoListVM extends BaseDetailShareVM<C185887Rg, C185907Ri, C185917Rj> {
    public String LJLIL;
    public String LJLILLLLZI;
    public C185917Rj LJLJI = new C185917Rj(null);
    public boolean LJLJJI;

    @Override // X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 46;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C185887Rg(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C42625Go9.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C42625Go9.LIZIZ(this);
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
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 485));
    }

    @QD3
    public final void onReceiveVideoEvent(C50420Jqa event) {
        Object LLJJIII;
        Bundle bundle;
        Object LLJJIII2;
        String str;
        o.LJIIIZ(event, "event");
        Bundle bundle2 = event.LJLJI;
        if (bundle2 == null || (LLJJIII = C16880lQ.LLJJIII(bundle2, "page_id")) == null || (bundle = event.LJLJI) == null || (LLJJIII2 = C16880lQ.LLJJIII(bundle, "book_id")) == null || (str = this.LJLIL) == null || this.LJLILLLLZI == null || event.LJLIL != 21 || !o.LJ(str, LLJJIII2)) {
            return;
        }
        String str2 = this.LJLILLLLZI;
        if (str2 != null) {
            if (!o.LJ(str2, LLJJIII)) {
                return;
            }
            Object obj = event.LJLILLLLZI;
            if (!(obj instanceof Aweme)) {
                return;
            }
            Iterator<Aweme> it = getAwemeList().iterator();
            int i = 0;
            while (it.hasNext()) {
                if (o.LJ(it.next().getAid(), ((Aweme) obj).getAid())) {
                    if (i <= 0) {
                        return;
                    }
                    setState(new AqS28S0001000_3(i, 9));
                    return;
                }
                i++;
            }
            return;
        }
        o.LJIJI("pageId");
        throw null;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<C185917Rj>> interfaceC67352kd) {
        return onLoadMore(new C185917Rj(null), interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: gv0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C185917Rj r9, X.InterfaceC67352kd<? super X.A2G<X.C185917Rj>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C185897Rh
            if (r0 == 0) goto L54
            r6 = r10
            X.7Rh r6 = (X.C185897Rh) r6
            int r2 = r6.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L54
            int r2 = r2 - r1
            r6.LJLJJI = r2
        L12:
            java.lang.Object r3 = r6.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJI
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L3d
            if (r0 != r4) goto Ld5
            com.ss.android.ugc.aweme.topic.book.detail.vm.BookVideoListVM r6 = r6.LJLIL
            X.C141335gf.LIZJ(r3)
        L23:
            X.XGX r3 = (X.XGX) r3
            boolean r0 = r3 instanceof X.XGW
            r1 = 0
            if (r0 == 0) goto Lb0
            r6.LJLJJI = r1
            X.XGW r3 = (X.XGW) r3
            D extends X.MfB r0 = r3.LJ
            X.7T0 r0 = (X.C7T0) r0
            com.ss.android.ugc.aweme.topic.book.detail.api.BookVideosResp r7 = r0.LIZ
            if (r7 != 0) goto L5a
            X.A2F r0 = X.A2G.LIZ
            X.A2H r0 = X.A2F.LIZIZ(r0)
            return r0
        L3d:
            X.C141335gf.LIZJ(r3)
            X.XIA r1 = X.C78613UtF.LIZJ
            X.7s6 r0 = new X.7s6
            r0.<init>(r8, r9, r5)
            r6.LJLIL = r8
            r6.LJLJJI = r4
            java.lang.Object r3 = X.XKX.LJI(r1, r0, r6)
            if (r3 != r2) goto L52
            return r2
        L52:
            r6 = r8
            goto L23
        L54:
            X.7Rh r6 = new X.7Rh
            r6.<init>(r8, r10)
            goto L12
        L5a:
            X.7Rj r1 = new X.7Rj
            java.lang.String r0 = r7.pageExtra
            r1.<init>(r0)
            r6.LJLJI = r1
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r7.awemeList
            if (r1 == 0) goto La9
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L76:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = com.ss.android.ugc.aweme.awemeservice.AwemeService.LIZ()
            r0.R1(r1)
            X.7Ri r0 = new X.7Ri
            r0.<init>(r1)
            r3.add(r0)
            goto L76
        L92:
            boolean r0 = r7.hasMore
            if (r0 == 0) goto L9f
            X.A2F r1 = X.A2G.LIZ
            X.7Rj r0 = r6.LJLJI
            X.A2V r0 = X.A2F.LJ(r1, r5, r0, r3, r4)
            goto Lc3
        L9f:
            X.A2F r0 = X.A2G.LIZ
            r0.getClass()
            X.A2H r0 = X.A2F.LIZ(r3)
            goto Lc3
        La9:
            X.A2F r0 = X.A2G.LIZ
            X.A2H r0 = X.A2F.LIZIZ(r0)
            return r0
        Lb0:
            boolean r0 = r3 instanceof X.XGT
            if (r0 == 0) goto Lc4
            r6.LJLJJI = r1
            X.A2F r1 = X.A2G.LIZ
            X.XGT r3 = (X.XGT) r3
            X.MeH r0 = r3.LJFF
            r1.getClass()
            X.A2I r0 = X.A2F.LIZJ(r0)
        Lc3:
            return r0
        Lc4:
            r6.LJLJJI = r1
            X.A2F r1 = X.A2G.LIZ
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            r1.getClass()
            X.A2I r0 = X.A2F.LIZJ(r0)
            goto Lc3
        Ld5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.topic.book.detail.vm.BookVideoListVM.onLoadMore(X.7Rj, X.2kd):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final C185917Rj getCursorByFeedParam(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        return this.LJLJI;
    }
}
