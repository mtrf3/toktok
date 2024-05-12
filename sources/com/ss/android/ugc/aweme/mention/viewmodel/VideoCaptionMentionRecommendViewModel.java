package com.ss.android.ugc.aweme.mention.viewmodel;

import X.A2F;
import X.A2G;
import X.C16880lQ;
import X.C2050482y;
import X.C217798gh;
import X.C217808gi;
import X.C217958gx;
import X.C217998h1;
import X.C218008h2;
import X.C32I;
import X.C33Q;
import X.C61878OQg;
import X.C8HZ;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import X.Y9G;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.mention.api.MentionNetworkApi;
import com.ss.android.ugc.aweme.mention.models.MentionRecentContactResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoCaptionMentionRecommendViewModel extends AssemListViewModel<C217998h1, InterfaceC57784Mm4, Boolean> {
    public C217798gh LJLIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C217998h1(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<InterfaceC57784Mm4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 253));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Boolean>> interfaceC67352kd) {
        C217808gi LIZ;
        try {
            List<IMUser> LJIILIIL = IMService.createIIMServicebyMonsterPlugin(false).getImUserService().LJIILIIL();
            List<IMUser> LJIILLIIL = IMService.createIIMServicebyMonsterPlugin(false).getImUserService().LJIILLIIL();
            try {
                MentionRecentContactResponse mentionRecentContactResponse = MentionNetworkApi.LIZIZ.queryRecentFriendsCall(6L).execute().LIZIZ;
                o.LJIIIIZZ(mentionRecentContactResponse, "MentionNetworkApi.queryR…ionType).execute().body()");
                LIZ = C217958gx.LIZ(mentionRecentContactResponse, LJIILIIL, LJIILLIIL);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                LIZ = C217958gx.LIZ(null, LJIILIIL, LJIILLIIL);
            }
            this.LJLIL = LIZ.LJLIL;
            A2F a2f = A2G.LIZ;
            List<Y9G> list = LIZ.LJLILLLLZI;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<Y9G> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C218008h2(it.next()));
            }
            a2f.getClass();
            return A2F.LIZ(arrayList);
        } catch (Exception e2) {
            A2G.LIZ.getClass();
            return A2F.LIZJ(e2);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Boolean bool, InterfaceC67352kd<? super A2G<Boolean>> interfaceC67352kd) {
        bool.booleanValue();
        A2F a2f = A2G.LIZ;
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        a2f.getClass();
        return A2F.LIZ(c61878OQg);
    }
}
