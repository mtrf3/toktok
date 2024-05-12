package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceAnchorPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.model.PanelOpenInfo;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Rzj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71371Rzj extends TAT {
    public final /* synthetic */ S00 LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro LJLJJL;

    @Override // X.TAT
    public final void LIZ(View view) {
        Aweme aweme;
        if (view != null) {
            C71361RzZ c71361RzZ = C71361RzZ.LIZ;
            ProductListModel productListModel = this.LJLJJI.LIZ.getViewModel().LJLILLLLZI;
            List<ShopWindowAnchorModel> list = this.LJLJJI.LIZ.getViewModel().LJLJJL;
            c71361RzZ.getClass();
            boolean LJIJ = C71361RzZ.LJIJ(productListModel, list);
            if (C71361RzZ.LJIILLIIL(this.LJLJJI.LIZ.getViewModel().LJLJJL) || LJIJ) {
                int LJJIJL = C71361RzZ.LJJIJL(this.LJLJJI.LIZ.getViewModel().LJLJJL.size(), Integer.valueOf(LJIJ ? 1 : 0));
                InterfaceC44105HSr interfaceC44105HSr = this.LJLJJI.LIZ.getViewModel().LJLIL;
                Aweme aweme2 = null;
                if (interfaceC44105HSr != null) {
                    aweme = interfaceC44105HSr.LJJLL();
                } else {
                    aweme = null;
                }
                PanelOpenInfo panelOpenInfo = new PanelOpenInfo(0, null, LJJIJL, C71361RzZ.LJIIZILJ(aweme, this.LJLJJI.LIZ.getViewModel().LJLJJL, false), 4, 3, null);
                InterfaceC44105HSr interfaceC44105HSr2 = this.LJLJJI.LIZ.getViewModel().LJLIL;
                if (interfaceC44105HSr2 != null) {
                    aweme2 = interfaceC44105HSr2.LJJLL();
                }
                ProductListModel LJJIJ = C71360RzY.LJJIJ(aweme2, this.LJLJJI.LIZ.getViewModel().LJLIL, "video_multi_anchor", panelOpenInfo, 16);
                Context context = this.LJLJJI.LIZ.getContext();
                o.LJIIIIZZ(context, "rootView.context");
                ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
                if (LJJIFFI != null) {
                    ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment = new ECommerceAnchorPanelFragment();
                    eCommerceAnchorPanelFragment.LJLJJLL = this.LJLJJI.LIZ.getViewModel().LJLIL;
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("anchorStruct", this.LJLJJI.LIZ.getViewModel().LJLJI);
                    bundle.putSerializable("productListModel", LJJIJ);
                    bundle.putBoolean("useBubbleIcon", false);
                    bundle.putInt("anchorCount", this.LJLJJI.LIZ.getViewModel().LJLJJI);
                    bundle.putLong("clickTime", System.currentTimeMillis());
                    bundle.putSerializable("panelOpenInfo", panelOpenInfo);
                    eCommerceAnchorPanelFragment.setArguments(bundle);
                    C71381Rzt.LIZ(LJJIFFI, eCommerceAnchorPanelFragment, C71361RzZ.LJJJJZ(c71361RzZ, LJJIJL, this.LJLJJI.LIZ.getViewModel().LJLJJL.size()));
                }
                this.LJLJJI.LIZ.getViewModel().sv0(LJJIJ, 0, "click_list", null, null);
                return;
            }
            this.LJLJJL.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71371Rzj(S00 s00, InterfaceC65784Pro interfaceC65784Pro) {
        super(700L);
        this.LJLJJI = s00;
        this.LJLJJL = interfaceC65784Pro;
    }
}
