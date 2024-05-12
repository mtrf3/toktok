package com.ss.android.ugc.tiktok.addyours.ui.vm;

import X.A2F;
import X.A2G;
import X.C141335gf;
import X.C2050482y;
import X.C218738iD;
import X.C218748iE;
import X.C218768iG;
import X.C221018lt;
import X.C221118m3;
import X.C250859sv;
import X.C32I;
import X.C33Q;
import X.C3C5;
import X.C5H3;
import X.C61878OQg;
import X.C8HZ;
import X.InterfaceC67352kd;
import X.X1D;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SearchUserSugResponse;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes4.dex */
public final class SearchResultListViewModel extends AssemListViewModel<C218738iD, C218768iG, Boolean> {
    public final C5H3 LJLIL = C221118m3.LIZ(C218748iE.LJLIL);
    public String LJLILLLLZI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C218738iD(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    public final A2G<Boolean> hv0(boolean z) {
        ?? r4;
        String str = this.LJLILLLLZI;
        if (str == null) {
            A2F a2f = A2G.LIZ;
            C61878OQg c61878OQg = C61878OQg.INSTANCE;
            a2f.getClass();
            return A2F.LIZ(c61878OQg);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start fetch for keyword: ");
        LIZ.append(str);
        C221018lt.LIZ("SearchResultVM", X1D.LIZIZ(LIZ));
        try {
            SearchUserSugResponse LIZLLL = ((ISearchUserService) this.LJLIL.getValue()).LIZLLL(gv0(str, z));
            List<? extends SearchSugEntity> list = LIZLLL.sugList;
            if (list != null) {
                r4 = new ArrayList();
                for (SearchSugEntity searchSugEntity : list) {
                    String userId = searchSugEntity.sugExtraInfo.getUserId();
                    if (userId != null) {
                        r4.add(new C218768iG(new UserInvitee(userId, searchSugEntity.sugExtraInfo.getUserNickname(), searchSugEntity.sugExtraInfo.getUserAvatarUri(), null, Integer.valueOf(searchSugEntity.sugExtraInfo.getFollowStatus()), null, false, o.LJ(searchSugEntity.sugExtraInfo.getUserRelationType(), "friends"), 104, null), false, "search"));
                    }
                }
            } else {
                r4 = C61878OQg.INSTANCE;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("fetch done items: ");
            LIZ2.append(r4.size());
            C221018lt.LJFF("SearchResultVM", X1D.LIZIZ(LIZ2));
            if (LIZLLL.LIZ()) {
                return A2F.LJ(A2G.LIZ, null, Boolean.TRUE, r4, 1);
            }
            A2G.LIZ.getClass();
            return A2F.LIZ(r4);
        } catch (Throwable th) {
            Object LIZ3 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ3);
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ3);
            if (m10exceptionOrNullimpl != null) {
                A2F a2f2 = A2G.LIZ;
                RuntimeException runtimeException = new RuntimeException(m10exceptionOrNullimpl);
                a2f2.getClass();
                LIZ3 = A2F.LIZJ(runtimeException);
            }
            return (A2G) LIZ3;
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C218768iG> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 617));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Boolean>> interfaceC67352kd) {
        return hv0(true);
    }

    public final C250859sv gv0(String str, boolean z) {
        List<ITEM> listGetAll;
        ArrayList arrayList;
        Integer num = null;
        if (z || (listGetAll = listGetAll()) == 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(C32I.LJJL(listGetAll, 10));
            Iterator it = listGetAll.iterator();
            while (it.hasNext()) {
                arrayList.add(((C218768iG) it.next()).LJLIL.getUid());
            }
        }
        if (a.LJFF().LJJJJI()) {
            num = 1;
        }
        return new C250859sv(8L, null, str, "at_user", 20L, arrayList, num);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Boolean bool, InterfaceC67352kd<? super A2G<Boolean>> interfaceC67352kd) {
        bool.booleanValue();
        return hv0(false);
    }
}
