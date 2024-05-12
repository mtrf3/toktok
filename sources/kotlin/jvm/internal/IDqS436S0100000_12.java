package kotlin.jvm.internal;

import X.ASQ;
import X.ASX;
import X.AbstractC65781Prl;
import X.AbstractC70398Rk2;
import X.AnonymousClass636;
import X.C04330Ez;
import X.C139825eE;
import X.C157166Eu;
import X.C16880lQ;
import X.C188727au;
import X.C2068389v;
import X.C245319jz;
import X.C252659vp;
import X.C26049AKf;
import X.C26338AVi;
import X.C26773Af3;
import X.C32151Nz;
import X.C32I;
import X.C36746EbW;
import X.C43I;
import X.C45804HyK;
import X.C46183IAp;
import X.C46239ICt;
import X.C47261Igj;
import X.C57802MmM;
import X.C61878OQg;
import X.C70053ReT;
import X.C70109RfN;
import X.C70177RgT;
import X.C70179RgV;
import X.C70282RiA;
import X.C70399Rk3;
import X.C70400Rk4;
import X.C70404Rk8;
import X.C70597RnF;
import X.C70607RnP;
import X.C70611RnT;
import X.C70892Rs0;
import X.C70920RsS;
import X.C70990Rta;
import X.C71109RvV;
import X.C71113RvZ;
import X.C72793ShZ;
import X.C72808Sho;
import X.C72981Skb;
import X.C73305Spp;
import X.C73306Spq;
import X.C73974T1m;
import X.C74326TFa;
import X.C74496TLo;
import X.C76800UCe;
import X.C78857UxB;
import X.C78880UxY;
import X.C78946Uyc;
import X.C78983UzD;
import X.C82682Wcg;
import X.EnumC70239RhT;
import X.FMX;
import X.InterfaceC57784Mm4;
import X.InterfaceC70386Rjq;
import X.InterfaceC73150SnK;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.J8V;
import X.O6R;
import X.OSZ;
import X.OUP;
import X.SF8;
import X.SI2;
import X.SI3;
import X.SR2;
import X.SRH;
import X.SYL;
import X.T4V;
import X.TAH;
import X.TFR;
import X.TFS;
import X.TFX;
import X.TFY;
import X.TFZ;
import X.TL5;
import X.V16;
import X.WHL;
import X.Z9N;
import Y.ACListenerS21S0100000_1;
import Y.ACListenerS32S0100000_12;
import Y.ARunnableS48S0100000_12;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment;
import com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceAnchorPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.cpf.CpfVH;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment.SubPaymentListAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CpfElem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.PdpInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BlockPageInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomAreaElem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Tab;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBodyWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpHeadNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.base.review.OptionPickerDialogFragmentV1;
import com.ss.android.ugc.aweme.ecommerce.base.review.OptionV1;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragmentV1;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelCounterWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuWidget;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommerce.core.view.CommerceProductInfoView;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.productinfo.UsProductInfoVH;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.sku.UsSkuVH;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.widget.UsPdpBottomNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.tts.sku.us.widget.UsSkuWidget;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data.DaInfo;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data.TcLine;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data.VoucherInfo;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfoWrapper;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcAvatarListAssem;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditAssem;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageFragment;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class IDqS436S0100000_12 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case 9:
                return invoke$9(this, obj, obj2, obj3);
            case 10:
                return invoke$10(this, obj, obj2, obj3);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj, obj2, obj3);
            case 12:
                return invoke$12(this, obj, obj2, obj3);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj, obj2, obj3);
            case 14:
                return invoke$14(this, obj, obj2, obj3);
            case 15:
                return invoke$15(this, obj, obj2, obj3);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj, obj2, obj3);
            case 17:
                return invoke$17(this, obj, obj2, obj3);
            case 18:
                return invoke$18(this, obj, obj2, obj3);
            case 19:
                return invoke$19(this, obj, obj2, obj3);
            case 20:
                return invoke$20(this, obj, obj2, obj3);
            case 21:
                return invoke$21(this, obj, obj2, obj3);
            case 22:
                return invoke$22(this, obj, obj2, obj3);
            case 23:
                return invoke$23(this, obj, obj2, obj3);
            case 24:
                return invoke$24(this, obj, obj2, obj3);
            case 25:
                return invoke$25(this, obj, obj2, obj3);
            case 26:
                return invoke$26(this, obj, obj2, obj3);
            case 27:
                return invoke$27(this, obj, obj2, obj3);
            case 28:
                return invoke$28(this, obj, obj2, obj3);
            case 29:
                return invoke$29(this, obj, obj2, obj3);
            case 30:
                return invoke$30(this, obj, obj2, obj3);
            case 31:
                return invoke$31(this, obj, obj2, obj3);
            case 32:
                return invoke$32(this, obj, obj2, obj3);
            case 33:
                return invoke$33(this, obj, obj2, obj3);
            case 34:
                return invoke$34(this, obj, obj2, obj3);
            case 35:
                return invoke$35(this, obj, obj2, obj3);
            case 36:
                return invoke$36(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS436S0100000_12(C26773Af3 c26773Af3, int i) {
        super(3);
        this.$t = i;
        this.l0 = c26773Af3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS436S0100000_12(C46183IAp c46183IAp, int i) {
        super(3);
        this.$t = i;
        this.l0 = c46183IAp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS436S0100000_12(C71113RvZ c71113RvZ, int i) {
        super(3);
        this.$t = i;
        this.l0 = c71113RvZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS436S0100000_12(C72981Skb c72981Skb, int i) {
        super(3);
        this.$t = i;
        this.l0 = c72981Skb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS436S0100000_12(TL5 tl5, int i) {
        super(3);
        this.$t = i;
        this.l0 = tl5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS436S0100000_12(C74496TLo c74496TLo, int i) {
        super(3);
        this.$t = i;
        this.l0 = c74496TLo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS436S0100000_12(PowerAdapter powerAdapter, int i) {
        super(3);
        this.$t = i;
        this.l0 = powerAdapter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS436S0100000_12(ChallengeDetailFragment challengeDetailFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = challengeDetailFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS436S0100000_12(ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = eCommerceAnchorPanelFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS436S0100000_12(CpfVH cpfVH, int i) {
        super(3);
        this.$t = i;
        this.l0 = cpfVH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS436S0100000_12(SubPaymentListAssem subPaymentListAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = subPaymentListAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS436S0100000_12(PdpInfoViewHolder pdpInfoViewHolder, int i) {
        super(3);
        this.$t = i;
        this.l0 = pdpInfoViewHolder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS436S0100000_12(PdpBodyWidget pdpBodyWidget, int i) {
        super(3);
        this.$t = i;
        this.l0 = pdpBodyWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS436S0100000_12(PdpHeadNavBarWidget pdpHeadNavBarWidget, int i) {
        super(3);
        this.$t = i;
        this.l0 = pdpHeadNavBarWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS436S0100000_12(OptionPickerDialogFragmentV1 optionPickerDialogFragmentV1, int i) {
        super(3);
        this.$t = i;
        this.l0 = optionPickerDialogFragmentV1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS436S0100000_12(ProductReviewViewModel productReviewViewModel, int i) {
        super(3);
        this.$t = i;
        this.l0 = productReviewViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS436S0100000_12(ReviewFragmentV1 reviewFragmentV1, int i) {
        super(3);
        this.$t = i;
        this.l0 = reviewFragmentV1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS436S0100000_12(SkuPanelBottomWidget skuPanelBottomWidget, int i) {
        super(3);
        this.$t = i;
        this.l0 = skuPanelBottomWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS436S0100000_12(SkuPanelCounterWidget skuPanelCounterWidget, int i) {
        super(3);
        this.$t = i;
        this.l0 = skuPanelCounterWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS436S0100000_12(SkuWidget skuWidget, int i) {
        super(3);
        this.$t = i;
        this.l0 = skuWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS436S0100000_12(UsProductInfoVH usProductInfoVH, int i) {
        super(3);
        this.$t = i;
        this.l0 = usProductInfoVH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS436S0100000_12(UsSkuVH usSkuVH, int i) {
        super(3);
        this.$t = i;
        this.l0 = usSkuVH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS436S0100000_12(UsPdpBottomNavBarWidget usPdpBottomNavBarWidget, int i) {
        super(3);
        this.$t = i;
        this.l0 = usPdpBottomNavBarWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS436S0100000_12(UsSkuWidget usSkuWidget, int i) {
        super(3);
        this.$t = i;
        this.l0 = usSkuWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS436S0100000_12(ProfileAigcAvatarListAssem profileAigcAvatarListAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = profileAigcAvatarListAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS436S0100000_12(EffectEditAssem effectEditAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = effectEditAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS436S0100000_12(MufListPageFragment mufListPageFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = mufListPageFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS436S0100000_12(EffectTemplateCategoryFragment effectTemplateCategoryFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = effectTemplateCategoryFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS436S0100000_12(AqS178S0100000_12 aqS178S0100000_12, int i) {
        super(3);
        this.$t = i;
        this.l0 = aqS178S0100000_12;
    }

    public final void invoke$0(TextView title, TextView desc, TextView button) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(desc, "desc");
        o.LJIIIZ(button, "button");
        title.setText(R.string.tbz);
        desc.setText(R.string.tby);
        button.setText(R.string.tc5);
        C16880lQ.LJIJI(button, new ACListenerS32S0100000_12(this, 82));
    }

    public final void invoke$1(TextView title, TextView desc, TextView button) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(desc, "desc");
        o.LJIIIZ(button, "button");
        title.setText(R.string.tbz);
        desc.setText(R.string.tby);
        button.setText(R.string.tc5);
        C16880lQ.LJIJI(button, new ACListenerS32S0100000_12(this, 97));
    }

    public final void invoke$2(TextView title, TextView desc, TextView button) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(desc, "desc");
        o.LJIIIZ(button, "button");
        title.setText(R.string.tbz);
        desc.setText(R.string.tby);
        button.setText(R.string.tc5);
        C16880lQ.LJIJI(button, new ACListenerS32S0100000_12(this, 108));
    }

    public final void invoke$3(TextView title, TextView desc, TextView button) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(desc, "desc");
        o.LJIIIZ(button, "button");
        title.setText(R.string.tbz);
        title.setTextColor(C04330Ez.LIZIZ(((C74496TLo) this.l0).LJJIFFI, R.color.ck));
        desc.setText(R.string.tby);
        desc.setTextColor(C04330Ez.LIZIZ(((C74496TLo) this.l0).LJJIFFI, R.color.ck));
        button.setText(R.string.tc5);
        button.setTextColor(C04330Ez.LIZIZ(((C74496TLo) this.l0).LJJIFFI, R.color.ck));
        C16880lQ.LJIJI(button, new ACListenerS32S0100000_12((C74496TLo) this.l0, 125));
    }

    public final void invoke$4(TextView title, TextView desc, TextView button) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(desc, "desc");
        o.LJIIIZ(button, "button");
        title.setText(R.string.tbz);
        desc.setText(R.string.tby);
        button.setText(R.string.tc5);
        C16880lQ.LJIJI(button, new ACListenerS32S0100000_12((EffectTemplateCategoryFragment) this.l0, 169));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (r3 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007c, code lost:
    
        if (r3 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0089, code lost:
    
        if (r5 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.IDqS436S0100000_12 r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            android.view.View r9 = (android.view.View) r9
            java.lang.Number r10 = (java.lang.Number) r10
            r10.floatValue()
            java.lang.Number r11 = (java.lang.Number) r11
            float r7 = r11.floatValue()
            java.lang.String r0 = "target"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.Object r2 = r8.l0
            com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceAnchorPanelFragment r2 = (com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceAnchorPanelFragment) r2
            int r1 = r2.LLIIIILZ
            r0 = 3
            r6 = 0
            r4 = 1
            if (r1 == r0) goto L20
            r0 = 4
            if (r1 != r0) goto L8e
        L20:
            r5 = 1
        L21:
            X.VWR r0 = r2.LJLZ
            if (r0 == 0) goto L8c
            boolean r0 = r0.LJII()
            if (r0 != 0) goto L8c
            r0 = 1
        L2c:
            r3 = r0 ^ 1
            boolean r0 = r9 instanceof X.C45631qh
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L5c
            if (r5 == 0) goto L53
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 >= 0) goto L5a
            boolean r0 = r9.canScrollVertically(r1)
            if (r0 == 0) goto L5a
            r1 = 1
        L41:
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto L58
            boolean r0 = r9.canScrollVertically(r4)
            if (r0 == 0) goto L58
            r0 = 1
        L4c:
            if (r1 != 0) goto L52
            if (r0 != 0) goto L52
            if (r3 != 0) goto L53
        L52:
            r6 = 1
        L53:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        L58:
            r0 = 0
            goto L4c
        L5a:
            r1 = 0
            goto L41
        L5c:
            boolean r0 = r9 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto L83
            if (r5 == 0) goto L53
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 >= 0) goto L81
            boolean r0 = r9.canScrollVertically(r1)
            if (r0 == 0) goto L81
            r1 = 1
        L6d:
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto L7f
            boolean r0 = r9.canScrollVertically(r4)
            if (r0 == 0) goto L7f
            r0 = 1
        L78:
            if (r1 != 0) goto L52
            if (r0 != 0) goto L52
            if (r3 != 0) goto L53
            goto L52
        L7f:
            r0 = 0
            goto L78
        L81:
            r1 = 0
            goto L6d
        L83:
            boolean r0 = r9 instanceof X.C80217Ve1
            if (r0 == 0) goto L53
            if (r3 != 0) goto L53
            if (r5 == 0) goto L53
            goto L52
        L8c:
            r0 = 0
            goto L2c
        L8e:
            r5 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS436S0100000_12.invoke$0(kotlin.jvm.internal.IDqS436S0100000_12, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(IDqS436S0100000_12 iDqS436S0100000_12, Object selectSubscribe, Object obj, Object obj2) {
        ViewTreeObserver viewTreeObserver;
        PdpBottomAreaElem pdpBottomAreaElem = (PdpBottomAreaElem) obj;
        LinkRichText linkRichText = (LinkRichText) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        UsPdpBottomNavBarWidget usPdpBottomNavBarWidget = (UsPdpBottomNavBarWidget) iDqS436S0100000_12.l0;
        int i = 0;
        if (pdpBottomAreaElem == null) {
            View skeleton = usPdpBottomNavBarWidget._$_findCachedViewById(R.id.k1x);
            o.LJIIIIZZ(skeleton, "skeleton");
            skeleton.setVisibility(0);
            View button_container = usPdpBottomNavBarWidget._$_findCachedViewById(R.id.b21);
            o.LJIIIIZZ(button_container, "button_container");
            button_container.setVisibility(8);
        } else {
            View skeleton2 = usPdpBottomNavBarWidget._$_findCachedViewById(R.id.k1x);
            o.LJIIIIZZ(skeleton2, "skeleton");
            skeleton2.setVisibility(8);
            View button_container2 = usPdpBottomNavBarWidget._$_findCachedViewById(R.id.b21);
            o.LJIIIIZZ(button_container2, "button_container");
            button_container2.setVisibility(0);
            List<PdpButton> list = pdpBottomAreaElem.buttons;
            if (list != null) {
                ((C70179RgV) usPdpBottomNavBarWidget._$_findCachedViewById(R.id.b21)).setEnableButtonVibration(true);
                ((C70179RgV) usPdpBottomNavBarWidget._$_findCachedViewById(R.id.b21)).LIZ(list);
            }
            if (pdpBottomAreaElem.statusNotice != null || pdpBottomAreaElem.statusSubNotice != null) {
                View layout_tips = usPdpBottomNavBarWidget._$_findCachedViewById(R.id.fmz);
                o.LJIIIIZZ(layout_tips, "layout_tips");
                layout_tips.setVisibility(0);
                TuxTextView tv_tips = (TuxTextView) usPdpBottomNavBarWidget._$_findCachedViewById(R.id.mo5);
                o.LJIIIIZZ(tv_tips, "tv_tips");
                usPdpBottomNavBarWidget.updateTip(tv_tips, pdpBottomAreaElem.statusNotice);
                TuxTextView tv_sub_tips = (TuxTextView) usPdpBottomNavBarWidget._$_findCachedViewById(R.id.mlq);
                o.LJIIIIZZ(tv_sub_tips, "tv_sub_tips");
                usPdpBottomNavBarWidget.updateTip(tv_sub_tips, pdpBottomAreaElem.statusSubNotice);
            } else {
                View layout_tips2 = usPdpBottomNavBarWidget._$_findCachedViewById(R.id.fmz);
                o.LJIIIIZZ(layout_tips2, "layout_tips");
                layout_tips2.setVisibility(8);
            }
        }
        UsPdpBottomNavBarWidget usPdpBottomNavBarWidget2 = (UsPdpBottomNavBarWidget) iDqS436S0100000_12.l0;
        View tv_buyer_protection = usPdpBottomNavBarWidget2._$_findCachedViewById(R.id.m1a);
        o.LJIIIIZZ(tv_buyer_protection, "tv_buyer_protection");
        if (linkRichText == null) {
            i = 8;
        }
        tv_buyer_protection.setVisibility(i);
        if (linkRichText != null) {
            if (!usPdpBottomNavBarWidget2.LJLJI) {
                usPdpBottomNavBarWidget2.LJLJI = true;
                C78946Uyc.LJJII(usPdpBottomNavBarWidget2.LJLIL, new C70920RsS(), C70177RgT.LJLIL);
            }
            ((TextView) usPdpBottomNavBarWidget2._$_findCachedViewById(R.id.m1a)).setText(RichTextUtil.LIZJ(RichTextUtil.LIZ, usPdpBottomNavBarWidget2.getContext(), linkRichText, null, 0, false, null, null, 124));
            ((TextView) usPdpBottomNavBarWidget2._$_findCachedViewById(R.id.m1a)).setTextColor(linkRichText.LIZ(usPdpBottomNavBarWidget2.getContext()));
            View tv_buyer_protection2 = usPdpBottomNavBarWidget2._$_findCachedViewById(R.id.m1a);
            o.LJIIIIZZ(tv_buyer_protection2, "tv_buyer_protection");
            C16880lQ.LJIIJ(new Au2S19S0200000_12(linkRichText, usPdpBottomNavBarWidget2, 3, 42), tv_buyer_protection2);
        }
        UsPdpBottomNavBarWidget usPdpBottomNavBarWidget3 = (UsPdpBottomNavBarWidget) iDqS436S0100000_12.l0;
        if (!usPdpBottomNavBarWidget3.LJLJJI) {
            usPdpBottomNavBarWidget3.LJLJJI = true;
            View view = usPdpBottomNavBarWidget3.contentView;
            if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(usPdpBottomNavBarWidget3.LJLJJLL);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(IDqS436S0100000_12 iDqS436S0100000_12, Object obj, Object obj2, Object obj3) {
        ViewGroup parent = (ViewGroup) obj2;
        o.LJIIIZ(parent, "parent");
        return ((SkuWidget) iDqS436S0100000_12.l0).LIZ(((Number) obj).intValue(), parent, (String) obj3);
    }

    public static final Object invoke$11(IDqS436S0100000_12 iDqS436S0100000_12, Object obj, Object obj2, Object obj3) {
        ViewGroup parent = (ViewGroup) obj2;
        o.LJIIIZ(parent, "parent");
        return ((SkuWidget) iDqS436S0100000_12.l0).LIZ(((Number) obj).intValue(), parent, (String) obj3);
    }

    public static final Object invoke$12(IDqS436S0100000_12 iDqS436S0100000_12, Object obj, Object obj2, Object obj3) {
        RecyclerView.ViewHolder selectSubscribe = (RecyclerView.ViewHolder) obj;
        Boolean bool = (Boolean) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (bool != null) {
            bool.booleanValue();
            if (booleanValue) {
                UsProductInfoVH usProductInfoVH = (UsProductInfoVH) iDqS436S0100000_12.l0;
                if (!usProductInfoVH.LJLILLLLZI) {
                    usProductInfoVH.LJLILLLLZI = true;
                    C70607RnP L = usProductInfoVH.L();
                    View favoriteBtn = L.getFavoriteBtn();
                    if (L.getVisibility() == 0 && favoriteBtn.getVisibility() == 0) {
                        Context context = L.getContext();
                        o.LJIIIIZZ(context, "view.context");
                        C139825eE c139825eE = new C139825eE(context);
                        String string = L.getContext().getString(R.string.fbr);
                        o.LJIIIIZZ(string, "view.context.getString(R…dp_favorite_button_guide)");
                        c139825eE.LIZJ = string;
                        c139825eE.LIZ.LIZIZ = favoriteBtn;
                        c139825eE.LJI(WHL.TOP);
                        C82682Wcg c82682Wcg = c139825eE.LIZ;
                        c82682Wcg.LJIIIZ = true;
                        c82682Wcg.LJIIL = true;
                        c139825eE.LIZJ().show();
                    }
                    View itemView = selectSubscribe.itemView;
                    o.LJIIIIZZ(itemView, "itemView");
                    C78946Uyc.LJJIIJ(itemView, new C70892Rs0(), C70611RnT.LJLIL);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(IDqS436S0100000_12 iDqS436S0100000_12, Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String toastMsg = (String) obj2;
        o.LJIIIZ(toastMsg, "toastMsg");
        if (!booleanValue) {
            C26049AKf.LIZ(((UsSkuVH) iDqS436S0100000_12.l0).itemView, toastMsg);
        } else {
            PdpViewModel vm = ((UsSkuVH) iDqS436S0100000_12.l0).getVm();
            Context context = ((UsSkuVH) iDqS436S0100000_12.l0).itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            vm.Pv0(context, ((UsSkuVH) iDqS436S0100000_12.l0).getFragment().getView(), toastMsg, obj3, LifecycleOwnerKt.getLifecycleScope((UsSkuVH) iDqS436S0100000_12.l0));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(IDqS436S0100000_12 iDqS436S0100000_12, Object selectSubscribe, Object state, Object obj) {
        List<SaleProp> list;
        List<SaleProp> list2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(state, "state");
        o.LJIIIZ(obj, "<anonymous parameter 1>");
        try {
            if (state == EnumC70239RhT.SUCCESS) {
                C45804HyK.LJJLIIIJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), (LinearLayout) ((UsSkuWidget) iDqS436S0100000_12.l0)._$_findCachedViewById(R.id.k2r));
                if (((LinearLayout) ((UsSkuWidget) iDqS436S0100000_12.l0)._$_findCachedViewById(R.id.kau)).getChildCount() > 0) {
                    ((LinearLayout) ((UsSkuWidget) iDqS436S0100000_12.l0)._$_findCachedViewById(R.id.kau)).removeAllViews();
                }
                SkuInfo skuInfo = ((UsSkuWidget) iDqS436S0100000_12.l0).getMViewModel().LJLLILLLL;
                if (skuInfo != null && (list2 = skuInfo.salePropList) != null) {
                    C70053ReT.LIZIZ(list2);
                }
                ArrayList arrayList = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                SkuInfo skuInfo2 = ((UsSkuWidget) iDqS436S0100000_12.l0).getMViewModel().LJLLILLLL;
                if (skuInfo2 != null && (list = skuInfo2.salePropList) != null) {
                    int i = 0;
                    for (SaleProp saleProp : list) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            SaleProp saleProp2 = saleProp;
                            List<SalePropValue> list3 = saleProp2.salePropValueList;
                            if (list3 != null && list3.size() == 1) {
                                arrayList.add(saleProp2);
                            } else {
                                List<SalePropValue> list4 = saleProp2.salePropValueList;
                                if (list4 != null && list4.size() > 1) {
                                    linkedHashMap.put(Integer.valueOf(i), saleProp2);
                                }
                            }
                            i = i2;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                }
                if (arrayList.size() >= 1) {
                    ((UsSkuWidget) iDqS436S0100000_12.l0).LIZ(arrayList);
                }
                if (!linkedHashMap.isEmpty()) {
                    ((UsSkuWidget) iDqS436S0100000_12.l0).LIZIZ(linkedHashMap);
                }
            }
        } catch (Exception e) {
            C78983UzD.LJIJ(e, "UsSkuWidget init error");
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$15(IDqS436S0100000_12 iDqS436S0100000_12, Object selectSubscribe, Object obj, Object obj2) {
        C43I mode = (C43I) obj;
        C43I footerState = (C43I) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(mode, "mode");
        o.LJIIIZ(footerState, "footerState");
        ((ProfileAigcAvatarListAssem) iDqS436S0100000_12.l0).E3((SR2) mode.LIZ, (SRH) footerState.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(IDqS436S0100000_12 iDqS436S0100000_12, Object selectSubscribe, Object obj, Object obj2) {
        String str;
        boolean z;
        String effectName = (String) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(effectName, "effectName");
        int i = TAH.LIZ[((EffectEditAssem) iDqS436S0100000_12.l0).I3().mode.ordinal()];
        boolean z2 = false;
        if (i != 1) {
            if (i == 2) {
                CKEDraftInfoWrapper cKEDraftInfoWrapper = ((EffectEditAssem) iDqS436S0100000_12.l0).I3().draftInfo;
                if ((cKEDraftInfoWrapper != null && C78857UxB.LJJJIL(V16.LJIILJJIL(cKEDraftInfoWrapper))) || obj2 != null) {
                    int i2 = ((EffectEditAssem) iDqS436S0100000_12.l0).LJLJLLL;
                    int length = effectName.length();
                    if (2 <= length && length <= i2) {
                        z2 = true;
                    }
                }
                ((EffectEditAssem) iDqS436S0100000_12.l0).P3().setEnabled(z2);
                ((EffectEditAssem) iDqS436S0100000_12.l0).O3().setEnabled(z2);
            }
        } else {
            NewFaceStickerBean newFaceStickerBean = ((EffectEditAssem) iDqS436S0100000_12.l0).I3().effect;
            if (newFaceStickerBean != null) {
                str = newFaceStickerBean.name;
            } else {
                str = null;
            }
            boolean z3 = !o.LJ(effectName, str);
            if (obj2 != null) {
                z = true;
            } else {
                z = false;
            }
            TextView P3 = ((EffectEditAssem) iDqS436S0100000_12.l0).P3();
            if (z3 || z) {
                int i3 = ((EffectEditAssem) iDqS436S0100000_12.l0).LJLJLLL;
                int length2 = effectName.length();
                if (1 <= length2 && length2 <= i3) {
                    z2 = true;
                }
            }
            P3.setEnabled(z2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(IDqS436S0100000_12 iDqS436S0100000_12, Object selectSubscribe, Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        TFX state = (TFX) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(state, "state");
        if (booleanValue) {
            View view = ((C46183IAp) iDqS436S0100000_12.l0).LJLLLL;
            if (view != null) {
                view.setVisibility(8);
                C46183IAp c46183IAp = (C46183IAp) iDqS436S0100000_12.l0;
                C72793ShZ c72793ShZ = c46183IAp.LLFF;
                if (c72793ShZ != null) {
                    c72793ShZ.submitList(C61878OQg.INSTANCE, new ARunnableS48S0100000_12(c46183IAp, 45));
                }
                ConstraintLayout constraintLayout = ((C46183IAp) iDqS436S0100000_12.l0).LJZ;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(0);
                    TuxTextView tuxTextView = ((C46183IAp) iDqS436S0100000_12.l0).LLD;
                    if (tuxTextView != null) {
                        tuxTextView.setVisibility(8);
                        C72793ShZ c72793ShZ2 = ((C46183IAp) iDqS436S0100000_12.l0).LLFF;
                        if (c72793ShZ2 != null) {
                            c72793ShZ2.LJLZ("", "");
                        }
                    } else {
                        o.LJIJI("searchErrorOrNoResult");
                        throw null;
                    }
                } else {
                    o.LJIJI("gridviewContainer");
                    throw null;
                }
            } else {
                o.LJIJI("clearButton");
                throw null;
            }
        } else {
            View view2 = ((C46183IAp) iDqS436S0100000_12.l0).LJLLLL;
            if (view2 != null) {
                view2.setVisibility(0);
                if (state instanceof TFZ) {
                    C72793ShZ c72793ShZ3 = ((C46183IAp) iDqS436S0100000_12.l0).LLFF;
                    if (c72793ShZ3 != null) {
                        c72793ShZ3.submitList(null);
                    }
                    C72793ShZ c72793ShZ4 = ((C46183IAp) iDqS436S0100000_12.l0).LLFF;
                    if (c72793ShZ4 != null) {
                        c72793ShZ4.LJLZ("", "");
                    }
                    ConstraintLayout constraintLayout2 = ((C46183IAp) iDqS436S0100000_12.l0).LJZ;
                    if (constraintLayout2 != null) {
                        constraintLayout2.setVisibility(0);
                        TuxTextView tuxTextView2 = ((C46183IAp) iDqS436S0100000_12.l0).LLD;
                        if (tuxTextView2 != null) {
                            tuxTextView2.setVisibility(8);
                            ConstraintLayout constraintLayout3 = ((C46183IAp) iDqS436S0100000_12.l0).LJZI;
                            if (constraintLayout3 != null) {
                                constraintLayout3.setVisibility(4);
                            } else {
                                o.LJIJI("searchResultContainer");
                                throw null;
                            }
                        } else {
                            o.LJIJI("searchErrorOrNoResult");
                            throw null;
                        }
                    } else {
                        o.LJIJI("gridviewContainer");
                        throw null;
                    }
                } else if (state instanceof C74326TFa) {
                    ConstraintLayout constraintLayout4 = ((C46183IAp) iDqS436S0100000_12.l0).LJZ;
                    if (constraintLayout4 != null) {
                        constraintLayout4.setVisibility(4);
                        TuxTextView tuxTextView3 = ((C46183IAp) iDqS436S0100000_12.l0).LLD;
                        if (tuxTextView3 != null) {
                            tuxTextView3.setVisibility(8);
                            ConstraintLayout constraintLayout5 = ((C46183IAp) iDqS436S0100000_12.l0).LJZI;
                            if (constraintLayout5 != null) {
                                constraintLayout5.setVisibility(0);
                                RecyclerView recyclerView = ((C46183IAp) iDqS436S0100000_12.l0).LJZL;
                                if (recyclerView != null) {
                                    recyclerView.setVisibility(4);
                                    TuxTextView tuxTextView4 = ((C46183IAp) iDqS436S0100000_12.l0).LLF;
                                    if (tuxTextView4 != null) {
                                        tuxTextView4.setVisibility(8);
                                        T4V t4v = ((C46183IAp) iDqS436S0100000_12.l0).LL;
                                        if (t4v != null) {
                                            t4v.setVisibility(0);
                                        } else {
                                            o.LJIJI("progressBar");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("searchErrorUseTrend");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("recyclerView");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("searchResultContainer");
                                throw null;
                            }
                        } else {
                            o.LJIJI("searchErrorOrNoResult");
                            throw null;
                        }
                    } else {
                        o.LJIJI("gridviewContainer");
                        throw null;
                    }
                } else if (state instanceof TFR) {
                    ConstraintLayout constraintLayout6 = ((C46183IAp) iDqS436S0100000_12.l0).LJZ;
                    if (constraintLayout6 != null) {
                        constraintLayout6.setVisibility(4);
                        TuxTextView tuxTextView5 = ((C46183IAp) iDqS436S0100000_12.l0).LLD;
                        if (tuxTextView5 != null) {
                            tuxTextView5.setVisibility(8);
                            ConstraintLayout constraintLayout7 = ((C46183IAp) iDqS436S0100000_12.l0).LJZI;
                            if (constraintLayout7 != null) {
                                constraintLayout7.setVisibility(0);
                                RecyclerView recyclerView2 = ((C46183IAp) iDqS436S0100000_12.l0).LJZL;
                                if (recyclerView2 != null) {
                                    recyclerView2.setVisibility(0);
                                    TuxTextView tuxTextView6 = ((C46183IAp) iDqS436S0100000_12.l0).LLF;
                                    if (tuxTextView6 != null) {
                                        tuxTextView6.setVisibility(8);
                                        T4V t4v2 = ((C46183IAp) iDqS436S0100000_12.l0).LL;
                                        if (t4v2 != null) {
                                            t4v2.setVisibility(4);
                                            C46183IAp c46183IAp2 = (C46183IAp) iDqS436S0100000_12.l0;
                                            C72793ShZ c72793ShZ5 = c46183IAp2.LLFF;
                                            if (c72793ShZ5 != null) {
                                                c72793ShZ5.LJLJJL = false;
                                                c72793ShZ5.submitList(((TFR) state).LIZ, new ARunnableS48S0100000_12(c46183IAp2, 47));
                                            }
                                            C72793ShZ c72793ShZ6 = ((C46183IAp) iDqS436S0100000_12.l0).LLFF;
                                            if (c72793ShZ6 != null) {
                                                TFR tfr = (TFR) state;
                                                c72793ShZ6.LJLZ(tfr.LIZIZ, tfr.LIZJ);
                                            }
                                        } else {
                                            o.LJIJI("progressBar");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("searchErrorUseTrend");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("recyclerView");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("searchResultContainer");
                                throw null;
                            }
                        } else {
                            o.LJIJI("searchErrorOrNoResult");
                            throw null;
                        }
                    } else {
                        o.LJIJI("gridviewContainer");
                        throw null;
                    }
                } else if (state instanceof TFS) {
                    ConstraintLayout constraintLayout8 = ((C46183IAp) iDqS436S0100000_12.l0).LJZ;
                    if (constraintLayout8 != null) {
                        constraintLayout8.setVisibility(4);
                        TuxTextView tuxTextView7 = ((C46183IAp) iDqS436S0100000_12.l0).LLD;
                        if (tuxTextView7 != null) {
                            tuxTextView7.setVisibility(8);
                            ConstraintLayout constraintLayout9 = ((C46183IAp) iDqS436S0100000_12.l0).LJZI;
                            if (constraintLayout9 != null) {
                                constraintLayout9.setVisibility(0);
                                RecyclerView recyclerView3 = ((C46183IAp) iDqS436S0100000_12.l0).LJZL;
                                if (recyclerView3 != null) {
                                    recyclerView3.setVisibility(0);
                                    TFS tfs = (TFS) state;
                                    if (tfs.LIZ.isEmpty()) {
                                        TuxTextView tuxTextView8 = ((C46183IAp) iDqS436S0100000_12.l0).LLF;
                                        if (tuxTextView8 != null) {
                                            tuxTextView8.setText(R.string.e6v);
                                        } else {
                                            o.LJIJI("searchErrorUseTrend");
                                            throw null;
                                        }
                                    } else {
                                        TuxTextView tuxTextView9 = ((C46183IAp) iDqS436S0100000_12.l0).LLF;
                                        if (tuxTextView9 != null) {
                                            tuxTextView9.setText(R.string.g11);
                                        } else {
                                            o.LJIJI("searchErrorUseTrend");
                                            throw null;
                                        }
                                    }
                                    TuxTextView tuxTextView10 = ((C46183IAp) iDqS436S0100000_12.l0).LLF;
                                    if (tuxTextView10 != null) {
                                        tuxTextView10.setVisibility(0);
                                        T4V t4v3 = ((C46183IAp) iDqS436S0100000_12.l0).LL;
                                        if (t4v3 != null) {
                                            t4v3.setVisibility(4);
                                            C72793ShZ c72793ShZ7 = ((C46183IAp) iDqS436S0100000_12.l0).LLFF;
                                            if (c72793ShZ7 != null) {
                                                c72793ShZ7.LJLJJL = true;
                                            }
                                            Z9N.LIZIZ.LJFF().LIZJ(tfs.LIZ);
                                            C46183IAp c46183IAp3 = (C46183IAp) iDqS436S0100000_12.l0;
                                            C72793ShZ c72793ShZ8 = c46183IAp3.LLFF;
                                            if (c72793ShZ8 != null) {
                                                c72793ShZ8.submitList(tfs.LIZ, new ARunnableS48S0100000_12(c46183IAp3, 49));
                                            }
                                            C72793ShZ c72793ShZ9 = ((C46183IAp) iDqS436S0100000_12.l0).LLFF;
                                            if (c72793ShZ9 != null) {
                                                c72793ShZ9.LJLZ(tfs.LIZIZ, "");
                                            }
                                        } else {
                                            o.LJIJI("progressBar");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("searchErrorUseTrend");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("recyclerView");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("searchResultContainer");
                                throw null;
                            }
                        } else {
                            o.LJIJI("searchErrorOrNoResult");
                            throw null;
                        }
                    } else {
                        o.LJIJI("gridviewContainer");
                        throw null;
                    }
                } else if (state instanceof TFY) {
                    C46183IAp c46183IAp4 = (C46183IAp) iDqS436S0100000_12.l0;
                    C72793ShZ c72793ShZ10 = c46183IAp4.LLFF;
                    if (c72793ShZ10 != null) {
                        c72793ShZ10.submitList(C61878OQg.INSTANCE, new ARunnableS48S0100000_12(c46183IAp4, 50));
                    }
                    C72793ShZ c72793ShZ11 = ((C46183IAp) iDqS436S0100000_12.l0).LLFF;
                    if (c72793ShZ11 != null) {
                        c72793ShZ11.LJLZ("", "");
                    }
                }
            } else {
                o.LJIJI("clearButton");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$18(IDqS436S0100000_12 iDqS436S0100000_12, Object obj, Object obj2, Object obj3) {
        iDqS436S0100000_12.invoke$0((TextView) obj, (TextView) obj2, (TextView) obj3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(IDqS436S0100000_12 iDqS436S0100000_12, Object obj, Object obj2, Object state) {
        int intValue = ((Number) obj2).intValue();
        o.LJIIIZ(state, "state");
        ((TL5) iDqS436S0100000_12.l0).LJII.onNext(new C157166Eu(obj, Integer.valueOf(intValue), state));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS436S0100000_12 iDqS436S0100000_12, Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        if (booleanValue2) {
            PowerAdapter powerAdapter = (PowerAdapter) iDqS436S0100000_12.l0;
            powerAdapter.getClass();
            powerAdapter.LLIILZL(new SI2(powerAdapter));
        } else {
            PowerAdapter powerAdapter2 = (PowerAdapter) iDqS436S0100000_12.l0;
            powerAdapter2.getClass();
            powerAdapter2.LLIILZL(new SI3(booleanValue, powerAdapter2, booleanValue3));
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$20(IDqS436S0100000_12 iDqS436S0100000_12, Object obj, Object obj2, Object obj3) {
        iDqS436S0100000_12.invoke$1((TextView) obj, (TextView) obj2, (TextView) obj3);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$21(IDqS436S0100000_12 iDqS436S0100000_12, Object obj, Object obj2, Object obj3) {
        iDqS436S0100000_12.invoke$2((TextView) obj, (TextView) obj2, (TextView) obj3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$22(IDqS436S0100000_12 iDqS436S0100000_12, Object data, Object obj, Object state) {
        int intValue = ((Number) obj).intValue();
        o.LJIIIZ(data, "data");
        o.LJIIIZ(state, "state");
        ((C74496TLo) iDqS436S0100000_12.l0).LJJJJIZL.onNext(new C157166Eu(data, Integer.valueOf(intValue), state));
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$23(IDqS436S0100000_12 iDqS436S0100000_12, Object obj, Object obj2, Object obj3) {
        iDqS436S0100000_12.invoke$3((TextView) obj, (TextView) obj2, (TextView) obj3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$24(IDqS436S0100000_12 iDqS436S0100000_12, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        ((Number) obj2).intValue();
        long longValue = ((Number) obj3).longValue();
        C26773Af3 c26773Af3 = (C26773Af3) iDqS436S0100000_12.l0;
        if (c26773Af3 != null) {
            c26773Af3.LJJJIL(longValue, false);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$25(IDqS436S0100000_12 iDqS436S0100000_12, Object view, Object obj, Object obj2) {
        VoucherInfo voucherInfo = (VoucherInfo) obj;
        int intValue = ((Number) obj2).intValue();
        o.LJIIIZ(view, "view");
        o.LJIIIZ(voucherInfo, "voucherInfo");
        if (intValue != 1) {
            if (intValue != 2) {
                C36746EbW.LIZ(4, "invalid view");
            } else {
                ((C71113RvZ) iDqS436S0100000_12.l0).LIZLLL(voucherInfo, "claim_button");
            }
        } else {
            C71113RvZ c71113RvZ = (C71113RvZ) iDqS436S0100000_12.l0;
            c71113RvZ.getClass();
            TcLine LIZIZ = voucherInfo.LIZIZ();
            String str = null;
            if (LIZIZ != null && C78857UxB.LJJJIL(LIZIZ.value)) {
                Uri parse = UriProtector.parse(LIZIZ.value);
                Uri.Builder buildUpon = parse.buildUpon();
                buildUpon.clearQuery();
                for (String str2 : UriProtector.getQueryParameterNames(parse)) {
                    if (!o.LJ(str2, "url")) {
                        buildUpon.appendQueryParameter(str2, UriProtector.getQueryParameter(parse, str2));
                    }
                }
                String queryParameter = UriProtector.getQueryParameter(parse, "url");
                if (C78857UxB.LJJJIL(queryParameter)) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("previous_page", "live");
                        String jSONObject2 = jSONObject.toString();
                        if (jSONObject2 != null) {
                            queryParameter = UriProtector.parse(queryParameter).buildUpon().appendQueryParameter("track_params", jSONObject2).build().toString();
                        }
                    } catch (Exception unused) {
                    }
                }
                if (queryParameter != null) {
                    buildUpon.appendQueryParameter("url", queryParameter);
                }
                SmartRouter.buildRoute(c71113RvZ.LJ, buildUpon.build().toString()).open();
            }
            String LIZJ = c71113RvZ.LJFF.LIZJ("author_id");
            String LIZJ2 = c71113RvZ.LJFF.LIZJ("room_id");
            String LIZJ3 = c71113RvZ.LJFF.LIZJ("enter_from_merge");
            String LIZJ4 = c71113RvZ.LJFF.LIZJ("enter_method");
            String LIZJ5 = c71113RvZ.LJFF.LIZJ("action_type");
            String LIZJ6 = c71113RvZ.LJFF.LIZJ("follow_status");
            String LIZJ7 = c71113RvZ.LJFF.LIZJ("page_name");
            String str3 = voucherInfo.voucherId;
            String str4 = voucherInfo.voucherTypeId;
            DaInfo LIZ = voucherInfo.LIZ();
            if (LIZ != null) {
                str = LIZ.couponTypeInfo;
            }
            C71109RvV.LIZJ(LIZJ, LIZJ2, LIZJ3, LIZJ4, LIZJ5, LIZJ6, LIZJ7, str3, str4, str, "T&C");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$26(IDqS436S0100000_12 iDqS436S0100000_12, Object obj, Object obj2, Object obj3) {
        Effect effect = (Effect) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        o.LJIIIZ(effect, "effect");
        EffectTemplateCategoryFragment effectTemplateCategoryFragment = (EffectTemplateCategoryFragment) iDqS436S0100000_12.l0;
        effectTemplateCategoryFragment.getClass();
        C245319jz c245319jz = new C245319jz();
        c245319jz.LJII(effect.getName());
        C252659vp c252659vp = new C252659vp();
        String string = effectTemplateCategoryFragment.getString(R.string.efd);
        o.LJIIIIZZ(string, "this.getString(R.string.delete)");
        c252659vp.LIZ = string;
        c252659vp.LIZJ(R.raw.icon_trash_bin);
        c252659vp.LIZJ = 1;
        c252659vp.LJ = new ACListenerS21S0100000_1(new AqS16S0202000_12(effectTemplateCategoryFragment, effect, intValue, intValue2, 1), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
        c245319jz.LIZ(c252659vp);
        TuxActionSheet LIZJ = c245319jz.LIZJ();
        FragmentManager requireFragmentManager = effectTemplateCategoryFragment.requireFragmentManager();
        o.LJIIIIZZ(requireFragmentManager, "requireFragmentManager()");
        LIZJ.show(requireFragmentManager, "DiyProp");
        C78880UxY.LJJLIIIJL("show_mobile_effect_delete", effectTemplateCategoryFragment.wl(effect));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$27(IDqS436S0100000_12 iDqS436S0100000_12, Object obj, Object obj2, Object obj3) {
        Effect effect = (Effect) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        o.LJIIIZ(effect, "effect");
        ((C46239ICt) ((EffectTemplateCategoryFragment) iDqS436S0100000_12.l0).LJLLI.getValue()).LIZ(J8V.LJI(effect, intValue, null, null, null, null, null, intValue2, false, null, 446));
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$28(IDqS436S0100000_12 iDqS436S0100000_12, Object obj, Object obj2, Object obj3) {
        iDqS436S0100000_12.invoke$4((TextView) obj, (TextView) obj2, (TextView) obj3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$29(IDqS436S0100000_12 iDqS436S0100000_12, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        return ((C72981Skb) iDqS436S0100000_12.l0).getCalculateSelectedTimeSpan().invoke(Float.valueOf(((Number) obj2).floatValue()), Float.valueOf(((Number) obj3).floatValue()));
    }

    public static final Object invoke$3(IDqS436S0100000_12 iDqS436S0100000_12, Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        ((Number) obj2).intValue();
        ((Boolean) obj3).booleanValue();
        ChallengeDetailFragment challengeDetailFragment = (ChallengeDetailFragment) iDqS436S0100000_12.l0;
        float height = (((ChallengeDetailFragment) iDqS436S0100000_12.l0)._$_findCachedViewById(R.id.la4).getHeight() + (challengeDetailFragment._$_findCachedViewById(R.id.kej).getHeight() + challengeDetailFragment.LLFF)) - intValue;
        ChallengeDetailFragment challengeDetailFragment2 = (ChallengeDetailFragment) iDqS436S0100000_12.l0;
        float height2 = height / (((ChallengeDetailFragment) iDqS436S0100000_12.l0)._$_findCachedViewById(R.id.la4).getHeight() + (challengeDetailFragment2._$_findCachedViewById(R.id.kej).getHeight() + challengeDetailFragment2.LLFF));
        View _$_findCachedViewById = ((ChallengeDetailFragment) iDqS436S0100000_12.l0)._$_findCachedViewById(R.id.aj5);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setScaleY(height2);
        }
        View _$_findCachedViewById2 = ((ChallengeDetailFragment) iDqS436S0100000_12.l0)._$_findCachedViewById(R.id.aj5);
        if (_$_findCachedViewById2 != null) {
            _$_findCachedViewById2.setScaleX(height2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$30(IDqS436S0100000_12 iDqS436S0100000_12, Object obj, Object obj2, Object obj3) {
        SF8 popupWindow = (SF8) obj;
        int intValue = ((Number) obj2).intValue();
        CpfElem cpfElem = (CpfElem) obj3;
        o.LJIIIZ(popupWindow, "popupWindow");
        o.LJIIIZ(cpfElem, "cpfElem");
        CpfVH cpfVH = (CpfVH) iDqS436S0100000_12.l0;
        cpfVH.LJLLJ = true;
        cpfVH.N(false, true);
        ((TextView) ((CpfVH) iDqS436S0100000_12.l0)._$_findCachedViewById(R.id.cz9)).setText(cpfElem.maskCode);
        popupWindow.dismiss();
        ((CpfVH) iDqS436S0100000_12.l0).L().Xw0(cpfElem);
        C78946Uyc.LJJIIJ(((CpfVH) iDqS436S0100000_12.l0).LJLIL, new C70990Rta(), new AqS99S0101000_12((CpfVH) iDqS436S0100000_12.l0, intValue, 20));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$31(IDqS436S0100000_12 iDqS436S0100000_12, Object obj, Object obj2, Object obj3) {
        ((ProductReviewViewModel) iDqS436S0100000_12.l0).setState(new AqS19S2100000_12((Integer) obj, (String) obj2, (String) obj3, 5));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.Ynt, X.Prl] */
    public static final Object invoke$32(IDqS436S0100000_12 iDqS436S0100000_12, Object view, Object option, Object obj) {
        int intValue = ((Number) obj).intValue();
        o.LJIIIZ(view, "view");
        o.LJIIIZ(option, "option");
        OptionPickerDialogFragmentV1 optionPickerDialogFragmentV1 = (OptionPickerDialogFragmentV1) iDqS436S0100000_12.l0;
        ?? r1 = optionPickerDialogFragmentV1.LJLJL;
        if (r1 != 0) {
            r1.invoke(view, option, Integer.valueOf(intValue));
        }
        optionPickerDialogFragmentV1.LJLJJL = false;
        ASQ.LJ(optionPickerDialogFragmentV1, ASX.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$33(IDqS436S0100000_12 iDqS436S0100000_12, Object obj, Object obj2, Object obj3) {
        InterfaceC73150SnK selectSubscribe = (InterfaceC73150SnK) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        selectSubscribe.withState(((ReviewFragmentV1) iDqS436S0100000_12.l0).Al(), new AqS53S1200000_12((String) obj2, (ReviewFragmentV1) iDqS436S0100000_12.l0, (Integer) obj3, 18));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$34(IDqS436S0100000_12 iDqS436S0100000_12, Object obj, Object obj2, Object obj3) {
        int i;
        String str;
        OptionV1 option = (OptionV1) obj2;
        ((Number) obj3).intValue();
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        o.LJIIIZ(option, "option");
        if (!option.isSelected) {
            try {
                str = option.filter.filterId;
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable unused) {
            }
            if (str != null) {
                Integer valueOf = Integer.valueOf(CastIntegerProtector.parseInt(str));
                if (valueOf != null) {
                    i = valueOf.intValue();
                    ((ReviewFragmentV1) iDqS436S0100000_12.l0).Al().Vv0((ReviewFragmentV1) iDqS436S0100000_12.l0, i);
                }
            }
            i = 1;
            ((ReviewFragmentV1) iDqS436S0100000_12.l0).Al().Vv0((ReviewFragmentV1) iDqS436S0100000_12.l0, i);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$35(IDqS436S0100000_12 iDqS436S0100000_12, Object selectSubscribe, Object obj, Object obj2) {
        boolean z;
        String searchText = (String) obj;
        List searchResult = (List) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(searchText, "searchText");
        o.LJIIIZ(searchResult, "searchResult");
        if (searchText.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && searchResult.isEmpty()) {
            MufListPageFragment mufListPageFragment = (MufListPageFragment) iDqS436S0100000_12.l0;
            ((C73305Spp) mufListPageFragment._$_findCachedViewById(R.id.jhm)).setVisibility(0);
            mufListPageFragment._$_findCachedViewById(R.id.jgc).setVisibility(8);
            mufListPageFragment._$_findCachedViewById(R.id.i04).setVisibility(8);
            ((C73305Spp) mufListPageFragment._$_findCachedViewById(R.id.jhm)).setStatus((C73306Spq) mufListPageFragment.LJLL.getValue());
            ((C73305Spp) mufListPageFragment._$_findCachedViewById(R.id.jhm)).setLayoutVariant(1);
        } else if (searchText.length() > 0 && (!searchResult.isEmpty())) {
            MufListPageFragment mufListPageFragment2 = (MufListPageFragment) iDqS436S0100000_12.l0;
            ((C73305Spp) mufListPageFragment2._$_findCachedViewById(R.id.jhm)).setVisibility(8);
            mufListPageFragment2._$_findCachedViewById(R.id.jgc).setVisibility(0);
            mufListPageFragment2._$_findCachedViewById(R.id.i04).setVisibility(8);
            ((SYL) mufListPageFragment2._$_findCachedViewById(R.id.jgc)).getState().LJFF();
            C72808Sho<InterfaceC57784Mm4> state = ((SYL) mufListPageFragment2._$_findCachedViewById(R.id.jgc)).getState();
            ArrayList arrayList = new ArrayList(C32I.LJJL(searchResult, 10));
            Iterator it = searchResult.iterator();
            while (it.hasNext()) {
                arrayList.add(new C57802MmM(mufListPageFragment2.Gl(), (IMUser) it.next()));
            }
            state.LJ(arrayList);
            ((RecyclerView) mufListPageFragment2._$_findCachedViewById(R.id.jgc)).LJLI(0);
        } else {
            MufListPageFragment mufListPageFragment3 = (MufListPageFragment) iDqS436S0100000_12.l0;
            ((C73305Spp) mufListPageFragment3._$_findCachedViewById(R.id.jhm)).setVisibility(8);
            mufListPageFragment3._$_findCachedViewById(R.id.jgc).setVisibility(8);
            mufListPageFragment3._$_findCachedViewById(R.id.i04).setVisibility(0);
            KeyboardUtils.LIZIZ(mufListPageFragment3._$_findCachedViewById(R.id.i04));
        }
        if (searchText.length() > 0) {
            MufListPageFragment mufListPageFragment4 = (MufListPageFragment) iDqS436S0100000_12.l0;
            if (!mufListPageFragment4.LJLLJ) {
                mufListPageFragment4.LJLLJ = true;
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", (String) mufListPageFragment4.LJLJI.getValue());
                FMX.LJIIL("search_friends_list", c188727au.LIZ);
            }
        } else {
            ((MufListPageFragment) iDqS436S0100000_12.l0).LJLLJ = false;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$36(IDqS436S0100000_12 iDqS436S0100000_12, Object obj, Object obj2, Object obj3) {
        UIAssem selectSubscribe = (UIAssem) obj;
        List list = (List) obj2;
        PaymentMethod paymentMethod = (PaymentMethod) obj3;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (paymentMethod != null && list != null) {
            selectSubscribe.withState(((SubPaymentListAssem) iDqS436S0100000_12.l0).x3(), new AqS57S0400000_12((SubPaymentListAssem) iDqS436S0100000_12.l0, (SubPaymentListAssem) list, (List<PaymentMethod>) selectSubscribe, (UIAssem) paymentMethod, (PaymentMethod) 16));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS436S0100000_12 iDqS436S0100000_12, Object obj, Object obj2, Object obj3) {
        JediSimpleViewHolder selectSubscribe = (JediSimpleViewHolder) obj;
        Boolean bool = (Boolean) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (bool != null) {
            bool.booleanValue();
            if (booleanValue) {
                PdpInfoViewHolder pdpInfoViewHolder = (PdpInfoViewHolder) iDqS436S0100000_12.l0;
                if (!pdpInfoViewHolder.LJLJJI) {
                    pdpInfoViewHolder.LJLJJI = true;
                    CommerceProductInfoView commerceProductInfoView = pdpInfoViewHolder.LJLILLLLZI;
                    View favoriteBtn = commerceProductInfoView.getFavoriteBtn();
                    if (commerceProductInfoView.getVisibility() == 0 && favoriteBtn != null && favoriteBtn.getVisibility() == 0) {
                        Context context = commerceProductInfoView.getContext();
                        o.LJIIIIZZ(context, "view.context");
                        C139825eE c139825eE = new C139825eE(context);
                        String string = commerceProductInfoView.getContext().getString(R.string.fbr);
                        o.LJIIIIZZ(string, "view.context.getString(R…dp_favorite_button_guide)");
                        c139825eE.LIZJ = string;
                        c139825eE.LIZIZ(favoriteBtn);
                        c139825eE.LJI(WHL.TOP);
                        C82682Wcg c82682Wcg = c139825eE.LIZ;
                        c82682Wcg.LJIIIZ = true;
                        c82682Wcg.LJIIL = true;
                        c139825eE.LIZJ().show();
                    }
                    View findViewById = selectSubscribe.itemView.findViewById(R.id.d5c);
                    o.LJIIIIZZ(findViewById, "itemView.favorite_icon");
                    C78946Uyc.LJJIIJZLJL(findViewById, new C70892Rs0(), new AqS160S0100000_10(selectSubscribe, 172), C70597RnF.LJLIL);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS436S0100000_12 iDqS436S0100000_12, Object selectSubscribe, Object obj, Object obj2) {
        C73305Spp c73305Spp;
        C73305Spp c73305Spp2;
        View findViewById;
        C73305Spp c73305Spp3;
        C73305Spp c73305Spp4;
        C73305Spp c73305Spp5;
        C73305Spp c73305Spp6;
        C73305Spp c73305Spp7;
        C73305Spp c73305Spp8;
        C73305Spp c73305Spp9;
        C73305Spp c73305Spp10;
        C73305Spp c73305Spp11;
        C73305Spp c73305Spp12;
        View findViewById2;
        int intValue = ((Number) obj).intValue();
        BlockPageInfo blockPageInfo = (BlockPageInfo) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        View view = ((PdpBodyWidget) iDqS436S0100000_12.l0).contentView;
        if (view != null && (findViewById2 = view.findViewById(R.id.keh)) != null) {
            C26338AVi.LJIIIZ(findViewById2, null, Integer.valueOf((int) ((PdpBodyWidget) iDqS436S0100000_12.l0).headNavBarHeight), null, null, 29);
        }
        if (intValue != -1) {
            if (intValue != 0) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 4) {
                            if (intValue != 5) {
                                if (intValue == 6 && blockPageInfo != null) {
                                    View view2 = ((PdpBodyWidget) iDqS436S0100000_12.l0).contentView;
                                    if (view2 != null && (c73305Spp12 = (C73305Spp) view2.findViewById(R.id.keh)) != null) {
                                        c73305Spp12.setVisibility(0);
                                    }
                                    View view3 = ((PdpBodyWidget) iDqS436S0100000_12.l0).contentView;
                                    if (view3 != null && (c73305Spp11 = (C73305Spp) view3.findViewById(R.id.keh)) != null) {
                                        C73306Spq c73306Spq = new C73306Spq();
                                        String str = blockPageInfo.firstTitle;
                                        String str2 = "";
                                        if (str == null) {
                                            str = "";
                                        }
                                        c73306Spq.LJFF = str;
                                        String str3 = blockPageInfo.secondTitle;
                                        if (str3 != null) {
                                            str2 = str3;
                                        }
                                        c73306Spq.LJI = str2;
                                        C2068389v c2068389v = new C2068389v();
                                        c2068389v.LIZ = R.raw.icon_large_bag;
                                        c2068389v.LJ = Integer.valueOf(R.attr.gp);
                                        c73306Spq.LIZJ = 0;
                                        c73306Spq.LIZIZ = c2068389v;
                                        c73305Spp11.setStatus(c73306Spq);
                                    }
                                }
                            } else {
                                View view4 = ((PdpBodyWidget) iDqS436S0100000_12.l0).contentView;
                                if (view4 != null && (c73305Spp10 = (C73305Spp) view4.findViewById(R.id.keh)) != null) {
                                    c73305Spp10.setVisibility(0);
                                }
                                View view5 = ((PdpBodyWidget) iDqS436S0100000_12.l0).contentView;
                                if (view5 != null && (c73305Spp9 = (C73305Spp) view5.findViewById(R.id.keh)) != null) {
                                    C73306Spq c73306Spq2 = new C73306Spq();
                                    String string = ((PdpBodyWidget) iDqS436S0100000_12.l0).getActivity().getString(R.string.f4q);
                                    o.LJIIIIZZ(string, "activity.getString(R.str…p_pdt_region_error_title)");
                                    c73306Spq2.LJFF = string;
                                    String string2 = ((PdpBodyWidget) iDqS436S0100000_12.l0).getActivity().getString(R.string.f4p);
                                    o.LJIIIIZZ(string2, "activity.getString(R.str…dp_pdt_region_error_desc)");
                                    c73306Spq2.LJI = string2;
                                    C2068389v c2068389v2 = new C2068389v();
                                    c2068389v2.LIZ = R.raw.icon_large_unavailable_region;
                                    c2068389v2.LJ = Integer.valueOf(R.attr.gp);
                                    c73306Spq2.LIZJ = 0;
                                    c73306Spq2.LIZIZ = c2068389v2;
                                    c73305Spp9.setStatus(c73306Spq2);
                                }
                            }
                        } else {
                            View view6 = ((PdpBodyWidget) iDqS436S0100000_12.l0).contentView;
                            if (view6 != null && (c73305Spp8 = (C73305Spp) view6.findViewById(R.id.keh)) != null) {
                                c73305Spp8.setVisibility(0);
                            }
                            View view7 = ((PdpBodyWidget) iDqS436S0100000_12.l0).contentView;
                            if (view7 != null && (c73305Spp7 = (C73305Spp) view7.findViewById(R.id.keh)) != null) {
                                C73306Spq c73306Spq3 = new C73306Spq();
                                String string3 = ((PdpBodyWidget) iDqS436S0100000_12.l0).getActivity().getString(R.string.f4o);
                                o.LJIIIIZZ(string3, "activity.getString(R.str…hop_pdp_pdt_delete_title)");
                                c73306Spq3.LJFF = string3;
                                String string4 = ((PdpBodyWidget) iDqS436S0100000_12.l0).getActivity().getString(R.string.f4n);
                                o.LJIIIIZZ(string4, "activity.getString(R.str…shop_pdp_pdt_delete_desc)");
                                c73306Spq3.LJI = string4;
                                C2068389v c2068389v3 = new C2068389v();
                                c2068389v3.LIZ = R.raw.icon_large_bag;
                                c2068389v3.LJ = Integer.valueOf(R.attr.gp);
                                c73306Spq3.LIZJ = 0;
                                c73306Spq3.LIZIZ = c2068389v3;
                                c73305Spp7.setStatus(c73306Spq3);
                            }
                        }
                    } else {
                        View view8 = ((PdpBodyWidget) iDqS436S0100000_12.l0).contentView;
                        if (view8 != null) {
                            view8.setVisibility(0);
                        }
                        View view9 = ((PdpBodyWidget) iDqS436S0100000_12.l0).contentView;
                        if (view9 != null && (c73305Spp6 = (C73305Spp) view9.findViewById(R.id.keh)) != null) {
                            c73305Spp6.setVisibility(0);
                        }
                        View view10 = ((PdpBodyWidget) iDqS436S0100000_12.l0).contentView;
                        if (view10 != null && (c73305Spp5 = (C73305Spp) view10.findViewById(R.id.keh)) != null) {
                            c73305Spp5.setStatus(C73974T1m.LJ(new AqS162S0100000_12((PdpBodyWidget) iDqS436S0100000_12.l0, 383), true));
                        }
                    }
                } else {
                    View view11 = ((PdpBodyWidget) iDqS436S0100000_12.l0).contentView;
                    if (view11 != null) {
                        view11.setVisibility(0);
                    }
                    View view12 = ((PdpBodyWidget) iDqS436S0100000_12.l0).contentView;
                    if (view12 != null && (c73305Spp4 = (C73305Spp) view12.findViewById(R.id.keh)) != null) {
                        c73305Spp4.setVisibility(0);
                    }
                    View view13 = ((PdpBodyWidget) iDqS436S0100000_12.l0).contentView;
                    if (view13 != null && (c73305Spp3 = (C73305Spp) view13.findViewById(R.id.keh)) != null) {
                        c73305Spp3.setStatus(C73974T1m.LIZIZ(new AqS162S0100000_12((PdpBodyWidget) iDqS436S0100000_12.l0, 382), true));
                    }
                }
            } else {
                View view14 = ((PdpBodyWidget) iDqS436S0100000_12.l0).contentView;
                if (view14 != null && (findViewById = view14.findViewById(R.id.keh)) != null) {
                    C26338AVi.LJIIIZ(findViewById, null, 0, null, null, 29);
                }
                View view15 = ((PdpBodyWidget) iDqS436S0100000_12.l0).contentView;
                if (view15 != null && (c73305Spp2 = (C73305Spp) view15.findViewById(R.id.keh)) != null) {
                    c73305Spp2.LJFF();
                }
            }
        } else {
            View view16 = ((PdpBodyWidget) iDqS436S0100000_12.l0).contentView;
            if (view16 != null && (c73305Spp = (C73305Spp) view16.findViewById(R.id.keh)) != null) {
                c73305Spp.setVisibility(8);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS436S0100000_12 iDqS436S0100000_12, Object selectSubscribe, Object obj, Object obj2) {
        List<Tab> list = (List) obj;
        int intValue = ((Number) obj2).intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (!((PdpHeadNavBarWidget) iDqS436S0100000_12.l0).getStyle().getHideTab()) {
            PdpHeadNavBarWidget pdpHeadNavBarWidget = (PdpHeadNavBarWidget) iDqS436S0100000_12.l0;
            if (pdpHeadNavBarWidget.firstInitTab && list == null) {
                pdpHeadNavBarWidget.firstInitTab = false;
            } else if (list == null || list.isEmpty() || intValue == 1 || intValue == 2) {
                PdpHeadNavBarWidget pdpHeadNavBarWidget2 = (PdpHeadNavBarWidget) iDqS436S0100000_12.l0;
                pdpHeadNavBarWidget2.tabCount = 0;
                View pdp_tabs = pdpHeadNavBarWidget2._$_findCachedViewById(R.id.hkw);
                o.LJIIIIZZ(pdp_tabs, "pdp_tabs");
                OUP.LJIJJLI(pdp_tabs);
            } else {
                ((PdpHeadNavBarWidget) iDqS436S0100000_12.l0).tabCount = list.size();
                ((PdpHeadNavBarWidget) iDqS436S0100000_12.l0).initTab(list);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(IDqS436S0100000_12 iDqS436S0100000_12, Object selectSubscribe, Object obj, Object obj2) {
        OSZ quantity = (OSZ) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(quantity, "quantity");
        ((SkuPanelBottomWidget) iDqS436S0100000_12.l0).updateBuyButton((BuyButton) obj, ((Number) quantity.getFirst()).intValue());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(IDqS436S0100000_12 iDqS436S0100000_12, Object selectSubscribe, Object obj, Object obj2) {
        int i;
        Integer num;
        Integer num2;
        int Vz;
        String valueOf;
        OSZ currentQuantity = (OSZ) obj;
        C70109RfN quantityLimit = (C70109RfN) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(currentQuantity, "currentQuantity");
        o.LJIIIZ(quantityLimit, "quantityLimit");
        if (((C70404Rk8) currentQuantity.getSecond()).LIZIZ) {
            EditText editText = ((SkuPanelCounterWidget) iDqS436S0100000_12.l0).LJLJJI;
            if (editText != null) {
                if (((Number) currentQuantity.getFirst()).intValue() == 0) {
                    valueOf = "";
                } else {
                    valueOf = String.valueOf(((Number) currentQuantity.getFirst()).intValue());
                }
                editText.setText(valueOf);
            } else {
                o.LJIJI("counterInput");
                throw null;
            }
        }
        int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.gp, ((SkuPanelCounterWidget) iDqS436S0100000_12.l0).getActivity());
        int LJIIIIZZ2 = AnonymousClass636.LJIIIIZZ(R.attr.go, ((SkuPanelCounterWidget) iDqS436S0100000_12.l0).getActivity());
        TuxIconView tuxIconView = ((SkuPanelCounterWidget) iDqS436S0100000_12.l0).LJLJI;
        if (tuxIconView != null) {
            if (((Number) currentQuantity.getFirst()).intValue() >= quantityLimit.LJLILLLLZI) {
                i = LJIIIIZZ;
            } else {
                i = LJIIIIZZ2;
            }
            tuxIconView.setTintColor(i);
            TuxIconView tuxIconView2 = ((SkuPanelCounterWidget) iDqS436S0100000_12.l0).LJLILLLLZI;
            if (tuxIconView2 != null) {
                if (((Number) currentQuantity.getFirst()).intValue() > quantityLimit.LJLIL) {
                    LJIIIIZZ = LJIIIIZZ2;
                }
                tuxIconView2.setTintColor(LJIIIIZZ);
                C70400Rk4 c70400Rk4 = (C70400Rk4) ((SkuPanelCounterWidget) iDqS436S0100000_12.l0).LJLJLJ.getValue();
                c70400Rk4.getClass();
                SkuItem xp0 = c70400Rk4.LIZIZ.xp0();
                if (xp0 != null && c70400Rk4.LIZIZ.LX() && (num2 = xp0.promotionLimitQuantity) != null) {
                    int intValue = num2.intValue();
                    List list = (List) c70400Rk4.LIZJ.getValue();
                    if (list == null || list.isEmpty()) {
                        C78983UzD.LJIILL("PromotionLimitStrategy skuCommonConfig error");
                    } else {
                        String LIZJ = AbstractC70398Rk2.LIZJ(intValue, (String) c70400Rk4.LIZLLL.getValue());
                        String LIZJ2 = AbstractC70398Rk2.LIZJ(intValue, (String) c70400Rk4.LJ.getValue());
                        if (!((C70404Rk8) currentQuantity.getSecond()).LIZ) {
                            Vz = c70400Rk4.LIZIZ.Kf0();
                        } else {
                            Vz = c70400Rk4.LIZIZ.Vz();
                        }
                        if (((Number) currentQuantity.getFirst()).intValue() > intValue) {
                            c70400Rk4.LIZIZ.Xn0(2, LIZJ2);
                            if (Vz <= intValue) {
                                c70400Rk4.LIZIZ(LIZJ);
                            }
                        } else {
                            Integer Zm0 = c70400Rk4.LIZIZ.Zm0();
                            if (Zm0 != null && Zm0.intValue() == 2) {
                                c70400Rk4.LIZIZ.Xn0(null, "");
                            }
                        }
                    }
                }
                C70399Rk3 LIZ = ((SkuPanelCounterWidget) iDqS436S0100000_12.l0).LIZ();
                LIZ.getClass();
                SkuItem xp02 = LIZ.LIZIZ.xp0();
                if (xp02 != null && LIZ.LIZIZ.Z90() && (num = xp02.minBuyQuantity) != null) {
                    int intValue2 = num.intValue();
                    List list2 = (List) LIZ.LIZJ.getValue();
                    if (list2 == null || list2.isEmpty()) {
                        C78983UzD.LJIILL("MinimumBuyStrategy skuCommonConfig error");
                    } else {
                        LIZ.LJFF = AbstractC70398Rk2.LIZJ(intValue2, (String) LIZ.LIZLLL.getValue());
                        String LIZJ3 = AbstractC70398Rk2.LIZJ(intValue2, (String) LIZ.LJ.getValue());
                        if (((Number) currentQuantity.getFirst()).intValue() == intValue2) {
                            LIZ.LIZIZ.Xn0(1, LIZJ3);
                        } else {
                            Integer Zm02 = LIZ.LIZIZ.Zm0();
                            if (Zm02 != null && Zm02.intValue() == 1) {
                                LIZ.LIZIZ.Xn0(null, "");
                            }
                        }
                    }
                }
                return C76800UCe.LIZ;
            }
            o.LJIJI("minusBtn");
            throw null;
        }
        o.LJIJI("plusBtn");
        throw null;
    }

    public static final Object invoke$9(IDqS436S0100000_12 iDqS436S0100000_12, Object selectSubscribe, Object state, Object obj) {
        String[] strArr;
        List<SaleProp> list;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(state, "state");
        o.LJIIIZ(obj, "<anonymous parameter 1>");
        if (state == EnumC70239RhT.SUCCESS) {
            SkuInfo skuInfo = ((SkuWidget) iDqS436S0100000_12.l0).getMViewModel().LJLLILLLL;
            if (skuInfo != null && (list = skuInfo.salePropList) != null) {
                C70053ReT.LIZIZ(list);
            }
            InterfaceC70386Rjq Tv0 = ((SkuWidget) iDqS436S0100000_12.l0).getMViewModel().Tv0();
            ((SkuWidget) iDqS436S0100000_12.l0).getMViewModel().Lv0();
            SkuWidget skuWidget = (SkuWidget) iDqS436S0100000_12.l0;
            C70282RiA c70282RiA = skuWidget.LJLJJI;
            if (c70282RiA != null) {
                SkuInfo skuInfo2 = skuWidget.getMViewModel().LJLLILLLL;
                SkuPanelState skuPanelState = ((SkuWidget) iDqS436S0100000_12.l0).getMViewModel().LJLLI;
                if (skuPanelState != null) {
                    strArr = skuPanelState.getCheckedSkuIds();
                } else {
                    strArr = null;
                }
                c70282RiA.LJIIIZ(null, skuInfo2, strArr, Tv0, new IDqS436S0100000_12((SkuWidget) iDqS436S0100000_12.l0, 10));
            } else {
                o.LJIJI("specListLayout");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}
