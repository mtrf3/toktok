package com.ss.android.ugc.now.interaction.assem;

import X.C1805276q;
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
import X.C73H;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.SYL;
import X.TBT;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ViewerListAssem extends UIListContentAssem<ViewerListVM> {
    public final C55749LuL LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C214298b3 LJLJJL;
    public final C62822Ol8 LJLJJLL;

    public ViewerListAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LJ(this, C73H.class, null), checkSupervisorPrepared());
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1402));
        C221108m2.LIZIZ(new AqS153S0100000_3(this, 1400));
        this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1404));
        this.LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1401));
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ViewerListVM.class);
        this.LJLJJL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 1403), C1805276q.INSTANCE, null);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1405));
    }

    public final C73305Spp C3() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        return (C73305Spp) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: E3, reason: merged with bridge method [inline-methods] */
    public final ViewerListVM A3() {
        return (ViewerListVM) this.LJLJJL.getValue();
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
        v3().LLLF.LJZL(ViewerCell.class);
        v3().LLLF.LJZL(ViewerNoMoreLimitCell.class);
        getContext();
        v3().setLayoutManager(new LinearLayoutManager());
        C73H c73h = (C73H) this.LJLIL.getValue();
        if (c73h != null && (aweme = c73h.LJLIL) != null) {
            ViewerListVM A3 = A3();
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "it.aid");
            A3.getClass();
            A3.LJLIL = aid;
            A3().LJLILLLLZI = aweme;
        }
        ViewerListVM A32 = A3();
        C73H c73h2 = (C73H) this.LJLIL.getValue();
        if (c73h2 != null) {
            nowFeedMobHierarchyData = c73h2.LJLILLLLZI;
        } else {
            nowFeedMobHierarchyData = null;
        }
        A32.LJLJI = nowFeedMobHierarchyData;
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.76p
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C1805776v c1805776v = (C1805776v) obj;
                c1805776v.getClass();
                return C208708Ha.LIZLLL(c1805776v);
            }
        }, null, new AqS169S0100000_3(this, 740), new AqS153S0100000_3(this, 1520), new AqS169S0100000_3(this, 741), 2, null);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.76r
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C1805776v) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 171), 4);
    }
}
