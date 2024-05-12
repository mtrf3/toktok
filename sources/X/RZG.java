package X;

import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBottomNavBarWidget;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class RZG extends C70083Rex<PdpViewModel> implements RYY {
    @Override // X.RYY
    public final C69684RWm KW(ProductPackStruct productPackStruct) {
        if (productPackStruct == null) {
            return null;
        }
        return C78996UzQ.LJJJJJL(productPackStruct, null, null, null, null);
    }

    public JediBaseWidget iw(PdpFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        return new PdpBottomNavBarWidget(fragment);
    }
}
