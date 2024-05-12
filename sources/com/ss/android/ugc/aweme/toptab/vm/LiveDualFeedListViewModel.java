package com.ss.android.ugc.aweme.toptab.vm;

import X.A2F;
import X.A2G;
import X.A2I;
import X.C124384uQ;
import X.C2050482y;
import X.C207148Ba;
import X.C207168Bc;
import X.C214188as;
import X.C32I;
import X.C33Q;
import X.C42625Go9;
import X.C47261Igj;
import X.C55045Liz;
import X.C59992Xb;
import X.C61878OQg;
import X.C78404Ups;
import X.C8HZ;
import X.F9E;
import X.FMX;
import X.InterfaceC207188Be;
import X.InterfaceC67352kd;
import X.ORZ;
import X.OSZ;
import X.QD3;
import X.SZP;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS57S1100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LiveDualFeedListViewModel extends AssemListViewModel<C207148Ba, C59992Xb, C124384uQ> {
    public A2G<C124384uQ> LJLIL;
    public boolean LJLILLLLZI = true;
    public final C214188as LJLJI = C78404Ups.LIZJ(this, C207168Bc.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C207148Ba(0);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    public final A2G<C124384uQ> gv0(boolean z) {
        String str;
        ?? r6;
        A2G<C124384uQ> LIZ;
        ?? r62;
        List<Aweme> items;
        if (!z) {
            try {
                hv0("slide_up");
            } catch (Exception e) {
                A2G.LIZ.getClass();
                A2I LIZJ = A2F.LIZJ(e);
                this.LJLIL = LIZJ;
                return LIZJ;
            }
        }
        if (this.LJLILLLLZI) {
            str = "live_tab_cover_enter";
        } else if (z) {
            str = "live_tab_cover_refresh";
        } else {
            str = "live_tab_cover_loadmore";
        }
        int i = 0;
        this.LJLILLLLZI = false;
        FeedItemList fetchLiveFeedList = ((InterfaceC207188Be) this.LJLJI.getValue().getOperator()).fetchLiveFeedList(str);
        if (z && ((items = fetchLiveFeedList.getItems()) == null || items.isEmpty())) {
            C207148Ba c207148Ba = (C207148Ba) getState();
            c207148Ba.getClass();
            List<C59992Xb> list = c207148Ba.getListState().LJLJJI;
            if (list != null && !list.isEmpty()) {
                C207148Ba c207148Ba2 = (C207148Ba) getState();
                c207148Ba2.getClass();
                List<C59992Xb> list2 = c207148Ba2.getListState().LJLJJI;
                if (list2 != null) {
                    return A2F.LJ(A2G.LIZ, null, new F9E() { // from class: X.4uQ
                        public final long LJLIL = 0;

                        @Override // X.F9E
                        public final Object[] getObjects() {
                            return new Object[]{Long.valueOf(this.LJLIL)};
                        }
                    }, list2, 1);
                }
            }
        }
        if (fetchLiveFeedList.hasMore == 1) {
            A2F a2f = A2G.LIZ;
            List<Aweme> items2 = fetchLiveFeedList.getItems();
            if (items2 != null) {
                r62 = new ArrayList(C32I.LJJL(items2, 10));
                for (Aweme aweme : items2) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        Aweme aweme2 = aweme;
                        o.LJIIIIZZ(aweme2, "aweme");
                        r62.add(new C59992Xb(aweme2, fetchLiveFeedList.getRequestId(), fetchLiveFeedList.logPb));
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            } else {
                r62 = C61878OQg.INSTANCE;
            }
            LIZ = A2F.LJ(a2f, null, new F9E() { // from class: X.4uQ
                public final long LJLIL = 0;

                @Override // X.F9E
                public final Object[] getObjects() {
                    return new Object[]{Long.valueOf(this.LJLIL)};
                }
            }, r62, 1);
        } else {
            A2F a2f2 = A2G.LIZ;
            List<Aweme> items3 = fetchLiveFeedList.getItems();
            if (items3 != null) {
                r6 = new ArrayList(C32I.LJJL(items3, 10));
                for (Aweme aweme3 : items3) {
                    int i3 = i + 1;
                    if (i >= 0) {
                        Aweme aweme4 = aweme3;
                        o.LJIIIIZZ(aweme4, "aweme");
                        r6.add(new C59992Xb(aweme4, fetchLiveFeedList.getRequestId(), fetchLiveFeedList.logPb));
                        i = i3;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            } else {
                r6 = C61878OQg.INSTANCE;
            }
            a2f2.getClass();
            LIZ = A2F.LIZ(r6);
        }
        this.LJLIL = LIZ;
        return LIZ;
    }

    public final void hv0(String str) {
        if (str.length() == 0) {
            return;
        }
        FMX.LJIILL("refresh_homepage_live", new OSZ("homepage_live", "enter_from"), new OSZ("live_cell", "enter_method"), new OSZ(str, "refresh_method"), new OSZ(Integer.valueOf(NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).getEffectiveConnectionType()), "network_status"));
    }

    public final void iv0(String str) {
        withState(new AqS57S1100000_3(this, str, 11));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C59992Xb> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 507));
    }

    @QD3
    public final void onDeleteAwemeEvent(C55045Liz event) {
        o.LJIIIZ(event, "event");
        withState(new AqS134S0200000_3(this, event, 164));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<C124384uQ>> interfaceC67352kd) {
        return gv0(true);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(C124384uQ c124384uQ, InterfaceC67352kd<? super A2G<C124384uQ>> interfaceC67352kd) {
        return gv0(false);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final List<C59992Xb> onLoadPageAddData(SZP type, List<C59992Xb> originItem, List<C59992Xb> newData) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(originItem, "originItem");
        o.LJIIIZ(newData, "newData");
        List<C59992Xb> onLoadPageAddData = super.onLoadPageAddData(type, originItem, newData);
        if (type == SZP.Refresh && newData.isEmpty() && (this.LJLIL instanceof A2I)) {
            return ORZ.LLJILJILJ(originItem);
        }
        return onLoadPageAddData;
    }
}
