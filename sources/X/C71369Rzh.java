package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceAnchorPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.model.PanelOpenInfo;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Rzh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71369Rzh extends TAT {
    public final /* synthetic */ S01 LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro LJLJJL;

    @Override // X.TAT
    public final void LIZ(View view) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        Aweme aweme;
        Aweme aweme2;
        Integer num;
        String str;
        OSZ<Boolean, Integer> titleShowStateInfo$ecommerce_video_release;
        Aweme aweme3;
        S0A s0a;
        if (view != null) {
            C71361RzZ c71361RzZ = C71361RzZ.LIZ;
            ProductListModel productListModel = this.LJLJJI.LIZ.getViewModel().LJLILLLLZI;
            List<ShopWindowAnchorModel> list = this.LJLJJI.LIZ.getViewModel().LJLJJL;
            c71361RzZ.getClass();
            if (C71361RzZ.LJIJ(productListModel, list) && (s0a = this.LJLJJI.LIZIZ) != null && s0a.LJLJI) {
                z = true;
            } else {
                z = false;
            }
            boolean LJIILLIIL = C71361RzZ.LJIILLIIL(this.LJLJJI.LIZ.getViewModel().LJLJJL);
            if (z || LJIILLIIL) {
                S01 s01 = this.LJLJJI;
                S0A s0a2 = s01.LIZIZ;
                if (s0a2 != null && s0a2.LJLJI) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Integer num2 = null;
                if (z2) {
                    InterfaceC44105HSr interfaceC44105HSr = s01.LIZ.getViewModel().LJLIL;
                    if (interfaceC44105HSr != null) {
                        aweme3 = interfaceC44105HSr.LJJLL();
                    } else {
                        aweme3 = null;
                    }
                    List<ShopWindowAnchorModel> products = this.LJLJJI.LIZ.getViewModel().LJLJJL;
                    o.LJIIIZ(products, "products");
                    if (C71361RzZ.LJJJ(products) && (aweme3 == null || !aweme3.isAd() ? C53218Kuc.LIZ().anchorPanelStyle == 2 : C53218Kuc.LIZ().anchorPanelStyleAds == 2)) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                } else {
                    i = 0;
                }
                S0A s0a3 = this.LJLJJI.LIZIZ;
                if (s0a3 != null && s0a3.LJLJI) {
                    i2 = 2;
                } else {
                    i2 = 3;
                }
                int LJJIJL = C71361RzZ.LJJIJL(this.LJLJJI.LIZ.getViewModel().LJLJJL.size(), Integer.valueOf(i));
                InterfaceC44105HSr interfaceC44105HSr2 = this.LJLJJI.LIZ.getViewModel().LJLIL;
                if (interfaceC44105HSr2 != null) {
                    aweme = interfaceC44105HSr2.LJJLL();
                } else {
                    aweme = null;
                }
                PanelOpenInfo panelOpenInfo = new PanelOpenInfo(0, null, LJJIJL, C71361RzZ.LJIIZILJ(aweme, this.LJLJJI.LIZ.getViewModel().LJLJJL, false), i2, 3, null);
                InterfaceC44105HSr interfaceC44105HSr3 = this.LJLJJI.LIZ.getViewModel().LJLIL;
                if (interfaceC44105HSr3 != null) {
                    aweme2 = interfaceC44105HSr3.LJJLL();
                } else {
                    aweme2 = null;
                }
                ProductListModel LJJIIZI = C71360RzY.LJJIIZI(aweme2, this.LJLJJI.LIZ.getViewModel().LJLIL, "video_main_anchor", panelOpenInfo, "video_main_anchor");
                Context context = this.LJLJJI.LIZ.getContext();
                o.LJIIIIZZ(context, "rootView.context");
                ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
                if (LJJIFFI != null) {
                    ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment = new ECommerceAnchorPanelFragment();
                    eCommerceAnchorPanelFragment.LJLJJLL = this.LJLJJI.LIZ.getViewModel().LJLIL;
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("anchorStruct", this.LJLJJI.LIZ.getViewModel().LJLJI);
                    bundle.putSerializable("productListModel", LJJIIZI);
                    bundle.putBoolean("useBubbleIcon", false);
                    bundle.putInt("anchorCount", this.LJLJJI.LIZ.getViewModel().LJLJJI);
                    bundle.putLong("clickTime", System.currentTimeMillis());
                    bundle.putSerializable("panelOpenInfo", panelOpenInfo);
                    eCommerceAnchorPanelFragment.setArguments(bundle);
                    C71381Rzt.LIZ(LJJIFFI, eCommerceAnchorPanelFragment, C71361RzZ.LJJJJZ(c71361RzZ, LJJIJL, this.LJLJJI.LIZ.getViewModel().LJLJJL.size()));
                }
                S0A s0a4 = this.LJLJJI.LIZIZ;
                if (s0a4 != null && (titleShowStateInfo$ecommerce_video_release = s0a4.getTitleShowStateInfo$ecommerce_video_release()) != null) {
                    if (titleShowStateInfo$ecommerce_video_release.getFirst().booleanValue()) {
                        num2 = 1;
                    } else {
                        num2 = 0;
                    }
                    num = titleShowStateInfo$ecommerce_video_release.getSecond();
                } else {
                    num = null;
                }
                ECommerceAnchorPanelViewModel viewModel = this.LJLJJI.LIZ.getViewModel();
                S0A s0a5 = this.LJLJJI.LIZIZ;
                if (s0a5 != null && s0a5.LJLJI) {
                    str = "click_anchor";
                } else {
                    str = "click_list";
                }
                viewModel.sv0(LJJIIZI, 1, str, String.valueOf(num2), String.valueOf(num));
                return;
            }
            this.LJLJJL.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71369Rzh(S01 s01, InterfaceC65784Pro interfaceC65784Pro) {
        super(700L);
        this.LJLJJI = s01;
        this.LJLJJL = interfaceC65784Pro;
    }
}
