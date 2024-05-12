package com.ss.android.ugc.aweme.tag.assem;

import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C242459fN;
import X.C242469fO;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73306Spq;
import X.C78926UyI;
import X.C8VC;
import X.C8YN;
import X.C9BE;
import X.EnumC242449fM;
import X.InterfaceC242259f3;
import X.SYL;
import X.T3D;
import X.TBT;
import Y.IDrS44S0100000_4;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.tag.SearchResultListCell;
import com.ss.android.ugc.aweme.tag.SectionCell;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagSearchListViewModel;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SearchResultListAssem extends UIListContentAssem<VideoTagSearchListViewModel> {
    public final C62822Ol8 LJLIL;
    public C73305Spp LJLILLLLZI;
    public EnumC242449fM LJLJI;
    public final C214298b3 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public boolean LJLJJLL;
    public T3D LJLJL;
    public volatile String LJLJLJ;

    public SearchResultListAssem() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(C242469fO.LJLIL);
        this.LJLJI = EnumC242449fM.INIT;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoTagSearchListViewModel.class);
        this.LJLJJI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 1035), C242459fN.INSTANCE, null);
        this.LJLJJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 863));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: C3, reason: merged with bridge method [inline-methods] */
    public final VideoTagSearchListViewModel A3() {
        return (VideoTagSearchListViewModel) this.LJLJJI.getValue();
    }

    public final void E3() {
        C73306Spq c73306Spq = (C73306Spq) this.LJLIL.getValue();
        if (c73306Spq != null) {
            C73305Spp c73305Spp = this.LJLILLLLZI;
            if (c73305Spp != null) {
                c73305Spp.setStatus(c73306Spq);
            }
            C73305Spp c73305Spp2 = this.LJLILLLLZI;
            if (c73305Spp2 == null) {
                return;
            }
            c73305Spp2.setVisibility(0);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        T3D t3d = this.LJLJL;
        if (t3d != null) {
            t3d.LIZIZ();
        }
        this.LJLJL = null;
        this.LJLJLJ = null;
        super.onDestroy();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZ = 5;
        c57939MoZ.LIZIZ = false;
        c57939MoZ.LIZJ = LoadingFooterCell.class;
        return c57939MoZ;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLILLLLZI = (C73305Spp) getContainerView().findViewById(R.id.kf_);
        SYL v3 = v3();
        v3.LLLF.LJZL(SearchResultListCell.class, SectionCell.class);
        v3.LJIIJJI(new IDrS44S0100000_4(this, 5));
        v3.setItemAnimator(null);
        C8VC.LJIIJ(this, C65352Pkq.LIZ(InterfaceC242259f3.class), new TBT() { // from class: X.9fG
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9RM) obj).LIZIZ;
            }
        }, new TBT() { // from class: X.9fI
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9RM) obj).LIZ;
            }
        }, new AqS186S0100000_4(this, 191));
        C8YN.LJII(this, A3(), new TBT() { // from class: X.9fH
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C240199bj) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 192), 4);
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.9fL
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C240199bj c240199bj = (C240199bj) obj;
                c240199bj.getClass();
                return C208708Ha.LIZLLL(c240199bj);
            }
        }, null, new AqS170S0100000_4(this, 790), new AqS154S0100000_4(this, 864), new AqS170S0100000_4(this, 789), 2, null);
    }
}
