package kotlin.jvm.internal;

import X.ARI;
import X.ARN;
import X.AbstractC65781Prl;
import X.C113554cx;
import X.C27739Aud;
import X.C27943Axv;
import X.C70123Rfb;
import X.C70414RkI;
import X.C70666RoM;
import X.C70691Rol;
import X.C71633S9l;
import X.C76800UCe;
import X.C78685UuP;
import X.C79234V7u;
import X.FMX;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.Q8U;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.bnpl.BnplMiddleActivity;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewState;
import com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragmentV1;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.SizeChartTemplateEditViewModel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tikcast.api.anchor.AnchorLiveFragmentEditResponse;

/* loaded from: classes13.dex */
public class AqS53S1200000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj);
            case 17:
                return invoke$17(this, obj);
            case 18:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case 20:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case 24:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(ProductReviewState it) {
        String LIZIZ;
        Integer num;
        o.LJIIIZ(it, "it");
        if (C78685UuP.LJJJZ(this.s0)) {
            TextView textView = (TextView) ((ReviewFragmentV1) this.l1)._$_findCachedViewById(R.id.j0c);
            Integer num2 = (Integer) this.l2;
            if ((num2 == null || num2.intValue() != 0) && ((num = (Integer) this.l2) == null || num.intValue() != 1)) {
                String string = ((ReviewFragmentV1) this.l1).getString(R.string.fc2);
                o.LJIIIIZZ(string, "getString(R.string.ecom_pdp_reviews_count)");
                LIZIZ = Q8U.LIZIZ(new Object[]{this.s0}, 1, string, "format(format, *args)");
            } else {
                String string2 = ((ReviewFragmentV1) this.l1).getString(R.string.fc3);
                o.LJIIIIZZ(string2, "getString(R.string.ecom_pdp_reviews_count_1)");
                LIZIZ = Q8U.LIZIZ(new Object[]{(Integer) this.l2}, 1, string2, "format(format, *args)");
            }
            textView.setText(LIZIZ);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
    
        if (r3.LIZLLL(r1) == true) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AqS53S1200000_12 r5, java.lang.Object r6) {
        /*
            X.ARN r6 = (X.ARN) r6
            java.lang.String r0 = "it"
            X.7au r2 = X.C77339UWx.LJ(r6, r0)
            java.lang.Object r0 = r5.l1
            com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean r0 = (com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean) r0
            java.lang.String r1 = r0.id
            java.lang.String r0 = "prop_id"
            r2.LJIIIZ(r0, r1)
            java.lang.String r1 = "scene_id"
            java.lang.String r0 = "1001"
            r2.LJIIIZ(r1, r0)
            java.lang.String r1 = r5.s0
            java.lang.String r0 = "enter_from"
            r2.LJIIIZ(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "confirm_toast"
            X.FMX.LJIIL(r0, r1)
            java.lang.Object r4 = r5.l2
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r5 = r5.l1
            com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean r5 = (com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean) r5
            if (r4 != 0) goto L35
        L32:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L35:
            if (r5 != 0) goto L38
            goto L32
        L38:
            X.T5m r3 = X.C59854NeM.LIZ()
            r2 = 1
            if (r3 == 0) goto L4d
            java.lang.String r1 = r5.id
            java.lang.String r0 = "newFaceStickerBean.id"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            boolean r0 = r3.LIZLLL(r1)
            if (r0 != r2) goto L4d
            goto L32
        L4d:
            boolean r0 = X.C74077T5l.LIZ(r5)
            if (r0 != 0) goto L54
            goto L32
        L54:
            com.ss.android.ugc.aweme.sticker.model.CommerceSticker r0 = r5.commerceSticker
            if (r0 != 0) goto L59
            goto L32
        L59:
            com.ss.android.ugc.aweme.sticker.model.CommerceStickerUnlockInfo r3 = r0.getCommerceStickerUnlockInfo()
            if (r3 != 0) goto L60
            goto L32
        L60:
            X.T5m r1 = X.C59854NeM.LIZ()
            if (r1 == 0) goto L6f
            java.lang.String r0 = r3.openUrl
            boolean r0 = r1.LIZJ(r0)
            if (r0 != r2) goto L6f
            goto L32
        L6f:
            java.lang.String r2 = r3.webUrl
            java.lang.String r1 = r3.openUrl
            X.T5m r0 = X.C59854NeM.LIZ()
            if (r0 == 0) goto L94
            boolean r0 = r0.LIZ(r4, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L81:
            kotlin.jvm.internal.o.LJI(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L32
            X.T5m r0 = X.C59854NeM.LIZ()
            if (r0 == 0) goto L32
            r0.LIZIZ(r4, r2)
            goto L32
        L94:
            r0 = 0
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS53S1200000_12.invoke$0(kotlin.jvm.internal.AqS53S1200000_12, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AqS53S1200000_12 aqS53S1200000_12, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.eh2, new AqS53S1200000_12((Context) aqS53S1200000_12.l2, (NewFaceStickerBean) aqS53S1200000_12.l1, aqS53S1200000_12.s0, 0));
        actionGroup.LJIIIIZZ(R.string.cg_, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS53S1200000_12 aqS53S1200000_12, Object obj) {
        C71633S9l setState = (C71633S9l) obj;
        o.LJIIIZ(setState, "$this$setState");
        String str = aqS53S1200000_12.s0;
        SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel = (SizeChartTemplateEditViewModel) aqS53S1200000_12.l1;
        String str2 = ((C71633S9l) aqS53S1200000_12.l2).LJLJLLL;
        sizeChartTemplateEditViewModel.getClass();
        return C71633S9l.M(setState, null, null, null, null, null, null, null, str, null, null, null, false, false, false, SizeChartTemplateEditViewModel.gv0(str, str2), false, 49023);
    }

    public static final Object invoke$11(AqS53S1200000_12 aqS53S1200000_12, Object obj) {
        C71633S9l setState = (C71633S9l) obj;
        o.LJIIIZ(setState, "$this$setState");
        String str = aqS53S1200000_12.s0;
        SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel = (SizeChartTemplateEditViewModel) aqS53S1200000_12.l1;
        String str2 = ((C71633S9l) aqS53S1200000_12.l2).LJLLI;
        sizeChartTemplateEditViewModel.getClass();
        return C71633S9l.M(setState, null, null, null, null, null, null, null, null, null, str, null, false, false, false, false, SizeChartTemplateEditViewModel.gv0(str, str2), 32255);
    }

    public static final Object invoke$12(AqS53S1200000_12 aqS53S1200000_12, Object obj) {
        C71633S9l setState = (C71633S9l) obj;
        o.LJIIIZ(setState, "$this$setState");
        String str = aqS53S1200000_12.s0;
        SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel = (SizeChartTemplateEditViewModel) aqS53S1200000_12.l1;
        String str2 = ((C71633S9l) aqS53S1200000_12.l2).LJLILLLLZI;
        sizeChartTemplateEditViewModel.getClass();
        return C71633S9l.M(setState, null, null, str, null, null, null, null, null, null, null, null, SizeChartTemplateEditViewModel.gv0(str2, str), false, false, false, false, 63483);
    }

    public static final Object invoke$13(AqS53S1200000_12 aqS53S1200000_12, Object obj) {
        C71633S9l setState = (C71633S9l) obj;
        o.LJIIIZ(setState, "$this$setState");
        String str = aqS53S1200000_12.s0;
        SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel = (SizeChartTemplateEditViewModel) aqS53S1200000_12.l1;
        String str2 = ((C71633S9l) aqS53S1200000_12.l2).LJLJJI;
        sizeChartTemplateEditViewModel.getClass();
        return C71633S9l.M(setState, null, null, null, null, str, null, null, null, null, null, null, false, SizeChartTemplateEditViewModel.gv0(str2, str), false, false, false, 61423);
    }

    public static final Object invoke$14(AqS53S1200000_12 aqS53S1200000_12, Object obj) {
        C71633S9l setState = (C71633S9l) obj;
        o.LJIIIZ(setState, "$this$setState");
        String str = aqS53S1200000_12.s0;
        SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel = (SizeChartTemplateEditViewModel) aqS53S1200000_12.l1;
        String str2 = ((C71633S9l) aqS53S1200000_12.l2).LJLJJLL;
        sizeChartTemplateEditViewModel.getClass();
        return C71633S9l.M(setState, null, null, null, null, null, null, str, null, null, null, null, false, false, SizeChartTemplateEditViewModel.gv0(str2, str), false, false, 57279);
    }

    public static final Object invoke$15(AqS53S1200000_12 aqS53S1200000_12, Object obj) {
        C71633S9l setState = (C71633S9l) obj;
        o.LJIIIZ(setState, "$this$setState");
        String str = aqS53S1200000_12.s0;
        SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel = (SizeChartTemplateEditViewModel) aqS53S1200000_12.l1;
        String str2 = ((C71633S9l) aqS53S1200000_12.l2).LJLJLJ;
        sizeChartTemplateEditViewModel.getClass();
        return C71633S9l.M(setState, null, null, null, null, null, null, null, null, str, null, null, false, false, false, SizeChartTemplateEditViewModel.gv0(str2, str), false, 48895);
    }

    public static final Object invoke$16(AqS53S1200000_12 aqS53S1200000_12, Object obj) {
        C71633S9l setState = (C71633S9l) obj;
        o.LJIIIZ(setState, "$this$setState");
        String str = aqS53S1200000_12.s0;
        SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel = (SizeChartTemplateEditViewModel) aqS53S1200000_12.l1;
        String str2 = ((C71633S9l) aqS53S1200000_12.l2).LJLL;
        sizeChartTemplateEditViewModel.getClass();
        return C71633S9l.M(setState, null, null, null, null, null, null, null, null, null, null, str, false, false, false, false, SizeChartTemplateEditViewModel.gv0(str2, str), 31743);
    }

    public static final Object invoke$17(AqS53S1200000_12 aqS53S1200000_12, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        ((C70123Rfb) aqS53S1200000_12.l1).LIZIZ(logNode, (BundleInfo) aqS53S1200000_12.l2);
        C70123Rfb c70123Rfb = (C70123Rfb) aqS53S1200000_12.l1;
        BundleInfo bundleInfo = (BundleInfo) aqS53S1200000_12.l2;
        c70123Rfb.getClass();
        C70123Rfb.LIZ(logNode, bundleInfo);
        logNode.plusAssign("click_area", aqS53S1200000_12.s0);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$18(AqS53S1200000_12 aqS53S1200000_12, Object obj) {
        aqS53S1200000_12.invoke$0((ProductReviewState) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(AqS53S1200000_12 aqS53S1200000_12, Object obj) {
        int i;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("module_name", "size_fitness");
        logView.plusAssign("fitness_info", aqS53S1200000_12.s0);
        logView.plusAssign("review_cnt", Integer.valueOf(C70691Rol.LJIILLIIL));
        logView.plusAssign("page_name", "product_review");
        logView.plusAssign("previous_page", "product_detail");
        if (((Float) aqS53S1200000_12.l1) == null) {
            i = 0;
        } else {
            i = 1;
        }
        logView.plusAssign("has_rate", Integer.valueOf(i));
        logView.plusAssign("rate", (Float) aqS53S1200000_12.l1);
        logView.plusAssign("product_id", ((C70691Rol) aqS53S1200000_12.l2).LIZIZ);
        logView.plusAssign("biz_type", String.valueOf(((C70691Rol) aqS53S1200000_12.l2).LIZJ));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS53S1200000_12 aqS53S1200000_12, Object it) {
        o.LJIIIZ(it, "it");
        FMX.LJIIL("rd_pipo_middle_click", C113554cx.LJJLIIIIJ(new OSZ("bnpl_source_id", ((BnplMiddleActivity) aqS53S1200000_12.l1).LJLJJL), new OSZ("object_id", aqS53S1200000_12.s0), new OSZ("button_id", "retry")));
        ((InterfaceC88472Yns) aqS53S1200000_12.l2).invoke(it);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$20(AqS53S1200000_12 aqS53S1200000_12, Object obj) {
        int i;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("module_name", "size_fitness");
        logView.plusAssign("fitness_info", aqS53S1200000_12.s0);
        logView.plusAssign("review_cnt", Integer.valueOf(C70691Rol.LJIILLIIL));
        logView.plusAssign("page_name", "product_review");
        logView.plusAssign("previous_page", "product_detail");
        if (((Float) aqS53S1200000_12.l1) == null) {
            i = 0;
        } else {
            i = 1;
        }
        logView.plusAssign("has_rate", Integer.valueOf(i));
        logView.plusAssign("rate", (Float) aqS53S1200000_12.l1);
        logView.plusAssign("product_id", ((C70691Rol) aqS53S1200000_12.l2).LIZIZ);
        logView.plusAssign("biz_type", String.valueOf(((C70691Rol) aqS53S1200000_12.l2).LIZJ));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$21(AqS53S1200000_12 aqS53S1200000_12, Object obj) {
        LaneParams injectParamsToNode = (LaneParams) obj;
        o.LJIIIZ(injectParamsToNode, "$this$injectParamsToNode");
        injectParamsToNode.plusAssign("PREFETCH_RESULT", (ProductPackStruct) aqS53S1200000_12.l1);
        C79234V7u.LJJIJLIJ((Bundle) aqS53S1200000_12.l2, aqS53S1200000_12.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$22(AqS53S1200000_12 aqS53S1200000_12, Object obj) {
        LaneParams injectParamsToNode = (LaneParams) obj;
        o.LJIIIZ(injectParamsToNode, "$this$injectParamsToNode");
        injectParamsToNode.plusAssign("PREFETCH_RESULT", (ProductPackStruct) aqS53S1200000_12.l1);
        C79234V7u.LJJIJL((Intent) aqS53S1200000_12.l2, aqS53S1200000_12.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$23(AqS53S1200000_12 aqS53S1200000_12, Object obj) {
        FlashSale flashSale;
        String str;
        HashMap<String, Object> LJII;
        Object obj2;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(((C70414RkI) aqS53S1200000_12.l1).LIZIZ);
        ((C70414RkI) aqS53S1200000_12.l1).LIZJ(logNode);
        logNode.plusAssign("button_name", aqS53S1200000_12.s0);
        HashMap hashMap = (HashMap) aqS53S1200000_12.l2;
        if (hashMap != null) {
            logNode.compareTo(logNode, hashMap);
        }
        ProductPackStruct productPackStruct = ((C70414RkI) aqS53S1200000_12.l1).LJIIJJI;
        if (productPackStruct != null && (flashSale = productPackStruct.flashSale) != null && (str = flashSale.logExtra) != null && (LJII = C27739Aud.LJII(str)) != null && (obj2 = LJII.get("campaign_cost_role")) != null) {
            logNode.plusAssign("campaign_cost_role", obj2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$24(AqS53S1200000_12 aqS53S1200000_12, Object obj) {
        FlashSale flashSale;
        String str;
        HashMap<String, Object> LJII;
        Object obj2;
        C27943Axv sendLogReturnParams = (C27943Axv) obj;
        o.LJIIIZ(sendLogReturnParams, "$this$sendLogReturnParams");
        C27943Axv.LIZ(sendLogReturnParams, ((C70414RkI) aqS53S1200000_12.l1).LIZIZ);
        ((C70414RkI) aqS53S1200000_12.l1).LIZLLL(sendLogReturnParams);
        sendLogReturnParams.LIZJ("button_name", aqS53S1200000_12.s0);
        HashMap hashMap = (HashMap) aqS53S1200000_12.l2;
        if (hashMap != null) {
            C27943Axv.LIZ(sendLogReturnParams, hashMap);
        }
        ProductPackStruct productPackStruct = ((C70414RkI) aqS53S1200000_12.l1).LJIIJJI;
        if (productPackStruct != null && (flashSale = productPackStruct.flashSale) != null && (str = flashSale.logExtra) != null && (LJII = C27739Aud.LJII(str)) != null && (obj2 = LJII.get("campaign_cost_role")) != null) {
            sendLogReturnParams.LIZJ("campaign_cost_role", obj2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$25(AqS53S1200000_12 aqS53S1200000_12, Object obj) {
        FlashSale flashSale;
        String str;
        HashMap<String, Object> LJII;
        Object obj2;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(((C70414RkI) aqS53S1200000_12.l1).LIZIZ);
        ((C70414RkI) aqS53S1200000_12.l1).LIZJ(logNode);
        logNode.plusAssign("button_name", aqS53S1200000_12.s0);
        HashMap hashMap = (HashMap) aqS53S1200000_12.l2;
        if (hashMap != null) {
            logNode.compareTo(logNode, hashMap);
        }
        ProductPackStruct productPackStruct = ((C70414RkI) aqS53S1200000_12.l1).LJIIJJI;
        if (productPackStruct != null && (flashSale = productPackStruct.flashSale) != null && (str = flashSale.logExtra) != null && (LJII = C27739Aud.LJII(str)) != null && (obj2 = LJII.get("campaign_cost_role")) != null) {
            logNode.plusAssign("campaign_cost_role", obj2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$26(AqS53S1200000_12 aqS53S1200000_12, Object obj) {
        FlashSale flashSale;
        String str;
        HashMap<String, Object> LJII;
        Object obj2;
        C27943Axv sendLogReturnParams = (C27943Axv) obj;
        o.LJIIIZ(sendLogReturnParams, "$this$sendLogReturnParams");
        C27943Axv.LIZ(sendLogReturnParams, ((C70414RkI) aqS53S1200000_12.l1).LIZIZ);
        ((C70414RkI) aqS53S1200000_12.l1).LIZLLL(sendLogReturnParams);
        sendLogReturnParams.LIZJ("button_name", aqS53S1200000_12.s0);
        HashMap hashMap = (HashMap) aqS53S1200000_12.l2;
        if (hashMap != null) {
            C27943Axv.LIZ(sendLogReturnParams, hashMap);
        }
        ProductPackStruct productPackStruct = ((C70414RkI) aqS53S1200000_12.l1).LJIIJJI;
        if (productPackStruct != null && (flashSale = productPackStruct.flashSale) != null && (str = flashSale.logExtra) != null && (LJII = C27739Aud.LJII(str)) != null && (obj2 = LJII.get("campaign_cost_role")) != null) {
            sendLogReturnParams.LIZJ("campaign_cost_role", obj2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$27(AqS53S1200000_12 aqS53S1200000_12, Object obj) {
        ProductDetailReview productDetailReview;
        String str;
        ProductDetailReview productDetailReview2;
        List<ReviewItemStruct> list;
        String str2;
        String str3;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(((C70414RkI) aqS53S1200000_12.l1).LIZIZ);
        ProductPackStruct productPackStruct = ((C70414RkI) aqS53S1200000_12.l1).LJIIJJI;
        if (productPackStruct != null) {
            productDetailReview = productPackStruct.review;
        } else {
            productDetailReview = null;
        }
        C70414RkI.LJIILLIIL(logNode, productDetailReview);
        LaneParams laneParams = new LaneParams();
        C70666RoM.LJ(laneParams, (ReviewItemStruct) aqS53S1200000_12.l2, null);
        for (Map.Entry<String, Object> entry : laneParams.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                logNode.put(entry.getKey(), value);
            }
        }
        ProductPackStruct productPackStruct2 = ((C70414RkI) aqS53S1200000_12.l1).LJIIJJI;
        int i = 0;
        if (productPackStruct2 != null && (productDetailReview2 = productPackStruct2.review) != null && (list = productDetailReview2.reviewItems) != null) {
            ReviewItemStruct reviewItemStruct = (ReviewItemStruct) aqS53S1200000_12.l2;
            Iterator<ReviewItemStruct> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    ReviewItemStruct.MainReview mainReview = it.next().review;
                    if (mainReview != null) {
                        str2 = mainReview.reviewId;
                    } else {
                        str2 = null;
                    }
                    ReviewItemStruct.MainReview mainReview2 = reviewItemStruct.review;
                    if (mainReview2 != null) {
                        str3 = mainReview2.reviewId;
                    } else {
                        str3 = null;
                    }
                    if (o.LJ(str2, str3)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
        }
        logNode.plusAssign("rank", Integer.valueOf(i));
        C70414RkI c70414RkI = (C70414RkI) aqS53S1200000_12.l1;
        c70414RkI.getClass();
        if (c70414RkI.LJIJJ()) {
            str = "no_photo";
        } else {
            str = "has_photo";
        }
        logNode.plusAssign("review_show_type", str);
        logNode.plusAssign("click_area", aqS53S1200000_12.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$28(AqS53S1200000_12 aqS53S1200000_12, Object obj) {
        ProductDetailReview productDetailReview;
        String str;
        ProductDetailReview productDetailReview2;
        List<ReviewItemStruct> list;
        String str2;
        String str3;
        C27943Axv sendLogReturnParams = (C27943Axv) obj;
        o.LJIIIZ(sendLogReturnParams, "$this$sendLogReturnParams");
        C27943Axv.LIZ(sendLogReturnParams, ((C70414RkI) aqS53S1200000_12.l1).LIZIZ);
        ProductPackStruct productPackStruct = ((C70414RkI) aqS53S1200000_12.l1).LJIIJJI;
        if (productPackStruct != null) {
            productDetailReview = productPackStruct.review;
        } else {
            productDetailReview = null;
        }
        C70414RkI.LJIIZILJ(sendLogReturnParams, productDetailReview);
        LaneParams laneParams = new LaneParams();
        C70666RoM.LJ(laneParams, (ReviewItemStruct) aqS53S1200000_12.l2, null);
        for (Map.Entry<String, Object> entry : laneParams.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                sendLogReturnParams.LIZLLL(entry.getKey(), value);
            }
        }
        ProductPackStruct productPackStruct2 = ((C70414RkI) aqS53S1200000_12.l1).LJIIJJI;
        int i = 0;
        if (productPackStruct2 != null && (productDetailReview2 = productPackStruct2.review) != null && (list = productDetailReview2.reviewItems) != null) {
            ReviewItemStruct reviewItemStruct = (ReviewItemStruct) aqS53S1200000_12.l2;
            Iterator<ReviewItemStruct> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    ReviewItemStruct.MainReview mainReview = it.next().review;
                    if (mainReview != null) {
                        str2 = mainReview.reviewId;
                    } else {
                        str2 = null;
                    }
                    ReviewItemStruct.MainReview mainReview2 = reviewItemStruct.review;
                    if (mainReview2 != null) {
                        str3 = mainReview2.reviewId;
                    } else {
                        str3 = null;
                    }
                    if (o.LJ(str2, str3)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
        }
        sendLogReturnParams.LIZJ("rank", Integer.valueOf(i));
        C70414RkI c70414RkI = (C70414RkI) aqS53S1200000_12.l1;
        c70414RkI.getClass();
        if (c70414RkI.LJIJJ()) {
            str = "no_photo";
        } else {
            str = "has_photo";
        }
        sendLogReturnParams.LIZJ("review_show_type", str);
        sendLogReturnParams.LIZJ("click_area", aqS53S1200000_12.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS53S1200000_12 aqS53S1200000_12, Object it) {
        o.LJIIIZ(it, "it");
        FMX.LJIIL("rd_pipo_middle_click", C113554cx.LJJLIIIIJ(new OSZ("bnpl_source_id", ((BnplMiddleActivity) aqS53S1200000_12.l1).LJLJJL), new OSZ("object_id", aqS53S1200000_12.s0), new OSZ("button_id", "cancel")));
        ((InterfaceC88472Yns) aqS53S1200000_12.l2).invoke(it);
        ((BnplMiddleActivity) aqS53S1200000_12.l1).finish();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS53S1200000_12 aqS53S1200000_12, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.p4d, new AqS13S2200000_12((View) aqS53S1200000_12.l1, "aweme://lynxview?channel=tea_selection_page&bundle=searchpage%2Ftemplate.js&surl=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2F8%2Fgecko%2Fresource%2Ftea_selection_page%2Fsearchpage%2Ftemplate.js&use_gecko_first=1&dynamic=1&hide_nav_bar=1&trans_status_bar=1&status_bar_color=00000000&use_bdx=1&source_page_type=show_window", aqS53S1200000_12.s0, (PdpViewModel) aqS53S1200000_12.l2, 1));
        actionGroup.LJIIIIZZ(R.string.p4e, new AqS178S0100000_12((PdpViewModel) aqS53S1200000_12.l2, UserLevelGeckoUpdateSetting.DEFAULT));
        actionGroup.LJI = true;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS53S1200000_12 aqS53S1200000_12, Object obj) {
        long j;
        AnchorLiveFragmentEditResponse it = (AnchorLiveFragmentEditResponse) obj;
        o.LJIIIZ(it, "it");
        Map<OSZ<Long, Long>, Long> map = ((LiveReplayVideoClipActivity) aqS53S1200000_12.l1).LJZL;
        OSZ<Long, Long> osz = (OSZ) aqS53S1200000_12.l2;
        AnchorLiveFragmentEditResponse.ResponseData responseData = it.data;
        if (responseData != null) {
            j = responseData.fragmentId;
        } else {
            j = 0;
        }
        map.put(osz, Long.valueOf(j));
        LiveReplayVideoClipActivity liveReplayVideoClipActivity = (LiveReplayVideoClipActivity) aqS53S1200000_12.l1;
        AqS178S0100000_12 aqS178S0100000_12 = liveReplayVideoClipActivity.LLF;
        String string = liveReplayVideoClipActivity.getString(R.string.nx0);
        o.LJIIIIZZ(string, "getString(R.string.pm_re…teClipPage_clipSaveToast)");
        aqS178S0100000_12.invoke(string);
        ((LiveReplayVideoClipActivity) aqS53S1200000_12.l1).LLIL(CardStruct.IStatusCode.DEFAULT, aqS53S1200000_12.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS53S1200000_12 aqS53S1200000_12, Object obj) {
        SkuState setState = (SkuState) obj;
        o.LJIIIZ(setState, "$this$setState");
        ((SkuPanelViewModel) aqS53S1200000_12.l1).LLFZ = (Integer) aqS53S1200000_12.l2;
        return SkuState.copy$default(setState, null, null, null, null, null, null, null, null, aqS53S1200000_12.s0, null, null, null, null, null, null, 0, null, null, false, null, null, null, false, null, null, null, false, null, null, null, null, 2147483391, null);
    }

    public static final Object invoke$7(AqS53S1200000_12 aqS53S1200000_12, Object obj) {
        C71633S9l setState = (C71633S9l) obj;
        o.LJIIIZ(setState, "$this$setState");
        String str = aqS53S1200000_12.s0;
        SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel = (SizeChartTemplateEditViewModel) aqS53S1200000_12.l1;
        String str2 = ((C71633S9l) aqS53S1200000_12.l2).LJLJI;
        sizeChartTemplateEditViewModel.getClass();
        return C71633S9l.M(setState, null, str, null, null, null, null, null, null, null, null, null, SizeChartTemplateEditViewModel.gv0(str, str2), false, false, false, false, 63485);
    }

    public static final Object invoke$8(AqS53S1200000_12 aqS53S1200000_12, Object obj) {
        C71633S9l setState = (C71633S9l) obj;
        o.LJIIIZ(setState, "$this$setState");
        String str = aqS53S1200000_12.s0;
        SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel = (SizeChartTemplateEditViewModel) aqS53S1200000_12.l1;
        String str2 = ((C71633S9l) aqS53S1200000_12.l2).LJLJJL;
        sizeChartTemplateEditViewModel.getClass();
        return C71633S9l.M(setState, null, null, null, str, null, null, null, null, null, null, null, false, SizeChartTemplateEditViewModel.gv0(str, str2), false, false, false, 61431);
    }

    public static final Object invoke$9(AqS53S1200000_12 aqS53S1200000_12, Object obj) {
        C71633S9l setState = (C71633S9l) obj;
        o.LJIIIZ(setState, "$this$setState");
        String str = aqS53S1200000_12.s0;
        SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel = (SizeChartTemplateEditViewModel) aqS53S1200000_12.l1;
        String str2 = ((C71633S9l) aqS53S1200000_12.l2).LJLJL;
        sizeChartTemplateEditViewModel.getClass();
        return C71633S9l.M(setState, null, null, null, null, null, str, null, null, null, null, null, false, false, SizeChartTemplateEditViewModel.gv0(str, str2), false, false, 57311);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS53S1200000_12(C70414RkI c70414RkI, HashMap hashMap, int i) {
        super(1);
        this.$t = i;
        this.l1 = c70414RkI;
        this.s0 = "remind";
        this.l2 = hashMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS53S1200000_12(C70123Rfb c70123Rfb, BundleInfo bundleInfo, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c70123Rfb;
        this.l2 = bundleInfo;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS53S1200000_12(C70414RkI c70414RkI, ReviewItemStruct reviewItemStruct, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c70414RkI;
        this.l2 = reviewItemStruct;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS53S1200000_12(Context context, NewFaceStickerBean newFaceStickerBean, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = newFaceStickerBean;
        this.s0 = str;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS53S1200000_12(View view, String str, PdpViewModel pdpViewModel, int i) {
        super(1);
        this.$t = i;
        this.l1 = view;
        this.s0 = str;
        this.l2 = pdpViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS53S1200000_12(BnplMiddleActivity bnplMiddleActivity, BnplMiddleActivity bnplMiddleActivity2, String str, InterfaceC88472Yns<? super ARN, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.$t = interfaceC88472Yns;
        this.l1 = bnplMiddleActivity;
        this.s0 = bnplMiddleActivity2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS53S1200000_12(ProductPackStruct productPackStruct, Intent intent, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = productPackStruct;
        this.l2 = intent;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS53S1200000_12(ProductPackStruct productPackStruct, Bundle bundle, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = productPackStruct;
        this.l2 = bundle;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS53S1200000_12(SkuPanelViewModel skuPanelViewModel, Integer num, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = skuPanelViewModel;
        this.l2 = num;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS53S1200000_12(LiveReplayVideoClipActivity liveReplayVideoClipActivity, LiveReplayVideoClipActivity liveReplayVideoClipActivity2, OSZ<Long, Long> osz, String str) {
        super(1);
        this.$t = str;
        this.l1 = liveReplayVideoClipActivity;
        this.l2 = liveReplayVideoClipActivity2;
        this.s0 = osz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS53S1200000_12(String str, ReviewFragmentV1 reviewFragmentV1, Integer num, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = reviewFragmentV1;
        this.l2 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS53S1200000_12(String str, SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel, C71633S9l c71633S9l, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = sizeChartTemplateEditViewModel;
        this.l2 = c71633S9l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS53S1200000_12(String str, Float f, C70691Rol c70691Rol, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = f;
        this.l2 = c70691Rol;
    }
}
