package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.utils.Au2S0S2501000_4;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class B1U extends FrameLayout implements B1Z {
    public InterfaceC88472Yns<? super List<PaymentElement>, C76800UCe> LJLIL;
    public PaymentMethod LJLILLLLZI;
    public ElementDTO LJLJI;
    public InterfaceC88472Yns<? super InstallmentPlan, C76800UCe> LJLJJI;
    public InstallmentPlan LJLJJL;
    public B1K LJLJJLL;
    public final java.util.Map<Integer, View> LJLJL = new LinkedHashMap();

    public final View LIZIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJL;
        Integer valueOf = Integer.valueOf(R.id.g0w);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.g0w);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // X.B1Z
    public ElementDTO getElementDTO() {
        return this.LJLJI;
    }

    public final InterfaceC88472Yns<InstallmentPlan, C76800UCe> getOnInstallmentPlanCheckChanged() {
        return this.LJLJJI;
    }

    public InterfaceC88472Yns<List<PaymentElement>, C76800UCe> getOnValueChange() {
        return this.LJLIL;
    }

    public final B1K getPaymentLogger() {
        return this.LJLJJLL;
    }

    public PaymentMethod getPaymentMethod() {
        return this.LJLILLLLZI;
    }

    public final InstallmentPlan getSelectedInstallmentPlan() {
        return this.LJLJJL;
    }

    @Override // X.B1Z
    public List<PaymentElement> getValue() {
        return C61878OQg.INSTANCE;
    }

    public B1U(Context context) {
        super(context, null, 0);
        this.LJLIL = B2N.LJLIL;
        this.LJLJJI = B2X.LJLIL;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        setLayoutParams(layoutParams);
        OUP.LJIL(R.layout.a1o, this, true);
    }

    public void setElementDTO(ElementDTO elementDTO) {
        this.LJLJI = elementDTO;
    }

    public final void setOnInstallmentPlanCheckChanged(InterfaceC88472Yns<? super InstallmentPlan, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLJJI = interfaceC88472Yns;
    }

    @Override // X.B1Z
    public void setOnValueChange(InterfaceC88472Yns<? super List<PaymentElement>, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLIL = interfaceC88472Yns;
    }

    public final void setPaymentLogger(B1K b1k) {
        this.LJLJJLL = b1k;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.LJLILLLLZI = paymentMethod;
    }

    public final void setSelectedInstallmentPlan(InstallmentPlan installmentPlan) {
        this.LJLJJL = installmentPlan;
    }

    @Override // X.B1Z
    public final void LIZ(ElementDTO elementDTO, PaymentMethod paymentMethod, List<PaymentElement> list, Object obj) {
        InstallmentInfo installmentInfo;
        List<InstallmentPlan> list2;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Amount amount;
        Availability availability;
        o.LJIIIZ(elementDTO, "elementDTO");
        o.LJIIIZ(paymentMethod, "paymentMethod");
        setPaymentMethod(paymentMethod);
        setElementDTO(elementDTO);
        PaymentMethod paymentMethod2 = getPaymentMethod();
        if (paymentMethod2 != null) {
            installmentInfo = paymentMethod2.installmentInfo;
        } else {
            installmentInfo = null;
        }
        if (installmentInfo != null) {
            list2 = installmentInfo.installmentPlans;
        } else {
            list2 = null;
        }
        boolean z2 = true;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View llInstallmentPlanContainer = LIZIZ(R.id.g0w);
            o.LJIIIIZZ(llInstallmentPlanContainer, "llInstallmentPlanContainer");
            OUP.LJIJJLI(llInstallmentPlanContainer);
            return;
        }
        View llInstallmentPlanContainer2 = LIZIZ(R.id.g0w);
        o.LJIIIIZZ(llInstallmentPlanContainer2, "llInstallmentPlanContainer");
        OUP.LJJLIIIJ(llInstallmentPlanContainer2);
        ((ViewGroup) LIZIZ(R.id.g0w)).removeAllViews();
        if (this.LJLJJL == null) {
            this.LJLJJL = (InstallmentPlan) ListProtector.get(list2, 0);
        }
        int i = 0;
        for (InstallmentPlan installmentPlan : list2) {
            int i2 = i + 1;
            if (i >= 0) {
                InstallmentPlan installmentPlan2 = installmentPlan;
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                C70360RjQ c70360RjQ = new C70360RjQ(context);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams.leftMargin = C79081V1x.LJII(44);
                marginLayoutParams.topMargin = C79081V1x.LJII(8);
                marginLayoutParams.setMarginStart(C79081V1x.LJII(44));
                c70360RjQ.setLayoutParams(marginLayoutParams);
                c70360RjQ.LIZIZ(installmentPlan2);
                C34K c34k = new C34K();
                String str7 = installmentPlan2.tenure;
                InstallmentPlan installmentPlan3 = this.LJLJJL;
                if (installmentPlan3 != null) {
                    str = installmentPlan3.tenure;
                } else {
                    str = null;
                }
                if (o.LJ(str7, str)) {
                    c34k.element = z2;
                }
                PaymentMethod paymentMethod3 = getPaymentMethod();
                if (paymentMethod3 != null) {
                    str2 = paymentMethod3.LJIIL();
                } else {
                    str2 = null;
                }
                String LJFF = i0.LJFF(str2, "_installment");
                C16880lQ.LJIIJ(new Au2S0S2501000_4(c70360RjQ, this, installmentPlan2, str2, LJFF, i, c34k, installmentInfo, 0), c70360RjQ);
                String str8 = installmentPlan2.tenure;
                InstallmentPlan installmentPlan4 = this.LJLJJL;
                if (installmentPlan4 != null) {
                    str3 = installmentPlan4.tenure;
                } else {
                    str3 = null;
                }
                if (o.LJ(str8, str3)) {
                    c70360RjQ.performClick();
                }
                B1K b1k = this.LJLJJLL;
                if (b1k != null) {
                    if (str2 == null) {
                        str2 = "";
                    }
                    PaymentMethod paymentMethod4 = getPaymentMethod();
                    if (paymentMethod4 != null) {
                        str4 = paymentMethod4.extraInfo;
                    } else {
                        str4 = null;
                    }
                    boolean LJJJZ = C78685UuP.LJJJZ(str4);
                    PaymentMethod paymentMethod5 = getPaymentMethod();
                    if (paymentMethod5 != null && (availability = paymentMethod5.availability) != null) {
                        str5 = availability.statusCode;
                    } else {
                        str5 = null;
                    }
                    Boolean valueOf = Boolean.valueOf(c34k.element);
                    if (installmentInfo != null && (amount = installmentInfo.orderAmount) != null) {
                        str6 = amount.priceStr;
                    } else {
                        str6 = null;
                    }
                    b1k.LJIIZILJ(str2, LJFF, i, LJJJZ, str5, valueOf, installmentPlan2, str6);
                }
                ViewGroup viewGroup = (ViewGroup) LIZIZ(R.id.g0w);
                if (viewGroup != null) {
                    viewGroup.addView(c70360RjQ);
                }
                i = i2;
                z2 = true;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }
}
