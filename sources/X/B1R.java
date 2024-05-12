package X;

import Y.ACListenerS24S0100000_4;
import Y.IDObjectS328S0100000_4;
import Y.IDObjectS3S0101000_4;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentLabel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.PaymentMethodView;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.utils.Au2S0S1100000_4;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class B1R extends FrameLayout {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public HashMap<String, Object> LJLJI;
    public InterfaceC65784Pro<C76800UCe> LJLJJI;
    public InterfaceC65784Pro<C76800UCe> LJLJJL;
    public InterfaceC65784Pro<C76800UCe> LJLJJLL;
    public InterfaceC65784Pro<C76800UCe> LJLJL;
    public InterfaceC88472Yns<? super String, C76800UCe> LJLJLJ;
    public InterfaceC88472Yns<? super InstallmentPlan, C76800UCe> LJLJLLL;
    public InterfaceC88472Yns<? super PaymentMethod, C76800UCe> LJLL;
    public InterfaceC65784Pro<C76800UCe> LJLLI;
    public PaymentInfo LJLLILLLL;
    public Boolean LJLLJ;
    public PaymentMethod LJLLL;
    public String LJLLLL;
    public final java.util.Map<Integer, View> LJLLLLLL = new LinkedHashMap();

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final boolean LJIIJ() {
        String str;
        String str2;
        BindInfo bindInfo;
        PaymentMethod paymentMethod = this.LJLLL;
        String str3 = null;
        if (paymentMethod != null) {
            str = paymentMethod.id;
        } else {
            str = null;
        }
        if (!o.LJ(str, "pm_pi_ccdc_all")) {
            PaymentMethod paymentMethod2 = this.LJLLL;
            if (paymentMethod2 != null && (bindInfo = paymentMethod2.bindInfo) != null) {
                str2 = bindInfo.buttonText;
            } else {
                str2 = null;
            }
            if (str2 == null || str2.length() == 0) {
                PaymentMethod paymentMethod3 = this.LJLLL;
                if (paymentMethod3 != null) {
                    str3 = paymentMethod3.id;
                }
                if (!o.LJ(str3, "pm_pi_atmcard_all")) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void LIZIZ() {
        View llInstallmentPlanContainer = LIZ(R.id.g0w);
        o.LJIIIIZZ(llInstallmentPlanContainer, "llInstallmentPlanContainer");
        if (llInstallmentPlanContainer.getVisibility() == 0) {
            ViewGroup llInstallmentPlanContainer2 = (ViewGroup) LIZ(R.id.g0w);
            o.LJIIIIZZ(llInstallmentPlanContainer2, "llInstallmentPlanContainer");
            IDObjectS328S0100000_4 iDObjectS328S0100000_4 = new IDObjectS328S0100000_4(llInstallmentPlanContainer2, 5);
            ArrayList arrayList = new ArrayList();
            Iterator it = iDObjectS328S0100000_4.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if ((view instanceof C70360RjQ) && view != null) {
                    arrayList.add(view);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C70360RjQ c70360RjQ = (C70360RjQ) it2.next();
                if (c70360RjQ.LIZJ()) {
                    c70360RjQ.setChecked$ecommerce_transaction_release(false);
                }
            }
        }
    }

    public final void LIZJ() {
        View llSubPaymentContainer = LIZ(R.id.g1_);
        o.LJIIIIZZ(llSubPaymentContainer, "llSubPaymentContainer");
        if (llSubPaymentContainer.getVisibility() == 0) {
            ViewGroup llSubPaymentContainer2 = (ViewGroup) LIZ(R.id.g1_);
            o.LJIIIIZZ(llSubPaymentContainer2, "llSubPaymentContainer");
            IDObjectS328S0100000_4 iDObjectS328S0100000_4 = new IDObjectS328S0100000_4(llSubPaymentContainer2, 6);
            ArrayList arrayList = new ArrayList();
            Iterator it = iDObjectS328S0100000_4.iterator();
            while (true) {
                IDObjectS3S0101000_4 iDObjectS3S0101000_4 = (IDObjectS3S0101000_4) it;
                if (!iDObjectS3S0101000_4.hasNext()) {
                    break;
                }
                View view = (View) iDObjectS3S0101000_4.next();
                if ((view instanceof B1W) && view != null) {
                    arrayList.add(view);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                B1W b1w = (B1W) it2.next();
                if (b1w.LIZ(R.id.fge).isSelected()) {
                    b1w.setChecked(false);
                }
            }
        }
    }

    public final void LIZLLL() {
        View llBalanceLayout = LIZ(R.id.g0j);
        o.LJIIIIZZ(llBalanceLayout, "llBalanceLayout");
        OUP.LJIJJLI(llBalanceLayout);
    }

    public final void LJ() {
        View llInstallmentPlanContainer = LIZ(R.id.g0w);
        o.LJIIIIZZ(llInstallmentPlanContainer, "llInstallmentPlanContainer");
        OUP.LJIJJLI(llInstallmentPlanContainer);
        ((ViewGroup) LIZ(R.id.g0w)).removeAllViews();
        View llViewMoreInstallmentPlans = LIZ(R.id.g1e);
        o.LJIIIIZZ(llViewMoreInstallmentPlans, "llViewMoreInstallmentPlans");
        OUP.LJIJJLI(llViewMoreInstallmentPlans);
    }

    public final void LJFF() {
        View llPaymentTip = LIZ(R.id.g12);
        o.LJIIIIZZ(llPaymentTip, "llPaymentTip");
        OUP.LJIJJLI(llPaymentTip);
        View iconPaymentTip = LIZ(R.id.eab);
        o.LJIIIIZZ(iconPaymentTip, "iconPaymentTip");
        OUP.LJIJJLI(iconPaymentTip);
    }

    public final void LJI() {
        View llPaymentTipStyleLayout = LIZ(R.id.g13);
        o.LJIIIIZZ(llPaymentTipStyleLayout, "llPaymentTipStyleLayout");
        OUP.LJIJJLI(llPaymentTipStyleLayout);
    }

    public final void LJII() {
        View llSubPaymentContainer = LIZ(R.id.g1_);
        o.LJIIIIZZ(llSubPaymentContainer, "llSubPaymentContainer");
        OUP.LJIJJLI(llSubPaymentContainer);
        ((ViewGroup) LIZ(R.id.g1_)).removeAllViews();
        View llViewMoreSubPayments = LIZ(R.id.g1f);
        o.LJIIIIZZ(llViewMoreSubPayments, "llViewMoreSubPayments");
        OUP.LJIJJLI(llViewMoreSubPayments);
    }

    public final boolean LJIIIZ() {
        return ((CompoundButton) LIZ(R.id.iln)).isChecked();
    }

    public final boolean LJIIJJI() {
        PaymentMethod paymentMethod;
        List<PaymentMethod> list;
        View iconEditSEA = LIZ(R.id.ea6);
        o.LJIIIIZZ(iconEditSEA, "iconEditSEA");
        if (iconEditSEA.getVisibility() == 0 && ((paymentMethod = this.LJLLL) == null || (list = paymentMethod.subPaymentMethods) == null || list.isEmpty())) {
            return true;
        }
        return false;
    }

    public final void LJIILJJIL() {
        String LJIIIIZZ;
        boolean z;
        if (LJIIIZ() && LJIIJJI()) {
            PaymentMethod paymentMethod = this.LJLLL;
            if (paymentMethod != null) {
                LJIIIIZZ = paymentMethod.LJIIIZ();
            }
            LJIIIIZZ = null;
        } else {
            PaymentMethod paymentMethod2 = this.LJLLL;
            if (paymentMethod2 != null) {
                LJIIIIZZ = paymentMethod2.LJIIIIZZ();
            }
            LJIIIIZZ = null;
        }
        if (LJIIIIZZ != null && C78685UuP.LJJJZ(LJIIIIZZ)) {
            z = true;
        } else {
            PaymentMethod paymentMethod3 = this.LJLLL;
            if (paymentMethod3 != null) {
                LJIIIIZZ = paymentMethod3.extraInfo;
            } else {
                LJIIIIZZ = null;
            }
            z = false;
        }
        if (LJIIIIZZ != null && LJIIIIZZ.length() > 0) {
            View tag_extra_layout = LIZ(R.id.kzy);
            o.LJIIIIZZ(tag_extra_layout, "tag_extra_layout");
            OUP.LJJLIIIJ(tag_extra_layout);
            View tvExtraInfoBelow = LIZ(R.id.lwf);
            o.LJIIIIZZ(tvExtraInfoBelow, "tvExtraInfoBelow");
            OUP.LJJLIIIJ(tvExtraInfoBelow);
            ((TextView) LIZ(R.id.lwf)).setText(LJIIIIZZ);
            if (z) {
                ((TextView) LIZ(R.id.lwf)).setMaxLines(2);
                return;
            } else {
                ((TextView) LIZ(R.id.lwf)).setMaxLines(1);
                return;
            }
        }
        View tvExtraInfoBelow2 = LIZ(R.id.lwf);
        o.LJIIIIZZ(tvExtraInfoBelow2, "tvExtraInfoBelow");
        OUP.LJIJJLI(tvExtraInfoBelow2);
    }

    public final void LJIILL() {
        String str = null;
        if (LJIIIZ() && !LJIIJJI()) {
            C28098B1a c28098B1a = PaymentMethodView.Companion;
            PaymentMethod paymentMethod = this.LJLLL;
            c28098B1a.getClass();
            str = C28098B1a.LIZ(paymentMethod);
        }
        if (str != null && str.length() > 0) {
            View tvExtraInfoRight = LIZ(R.id.lwg);
            o.LJIIIIZZ(tvExtraInfoRight, "tvExtraInfoRight");
            OUP.LJJLIIIJ(tvExtraInfoRight);
            ((TextView) LIZ(R.id.lwg)).setText(str);
            return;
        }
        View tvExtraInfoRight2 = LIZ(R.id.lwg);
        o.LJIIIIZZ(tvExtraInfoRight2, "tvExtraInfoRight");
        OUP.LJIJJLI(tvExtraInfoRight2);
    }

    public final InterfaceC65784Pro<C76800UCe> getEditClickListener() {
        return this.LJLLI;
    }

    public final HashMap<String, Object> getGeneralParams() {
        return this.LJLJI;
    }

    public final InterfaceC65784Pro<C76800UCe> getOnActivateClickListener() {
        return this.LJLJJL;
    }

    public final InterfaceC65784Pro<C76800UCe> getOnCheckedListener() {
        return this.LJLJJI;
    }

    public final InterfaceC88472Yns<InstallmentPlan, C76800UCe> getOnInstallmentPlanClickListener() {
        return this.LJLJLLL;
    }

    public final InterfaceC88472Yns<String, C76800UCe> getOnNoticeClickListener() {
        return this.LJLJLJ;
    }

    public final InterfaceC88472Yns<PaymentMethod, C76800UCe> getOnSubPaymentClickListener() {
        return this.LJLL;
    }

    public final InterfaceC65784Pro<C76800UCe> getOnViewMoreInstallmentPlansClickListener() {
        return this.LJLJL;
    }

    public final InterfaceC65784Pro<C76800UCe> getOnViewMoreSubPaymentsClickListener() {
        return this.LJLJJLL;
    }

    public final PaymentInfo getPaymentInfo() {
        return this.LJLLILLLL;
    }

    public final PaymentMethod getPaymentMethod() {
        return this.LJLLL;
    }

    public final String getPipoBnplTenureFromPdp() {
        return this.LJLLLL;
    }

    public B1R(Context context) {
        super(context, null, 0);
        this.LJLJI = new HashMap<>();
        this.LJLJJI = C28140B2q.LJLIL;
        this.LJLJJL = C28139B2p.LJLIL;
        this.LJLJJLL = C28142B2s.LJLIL;
        this.LJLJL = C28141B2r.LJLIL;
        this.LJLJLJ = B2S.LJLIL;
        this.LJLJLLL = C28127B2d.LJLIL;
        this.LJLL = B2T.LJLIL;
        this.LJLLI = C28138B2o.LJLIL;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a15, this, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(boolean r31) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B1R.LJIIL(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(boolean r15) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B1R.LJIILIIL(boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setChecked(boolean r17) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B1R.setChecked(boolean):void");
    }

    public final void setEditClickListener(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(interfaceC65784Pro, "<set-?>");
        this.LJLLI = interfaceC65784Pro;
    }

    public final void setGeneralParams(HashMap<String, Object> hashMap) {
        o.LJIIIZ(hashMap, "<set-?>");
        this.LJLJI = hashMap;
    }

    public final void setOnActivateClickListener(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(interfaceC65784Pro, "<set-?>");
        this.LJLJJL = interfaceC65784Pro;
    }

    public final void setOnCheckedListener(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(interfaceC65784Pro, "<set-?>");
        this.LJLJJI = interfaceC65784Pro;
    }

    public final void setOnInstallmentPlanClickListener(InterfaceC88472Yns<? super InstallmentPlan, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLJLLL = interfaceC88472Yns;
    }

    public final void setOnNoticeClickListener(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLJLJ = interfaceC88472Yns;
    }

    public final void setOnSubPaymentClickListener(InterfaceC88472Yns<? super PaymentMethod, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLL = interfaceC88472Yns;
    }

    public final void setOnViewMoreInstallmentPlansClickListener(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(interfaceC65784Pro, "<set-?>");
        this.LJLJL = interfaceC65784Pro;
    }

    public final void setOnViewMoreSubPaymentsClickListener(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(interfaceC65784Pro, "<set-?>");
        this.LJLJJLL = interfaceC65784Pro;
    }

    public final void setPaymentInfo(PaymentInfo paymentInfo) {
        this.LJLLILLLL = paymentInfo;
    }

    public final void setPaymentInfoFromOSP(Boolean bool) {
        this.LJLLJ = bool;
    }

    public final void setPaymentMethod(PaymentMethod paymentMethod) {
        List<InstallmentPlan> list;
        boolean z;
        boolean z2;
        String str;
        String str2;
        String str3;
        C1AU c1au;
        String str4;
        String str5;
        PaymentMethod paymentMethod2;
        PaymentLabel paymentLabel;
        String str6;
        String str7;
        List<PaymentMethod> list2;
        InstallmentInfo installmentInfo;
        this.LJLLL = paymentMethod;
        String str8 = null;
        if (paymentMethod != null && (installmentInfo = paymentMethod.installmentInfo) != null) {
            list = installmentInfo.installmentPlans;
        } else {
            list = null;
        }
        int i = 0;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        this.LJLIL = !z;
        if (paymentMethod == null || (list2 = paymentMethod.subPaymentMethods) == null || list2.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJLILLLLZI = !z2;
        PaymentMethod paymentMethod3 = this.LJLLL;
        if (paymentMethod3 != null) {
            String str9 = paymentMethod3.iconUrl;
            if (str9 == null) {
                str9 = " ";
            }
            W5F LJIIIIZZ = W5U.LJIIIIZZ(str9);
            LJIIIIZZ.LJJIIJ = (SmartImageView) LIZ(R.id.ewk);
            C16880lQ.LLJJJ(LJIIIIZZ);
            SmartImageView smartImageView = (SmartImageView) LIZ(R.id.ewk);
            S3I s3i = new S3I();
            s3i.LIZLLL = C79081V1x.LJII(2);
            smartImageView.setCircleOptions(new S3L(s3i));
            if (o.LJ(PaymentCacheHelper.LJFF().code, "US") && paymentMethod3.LIZIZ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("**** **** **** ");
                String str10 = paymentMethod3.displayName;
                if (str10 != null) {
                    str7 = C40689Fy1.LLIIIILZ(4, str10);
                } else {
                    str7 = "";
                }
                LIZ.append(str7);
                ((TextView) LIZ(R.id.lx4)).setText(X1D.LIZIZ(LIZ));
            } else {
                ((TextView) LIZ(R.id.lx4)).setText(paymentMethod3.displayName);
            }
            TextView textView = (TextView) LIZ(R.id.lx4);
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            textView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context));
            C27937Axp.LIZ.getClass();
            if (C27937Axp.LIZ().interaction) {
                PaymentMethod paymentMethod4 = this.LJLLL;
                if (paymentMethod4 == null || (str6 = paymentMethod4.explanationUrl) == null || str6.length() == 0) {
                    View icNotice = LIZ(R.id.e8x);
                    o.LJIIIIZZ(icNotice, "icNotice");
                    OUP.LJIJJLI(icNotice);
                } else {
                    PaymentMethod paymentMethod5 = this.LJLLL;
                    if (paymentMethod5 != null) {
                        C27949Ay1.LJIILIIL(paymentMethod5);
                    }
                    View icNotice2 = LIZ(R.id.e8x);
                    o.LJIIIIZZ(icNotice2, "icNotice");
                    OUP.LJJLIIIJ(icNotice2);
                    View icNotice3 = LIZ(R.id.e8x);
                    o.LJIIIIZZ(icNotice3, "icNotice");
                    C16880lQ.LJIIJ(new Au2S0S1100000_4(this, str6, 8), icNotice3);
                }
                PaymentMethod paymentMethod6 = this.LJLLL;
                if (paymentMethod6 != null && (paymentLabel = paymentMethod6.paymentLabel) != null && paymentLabel.labelName != null && paymentLabel.fontColor != null && paymentLabel.backgroundColor != null) {
                    try {
                        LinearLayout tag_extra_layout = (LinearLayout) LIZ(R.id.kzy);
                        o.LJIIIIZZ(tag_extra_layout, "tag_extra_layout");
                        OUP.LJJLIIIJ(tag_extra_layout);
                        CardView tagContainer = (CardView) LIZ(R.id.kzn);
                        o.LJIIIIZZ(tagContainer, "tagContainer");
                        OUP.LJJLIIIJ(tagContainer);
                        ((TuxTextView) LIZ(R.id.lwu)).setText(paymentLabel.labelName);
                        ((CardView) LIZ(R.id.kzn)).setBackgroundTintList(ColorStateList.valueOf(C30591Hz.LJJIIJZLJL(paymentLabel.backgroundColor)));
                        ((TuxTextView) LIZ(R.id.lwu)).setTextColor(C30591Hz.LJJIIJZLJL(paymentLabel.fontColor));
                    } catch (Exception e) {
                        View tagContainer2 = LIZ(R.id.kzn);
                        o.LJIIIIZZ(tagContainer2, "tagContainer");
                        OUP.LJIJJLI(tagContainer2);
                        C78983UzD.LJIILL(e.getMessage());
                    }
                } else {
                    View tagContainer3 = LIZ(R.id.kzn);
                    o.LJIIIIZZ(tagContainer3, "tagContainer");
                    OUP.LJIJJLI(tagContainer3);
                }
            } else {
                View tagContainer4 = LIZ(R.id.kzn);
                o.LJIIIIZZ(tagContainer4, "tagContainer");
                OUP.LJIJJLI(tagContainer4);
                View icNotice4 = LIZ(R.id.e8x);
                o.LJIIIIZZ(icNotice4, "icNotice");
                OUP.LJIJJLI(icNotice4);
            }
            if (LJIIJ()) {
                if (o.LJ(PaymentCacheHelper.LJFF().code, "US") && !C27503Aqp.LIZ().osp) {
                    View radio = LIZ(R.id.iln);
                    o.LJIIIIZZ(radio, "radio");
                    KL2.LJIILLIIL(4, radio);
                } else {
                    View radio2 = LIZ(R.id.iln);
                    o.LJIIIIZZ(radio2, "radio");
                    OUP.LJJLIIIJ(radio2);
                }
                View tvBind = LIZ(R.id.lvl);
                o.LJIIIIZZ(tvBind, "tvBind");
                OUP.LJIJJLI(tvBind);
                View arrow = LIZ(R.id.a7n);
                o.LJIIIIZZ(arrow, "arrow");
                OUP.LJIJJLI(arrow);
                SAN san = SAN.LIZ;
                PaymentMethod paymentMethod7 = this.LJLLL;
                if (paymentMethod7 != null) {
                    str5 = paymentMethod7.id;
                } else {
                    str5 = null;
                }
                san.getClass();
                if (SAN.LJ(str5) && (paymentMethod2 = this.LJLLL) != null && paymentMethod2.LIZIZ) {
                    View iconEditSEA = LIZ(R.id.ea6);
                    o.LJIIIIZZ(iconEditSEA, "iconEditSEA");
                    OUP.LJJLIIIJ(iconEditSEA);
                    PaymentMethod paymentMethod8 = this.LJLLL;
                    if (paymentMethod8 != null) {
                        C27949Ay1.LJIIJJI(paymentMethod8, "tiktokec_button_show");
                    }
                    C16880lQ.LJJJ((TuxIconView) LIZ(R.id.ea6), new ACListenerS24S0100000_4(this, 293));
                } else {
                    View iconEditSEA2 = LIZ(R.id.ea6);
                    o.LJIIIIZZ(iconEditSEA2, "iconEditSEA");
                    OUP.LJIJJLI(iconEditSEA2);
                }
            } else {
                View radio3 = LIZ(R.id.iln);
                o.LJIIIIZZ(radio3, "radio");
                OUP.LJIJJLI(radio3);
                View arrow2 = LIZ(R.id.a7n);
                o.LJIIIIZZ(arrow2, "arrow");
                OUP.LJJLIIIJ(arrow2);
                BindInfo bindInfo = paymentMethod3.bindInfo;
                if (bindInfo != null && (str2 = bindInfo.buttonText) != null && C78685UuP.LJJJZ(str2)) {
                    View tvBind2 = LIZ(R.id.lvl);
                    o.LJIIIIZZ(tvBind2, "tvBind");
                    OUP.LJJLIIIJ(tvBind2);
                    ((TextView) LIZ(R.id.lvl)).setText(str2);
                    View tvBind3 = LIZ(R.id.lvl);
                    o.LJIIIIZZ(tvBind3, "tvBind");
                    C16880lQ.LJIIJ(new Au2S14S0200000_4(this, paymentMethod3, 48), tvBind3);
                    ArrayList arrayList = (ArrayList) C27949Ay1.LJIILIIL;
                    if (!arrayList.contains(paymentMethod3.LJFF())) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.putAll(C27949Ay1.LIZIZ);
                        linkedHashMap.put("button_name", "active_now");
                        linkedHashMap.put("payment_option", paymentMethod3.LJIIL());
                        BindInfo bindInfo2 = paymentMethod3.bindInfo;
                        if (bindInfo2 != null && (str3 = bindInfo2.bindStatus) != null && str3.length() > 0) {
                            linkedHashMap.put("pay_bind_status", str3);
                        }
                        linkedHashMap.put("is_option_discounted", Integer.valueOf(C78857UxB.LJJJIL(paymentMethod3.extraInfo) ? 1 : 0));
                        linkedHashMap.put("is_payment_promoted", Integer.valueOf(C78857UxB.LJJJIL(paymentMethod3.LJIIIIZZ()) ? 1 : 0));
                        C76542zS.LIZ("tiktokec_button_show", linkedHashMap);
                        arrayList.add(paymentMethod3.LJFF());
                    }
                }
            }
            BindInfo bindInfo3 = paymentMethod3.bindInfo;
            if (bindInfo3 != null && (str4 = bindInfo3.note) != null && C78685UuP.LJJJZ(str4)) {
                View tvBindNote = LIZ(R.id.lvm);
                o.LJIIIIZZ(tvBindNote, "tvBindNote");
                OUP.LJJLIIIJ(tvBindNote);
                ((TextView) LIZ(R.id.lvm)).setText(str4);
            }
            LIZLLL();
            LJI();
            LJFF();
            LJ();
            LJII();
            View superElement = LIZ(R.id.kty);
            o.LJIIIIZZ(superElement, "superElement");
            OUP.LJIJJLI(superElement);
            Context context2 = getContext();
            if ((context2 instanceof C29S) && (c1au = (C1AU) context2) != null) {
                new KeyBoardVisibilityUtil(c1au, 32, new AqS186S0100000_4(this, 323));
            }
        }
        View tvCcdcCardTip = LIZ(R.id.lvq);
        o.LJIIIIZZ(tvCcdcCardTip, "tvCcdcCardTip");
        PaymentMethod paymentMethod9 = this.LJLLL;
        if (paymentMethod9 != null) {
            str8 = paymentMethod9.ccdcCardTip;
        }
        if (!C78685UuP.LJJJZ(str8)) {
            i = 8;
        }
        tvCcdcCardTip.setVisibility(i);
        PaymentMethod paymentMethod10 = this.LJLLL;
        if (paymentMethod10 != null && (str = paymentMethod10.ccdcCardTip) != null) {
            ((TextView) LIZ(R.id.lvq)).setText(str);
        }
        LJIILJJIL();
        LJIILL();
        View layoutPaymentArea = LIZ(R.id.fg_);
        o.LJIIIIZZ(layoutPaymentArea, "layoutPaymentArea");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 106, 42), layoutPaymentArea);
    }

    public final void setPipoBnplTenureFromPdp(String str) {
        this.LJLLLL = str;
    }

    public final B1W LJIIIIZZ(PaymentMethod paymentMethod, int i) {
        String str;
        String str2;
        Availability availability;
        PaymentMethodInfo paymentMethodInfo;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        B1W b1w = new B1W(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.leftMargin = C79081V1x.LJII(40);
        marginLayoutParams.setMarginStart(C79081V1x.LJII(32));
        marginLayoutParams.topMargin = C79081V1x.LJII(8);
        marginLayoutParams.bottomMargin = C79081V1x.LJII(8);
        b1w.setLayoutParams(marginLayoutParams);
        C34K c34k = new C34K();
        String str3 = paymentMethod.id;
        PaymentInfo paymentInfo = this.LJLLILLLL;
        String str4 = null;
        if (paymentInfo != null && (paymentMethodInfo = paymentInfo.paymentMethodInfo) != null) {
            str = paymentMethodInfo.getId();
        } else {
            str = null;
        }
        if (o.LJ(str3, str)) {
            c34k.element = true;
        }
        PaymentMethod paymentMethod2 = this.LJLLL;
        if (paymentMethod2 != null) {
            str2 = paymentMethod2.LJIIL();
        } else {
            str2 = null;
        }
        String LJIIL = paymentMethod.LJIIL();
        b1w.LJLIL = paymentMethod;
        String str5 = paymentMethod.iconUrl;
        if (str5 != null) {
            Context context2 = b1w.getContext();
            o.LJIIIIZZ(context2, "context");
            Drawable LJIIIIZZ = C79045V0n.LJIIIIZZ(R.attr.cv, context2);
            W5F LJIIIIZZ2 = W5U.LJIIIIZZ(str5);
            LJIIIIZZ2.LJIILIIL = LJIIIIZZ;
            LJIIIIZZ2.LJJIIJZLJL = (ImageView) b1w.LIZ(R.id.ex2);
            C16880lQ.LLJJJ(LJIIIIZZ2);
        }
        ((TextView) b1w.LIZ(R.id.ly0)).setText(paymentMethod.displayName);
        b1w.LIZJ();
        b1w.LIZIZ();
        b1w.setEnabled(true);
        b1w.LIZ(R.id.ex2).setAlpha(1.0f);
        ((TuxTextView) b1w.LIZ(R.id.ly0)).setTextColorRes(R.attr.go);
        ((TuxTextView) b1w.LIZ(R.id.lwg)).setTextColorRes(R.attr.eb);
        ((TuxTextView) b1w.LIZ(R.id.lwf)).setTextColorRes(R.attr.eb);
        Availability availability2 = paymentMethod.availability;
        if (availability2 != null && o.LJ(availability2.isAvailable, Boolean.FALSE)) {
            ((TuxTextView) b1w.LIZ(R.id.ly0)).setTextColorRes(R.attr.gp);
            ((TuxTextView) b1w.LIZ(R.id.lwg)).setTextColorRes(R.attr.gp);
            ((TuxTextView) b1w.LIZ(R.id.lwf)).setTextColorRes(R.attr.gp);
            b1w.LIZ(R.id.ex2).setAlpha(0.3f);
            b1w.setEnabled(false);
        }
        String str6 = str2;
        C16880lQ.LJIIJ(new B1Y(b1w, this, paymentMethod, str6, LJIIL, i, c34k), b1w);
        if (str6 == null) {
            str6 = "";
        }
        boolean LJJJZ = C78685UuP.LJJJZ(paymentMethod.extraInfo);
        PaymentMethod paymentMethod3 = this.LJLLL;
        if (paymentMethod3 != null && (availability = paymentMethod3.availability) != null) {
            str4 = availability.statusCode;
        }
        C27949Ay1.LJJJ(str6, LJIIL, i, LJJJZ, str4, Boolean.valueOf(c34k.element), null, null, null, null);
        return b1w;
    }
}
