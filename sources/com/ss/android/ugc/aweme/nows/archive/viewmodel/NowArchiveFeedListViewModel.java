package com.ss.android.ugc.aweme.nows.archive.viewmodel;

import X.A2F;
import X.A2G;
import X.AnonymousClass852;
import X.C182967Ga;
import X.C2050482y;
import X.C32I;
import X.C33Q;
import X.C78949Uyf;
import X.C7GY;
import X.C7GZ;
import X.C7X6;
import X.C85M;
import X.C8HZ;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import X.ORZ;
import X.OSZ;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.models.NowArchiveFeedResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowArchiveFeedListViewModel extends AssemListViewModel<C182967Ga, InterfaceC57784Mm4, Long> {
    public OSZ<String, Long> LJLIL = new OSZ<>("", 0L);
    public boolean LJLILLLLZI;
    public boolean LJLJI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C182967Ga(0);
    }

    public static List hv0(List list) {
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Aweme aweme = (Aweme) it.next();
            AwemeStatus status = aweme.getStatus();
            status.setPrivateStatus(1);
            aweme.setStatus(status);
            arrayList.add(C78949Uyf.LJIILIIL(aweme, null, null, 4, null, false, false, false, null, 2038));
        }
        return arrayList;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<InterfaceC57784Mm4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 300));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        return gv0(2, true);
    }

    public final A2G gv0(int i, boolean z) {
        NowArchiveFeedResponse LIZLLL;
        try {
            long longValue = this.LJLIL.getSecond().longValue();
            String landingAid = this.LJLIL.getFirst();
            o.LJIIIZ(landingAid, "landingAid");
            if (!z) {
                if (i == 2) {
                    LIZLLL = C7X6.LIZLLL(i, C7GY.LIZLLL, null);
                } else {
                    LIZLLL = C7X6.LIZLLL(i, C7GY.LIZJ, null);
                }
            } else {
                LIZLLL = C7X6.LIZLLL(i, longValue, landingAid);
            }
            List LLIILII = ORZ.LLIILII(LIZLLL.data);
            setState(new AqS169S0100000_3(LLIILII, (List<AnonymousClass852<C85M>>) 681));
            long j = LIZLLL.prevCursor;
            long j2 = LIZLLL.nextCursor;
            C7GY.LIZJ = j;
            C7GY.LIZLLL = j2;
            C7GZ.LIZ(LLIILII, z);
            if (!LIZLLL.hasMore) {
                if (i != 1) {
                    if (i == 2) {
                        this.LJLILLLLZI = true;
                    }
                } else {
                    this.LJLJI = true;
                }
            }
            if (this.LJLILLLLZI) {
                if (this.LJLJI) {
                    A2F a2f = A2G.LIZ;
                    List hv0 = hv0(LLIILII);
                    a2f.getClass();
                    return A2F.LIZ(hv0);
                }
                return A2F.LJ(A2G.LIZ, null, Long.valueOf(C7GY.LIZJ), hv0(LLIILII), 1);
            }
            if (this.LJLJI) {
                return A2F.LJ(A2G.LIZ, Long.valueOf(C7GY.LIZLLL), null, hv0(LLIILII), 2);
            }
            A2F a2f2 = A2G.LIZ;
            Long valueOf = Long.valueOf(C7GY.LIZLLL);
            Long valueOf2 = Long.valueOf(C7GY.LIZJ);
            List hv02 = hv0(LLIILII);
            a2f2.getClass();
            return A2F.LIZLLL(valueOf, valueOf2, hv02);
        } catch (Exception e) {
            A2G.LIZ.getClass();
            return A2F.LIZJ(e);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadLatest(Long l, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        l.longValue();
        return gv0(2, false);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        l.longValue();
        return gv0(1, false);
    }
}
