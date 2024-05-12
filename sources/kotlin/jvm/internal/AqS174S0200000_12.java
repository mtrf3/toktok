package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.B1K;
import X.C113554cx;
import X.C16880lQ;
import X.C17N;
import X.C1GE;
import X.C234529Ii;
import X.C252709vu;
import X.C26338AVi;
import X.C26694Adm;
import X.C26696Ado;
import X.C26699Adr;
import X.C27162AlK;
import X.C27532ArI;
import X.C27570Aru;
import X.C28112B1o;
import X.C43I;
import X.C45804HyK;
import X.C47261Igj;
import X.C53204KuO;
import X.C56K;
import X.C69643RUx;
import X.C69684RWm;
import X.C69887Rbn;
import X.C69959Rcx;
import X.C70021Rdx;
import X.C70022Rdy;
import X.C70172RgO;
import X.C70307RiZ;
import X.C70414RkI;
import X.C70637Rnt;
import X.C70691Rol;
import X.C70723RpH;
import X.C70782RqE;
import X.C70798RqU;
import X.C70801RqX;
import X.C70856RrQ;
import X.C70934Rsg;
import X.C70999Rtj;
import X.C71031RuF;
import X.C71032RuG;
import X.C71897SJp;
import X.C72582SeA;
import X.C72593SeL;
import X.C72673Sfd;
import X.C72694Sfy;
import X.C73181Snp;
import X.C73305Spp;
import X.C73306Spq;
import X.C73974T1m;
import X.C74003T2p;
import X.C74009T2v;
import X.C74010T2w;
import X.C76542zS;
import X.C76800UCe;
import X.C78685UuP;
import X.C78929UyL;
import X.C78946Uyc;
import X.C80217Ve1;
import X.C8YF;
import X.E86;
import X.InterfaceC223218pR;
import X.InterfaceC72696Sg0;
import X.InterfaceC72700Sg4;
import X.InterfaceC73150SnK;
import X.InterfaceC88471Ynr;
import X.InterfaceC98243tM;
import X.ORZ;
import X.S4U;
import X.SC6;
import X.SCQ;
import X.SIT;
import X.X1D;
import X.XKX;
import Y.ARunnableS15S0300000_4;
import Y.ARunnableS48S0100000_12;
import Y.AUListenerS99S0100000_12;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerStub;
import com.bytedance.jedi.arch.ext.list.ListViewModel;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonActionInfo;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterAssem;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.TradeEntranceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.OcrStatus;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.header.PdpHeadViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PlatformPromotionItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBodyWidget;
import com.ss.android.ugc.aweme.ecommerce.base.review.Option;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectPercentageCard;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectPercentageItem;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelCounterWidget;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.header.GlobalHeaderVH;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.header.sa.TtfHeadVH;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.header.vh.UsHeaderVH;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.aigc.ChooseStyleCell;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditAssem;
import com.ss.android.ugc.aweme.qna.assem.QnaAskQuestionAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchJediViewModel;
import com.ss.android.ugc.aweme.utils.Au2S11S0300000_12;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import com.ss.ugc.effectplatform.model.Effect;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes13.dex */
public class AqS174S0200000_12 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case 9:
                return invoke$9(this, obj, obj2);
            case 10:
                return invoke$10(this, obj, obj2);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj, obj2);
            case 12:
                return invoke$12(this, obj, obj2);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj, obj2);
            case 17:
                return invoke$17(this, obj, obj2);
            case 18:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case 20:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            case 23:
                return invoke$23(this, obj, obj2);
            case 24:
                return invoke$24(this, obj, obj2);
            case 25:
                return invoke$25(this, obj, obj2);
            case 26:
                return invoke$26(this, obj, obj2);
            case 27:
                return invoke$27(this, obj, obj2);
            case 28:
                return invoke$28(this, obj, obj2);
            case 29:
                return invoke$29(this, obj, obj2);
            case 30:
                return invoke$30(this, obj, obj2);
            case 31:
                return invoke$31(this, obj, obj2);
            case 32:
                return invoke$32(this, obj, obj2);
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS174S0200000_12(X.InterfaceC223218pR r3, X.C74003T2p r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 30: goto Lf;
                case 31: goto L5;
                case 32: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 2
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS174S0200000_12.<init>(X.8pR, X.T2p, int):void");
    }

    public static final Object invoke$0(AqS174S0200000_12 aqS174S0200000_12, Object selectSubscribe, Object obj) {
        boolean z;
        C43I it = (C43I) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        C71897SJp c71897SJp = (C71897SJp) aqS174S0200000_12.l0;
        if (((ChooseStyleCell) aqS174S0200000_12.l1).LJLILLLLZI || ((Set) it.LIZ).size() < 5) {
            z = true;
        } else {
            z = false;
        }
        c71897SJp.setEnabled(z);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS174S0200000_12 aqS174S0200000_12, Object obj, Object obj2) {
        SC6 ocrRes = (SC6) obj;
        int intValue = ((Number) obj2).intValue();
        o.LJIIIZ(ocrRes, "ocrRes");
        ((PaymentViewModel) aqS174S0200000_12.l0).Kv0().getClass();
        OcrStatus LIZIZ = SCQ.LIZIZ(ocrRes);
        OcrStatus LIZ = ((PaymentViewModel) aqS174S0200000_12.l0).Kv0().LIZ(ocrRes);
        PaymentViewModel paymentViewModel = (PaymentViewModel) aqS174S0200000_12.l0;
        paymentViewModel.withState(new AqS16S0500000_12(paymentViewModel, ocrRes, (PaymentMethod) aqS174S0200000_12.l1, LIZIZ, LIZ, 1));
        ((PaymentViewModel) aqS174S0200000_12.l0).Kv0().LIZIZ = ocrRes;
        B1K b1k = ((PaymentViewModel) aqS174S0200000_12.l0).LJLL;
        if (b1k != null) {
            b1k.LJIIIZ(C28112B1o.LIZ("ocr_scanning"), Integer.valueOf(intValue), "card_result", LIZIZ.toString(), LIZ.toString());
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS174S0200000_12 aqS174S0200000_12, Object obj, Object obj2) {
        View view = (View) obj2;
        o.LJIIIZ(view, "view");
        PdpViewModel viewModel = ((PdpBodyWidget) aqS174S0200000_12.l0).getViewModel();
        viewModel.getClass();
        XKX.LIZLLL(ViewModelKt.getViewModelScope(viewModel), null, null, new C69959Rcx((PlatformPromotionItem) obj, viewModel, view, null), 3);
        if (((PdpBodyWidget) aqS174S0200000_12.l0).getViewModel().LLFII != null) {
            C70414RkI.LJJ(((PdpBodyWidget) aqS174S0200000_12.l0).getFragment(), (C69643RUx) aqS174S0200000_12.l1, "claim_button");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS174S0200000_12 aqS174S0200000_12, Object selectSubscribe, Object obj) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        ((ProductReviewFragment) aqS174S0200000_12.l0).Ll();
        C73305Spp c73305Spp = (C73305Spp) aqS174S0200000_12.l1;
        if (c73305Spp != null) {
            c73305Spp.LJFF();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS174S0200000_12 aqS174S0200000_12, Object refreshListener, Object obj) {
        Throwable e = (Throwable) obj;
        o.LJIIIZ(refreshListener, "$this$refreshListener");
        o.LJIIIZ(e, "e");
        ((ProductReviewFragment) aqS174S0200000_12.l0).Hl().Wv0(new C70801RqX(e));
        ((ProductReviewFragment) aqS174S0200000_12.l0).Ll();
        if (e instanceof C69887Rbn) {
            C73305Spp c73305Spp = (C73305Spp) aqS174S0200000_12.l1;
            if (c73305Spp != null) {
                c73305Spp.setStatus(C73974T1m.LJ(new AqS162S0100000_12((ProductReviewFragment) aqS174S0200000_12.l0, 450), !r3.LLD));
            }
        } else {
            C73305Spp c73305Spp2 = (C73305Spp) aqS174S0200000_12.l1;
            if (c73305Spp2 != null) {
                c73305Spp2.setStatus(C73974T1m.LIZIZ(new AqS162S0100000_12((ProductReviewFragment) aqS174S0200000_12.l0, 451), !r3.LLD));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS174S0200000_12 aqS174S0200000_12, Object refreshListener, Object obj) {
        List list = (List) obj;
        o.LJIIIZ(refreshListener, "$this$refreshListener");
        o.LJIIIZ(list, "list");
        ((ProductReviewFragment) aqS174S0200000_12.l0).Hl().Wv0(new C70798RqU(list));
        if (list.isEmpty()) {
            ((ProductReviewFragment) aqS174S0200000_12.l0).Ll();
            C73305Spp c73305Spp = (C73305Spp) aqS174S0200000_12.l1;
            if (c73305Spp != null) {
                C73306Spq c73306Spq = new C73306Spq();
                ProductReviewFragment productReviewFragment = (ProductReviewFragment) aqS174S0200000_12.l0;
                String string = productReviewFragment.getString(R.string.f58);
                o.LJIIIIZZ(string, "getString(R.string.ec_sh…ew_filter_null_body_text)");
                c73306Spq.LJFF = string;
                String string2 = productReviewFragment.getString(R.string.f59);
                o.LJIIIIZZ(string2, "getString(R.string.ec_sh…eview_filter_null_header)");
                c73306Spq.LJI = string2;
                c73305Spp.setStatus(c73306Spq);
            }
        } else {
            ProductReviewFragment productReviewFragment2 = (ProductReviewFragment) aqS174S0200000_12.l0;
            productReviewFragment2.Kl(true);
            productReviewFragment2.LL.postDelayed(productReviewFragment2.LLIFFJFJJ, 100 - (SystemClock.elapsedRealtime() - productReviewFragment2.LLII));
            C70691Rol c70691Rol = productReviewFragment2.Hl().LJLLILLLL;
            if (c70691Rol != null) {
                c70691Rol.LJIILL(productReviewFragment2);
            }
            C78929UyL.LJIJJLI((ProductReviewFragment) aqS174S0200000_12.l0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS174S0200000_12 aqS174S0200000_12, Object selectSubscribe, Object obj) {
        Integer num;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        SkuPanelBottomWidget skuPanelBottomWidget = (SkuPanelBottomWidget) aqS174S0200000_12.l0;
        C69684RWm c69684RWm = (C69684RWm) aqS174S0200000_12.l1;
        if (c69684RWm != null) {
            num = Integer.valueOf(c69684RWm.LIZIZ);
        } else {
            num = null;
        }
        skuPanelBottomWidget.updateAddFavouriteBtn(num, booleanValue);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS174S0200000_12 aqS174S0200000_12, Object obj, Object obj2) {
        InterfaceC73150SnK selectSubscribe = (InterfaceC73150SnK) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        selectSubscribe.withState(((SkuPanelCounterWidget) aqS174S0200000_12.l0).getMViewModel(), new AqS116S0300000_12((Boolean) obj2, (SkuPanelCounterWidget) aqS174S0200000_12.l0, (SkuPanelViewModel) aqS174S0200000_12.l1, 11));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS174S0200000_12 aqS174S0200000_12, Object selectSubscribe, Object obj) {
        String name = (String) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(name, "name");
        int length = name.length();
        EffectEditAssem effectEditAssem = (EffectEditAssem) aqS174S0200000_12.l0;
        if (length > effectEditAssem.LJLJLLL) {
            effectEditAssem.N3().LIZ(true);
            ((EffectEditAssem) aqS174S0200000_12.l0).N3().setFooterFieldView((TuxTextView) aqS174S0200000_12.l1);
            ((TuxTextView) aqS174S0200000_12.l1).setVisibility(0);
        } else {
            effectEditAssem.N3().LIZ(false);
            ((TuxTextView) aqS174S0200000_12.l1).setVisibility(8);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS174S0200000_12 aqS174S0200000_12, Object selectSubscribe, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        ViewGroup.LayoutParams layoutParams = ((TtfHeadVH) aqS174S0200000_12.l0)._$_findCachedViewById(R.id.ck6).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (booleanValue) {
            ((C70637Rnt) aqS174S0200000_12.l1).LIZJ(marginLayoutParams.leftMargin, C45804HyK.LJJI(24), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        } else {
            ((C70637Rnt) aqS174S0200000_12.l1).LIZJ(marginLayoutParams.leftMargin, C45804HyK.LJJI(65), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS174S0200000_12 aqS174S0200000_12, Object obj, Object obj2) {
        InterfaceC72696Sg0 LIZ;
        InterfaceC72700Sg4 interfaceC72700Sg4;
        Effect effect = (Effect) obj2;
        if (!((Boolean) obj).booleanValue() && effect != null) {
            ((InterfaceC72696Sg0) aqS174S0200000_12.l0).setPath(effect.getUnzipPath());
            ProfileNaviEditorViewModel profileNaviEditorViewModel = (ProfileNaviEditorViewModel) aqS174S0200000_12.l1;
            InterfaceC72696Sg0 interfaceC72696Sg0 = (InterfaceC72696Sg0) aqS174S0200000_12.l0;
            profileNaviEditorViewModel.getClass();
            C72582SeA c72582SeA = C72593SeL.LIZIZ;
            if (c72582SeA != null && (LIZ = c72582SeA.LIZ(ProfileNaviEditorViewModel.Mv0(interfaceC72696Sg0.LIZ()))) != null) {
                if (C72673Sfd.LIZIZ == null) {
                    C72673Sfd.LIZIZ = profileNaviEditorViewModel;
                }
                if (o.LJ(LIZ.getKey(), interfaceC72696Sg0.getKey())) {
                    String path = LIZ.getPath();
                    o.LJIIIZ(path, "path");
                    Iterator<InterfaceC72696Sg0> it = C72673Sfd.LIZ.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (o.LJ(path, it.next().getPath())) {
                                break;
                            }
                        } else {
                            LinkedList<InterfaceC72696Sg0> linkedList = C72673Sfd.LIZ;
                            linkedList.addFirst(interfaceC72696Sg0);
                            if ((!linkedList.isEmpty()) && (interfaceC72700Sg4 = C72673Sfd.LIZIZ) != null) {
                                ArrayList arrayList = new ArrayList();
                                String path2 = linkedList.getFirst().getPath();
                                o.LJIIIZ(path2, "path");
                                arrayList.add(C72694Sfy.LIZ(1, 66666, path2));
                                linkedList.isEmpty();
                                interfaceC72700Sg4.yc0(arrayList);
                            }
                        }
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(AqS174S0200000_12 aqS174S0200000_12, Object receiver, Object it) {
        InterfaceC88471Ynr<InterfaceC98243tM, Throwable, C76800UCe> interfaceC88471Ynr;
        o.LJIIJ(receiver, "$receiver");
        o.LJIIJ(it, "it");
        ((C73181Snp) aqS174S0200000_12.l0).LJIIIZ.withState((ListViewModel) aqS174S0200000_12.l1, new AqS178S0100000_12(aqS174S0200000_12, 422));
        C70856RrQ c70856RrQ = ((C73181Snp) aqS174S0200000_12.l0).LJ;
        if (c70856RrQ != null && (interfaceC88471Ynr = c70856RrQ.LIZIZ) != null) {
            interfaceC88471Ynr.invoke(receiver, it);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS174S0200000_12 aqS174S0200000_12, Object obj, Object obj2) {
        Integer buttonActionType;
        String str;
        Context context;
        String str2;
        Integer buttonActionType2;
        Response addItemToCartResponse = (Response) obj;
        ButtonAction buttonAction = (ButtonAction) obj2;
        o.LJIIIZ(addItemToCartResponse, "addItemToCartResponse");
        C70414RkI c70414RkI = ((PdpViewModel) aqS174S0200000_12.l0).LLFII;
        String str3 = null;
        if (c70414RkI != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("error_code", String.valueOf(addItemToCartResponse.code));
            linkedHashMap.put("popup_name", "go_to_cart");
            linkedHashMap.put("previous_page", "product_detail");
            if (buttonAction != null && (buttonActionType2 = buttonAction.getButtonActionType()) != null) {
                if (buttonActionType2.intValue() == 0 || buttonActionType2.intValue() == 1) {
                    str2 = "stay";
                } else if (buttonActionType2.intValue() == 3) {
                    str2 = "enter";
                }
                linkedHashMap.put("action_type", str2);
                c70414RkI.LJJJLL(linkedHashMap);
            }
            str2 = "";
            linkedHashMap.put("action_type", str2);
            c70414RkI.LJJJLL(linkedHashMap);
        }
        C70934Rsg c70934Rsg = new C70934Rsg();
        c70934Rsg.LJII(C70021Rdx.LJLIL);
        c70934Rsg.LIZJ(false);
        if (buttonAction != null && (buttonActionType = buttonAction.getButtonActionType()) != null && buttonActionType.intValue() == 3) {
            ButtonActionInfo buttonActionInfo = buttonAction.getButtonActionInfo();
            if (buttonActionInfo != null) {
                str = buttonActionInfo.getSchema();
            } else {
                str = null;
            }
            if (C78685UuP.LJJJZ(str)) {
                View view = (View) aqS174S0200000_12.l1;
                if (view != null) {
                    context = view.getContext();
                } else {
                    context = null;
                }
                IPdpStarter.PdpEnterParam pdpEnterParam = ((PdpViewModel) aqS174S0200000_12.l0).LJLJJLL;
                ButtonActionInfo buttonActionInfo2 = buttonAction.getButtonActionInfo();
                if (buttonActionInfo2 != null) {
                    str3 = buttonActionInfo2.getSchema();
                }
                C70172RgO.LIZJ(context, pdpEnterParam, "product_detail", str3, false);
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public static final Object invoke$20(AqS174S0200000_12 aqS174S0200000_12, Object obj, Object obj2) {
        Integer num;
        boolean z;
        String str;
        Integer num2;
        Integer buttonActionType;
        String str2;
        Context context;
        HashMap<String, Object> hashMap;
        Object obj3;
        String str3;
        HashMap<String, Object> visitReportParams;
        String enterFrom;
        Response addItemToCartResponse = (Response) obj;
        ButtonAction buttonAction = (ButtonAction) obj2;
        o.LJIIIZ(addItemToCartResponse, "addItemToCartResponse");
        String valueOf = String.valueOf(addItemToCartResponse.code);
        SkuPanelStarter.SkuEnterParams skuEnterParams = ((SkuPanelViewModel) aqS174S0200000_12.l0).LJLLJ;
        String str4 = null;
        if (buttonAction != null) {
            num = buttonAction.getButtonActionType();
        } else {
            num = null;
        }
        if (num == null || (num.intValue() != 0 && num.intValue() != 1)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            str = "stay";
        } else if (num == null || num.intValue() != 3) {
            str = "";
        } else {
            str = "enter";
        }
        Boolean bool = ((SkuPanelViewModel) aqS174S0200000_12.l0).LJLLLLLL;
        Map LJJLIL = C113554cx.LJJLIL(C70307RiZ.LIZ);
        LJJLIL.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        LJJLIL.put("page_name", "sku");
        LJJLIL.put("popup_name", "go_to_cart");
        if (skuEnterParams != null && (enterFrom = skuEnterParams.getEnterFrom()) != null) {
            LJJLIL.put("previous_page", enterFrom);
        }
        if (valueOf != null) {
            LJJLIL.put("error_code", valueOf);
        }
        LJJLIL.put("action_type", str);
        if (skuEnterParams != null) {
            num2 = Integer.valueOf(skuEnterParams.getClickFrom());
        } else {
            num2 = null;
        }
        String LIZIZ = C70172RgO.LIZIZ(num2, null);
        if (LIZIZ != null && !ujb.o.LJJJJJL(LIZIZ)) {
            LJJLIL.put("cart_form", LIZIZ);
        }
        if (bool != null) {
            LJJLIL.put("is_single_sku", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        C76542zS.LIZ("tiktokec_popup_click", LJJLIL);
        C70934Rsg c70934Rsg = new C70934Rsg();
        c70934Rsg.LJII(C70022Rdy.LJLIL);
        c70934Rsg.LIZJ(false);
        if (buttonAction != null && (buttonActionType = buttonAction.getButtonActionType()) != null && buttonActionType.intValue() == 3) {
            ButtonActionInfo buttonActionInfo = buttonAction.getButtonActionInfo();
            if (buttonActionInfo != null) {
                str2 = buttonActionInfo.getSchema();
            } else {
                str2 = null;
            }
            if (C78685UuP.LJJJZ(str2)) {
                View view = (View) aqS174S0200000_12.l1;
                if (view != null) {
                    context = view.getContext();
                } else {
                    context = null;
                }
                SkuPanelStarter.SkuEnterParams skuEnterParams2 = ((SkuPanelViewModel) aqS174S0200000_12.l0).LJLLJ;
                if (skuEnterParams2 != null) {
                    hashMap = skuEnterParams2.getTrackParams();
                } else {
                    hashMap = null;
                }
                SkuPanelStarter.SkuEnterParams skuEnterParams3 = ((SkuPanelViewModel) aqS174S0200000_12.l0).LJLLJ;
                if (skuEnterParams3 != null && (visitReportParams = skuEnterParams3.getVisitReportParams()) != null) {
                    obj3 = visitReportParams.get("chain_key");
                } else {
                    obj3 = null;
                }
                String str5 = (String) obj3;
                SkuPanelStarter.SkuEnterParams skuEnterParams4 = ((SkuPanelViewModel) aqS174S0200000_12.l0).LJLLJ;
                if (skuEnterParams4 != null) {
                    str3 = skuEnterParams4.getEnterFrom();
                } else {
                    str3 = null;
                }
                ButtonActionInfo buttonActionInfo2 = buttonAction.getButtonActionInfo();
                if (buttonActionInfo2 != null) {
                    str4 = buttonActionInfo2.getSchema();
                }
                C70172RgO.LIZLLL(context, hashMap, null, str5, str3, str4, false);
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public static final Object invoke$21(AqS174S0200000_12 aqS174S0200000_12, Object obj, Object obj2) {
        Window window;
        View decorView;
        Window window2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int intValue = ((Number) obj2).intValue();
        TuxSheet tuxSheet = ((S4U) aqS174S0200000_12.l0).LJFF;
        if (tuxSheet != null) {
            Dialog dialog = tuxSheet.getDialog();
            if (dialog != null && (window2 = dialog.getWindow()) != null) {
                window2.setSoftInputMode(48);
            }
            if (!booleanValue) {
                TuxSheet tuxSheet2 = ((S4U) aqS174S0200000_12.l0).LJFF;
                if (tuxSheet2 != null) {
                    Dialog dialog2 = tuxSheet2.getDialog();
                    if (dialog2 != null && (window = dialog2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                        decorView.setPadding(0, 0, 0, 0);
                    }
                    View view = (View) aqS174S0200000_12.l1;
                    if (view != null) {
                        view.clearFocus();
                    }
                } else {
                    o.LJIJI("dialog");
                    throw null;
                }
            } else {
                ValueAnimator duration = ValueAnimator.ofInt(0, (C27162AlK.LIZIZ - intValue) - ((S4U) aqS174S0200000_12.l0).LJIIL).setDuration(200L);
                duration.addUpdateListener(new AUListenerS99S0100000_12((S4U) aqS174S0200000_12.l0, 22));
                duration.start();
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI("dialog");
        throw null;
    }

    public static final Object invoke$22(AqS174S0200000_12 aqS174S0200000_12, Object selectSubscribe, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        ViewGroup.LayoutParams layoutParams = ((UsHeaderVH) aqS174S0200000_12.l0)._$_findCachedViewById(R.id.ck6).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (booleanValue) {
            ((C70637Rnt) aqS174S0200000_12.l1).LIZJ(marginLayoutParams.leftMargin, C45804HyK.LJJI(24), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        } else {
            ((C70637Rnt) aqS174S0200000_12.l1).LIZJ(marginLayoutParams.leftMargin, C45804HyK.LJJI(65), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$23(AqS174S0200000_12 aqS174S0200000_12, Object obj, Object obj2) {
        String str;
        Option option = (Option) obj2;
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        o.LJIIIZ(option, "option");
        C70691Rol c70691Rol = ((ReviewFragment) aqS174S0200000_12.l0).xl().LJLLILLLL;
        if (c70691Rol != null) {
            ReviewFragment reviewFragment = (ReviewFragment) aqS174S0200000_12.l0;
            Option option2 = (Option) aqS174S0200000_12.l1;
            if (option2 != null) {
                str = option2.valueForEvent;
            } else {
                str = null;
            }
            C70691Rol.LJI(c70691Rol, reviewFragment, "select_star", str, option.valueForEvent);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$24(AqS174S0200000_12 aqS174S0200000_12, Object selectSubscribe, Object obj) {
        C70691Rol c70691Rol;
        C70691Rol c70691Rol2;
        C70691Rol c70691Rol3;
        C70691Rol c70691Rol4;
        List<ReviewAspectPercentageItem> list;
        Integer num;
        View findViewById;
        C70723RpH c70723RpH = (C70723RpH) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c70723RpH != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<ReviewFilterStruct> list2 = c70723RpH.LIZ;
            if (list2 != null) {
                for (ReviewFilterStruct reviewFilterStruct : list2) {
                    Integer num2 = reviewFilterStruct.type;
                    if (num2 == null || num2.intValue() != 3) {
                        arrayList.add(reviewFilterStruct);
                    } else {
                        arrayList2.add(reviewFilterStruct);
                    }
                }
            }
            ProductReviewFragment productReviewFragment = (ProductReviewFragment) aqS174S0200000_12.l0;
            if (!productReviewFragment.LLFZ && productReviewFragment.Al()) {
                View ttf_review_header = ((ProductReviewFragment) aqS174S0200000_12.l0)._$_findCachedViewById(R.id.lmr);
                o.LJIIIIZZ(ttf_review_header, "ttf_review_header");
                ttf_review_header.setVisibility(0);
                List<ReviewAspectPercentageCard> list3 = c70723RpH.LIZJ;
                if (list3 != null) {
                    ProductReviewFragment productReviewFragment2 = (ProductReviewFragment) aqS174S0200000_12.l0;
                    View findViewById2 = productReviewFragment2._$_findCachedViewById(R.id.lmr).findViewById(R.id.k1s);
                    o.LJIIIIZZ(findViewById2, "ttf_review_header.size_overfit");
                    ReviewAspectPercentageCard reviewAspectPercentageCard = (ReviewAspectPercentageCard) ORZ.LJLLLL(list3);
                    if (reviewAspectPercentageCard != null) {
                        list = reviewAspectPercentageCard.reviewAspectScoreItems;
                    } else {
                        list = null;
                    }
                    int i = R.id.k1u;
                    ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.k1u);
                    if (viewGroup != null) {
                        viewGroup.removeAllViews();
                    }
                    C56K c56k = new C56K();
                    ArrayList arrayList3 = new ArrayList();
                    StringBuilder sb = new StringBuilder();
                    int i2 = R.id.hli;
                    if (list != null) {
                        for (ReviewAspectPercentageItem reviewAspectPercentageItem : list) {
                            View findViewById3 = findViewById2.findViewById(R.id.k1u);
                            if (findViewById3 != null && (findViewById = findViewById3.findViewById(i2)) != null) {
                                findViewById.post(new ARunnableS15S0300000_4(c56k, findViewById2, reviewAspectPercentageItem, 13));
                            }
                            i2 = R.id.hli;
                        }
                        int i3 = 0;
                        for (ReviewAspectPercentageItem reviewAspectPercentageItem2 : list) {
                            int i4 = i3 + 1;
                            if (i3 >= 0) {
                                ReviewAspectPercentageItem reviewAspectPercentageItem3 = reviewAspectPercentageItem2;
                                Context context = findViewById2.getContext();
                                o.LJIIIIZZ(context, "container.context");
                                View LIZ = C27532ArI.LIZ(R.layout.a7e, context, (ViewGroup) findViewById2.findViewById(i), false);
                                TextView textView = (TextView) LIZ.findViewById(R.id.hca);
                                if (textView != null) {
                                    textView.setText(reviewAspectPercentageItem3.option);
                                }
                                TextView textView2 = (TextView) LIZ.findViewById(R.id.hca);
                                if (textView2 != null) {
                                    textView2.setWidth(C17N.LJIILL(74.0d));
                                }
                                String str = reviewAspectPercentageItem3.percentage;
                                if (str != null) {
                                    String substring = str.substring(0, str.length() - 1);
                                    o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                    num = Integer.valueOf(CastIntegerProtector.parseInt(substring));
                                } else {
                                    num = null;
                                }
                                if (num != null) {
                                    int intValue = num.intValue();
                                    ProgressBar progressBar = (ProgressBar) LIZ.findViewById(R.id.iac);
                                    if (progressBar != null) {
                                        progressBar.setProgress(intValue);
                                    }
                                }
                                C45804HyK.LJJLI(C27162AlK.LJIILL, LIZ.findViewById(R.id.iac));
                                TextView textView3 = (TextView) LIZ.findViewById(R.id.hli);
                                if (textView3 != null) {
                                    textView3.setText(reviewAspectPercentageItem3.percentage);
                                }
                                c56k.element = Math.max(c56k.element, ((TextView) LIZ.findViewById(R.id.hli)).getPaint().measureText(reviewAspectPercentageItem3.percentage));
                                ViewGroup.MarginLayoutParams LJFF = C27570Aru.LJFF(LIZ);
                                if (LJFF != null) {
                                    LJFF.topMargin = C17N.LJIILL(8.0d);
                                    if (i3 == list.size() - 1) {
                                        LJFF.bottomMargin = C17N.LJIILL(8.0d);
                                    }
                                }
                                arrayList3.add(LIZ);
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append(reviewAspectPercentageItem3.option);
                                LIZ2.append(':');
                                LIZ2.append(reviewAspectPercentageItem3.percentage);
                                sb.append(X1D.LIZIZ(LIZ2));
                                if (i3 != list.size() - 1) {
                                    sb.append(";");
                                }
                                i3 = i4;
                                i = R.id.k1u;
                            } else {
                                C47261Igj.LJJJJJ();
                                throw null;
                            }
                        }
                    }
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        View view = (View) it.next();
                        ViewGroup viewGroup2 = (ViewGroup) findViewById2.findViewById(i);
                        if (viewGroup2 != null) {
                            viewGroup2.addView(view);
                        }
                        view.findViewById(R.id.hli).getLayoutParams().width = (int) c56k.element;
                    }
                    C70691Rol c70691Rol5 = productReviewFragment2.Hl().LJLLILLLL;
                    if (c70691Rol5 != null) {
                        View findViewById4 = findViewById2.findViewById(i);
                        o.LJIIIIZZ(findViewById4, "container.size_progress_bar_item");
                        String sb2 = sb.toString();
                        o.LJIIIIZZ(sb2, "fitnessInfoStr.toString()");
                        c70691Rol5.LJJIIZI(findViewById4, sb2, Float.valueOf(productReviewFragment2.Il()));
                    }
                    View findViewById5 = findViewById2.findViewById(i);
                    if (findViewById5 != null) {
                        C16880lQ.LJIIJ(new Au2S11S0300000_12(productReviewFragment2, findViewById2, sb, 15), findViewById5);
                    }
                }
            }
            C70691Rol.LJIJI = arrayList2.size();
            if (((ProductReviewFragment) aqS174S0200000_12.l0).Jl() || ((ProductReviewFragment) aqS174S0200000_12.l0).Al()) {
                ProductReviewFragment productReviewFragment3 = (ProductReviewFragment) aqS174S0200000_12.l0;
                productReviewFragment3.LLD = true;
                ((C70782RqE) aqS174S0200000_12.l1).LIZLLL = true;
                if (productReviewFragment3.LLFZ) {
                    C80217Ve1 shop_review_list_header = (C80217Ve1) productReviewFragment3._$_findCachedViewById(R.id.jyj);
                    o.LJIIIIZZ(shop_review_list_header, "shop_review_list_header");
                    shop_review_list_header.setVisibility(0);
                    View review_filter_group_new = ((ProductReviewFragment) aqS174S0200000_12.l0)._$_findCachedViewById(R.id.j0o);
                    o.LJIIIIZZ(review_filter_group_new, "review_filter_group_new");
                    review_filter_group_new.setVisibility(0);
                } else if (productReviewFragment3.Al()) {
                    View ttf_review_header2 = ((ProductReviewFragment) aqS174S0200000_12.l0)._$_findCachedViewById(R.id.lmr);
                    o.LJIIIIZZ(ttf_review_header2, "ttf_review_header");
                    ttf_review_header2.setVisibility(0);
                    View review_list_header_content = ((ProductReviewFragment) aqS174S0200000_12.l0)._$_findCachedViewById(R.id.j12);
                    o.LJIIIIZZ(review_list_header_content, "review_list_header_content");
                    review_list_header_content.setVisibility(8);
                } else {
                    View review_list_header_content2 = ((ProductReviewFragment) aqS174S0200000_12.l0)._$_findCachedViewById(R.id.j12);
                    o.LJIIIIZZ(review_list_header_content2, "review_list_header_content");
                    review_list_header_content2.setVisibility(0);
                    View ttf_review_header3 = ((ProductReviewFragment) aqS174S0200000_12.l0)._$_findCachedViewById(R.id.lmr);
                    o.LJIIIIZZ(ttf_review_header3, "ttf_review_header");
                    ttf_review_header3.setVisibility(8);
                }
                ProductReviewFragment productReviewFragment4 = (ProductReviewFragment) aqS174S0200000_12.l0;
                if (productReviewFragment4.LLFZ) {
                    C26696Ado horizontal_scroll_view_group_new = (C26696Ado) productReviewFragment4._$_findCachedViewById(R.id.e79);
                    o.LJIIIIZZ(horizontal_scroll_view_group_new, "horizontal_scroll_view_group_new");
                    C26699Adr review_filter_group_new2 = (C26699Adr) ((ProductReviewFragment) aqS174S0200000_12.l0)._$_findCachedViewById(R.id.j0o);
                    o.LJIIIIZZ(review_filter_group_new2, "review_filter_group_new");
                    productReviewFragment4.wl(horizontal_scroll_view_group_new, review_filter_group_new2, arrayList);
                    View sort_icon = ((ProductReviewFragment) aqS174S0200000_12.l0)._$_findCachedViewById(R.id.k74);
                    o.LJIIIIZZ(sort_icon, "sort_icon");
                    sort_icon.setVisibility(0);
                } else if (productReviewFragment4.Al()) {
                    ProductReviewFragment productReviewFragment5 = (ProductReviewFragment) aqS174S0200000_12.l0;
                    C26696Ado horizontal_scroll_view_group_ttf = (C26696Ado) productReviewFragment5._$_findCachedViewById(R.id.e7_);
                    o.LJIIIIZZ(horizontal_scroll_view_group_ttf, "horizontal_scroll_view_group_ttf");
                    C26699Adr review_filter_group_ttf = (C26699Adr) ((ProductReviewFragment) aqS174S0200000_12.l0)._$_findCachedViewById(R.id.j0p);
                    o.LJIIIIZZ(review_filter_group_ttf, "review_filter_group_ttf");
                    productReviewFragment5.wl(horizontal_scroll_view_group_ttf, review_filter_group_ttf, arrayList);
                } else {
                    ProductReviewFragment productReviewFragment6 = (ProductReviewFragment) aqS174S0200000_12.l0;
                    C26696Ado horizontal_scroll_view_group = (C26696Ado) productReviewFragment6._$_findCachedViewById(R.id.e78);
                    o.LJIIIIZZ(horizontal_scroll_view_group, "horizontal_scroll_view_group");
                    C26699Adr review_filter_group = (C26699Adr) ((ProductReviewFragment) aqS174S0200000_12.l0)._$_findCachedViewById(R.id.j0n);
                    o.LJIIIIZZ(review_filter_group, "review_filter_group");
                    productReviewFragment6.wl(horizontal_scroll_view_group, review_filter_group, arrayList);
                }
                View view2 = ((ProductReviewFragment) aqS174S0200000_12.l0).getView();
                if (view2 != null) {
                    view2.post(new ARunnableS48S0100000_12((ProductReviewFragment) aqS174S0200000_12.l0, 100));
                }
                ProductReviewFragment productReviewFragment7 = (ProductReviewFragment) aqS174S0200000_12.l0;
                Iterator it2 = arrayList.iterator();
                int i5 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i6 = i5 + 1;
                    if (i5 >= 0) {
                        ReviewFilterStruct reviewFilterStruct2 = (ReviewFilterStruct) next;
                        C70691Rol c70691Rol6 = productReviewFragment7.Hl().LJLLILLLL;
                        if (c70691Rol6 != null) {
                            C70691Rol.LJIILLIIL(c70691Rol6, productReviewFragment7, Integer.valueOf(i6), reviewFilterStruct2, null, null, 24);
                        }
                        i5 = i6;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            } else {
                ProductReviewFragment productReviewFragment8 = (ProductReviewFragment) aqS174S0200000_12.l0;
                if (productReviewFragment8.LLFZ) {
                    View shop_review_list = productReviewFragment8._$_findCachedViewById(R.id.jyi);
                    o.LJIIIIZZ(shop_review_list, "shop_review_list");
                    C26338AVi.LJI(shop_review_list, 0, Integer.valueOf(C45804HyK.LJJI(20)), 0, 0, false, 16);
                } else {
                    View review_list = productReviewFragment8._$_findCachedViewById(R.id.j10);
                    o.LJIIIIZZ(review_list, "review_list");
                    C26338AVi.LJI(review_list, 0, Integer.valueOf(C45804HyK.LJJI(20)), 0, 0, false, 16);
                }
            }
            if (C1GE.LJIILIIL(arrayList2) && C26694Adm.LIZ()) {
                ProductReviewFragment productReviewFragment9 = (ProductReviewFragment) aqS174S0200000_12.l0;
                if (productReviewFragment9.LLFZ) {
                    C26699Adr review_filter_group_new3 = (C26699Adr) productReviewFragment9._$_findCachedViewById(R.id.j0o);
                    o.LJIIIIZZ(review_filter_group_new3, "review_filter_group_new");
                    C26696Ado horizontal_scroll_view_group_new2 = (C26696Ado) ((ProductReviewFragment) aqS174S0200000_12.l0)._$_findCachedViewById(R.id.e79);
                    o.LJIIIIZZ(horizontal_scroll_view_group_new2, "horizontal_scroll_view_group_new");
                    productReviewFragment9.vl(horizontal_scroll_view_group_new2, review_filter_group_new3, arrayList2);
                } else if (productReviewFragment9.Al()) {
                    ProductReviewFragment productReviewFragment10 = (ProductReviewFragment) aqS174S0200000_12.l0;
                    C26699Adr review_filter_group_ttf2 = (C26699Adr) productReviewFragment10._$_findCachedViewById(R.id.j0p);
                    o.LJIIIIZZ(review_filter_group_ttf2, "review_filter_group_ttf");
                    C26696Ado horizontal_scroll_view_group_ttf2 = (C26696Ado) ((ProductReviewFragment) aqS174S0200000_12.l0)._$_findCachedViewById(R.id.e7_);
                    o.LJIIIIZZ(horizontal_scroll_view_group_ttf2, "horizontal_scroll_view_group_ttf");
                    productReviewFragment10.vl(horizontal_scroll_view_group_ttf2, review_filter_group_ttf2, arrayList2);
                } else {
                    ProductReviewFragment productReviewFragment11 = (ProductReviewFragment) aqS174S0200000_12.l0;
                    C26699Adr review_filter_group2 = (C26699Adr) productReviewFragment11._$_findCachedViewById(R.id.j0n);
                    o.LJIIIIZZ(review_filter_group2, "review_filter_group");
                    C26696Ado horizontal_scroll_view_group2 = (C26696Ado) ((ProductReviewFragment) aqS174S0200000_12.l0)._$_findCachedViewById(R.id.e78);
                    o.LJIIIIZZ(horizontal_scroll_view_group2, "horizontal_scroll_view_group");
                    productReviewFragment11.vl(horizontal_scroll_view_group2, review_filter_group2, arrayList2);
                }
                ProductReviewFragment productReviewFragment12 = (ProductReviewFragment) aqS174S0200000_12.l0;
                Iterator it3 = arrayList2.iterator();
                int i7 = 0;
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    int i8 = i7 + 1;
                    if (i7 >= 0) {
                        ReviewFilterStruct reviewFilterStruct3 = (ReviewFilterStruct) next2;
                        C70691Rol c70691Rol7 = productReviewFragment12.Hl().LJLLILLLL;
                        if (c70691Rol7 != null) {
                            C70691Rol.LJIILLIIL(c70691Rol7, productReviewFragment12, Integer.valueOf(i8), reviewFilterStruct3, null, null, 24);
                        }
                        i7 = i8;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            } else {
                ProductReviewFragment productReviewFragment13 = (ProductReviewFragment) aqS174S0200000_12.l0;
                if (productReviewFragment13.LLFZ) {
                    View review_filter_group_new4 = productReviewFragment13._$_findCachedViewById(R.id.j0o);
                    o.LJIIIIZZ(review_filter_group_new4, "review_filter_group_new");
                    review_filter_group_new4.setVisibility(8);
                } else if (productReviewFragment13.Al()) {
                    View review_filter_group_ttf3 = ((ProductReviewFragment) aqS174S0200000_12.l0)._$_findCachedViewById(R.id.j0p);
                    o.LJIIIIZZ(review_filter_group_ttf3, "review_filter_group_ttf");
                    review_filter_group_ttf3.setVisibility(8);
                } else {
                    View review_filter_group3 = ((ProductReviewFragment) aqS174S0200000_12.l0)._$_findCachedViewById(R.id.j0n);
                    o.LJIIIIZZ(review_filter_group3, "review_filter_group");
                    review_filter_group3.setVisibility(8);
                    View view_divider_line = ((ProductReviewFragment) aqS174S0200000_12.l0)._$_findCachedViewById(R.id.n_w);
                    o.LJIIIIZZ(view_divider_line, "view_divider_line");
                    view_divider_line.setVisibility(8);
                }
            }
            if (C53204KuO.LIZ()) {
                ProductReviewFragment productReviewFragment14 = (ProductReviewFragment) aqS174S0200000_12.l0;
                if (((Boolean) productReviewFragment14.LJLIL.getValue()).booleanValue() && (c70691Rol4 = productReviewFragment14.Hl().LJLLILLLL) != null) {
                    c70691Rol4.LJIILJJIL(productReviewFragment14);
                }
                if (((Boolean) productReviewFragment14.LJLILLLLZI.getValue()).booleanValue() && (c70691Rol3 = productReviewFragment14.Hl().LJLLILLLL) != null) {
                    c70691Rol3.LJJIII(productReviewFragment14);
                }
                if (((Boolean) productReviewFragment14.LJLJI.getValue()).booleanValue()) {
                    C70691Rol c70691Rol8 = productReviewFragment14.Hl().LJLLILLLL;
                    if (c70691Rol8 != null) {
                        c70691Rol8.LJIIIZ(productReviewFragment14);
                    }
                    C70691Rol c70691Rol9 = productReviewFragment14.Hl().LJLLILLLL;
                    if (c70691Rol9 != null) {
                        c70691Rol9.LJIIJJI(productReviewFragment14);
                    }
                    C70691Rol c70691Rol10 = productReviewFragment14.Hl().LJLLILLLL;
                    if (c70691Rol10 != null) {
                        c70691Rol10.LJJIJL(productReviewFragment14);
                    }
                }
                if (((Boolean) productReviewFragment14.LJLJJI.getValue()).booleanValue() && (c70691Rol2 = productReviewFragment14.Hl().LJLLILLLL) != null) {
                    c70691Rol2.LJIIJJI(productReviewFragment14);
                }
                if (((Boolean) productReviewFragment14.LJLJJL.getValue()).booleanValue()) {
                    C70691Rol c70691Rol11 = productReviewFragment14.Hl().LJLLILLLL;
                    if (c70691Rol11 != null) {
                        c70691Rol11.LJJIJL(productReviewFragment14);
                    }
                    C70691Rol c70691Rol12 = productReviewFragment14.Hl().LJLLILLLL;
                    if (c70691Rol12 != null) {
                        c70691Rol12.LJJIIJZLJL(productReviewFragment14);
                    }
                }
                if (((Boolean) productReviewFragment14.LJLJJLL.getValue()).booleanValue() && (c70691Rol = productReviewFragment14.Hl().LJLLILLLL) != null) {
                    c70691Rol.LJIJI(productReviewFragment14);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$25(AqS174S0200000_12 aqS174S0200000_12, Object obj, Object it) {
        InterfaceC73150SnK ListListener = (InterfaceC73150SnK) obj;
        o.LJIIIZ(ListListener, "$this$ListListener");
        o.LJIIIZ(it, "it");
        ListListener.withState(((C74009T2v) aqS174S0200000_12.l0).LJLIL, new AqS178S0100000_12((InterfaceC223218pR) aqS174S0200000_12.l1, (InterfaceC223218pR<Aweme>) 684));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$26(AqS174S0200000_12 aqS174S0200000_12, Object ListListener, Object obj) {
        Throwable throwable = (Throwable) obj;
        o.LJIIIZ(ListListener, "$this$ListListener");
        o.LJIIIZ(throwable, "throwable");
        ((InterfaceC223218pR) aqS174S0200000_12.l0).nc(new Exception(throwable));
        ((C74009T2v) aqS174S0200000_12.l1).LJLJI = false;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$27(AqS174S0200000_12 aqS174S0200000_12, Object obj, Object list) {
        InterfaceC73150SnK ListListener = (InterfaceC73150SnK) obj;
        o.LJIIIZ(ListListener, "$this$ListListener");
        o.LJIIIZ(list, "list");
        ListListener.withState(((C74009T2v) aqS174S0200000_12.l0).LJLIL, new AqS178S0100000_12((InterfaceC223218pR) aqS174S0200000_12.l1, (InterfaceC223218pR<Aweme>) 685));
        ((C74009T2v) aqS174S0200000_12.l0).LJLJI = false;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$28(AqS174S0200000_12 aqS174S0200000_12, Object selectSubscribe, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        ViewGroup.LayoutParams layoutParams = ((PdpHeadViewHolder) aqS174S0200000_12.l0)._$_findCachedViewById(R.id.ck6).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (booleanValue) {
            ((C70637Rnt) aqS174S0200000_12.l1).LIZJ(marginLayoutParams.leftMargin, C45804HyK.LJJI(24), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        } else {
            ((C70637Rnt) aqS174S0200000_12.l1).LIZJ(marginLayoutParams.leftMargin, C45804HyK.LJJI(65), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$29(AqS174S0200000_12 aqS174S0200000_12, Object selectSubscribe, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        Boolean bool = ((E86) ((AssemViewModel) ((QnaAskQuestionAssem) aqS174S0200000_12.l0).LJLJJL.getValue()).getState()).LJLJJI;
        int i = 0;
        if (bool != null && bool.booleanValue()) {
            View view = (View) aqS174S0200000_12.l1;
            if (booleanValue) {
                i = 8;
            }
            view.setVisibility(i);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS174S0200000_12 aqS174S0200000_12, Object selectSubscribe, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        ViewGroup.LayoutParams layoutParams = ((GlobalHeaderVH) aqS174S0200000_12.l0)._$_findCachedViewById(R.id.ck6).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (booleanValue) {
            ((C70637Rnt) aqS174S0200000_12.l1).LIZJ(marginLayoutParams.leftMargin, C45804HyK.LJJI(24), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        } else {
            ((C70637Rnt) aqS174S0200000_12.l1).LIZJ(marginLayoutParams.leftMargin, C45804HyK.LJJI(65), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$30(AqS174S0200000_12 aqS174S0200000_12, Object obj, Object list) {
        InterfaceC73150SnK ListListener = (InterfaceC73150SnK) obj;
        o.LJIIIZ(ListListener, "$this$ListListener");
        o.LJIIIZ(list, "list");
        ListListener.withState(((C74003T2p) aqS174S0200000_12.l0).LJLIL, new AqS178S0100000_12((InterfaceC223218pR) aqS174S0200000_12.l1, (InterfaceC223218pR<Aweme>) 725));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$31(AqS174S0200000_12 aqS174S0200000_12, Object ListListener, Object obj) {
        Throwable throwable = (Throwable) obj;
        o.LJIIIZ(ListListener, "$this$ListListener");
        o.LJIIIZ(throwable, "throwable");
        ((InterfaceC223218pR) aqS174S0200000_12.l0).nc(new Exception(throwable));
        ((C74003T2p) aqS174S0200000_12.l1).LJLJI = false;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$32(AqS174S0200000_12 aqS174S0200000_12, Object obj, Object list) {
        InterfaceC73150SnK ListListener = (InterfaceC73150SnK) obj;
        o.LJIIIZ(ListListener, "$this$ListListener");
        o.LJIIIZ(list, "list");
        SearchJediViewModel searchJediViewModel = ((C74003T2p) aqS174S0200000_12.l0).LJLIL;
        o.LJI(searchJediViewModel);
        ListListener.withState(searchJediViewModel, new AqS178S0100000_12((InterfaceC223218pR) aqS174S0200000_12.l1, (InterfaceC223218pR<Aweme>) 726));
        ((C74003T2p) aqS174S0200000_12.l0).LJLJI = false;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS174S0200000_12 aqS174S0200000_12, Object obj, Object obj2) {
        ((Number) obj).intValue();
        int intValue = ((Number) obj2).intValue();
        C8YF c8yf = (C8YF) ((PowerAdapter) aqS174S0200000_12.l0).LJLLI.getValue();
        PowerAdapter powerAdapter = (PowerAdapter) aqS174S0200000_12.l0;
        PowerStub LJFF = ((SIT) aqS174S0200000_12.l1).LJFF();
        Iterator it = ((ArrayList) powerAdapter.LLIIJI()).iterator();
        int i = 0;
        while (it.hasNext()) {
            PowerStub powerStub = (PowerStub) it.next();
            if (o.LJ(powerStub, LJFF)) {
                break;
            }
            i += ((ArrayList) powerStub.LJZ).size();
        }
        c8yf.LJFF(i, intValue);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS174S0200000_12 aqS174S0200000_12, Object obj, Object it) {
        InterfaceC73150SnK ListListener = (InterfaceC73150SnK) obj;
        o.LJIIIZ(ListListener, "$this$ListListener");
        o.LJIIIZ(it, "it");
        ListListener.withState(((C74010T2w) aqS174S0200000_12.l0).LJLIL, new AqS178S0100000_12((InterfaceC223218pR) aqS174S0200000_12.l1, (InterfaceC223218pR<Aweme>) 104));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS174S0200000_12 aqS174S0200000_12, Object ListListener, Object obj) {
        Throwable throwable = (Throwable) obj;
        o.LJIIIZ(ListListener, "$this$ListListener");
        o.LJIIIZ(throwable, "throwable");
        ((InterfaceC223218pR) aqS174S0200000_12.l0).nc(new Exception(throwable));
        ((C74010T2w) aqS174S0200000_12.l1).LJLJI = false;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS174S0200000_12 aqS174S0200000_12, Object obj, Object it) {
        InterfaceC73150SnK ListListener = (InterfaceC73150SnK) obj;
        o.LJIIIZ(ListListener, "$this$ListListener");
        o.LJIIIZ(it, "it");
        ListListener.withState(((C74010T2w) aqS174S0200000_12.l0).LJLIL, new AqS178S0100000_12((InterfaceC223218pR) aqS174S0200000_12.l1, (InterfaceC223218pR<Aweme>) 105));
        ((C74010T2w) aqS174S0200000_12.l0).LJLJI = false;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS174S0200000_12 aqS174S0200000_12, Object selectSubscribe, Object obj) {
        String str;
        TradeEntranceInfo tradeEntranceInfo = (TradeEntranceInfo) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        String str2 = null;
        if (tradeEntranceInfo != null) {
            str = tradeEntranceInfo.getSchema();
        } else {
            str = null;
        }
        if (C78685UuP.LJJJZ(str)) {
            MessageCenterAssem messageCenterAssem = (MessageCenterAssem) aqS174S0200000_12.l0;
            if (tradeEntranceInfo != null) {
                str2 = tradeEntranceInfo.getSchema();
            }
            View view = (View) aqS174S0200000_12.l1;
            messageCenterAssem.getClass();
            C252709vu c252709vu = (C252709vu) view.findViewById(R.id.gwg);
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_clipboard_ltr;
            LIZJ.LIZIZ(new C71031RuF(view, messageCenterAssem, str2));
            c252709vu.LIZIZ(LIZJ);
            View findViewById = view.findViewById(R.id.gwg).findViewById(R.id.gwr);
            String enterFrom = messageCenterAssem.E3().LJLILLLLZI;
            o.LJIIIZ(enterFrom, "enterFrom");
            if (findViewById != null) {
                C78946Uyc.LJJIIJZLJL(findViewById, new C70999Rtj(), C71032RuG.LJLIL, new AqS35S1000000_12(enterFrom, 14));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS174S0200000_12 aqS174S0200000_12, Object obj, Object obj2) {
        Integer buttonActionType;
        String str;
        Context context;
        ButtonAction buttonAction = (ButtonAction) obj2;
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        if (buttonAction != null && (buttonActionType = buttonAction.getButtonActionType()) != null && buttonActionType.intValue() == 3) {
            ButtonActionInfo buttonActionInfo = buttonAction.getButtonActionInfo();
            String str2 = null;
            if (buttonActionInfo != null) {
                str = buttonActionInfo.getSchema();
            } else {
                str = null;
            }
            if (C78685UuP.LJJJZ(str)) {
                View view = (View) aqS174S0200000_12.l0;
                if (view != null) {
                    context = view.getContext();
                } else {
                    context = null;
                }
                IPdpStarter.PdpEnterParam pdpEnterParam = ((PdpViewModel) aqS174S0200000_12.l1).LJLJJLL;
                ButtonActionInfo buttonActionInfo2 = buttonAction.getButtonActionInfo();
                if (buttonActionInfo2 != null) {
                    str2 = buttonActionInfo2.getSchema();
                }
                C70172RgO.LIZJ(context, pdpEnterParam, "product_detail", str2, false);
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS174S0200000_12(X.InterfaceC223218pR r3, X.C74009T2v r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 25: goto Lf;
                case 26: goto L5;
                case 27: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 2
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS174S0200000_12.<init>(X.8pR, X.T2v, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS174S0200000_12(X.InterfaceC223218pR r3, X.C74010T2w r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 5: goto Lf;
                case 6: goto L5;
                case 7: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 2
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS174S0200000_12.<init>(X.8pR, X.T2w, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS174S0200000_12(android.view.View r3, com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 2: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 2
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS174S0200000_12.<init>(android.view.View, com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS174S0200000_12(S4U s4u, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = s4u;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS174S0200000_12(C71897SJp c71897SJp, ChooseStyleCell chooseStyleCell, int i) {
        super(2);
        this.$t = i;
        this.l0 = c71897SJp;
        this.l1 = chooseStyleCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS174S0200000_12(InterfaceC72696Sg0 interfaceC72696Sg0, ProfileNaviEditorViewModel profileNaviEditorViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC72696Sg0;
        this.l1 = profileNaviEditorViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS174S0200000_12(C73181Snp c73181Snp, ListViewModel listViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = c73181Snp;
        this.l1 = listViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS174S0200000_12(PowerAdapter powerAdapter, SIT sit, int i) {
        super(2);
        this.$t = i;
        this.l0 = powerAdapter;
        this.l1 = sit;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS174S0200000_12(MessageCenterAssem messageCenterAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = messageCenterAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS174S0200000_12(PaymentViewModel paymentViewModel, PaymentMethod paymentMethod, int i) {
        super(2);
        this.$t = i;
        this.l0 = paymentViewModel;
        this.l1 = paymentMethod;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS174S0200000_12(PdpHeadViewHolder pdpHeadViewHolder, C70637Rnt c70637Rnt, int i) {
        super(2);
        this.$t = i;
        this.l0 = pdpHeadViewHolder;
        this.l1 = c70637Rnt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS174S0200000_12(PdpBodyWidget pdpBodyWidget, C69643RUx c69643RUx, int i) {
        super(2);
        this.$t = i;
        this.l0 = pdpBodyWidget;
        this.l1 = c69643RUx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS174S0200000_12(ProductReviewFragment productReviewFragment, C70782RqE c70782RqE, int i) {
        super(2);
        this.$t = i;
        this.l0 = productReviewFragment;
        this.l1 = c70782RqE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS174S0200000_12(ProductReviewFragment productReviewFragment, C73305Spp c73305Spp, int i) {
        super(2);
        this.$t = i;
        this.l0 = productReviewFragment;
        this.l1 = c73305Spp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS174S0200000_12(ReviewFragment reviewFragment, Option option, int i) {
        super(2);
        this.$t = i;
        this.l0 = reviewFragment;
        this.l1 = option;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS174S0200000_12(SkuPanelViewModel skuPanelViewModel, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = skuPanelViewModel;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS174S0200000_12(SkuPanelBottomWidget skuPanelBottomWidget, C69684RWm c69684RWm, int i) {
        super(2);
        this.$t = i;
        this.l0 = skuPanelBottomWidget;
        this.l1 = c69684RWm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS174S0200000_12(SkuPanelCounterWidget skuPanelCounterWidget, SkuPanelViewModel skuPanelViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = skuPanelCounterWidget;
        this.l1 = skuPanelViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS174S0200000_12(GlobalHeaderVH globalHeaderVH, C70637Rnt c70637Rnt, int i) {
        super(2);
        this.$t = i;
        this.l0 = globalHeaderVH;
        this.l1 = c70637Rnt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS174S0200000_12(TtfHeadVH ttfHeadVH, C70637Rnt c70637Rnt, int i) {
        super(2);
        this.$t = i;
        this.l0 = ttfHeadVH;
        this.l1 = c70637Rnt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS174S0200000_12(UsHeaderVH usHeaderVH, C70637Rnt c70637Rnt, int i) {
        super(2);
        this.$t = i;
        this.l0 = usHeaderVH;
        this.l1 = c70637Rnt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS174S0200000_12(EffectEditAssem effectEditAssem, TuxTextView tuxTextView, int i) {
        super(2);
        this.$t = i;
        this.l0 = effectEditAssem;
        this.l1 = tuxTextView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS174S0200000_12(QnaAskQuestionAssem qnaAskQuestionAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = qnaAskQuestionAssem;
        this.l1 = view;
    }
}
