package com.ss.android.ugc.aweme.search.detail.edm.viewmodel;

import X.AbstractC72278SYg;
import X.C33Q;
import X.C72808Sho;
import X.C8HZ;
import X.C90593h1;
import X.C90613h3;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import X.M89;
import X.SYL;
import X.TBR;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchEDMVideoDetailSharedVM extends BaseDetailShareVM<C90593h1, C90613h3, Long> {
    public long LJLIL;
    public boolean LJLILLLLZI = true;
    public String LJLJI = "";
    public Long LJLJJI;
    public int LJLJJL;
    public M89 LJLJJLL;

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC51679KPz
    public final boolean cannotLoadLatest() {
        return true;
    }

    @Override // X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 9;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C90593h1(0);
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
                if (o.LJ(((C90613h3) it.next()).LJLIL.getAid(), aid)) {
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
    public final Aweme getAwemeFromItem(C90613h3 c90613h3) {
        C90613h3 item = c90613h3;
        o.LJIIIZ(item, "item");
        return item.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC51679KPz
    public final boolean init(Fragment owner) {
        o.LJIIIZ(owner, "owner");
        Context context = owner.getContext();
        if (context == null) {
            return super.init(owner);
        }
        SYL syl = new SYL(context, null);
        C72808Sho<InterfaceC57784Mm4> state = syl.getState();
        o.LJIIIIZZ(state, "powerList.state");
        setListState(state);
        syl.LJLJLLL((AbstractC72278SYg) new TBR(this) { // from class: X.JqJ
            @Override // X.TBR, X.AbstractC74222TBa, X.InterfaceC74226TBe
            public final Object get() {
                return ((AssemListViewModel) this.receiver).getConfig();
            }
        }.get());
        return super.init(owner);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C90613h3> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS167S0100000_1(newListState, (C8HZ<InterfaceC57784Mm4>) 191));
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0088, code lost:
    
        if (r9 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x008a, code lost:
    
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00a9, code lost:
    
        if (android.text.TextUtils.isEmpty(r2) != false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c9 A[Catch: Exception -> 0x00eb, TryCatch #0 {Exception -> 0x00eb, blocks: (B:18:0x00e3, B:19:0x00e6, B:22:0x00c2, B:23:0x00c5, B:25:0x00c9, B:27:0x00d8), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8 A[Catch: Exception -> 0x00eb, TryCatch #0 {Exception -> 0x00eb, blocks: (B:18:0x00e3, B:19:0x00e6, B:22:0x00c2, B:23:0x00c5, B:25:0x00c9, B:27:0x00d8), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r16) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.detail.edm.viewmodel.SearchEDMVideoDetailSharedVM.onRefresh(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0105 A[Catch: Exception -> 0x0130, TryCatch #0 {Exception -> 0x0130, blocks: (B:11:0x00fa, B:12:0x00fd, B:14:0x0105, B:17:0x0114, B:19:0x0118, B:21:0x0126, B:53:0x00dc), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0114 A[Catch: Exception -> 0x0130, TryCatch #0 {Exception -> 0x0130, blocks: (B:11:0x00fa, B:12:0x00fd, B:14:0x0105, B:17:0x0114, B:19:0x0118, B:21:0x0126, B:53:0x00dc), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(long r32, X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r34) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.detail.edm.viewmodel.SearchEDMVideoDetailSharedVM.gv0(long, X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC67352kd interfaceC67352kd) {
        return gv0(((Number) obj).longValue(), interfaceC67352kd);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Long getCursorByFeedParam(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        return Long.valueOf(this.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC51679KPz
    public final void request(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        this.LJLJJLL = feedParam;
        long longValue = Long.valueOf(this.LJLIL).longValue();
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    return;
                }
                manualListLoadMore(Long.valueOf(longValue));
                return;
            }
            manualListLoadLatest(Long.valueOf(longValue));
            return;
        }
        manualListRefresh();
    }
}
