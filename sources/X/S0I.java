package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceAnchorPanelFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S0I implements InterfaceC55791Lv1 {
    public final /* synthetic */ ECommerceAnchorPanelFragment LIZ;

    @Override // X.InterfaceC55791Lv1
    public final View LIZ() {
        TuxIconView tuxIconView = this.LIZ.LLF;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        o.LJIJI("cartIconView");
        throw null;
    }

    @Override // X.InterfaceC55791Lv1
    public final ViewGroup getContainerView() {
        C45621qg vl = this.LIZ.vl();
        if (vl != null) {
            return (ViewGroup) vl.findViewById(R.id.jvv);
        }
        return null;
    }

    public S0I(ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment) {
        this.LIZ = eCommerceAnchorPanelFragment;
    }
}
