package com.ss.android.ugc.aweme.toptab.vm;

import X.AbstractC57774Mlu;
import X.C214188as;
import X.C33Q;
import X.C54668Lcu;
import X.C54948LhQ;
import X.C54949LhR;
import X.C54950LhS;
import X.C57775Mlv;
import X.C65777Prh;
import X.C78404Ups;
import X.C8HZ;
import X.InterfaceC207188Be;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import X.X1D;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LiveSingleFeedListViewModel extends AssemSingleListViewModel<Aweme, C54668Lcu, Long> {
    public boolean LJLIL = true;
    public final C214188as LJLILLLLZI = C78404Ups.LIZJ(this, C54950LhS.LJLIL);
    public final List<Aweme> LJLJI = new ArrayList();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C54668Lcu(new C8HZ(null, null, 15), true);
    }

    public final List<Aweme> gv0(FeedItemList feedItemList) {
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : feedItemList.getItems()) {
            List<Aweme> list = this.LJLJI;
            o.LJIIIIZZ(aweme, "aweme");
            ((ArrayList) list).add(aweme);
            arrayList.add(aweme);
        }
        return arrayList;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    /* renamed from: hv0, reason: merged with bridge method [inline-methods] */
    public final void listRemoveItem(Aweme element) {
        o.LJIIIZ(element, "element");
        super.listRemoveItem(element);
        ((ArrayList) this.LJLJI).remove(element);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<Aweme> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS175S0100000_9(newListState, (C8HZ<InterfaceC57784Mm4>) 317));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final Object whenRefresh(InterfaceC67352kd<? super AbstractC57774Mlu<Aweme>> interfaceC67352kd) {
        String str;
        List<Aweme> list;
        try {
            InterfaceC207188Be interfaceC207188Be = (InterfaceC207188Be) this.LJLILLLLZI.getValue().getOperator();
            if (this.LJLIL) {
                str = "live_tab_draw_enter";
            } else {
                str = "live_tab_draw_refresh";
            }
            FeedItemList fetchLiveFeedList = interfaceC207188Be.fetchLiveFeedList(str);
            this.LJLIL = false;
            if (fetchLiveFeedList.size() == 0 && !fetchLiveFeedList.isHasMore()) {
                setState(new AqS175S0100000_9(fetchLiveFeedList, 318));
                return C57775Mlv.LIZJ(new RuntimeException("no result"));
            }
            ((ArrayList) this.LJLJI).clear();
            List<Aweme> gv0 = gv0(fetchLiveFeedList);
            if (C65777Prh.LJI(gv0)) {
                list = gv0;
            } else {
                list = null;
            }
            iv0(fetchLiveFeedList.getRequestId(), list);
            if (fetchLiveFeedList.isHasMore()) {
                setState(new AqS175S0100000_9(fetchLiveFeedList, 319));
                return C57775Mlv.LIZLLL(null, null, gv0);
            }
            setState(new AqS175S0100000_9(fetchLiveFeedList, 320));
            return C57775Mlv.LIZ(gv0);
        } catch (Exception e) {
            setState(C54948LhQ.LJLIL);
            return C57775Mlv.LIZJ(e);
        }
    }

    public final void iv0(String str, List list) {
        User user;
        Aweme R1;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = ListProtector.get(list, i);
                Aweme aweme = (Aweme) obj;
                aweme.setRequestId(str);
                IAwemeService LIZ = AwemeService.LIZ();
                if (LIZ != null && (R1 = LIZ.R1(aweme)) != null) {
                    obj = R1;
                }
                Aweme aweme2 = (Aweme) obj;
                if (aweme2.getAuthor() == null) {
                    LiveRoomStruct newLiveRoomData = aweme2.getNewLiveRoomData();
                    if (newLiveRoomData != null) {
                        user = newLiveRoomData.owner;
                    } else {
                        user = null;
                    }
                    aweme2.setAuthor(user);
                }
                IRequestIdService LJ = RequestIdService.LJ();
                if (LJ != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(aweme2.getAid());
                    LIZ2.append("37");
                    LJ.LIZJ(i, X1D.LIZIZ(LIZ2), str);
                }
                ListProtector.set(list, i, obj);
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final Object whenLoadMore(Long l, InterfaceC67352kd<? super AbstractC57774Mlu<Aweme>> interfaceC67352kd) {
        List<Aweme> list;
        Object LIZ;
        l.longValue();
        try {
            FeedItemList fetchLiveFeedList = ((InterfaceC207188Be) this.LJLILLLLZI.getValue().getOperator()).fetchLiveFeedList("live_tab_draw_loadmore");
            if (fetchLiveFeedList.size() == 0) {
                setState(new AqS175S0100000_9(fetchLiveFeedList, 0));
                LIZ = C57775Mlv.LIZIZ();
            } else {
                List<Aweme> gv0 = gv0(fetchLiveFeedList);
                if (C65777Prh.LJI(gv0)) {
                    list = gv0;
                } else {
                    list = null;
                }
                iv0(fetchLiveFeedList.getRequestId(), list);
                if (fetchLiveFeedList.isHasMore()) {
                    setState(new AqS175S0100000_9(fetchLiveFeedList, 1));
                    LIZ = C57775Mlv.LIZLLL(null, null, gv0);
                } else {
                    setState(new AqS175S0100000_9(fetchLiveFeedList, 2));
                    LIZ = C57775Mlv.LIZ(gv0);
                }
            }
            return LIZ;
        } catch (Exception e) {
            setState(C54949LhR.LJLIL);
            return C57775Mlv.LIZJ(e);
        }
    }
}
