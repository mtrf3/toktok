package com.ss.android.ugc.aweme.utils;

import X.C26867AgZ;
import X.C27722AuM;
import X.C27739Aud;
import X.C51029K0z;
import X.C70101RfF;
import X.C70120RfY;
import X.C70208Rgy;
import X.C70297RiP;
import X.C70414RkI;
import X.C70912RsK;
import X.C70923RsV;
import X.C78946Uyc;
import X.C78948Uye;
import X.C78983UzD;
import X.C79234V7u;
import X.EnumC62102cA;
import X.EnumC69988RdQ;
import X.InterfaceC71003Rtn;
import X.JF1;
import X.ORZ;
import X.OSZ;
import X.TAT;
import X.X1D;
import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FeedExtra;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FeedProduct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPreviewInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Price;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Product;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecommendDaInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS32S0301000_12;
import kotlin.jvm.internal.AqS61S0201000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class Au2S1S0301000_12 extends TAT {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final void LIZ$0(Au2S1S0301000_12 au2S1S0301000_12, View view) {
        ((AnchorPanelAdapter) au2S1S0301000_12.l0).LJZ((View) au2S1S0301000_12.l1, au2S1S0301000_12.i3, (ShopWindowAnchorModel) au2S1S0301000_12.l2, "other");
    }

    public static final void LIZ$1(Au2S1S0301000_12 au2S1S0301000_12, View view) {
        ((AnchorPanelAdapter) au2S1S0301000_12.l0).LJZ((View) au2S1S0301000_12.l1, au2S1S0301000_12.i3, (ShopWindowAnchorModel) au2S1S0301000_12.l2, "pic");
    }

    public static final void LIZ$2(Au2S1S0301000_12 au2S1S0301000_12, View view) {
        ((AnchorPanelAdapter) au2S1S0301000_12.l0).LJZ((View) au2S1S0301000_12.l1, au2S1S0301000_12.i3, (ShopWindowAnchorModel) au2S1S0301000_12.l2, "title");
    }

    public static final void LIZ$3(Au2S1S0301000_12 au2S1S0301000_12, View view) {
        ((AnchorPanelAdapter) au2S1S0301000_12.l0).LJZ((View) au2S1S0301000_12.l1, au2S1S0301000_12.i3, (ShopWindowAnchorModel) au2S1S0301000_12.l2, "other");
    }

    public static final void LIZ$4(Au2S1S0301000_12 au2S1S0301000_12, View view) {
        ((AnchorPanelAdapter) au2S1S0301000_12.l0).LJZ((View) au2S1S0301000_12.l1, au2S1S0301000_12.i3, (ShopWindowAnchorModel) au2S1S0301000_12.l2, "price");
    }

    public static final void LIZ$5(Au2S1S0301000_12 au2S1S0301000_12, View view) {
        String str;
        String str2;
        Object obj;
        String str3;
        LaneParams laneParams;
        HashMap<String, Object> hashMap;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        HashMap<String, Object> trackParams;
        if (view != null) {
            C70297RiP c70297RiP = (C70297RiP) au2S1S0301000_12.l0;
            C70414RkI c70414RkI = c70297RiP.LJLJI.LLFII;
            View itemView = c70297RiP.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C78946Uyc.LJJIIJ(itemView, new C70912RsK(), new AqS32S0301000_12(au2S1S0301000_12.i3, (C70297RiP) au2S1S0301000_12.l0, (ProductData) au2S1S0301000_12.l1, (Map) au2S1S0301000_12.l2, 2));
            C70297RiP c70297RiP2 = (C70297RiP) au2S1S0301000_12.l0;
            PdpViewModel pdpViewModel = c70297RiP2.LJLJI;
            View itemView2 = c70297RiP2.itemView;
            o.LJIIIIZZ(itemView2, "itemView");
            ProductData data = (ProductData) au2S1S0301000_12.l1;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(((C70297RiP) au2S1S0301000_12.l0).LJLJJI);
            LIZ.append('_');
            LIZ.append(au2S1S0301000_12.i3 + 1);
            String LIZIZ = X1D.LIZIZ(LIZ);
            C70297RiP c70297RiP3 = (C70297RiP) au2S1S0301000_12.l0;
            String str4 = c70297RiP3.LJLJJI;
            Map map = (Map) au2S1S0301000_12.l2;
            ECBaseFragment fragment = c70297RiP3.LJLIL;
            pdpViewModel.getClass();
            o.LJIIIZ(data, "data");
            o.LJIIIZ(fragment, "fragment");
            Product product = data.product;
            if (product != null) {
                str = product.schema;
            } else {
                str = null;
            }
            String str5 = "unknown";
            if (str != null) {
                if (map == null || (obj = map.get("product_source")) == null) {
                    obj = EnumC62102cA.INVALIDATE_PRODUCT;
                }
                String str6 = data.product.productId;
                if (str6 != null) {
                    str5 = str6;
                }
                RecommendDaInfo recommendDaInfo = data.daInfo;
                if (recommendDaInfo != null) {
                    str3 = recommendDaInfo.recommendInfo;
                } else {
                    str3 = null;
                }
                InterfaceC71003Rtn LJIILIIL = C78948Uye.LJIILIIL(itemView2);
                if (LJIILIIL != null) {
                    laneParams = C78948Uye.LJIILJJIL(LJIILIIL, "lib_track_builtin_lane_business");
                } else {
                    laneParams = null;
                }
                C70101RfF c70101RfF = IPdpStarter.LIZ;
                IPdpStarter.PdpEnterParam pdpEnterParam = pdpViewModel.LJLJJLL;
                c70101RfF.getClass();
                int LIZIZ2 = C70101RfF.LIZIZ(pdpEnterParam);
                List<Object> newExpoList = pdpViewModel.ew0();
                List<Object> newClickList = pdpViewModel.Yv0(str5);
                IPdpStarter.PdpEnterParam pdpEnterParam2 = pdpViewModel.LJLJJLL;
                if (pdpEnterParam2 != null) {
                    hashMap = pdpEnterParam2.getTrackParams();
                } else {
                    hashMap = null;
                }
                IPdpStarter.PdpEnterParam pdpEnterParam3 = pdpViewModel.LJLJJLL;
                if (pdpEnterParam3 != null && (trackParams = pdpEnterParam3.getTrackParams()) != null) {
                    obj2 = trackParams.get("follow_status");
                } else {
                    obj2 = null;
                }
                Integer valueOf = Integer.valueOf(LIZIZ2);
                o.LJIIIZ(newExpoList, "newExpoList");
                o.LJIIIZ(newClickList, "newClickList");
                LinkedHashMap LIZIZ3 = JF1.LIZIZ("entrance_form", "horizontal_goods_card", "source_page_type", "pdp_shop_recommend");
                LIZIZ3.put("previous_page", "product_detail");
                LIZIZ3.put("follow_status", obj2);
                LIZIZ3.put("source_previous_page", "product_detail");
                LIZIZ3.put("product_source", obj);
                LIZIZ3.put("product_id", str5);
                if (LIZIZ == null) {
                    LIZIZ = "";
                }
                LIZIZ3.put("track_id", LIZIZ);
                if (str4 == null) {
                    str4 = "";
                }
                LIZIZ3.put("request_id", str4);
                if (laneParams != null) {
                    obj3 = laneParams.get((Object) "track_id");
                } else {
                    obj3 = null;
                }
                LIZIZ3.put("parent_track_id", obj3);
                if (laneParams != null) {
                    obj4 = laneParams.get((Object) "product_id");
                } else {
                    obj4 = null;
                }
                LIZIZ3.put("parent_product_id", obj4);
                if (laneParams != null) {
                    obj5 = laneParams.get((Object) "request_id");
                } else {
                    obj5 = null;
                }
                LIZIZ3.put("parent_request_id", obj5);
                if (hashMap == null || ((obj6 = hashMap.get("first_source_page")) == null && (obj6 = hashMap.get("source_page_type")) == null)) {
                    obj6 = "";
                }
                LIZIZ3.put("first_source_page", obj6);
                if (str3 == null) {
                    str3 = "";
                }
                LIZIZ3.put("rec_params", str3);
                LIZIZ3.put("expo_product_id_list", newExpoList);
                LIZIZ3.put("click_product_id_list", newClickList);
                Map LIZ2 = C27722AuM.LIZ(hashMap, valueOf, LIZIZ3);
                Context context = itemView2.getContext();
                o.LJIIIIZZ(context, "view.context");
                SmartRoute LIZIZ4 = C26867AgZ.LIZIZ(context, data.product.schema, C51029K0z.LJJIIZI(new OSZ("trackParams", LIZ2)), false);
                C79234V7u.LJJIJIIJIL(LIZIZ4, fragment, null);
                LIZIZ4.open();
                return;
            }
            HashMap hashMap2 = new HashMap();
            Product product2 = data.product;
            if (product2 != null && (str2 = product2.productId) != null) {
                str5 = str2;
            }
            hashMap2.put("product_id", str5);
            C78983UzD.LJIILLIIL("PdpViewModel_sameRecommend open pdp failed", hashMap2);
        }
    }

    public static final void LIZ$6(Au2S1S0301000_12 au2S1S0301000_12, View view) {
        String str;
        String str2;
        Object obj;
        String str3;
        Image image;
        List<String> urls;
        HashMap<String, Object> LJII;
        if (view != null) {
            FeedProduct feedProduct = ((Feed) au2S1S0301000_12.l0).product;
            if (feedProduct != null && (str = feedProduct.schema) != null) {
                C70208Rgy c70208Rgy = (C70208Rgy) au2S1S0301000_12.l1;
                PdpViewModel pdpViewModel = c70208Rgy.LJLJJI;
                View itemView = c70208Rgy.itemView;
                o.LJIIIIZZ(itemView, "itemView");
                EnumC69988RdQ enumC69988RdQ = EnumC69988RdQ.BUY_TOGETHER;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("product_id", ((Feed) au2S1S0301000_12.l0).product.id);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(((C70208Rgy) au2S1S0301000_12.l1).LJLJI.LIZIZ);
                LIZ.append('_');
                LIZ.append(au2S1S0301000_12.i3 + 1);
                linkedHashMap.put("track_id", X1D.LIZIZ(LIZ));
                linkedHashMap.put("request_id", ((C70208Rgy) au2S1S0301000_12.l1).LJLJI.LIZIZ);
                FeedExtra feedExtra = ((Feed) au2S1S0301000_12.l0).extra;
                String str4 = null;
                if (feedExtra != null) {
                    str2 = feedExtra.recommendInfo;
                } else {
                    str2 = null;
                }
                linkedHashMap.put("rec_params", str2);
                String str5 = ((Feed) au2S1S0301000_12.l0).product.logExtra;
                if (str5 != null && (LJII = C27739Aud.LJII(str5)) != null) {
                    obj = LJII.get("product_source");
                } else {
                    obj = null;
                }
                linkedHashMap.put("product_source", obj);
                FeedProduct feedProduct2 = ((Feed) au2S1S0301000_12.l0).product;
                String str6 = feedProduct2.title;
                Price price = (Price) au2S1S0301000_12.l2;
                if (price != null) {
                    str3 = price.minPrice;
                } else {
                    str3 = null;
                }
                List<Image> list = feedProduct2.images;
                if (list != null && (image = (Image) ORZ.LJLLLL(list)) != null && (urls = image.getUrls()) != null) {
                    str4 = (String) ORZ.LJLLLL(urls);
                }
                pdpViewModel.Iw0(itemView, enumC69988RdQ, str, linkedHashMap, new PdpPreviewInfo(str6, str3, str4, ((Feed) au2S1S0301000_12.l0).id, 0, 16, null));
            }
            C70208Rgy c70208Rgy2 = (C70208Rgy) au2S1S0301000_12.l1;
            C70120RfY c70120RfY = c70208Rgy2.LJLJI;
            InterfaceC71003Rtn interfaceC71003Rtn = c70208Rgy2.LJLILLLLZI;
            c70120RfY.getClass();
            C70120RfY.LIZIZ(interfaceC71003Rtn, "product_card");
            C70208Rgy c70208Rgy3 = (C70208Rgy) au2S1S0301000_12.l1;
            C70120RfY c70120RfY2 = c70208Rgy3.LJLJI;
            InterfaceC71003Rtn trackNode = c70208Rgy3.LJLILLLLZI;
            int i = au2S1S0301000_12.i3;
            Feed feedProduct3 = (Feed) au2S1S0301000_12.l0;
            c70120RfY2.getClass();
            o.LJIIIZ(trackNode, "trackNode");
            o.LJIIIZ(feedProduct3, "feedProduct");
            C78946Uyc.LJJII(trackNode, new C70912RsK(), new AqS61S0201000_12(c70120RfY2, feedProduct3, i, 18));
            C70208Rgy c70208Rgy4 = (C70208Rgy) au2S1S0301000_12.l1;
            C70120RfY c70120RfY3 = c70208Rgy4.LJLJI;
            InterfaceC71003Rtn trackNode2 = c70208Rgy4.LJLILLLLZI;
            int i2 = au2S1S0301000_12.i3;
            Feed feedProduct4 = (Feed) au2S1S0301000_12.l0;
            c70120RfY3.getClass();
            o.LJIIIZ(trackNode2, "trackNode");
            o.LJIIIZ(feedProduct4, "feedProduct");
            C78946Uyc.LJJII(trackNode2, new C70923RsV(0), new AqS61S0201000_12(c70120RfY3, feedProduct4, i2, 16));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$7(com.ss.android.ugc.aweme.utils.Au2S1S0301000_12 r12, android.view.View r13) {
        /*
            if (r13 == 0) goto Lb9
            java.lang.Object r0 = r12.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed) r0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FeedProduct r2 = r0.product
            java.lang.String r6 = "together_sku_select"
            r5 = 0
            if (r2 == 0) goto L91
            java.lang.Object r7 = r12.l1
            X.Rgy r7 = (X.C70208Rgy) r7
            com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r1 = r7.LJLJJI
            java.lang.Object r0 = r12.l2
            X.RYM r0 = (X.RYM) r0
            r4 = 0
            if (r0 == 0) goto Lbc
            java.lang.String[] r9 = r0.LIZ
            java.lang.Integer r0 = r0.LIZJ
            if (r0 == 0) goto Lbd
            int r11 = r0.intValue()
        L24:
            java.lang.String r8 = r2.skuSchema
            if (r8 == 0) goto L83
            com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam r0 = r1.LJLJJLL
            if (r0 == 0) goto Lba
            java.util.HashMap r0 = r0.getTrackParams()
            if (r0 == 0) goto Lba
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>(r0)
            java.lang.String r1 = "product_id"
            java.lang.String r0 = r2.id
            r10.put(r1, r0)
            java.lang.String r1 = "source_page_type"
            java.lang.String r0 = "buy_together"
            r10.put(r1, r0)
        L45:
            android.view.View r0 = r7.itemView
            android.content.Context r3 = r0.getContext()
            java.lang.String r0 = "itemView.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            if (r10 == 0) goto L5c
            java.lang.String r0 = "trackParams"
            r2.put(r0, r10)
        L5c:
            java.lang.String r1 = "need_request"
            java.lang.String r0 = "true"
            r2.put(r1, r0)
            if (r9 == 0) goto L6e
            java.lang.String r1 = X.C27739Aud.LJI(r9)
            java.lang.String r0 = "checked_spec_ids"
            r2.put(r0, r1)
        L6e:
            java.lang.String r1 = "quantity"
            java.lang.String r0 = java.lang.String.valueOf(r11)
            r2.put(r1, r0)
            com.bytedance.router.SmartRoute r1 = X.C26867AgZ.LIZIZ(r3, r8, r2, r5)
            X.Rtn r0 = r7.LJLILLLLZI
            X.C79234V7u.LJJIJIIJIL(r1, r0, r4)
            r1.open()
        L83:
            java.lang.Object r0 = r12.l1
            X.Rgy r0 = (X.C70208Rgy) r0
            X.RfY r1 = r0.LJLJI
            X.Rtn r0 = r0.LJLILLLLZI
            r1.getClass()
            X.C70120RfY.LIZIZ(r0, r6)
        L91:
            java.lang.Object r0 = r12.l1
            X.Rgy r0 = (X.C70208Rgy) r0
            X.RfY r1 = r0.LJLJI
            X.Rtn r4 = r0.LJLILLLLZI
            java.lang.Object r0 = r12.l2
            X.RYM r0 = (X.RYM) r0
            if (r0 == 0) goto La1
            boolean r5 = r0.LJFF
        La1:
            int r3 = r12.i3
            r1.getClass()
            java.lang.String r0 = "node"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            X.RsP r2 = new X.RsP
            r2.<init>()
            kotlin.jvm.internal.AqS0S1011000_12 r1 = new kotlin.jvm.internal.AqS0S1011000_12
            r0 = 2
            r1.<init>(r6, r5, r3, r0)
            X.C78946Uyc.LJJII(r4, r2, r1)
        Lb9:
            return
        Lba:
            r10 = r4
            goto L45
        Lbc:
            r9 = r4
        Lbd:
            r11 = 1
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.Au2S1S0301000_12.LIZ$7(com.ss.android.ugc.aweme.utils.Au2S1S0301000_12, android.view.View):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S1S0301000_12(Object obj, Object obj2, int i, Object obj3, int i2) {
        super(700L);
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i3 = i;
        this.l2 = obj3;
    }

    public Au2S1S0301000_12(AnchorPanelAdapter anchorPanelAdapter, View view, int i, ShopWindowAnchorModel shopWindowAnchorModel, int i2) {
        this.$t = i2;
        this.l0 = anchorPanelAdapter;
        this.l1 = view;
        this.i3 = i;
        this.l2 = shopWindowAnchorModel;
    }
}
