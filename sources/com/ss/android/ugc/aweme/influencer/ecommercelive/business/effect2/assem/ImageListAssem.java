package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.assem;

import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71527S5j;
import X.C71528S5k;
import X.C78926UyI;
import X.C9BD;
import X.SYL;
import X.TBT;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.powerlist.ImageCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ImageListViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ImageListAssem extends UIListContentAssem<ImageListViewModel> {
    public final C214298b3 LJLILLLLZI;
    public final C214298b3 LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 641));

    public ImageListAssem() {
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ImageListViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9bd, new AqS162S0100000_12(LIZ, 642), C71528S5k.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(BillboardGlobalViewModel.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ2, c9bd, new AqS162S0100000_12(LIZ2, 643), C71527S5j.INSTANCE, null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.ext_power_list.AssemListViewModel, com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ImageListViewModel] */
    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ImageListViewModel A3() {
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
        c57939MoZ.LIZ = 2;
        c57939MoZ.LIZIZ = true;
        c57939MoZ.LJII = true;
        return c57939MoZ;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        ImageListViewModel imageListViewModel = (ImageListViewModel) this.LJLILLLLZI.getValue();
        BillboardGlobalViewModel billboardGlobalViewModel = (BillboardGlobalViewModel) this.LJLJI.getValue();
        imageListViewModel.LJLJJI.LIZIZ = billboardGlobalViewModel.Rj().LJLJJI;
        imageListViewModel.LJLJJL = billboardGlobalViewModel;
        v3().LLLF.LJZL(ImageCell.class);
        SYL v3 = v3();
        view.getContext();
        v3.setLayoutManager(new GridLayoutManager(2));
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.S5l
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((S6F) obj).LJLJJL;
            }
        }, C213688a4.LIZJ(), this, new AqS178S0100000_12(this, 361), null, new AqS178S0100000_12(this, 362), 16, null);
    }
}
