package X;

import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBottomWidget;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.Rgk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70194Rgk extends TAT {
    public final /* synthetic */ SkuPanelBottomWidget LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    @Override // X.TAT
    public final void LIZ(View view) {
        if (view != null) {
            SkuPanelViewModel viewModel = this.LJLJJI.getViewModel();
            LinearLayout linearLayout = this.LJLJJI.addFavouriteBtn;
            if (linearLayout != null) {
                boolean z = !this.LJLJJL;
                viewModel.getClass();
                C78565UsT.LJJIJ(viewModel, C78613UtF.LIZJ, new C69942Rcg(viewModel, new WeakReference(linearLayout), z, null));
                return;
            }
            o.LJIJI("addFavouriteBtn");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70194Rgk(SkuPanelBottomWidget skuPanelBottomWidget, boolean z) {
        super(700L);
        this.LJLJJI = skuPanelBottomWidget;
        this.LJLJJL = z;
    }
}
