package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.PdpInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightTag;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Rf0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70086Rf0 implements OH6 {
    public final /* synthetic */ PdpInfoViewHolder LIZ;

    @Override // X.OH6
    public final void LIZ() {
        UserRightTag userRightTag;
        PdpViewModel viewModel = this.LIZ.getViewModel();
        View findViewById = this.LIZ.itemView.findViewById(R.id.dng);
        o.LJIIIIZZ(findViewById, "itemView.free_return");
        viewModel.getClass();
        ProductPackStruct productPackStruct = viewModel.LJLJLLL;
        if (productPackStruct != null) {
            userRightTag = productPackStruct.freeReturn;
        } else {
            userRightTag = null;
        }
        C78946Uyc.LJJIIJ(findViewById, new C70917RsP(), new AqS178S0100000_12(userRightTag, 60));
    }

    @Override // X.OH6
    public final void LIZIZ() {
        UserRightTag userRightTag;
        PdpViewModel viewModel = this.LIZ.getViewModel();
        View findViewById = this.LIZ.itemView.findViewById(R.id.dng);
        o.LJIIIIZZ(findViewById, "itemView.free_return");
        viewModel.getClass();
        ProductPackStruct productPackStruct = viewModel.LJLJLLL;
        if (productPackStruct != null) {
            userRightTag = productPackStruct.freeReturn;
        } else {
            userRightTag = null;
        }
        C78946Uyc.LJJIIJZLJL(findViewById, new C70918RsQ(0), new AqS162S0100000_12(userRightTag, 42), new AqS178S0100000_12(userRightTag, 62));
    }

    public C70086Rf0(PdpInfoViewHolder pdpInfoViewHolder) {
        this.LIZ = pdpInfoViewHolder;
    }
}
