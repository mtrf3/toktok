package com.ss.android.ugc.tiktok.addyours.hub.viewmodel;

import X.A2F;
import X.A2G;
import X.C2050482y;
import X.C219618jd;
import X.C219708jm;
import X.C219738jp;
import X.C219748jq;
import X.C219828jy;
import X.C33Q;
import X.C38350F3i;
import X.C55480Lq0;
import X.C65352Pkq;
import X.C78404Ups;
import X.C8HZ;
import X.EV6;
import X.HG3;
import X.InterfaceC219758jr;
import X.InterfaceC67352kd;
import X.RBX;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.tiktok.addyours.hub.model.HubFeedResponse;
import com.ss.android.ugc.tiktok.addyours.model.AddYoursPagination;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AddYoursHubListViewModel extends AssemListViewModel<C219708jm, C219618jd, C219738jp> {
    public String LJLIL;
    public int LJLILLLLZI = 2;
    public final EV6 LJLJI = C78404Ups.LIZIZ(this, C65352Pkq.LIZ(C219828jy.class));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C219708jm(0);
    }

    public final A2G<C219738jp> gv0(C219738jp c219738jp) {
        Long LJJIZ;
        boolean z;
        long j;
        long j2;
        int i;
        String str = this.LJLIL;
        if (str != null && (LJJIZ = C38350F3i.LJJIZ(str)) != null) {
            long longValue = LJJIZ.longValue();
            System.currentTimeMillis();
            if (this.LJLILLLLZI == 1) {
                C55480Lq0.LIZIZ.LIZLLL(1, 4);
            }
            HubFeedResponse LJJJJ = ((InterfaceC219758jr) this.LJLJI.getValue().getOperator()).LJJJJ(this.LJLILLLLZI, c219738jp.LJLILLLLZI, 30, longValue, c219738jp.LJLIL);
            if (LJJJJ == null) {
                return A2F.LIZIZ(A2G.LIZ);
            }
            if (this.LJLILLLLZI == 1) {
                C55480Lq0.LIZIZ.LIZLLL(1, 5);
            }
            boolean isMe = ((RBX) HG3.LJIILL()).isMe(this.LJLIL);
            Boolean bool = LJJJJ.hasMore;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            AddYoursPagination addYoursPagination = LJJJJ.pagination;
            long j3 = 0;
            if (addYoursPagination == null) {
                addYoursPagination = new AddYoursPagination(0L, 1);
            }
            setState(new AqS169S0100000_3(LJJJJ.viewedUser, 855));
            Long l = LJJJJ.sharedCount;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            Long l2 = LJJJJ.unFinishedCount;
            if (l2 != null) {
                j2 = l2.longValue();
            } else {
                j2 = 0;
            }
            setState(new C219748jq(j, j2));
            ArrayList arrayList = new ArrayList();
            List<AddYoursTopic> list = LJJJJ.topicList;
            if (list != null) {
                for (AddYoursTopic addYoursTopic : list) {
                    if (addYoursTopic != null) {
                        arrayList.add(new C219618jd(this.LJLILLLLZI, addYoursTopic, isMe));
                    }
                }
            }
            if (z) {
                A2F a2f = A2G.LIZ;
                Long l3 = addYoursPagination.cursor;
                if (l3 != null) {
                    j3 = l3.longValue();
                }
                Integer num = addYoursPagination.loadType;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 1;
                }
                return A2F.LJ(a2f, null, new C219738jp(j3, i), arrayList, 1);
            }
            A2G.LIZ.getClass();
            return A2F.LIZ(arrayList);
        }
        A2F a2f2 = A2G.LIZ;
        Exception exc = new Exception("uid is null");
        a2f2.getClass();
        return A2F.LIZJ(exc);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C219618jd> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 605));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<C219738jp>> interfaceC67352kd) {
        return gv0(new C219738jp(0));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(C219738jp c219738jp, InterfaceC67352kd<? super A2G<C219738jp>> interfaceC67352kd) {
        return gv0(c219738jp);
    }
}
