package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpSkcViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpSkcWidgetV2;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.core.view.speclayoutv2.SpecListLayoutV2;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS5S1102000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.ReW, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70056ReW implements InterfaceC70059ReZ {
    public final /* synthetic */ MiniPdpSkcWidgetV2 LJLIL;

    @Override // X.InterfaceC70059ReZ
    public final void onSpecItemBind(View view, int i, int i2, C70216Rh6 c70216Rh6) {
    }

    @Override // X.InterfaceC70059ReZ
    public final void onSpecLayoutBind(C70248Rhc c70248Rhc, int i, List<C70216Rh6> list) {
    }

    @Override // X.InterfaceC70059ReZ
    public final void onSpecListLayoutBind(SpecListLayoutV2 specListLayoutV2, RWJ vo) {
        o.LJIIIZ(vo, "vo");
    }

    public C70056ReW(MiniPdpSkcWidgetV2 miniPdpSkcWidgetV2) {
        this.LJLIL = miniPdpSkcWidgetV2;
    }

    @Override // X.InterfaceC70059ReZ
    public final void onSizeGuideClick(SizeGuide sizeGuide) {
        HashMap<String, Object> hashMap;
        FragmentManager requireFragmentManager = this.LJLIL.getFragment().requireFragmentManager();
        o.LJIIIIZZ(requireFragmentManager, "fragment.requireFragmentManager()");
        Context context = this.LJLIL.getContext();
        BaseSkuFragment fragment = this.LJLIL.getFragment();
        SkuPanelStarter.SkuEnterParams skuEnterParams = this.LJLIL.getMViewModel().LJLLJ;
        if (skuEnterParams != null) {
            hashMap = skuEnterParams.getTrackParams();
        } else {
            hashMap = null;
        }
        C70064Ree.LIZIZ(requireFragmentManager, context, fragment, hashMap, sizeGuide);
    }

    @Override // X.InterfaceC70059ReZ
    public final void onSpecChecked(View view, int i, int i2, C70216Rh6 c70216Rh6, boolean z) {
        String str;
        int i3;
        List<SaleProp> list;
        o.LJIIIZ(view, "view");
        MiniPdpSkcViewModel widgetViewModel = this.LJLIL.getWidgetViewModel();
        if (c70216Rh6 == null || (str = c70216Rh6.LIZ) == null) {
            str = "";
        }
        widgetViewModel.getClass();
        ProductPackStruct productPackStruct = widgetViewModel.LJLJJLL;
        if (productPackStruct != null && (list = productPackStruct.saleProps) != null) {
            i3 = list.size();
        } else {
            i3 = 0;
        }
        if (i < 0 || i > i3) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("the sku group id is error : ");
            LIZ.append(i);
            LIZ.append("  : ");
            LIZ.append(i3);
            C78983UzD.LJIILL(X1D.LIZIZ(LIZ));
            return;
        }
        widgetViewModel.withState(new AqS5S1102000_12(i, str, i3, widgetViewModel, 3));
    }
}
