package Y;

import X.AbstractC029409q;
import X.AbstractC45801HyH;
import X.AbstractC85571XiB;
import X.C0A2;
import X.C0A6;
import X.C157166Eu;
import X.C27593AsH;
import X.C28851Bh;
import X.C36746EbW;
import X.C58655N0h;
import X.C58704N2e;
import X.C70248Rhc;
import X.C70287RiF;
import X.C70459Rl1;
import X.C70565Rmj;
import X.C71363Rzb;
import X.C71366Rze;
import X.C71767SEp;
import X.C72919Sjb;
import X.C74211TAp;
import X.C74275TDb;
import X.C74496TLo;
import X.C76542zS;
import X.C78685UuP;
import X.C90193gN;
import X.DialogC70776Rq8;
import X.DialogC71430S1q;
import X.InterfaceC70778RqA;
import X.InterfaceC70779RqB;
import X.KL2;
import X.ORZ;
import X.OSZ;
import X.T45;
import X.T4A;
import X.TL5;
import X.TLH;
import X.TLI;
import X.W5I;
import X.W6J;
import X.WM7;
import X.X1D;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.commercialize.feed.assem.product.AdProductTileAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.product.AdProductTileVM;
import com.ss.android.ugc.aweme.discover.ui.TrendsTabFragment;
import com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceAnchorPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment.SubPaymentListAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.PdpShopRecommendVH;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.FavoriteVideoPickerBottomSheet;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.FavoriteVideoPickerViewModel;
import com.ss.android.ugc.aweme.sticker.pagination.CategoryEffectPageFragment;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer;
import com.ss.android.ugc.aweme.view.onboarding.ProfileNaviOnboardingFragment;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class IDrS50S0100000_12 extends C0A6 {
    public final int $t;
    public Object l0;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        switch (this.$t) {
            case 1:
                LJIILJJIL$0(this, i, recyclerView);
                return;
            case 2:
                LJIILJJIL$1(this, i, recyclerView);
                return;
            case 3:
                LJIILJJIL$2(this, i, recyclerView);
                return;
            case 4:
            case 5:
            case 8:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            case 15:
            default:
                super.LJIILJJIL(i, recyclerView);
                return;
            case 6:
                LJIILJJIL$3(this, i, recyclerView);
                return;
            case 7:
                LJIILJJIL$4(this, i, recyclerView);
                return;
            case 9:
                LJIILJJIL$5(this, i, recyclerView);
                return;
            case 10:
                LJIILJJIL$6(this, i, recyclerView);
                return;
            case 12:
                LJIILJJIL$7(this, i, recyclerView);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                LJIILJJIL$8(this, i, recyclerView);
                return;
            case 14:
                LJIILJJIL$9(this, i, recyclerView);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                LJIILJJIL$10(this, i, recyclerView);
                return;
            case 17:
                LJIILJJIL$11(this, i, recyclerView);
                return;
            case 18:
                LJIILJJIL$12(this, i, recyclerView);
                return;
            case 19:
                LJIILJJIL$13(this, i, recyclerView);
                return;
            case 20:
                LJIILJJIL$14(this, i, recyclerView);
                return;
            case 21:
                LJIILJJIL$15(this, i, recyclerView);
                return;
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJIILL$0(this, recyclerView, i, i2);
                return;
            case 1:
            case 6:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
            case 19:
            default:
                super.LJIILL(recyclerView, i, i2);
                return;
            case 2:
                LJIILL$1(this, recyclerView, i, i2);
                return;
            case 3:
                LJIILL$2(this, recyclerView, i, i2);
                return;
            case 4:
                LJIILL$3(this, recyclerView, i, i2);
                return;
            case 5:
                LJIILL$4(this, recyclerView, i, i2);
                return;
            case 7:
                LJIILL$5(this, recyclerView, i, i2);
                return;
            case 8:
                LJIILL$6(this, recyclerView, i, i2);
                return;
            case 9:
                LJIILL$7(this, recyclerView, i, i2);
                return;
            case 10:
                LJIILL$8(this, recyclerView, i, i2);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LJIILL$9(this, recyclerView, i, i2);
                return;
            case 12:
                LJIILL$10(this, recyclerView, i, i2);
                return;
            case 14:
                LJIILL$11(this, recyclerView, i, i2);
                return;
            case 15:
                LJIILL$12(this, recyclerView, i, i2);
                return;
            case 17:
                LJIILL$13(this, recyclerView, i, i2);
                return;
            case 18:
                LJIILL$14(this, recyclerView, i, i2);
                return;
            case 20:
                LJIILL$15(this, recyclerView, i, i2);
                return;
            case 21:
                LJIILL$16(this, recyclerView, i, i2);
                return;
            case 22:
                LJIILL$17(this, recyclerView, i, i2);
                return;
        }
    }

    public IDrS50S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJIILJJIL$0(IDrS50S0100000_12 iDrS50S0100000_12, int i, RecyclerView recyclerView) {
        List list;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            C58655N0h LIZLLL = C58704N2e.LIZLLL("landing_ad", "landing_page_scroll", ((ECommerceAnchorPanelFragment) iDrS50S0100000_12.l0).LJLJLJ.getAwemeRawAd());
            LIZLLL.LIZJ("landing_page", "refer");
            LIZLLL.LIZIZ(Float.valueOf(((ECommerceAnchorPanelFragment) iDrS50S0100000_12.l0).LLIFFJFJJ), "scroll_top");
            LIZLLL.LJI();
            ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment = (ECommerceAnchorPanelFragment) iDrS50S0100000_12.l0;
            int i2 = eCommerceAnchorPanelFragment.LLIFFJFJJ;
            ProductListModel productListModel = eCommerceAnchorPanelFragment.LJLJLJ;
            List<ShopWindowAnchorModel> products = productListModel.getProducts();
            if (products != null) {
                list = ORZ.LLJILJILJ(products);
            } else {
                list = null;
            }
            C71363Rzb.LJIIJJI(i2, productListModel, C71366Rze.LJI(list));
            ((ECommerceAnchorPanelFragment) iDrS50S0100000_12.l0).Ll();
            ((ECommerceAnchorPanelFragment) iDrS50S0100000_12.l0).LLIFFJFJJ = 0;
        }
    }

    public static final void LJIILJJIL$1(IDrS50S0100000_12 iDrS50S0100000_12, int i, RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        AwemeRawAd awemeRawAd;
        Aweme aweme;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0 && (linearLayoutManager = (LinearLayoutManager) ((AdProductTileAssem) iDrS50S0100000_12.l0).q4().getLayoutManager()) != null) {
            AdProductTileAssem adProductTileAssem = (AdProductTileAssem) iDrS50S0100000_12.l0;
            AdProductTileVM u4 = adProductTileAssem.u4();
            int LLILL = linearLayoutManager.LLILL();
            int LLILLJJLI = linearLayoutManager.LLILLJJLI();
            int LJIILL = KL2.LJIILL(adProductTileAssem.getContext(), adProductTileAssem.LLIIII);
            int LJIILL2 = KL2.LJIILL(adProductTileAssem.getContext(), adProductTileAssem.LLIIIILZ);
            VideoItemParams gv0 = u4.gv0();
            if (gv0 != null && (aweme = gv0.getAweme()) != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "card_scroll", awemeRawAd);
            LIZLLL.LIZJ("card", "refer");
            LIZLLL.LIZIZ("AdPlp", WM7.SCENE_SERVICE);
            LIZLLL.LIZIZ("native_product_tile", "cardType");
            LIZLLL.LIZIZ(Integer.valueOf(LJIILL), "startPosition");
            LIZLLL.LIZIZ(Integer.valueOf(LJIILL2), "endPosition");
            LIZLLL.LIZIZ(Integer.valueOf(LLILL), "firstIndex");
            LIZLLL.LIZIZ(Integer.valueOf(LLILLJJLI), "lastIndex");
            LIZLLL.LJI();
            adProductTileAssem.LLIIII = adProductTileAssem.LLIIIILZ;
        }
    }

    public static final void LJIILJJIL$10(IDrS50S0100000_12 iDrS50S0100000_12, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((EffectTemplateCategoryFragment) iDrS50S0100000_12.l0).LJLLILLLL.onNext(Integer.valueOf(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r6 == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILJJIL$11(Y.IDrS50S0100000_12 r5, int r6, androidx.recyclerview.widget.RecyclerView r7) {
        /*
            java.lang.String r0 = "recyclerView"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.Object r4 = r5.l0
            X.RiF r4 = (X.C70287RiF) r4
            int r0 = r4.LJLJLLL
            if (r0 == 0) goto L36
            if (r6 != 0) goto L2f
            int r1 = r4.LJLJLJ
            r0 = 8
            if (r1 <= r0) goto L28
            X.Rrk r3 = new X.Rrk
            r3.<init>()
            kotlin.jvm.internal.AqS178S0100000_12 r2 = new kotlin.jvm.internal.AqS178S0100000_12
            java.lang.Object r1 = r5.l0
            X.RiF r1 = (X.C70287RiF) r1
            r0 = 655(0x28f, float:9.18E-43)
            r2.<init>(r1, r0)
            X.C78946Uyc.LJJIIJ(r4, r3, r2)
        L28:
            java.lang.Object r1 = r5.l0
            X.RiF r1 = (X.C70287RiF) r1
            r0 = 0
            r1.LJLJLJ = r0
        L2f:
            java.lang.Object r0 = r5.l0
            X.RiF r0 = (X.C70287RiF) r0
            r0.LJLJLLL = r6
            return
        L36:
            if (r6 != 0) goto L2f
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDrS50S0100000_12.LJIILJJIL$11(Y.IDrS50S0100000_12, int, androidx.recyclerview.widget.RecyclerView):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r6 == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILJJIL$12(Y.IDrS50S0100000_12 r5, int r6, androidx.recyclerview.widget.RecyclerView r7) {
        /*
            java.lang.String r0 = "recyclerView"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.Object r4 = r5.l0
            X.Rhc r4 = (X.C70248Rhc) r4
            int r0 = r4.LJLJLJ
            if (r0 == 0) goto L36
            if (r6 != 0) goto L2f
            int r1 = r4.LJLJL
            r0 = 8
            if (r1 <= r0) goto L28
            X.Rrk r3 = new X.Rrk
            r3.<init>()
            kotlin.jvm.internal.AqS178S0100000_12 r2 = new kotlin.jvm.internal.AqS178S0100000_12
            java.lang.Object r1 = r5.l0
            X.Rhc r1 = (X.C70248Rhc) r1
            r0 = 679(0x2a7, float:9.51E-43)
            r2.<init>(r1, r0)
            X.C78946Uyc.LJJIIJ(r4, r3, r2)
        L28:
            java.lang.Object r1 = r5.l0
            X.Rhc r1 = (X.C70248Rhc) r1
            r0 = 0
            r1.LJLJL = r0
        L2f:
            java.lang.Object r0 = r5.l0
            X.Rhc r0 = (X.C70248Rhc) r0
            r0.LJLJLJ = r6
            return
        L36:
            if (r6 != 0) goto L2f
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDrS50S0100000_12.LJIILJJIL$12(Y.IDrS50S0100000_12, int, androidx.recyclerview.widget.RecyclerView):void");
    }

    public static final void LJIILJJIL$13(IDrS50S0100000_12 iDrS50S0100000_12, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (((SearchStickerViewContainer) iDrS50S0100000_12.l0).LJI() && i == 1) {
            ((SearchStickerViewContainer) iDrS50S0100000_12.l0).LLZLI();
        }
    }

    public static final void LJIILJJIL$14(IDrS50S0100000_12 iDrS50S0100000_12, int i, RecyclerView recyclerView) {
        if (i == 0) {
            T4A t4a = (T4A) iDrS50S0100000_12.l0;
            if (t4a.LJIIIZ) {
                t4a.LJIIIZ = false;
                return;
            }
            return;
        }
        if (1 != i) {
            return;
        }
        ((T4A) iDrS50S0100000_12.l0).LJIIIZ = true;
    }

    public static final void LJIILJJIL$15(IDrS50S0100000_12 iDrS50S0100000_12, int i, RecyclerView recyclerView) {
        String str;
        o.LJIIIZ(recyclerView, "recyclerView");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onScrollStateChanged, newState: ");
        LIZ.append(i);
        C36746EbW.LIZ(4, X1D.LIZIZ(LIZ));
        if (i != 0) {
            if (i != 1) {
                return;
            }
            ((SubPaymentListAssem) iDrS50S0100000_12.l0).LJLJLJ = 0;
            return;
        }
        SubPaymentListAssem subPaymentListAssem = (SubPaymentListAssem) iDrS50S0100000_12.l0;
        if (subPaymentListAssem.LJLJLJ >= 0) {
            str = "more";
        } else {
            str = "less";
        }
        C27593AsH c27593AsH = subPaymentListAssem.v3().LJLJJL;
        c27593AsH.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(c27593AsH.LIZ);
        linkedHashMap.put("glide_type", str);
        C76542zS.LIZ("tiktokec_glide_page", linkedHashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        if (r6 == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILJJIL$2(Y.IDrS50S0100000_12 r5, int r6, androidx.recyclerview.widget.RecyclerView r7) {
        /*
            java.lang.String r0 = "recyclerView"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.Object r2 = r5.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.PdpShopRecommendVH r2 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.PdpShopRecommendVH) r2
            int r0 = r2.scrollState
            if (r0 == 0) goto L3d
            if (r6 != 0) goto L36
            int r1 = r2.scrollX
            r0 = 8
            if (r1 <= r0) goto L2f
            android.view.View r4 = r2.itemView
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            X.Rrk r3 = new X.Rrk
            r3.<init>()
            kotlin.jvm.internal.AqS178S0100000_12 r2 = new kotlin.jvm.internal.AqS178S0100000_12
            java.lang.Object r1 = r5.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.PdpShopRecommendVH r1 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.PdpShopRecommendVH) r1
            r0 = 129(0x81, float:1.81E-43)
            r2.<init>(r1, r0)
            X.C78946Uyc.LJJIIJ(r4, r3, r2)
        L2f:
            java.lang.Object r1 = r5.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.PdpShopRecommendVH r1 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.PdpShopRecommendVH) r1
            r0 = 0
            r1.scrollX = r0
        L36:
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.PdpShopRecommendVH r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.PdpShopRecommendVH) r0
            r0.scrollState = r6
            return
        L3d:
            if (r6 != 0) goto L36
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDrS50S0100000_12.LJIILJJIL$2(Y.IDrS50S0100000_12, int, androidx.recyclerview.widget.RecyclerView):void");
    }

    public static final void LJIILJJIL$3(IDrS50S0100000_12 iDrS50S0100000_12, int i, RecyclerView recyclerView) {
        CategoryEffectPageFragment categoryEffectPageFragment;
        String str;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (!o.LJ(((CategoryEffectPageFragment) iDrS50S0100000_12.l0).Pl().ST().getValue(), Boolean.TRUE)) {
            return;
        }
        C0A2 layoutManager = recyclerView.getLayoutManager();
        o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int LLILLJJLI = ((LinearLayoutManager) layoutManager).LLILLJJLI();
        if (((CategoryEffectPageFragment) iDrS50S0100000_12.l0).LJLJJI != null) {
            if ((r0.getItemCount() - 2) - LLILLJJLI <= ((CategoryEffectPageFragment) iDrS50S0100000_12.l0).xl().LIZ.LJJIL().LJLJL.LJLJJI && (str = (categoryEffectPageFragment = (CategoryEffectPageFragment) iDrS50S0100000_12.l0).LJLLLL) != null) {
                categoryEffectPageFragment.Pl().do0(str);
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final void LJIILJJIL$4(IDrS50S0100000_12 iDrS50S0100000_12, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            ((C72919Sjb) iDrS50S0100000_12.l0).LIZ();
        }
    }

    public static final void LJIILJJIL$5(IDrS50S0100000_12 iDrS50S0100000_12, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        TLI tli = (TLI) iDrS50S0100000_12.l0;
        if (tli.LJJIJL != i) {
            tli.LJJIJL = i;
            tli.LJJIJ(i);
        }
    }

    public static final void LJIILJJIL$6(IDrS50S0100000_12 iDrS50S0100000_12, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        TLH tlh = (TLH) iDrS50S0100000_12.l0;
        if (tlh.LJJIJL != i) {
            tlh.LJJIJL = i;
            tlh.LJJIJ(i);
        }
    }

    public static final void LJIILJJIL$7(IDrS50S0100000_12 iDrS50S0100000_12, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((TL5) iDrS50S0100000_12.l0).LJIIJ.onNext(Integer.valueOf(i));
        if (i == 0) {
            C0A2 layoutManager = recyclerView.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager)) {
                layoutManager = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager != null) {
                int LJIILLIIL = ((TL5) iDrS50S0100000_12.l0).LJIILLIIL(linearLayoutManager.LLILL());
                AbstractC45801HyH<C157166Eu> abstractC45801HyH = ((TL5) iDrS50S0100000_12.l0).LJ;
                if (abstractC45801HyH != null) {
                    C157166Eu c157166Eu = (C157166Eu) ORZ.LJLLLLLL(LJIILLIIL, abstractC45801HyH.getData());
                    if (c157166Eu != null) {
                        ((TL5) iDrS50S0100000_12.l0).LJIIJJI.onNext(new OSZ(c157166Eu.LJLIL, Integer.valueOf(LJIILLIIL)));
                    }
                } else {
                    o.LJIJI("dataAdapter");
                    throw null;
                }
            }
            ((TL5) iDrS50S0100000_12.l0).LJJ();
        }
        TL5 tl5 = (TL5) iDrS50S0100000_12.l0;
        if (!tl5.LIZ.LIZ) {
            return;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    W5I.LIZ().LJIIJJI();
                }
            } else if (tl5.LJIIZILJ == 2) {
                W5I.LIZ().LJIIJJI();
            } else {
                W6J LIZ = W5I.LIZ();
                o.LJIIIIZZ(LIZ, "Fresco.getImagePipeline()");
                if (LIZ.LJIIJ()) {
                    W5I.LIZ().LJIILL();
                }
            }
        } else {
            W6J LIZ2 = W5I.LIZ();
            o.LJIIIIZZ(LIZ2, "Fresco.getImagePipeline()");
            if (LIZ2.LJIIJ()) {
                W5I.LIZ().LJIILL();
            }
        }
        tl5.LJIIZILJ = i;
    }

    public static final void LJIILJJIL$8(IDrS50S0100000_12 iDrS50S0100000_12, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    W5I.LIZ().LJIIJJI();
                }
            } else if (((TrendsTabFragment) iDrS50S0100000_12.l0).LJLJL == 2) {
                W5I.LIZ().LJIIJJI();
            } else if (W5I.LIZ().LJIIJ()) {
                W5I.LIZ().LJIILL();
            }
        } else if (W5I.LIZ().LJIIJ()) {
            W5I.LIZ().LJIILL();
        }
        ((TrendsTabFragment) iDrS50S0100000_12.l0).LJLJL = i;
    }

    public static final void LJIILJJIL$9(IDrS50S0100000_12 iDrS50S0100000_12, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        C74496TLo c74496TLo = (C74496TLo) iDrS50S0100000_12.l0;
        if (c74496TLo.LJJJJI != i) {
            c74496TLo.LJJJJI = i;
            c74496TLo.LJJIJ(i);
        }
    }

    public static final void LJIILL$0(IDrS50S0100000_12 iDrS50S0100000_12, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((C70459Rl1) iDrS50S0100000_12.l0).LIZ = SystemClock.elapsedRealtime();
    }

    public static final void LJIILL$1(IDrS50S0100000_12 iDrS50S0100000_12, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        AdProductTileAssem adProductTileAssem = (AdProductTileAssem) iDrS50S0100000_12.l0;
        if (adProductTileAssem.LLIIIJ == 0) {
            adProductTileAssem.LLIIIJ = adProductTileAssem.Y3().getWidth();
        }
        if (C90193gN.LIZIZ(((AdProductTileAssem) iDrS50S0100000_12.l0).getContext())) {
            AdProductTileAssem adProductTileAssem2 = (AdProductTileAssem) iDrS50S0100000_12.l0;
            adProductTileAssem2.LLIIIILZ -= i;
            adProductTileAssem2.LLIIIJ -= i;
        } else {
            AdProductTileAssem adProductTileAssem3 = (AdProductTileAssem) iDrS50S0100000_12.l0;
            adProductTileAssem3.LLIIIILZ += i;
            adProductTileAssem3.LLIIIJ += i;
        }
        AdProductTileAssem adProductTileAssem4 = (AdProductTileAssem) iDrS50S0100000_12.l0;
        adProductTileAssem4.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("listWidth is ");
        LIZ.append(adProductTileAssem4.LLIFFJFJJ);
        LIZ.append(" and lastWidth is ");
        LIZ.append(KL2.LIZJ(adProductTileAssem4.getContext(), 52.0f));
        X1D.LIZIZ(LIZ);
        if (adProductTileAssem4.LLIFFJFJJ - adProductTileAssem4.LLIIIJ > KL2.LIZJ(adProductTileAssem4.getContext(), 52.0f)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("failed, currentPosition is ");
            LIZ2.append(adProductTileAssem4.LLIIIJ);
            X1D.LIZIZ(LIZ2);
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("success, currentPosition is ");
        LIZ3.append(adProductTileAssem4.LLIIIJ);
        LIZ3.append(", alpha is ");
        LIZ3.append((adProductTileAssem4.LLIFFJFJJ - adProductTileAssem4.LLIIIJ) / KL2.LIZJ(adProductTileAssem4.getContext(), 52.0f));
        X1D.LIZIZ(LIZ3);
        adProductTileAssem4.r4().setAlpha((adProductTileAssem4.LLIFFJFJJ - adProductTileAssem4.LLIIIJ) / KL2.LIZJ(adProductTileAssem4.getContext(), 52.0f));
    }

    public static final void LJIILL$10(IDrS50S0100000_12 iDrS50S0100000_12, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((TL5) iDrS50S0100000_12.l0).LJIIL.onNext(Integer.valueOf(i2));
    }

    public static final void LJIILL$11(IDrS50S0100000_12 iDrS50S0100000_12, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        C74496TLo c74496TLo = (C74496TLo) iDrS50S0100000_12.l0;
        c74496TLo.LJJIJ(c74496TLo.LJJJJI);
    }

    public static final void LJIILL$12(IDrS50S0100000_12 iDrS50S0100000_12, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((C70565Rmj) iDrS50S0100000_12.l0).LIZ = SystemClock.elapsedRealtime();
    }

    public static final void LJIILL$13(IDrS50S0100000_12 iDrS50S0100000_12, RecyclerView recyclerView, int i, int i2) {
        String str;
        o.LJIIIZ(recyclerView, "recyclerView");
        C70287RiF c70287RiF = (C70287RiF) iDrS50S0100000_12.l0;
        if (i < 0) {
            str = "show_left";
        } else {
            str = "show_right";
        }
        c70287RiF.LJLJL = str;
        c70287RiF.LJLJLJ = Math.abs(i) + c70287RiF.LJLJLJ;
    }

    public static final void LJIILL$14(IDrS50S0100000_12 iDrS50S0100000_12, RecyclerView recyclerView, int i, int i2) {
        String str;
        o.LJIIIZ(recyclerView, "recyclerView");
        C70248Rhc c70248Rhc = (C70248Rhc) iDrS50S0100000_12.l0;
        if (i < 0) {
            str = "show_left";
        } else {
            str = "show_right";
        }
        c70248Rhc.LJLJJLL = str;
        c70248Rhc.LJLJL = Math.abs(i) + c70248Rhc.LJLJL;
    }

    public static final void LJIILL$15(IDrS50S0100000_12 iDrS50S0100000_12, RecyclerView recyclerView, int i, int i2) {
        Effect effect;
        T4A t4a = (T4A) iDrS50S0100000_12.l0;
        if (t4a.LJIIJ || t4a.LJIIIZ) {
            int LLILLJJLI = t4a.LJFF.LLILLJJLI();
            RecyclerView.ViewHolder LJJIZ = t4a.LIZ.LJJIZ(LLILLJJLI);
            if (LJJIZ != null) {
                int[] iArr = new int[2];
                LJJIZ.itemView.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                t4a.LIZ.getLocationOnScreen(iArr2);
                int i3 = iArr[0];
                if (i3 != 0 && iArr2[0] != 0) {
                    if (C74275TDb.LIZ(10.0f) + i3 >= t4a.LIZ.getWidth() + iArr2[0]) {
                        LLILLJJLI--;
                    }
                }
            }
            for (int LLILL = t4a.LJFF.LLILL(); LLILL <= LLILLJJLI; LLILL++) {
                T45 t45 = t4a.LIZIZ;
                if (LLILL >= 0) {
                    if (LLILL < t45.getItemCount()) {
                        effect = (Effect) ListProtector.get(t45.LJLIL, LLILL);
                        if (t45.LJLILLLLZI != null && effect != null) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("impr_position", t45.LJLJI);
                            t45.LJLILLLLZI.LIZIZ(effect, null, "click_main_panel", LLILL + 1, "main_panel", bundle);
                        }
                    }
                } else {
                    t45.getClass();
                }
                effect = null;
                if (t45.LJLILLLLZI != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("impr_position", t45.LJLJI);
                    t45.LJLILLLLZI.LIZIZ(effect, null, "click_main_panel", LLILL + 1, "main_panel", bundle2);
                }
            }
            ((T4A) iDrS50S0100000_12.l0).LJIIJ = false;
        }
    }

    public static final void LJIILL$16(IDrS50S0100000_12 iDrS50S0100000_12, RecyclerView recyclerView, int i, int i2) {
        boolean LJ;
        String str;
        o.LJIIIZ(recyclerView, "recyclerView");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onScrolled, dy: ");
        LIZ.append(i2);
        C36746EbW.LIZ(4, X1D.LIZIZ(LIZ));
        ((SubPaymentListAssem) iDrS50S0100000_12.l0).LJLJLJ += i2;
        C0A2 layoutManager = recyclerView.getLayoutManager();
        o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        SubPaymentListAssem subPaymentListAssem = (SubPaymentListAssem) iDrS50S0100000_12.l0;
        int LLILL = linearLayoutManager.LLILL();
        int LLILLJJLI = linearLayoutManager.LLILLJJLI();
        if (LLILL > LLILLJJLI) {
            return;
        }
        while (true) {
            C71767SEp c71767SEp = (C71767SEp) ORZ.LJLLLLLL(LLILL, subPaymentListAssem.LJLJJL);
            if (c71767SEp != null) {
                String str2 = subPaymentListAssem.LJLJJLL;
                if (str2 == null) {
                    if (LLILL == 0) {
                        LJ = true;
                    } else {
                        LJ = false;
                    }
                } else {
                    LJ = o.LJ(str2, c71767SEp.LJLILLLLZI.id);
                }
                C27593AsH c27593AsH = subPaymentListAssem.v3().LJLJJL;
                PaymentMethod subPaymentMethod = c71767SEp.LJLILLLLZI;
                String LJIIL = c71767SEp.LJLIL.LJIIL();
                String LJIIL2 = c71767SEp.LJLILLLLZI.LJIIL();
                boolean LJJJZ = C78685UuP.LJJJZ(c71767SEp.LJLILLLLZI.extraInfo);
                Availability availability = c71767SEp.LJLILLLLZI.availability;
                if (availability != null) {
                    str = availability.statusCode;
                } else {
                    str = null;
                }
                c27593AsH.getClass();
                o.LJIIIZ(subPaymentMethod, "subPaymentMethod");
                if (!((ArrayList) c27593AsH.LIZJ).contains(subPaymentMethod.LJFF())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.putAll(c27593AsH.LIZ);
                    linkedHashMap.put("parent_option_name", LJIIL);
                    linkedHashMap.put("option_name", LJIIL2);
                    linkedHashMap.put("option_type", "sub_payment_type");
                    linkedHashMap.put("is_option_discounted", Integer.valueOf(LJJJZ ? 1 : 0));
                    linkedHashMap.put("original_rank", Integer.valueOf(LLILL));
                    if (str != null && str.length() != 0) {
                        linkedHashMap.put("status_code", str);
                    }
                    if (LJ) {
                        linkedHashMap.put("is_default", 1);
                    }
                    C76542zS.LIZ("tiktokec_option_show", linkedHashMap);
                    ((ArrayList) c27593AsH.LIZJ).add(subPaymentMethod.LJFF());
                }
            }
            if (LLILL != LLILLJJLI) {
                LLILL++;
            } else {
                return;
            }
        }
    }

    public static final void LJIILL$17(IDrS50S0100000_12 iDrS50S0100000_12, RecyclerView recyclerView, int i, int i2) {
        C0A2 layoutManager;
        int LJJJI;
        int i3;
        int LJJJLL;
        o.LJIIIZ(recyclerView, "recyclerView");
        DialogC71430S1q dialogC71430S1q = (DialogC71430S1q) iDrS50S0100000_12.l0;
        RecyclerView recyclerView2 = dialogC71430S1q.LJLIL;
        C28851Bh c28851Bh = dialogC71430S1q.LJLJJI;
        o.LJIIIZ(recyclerView2, "<this>");
        View view = null;
        if (c28851Bh == null || (layoutManager = recyclerView2.getLayoutManager()) == null || (LJJJI = layoutManager.LJJJI()) == 0) {
            return;
        }
        if (layoutManager.LJJJJ()) {
            i3 = (c28851Bh.LJIIJJI() / 2) + c28851Bh.LJIIJ();
        } else {
            i3 = c28851Bh.LIZ.LJLLLL / 2;
        }
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < LJJJI; i5++) {
            View LJJJ = layoutManager.LJJJ(i5);
            if (LJJJ != null) {
                C0A2.LJJJLL(LJJJ);
            }
            int abs = Math.abs(((c28851Bh.LIZJ(LJJJ) / 2) + c28851Bh.LJ(LJJJ)) - i3);
            if (abs < i4) {
                view = LJJJ;
                i4 = abs;
            }
        }
        if (view == null) {
            return;
        }
        DialogC71430S1q dialogC71430S1q2 = (DialogC71430S1q) iDrS50S0100000_12.l0;
        if (recyclerView.getLayoutManager() == null || dialogC71430S1q2.LJLJJL == (LJJJLL = C0A2.LJJJLL(view))) {
            return;
        }
        dialogC71430S1q2.LJLJJL = LJJJLL;
        Iterator it = ((ArrayList) dialogC71430S1q2.LJLJJLL).iterator();
        while (it.hasNext()) {
            ((InterfaceC70778RqA) it.next()).onPageSelected(LJJJLL);
        }
        Iterator it2 = ((ArrayList) ((DialogC70776Rq8) dialogC71430S1q2).LJLJLJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC70779RqB) it2.next()).onPageSelected(LJJJLL);
        }
    }

    public static final void LJIILL$2(IDrS50S0100000_12 iDrS50S0100000_12, RecyclerView recyclerView, int i, int i2) {
        String str;
        o.LJIIIZ(recyclerView, "recyclerView");
        PdpShopRecommendVH pdpShopRecommendVH = (PdpShopRecommendVH) iDrS50S0100000_12.l0;
        if (i < 0) {
            str = "show_left";
        } else {
            str = "show_right";
        }
        pdpShopRecommendVH.slideType = str;
        pdpShopRecommendVH.scrollX = Math.abs(i) + pdpShopRecommendVH.scrollX;
    }

    public static final void LJIILL$3(IDrS50S0100000_12 iDrS50S0100000_12, RecyclerView recyclerView, int i, int i2) {
        int i3;
        o.LJIIIZ(recyclerView, "recyclerView");
        C0A2 layoutManager = recyclerView.getLayoutManager();
        o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        int LLILLJJLI = ((LinearLayoutManager) layoutManager).LLILLJJLI() + 1;
        AbstractC029409q adapter = recyclerView.getAdapter();
        if (adapter != null) {
            i3 = adapter.getItemCount() - 6;
        } else {
            i3 = 0;
        }
        if (LLILLJJLI >= i3) {
            FavoriteVideoPickerViewModel vl = ((FavoriteVideoPickerBottomSheet) iDrS50S0100000_12.l0).vl();
            if (!o.LJ(vl.LJLJJLL.getValue(), Boolean.TRUE) && vl.LJLJJL >= 0) {
                vl.gv0();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r3 == (r1 - 1)) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILL$4(Y.IDrS50S0100000_12 r5, androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            java.lang.String r0 = "recyclerView"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            X.0A2 r4 = r6.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r4 = (androidx.recyclerview.widget.LinearLayoutManager) r4
            if (r4 != 0) goto Le
            return
        Le:
            int r0 = r4.LLILL()
            r2 = 2131371868(0x7f0a275c, float:1.8363783E38)
            r1 = 2131371864(0x7f0a2758, float:1.8363775E38)
            if (r0 <= 0) goto L77
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.profile.aigc.ProfileAigcChooseAvatarFragment r0 = (com.ss.android.ugc.aweme.profile.aigc.ProfileAigcChooseAvatarFragment) r0
            android.view.View r0 = r0._$_findCachedViewById(r1)
            android.view.View r1 = r0.findViewById(r2)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
        L2b:
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.profile.aigc.ProfileAigcChooseAvatarFragment r0 = (com.ss.android.ugc.aweme.profile.aigc.ProfileAigcChooseAvatarFragment) r0
            X.SRW r3 = r0.LJLJJI
            r2 = 0
            if (r3 == 0) goto L75
            X.APM r1 = r3.LJLIL
        L36:
            X.APM r0 = X.APM.TOOLS_CREATION_FLOW
            if (r1 != r0) goto L66
            if (r3 == 0) goto L3e
            X.SSR r2 = r3.LJLJJI
        L3e:
            X.SSR r0 = X.SSR.SINGLE
            if (r2 != r0) goto L66
            int r3 = r4.LLILLJJLI()
            X.09q r0 = r6.getAdapter()
            r2 = 0
            if (r0 == 0) goto L73
            int r1 = r0.getItemCount()
            r0 = 1
            int r1 = r1 - r0
            if (r3 != r1) goto L73
        L55:
            r1 = 2131362903(0x7f0a0457, float:1.83456E38)
            if (r0 == 0) goto L67
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.profile.aigc.ProfileAigcChooseAvatarFragment r0 = (com.ss.android.ugc.aweme.profile.aigc.ProfileAigcChooseAvatarFragment) r0
            android.view.View r1 = r0._$_findCachedViewById(r1)
            r0 = 4
            r1.setVisibility(r0)
        L66:
            return
        L67:
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.profile.aigc.ProfileAigcChooseAvatarFragment r0 = (com.ss.android.ugc.aweme.profile.aigc.ProfileAigcChooseAvatarFragment) r0
            android.view.View r0 = r0._$_findCachedViewById(r1)
            r0.setVisibility(r2)
            goto L66
        L73:
            r0 = 0
            goto L55
        L75:
            r1 = r2
            goto L36
        L77:
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.profile.aigc.ProfileAigcChooseAvatarFragment r0 = (com.ss.android.ugc.aweme.profile.aigc.ProfileAigcChooseAvatarFragment) r0
            android.view.View r0 = r0._$_findCachedViewById(r1)
            android.view.View r1 = r0.findViewById(r2)
            r0 = 0
            r1.setAlpha(r0)
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDrS50S0100000_12.LJIILL$4(Y.IDrS50S0100000_12, androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public static final void LJIILL$5(IDrS50S0100000_12 iDrS50S0100000_12, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        C72919Sjb c72919Sjb = (C72919Sjb) iDrS50S0100000_12.l0;
        if (c72919Sjb.LIZJ) {
            c72919Sjb.LIZJ = false;
            c72919Sjb.LIZ();
        }
    }

    public static final void LJIILL$6(IDrS50S0100000_12 iDrS50S0100000_12, RecyclerView recyclerView, int i, int i2) {
        float floatValue;
        boolean z;
        View _$_findCachedViewById;
        View _$_findCachedViewById2;
        o.LJIIIZ(recyclerView, "recyclerView");
        ProfileNaviOnboardingFragment profileNaviOnboardingFragment = (ProfileNaviOnboardingFragment) iDrS50S0100000_12.l0;
        float computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        if (computeVerticalScrollOffset >= ((Number) profileNaviOnboardingFragment.LJLIL.getValue()).floatValue()) {
            floatValue = 0.0f;
        } else {
            floatValue = (((Number) profileNaviOnboardingFragment.LJLIL.getValue()).floatValue() - computeVerticalScrollOffset) / ((Number) profileNaviOnboardingFragment.LJLIL.getValue()).floatValue();
        }
        View _$_findCachedViewById3 = profileNaviOnboardingFragment._$_findCachedViewById(R.id.gy3);
        if (_$_findCachedViewById3 != null) {
            _$_findCachedViewById3.setScaleX(floatValue);
        }
        View _$_findCachedViewById4 = profileNaviOnboardingFragment._$_findCachedViewById(R.id.gy3);
        if (_$_findCachedViewById4 != null) {
            _$_findCachedViewById4.setScaleY(floatValue);
        }
        if (floatValue == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z && (_$_findCachedViewById2 = profileNaviOnboardingFragment._$_findCachedViewById(R.id.i9c)) != null && _$_findCachedViewById2.getVisibility() == 8) {
            profileNaviOnboardingFragment.Gl(true);
        } else {
            if (floatValue <= 0.0f || (_$_findCachedViewById = profileNaviOnboardingFragment._$_findCachedViewById(R.id.i9c)) == null || _$_findCachedViewById.getVisibility() != 0) {
                return;
            }
            profileNaviOnboardingFragment.Gl(false);
        }
    }

    public static final void LJIILL$7(IDrS50S0100000_12 iDrS50S0100000_12, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        TLI tli = (TLI) iDrS50S0100000_12.l0;
        tli.LJJIJ(tli.LJJIJL);
    }

    public static final void LJIILL$8(IDrS50S0100000_12 iDrS50S0100000_12, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        TLH tlh = (TLH) iDrS50S0100000_12.l0;
        tlh.LJJIJ(tlh.LJJIJL);
    }

    public static final void LJIILL$9(IDrS50S0100000_12 iDrS50S0100000_12, RecyclerView recyclerView, int i, int i2) {
        RecyclerView.ViewHolder LJJJJJL;
        boolean z;
        float f;
        o.LJIIIZ(recyclerView, "recyclerView");
        View childAt = ((AbstractC85571XiB) iDrS50S0100000_12.l0).LIZIZ().getChildAt(0);
        if (childAt != null && childAt.getParent() != null && ((z = (LJJJJJL = ((AbstractC85571XiB) iDrS50S0100000_12.l0).LIZIZ().LJJJJJL(childAt)) instanceof C74211TAp))) {
            C74211TAp c74211TAp = (C74211TAp) LJJJJJL;
            if (c74211TAp.LJLILLLLZI.getHeight() > 0) {
                int top = c74211TAp.LJLIL.getTop();
                int top2 = c74211TAp.LJLILLLLZI.getTop();
                if (top >= 0) {
                    f = 0.0f;
                } else if (top > (-(c74211TAp.LJLILLLLZI.getHeight() + top2))) {
                    f = (Math.abs(top) - top2) / c74211TAp.LJLILLLLZI.getHeight();
                }
                ((View) ((AbstractC85571XiB) iDrS50S0100000_12.l0).LJFF.getValue()).setAlpha(f);
                ((View) ((AbstractC85571XiB) iDrS50S0100000_12.l0).LJI.getValue()).setAlpha(f);
            }
            f = 1.0f;
            if (!z) {
                return;
            }
            ((View) ((AbstractC85571XiB) iDrS50S0100000_12.l0).LJFF.getValue()).setAlpha(f);
            ((View) ((AbstractC85571XiB) iDrS50S0100000_12.l0).LJI.getValue()).setAlpha(f);
        }
    }
}
