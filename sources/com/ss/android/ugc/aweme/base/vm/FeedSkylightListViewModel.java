package com.ss.android.ugc.aweme.base.vm;

import X.A2F;
import X.A2G;
import X.AnonymousClass028;
import X.C221018lt;
import X.C242719fn;
import X.C33Q;
import X.C3F1;
import X.C47704Ins;
import X.C53729L6v;
import X.C54602Lbq;
import X.C54606Lbu;
import X.C54636LcO;
import X.C54838Lfe;
import X.C55749LuL;
import X.C8HZ;
import X.EnumC54603Lbr;
import X.InterfaceC222838op;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import X.LYJ;
import X.LYK;
import X.M89;
import X.X1D;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import java.util.List;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS58S0201000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FeedSkylightListViewModel extends BaseDetailShareVM<C242719fn, InterfaceC57784Mm4, Long> implements InterfaceC222838op {
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LJFF(this, C54602Lbq.class, "feed_skylight_hierarchy_data_key"), true);
    public long LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int deleteItemByAid(String aid) {
        o.LJIIIZ(aid, "aid");
        return -1;
    }

    @Override // X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 40;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C242719fn(0);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme getAwemeFromItem(InterfaceC57784Mm4 item) {
        o.LJIIIZ(item, "item");
        if (!(item instanceof LYK)) {
            return null;
        }
        LYK lyk = (LYK) item;
        if (C54838Lfe.LJIJI(lyk.LJLILLLLZI)) {
            return null;
        }
        return lyk.LJLILLLLZI;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<InterfaceC57784Mm4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS175S0100000_9(newListState, (C8HZ<InterfaceC57784Mm4>) 22));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        return hv0(0L, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int gv0(int i, Aweme aweme) {
        LYK lyk;
        Aweme aweme2;
        String LJIIIIZZ = C54838Lfe.LJIIIIZZ(aweme);
        ITEM listGetAt = listGetAt(i);
        String str = null;
        if ((listGetAt instanceof LYK) && (lyk = (LYK) listGetAt) != null && (aweme2 = lyk.LJLILLLLZI) != null) {
            str = C54838Lfe.LJIIIIZZ(aweme2);
        }
        if (o.LJ(LJIIIIZZ, str)) {
            return i;
        }
        List<ITEM> listGetAll = listGetAll();
        if (listGetAll != 0) {
            int i2 = 0;
            for (ITEM item : listGetAll) {
                if ((item instanceof LYK) && o.LJ(C54838Lfe.LJIIIIZZ(((LYK) item).LJLILLLLZI), C54838Lfe.LJIIIIZZ(aweme))) {
                    return i2;
                }
                i2++;
            }
        }
        return -1;
    }

    public final A2G hv0(long j, boolean z) {
        EnumC54603Lbr enumC54603Lbr;
        int i;
        int i2;
        int i3;
        try {
            this.LJLILLLLZI = System.currentTimeMillis();
            C54606Lbu.LIZJ = System.currentTimeMillis();
            if (z) {
                j = 0;
            }
            C54602Lbq c54602Lbq = (C54602Lbq) this.LJLIL.getValue();
            int i4 = 0;
            if (c54602Lbq == null) {
                c54602Lbq = new C54602Lbq(i4);
            }
            String str = c54602Lbq.LJLIL;
            if (o.LJ(str, "homepage_friends")) {
                enumC54603Lbr = EnumC54603Lbr.FRIENDS_TAB;
            } else if (o.LJ(str, "homepage_follow")) {
                enumC54603Lbr = EnumC54603Lbr.FOLLOW_TAB;
            } else {
                enumC54603Lbr = EnumC54603Lbr.UNDEFINED;
            }
            StoryGetFeedByPageResponse LIZ = C54636LcO.LIZ(j, null, enumC54603Lbr);
            C54602Lbq c54602Lbq2 = (C54602Lbq) this.LJLIL.getValue();
            if (c54602Lbq2 == null) {
                c54602Lbq2 = new C54602Lbq(i4);
            }
            String enterFrom = c54602Lbq2.LJLIL;
            if (LIZ.status_code == 0) {
                i = 1;
            } else {
                i = 0;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.LJLILLLLZI;
            if (z) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            List<Aweme> awemes = LIZ.getAwemes();
            if (awemes != null) {
                i3 = awemes.size();
            } else {
                i3 = 0;
            }
            o.LJIIIZ(enterFrom, "enterFrom");
            C53729L6v.LIZIZ("skylight_network_request_time", new C3F1(i, i2, i3, currentTimeMillis, enterFrom));
            C54606Lbu.LIZLLL = System.currentTimeMillis();
            LYJ.LJ(z, LIZ);
            if (LIZ.getHasMore()) {
                return A2F.LJ(A2G.LIZ, null, Long.valueOf(LIZ.getCursor()), LYJ.LIZLLL(z, LIZ), 1);
            }
            A2F a2f = A2G.LIZ;
            List LIZLLL = LYJ.LIZLLL(z, LIZ);
            a2f.getClass();
            return A2F.LIZ(LIZLLL);
        } catch (Throwable th) {
            Throwable LJFF = AnonymousClass028.LJFF(th);
            if (LJFF != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Fetch failed for skylight, isRefresh = ");
                LIZ2.append(z);
                C221018lt.LIZJ("FeedSkylightListVM", X1D.LIZIZ(LIZ2), LJFF);
                A2F a2f2 = A2G.LIZ;
                Exception exc = new Exception(LJFF);
                a2f2.getClass();
                return A2F.LIZJ(exc);
            }
            return A2F.LIZIZ(A2G.LIZ);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC67352kd interfaceC67352kd) {
        return hv0(((Number) obj).longValue(), false);
    }

    @Override // X.InterfaceC222838op
    public final void qN(int i, Aweme aweme) {
        setState(new AqS58S0201000_9(aweme, i, this, 0));
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Long getCursorByFeedParam(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        return 0L;
    }
}
