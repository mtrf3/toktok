package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.IShopRecommendStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.RiP, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70297RiP extends RecyclerView.ViewHolder {
    public final ECBaseFragment LJLIL;
    public final IShopRecommendStyle LJLILLLLZI;
    public final PdpViewModel LJLJI;
    public final String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70297RiP(ViewGroup parent, PdpViewModel viewModel, String str, ECBaseFragment fragment, IShopRecommendStyle style) {
        super(C72545SdZ.LIZJ(parent, "parent.context", R.layout.a76, parent, false));
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(style, "style");
        this.LJLIL = fragment;
        this.LJLILLLLZI = style;
        this.LJLJI = viewModel;
        this.LJLJJI = str;
    }
}
