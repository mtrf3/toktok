package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C68322mC;
import X.C70123Rfb;
import X.C70297RiP;
import X.C76800UCe;
import X.EnumC46510INe;
import X.FII;
import X.InterfaceC88472Yns;
import X.RVL;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemResult;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.payment.PdpPaymentModuleViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BnplInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundlePrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleProduct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleSku;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Product;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecommendDaInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public class AqS32S0301000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AqS32S0301000_12 aqS32S0301000_12, Object obj) {
        boolean z;
        String str;
        List<InstallmentPlan> list;
        HashMap logView = (HashMap) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.put("module_name", "tiktok_paylater");
        BnplInfo bnplInfo = ((RVL) ((PdpPaymentModuleViewHolder) aqS32S0301000_12.l0).getItem()).LIZ;
        if (bnplInfo != null) {
            z = o.LJ(bnplInfo.isAuth, Boolean.TRUE);
        } else {
            z = false;
        }
        if (!z) {
            logView.put("module_type", "register");
        } else {
            logView.put("module_type", "select");
            BnplInfo bnplInfo2 = ((RVL) ((PdpPaymentModuleViewHolder) aqS32S0301000_12.l0).getItem()).LIZ;
            if (bnplInfo2 != null && (list = bnplInfo2.installmentPlans) != null) {
                logView.put("module_option_cnt", Integer.valueOf(list.size()));
            }
            logView.put("rank", Integer.valueOf(aqS32S0301000_12.i3));
            logView.put("installment_cnt", ((InstallmentPlan) aqS32S0301000_12.l1).tenure);
            logView.put("total_payment", ((InstallmentPlan) aqS32S0301000_12.l1).extraDescription);
            Amount amount = ((InstallmentPlan) aqS32S0301000_12.l1).totalRepayment;
            String str2 = null;
            if (amount != null) {
                str = amount.priceStr;
            } else {
                str = null;
            }
            logView.put("service_fee", str);
            Amount amount2 = ((InstallmentPlan) aqS32S0301000_12.l1).totalRepayment;
            if (amount2 != null) {
                str2 = amount2.currency;
            }
            logView.put("currency", str2);
            logView.put("click_type", ((C68322mC) aqS32S0301000_12.l2).element);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS32S0301000_12 aqS32S0301000_12, Object obj) {
        String str;
        HashMap logView = (HashMap) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.put("module_name", "tiktok_paylater");
        if (!o.LJ(((BnplInfo) aqS32S0301000_12.l0).isAuth, Boolean.TRUE)) {
            logView.put("module_type", "register");
        } else {
            logView.put("module_type", "select");
            logView.put("module_option_cnt", Integer.valueOf(((BnplInfo) aqS32S0301000_12.l0).installmentPlans.size()));
            logView.put("rank", Integer.valueOf(aqS32S0301000_12.i3));
            logView.put("installment_cnt", ((InstallmentPlan) aqS32S0301000_12.l1).tenure);
            logView.put("total_payment", ((InstallmentPlan) aqS32S0301000_12.l1).extraDescription);
            Amount amount = ((InstallmentPlan) aqS32S0301000_12.l1).totalRepayment;
            String str2 = null;
            if (amount != null) {
                str = amount.priceStr;
            } else {
                str = null;
            }
            logView.put("service_fee", str);
            Amount amount2 = ((InstallmentPlan) aqS32S0301000_12.l1).totalRepayment;
            if (amount2 != null) {
                str2 = amount2.currency;
            }
            logView.put("currency", str2);
            logView.put("click_type", ((C68322mC) aqS32S0301000_12.l2).element);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS32S0301000_12 aqS32S0301000_12, Object obj) {
        String str;
        Object obj2;
        Object obj3;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("request_id", ((C70297RiP) aqS32S0301000_12.l0).LJLJJI);
        logView.plusAssign("source_page_type", "pdp_shop_recommend");
        logView.plusAssign("entrance_form", "horizontal_goods_card");
        FII.LIZIZ(aqS32S0301000_12.i3, 1, logView, "item_order");
        RecommendDaInfo recommendDaInfo = ((ProductData) aqS32S0301000_12.l1).daInfo;
        String str2 = null;
        if (recommendDaInfo != null) {
            str = recommendDaInfo.recommendInfo;
        } else {
            str = null;
        }
        logView.plusAssign("rec_params", str);
        Map map = (Map) aqS32S0301000_12.l2;
        if (map != null) {
            obj2 = map.get("product_source");
        } else {
            obj2 = null;
        }
        logView.plusAssign("product_source", obj2);
        Map map2 = (Map) aqS32S0301000_12.l2;
        if (map2 != null) {
            obj3 = map2.get("sales_price");
        } else {
            obj3 = null;
        }
        logView.plusAssign("sales_price", obj3);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(((C70297RiP) aqS32S0301000_12.l0).LJLJJI);
        LIZ.append('_');
        LIZ.append(aqS32S0301000_12.i3 + 1);
        logView.plusAssign("track_id", X1D.LIZIZ(LIZ));
        Product product = ((ProductData) aqS32S0301000_12.l1).product;
        if (product != null) {
            str2 = product.productId;
        }
        logView.plusAssign("product_id", str2);
        logView.plusAssign("source_page_type", "pdp_shop_recommend");
        logView.plusAssign("entrance_info", "");
        logView.plusAssign("original_price", "");
        logView.plusAssign("sale_price", "");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS32S0301000_12 aqS32S0301000_12, Object obj) {
        Object obj2;
        Object obj3;
        String str;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("request_id", ((C70297RiP) aqS32S0301000_12.l0).LJLJJI);
        logNode.plusAssign("source_page_type", "pdp_shop_recommend");
        logNode.plusAssign("entrance_form", "horizontal_goods_card");
        FII.LIZIZ(aqS32S0301000_12.i3, 1, logNode, "item_order");
        Map map = (Map) aqS32S0301000_12.l1;
        String str2 = null;
        if (map != null) {
            obj2 = map.get("product_source");
        } else {
            obj2 = null;
        }
        logNode.plusAssign("product_source", obj2);
        Map map2 = (Map) aqS32S0301000_12.l1;
        if (map2 != null) {
            obj3 = map2.get("sales_price");
        } else {
            obj3 = null;
        }
        logNode.plusAssign("sales_price", obj3);
        RecommendDaInfo recommendDaInfo = ((ProductData) aqS32S0301000_12.l2).daInfo;
        if (recommendDaInfo != null) {
            str = recommendDaInfo.recommendInfo;
        } else {
            str = null;
        }
        logNode.plusAssign("rec_params", str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(((C70297RiP) aqS32S0301000_12.l0).LJLJJI);
        LIZ.append('_');
        LIZ.append(aqS32S0301000_12.i3 + 1);
        logNode.plusAssign("track_id", X1D.LIZIZ(LIZ));
        Product product = ((ProductData) aqS32S0301000_12.l2).product;
        if (product != null) {
            str2 = product.productId;
        }
        logNode.plusAssign("product_id", str2);
        logNode.plusAssign("source_page_type", "pdp_shop_recommend");
        logNode.plusAssign("entrance_info", "");
        logNode.plusAssign("original_price", "");
        logNode.plusAssign("sale_price", "");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS32S0301000_12 aqS32S0301000_12, Object obj) {
        String str;
        String str2;
        String str3;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        ((C70123Rfb) aqS32S0301000_12.l0).LIZIZ(logNode, (BundleInfo) aqS32S0301000_12.l1);
        C70123Rfb c70123Rfb = (C70123Rfb) aqS32S0301000_12.l0;
        BundleInfo bundleInfo = (BundleInfo) aqS32S0301000_12.l1;
        c70123Rfb.getClass();
        C70123Rfb.LIZ(logNode, bundleInfo);
        logNode.plusAssign("cart_form", "add_to_cart");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder();
        List<BundleProduct> list = ((BundleInfo) aqS32S0301000_12.l1).productList;
        if (list != null) {
            for (BundleProduct bundleProduct : list) {
                sb.append(bundleProduct.productId);
                sb.append(",");
                BundleSku bundleSku = bundleProduct.selectedSku;
                String str4 = null;
                if (bundleSku != null) {
                    str2 = bundleSku.skuId;
                } else {
                    str2 = null;
                }
                sb2.append(str2);
                sb2.append(",");
                BundlePrice bundlePrice = bundleProduct.productPrice;
                if (bundlePrice != null) {
                    str3 = bundlePrice.originalPrice;
                } else {
                    str3 = null;
                }
                sb3.append(str3);
                sb3.append(",");
                BundlePrice bundlePrice2 = bundleProduct.productPrice;
                if (bundlePrice2 != null) {
                    str4 = bundlePrice2.realPrice;
                }
                sb4.append(str4);
                sb4.append(",");
                sb5.append(bundleProduct.productSource);
                sb5.append(",");
            }
        }
        logNode.plusAssign("product_id", sb);
        logNode.plusAssign("sku_id", sb2);
        logNode.plusAssign("product_source", sb5);
        logNode.plusAssign("is_single_sku", "1");
        logNode.plusAssign("source_page_type", "bundle_deal");
        logNode.plusAssign("original_price", sb3);
        logNode.plusAssign("sale_price", sb4);
        logNode.plusAssign("add_sku_num", 1);
        logNode.plusAssign("sku_num_before", ((AddItemResult) aqS32S0301000_12.l2).preSkuCount);
        logNode.plusAssign("sku_num_after", ((AddItemResult) aqS32S0301000_12.l2).postSkuCount);
        logNode.plusAssign("cart_item_id", ((AddItemResult) aqS32S0301000_12.l2).cartItemId);
        int i = aqS32S0301000_12.i3;
        if (i != 0) {
            str = String.valueOf(i);
        } else {
            str = "";
        }
        logNode.plusAssign("fail_reason", str);
        Integer num = ((AddItemResult) aqS32S0301000_12.l2).result;
        int value = EnumC46510INe.NORMAL_ADD_SUCCESS.getValue();
        if (num != null && num.intValue() == value) {
            logNode.plusAssign("bundle_add_fail_reason", "promotion_expired");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS32S0301000_12 aqS32S0301000_12, Object obj) {
        Object obj2;
        HashMap<String, Object> trackParams;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        ((C70123Rfb) aqS32S0301000_12.l0).LIZIZ(logNode, (BundleInfo) aqS32S0301000_12.l1);
        C70123Rfb c70123Rfb = (C70123Rfb) aqS32S0301000_12.l0;
        BundleInfo bundleInfo = (BundleInfo) aqS32S0301000_12.l1;
        c70123Rfb.getClass();
        C70123Rfb.LIZ(logNode, bundleInfo);
        ((C70123Rfb) aqS32S0301000_12.l0).LIZJ(logNode, (BundleProduct) aqS32S0301000_12.l2, aqS32S0301000_12.i3);
        logNode.plusAssign("parent_product_id", ((C70123Rfb) aqS32S0301000_12.l0).LIZ.jw0());
        logNode.plusAssign("source_page_type", "bundle_deal");
        logNode.plusAssign("entrance_form", "horizontal_goods_card");
        IPdpStarter.PdpEnterParam pdpEnterParam = ((C70123Rfb) aqS32S0301000_12.l0).LIZ.LJLJJLL;
        if (pdpEnterParam == null || (trackParams = pdpEnterParam.getTrackParams()) == null || (obj2 = trackParams.get("source_page_type")) == null) {
            obj2 = "";
        }
        logNode.plusAssign("first_source_page", obj2);
        FII.LIZIZ(aqS32S0301000_12.i3, 1, logNode, "item_order");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS32S0301000_12 aqS32S0301000_12, Object obj) {
        Object obj2;
        HashMap<String, Object> trackParams;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        ((C70123Rfb) aqS32S0301000_12.l0).LIZIZ(logNode, (BundleInfo) aqS32S0301000_12.l1);
        C70123Rfb c70123Rfb = (C70123Rfb) aqS32S0301000_12.l0;
        BundleInfo bundleInfo = (BundleInfo) aqS32S0301000_12.l1;
        c70123Rfb.getClass();
        C70123Rfb.LIZ(logNode, bundleInfo);
        ((C70123Rfb) aqS32S0301000_12.l0).LIZJ(logNode, (BundleProduct) aqS32S0301000_12.l2, aqS32S0301000_12.i3);
        logNode.plusAssign("parent_product_id", ((C70123Rfb) aqS32S0301000_12.l0).LIZ.jw0());
        logNode.plusAssign("entrance_form", "horizontal_goods_card");
        logNode.plusAssign("source_page_type", "bundle_deal");
        IPdpStarter.PdpEnterParam pdpEnterParam = ((C70123Rfb) aqS32S0301000_12.l0).LIZ.LJLJJLL;
        if (pdpEnterParam == null || (trackParams = pdpEnterParam.getTrackParams()) == null || (obj2 = trackParams.get("source_page_type")) == null) {
            obj2 = "";
        }
        logNode.plusAssign("first_source_page", obj2);
        FII.LIZIZ(aqS32S0301000_12.i3, 1, logNode, "item_order");
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS32S0301000_12(int r3, X.C70297RiP r4, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductData r5, java.util.Map r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            switch(r7) {
                case 2: goto L13;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.i3 = r3
            r1.l1 = r6
            r1.l2 = r5
            r0 = 1
        Lf:
            r1.<init>(r0)
            return
        L13:
            r1 = r2
            r1.l0 = r4
            r1.i3 = r3
            r1.l1 = r5
            r1.l2 = r6
            r0 = 1
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS32S0301000_12.<init>(int, X.RiP, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductData, java.util.Map, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS32S0301000_12(C70123Rfb c70123Rfb, BundleInfo bundleInfo, AddItemResult addItemResult, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c70123Rfb;
        this.l1 = bundleInfo;
        this.l2 = addItemResult;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS32S0301000_12(C70123Rfb c70123Rfb, BundleInfo bundleInfo, BundleProduct bundleProduct, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c70123Rfb;
        this.l1 = bundleInfo;
        this.l2 = bundleProduct;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS32S0301000_12(PdpPaymentModuleViewHolder pdpPaymentModuleViewHolder, PdpPaymentModuleViewHolder pdpPaymentModuleViewHolder2, int i, InstallmentPlan installmentPlan, C68322mC<String> c68322mC) {
        super(1);
        this.$t = c68322mC;
        this.l0 = pdpPaymentModuleViewHolder;
        this.i3 = pdpPaymentModuleViewHolder2;
        this.l1 = i;
        this.l2 = installmentPlan;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS32S0301000_12(BnplInfo bnplInfo, BnplInfo bnplInfo2, int i, InstallmentPlan installmentPlan, C68322mC<String> c68322mC) {
        super(1);
        this.$t = c68322mC;
        this.l0 = bnplInfo;
        this.i3 = bnplInfo2;
        this.l1 = i;
        this.l2 = installmentPlan;
    }
}
