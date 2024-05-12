package com.ss.android.ugc.now.interaction.assem;

import X.C1805576t;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C47704Ins;
import X.C55749LuL;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73I;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.InterfaceC1805076o;
import X.SYL;
import X.TBT;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.ss.android.ugc.now.interaction.api.InteractionSyncViewModelState;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LikeListAssem extends UIListContentAssem<LikeListVM> {
    public final C55749LuL LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C214298b3 LJLJJL;
    public final C62822Ol8 LJLJJLL;

    public LikeListAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LJ(this, C73I.class, null), checkSupervisorPrepared());
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1376));
        this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1378));
        this.LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1375));
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(LikeListVM.class);
        this.LJLJJL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 1377), C1805576t.INSTANCE, null);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1379));
    }

    public final C73I C3() {
        return (C73I) this.LJLIL.getValue();
    }

    public final C73305Spp E3() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        return (C73305Spp) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: F3, reason: merged with bridge method [inline-methods] */
    public final LikeListVM A3() {
        return (LikeListVM) this.LJLJJL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZ = 5;
        c57939MoZ.LIZJ = LoadingFooterCell.class;
        return c57939MoZ;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        NowFeedMobHierarchyData nowFeedMobHierarchyData;
        Aweme aweme;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        v3().LLLF.LJZL(LikeCell.class);
        getContext();
        v3().setLayoutManager(new LinearLayoutManager());
        C73I C3 = C3();
        if (C3 != null && (aweme = C3.LJLIL) != null) {
            LikeListVM A3 = A3();
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "it.aid");
            A3.getClass();
            A3.LJLIL = aid;
            A3().LJLILLLLZI = aweme;
        }
        LikeListVM A32 = A3();
        C73I C32 = C3();
        if (C32 != null) {
            nowFeedMobHierarchyData = C32.LJLILLLLZI;
        } else {
            nowFeedMobHierarchyData = null;
        }
        A32.LJLJI = nowFeedMobHierarchyData;
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.76s
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C1805976x c1805976x = (C1805976x) obj;
                c1805976x.getClass();
                return C208708Ha.LIZLLL(c1805976x);
            }
        }, null, new AqS169S0100000_3(this, 726), new AqS153S0100000_3(this, 1517), new AqS169S0100000_3(this, 729), 2, null);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.76u
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C1805976x) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 175), 4);
        Object obj = (InterfaceC1805076o) this.LJLJJLL.getValue();
        if (obj != null) {
            C8YN.LJII(this, (AssemViewModel) obj, new TBT() { // from class: X.75x
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj2) {
                    return ((InteractionSyncViewModelState) obj2).getLikeState();
                }
            }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 177), 4);
        }
    }
}
