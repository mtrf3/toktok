package com.ss.android.ugc.aweme.detail.vm;

import X.C213688a4;
import X.C214388bC;
import X.C215088cK;
import X.C223208pQ;
import X.C223228pS;
import X.C61878OQg;
import X.C76800UCe;
import X.InterfaceC2064888m;
import X.InterfaceC208718Hb;
import X.InterfaceC223178pN;
import X.InterfaceC224118qt;
import X.InterfaceC51679KPz;
import X.InterfaceC51771KTn;
import X.InterfaceC57784Mm4;
import X.KQA;
import X.M89;
import X.TBT;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class BaseDetailShareVM<S extends InterfaceC208718Hb<S, ITEM>, ITEM extends InterfaceC57784Mm4, Cursor> extends AssemListViewModel<S, ITEM, Cursor> implements InterfaceC51679KPz, InterfaceC224118qt, InterfaceC51771KTn {
    public InterfaceC223178pN detailLoadStateManager;
    public boolean isLoading;
    public KQA operatorView;

    @Override // X.InterfaceC51679KPz
    public /* synthetic */ boolean cannotLoadLatest() {
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public /* synthetic */ boolean cannotLoadMore() {
        return false;
    }

    public abstract int deleteItemByAid(String str);

    public abstract Aweme getAwemeFromItem(ITEM item);

    public abstract Cursor getCursorByFeedParam(int i, M89 m89, int i2, boolean z);

    @Override // X.InterfaceC51679KPz
    public Object getViewModel() {
        return this;
    }

    @Override // X.InterfaceC51679KPz
    public boolean init(Fragment owner) {
        o.LJIIIZ(owner, "owner");
        return true;
    }

    @Override // X.InterfaceC51771KTn
    public boolean shouldSetRefreshListener() {
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public void unInit() {
        this.operatorView = null;
        this.isLoading = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC224118qt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> getAwemeList() {
        /*
            r4 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.8YR r0 = r4.getVmDispatcher()
            X.33Q r0 = r0.getState()
            X.88m r0 = (X.InterfaceC2064888m) r0
            java.util.List r0 = r0.getListItemState()
            if (r0 == 0) goto L3b
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L1e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r1.next()
            X.Mm4 r0 = (X.InterfaceC57784Mm4) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.getAwemeFromItem(r0)
            if (r0 == 0) goto L1e
            r2.add(r0)
            goto L1e
        L34:
            java.util.List r0 = X.ORZ.LLJI(r2)
            if (r0 == 0) goto L3b
            goto L3d
        L3b:
            X.OQg r0 = X.C61878OQg.INSTANCE
        L3d:
            r3.addAll(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM.getAwemeList():java.util.List");
    }

    public boolean hasMore() {
        InterfaceC2064888m interfaceC2064888m = (InterfaceC2064888m) getVmDispatcher().getState();
        C223208pQ LIZ = interfaceC2064888m.getLoadMoreState().LIZ();
        boolean z = false;
        if (LIZ != null) {
            boolean z2 = LIZ.LJLILLLLZI;
            if (C76800UCe.LIZ != null) {
                return z2;
            }
        }
        C223208pQ LIZ2 = interfaceC2064888m.getRefreshState().LIZ();
        if (LIZ2 != null) {
            z = LIZ2.LJLILLLLZI;
        }
        return z;
    }

    @Override // X.InterfaceC51679KPz
    public boolean isDataEmpty() {
        List listItemState = ((InterfaceC2064888m) getVmDispatcher().getState()).getListItemState();
        if (listItemState == null || listItemState.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public boolean isLoading() {
        return this.isLoading;
    }

    @Override // X.InterfaceC51679KPz
    public void bindView(KQA detailFragmentPanel) {
        o.LJIIIZ(detailFragmentPanel, "detailFragmentPanel");
        this.operatorView = detailFragmentPanel;
        asyncSubscribe(new TBT() { // from class: X.8pJ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((InterfaceC2064888m) obj).getRefreshState();
            }
        }, C213688a4.LIZLLL(), new AqS134S0200000_3((BaseDetailShareVM) this, detailFragmentPanel, (KQA) 40), new AqS150S0200000_3((BaseDetailShareVM) this, detailFragmentPanel, (KQA) 22), new AqS134S0200000_3((BaseDetailShareVM) this, detailFragmentPanel, (KQA) 41));
        asyncSubscribe(new TBT() { // from class: X.8pF
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((InterfaceC2064888m) obj).getLoadLatestState();
            }
        }, C213688a4.LIZLLL(), new AqS134S0200000_3((BaseDetailShareVM) this, detailFragmentPanel, (KQA) 42), new AqS150S0200000_3((BaseDetailShareVM) this, detailFragmentPanel, (KQA) 23), new AqS134S0200000_3((BaseDetailShareVM) this, detailFragmentPanel, (KQA) 43));
        asyncSubscribe(new TBT() { // from class: X.8pK
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((InterfaceC2064888m) obj).getLoadMoreState();
            }
        }, C213688a4.LIZLLL(), new AqS134S0200000_3((BaseDetailShareVM) this, detailFragmentPanel, (KQA) 38), new AqS150S0200000_3((BaseDetailShareVM) this, detailFragmentPanel, (KQA) 21), new AqS134S0200000_3((BaseDetailShareVM) this, detailFragmentPanel, (KQA) 39));
    }

    @Override // X.InterfaceC51679KPz
    public boolean deleteItem(String aid) {
        o.LJIIIZ(aid, "aid");
        int deleteItemByAid = deleteItemByAid(aid);
        if (deleteItemByAid >= 0) {
            KQA kqa = this.operatorView;
            if (kqa != null) {
                kqa.onItemDeleted(deleteItemByAid);
            }
            return true;
        }
        return false;
    }

    public List<ITEM> getItemList(S state) {
        o.LJIIIZ(state, "state");
        List<ITEM> listItemState = state.getListItemState();
        if (listItemState == null) {
            return C61878OQg.INSTANCE;
        }
        return listItemState;
    }

    public final void initialize(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        if (!this._initialized) {
            C214388bC.LIZ(this, new AqS153S0100000_3(owner, 192), null, null, C215088cK.LJLIL, C223228pS.LJLIL);
        }
    }

    @Override // X.InterfaceC51679KPz
    public void request(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        Cursor cursorByFeedParam = getCursorByFeedParam(i, feedParam, i2, z);
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    return;
                }
                manualListLoadMore(cursorByFeedParam);
                return;
            }
            manualListLoadLatest(cursorByFeedParam);
            return;
        }
        manualListRefresh();
    }
}
