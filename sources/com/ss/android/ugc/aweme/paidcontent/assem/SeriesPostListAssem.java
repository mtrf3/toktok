package com.ss.android.ugc.aweme.paidcontent.assem;

import X.C214298b3;
import X.C221108m2;
import X.C254719z9;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C78926UyI;
import X.C9BE;
import X.SYL;
import X.TBT;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.SeriesListViewModel;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SeriesPostListAssem extends UIListContentAssem<SeriesListViewModel> {
    public final C62822Ol8 LJLIL;
    public final C214298b3 LJLILLLLZI;

    public SeriesPostListAssem() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 560));
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(SeriesListViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 562), C254719z9.INSTANCE, null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.ext_power_list.AssemListViewModel, com.ss.android.ugc.aweme.paidcontent.viewmodel.SeriesListViewModel] */
    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SeriesListViewModel A3() {
        return (AssemListViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZ = 3;
        c57939MoZ.LIZJ = LoadingFooterCell.class;
        return c57939MoZ;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        SYL v3 = v3();
        getContainerView().getContext();
        v3.setLayoutManager(new LinearLayoutManager());
        v3().setListConfig(x3());
        v3().LJLJLLL(((AssemListViewModel) this.LJLILLLLZI.getValue()).getConfig());
        View findViewById = getContainerView().findViewById(R.id.jpi);
        o.LJIIIIZZ(findViewById, "containerView.findViewBy…es_selection_status_view)");
        C73305Spp c73305Spp = (C73305Spp) findViewById;
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.9z8
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                A1P a1p = (A1P) obj;
                a1p.getClass();
                return C208708Ha.LIZLLL(a1p);
            }
        }, null, new AqS135S0200000_4(this, c73305Spp, 76), new AqS154S0100000_4(c73305Spp, 561), new AqS135S0200000_4(this, c73305Spp, 77), 2, null);
    }
}
