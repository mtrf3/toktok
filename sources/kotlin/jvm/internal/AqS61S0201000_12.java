package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractC73638SvC;
import X.C113724dE;
import X.C1GE;
import X.C27943Axv;
import X.C27959AyB;
import X.C69698RXa;
import X.C70120RfY;
import X.C70649Ro5;
import X.C70714Rp8;
import X.C71094RvG;
import X.C71360RzY;
import X.C71791SFn;
import X.C73318Sq2;
import X.C76732zl;
import X.C76800UCe;
import X.C78880UxY;
import X.EQM;
import X.EnumC44267HYx;
import X.EnumC74442TJm;
import X.FII;
import X.InterfaceC46204IBk;
import X.InterfaceC64592gB;
import X.InterfaceC71794SFq;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.RVL;
import X.TIF;
import X.X1D;
import X.XKX;
import Y.AfS53S0100000_1;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.payment.PdpPaymentModuleViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BnplInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelCounterWidget;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomAddressInterceptor;
import com.ss.android.ugc.aweme.ecommerce.model.CommonVideoAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public class AqS61S0201000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AqS61S0201000_12 aqS61S0201000_12, Object obj) {
        Integer num;
        List<InstallmentPlan> list;
        HashMap logWhenShow = (HashMap) obj;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        logWhenShow.put("parent_option_name", "tiktok_paylater");
        logWhenShow.put("option_name", "tiktok_paylater_installment");
        logWhenShow.put("option_type", "sub_payment_type");
        logWhenShow.put("rank", Integer.valueOf(aqS61S0201000_12.i2));
        BnplInfo bnplInfo = ((RVL) ((PdpPaymentModuleViewHolder) aqS61S0201000_12.l0).getItem()).LIZ;
        String str = null;
        if (bnplInfo != null && (list = bnplInfo.installmentPlans) != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        logWhenShow.put("installment_cnt", num);
        Amount amount = ((InstallmentPlan) aqS61S0201000_12.l1).totalRepayment;
        if (amount != null) {
            str = amount.priceStr;
        }
        logWhenShow.put("service_fee", str);
        logWhenShow.put("total_payment", ((InstallmentPlan) aqS61S0201000_12.l1).extraDescription);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS61S0201000_12 aqS61S0201000_12, Object it) {
        String str;
        String str2;
        o.LJIIIZ(it, "it");
        SkuPanelBottomWidget skuPanelBottomWidget = (SkuPanelBottomWidget) aqS61S0201000_12.l0;
        C113724dE c113724dE = skuPanelBottomWidget.buyNowBtn;
        String str3 = null;
        if (c113724dE != null) {
            int i = skuPanelBottomWidget.clickFrom;
            if (i == 3) {
                str3 = skuPanelBottomWidget.getContainer().getContext().getString(R.string.f4y);
            } else if (i == 10) {
                str3 = skuPanelBottomWidget.getContainer().getContext().getString(R.string.q1w);
            } else {
                int i2 = aqS61S0201000_12.i2;
                if (i2 > 1) {
                    BuyButton buyButton = (BuyButton) aqS61S0201000_12.l1;
                    if (buyButton != null && (str2 = buyButton.desc) != null) {
                        str3 = ujb.o.LJJJJZ(str2, "{{number}}", String.valueOf(i2), false);
                    }
                } else {
                    BuyButton buyButton2 = (BuyButton) aqS61S0201000_12.l1;
                    if (buyButton2 != null && (str = buyButton2.default_desc) != null) {
                        str3 = ujb.o.LJJJJZ(str, "{{number}}", String.valueOf(i2), false);
                    } else {
                        str3 = skuPanelBottomWidget.getContainer().getContext().getString(R.string.f4y);
                        o.LJIIIIZZ(str3, "container.context.getStr…shop_promo_sheet_btn_cfm)");
                    }
                }
            }
            c113724dE.setText(str3);
            return C76800UCe.LIZ;
        }
        o.LJIJI("buyNowBtn");
        throw null;
    }

    public static final Object invoke$10(AqS61S0201000_12 aqS61S0201000_12, Object obj) {
        String productId;
        HashMap logView = (HashMap) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.put("button_name", "minus_num");
        SkuItem skuItem = ((SkuPanelCounterWidget) aqS61S0201000_12.l0).getMViewModel().LLFF;
        if (skuItem != null) {
            logView.put("sku_id", skuItem.skuId);
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams = ((SkuPanelCounterWidget) aqS61S0201000_12.l0).getMViewModel().LJLLJ;
        if (skuEnterParams != null && (productId = skuEnterParams.getProductId()) != null) {
            logView.put("product_id", productId);
        }
        logView.put("num_before", Integer.valueOf(aqS61S0201000_12.i2));
        logView.put("num_after", Integer.valueOf(((C76732zl) aqS61S0201000_12.l1).element));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS61S0201000_12 aqS61S0201000_12, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        HashMap<String, Object> hashMap = ((C71094RvG) aqS61S0201000_12.l0).LIZ.LLIL;
        if (hashMap != null) {
            sendLog.LJ(hashMap);
        }
        sendLog.LIZJ("EVENT_ORIGIN_FEATURE", "TEMAI");
        sendLog.LIZJ("page_name", "order_submit");
        sendLog.LIZJ("toast_name", "discount_quantity_limitation");
        sendLog.LIZJ("quantity_limit", Integer.valueOf(aqS61S0201000_12.i2));
        String str = ((C27959AyB) aqS61S0201000_12.l1).LJIL;
        if (str != null) {
            sendLog.LIZJ("product_id", str);
        }
        String str2 = ((C27959AyB) aqS61S0201000_12.l1).LIZ;
        if (str2 != null) {
            sendLog.LIZJ("sku_id", str2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS61S0201000_12 aqS61S0201000_12, Object it) {
        AbstractC73638SvC LJIIIIZZ;
        o.LJIIIZ(it, "it");
        C78880UxY.LJJLIIIJL("confirm_mobile_effect_delete", ((EffectTemplateCategoryFragment) aqS61S0201000_12.l0).wl((Effect) aqS61S0201000_12.l1));
        MyEffectsViewModel Gl = ((EffectTemplateCategoryFragment) aqS61S0201000_12.l0).Gl();
        Effect effect = (Effect) aqS61S0201000_12.l1;
        int i = aqS61S0201000_12.i2;
        Gl.getClass();
        o.LJIIIZ(effect, "effect");
        OSZ<Effect, Integer> osz = new OSZ<>(effect, Integer.valueOf(i));
        if (Gl.hv0(effect, false)) {
            InterfaceC46204IBk interfaceC46204IBk = Gl.LJLL;
            EnumC44267HYx requestSource = EnumC44267HYx.UI_CLICK;
            o.LJIIIZ(requestSource, "requestSource");
            interfaceC46204IBk.LIZJ(new TIF(effect, i, requestSource, null));
        }
        Gl.LJLLLLLL.setValue(osz);
        if (effect instanceof DraftEffect) {
            Gl.nv0((DraftEffect) effect);
        } else {
            XKX.LIZLLL(ViewModelKt.getViewModelScope(Gl), null, null, new EQM(effect, Gl, osz, null), 3);
            C73318Sq2 c73318Sq2 = Gl.LLD;
            LJIIIIZZ = Gl.LJLJLLL.LJJJJLL().LJIJ().LJIIIIZZ(EnumC74442TJm.PANEL, effect, true);
            c73318Sq2.LIZ(LJIIIIZZ.LJJII(new AfS53S0100000_1(effect, 79), new InterfaceC64592gB() { // from class: X.2nS
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("un-favorite exception, ");
                    LIZ.append(obj);
                    H78.LIZIZ("DiyProp", X1D.LIZIZ(LIZ));
                }
            }));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS61S0201000_12 aqS61S0201000_12, Object obj) {
        String str;
        Object obj2;
        String str2;
        int i;
        String str3;
        String str4;
        int i2;
        int i3;
        Object obj3;
        Object obj4;
        Object obj5;
        ReviewItemStruct.AppendReview appendReview;
        List<ReviewMedia> list;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("entrance_form", "review_goods_card");
        logView.plusAssign("source_page_type", "shop_review");
        logView.plusAssign("item_order", Integer.valueOf(aqS61S0201000_12.i2));
        StringBuilder LIZ = X1D.LIZ();
        ReviewItemStruct.MainReview mainReview = ((ReviewItemStruct) aqS61S0201000_12.l0).review;
        Object obj6 = null;
        if (mainReview != null) {
            str = mainReview.reviewId;
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append('_');
        HashMap hashMap = (HashMap) aqS61S0201000_12.l1;
        if (hashMap != null) {
            obj2 = hashMap.get("log_id");
        } else {
            obj2 = null;
        }
        LIZ.append(obj2);
        LIZ.append('_');
        LIZ.append(aqS61S0201000_12.i2);
        logView.plusAssign("track_id", X1D.LIZIZ(LIZ));
        ReviewItemStruct.MainReview mainReview2 = ((ReviewItemStruct) aqS61S0201000_12.l0).review;
        if (mainReview2 != null) {
            str2 = mainReview2.reviewId;
        } else {
            str2 = null;
        }
        logView.plusAssign("review_id", str2);
        ReviewItemStruct.MainReview mainReview3 = ((ReviewItemStruct) aqS61S0201000_12.l0).review;
        int i4 = 0;
        if (mainReview3 != null && (list = mainReview3.media) != null) {
            i = list.size();
        } else {
            i = 0;
        }
        logView.plusAssign("photo_cnt", Integer.valueOf(i));
        ReviewItemStruct.MainReview mainReview4 = ((ReviewItemStruct) aqS61S0201000_12.l0).review;
        if (mainReview4 != null) {
            str3 = mainReview4.rating;
        } else {
            str3 = null;
        }
        logView.plusAssign("rate", str3);
        ReviewItemStruct.MainReview mainReview5 = ((ReviewItemStruct) aqS61S0201000_12.l0).review;
        if (mainReview5 != null && o.LJ(mainReview5.hasOriginText, Boolean.TRUE)) {
            str4 = "comment";
        } else {
            str4 = "default";
        }
        logView.plusAssign("text_type", str4);
        Integer num = ((ReviewItemStruct) aqS61S0201000_12.l0).diggCount;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        logView.plusAssign("like_cnt", Integer.valueOf(i2));
        ReviewItemStruct.MainReview mainReview6 = ((ReviewItemStruct) aqS61S0201000_12.l0).review;
        if (mainReview6 != null && mainReview6.reply != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (mainReview6 != null && (appendReview = mainReview6.appendReview) != null && appendReview.reply != null) {
            i3++;
        }
        logView.plusAssign("reply_cnt", Integer.valueOf(i3));
        ReviewItemStruct.MainReview mainReview7 = ((ReviewItemStruct) aqS61S0201000_12.l0).review;
        if (mainReview7 != null && mainReview7.appendReview != null) {
            i4 = 1;
        }
        logView.plusAssign("has_add_review", Integer.valueOf(i4));
        HashMap hashMap2 = (HashMap) aqS61S0201000_12.l1;
        if (hashMap2 != null) {
            obj3 = hashMap2.get("product_id");
        } else {
            obj3 = null;
        }
        logView.plusAssign("product_id", obj3);
        HashMap hashMap3 = (HashMap) aqS61S0201000_12.l1;
        if (hashMap3 != null) {
            obj4 = hashMap3.get("currency");
        } else {
            obj4 = null;
        }
        logView.plusAssign("currency", obj4);
        HashMap hashMap4 = (HashMap) aqS61S0201000_12.l1;
        if (hashMap4 == null || (obj5 = hashMap4.get("real_price")) == null) {
            obj5 = "";
        }
        logView.plusAssign("sale_price", obj5);
        HashMap hashMap5 = (HashMap) aqS61S0201000_12.l1;
        if (hashMap5 != null) {
            obj6 = hashMap5.get("origin_price");
        }
        logView.plusAssign("original_price", obj6);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS61S0201000_12 aqS61S0201000_12, Object obj) {
        String str;
        Object obj2;
        String str2;
        int i;
        String str3;
        String str4;
        int i2;
        int i3;
        Object obj3;
        Object obj4;
        Object obj5;
        ReviewItemStruct.AppendReview appendReview;
        List<ReviewMedia> list;
        LaneParams logWhenShow = (LaneParams) obj;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        logWhenShow.plusAssign("entrance_form", "review_goods_card");
        logWhenShow.plusAssign("source_page_type", "shop_review");
        logWhenShow.plusAssign("item_order", Integer.valueOf(aqS61S0201000_12.i2));
        StringBuilder LIZ = X1D.LIZ();
        ReviewItemStruct.MainReview mainReview = ((ReviewItemStruct) aqS61S0201000_12.l0).review;
        Object obj6 = null;
        if (mainReview != null) {
            str = mainReview.reviewId;
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append('_');
        HashMap hashMap = (HashMap) aqS61S0201000_12.l1;
        if (hashMap != null) {
            obj2 = hashMap.get("log_id");
        } else {
            obj2 = null;
        }
        LIZ.append(obj2);
        LIZ.append('_');
        LIZ.append(aqS61S0201000_12.i2);
        logWhenShow.plusAssign("track_id", X1D.LIZIZ(LIZ));
        ReviewItemStruct.MainReview mainReview2 = ((ReviewItemStruct) aqS61S0201000_12.l0).review;
        if (mainReview2 != null) {
            str2 = mainReview2.reviewId;
        } else {
            str2 = null;
        }
        logWhenShow.plusAssign("review_id", str2);
        ReviewItemStruct.MainReview mainReview3 = ((ReviewItemStruct) aqS61S0201000_12.l0).review;
        int i4 = 0;
        if (mainReview3 != null && (list = mainReview3.media) != null) {
            i = list.size();
        } else {
            i = 0;
        }
        logWhenShow.plusAssign("photo_cnt", Integer.valueOf(i));
        ReviewItemStruct.MainReview mainReview4 = ((ReviewItemStruct) aqS61S0201000_12.l0).review;
        if (mainReview4 != null) {
            str3 = mainReview4.rating;
        } else {
            str3 = null;
        }
        logWhenShow.plusAssign("rate", str3);
        ReviewItemStruct.MainReview mainReview5 = ((ReviewItemStruct) aqS61S0201000_12.l0).review;
        if (mainReview5 != null && o.LJ(mainReview5.hasOriginText, Boolean.TRUE)) {
            str4 = "comment";
        } else {
            str4 = "default";
        }
        logWhenShow.plusAssign("text_type", str4);
        Integer num = ((ReviewItemStruct) aqS61S0201000_12.l0).diggCount;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        logWhenShow.plusAssign("like_cnt", Integer.valueOf(i2));
        ReviewItemStruct.MainReview mainReview6 = ((ReviewItemStruct) aqS61S0201000_12.l0).review;
        if (mainReview6 != null && mainReview6.reply != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (mainReview6 != null && (appendReview = mainReview6.appendReview) != null && appendReview.reply != null) {
            i3++;
        }
        logWhenShow.plusAssign("reply_cnt", Integer.valueOf(i3));
        ReviewItemStruct.MainReview mainReview7 = ((ReviewItemStruct) aqS61S0201000_12.l0).review;
        if (mainReview7 != null && mainReview7.appendReview != null) {
            i4 = 1;
        }
        logWhenShow.plusAssign("has_add_review", Integer.valueOf(i4));
        HashMap hashMap2 = (HashMap) aqS61S0201000_12.l1;
        if (hashMap2 != null) {
            obj3 = hashMap2.get("product_id");
        } else {
            obj3 = null;
        }
        logWhenShow.plusAssign("product_id", obj3);
        HashMap hashMap3 = (HashMap) aqS61S0201000_12.l1;
        if (hashMap3 != null) {
            obj4 = hashMap3.get("currency");
        } else {
            obj4 = null;
        }
        logWhenShow.plusAssign("currency", obj4);
        HashMap hashMap4 = (HashMap) aqS61S0201000_12.l1;
        if (hashMap4 == null || (obj5 = hashMap4.get("real_price")) == null) {
            obj5 = "";
        }
        logWhenShow.plusAssign("sale_price", obj5);
        HashMap hashMap5 = (HashMap) aqS61S0201000_12.l1;
        if (hashMap5 != null) {
            obj6 = hashMap5.get("origin_price");
        }
        logWhenShow.plusAssign("original_price", obj6);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS61S0201000_12 aqS61S0201000_12, Object obj) {
        String str;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("like_cnt", Integer.valueOf(aqS61S0201000_12.i2));
        logView.plusAssign("rate", ((C69698RXa) aqS61S0201000_12.l0).LIZIZ);
        if (o.LJ(((C69698RXa) aqS61S0201000_12.l0).LJIIJJI, Boolean.TRUE)) {
            str = "comment";
        } else {
            str = "default";
        }
        logView.plusAssign("text_type", str);
        C70714Rp8 c70714Rp8 = (C70714Rp8) aqS61S0201000_12.l1;
        C69698RXa c69698RXa = (C69698RXa) aqS61S0201000_12.l0;
        c70714Rp8.getClass();
        C70714Rp8.LIZLLL(logView, c69698RXa);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS61S0201000_12 aqS61S0201000_12, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        ((C70120RfY) aqS61S0201000_12.l0).LIZ(logNode, (Feed) aqS61S0201000_12.l1, aqS61S0201000_12.i2);
        logNode.plusAssign("source_page_type", "buy_together");
        FII.LIZIZ(aqS61S0201000_12.i2, 1, logNode, "item_order");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS61S0201000_12 aqS61S0201000_12, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        ((C70120RfY) aqS61S0201000_12.l0).LIZ(logNode, (Feed) aqS61S0201000_12.l1, aqS61S0201000_12.i2);
        logNode.plusAssign("source_page_type", "buy_together");
        FII.LIZIZ(aqS61S0201000_12.i2, 1, logNode, "item_order");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS61S0201000_12 aqS61S0201000_12, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        ((C70120RfY) aqS61S0201000_12.l0).LIZ(logNode, (Feed) aqS61S0201000_12.l1, aqS61S0201000_12.i2);
        logNode.plusAssign("source_page_type", "buy_together");
        logNode.plusAssign("source_module", "rec_pdp_outer_buy_together_module");
        FII.LIZIZ(aqS61S0201000_12.i2, 1, logNode, "item_order");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(AqS61S0201000_12 aqS61S0201000_12, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        ((C70120RfY) aqS61S0201000_12.l0).LIZ(logNode, (Feed) aqS61S0201000_12.l1, aqS61S0201000_12.i2);
        logNode.plusAssign("source_page_type", "buy_together");
        logNode.plusAssign("source_module", "rec_pdp_outer_buy_together_module");
        FII.LIZIZ(aqS61S0201000_12.i2, 1, logNode, "item_order");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS61S0201000_12 aqS61S0201000_12, Object obj) {
        String str;
        HashMap logWhenShow = (HashMap) obj;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        logWhenShow.put("parent_option_name", "tiktok_paylater");
        logWhenShow.put("option_name", "tiktok_paylater_installment");
        logWhenShow.put("option_type", "sub_payment_type");
        logWhenShow.put("rank", Integer.valueOf(aqS61S0201000_12.i2));
        logWhenShow.put("installment_cnt", Integer.valueOf(((BnplInfo) aqS61S0201000_12.l0).installmentPlans.size()));
        Amount amount = ((InstallmentPlan) aqS61S0201000_12.l1).totalRepayment;
        if (amount != null) {
            str = amount.priceStr;
        } else {
            str = null;
        }
        logWhenShow.put("service_fee", str);
        logWhenShow.put("total_payment", ((InstallmentPlan) aqS61S0201000_12.l1).extraDescription);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS61S0201000_12 aqS61S0201000_12, Object obj) {
        List it = (List) obj;
        o.LJIIIZ(it, "it");
        EcomAddressInterceptor ecomAddressInterceptor = (EcomAddressInterceptor) aqS61S0201000_12.l0;
        Object obj2 = aqS61S0201000_12.l1;
        int i = aqS61S0201000_12.i2;
        ecomAddressInterceptor.getClass();
        EcomAddressInterceptor.LIZ(2, i, obj2, it);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS61S0201000_12 aqS61S0201000_12, Object obj) {
        List it = (List) obj;
        o.LJIIIZ(it, "it");
        EcomAddressInterceptor ecomAddressInterceptor = (EcomAddressInterceptor) aqS61S0201000_12.l0;
        Object obj2 = aqS61S0201000_12.l1;
        int i = aqS61S0201000_12.i2;
        ecomAddressInterceptor.getClass();
        EcomAddressInterceptor.LIZ(1, i, obj2, it);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS61S0201000_12 aqS61S0201000_12, Object obj) {
        int i;
        Integer num;
        C70649Ro5 initConfig = (C70649Ro5) obj;
        o.LJIIIZ(initConfig, "$this$initConfig");
        Map map = (Map) aqS61S0201000_12.l0;
        if (map != null && (num = (Integer) map.get(((PromotionItem) aqS61S0201000_12.l1).getType())) != null) {
            i = num.intValue();
        } else {
            i = aqS61S0201000_12.i2;
        }
        initConfig.setTextFont(i);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS61S0201000_12 aqS61S0201000_12, Object obj) {
        int i;
        Integer num;
        C70649Ro5 initConfig = (C70649Ro5) obj;
        o.LJIIIZ(initConfig, "$this$initConfig");
        Map map = (Map) aqS61S0201000_12.l0;
        if (map != null && (num = (Integer) map.get(((PromotionItem) aqS61S0201000_12.l1).getType())) != null) {
            i = num.intValue();
        } else {
            i = aqS61S0201000_12.i2;
        }
        initConfig.setTextFont(i);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS61S0201000_12 aqS61S0201000_12, Object it) {
        String str;
        o.LJIIIZ(it, "it");
        List<String> list = ((ActionLinkComponent) aqS61S0201000_12.l0).data;
        if (C1GE.LJIILIIL(list) && list != null && (str = (String) ListProtector.get(list, 0)) != null) {
            C71791SFn c71791SFn = (C71791SFn) aqS61S0201000_12.l1;
            int i = aqS61S0201000_12.i2;
            InterfaceC71794SFq itemAction = c71791SFn.getItemAction();
            if (itemAction != null) {
                itemAction.LLLZIL(i + 1, str);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS61S0201000_12 aqS61S0201000_12, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("notice_number", Integer.valueOf(aqS61S0201000_12.i2));
        ShopWindowAnchorModel shopWindowAnchorModel = (ShopWindowAnchorModel) aqS61S0201000_12.l0;
        if (shopWindowAnchorModel != null) {
            C71360RzY.LIZ(null, null, null, shopWindowAnchorModel, (CommonVideoAnchorModel) aqS61S0201000_12.l1, sendLog);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS61S0201000_12 aqS61S0201000_12, Object obj) {
        String productId;
        HashMap logView = (HashMap) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.put("button_name", "add_num");
        SkuItem skuItem = ((SkuPanelCounterWidget) aqS61S0201000_12.l0).getMViewModel().LLFF;
        if (skuItem != null) {
            logView.put("sku_id", skuItem.skuId);
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams = ((SkuPanelCounterWidget) aqS61S0201000_12.l0).getMViewModel().LJLLJ;
        if (skuEnterParams != null && (productId = skuEnterParams.getProductId()) != null) {
            logView.put("product_id", productId);
        }
        logView.put("num_before", Integer.valueOf(aqS61S0201000_12.i2));
        logView.put("num_after", Integer.valueOf(((C76732zl) aqS61S0201000_12.l1).element));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS61S0201000_12(int i, C69698RXa c69698RXa, C70714Rp8 c70714Rp8, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = c69698RXa;
        this.l1 = c70714Rp8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS61S0201000_12(int i, PdpPaymentModuleViewHolder pdpPaymentModuleViewHolder, InstallmentPlan installmentPlan, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = pdpPaymentModuleViewHolder;
        this.l1 = installmentPlan;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS61S0201000_12(int i, BnplInfo bnplInfo, InstallmentPlan installmentPlan, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = bnplInfo;
        this.l1 = installmentPlan;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS61S0201000_12(int i, int i2, ReviewItemStruct reviewItemStruct, HashMap<String, Object> hashMap) {
        super(1);
        this.$t = hashMap;
        this.i2 = i;
        this.l0 = i2;
        this.l1 = reviewItemStruct;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS61S0201000_12(int i, ShopWindowAnchorModel shopWindowAnchorModel, CommonVideoAnchorModel commonVideoAnchorModel, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = shopWindowAnchorModel;
        this.l1 = commonVideoAnchorModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS61S0201000_12(C70120RfY c70120RfY, Feed feed, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c70120RfY;
        this.l1 = feed;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS61S0201000_12(C71094RvG c71094RvG, int i, C27959AyB c27959AyB, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c71094RvG;
        this.i2 = i;
        this.l1 = c27959AyB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS61S0201000_12(SkuPanelBottomWidget skuPanelBottomWidget, int i, BuyButton buyButton, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = skuPanelBottomWidget;
        this.i2 = i;
        this.l1 = buyButton;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS61S0201000_12(SkuPanelCounterWidget skuPanelCounterWidget, int i, C76732zl c76732zl, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = skuPanelCounterWidget;
        this.i2 = i;
        this.l1 = c76732zl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS61S0201000_12(EcomAddressInterceptor ecomAddressInterceptor, Object obj, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = ecomAddressInterceptor;
        this.l1 = obj;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS61S0201000_12(ActionLinkComponent actionLinkComponent, C71791SFn c71791SFn, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = actionLinkComponent;
        this.l1 = c71791SFn;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS61S0201000_12(Map map, Map<Integer, Integer> map2, PromotionItem promotionItem, int i) {
        super(1);
        this.$t = i;
        this.l0 = map;
        this.l1 = map2;
        this.i2 = promotionItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS61S0201000_12(EffectTemplateCategoryFragment effectTemplateCategoryFragment, Effect effect, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = effectTemplateCategoryFragment;
        this.l1 = effect;
        this.i2 = i;
    }
}
