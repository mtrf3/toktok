package com.ss.android.ugc.aweme.utils;

import X.B1K;
import X.B1R;
import X.B1U;
import X.C27949Ay1;
import X.C34K;
import X.C70360RjQ;
import X.C78685UuP;
import X.TAT;
import Y.IDObjectS328S0100000_4;
import Y.IDObjectS3S0101000_4;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class Au2S0S2501000_4 extends TAT {
    public final int $t;
    public int i7;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public String s0;
    public String s1;

    @Override // X.TAT
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(Au2S0S2501000_4 au2S0S2501000_4, View view) {
        String str;
        String str2;
        Amount amount;
        Availability availability;
        if (view == null || ((C70360RjQ) au2S0S2501000_4.l2).LIZJ()) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) ((B1U) au2S0S2501000_4.l3).LIZIZ(R.id.g0w);
        String str3 = null;
        if (viewGroup != null) {
            IDObjectS328S0100000_4 iDObjectS328S0100000_4 = new IDObjectS328S0100000_4(viewGroup, 0);
            ArrayList arrayList = new ArrayList();
            Iterator it = iDObjectS328S0100000_4.iterator();
            while (true) {
                IDObjectS3S0101000_4 iDObjectS3S0101000_4 = (IDObjectS3S0101000_4) it;
                if (!iDObjectS3S0101000_4.hasNext()) {
                    break;
                }
                View view2 = (View) iDObjectS3S0101000_4.next();
                if ((view2 instanceof C70360RjQ) && view2 != null) {
                    arrayList.add(view2);
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
        ((C70360RjQ) au2S0S2501000_4.l2).setChecked$ecommerce_transaction_release(true);
        ((B1U) au2S0S2501000_4.l3).getOnInstallmentPlanCheckChanged().invoke((InstallmentPlan) au2S0S2501000_4.l4);
        B1K paymentLogger = ((B1U) au2S0S2501000_4.l3).getPaymentLogger();
        if (paymentLogger == null) {
            return;
        }
        String str4 = au2S0S2501000_4.s0;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = au2S0S2501000_4.s1;
        int i = au2S0S2501000_4.i7;
        PaymentMethod paymentMethod = ((B1U) au2S0S2501000_4.l3).getPaymentMethod();
        if (paymentMethod != null) {
            str = paymentMethod.extraInfo;
        } else {
            str = null;
        }
        boolean LJJJZ = C78685UuP.LJJJZ(str);
        PaymentMethod paymentMethod2 = ((B1U) au2S0S2501000_4.l3).getPaymentMethod();
        if (paymentMethod2 != null && (availability = paymentMethod2.availability) != null) {
            str2 = availability.statusCode;
        } else {
            str2 = null;
        }
        Boolean valueOf = Boolean.valueOf(((C34K) au2S0S2501000_4.l5).element);
        InstallmentPlan installmentPlan = (InstallmentPlan) au2S0S2501000_4.l4;
        InstallmentInfo installmentInfo = (InstallmentInfo) au2S0S2501000_4.l6;
        if (installmentInfo != null && (amount = installmentInfo.orderAmount) != null) {
            str3 = amount.priceStr;
        }
        paymentLogger.LJIILLIIL(str4, str5, i, LJJJZ, str2, valueOf, installmentPlan, str3);
    }

    public static final void LIZ$1(Au2S0S2501000_4 au2S0S2501000_4, View view) {
        String str;
        String str2;
        String str3;
        Availability availability;
        if (view == null || ((C70360RjQ) au2S0S2501000_4.l2).LIZJ()) {
            return;
        }
        ((B1R) au2S0S2501000_4.l3).LIZIZ();
        ((C70360RjQ) au2S0S2501000_4.l2).setChecked$ecommerce_transaction_release(true);
        ((B1R) au2S0S2501000_4.l3).getOnInstallmentPlanClickListener().invoke((InstallmentPlan) au2S0S2501000_4.l4);
        String str4 = au2S0S2501000_4.s0;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = au2S0S2501000_4.s1;
        int i = au2S0S2501000_4.i7;
        PaymentMethod paymentMethod = ((B1R) au2S0S2501000_4.l3).getPaymentMethod();
        String str6 = null;
        if (paymentMethod != null) {
            str = paymentMethod.extraInfo;
        } else {
            str = null;
        }
        boolean LJJJZ = C78685UuP.LJJJZ(str);
        PaymentMethod paymentMethod2 = ((B1R) au2S0S2501000_4.l3).getPaymentMethod();
        if (paymentMethod2 != null && (availability = paymentMethod2.availability) != null) {
            str2 = availability.statusCode;
        } else {
            str2 = null;
        }
        Boolean valueOf = Boolean.valueOf(((C34K) au2S0S2501000_4.l5).element);
        InstallmentPlan installmentPlan = (InstallmentPlan) au2S0S2501000_4.l4;
        Amount amount = ((InstallmentInfo) au2S0S2501000_4.l6).orderAmount;
        if (amount != null) {
            str3 = amount.amount;
            str6 = amount.currency;
        } else {
            str3 = null;
        }
        C27949Ay1.LJJIZ(str4, str5, i, LJJJZ, str2, valueOf, installmentPlan, str3, str6, 2048);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S0S2501000_4(Object obj, Object obj2, Object obj3, String str, String str2, int i, Object obj4, Object obj5, int i2) {
        super(700L);
        this.$t = i2;
        this.l2 = obj;
        this.l3 = obj2;
        this.l4 = obj3;
        this.s0 = str;
        this.s1 = str2;
        this.i7 = i;
        this.l5 = obj4;
        this.l6 = obj5;
    }
}
