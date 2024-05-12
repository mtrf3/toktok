package com.ss.android.ugc.aweme.story.feed.immersive.gallery;

import X.A2F;
import X.A2G;
import X.C188727au;
import X.C189257bl;
import X.C189367bw;
import X.C189377bx;
import X.C189837ch;
import X.C2050482y;
import X.C33Q;
import X.C54838Lfe;
import X.C65352Pkq;
import X.C76800UCe;
import X.C78404Ups;
import X.C7XA;
import X.C8HZ;
import X.EV6;
import X.FMX;
import X.InterfaceC189237bj;
import X.InterfaceC67352kd;
import X.InterfaceC88472Yns;
import X.X1D;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.story.model.StoryInsertUser;
import com.ss.android.ugc.aweme.story.model.StoryViewerListResponse;
import java.util.List;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryViewerListViewModel extends AssemListViewModel<C189257bl, Object, Long> {
    public static final /* synthetic */ int LJLJI = 0;
    public final EV6 LJLIL = C78404Ups.LIZIZ(this, C65352Pkq.LIZ(C7XA.class));
    public C189377bx LJLILLLLZI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C189257bl(new C8HZ(null, null, 15), null, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final A2G<Long> gv0(long j) {
        Aweme aweme;
        List<StoryInsertUser> list;
        try {
            C189367bw c189367bw = ((C189257bl) getState()).LJLILLLLZI;
            if (c189367bw != null && (aweme = c189367bw.LIZ) != null) {
                InterfaceC189237bj interfaceC189237bj = (InterfaceC189237bj) this.LJLIL.getValue().getOperator();
                String aid = aweme.getAid();
                o.LJIIIIZZ(aid, "storyAweme.aid");
                C189367bw c189367bw2 = ((C189257bl) getState()).LJLILLLLZI;
                if (c189367bw2 != null) {
                    list = c189367bw2.LIZIZ;
                } else {
                    list = null;
                }
                StoryViewerListResponse LJIIL = interfaceC189237bj.LJIIL(j, aid, list);
                AwemeStatistics statistics = aweme.getStatistics();
                if (statistics != null) {
                    statistics.setPlayCount(LJIIL.total);
                }
                setState(new AqS169S0100000_3(LJIIL, 467));
                List<Object> LJJLJ = ((InterfaceC189237bj) this.LJLIL.getValue().getOperator()).LJJLJ(aweme, LJIIL);
                if (j == 0) {
                    hv0("enter_story_views_list_panel", new AqS169S0100000_3(LJIIL, 468));
                }
                if (LJIIL.hasMore) {
                    return A2F.LJ(A2G.LIZ, null, Long.valueOf(LJIIL.nextCursor), LJJLJ, 1);
                }
                A2G.LIZ.getClass();
                return A2F.LIZ(LJJLJ);
            }
            throw new RuntimeException("no story info onFetch");
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("fetchViewerList onFailure: cursor: ");
            LIZ.append(j);
            C189837ch.LIZIZ("ViewerListVM", X1D.LIZIZ(LIZ), e);
            if (j == 0) {
                hv0("enter_story_views_list_panel", null);
            }
            A2G.LIZ.getClass();
            return A2F.LIZJ(e);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<Object> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 469));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        return gv0(0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void hv0(String str, InterfaceC88472Yns<? super C188727au, C76800UCe> interfaceC88472Yns) {
        Aweme aweme;
        String str2;
        String str3;
        String str4;
        C189367bw c189367bw = ((C189257bl) getState()).LJLILLLLZI;
        if (c189367bw == null || (aweme = c189367bw.LIZ) == null) {
            return;
        }
        C188727au c188727au = new C188727au();
        C189377bx c189377bx = this.LJLILLLLZI;
        Object obj = null;
        if (c189377bx != null) {
            str2 = c189377bx.getFeedEnterFrom();
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("enter_from", str2);
        C189377bx c189377bx2 = this.LJLILLLLZI;
        if (c189377bx2 != null) {
            str3 = c189377bx2.getEnterMethod();
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("enter_method", str3);
        C189377bx c189377bx3 = this.LJLILLLLZI;
        if (c189377bx3 != null) {
            str4 = c189377bx3.getEnterPosition();
        } else {
            str4 = null;
        }
        c188727au.LJIIIZ("enter_position", str4);
        c188727au.LJIIIZ("group_id", aweme.getAid());
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            obj = Long.valueOf(statistics.getPlayCount());
        }
        c188727au.LJFF(obj, "vv_cnt");
        c188727au.LJIIIZ("story_collection_id", C54838Lfe.LJI(aweme));
        c188727au.LIZLLL(C54838Lfe.LJIJ(aweme) ? 1 : 0, "is_story_expired");
        c188727au.LIZLLL(!C54838Lfe.LJJIIJ(aweme) ? 1 : 0, "is_view_list_expired");
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c188727au);
        }
        FMX.LJIIL(str, c188727au.LIZ);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        return gv0(l.longValue());
    }
}
