package com.ss.android.ugc.aweme.utils;

import X.C119774mz;
import X.C27941Axt;
import X.C27949Ay1;
import X.C38995FSd;
import X.C44100HSm;
import X.C68322mC;
import X.C69964Rd2;
import X.C70123Rfb;
import X.C70414RkI;
import X.C71066Ruo;
import X.C71073Ruv;
import X.C71076Ruy;
import X.C76602zY;
import X.C76612zZ;
import X.C7F9;
import X.InterfaceC71003Rtn;
import X.InterfaceC79150V4o;
import X.InterfaceC88471Ynr;
import X.RunnableC71069Rur;
import X.S1C;
import X.S1E;
import X.TAT;
import X.X1D;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.addon.AddonOrderVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.bundledeal.PdpBundleDealVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.PdpReviewViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleAddButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardStyle;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.card.container.view.biz.DefaultFeedEcCardBizView;
import com.ss.android.ugc.aweme.ecommerce.us.osp.module.addon.USAddonOrderVH;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class Au2S5S0400000_12 extends TAT {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.TAT
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            case 3:
                LIZ$3(this, view);
                return;
            case 4:
                LIZ$4(this, view);
                return;
            case 5:
                LIZ$5(this, view);
                return;
            case 6:
                LIZ$6(this, view);
                return;
            case 7:
                LIZ$7(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(Au2S5S0400000_12 au2S5S0400000_12, View view) {
        if (view != null) {
            C70123Rfb logger = ((PdpBundleDealVH) au2S5S0400000_12.l0).getLogger();
            o.LJIIIIZZ((View) au2S5S0400000_12.l1, "this");
            logger.LIZLLL((View) au2S5S0400000_12.l1, (BundleInfo) au2S5S0400000_12.l2, "add_to_cart_blank");
            ((PdpBundleDealVH) au2S5S0400000_12.l0).jumpBundleSheet((BundleAddButton) au2S5S0400000_12.l3, (BundleInfo) au2S5S0400000_12.l2);
        }
    }

    public static final void LIZ$1(Au2S5S0400000_12 au2S5S0400000_12, View view) {
        String str;
        C70414RkI c70414RkI;
        if (view != null) {
            Integer num = ((ReviewMedia) au2S5S0400000_12.l0).mediaType;
            if (num == null || num.intValue() != 1) {
                Integer num2 = ((ReviewMedia) au2S5S0400000_12.l0).mediaType;
                if (num2 != null && num2.intValue() == 2 && (c70414RkI = ((PdpReviewViewHolder) au2S5S0400000_12.l1).getVm().LLFII) != null) {
                    c70414RkI.LJJL((ReviewItemStruct) au2S5S0400000_12.l2, "video");
                }
            } else {
                C70414RkI c70414RkI2 = ((PdpReviewViewHolder) au2S5S0400000_12.l1).getVm().LLFII;
                if (c70414RkI2 != null) {
                    c70414RkI2.LJJL((ReviewItemStruct) au2S5S0400000_12.l2, "pic");
                }
            }
            PdpViewModel vm = ((PdpReviewViewHolder) au2S5S0400000_12.l1).getVm();
            C119774mz c119774mz = (C119774mz) au2S5S0400000_12.l3;
            ReviewItemStruct.MainReview mainReview = ((ReviewItemStruct) au2S5S0400000_12.l2).review;
            if (mainReview != null) {
                str = mainReview.reviewId;
            } else {
                str = null;
            }
            vm.Kw0(1, c119774mz, "review_entrance", "review", str);
        }
    }

    public static final void LIZ$2(Au2S5S0400000_12 au2S5S0400000_12, View view) {
        if (view != null) {
            ((View) au2S5S0400000_12.l0).setVisibility(8);
            InterfaceC79150V4o interfaceC79150V4o = (InterfaceC79150V4o) ((C68322mC) au2S5S0400000_12.l1).element;
            if (interfaceC79150V4o != null) {
                interfaceC79150V4o.LIZIZ(null);
            }
            C69964Rd2.LIZ((InterfaceC71003Rtn) au2S5S0400000_12.l2, (Map) au2S5S0400000_12.l3, "close_button", "top_voucher_remind");
        }
    }

    public static final void LIZ$3(Au2S5S0400000_12 au2S5S0400000_12, View view) {
        if (view != null) {
            C69964Rd2.LIZ((InterfaceC71003Rtn) au2S5S0400000_12.l0, (HashMap) au2S5S0400000_12.l1, "close_button", "pdp_top");
            ((View) au2S5S0400000_12.l2).findViewById(R.id.ic5).setVisibility(8);
            ((PdpViewModel) au2S5S0400000_12.l3).LLJJIJI = -1L;
        }
    }

    public static final void LIZ$4(Au2S5S0400000_12 au2S5S0400000_12, View view) {
        if (view != null) {
            ((USAddonOrderVH) au2S5S0400000_12.l0).LJLJJL = false;
            C27949Ay1.LJIJ("see_more", "add_on_module", null, "order_submit", null, null, null, null, null, null, null, null, null, null, "product_detail", null, null, null, null, null, null, null, null, 268369908);
            RelativeLayout verticalInitialContainer = (RelativeLayout) au2S5S0400000_12.l1;
            o.LJIIIIZZ(verticalInitialContainer, "verticalInitialContainer");
            ((RelativeLayout) au2S5S0400000_12.l1).setVisibility(8);
            LinearLayout verticalAddOnOrderGroup = (LinearLayout) au2S5S0400000_12.l2;
            o.LJIIIIZZ(verticalAddOnOrderGroup, "verticalAddOnOrderGroup");
            ((LinearLayout) au2S5S0400000_12.l2).setVisibility(0);
            ((USAddonOrderVH) au2S5S0400000_12.l0).P(3, ((C27941Axt) au2S5S0400000_12.l3).LIZ);
        }
    }

    public static final void LIZ$5(Au2S5S0400000_12 au2S5S0400000_12, View view) {
        if (view != null) {
            S1E s1e = (S1E) au2S5S0400000_12.l0;
            C7F9 c7f9 = (C7F9) au2S5S0400000_12.l1;
            s1e.LJI(C44100HSm.LIZ(s1e, c7f9, "click_list", ((S1C) au2S5S0400000_12.l2).LJIILL(c7f9)));
            ((InterfaceC88471Ynr) au2S5S0400000_12.l3).invoke(Boolean.TRUE, Boolean.FALSE);
        }
    }

    public static final void LIZ$6(Au2S5S0400000_12 au2S5S0400000_12, View view) {
        if (view != null) {
            Aweme aweme = (Aweme) au2S5S0400000_12.l0;
            FeedEcCardConfig cardConfig = (FeedEcCardConfig) au2S5S0400000_12.l1;
            FeedEcCardStyle cardStyle = (FeedEcCardStyle) au2S5S0400000_12.l2;
            DefaultFeedEcCardBizView defaultFeedEcCardBizView = (DefaultFeedEcCardBizView) au2S5S0400000_12.l3;
            C71076Ruy c71076Ruy = defaultFeedEcCardBizView.LJLJJI;
            boolean z = defaultFeedEcCardBizView.LJLJL;
            o.LJIIIZ(aweme, "aweme");
            o.LJIIIZ(cardConfig, "cardConfig");
            o.LJIIIZ(cardStyle, "cardStyle");
            C71066Ruo.LIZIZ = true;
            C71073Ruv.LIZIZ(aweme, true, null, 4);
            Keva LIZ = C76612zZ.LIZ();
            String LIZ2 = C76602zY.LIZ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(((Number) C76602zY.LIZIZ().getFirst()).intValue() + 1);
            LIZ3.append('_');
            LIZ3.append(System.currentTimeMillis());
            LIZ.storeString(LIZ2, X1D.LIZIZ(LIZ3));
            try {
                C38995FSd.LIZJ().execute(new RunnableC71069Rur(null, c71076Ruy, cardConfig, cardStyle, aweme, z));
            } catch (Throwable unused) {
            }
        }
    }

    public static final void LIZ$7(Au2S5S0400000_12 au2S5S0400000_12, View view) {
        if (view != null) {
            ((AddonOrderVH) au2S5S0400000_12.l0).LJLJJI = false;
            C27949Ay1.LJIJ("see_more", "add_on_module", null, "order_submit", null, null, null, null, null, null, null, null, null, null, "product_detail", null, null, null, null, null, null, null, null, 268369908);
            RelativeLayout verticalInitialContainer = (RelativeLayout) au2S5S0400000_12.l1;
            o.LJIIIIZZ(verticalInitialContainer, "verticalInitialContainer");
            ((RelativeLayout) au2S5S0400000_12.l1).setVisibility(8);
            LinearLayout verticalAddOnOrderGroup = (LinearLayout) au2S5S0400000_12.l2;
            o.LJIIIIZZ(verticalAddOnOrderGroup, "verticalAddOnOrderGroup");
            ((LinearLayout) au2S5S0400000_12.l2).setVisibility(0);
            ((AddonOrderVH) au2S5S0400000_12.l0).N(3, ((C27941Axt) au2S5S0400000_12.l3).LIZ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S5S0400000_12(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
