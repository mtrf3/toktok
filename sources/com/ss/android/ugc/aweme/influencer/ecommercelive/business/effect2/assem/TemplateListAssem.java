package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.assem;

import X.C214298b3;
import X.C221108m2;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BD;
import X.C9BE;
import X.S85;
import X.S86;
import X.SYL;
import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.powerlist.DiscountTemplateCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.powerlist.MultiTextTemplateCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.powerlist.ProductTemplateCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.powerlist.SingleTextTemplateCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.powerlist.SizeChartTemplateCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateListViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TemplateListAssem extends UIListContentAssem<TemplateListViewModel> {
    public final C214298b3 LJLILLLLZI;
    public final C214298b3 LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 653));

    public TemplateListAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(TemplateListViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS162S0100000_12(LIZ, 654), S85.INSTANCE, null);
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(BillboardGlobalViewModel.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ2, c9bd, new AqS162S0100000_12(LIZ2, 655), S86.INSTANCE, null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.ext_power_list.AssemListViewModel, com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateListViewModel] */
    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final TemplateListViewModel A3() {
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
        c57939MoZ.LIZ = 0;
        c57939MoZ.LIZIZ = true;
        c57939MoZ.LJII = false;
        return c57939MoZ;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        TemplateListViewModel templateListViewModel = (TemplateListViewModel) this.LJLILLLLZI.getValue();
        BillboardGlobalViewModel billboardGlobalViewModel = (BillboardGlobalViewModel) this.LJLJI.getValue();
        templateListViewModel.LJLJI.LIZIZ = billboardGlobalViewModel.Rj().LJLJJI;
        templateListViewModel.LJLJJI = billboardGlobalViewModel;
        v3().LLLF.LJZL(MultiTextTemplateCell.class, SingleTextTemplateCell.class, ProductTemplateCell.class, DiscountTemplateCell.class, SizeChartTemplateCell.class);
        v3().setLayoutManager(new StaggeredGridLayoutManager(2, 1));
    }
}
