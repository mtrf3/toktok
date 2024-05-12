package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC26082ALm;
import X.AbstractC65781Prl;
import X.AbstractC72932td;
import X.C113554cx;
import X.C163586bS;
import X.C163596bT;
import X.C16880lQ;
import X.C173936s9;
import X.C207798Dn;
import X.C213178Yf;
import X.C22780uw;
import X.C24050wz;
import X.C26867AgZ;
import X.C27162AlK;
import X.C276116n;
import X.C27739Aud;
import X.C32I;
import X.C34K;
import X.C3C1;
import X.C40341FsP;
import X.C47261Igj;
import X.C56412MCa;
import X.C61841OOv;
import X.C68322mC;
import X.C69643RUx;
import X.C70085Rez;
import X.C70414RkI;
import X.C70759Rpr;
import X.C70920RsS;
import X.C71420S1g;
import X.C71723SCx;
import X.C71765SEn;
import X.C71767SEp;
import X.C72413SbR;
import X.C72912tb;
import X.C72922tc;
import X.C73140SnA;
import X.C73165SnZ;
import X.C73374Sqw;
import X.C76800UCe;
import X.C78946Uyc;
import X.C79045V0n;
import X.C8V2;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC71003Rtn;
import X.InterfaceC73149SnJ;
import X.InterfaceC73150SnK;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC98243tM;
import X.JF5;
import X.LC5;
import X.ORZ;
import X.OSZ;
import X.S1U;
import X.SD3;
import X.SD5;
import X.SYL;
import X.TBW;
import X.TBZ;
import X.TMG;
import X.TYN;
import X.ViewTreeObserverOnGlobalLayoutListenerC70175RgR;
import X.W5F;
import Y.ARunnableS48S0100000_12;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.viewholder.BANormalElementVH;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.CCDCCardNumberElementViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.CCDCDateElementViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment.SubPaymentListAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBodyWidget;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.us.osp.payment.viewholder.ccdc.USBANormalElementVH;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.TemplateEditFragment;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler;
import com.ss.android.ugc.aweme.utils.Au2S11S0300000_12;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public class AqS57S0400000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    public static /* bridge */ /* synthetic */ Object invoke$8(AqS57S0400000_12 aqS57S0400000_12, Object obj) {
        aqS57S0400000_12.invoke$1(obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$9(AqS57S0400000_12 aqS57S0400000_12, Object obj) {
        aqS57S0400000_12.invoke$2(obj);
        return C76800UCe.LIZ;
    }

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
            default:
                return null;
        }
    }

    public final void invoke$0(Announcement it) {
        String str;
        Map<String, String> map;
        int i;
        int i2;
        Long maxTextLine;
        String str2;
        String str3;
        o.LJIIIZ(it, "it");
        View pdp_bottom_unavailable_tips = ((C70085Rez) this.l0).LIZ(R.id.hk_);
        o.LJIIIIZZ(pdp_bottom_unavailable_tips, "pdp_bottom_unavailable_tips");
        int i3 = 8;
        pdp_bottom_unavailable_tips.setVisibility(8);
        Integer materialType = it.getMaterialType();
        if (materialType == null) {
            return;
        }
        if (materialType.intValue() == 4) {
            View pdp_announcement = ((C70085Rez) this.l0).LIZ(R.id.hk5);
            o.LJIIIIZZ(pdp_announcement, "pdp_announcement");
            pdp_announcement.setVisibility(0);
            C70085Rez c70085Rez = (C70085Rez) this.l0;
            PdpFragment pdpFragment = (PdpFragment) this.l1;
            PdpViewModel pdpViewModel = (PdpViewModel) this.l2;
            c70085Rez.getClass();
            Long maxTextLine2 = it.getMaxTextLine();
            if (maxTextLine2 != null) {
                ((TextView) c70085Rez.LIZ(R.id.hk7)).setMaxLines((int) maxTextLine2.longValue());
            }
            c70085Rez.LIZ(R.id.hk7).getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC70175RgR(it, pdpFragment, pdpViewModel, c70085Rez));
            String text = it.getText();
            if (text != null) {
                ((TextView) ((C70085Rez) this.l0).LIZ(R.id.hk7)).setText(text);
            }
            Image icon = it.getIcon();
            if (icon == null) {
                return;
            }
            C70085Rez c70085Rez2 = (C70085Rez) this.l0;
            W5F LIZLLL = C70759Rpr.LIZLLL(icon.toImageUrlModel());
            Context context = c70085Rez2.getContext();
            o.LJIIIIZZ(context, "context");
            LIZLLL.LJIILIIL = C79045V0n.LJIIIIZZ(R.attr.dj, context);
            LIZLLL.LJJIIJZLJL = (ImageView) c70085Rez2.LIZ(R.id.hk8);
            C16880lQ.LLJJJ(LIZLLL);
            return;
        }
        String str4 = null;
        Map<String, String> map2 = null;
        if (materialType == null) {
            return;
        }
        if (materialType.intValue() == 5) {
            View LIZ = ((C70085Rez) this.l0).LIZ(R.id.hkc);
            if (LIZ != null) {
                LIZ.setVisibility(0);
            }
            View LIZ2 = ((C70085Rez) this.l0).LIZ(R.id.iv8);
            if (LIZ2 != null) {
                LIZ2.setVisibility(8);
            }
            ((PdpViewModel) this.l2).LLJJJJLIIL = true;
            PdpFragment pdpFragment2 = (PdpFragment) this.l1;
            if ((pdpFragment2 instanceof InterfaceC71003Rtn) && pdpFragment2 != null) {
                Announcement announcement = (Announcement) this.l3;
                if (announcement != null) {
                    str3 = announcement.getDaInfo();
                } else {
                    str3 = null;
                }
                C78946Uyc.LJJII(pdpFragment2, new C70920RsS(), new AqS178S0100000_12((HashMap) C27739Aud.LJII(str3), (HashMap<String, Object>) 341));
            }
            View LIZ3 = ((C70085Rez) this.l0).LIZ(R.id.hkc);
            if (LIZ3 != null) {
                C16880lQ.LJIIJ(new Au2S11S0300000_12((Announcement) this.l3, (PdpViewModel) this.l2, (PdpFragment) this.l1, 8), LIZ3);
            }
            ((TextView) ((C70085Rez) this.l0).LIZ(R.id.hkk)).setText(it.getButtonText());
            Image background = it.getBackground();
            if (background != null) {
                C70085Rez c70085Rez3 = (C70085Rez) this.l0;
                W5F LIZLLL2 = C70759Rpr.LIZLLL(background.toThumbFirstImageUrlModel());
                LIZLLL2.LJJIIJZLJL = (ImageView) c70085Rez3.LIZ(R.id.hkb);
                C16880lQ.LLJJJ(LIZLLL2);
            }
            RichTextUtil richTextUtil = RichTextUtil.LIZ;
            Context context2 = ((C70085Rez) this.l0).getContext();
            o.LJIIIIZZ(context2, "context");
            Announcement announcement2 = (Announcement) this.l3;
            if (announcement2 != null) {
                str2 = announcement2.getText();
            } else {
                str2 = null;
            }
            Announcement announcement3 = (Announcement) this.l3;
            if (announcement3 != null) {
                map2 = announcement3.getArguments();
            }
            SpannableStringBuilder LIZLLL3 = RichTextUtil.LIZLLL(richTextUtil, context2, str2, map2);
            if (LIZLLL3 != null) {
                ((C70085Rez) this.l0).LJLIL = LIZLLL3;
            }
            int length = ((C70085Rez) this.l0).LJLIL.length();
            C70085Rez c70085Rez4 = (C70085Rez) this.l0;
            long currentTimeMillis = System.currentTimeMillis();
            PdpViewModel pdpViewModel2 = (PdpViewModel) this.l2;
            c70085Rez4.getClass();
            String LIZIZ = C70085Rez.LIZIZ(currentTimeMillis, pdpViewModel2);
            if (o.LJ(LIZIZ, C27162AlK.LJIIJJI)) {
                ((C70085Rez) this.l0).LIZ(R.id.hkc).setVisibility(8);
                return;
            }
            ((TextView) ((C70085Rez) this.l0).LIZ(R.id.hkd)).setText(((C70085Rez) this.l0).LJLIL.append((CharSequence) LIZIZ));
            SpannableStringBuilder spannableStringBuilder = ((C70085Rez) this.l0).LJLIL;
            spannableStringBuilder.delete(length, spannableStringBuilder.length());
            return;
        }
        if (materialType.intValue() != 8) {
            return;
        }
        View pdp_coupon_container = ((C70085Rez) this.l0).LIZ(R.id.hkc);
        o.LJIIIIZZ(pdp_coupon_container, "pdp_coupon_container");
        pdp_coupon_container.setVisibility(8);
        View remind_notice_container = ((C70085Rez) this.l0).LIZ(R.id.iv8);
        o.LJIIIIZZ(remind_notice_container, "remind_notice_container");
        remind_notice_container.setVisibility(0);
        TextView textView = (TextView) ((C70085Rez) this.l0).LIZ(R.id.iva);
        RichTextUtil richTextUtil2 = RichTextUtil.LIZ;
        Context context3 = ((C70085Rez) this.l0).getContext();
        o.LJIIIIZZ(context3, "context");
        Announcement announcement4 = (Announcement) this.l3;
        if (announcement4 != null) {
            str = announcement4.getText();
        } else {
            str = null;
        }
        Announcement announcement5 = (Announcement) this.l3;
        if (announcement5 != null) {
            map = announcement5.getArguments();
        } else {
            map = null;
        }
        textView.setText(RichTextUtil.LIZLLL(richTextUtil2, context3, str, map));
        TextView textView2 = (TextView) ((C70085Rez) this.l0).LIZ(R.id.iva);
        Announcement announcement6 = (Announcement) this.l3;
        if (announcement6 != null && (maxTextLine = announcement6.getMaxTextLine()) != null) {
            i = (int) maxTextLine.longValue();
        } else {
            i = 2;
        }
        textView2.setMaxLines(i);
        ImageView remind_notice_container_bg = (ImageView) ((C70085Rez) this.l0).LIZ(R.id.iv9);
        o.LJIIIIZZ(remind_notice_container_bg, "remind_notice_container_bg");
        if (it.getBackground() != null) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        remind_notice_container_bg.setVisibility(i2);
        Image background2 = it.getBackground();
        if (background2 != null) {
            C70085Rez c70085Rez5 = (C70085Rez) this.l0;
            W5F LIZLLL4 = C70759Rpr.LIZLLL(background2.toThumbFirstImageUrlModel());
            LIZLLL4.LJJIIJZLJL = (ImageView) c70085Rez5.LIZ(R.id.iv9);
            C16880lQ.LLJJJ(LIZLLL4);
        }
        ImageView remind_notice_icon = (ImageView) ((C70085Rez) this.l0).LIZ(R.id.iv_);
        o.LJIIIIZZ(remind_notice_icon, "remind_notice_icon");
        if (it.getIcon() != null) {
            i3 = 0;
        }
        remind_notice_icon.setVisibility(i3);
        Image icon2 = it.getIcon();
        if (icon2 != null) {
            C70085Rez c70085Rez6 = (C70085Rez) this.l0;
            W5F LIZLLL5 = C70759Rpr.LIZLLL(icon2.toThumbFirstImageUrlModel());
            LIZLLL5.LJJIIJZLJL = (ImageView) c70085Rez6.LIZ(R.id.iv_);
            C16880lQ.LLJJJ(LIZLLL5);
        }
        Announcement announcement7 = (Announcement) this.l3;
        if (announcement7 != null) {
            str4 = announcement7.getDaInfo();
        }
        HashMap<String, Object> LJII = C27739Aud.LJII(str4);
        PdpFragment pdpFragment3 = (PdpFragment) this.l1;
        if ((pdpFragment3 instanceof InterfaceC71003Rtn) && pdpFragment3 != null) {
            C78946Uyc.LJJII(pdpFragment3, new C70920RsS(), new AqS178S0100000_12((HashMap) LJII, (HashMap<String, Object>) 343));
        }
        View remind_notice_close = ((C70085Rez) this.l0).LIZ(R.id.iv7);
        o.LJIIIIZZ(remind_notice_close, "remind_notice_close");
        C16880lQ.LJIIJ(new Au2S11S0300000_12((C70085Rez) this.l0, (PdpFragment) this.l1, LJII, 9), remind_notice_close);
    }

    public final void invoke$1(C73140SnA c73140SnA) {
        InterfaceC65784Pro interfaceC65784Pro;
        AbstractC26082ALm abstractC26082ALm = (AbstractC26082ALm) c73140SnA.LJLIL;
        if (abstractC26082ALm instanceof C173936s9) {
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) this.l1;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(((C173936s9) abstractC26082ALm).LIZ);
                return;
            }
            return;
        }
        if (abstractC26082ALm instanceof C163586bS) {
            InterfaceC88472Yns interfaceC88472Yns2 = (InterfaceC88472Yns) this.l2;
            if (interfaceC88472Yns2 == null) {
                return;
            }
            interfaceC88472Yns2.invoke(((C163586bS) abstractC26082ALm).LIZ);
            return;
        }
        if (!(abstractC26082ALm instanceof C163596bT) || (interfaceC65784Pro = (InterfaceC65784Pro) this.l3) == null) {
            return;
        }
        interfaceC65784Pro.invoke();
    }

    public final void invoke$2(TMG tmg) {
        TMG tmg2 = tmg;
        ((InterfaceC88471Ynr) this.l3).invoke(tmg2.LJLIL, tmg2.LJLILLLLZI);
    }

    public final void invoke$3(C213178Yf<AbstractC72932td<Object>> c213178Yf) {
        InterfaceC88472Yns interfaceC88472Yns;
        if (!((C56412MCa) this.l0).LJFF) {
            AqS72S0400000_12 aqS72S0400000_12 = new AqS72S0400000_12(c213178Yf, (InterfaceC65784Pro) this.l1, (InterfaceC88472Yns) this.l2, (InterfaceC88472Yns) this.l3, 30);
            if (C73374Sqw.LIZ()) {
                aqS72S0400000_12.invoke();
                return;
            } else {
                C73374Sqw.LIZ.post(new ARunnableS48S0100000_12(aqS72S0400000_12, 105));
                return;
            }
        }
        AbstractC72932td<Object> abstractC72932td = c213178Yf.LIZ;
        if (abstractC72932td instanceof C72922tc) {
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) this.l1;
            if (interfaceC65784Pro == null) {
                return;
            }
            interfaceC65784Pro.invoke();
            return;
        }
        if (abstractC72932td instanceof C3C1) {
            InterfaceC88472Yns interfaceC88472Yns2 = (InterfaceC88472Yns) this.l2;
            if (interfaceC88472Yns2 == null) {
                return;
            }
            interfaceC88472Yns2.invoke(((C3C1) abstractC72932td).LIZ);
            return;
        }
        if (!(abstractC72932td instanceof C72912tb) || (interfaceC88472Yns = (InterfaceC88472Yns) this.l3) == null) {
            return;
        }
        interfaceC88472Yns.invoke(((C72912tb) abstractC72932td).LIZ);
    }

    public static final Object invoke$0(AqS57S0400000_12 aqS57S0400000_12, Object obj) {
        InterfaceC98243tM receiver = ((InterfaceC73149SnJ) aqS57S0400000_12.l0).getReceiver();
        if (receiver != null) {
            ((InterfaceC88471Ynr) aqS57S0400000_12.l3).invoke(receiver, obj);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS57S0400000_12 aqS57S0400000_12, Object obj) {
        InterfaceC98243tM receiver = ((InterfaceC73149SnJ) aqS57S0400000_12.l0).getReceiver();
        if (receiver != null) {
            ((InterfaceC88471Ynr) aqS57S0400000_12.l3).invoke(receiver, obj);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (r2 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$10(kotlin.jvm.internal.AqS57S0400000_12 r7, java.lang.Object r8) {
        /*
            java.util.List r8 = (java.util.List) r8
            java.lang.String r0 = "paymentElements"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.viewholder.BANormalElementVH r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.viewholder.BANormalElementVH) r0
            X.8b3 r0 = r0.LJLIL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.BillingAddressViewModel r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.BillingAddressViewModel) r0
            java.util.Map<java.lang.String, java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement>> r1 = r0.LJLIL
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.String r0 = "sub_payment_type_element"
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L23
            X.OQg r0 = X.C61878OQg.INSTANCE
        L23:
            r6 = 0
            java.lang.Object r0 = X.ORZ.LJLLLLLL(r6, r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement) r0
            if (r0 == 0) goto L32
            java.lang.String r3 = r0.getParamValue()
            if (r3 != 0) goto L38
        L32:
            java.lang.Object r0 = r7.l1
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r0
            java.lang.String r3 = r0.id
        L38:
            java.lang.Object r0 = r7.l1
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r0
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r0 = r0.subPaymentMethods
            if (r0 == 0) goto L5d
            java.util.Iterator r1 = r0.iterator()
        L44:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lc2
            java.lang.Object r2 = r1.next()
            r0 = r2
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r0
            java.lang.String r0 = r0.id
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r3)
            if (r0 == 0) goto L44
        L59:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r2 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r2
            if (r2 != 0) goto L61
        L5d:
            java.lang.Object r2 = r7.l1
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r2 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r2
        L61:
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.viewholder.BANormalElementVH r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.viewholder.BANormalElementVH) r0
            X.8b3 r0 = r0.LJLIL
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.BillingAddressViewModel r1 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.BillingAddressViewModel) r1
            java.lang.Object r0 = r7.l2
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO) r0
            java.lang.String r0 = r0.id
            java.lang.String r5 = r1.pv0(r0, r8)
            java.lang.String r1 = r2.LJIIL()
            if (r5 == 0) goto L83
            int r0 = r5.length()
            if (r0 != 0) goto L84
        L83:
            r6 = 1
        L84:
            java.lang.Object r0 = r7.l2
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO) r0
            java.lang.String r0 = r0.paramName
            java.lang.String r4 = X.C28112B1o.LJIILIIL(r0)
            java.lang.Object r0 = r7.l3
            X.SD5 r0 = (X.SD5) r0
            java.lang.String r3 = r0.getInputMethod()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = X.C27493Aqf.LIZ
            r2.putAll(r0)
            java.lang.String r0 = "option_name"
            r2.put(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.String r0 = "is_valid"
            r2.put(r0, r1)
            java.lang.String r0 = "input_name"
            r2.put(r0, r4)
            if (r3 != 0) goto Lb7
            java.lang.String r3 = ""
        Lb7:
            java.lang.String r0 = "input_method"
            r2.put(r0, r3)
            java.lang.String r0 = "tiktokec_input_result"
            X.C76542zS.LIZ(r0, r2)
            return r5
        Lc2:
            r2 = 0
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS57S0400000_12.invoke$10(kotlin.jvm.internal.AqS57S0400000_12, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r7 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$11(kotlin.jvm.internal.AqS57S0400000_12 r9, java.lang.Object r10) {
        /*
            java.util.List r10 = (java.util.List) r10
            java.lang.String r0 = "paymentElements"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.ecommerce.us.osp.payment.viewholder.ccdc.USBANormalElementVH r0 = (com.ss.android.ugc.aweme.ecommerce.us.osp.payment.viewholder.ccdc.USBANormalElementVH) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel r1 = r0.getViewModel()
            java.lang.String r0 = "sub_payment_type_element"
            java.util.List r0 = r1.jv0(r0)
            r4 = 0
            java.lang.Object r0 = X.ORZ.LJLLLLLL(r4, r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement) r0
            if (r0 == 0) goto L24
            java.lang.String r2 = r0.getParamValue()
            if (r2 != 0) goto L2a
        L24:
            java.lang.Object r0 = r9.l1
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r0
            java.lang.String r2 = r0.id
        L2a:
            java.lang.Object r0 = r9.l1
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r0
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r0 = r0.subPaymentMethods
            r3 = 0
            if (r0 == 0) goto L50
            java.util.Iterator r1 = r0.iterator()
        L37:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Ldb
            java.lang.Object r7 = r1.next()
            r0 = r7
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r0
            java.lang.String r0 = r0.id
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r2)
            if (r0 == 0) goto L37
        L4c:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r7 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r7
            if (r7 != 0) goto L54
        L50:
            java.lang.Object r7 = r9.l1
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r7 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r7
        L54:
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.ecommerce.us.osp.payment.viewholder.ccdc.USBANormalElementVH r0 = (com.ss.android.ugc.aweme.ecommerce.us.osp.payment.viewholder.ccdc.USBANormalElementVH) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel r1 = r0.getViewModel()
            java.lang.Object r0 = r9.l2
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO) r0
            java.lang.String r0 = r0.id
            java.lang.String r8 = r1.uv0(r0, r10)
            java.lang.Object r1 = r9.l3
            X.SD5 r1 = (X.SD5) r1
            r0 = 2131368825(0x7f0a1b79, float:1.835761E38)
            android.view.View r0 = r1.LIZIZ(r0)
            X.19K r0 = (X.C19K) r0
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto Ld9
            int r2 = r0.length()
        L7d:
            java.lang.Object r1 = r9.l0
            com.ss.android.ugc.aweme.ecommerce.us.osp.payment.viewholder.ccdc.USBANormalElementVH r1 = (com.ss.android.ugc.aweme.ecommerce.us.osp.payment.viewholder.ccdc.USBANormalElementVH) r1
            int r0 = r1.LJLJI
            int r2 = r2 - r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel r0 = r1.getViewModel()
            r0.getClass()
            if (r2 <= 0) goto Lc8
            java.lang.String r5 = "add"
        L8f:
            java.lang.Object r0 = r9.l2
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO) r0
            java.lang.String r0 = r0.paramName
            java.lang.String r6 = X.C28112B1o.LJIILIIL(r0)
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.us.osp.payment.viewholder.ccdc.USBANormalElementVH> r0 = com.ss.android.ugc.aweme.ecommerce.us.osp.payment.viewholder.ccdc.USBANormalElementVH.class
            X.Prg r0 = X.C65352Pkq.LIZ(r0)
            java.lang.String r0 = r0.LJFF()
            long r1 = X.C28112B1o.LIZ(r0)
            if (r8 != 0) goto Lc6
            r0 = 1
        Laa:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C28112B1o.LJIIIIZZ(r6, r1, r5, r0)
            java.lang.String r1 = r7.LJIIL()
            if (r8 != 0) goto Lb8
            r4 = 1
        Lb8:
            java.lang.Object r0 = r9.l2
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO) r0
            java.lang.String r0 = r0.paramName
            java.lang.String r0 = X.C28112B1o.LJIILIIL(r0)
            X.C28112B1o.LJI(r3, r1, r0, r5, r4)
            return r8
        Lc6:
            r0 = 0
            goto Laa
        Lc8:
            if (r2 >= 0) goto Lcd
            java.lang.String r5 = "del"
            goto L8f
        Lcd:
            java.lang.String r5 = ""
            java.lang.String r1 = "auto"
            boolean r0 = kotlin.jvm.internal.o.LJ(r5, r1)
            if (r0 == 0) goto L8f
            r5 = r1
            goto L8f
        Ld9:
            r2 = 0
            goto L7d
        Ldb:
            r7 = r3
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS57S0400000_12.invoke$11(kotlin.jvm.internal.AqS57S0400000_12, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$12(AqS57S0400000_12 aqS57S0400000_12, Object obj) {
        ((Number) obj).intValue();
        C71420S1g c71420S1g = (C71420S1g) aqS57S0400000_12.l0;
        LC5.LIZJ(c71420S1g.LJI, c71420S1g.LJIIIIZZ, c71420S1g.LJFF, ((C34K) aqS57S0400000_12.l1).element, LC5.LIZIZ(c71420S1g.LJII), LC5.LIZIZ(((C71420S1g) aqS57S0400000_12.l0).LJIIIZ), new AqS143S0200000_12((C71420S1g) aqS57S0400000_12.l0, (Aweme) aqS57S0400000_12.l2, (S1U) aqS57S0400000_12.l3, 118));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS57S0400000_12 aqS57S0400000_12, Object obj) {
        String str;
        String str2;
        RecyclerView recyclerView;
        PaymentMethod paymentMethod;
        List<PaymentElement> it = (List) obj;
        o.LJIIIZ(it, "it");
        ((CCDCCardNumberElementViewHolder) aqS57S0400000_12.l0).getViewModel().iv0().LJ(new AqS178S0100000_12((C71723SCx) aqS57S0400000_12.l3, 601));
        CCDCAddCardViewModel viewModel = ((CCDCCardNumberElementViewHolder) aqS57S0400000_12.l0).getViewModel();
        PaymentElement paymentElement = (PaymentElement) ORZ.LJLLLLLL(0, it);
        if (paymentElement != null) {
            str = paymentElement.getParamValue();
        } else {
            str = null;
        }
        PaymentMethod paymentMethod2 = (PaymentMethod) aqS57S0400000_12.l1;
        viewModel.getClass();
        C276116n c276116n = C22780uw.LIZ;
        String str3 = "";
        if (str == null) {
            str = "";
        }
        C24050wz LIZIZ = c276116n.LIZIZ(str);
        if (LIZIZ != null) {
            str2 = LIZIZ.LJI;
        } else {
            str2 = null;
        }
        if (paymentMethod2 != null) {
            List<PaymentMethod> list = paymentMethod2.subPaymentMethods;
            if (list != null) {
                Iterator<PaymentMethod> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        paymentMethod = it2.next();
                        if (o.LJ(paymentMethod.id, str2)) {
                            break;
                        }
                    } else {
                        paymentMethod = null;
                        break;
                    }
                }
                PaymentMethod paymentMethod3 = paymentMethod;
                if (paymentMethod3 != null) {
                    paymentMethod2 = paymentMethod3;
                }
            }
            CCDCCardNumberElementViewHolder cCDCCardNumberElementViewHolder = (CCDCCardNumberElementViewHolder) aqS57S0400000_12.l0;
            ElementDTO elementDTO = (ElementDTO) aqS57S0400000_12.l2;
            CCDCAddCardViewModel viewModel2 = cCDCCardNumberElementViewHolder.getViewModel();
            ViewParent parent = cCDCCardNumberElementViewHolder.itemView.getParent();
            if (parent instanceof RecyclerView) {
                recyclerView = (RecyclerView) parent;
            } else {
                recyclerView = null;
            }
            viewModel2.tv0(elementDTO, paymentMethod2, it, recyclerView, cCDCCardNumberElementViewHolder.getFocusView());
        }
        CCDCAddCardViewModel viewModel3 = ((CCDCCardNumberElementViewHolder) aqS57S0400000_12.l0).getViewModel();
        String str4 = ((ElementDTO) aqS57S0400000_12.l2).id;
        if (str4 != null) {
            str3 = str4;
        }
        viewModel3.sv0(str3, it);
        ((CCDCCardNumberElementViewHolder) aqS57S0400000_12.l0).getViewModel().mv0(((CCDCCardNumberElementViewHolder) aqS57S0400000_12.l0).getViewModel().hv0());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS57S0400000_12 aqS57S0400000_12, Object obj) {
        RecyclerView recyclerView;
        List<PaymentElement> it = (List) obj;
        o.LJIIIZ(it, "it");
        ((CCDCDateElementViewHolder) aqS57S0400000_12.l0).getViewModel().iv0().LJ(new AqS178S0100000_12((SD3) aqS57S0400000_12.l3, 602));
        CCDCAddCardViewModel viewModel = ((CCDCDateElementViewHolder) aqS57S0400000_12.l0).getViewModel();
        ElementDTO elementDTO = (ElementDTO) aqS57S0400000_12.l1;
        PaymentMethod paymentMethod = (PaymentMethod) aqS57S0400000_12.l2;
        ViewParent parent = ((CCDCDateElementViewHolder) aqS57S0400000_12.l0).itemView.getParent();
        if (parent instanceof RecyclerView) {
            recyclerView = (RecyclerView) parent;
        } else {
            recyclerView = null;
        }
        viewModel.tv0(elementDTO, paymentMethod, it, recyclerView, ((CCDCDateElementViewHolder) aqS57S0400000_12.l0).getFocusView());
        CCDCAddCardViewModel viewModel2 = ((CCDCDateElementViewHolder) aqS57S0400000_12.l0).getViewModel();
        String str = ((ElementDTO) aqS57S0400000_12.l1).id;
        if (str == null) {
            str = "";
        }
        viewModel2.sv0(str, it);
        ((CCDCDateElementViewHolder) aqS57S0400000_12.l0).getViewModel().mv0(((CCDCDateElementViewHolder) aqS57S0400000_12.l0).getViewModel().hv0());
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$15(AqS57S0400000_12 aqS57S0400000_12, Object obj) {
        aqS57S0400000_12.invoke$3(obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS57S0400000_12 aqS57S0400000_12, Object obj) {
        View view;
        C71765SEn it = (C71765SEn) obj;
        o.LJIIIZ(it, "it");
        SubPaymentListAssem subPaymentListAssem = (SubPaymentListAssem) aqS57S0400000_12.l0;
        List list = (List) aqS57S0400000_12.l1;
        PaymentMethod paymentMethod = (PaymentMethod) aqS57S0400000_12.l3;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it2 = list.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            View layoutEmpty = null;
            if (it2.hasNext()) {
                Object next = it2.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    PaymentMethod paymentMethod2 = (PaymentMethod) next;
                    arrayList.add(new C71767SEp(paymentMethod, paymentMethod2, C61841OOv.LIZIZ(paymentMethod2, it.LJLJJI)));
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            } else {
                subPaymentListAssem.LJLJJL = arrayList;
                View containerView = ((UIAssem) aqS57S0400000_12.l2).getContainerView();
                if (containerView != null) {
                    view = containerView.findViewById(R.id.hqs);
                } else {
                    view = null;
                }
                ((SYL) view).getState().LJIILLIIL(((SubPaymentListAssem) aqS57S0400000_12.l0).LJLJJL);
                View containerView2 = ((UIAssem) aqS57S0400000_12.l2).getContainerView();
                if (containerView2 != null) {
                    layoutEmpty = containerView2.findViewById(R.id.fg7);
                }
                o.LJIIIIZZ(layoutEmpty, "layoutEmpty");
                if (!((ArrayList) ((SubPaymentListAssem) aqS57S0400000_12.l0).LJLJJL).isEmpty()) {
                    i = 8;
                }
                layoutEmpty.setVisibility(i);
                return C76800UCe.LIZ;
            }
        }
    }

    public static final Object invoke$17(AqS57S0400000_12 aqS57S0400000_12, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.mv0((Fragment) aqS57S0400000_12.l0, new AqS178S0100000_12((DataChannel) aqS57S0400000_12.l1, 728));
        assemble.xv0((Fragment) aqS57S0400000_12.l0, new AqS143S0200000_12((TYN) aqS57S0400000_12.l2, (ViewGroup) aqS57S0400000_12.l3, 172));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS57S0400000_12 aqS57S0400000_12, Object it) {
        o.LJIIIZ(it, "it");
        if (((FragmentManager) aqS57S0400000_12.l0) != null) {
            Uri build = C26867AgZ.LIZJ("bullet://bullet", C113554cx.LJJJLZIJ(new OSZ("url", ((Uri) aqS57S0400000_12.l2).toString()))).build();
            o.LJIIIIZZ(build, "RouterUtils.createUrl(\n …                ).build()");
            C40341FsP.LIZ(build, (int) ((C27162AlK.LIZIZ - (JF5.LIZ((Context) aqS57S0400000_12.l1) + JF5.LIZLLL((Context) aqS57S0400000_12.l1))) * 0.95f), (FragmentManager) aqS57S0400000_12.l0, "report_page", false);
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS57S0400000_12.l3;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AqS57S0400000_12 aqS57S0400000_12, Object obj) {
        View it = (View) obj;
        o.LJIIIZ(it, "it");
        PdpViewModel viewModel = ((PdpBodyWidget) aqS57S0400000_12.l0).getViewModel();
        Context context = it.getContext();
        o.LJIIIIZZ(context, "it.context");
        viewModel.Fw0(context, (String) ((C68322mC) aqS57S0400000_12.l1).element, null, null);
        if (((PdpBodyWidget) aqS57S0400000_12.l0).getViewModel().LLFII != null) {
            C70414RkI.LJJ(((PdpBodyWidget) aqS57S0400000_12.l0).getFragment(), (C69643RUx) aqS57S0400000_12.l2, "add_on_entrance");
        }
        C70414RkI c70414RkI = ((PdpBodyWidget) aqS57S0400000_12.l0).getViewModel().LLFII;
        if (c70414RkI != null) {
            c70414RkI.LJIJJLI((Map) aqS57S0400000_12.l3);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS57S0400000_12 aqS57S0400000_12, Object obj) {
        C8V2 uiSlotAssem = (C8V2) obj;
        o.LJIIIZ(uiSlotAssem, "$this$uiSlotAssem");
        uiSlotAssem.LJI = R.id.dbx;
        uiSlotAssem.LIZLLL((InterfaceC65350Pko) aqS57S0400000_12.l0);
        ((Assembler) aqS57S0400000_12.l1).mv0((TemplateEditFragment) aqS57S0400000_12.l2, new AqS178S0100000_12((TemplateItem) aqS57S0400000_12.l3, 221));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS57S0400000_12 aqS57S0400000_12, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJII(C207798Dn.LIZIZ((Activity) aqS57S0400000_12.l0, R.string.eq, "activity.resources.getSt…creen_modal_lite_button1)"), new AqS57S0400000_12((AIGCPictureHandler) aqS57S0400000_12.l1, (Activity) aqS57S0400000_12.l0, (List) aqS57S0400000_12.l2, (InterfaceC88472Yns) aqS57S0400000_12.l3, 6));
        actionGroup.LJIIIZ(C207798Dn.LIZIZ((Activity) aqS57S0400000_12.l0, R.string.er, "activity.resources.getSt…creen_modal_lite_button2)"), new AqS178S0100000_12((AIGCPictureHandler) aqS57S0400000_12.l1, BuildConfig.VERSION_CODE));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS57S0400000_12 aqS57S0400000_12, Object it) {
        String str;
        o.LJIIIZ(it, "it");
        AIGCPictureHandler.checkValidAndUpload$continueRun((AIGCPictureHandler) aqS57S0400000_12.l0, (Activity) aqS57S0400000_12.l1, (List) aqS57S0400000_12.l2, (InterfaceC88472Yns) aqS57S0400000_12.l3);
        if (((AIGCPictureHandler) aqS57S0400000_12.l0).isFastPath) {
            str = "fast";
        } else {
            str = "slow";
        }
        C72413SbR.LIZJ("confirm", str);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AqS57S0400000_12 aqS57S0400000_12, Object obj) {
        aqS57S0400000_12.invoke$0((Announcement) obj);
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS57S0400000_12(com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler r3, android.app.Activity r4, java.util.List r5, X.InterfaceC88472Yns r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            switch(r7) {
                case 5: goto L13;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r5
            r1.l3 = r6
            r0 = 1
        Lf:
            r1.<init>(r0)
            return
        L13:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r1.l2 = r5
            r1.l3 = r6
            r0 = 1
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS57S0400000_12.<init>(com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler, android.app.Activity, java.util.List, X.Yns, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S0400000_12(C56412MCa c56412MCa, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c56412MCa;
        this.l1 = interfaceC65784Pro;
        this.l2 = interfaceC88472Yns;
        this.l3 = interfaceC88472Yns2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS57S0400000_12(InterfaceC65350Pko interfaceC65350Pko, InterfaceC65350Pko<? extends Object> interfaceC65350Pko2, Assembler assembler, TemplateEditFragment templateEditFragment, TemplateItem templateItem) {
        super(1);
        this.$t = templateItem;
        this.l0 = interfaceC65350Pko;
        this.l1 = interfaceC65350Pko2;
        this.l2 = assembler;
        this.l3 = templateEditFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S0400000_12(C71420S1g c71420S1g, C34K c34k, Aweme aweme, S1U s1u, int i) {
        super(1);
        this.$t = i;
        this.l0 = c71420S1g;
        this.l1 = c34k;
        this.l2 = aweme;
        this.l3 = s1u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S0400000_12(InterfaceC73149SnJ interfaceC73149SnJ, InterfaceC73150SnK interfaceC73150SnK, TBW tbw, InterfaceC88471Ynr interfaceC88471Ynr, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC73149SnJ;
        this.l1 = interfaceC73150SnK;
        this.l2 = tbw;
        this.l3 = interfaceC88471Ynr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S0400000_12(InterfaceC73149SnJ interfaceC73149SnJ, InterfaceC73150SnK interfaceC73150SnK, TBZ tbz, InterfaceC88471Ynr interfaceC88471Ynr, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC73149SnJ;
        this.l1 = interfaceC73150SnK;
        this.l2 = tbz;
        this.l3 = interfaceC88471Ynr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S0400000_12(Fragment fragment, DataChannel dataChannel, TYN tyn, ViewGroup viewGroup, int i) {
        super(1);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = dataChannel;
        this.l2 = tyn;
        this.l3 = viewGroup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S0400000_12(FragmentManager fragmentManager, Context context, Uri uri, AqS162S0100000_12 aqS162S0100000_12, int i) {
        super(1);
        this.$t = i;
        this.l0 = fragmentManager;
        this.l1 = context;
        this.l2 = uri;
        this.l3 = aqS162S0100000_12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S0400000_12(BANormalElementVH bANormalElementVH, PaymentMethod paymentMethod, ElementDTO elementDTO, SD5 sd5, int i) {
        super(1);
        this.$t = i;
        this.l0 = bANormalElementVH;
        this.l1 = paymentMethod;
        this.l2 = elementDTO;
        this.l3 = sd5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S0400000_12(CCDCCardNumberElementViewHolder cCDCCardNumberElementViewHolder, PaymentMethod paymentMethod, ElementDTO elementDTO, C71723SCx c71723SCx, int i) {
        super(1);
        this.$t = i;
        this.l0 = cCDCCardNumberElementViewHolder;
        this.l1 = paymentMethod;
        this.l2 = elementDTO;
        this.l3 = c71723SCx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S0400000_12(CCDCDateElementViewHolder cCDCDateElementViewHolder, ElementDTO elementDTO, PaymentMethod paymentMethod, SD3 sd3, int i) {
        super(1);
        this.$t = i;
        this.l0 = cCDCDateElementViewHolder;
        this.l1 = elementDTO;
        this.l2 = paymentMethod;
        this.l3 = sd3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS57S0400000_12(SubPaymentListAssem subPaymentListAssem, SubPaymentListAssem subPaymentListAssem2, List<PaymentMethod> list, UIAssem uIAssem, PaymentMethod paymentMethod) {
        super(1);
        this.$t = paymentMethod;
        this.l0 = subPaymentListAssem;
        this.l1 = subPaymentListAssem2;
        this.l2 = list;
        this.l3 = uIAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S0400000_12(Announcement announcement, PdpFragment pdpFragment, PdpViewModel pdpViewModel, C70085Rez c70085Rez, int i) {
        super(1);
        this.$t = i;
        this.l0 = c70085Rez;
        this.l1 = pdpFragment;
        this.l2 = pdpViewModel;
        this.l3 = announcement;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS57S0400000_12(PdpBodyWidget pdpBodyWidget, PdpBodyWidget pdpBodyWidget2, C68322mC<String> c68322mC, C69643RUx c69643RUx, Map<String, Object> map) {
        super(1);
        this.$t = map;
        this.l0 = pdpBodyWidget;
        this.l1 = pdpBodyWidget2;
        this.l2 = c68322mC;
        this.l3 = c69643RUx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S0400000_12(USBANormalElementVH uSBANormalElementVH, PaymentMethod paymentMethod, ElementDTO elementDTO, SD5 sd5, int i) {
        super(1);
        this.$t = i;
        this.l0 = uSBANormalElementVH;
        this.l1 = paymentMethod;
        this.l2 = elementDTO;
        this.l3 = sd5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S0400000_12(C73165SnZ c73165SnZ, JediViewModel jediViewModel, LifecycleOwner lifecycleOwner, TBW tbw, TBW tbw2, InterfaceC88471Ynr interfaceC88471Ynr, int i) {
        super(1);
        this.$t = i;
        this.l0 = lifecycleOwner;
        this.l1 = tbw;
        this.l2 = tbw2;
        this.l3 = interfaceC88471Ynr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S0400000_12(JediViewModel jediViewModel, LifecycleOwner lifecycleOwner, boolean z, boolean z2, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, InterfaceC65784Pro interfaceC65784Pro, int i) {
        super(1);
        this.$t = i;
        this.l0 = lifecycleOwner;
        this.l1 = interfaceC88472Yns;
        this.l2 = interfaceC88472Yns2;
        this.l3 = interfaceC65784Pro;
    }
}
