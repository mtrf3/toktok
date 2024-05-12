package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.AnonymousClass391;
import X.C27919AxX;
import X.C61878OQg;
import X.InterfaceC61312at;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.BillingFragmentEnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaymentState implements InterfaceC61312at {
    public final PaymentMethod checkedPaymentMethod;
    public final BillingFragmentEnterParams editBillingAddress;
    public final boolean emailHintVisible;
    public final PaymentInfo paymentInfo;
    public final C27919AxX<PaymentInfo> paymentInfoForNextStep;
    public final PaymentInfo paymentInfoForThreeStepCache;
    public final List<Object> paymentList;
    public final Object resendPayAction;
    public final Object scrollUpAction;
    public final boolean showLoading;
    public final String systemError;
    public final C27919AxX<String> toast;

    public PaymentState() {
        this(null, null, null, null, false, null, null, false, null, null, null, null, 4095, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentState copy$default(PaymentState paymentState, PaymentMethod paymentMethod, List list, PaymentInfo paymentInfo, String str, boolean z, PaymentInfo paymentInfo2, C27919AxX c27919AxX, boolean z2, Object obj, Object obj2, C27919AxX c27919AxX2, BillingFragmentEnterParams billingFragmentEnterParams, int i, Object obj3) {
        if ((i & 1) != 0) {
            paymentMethod = paymentState.checkedPaymentMethod;
        }
        if ((i & 2) != 0) {
            list = paymentState.paymentList;
        }
        if ((i & 4) != 0) {
            paymentInfo = paymentState.paymentInfo;
        }
        if ((i & 8) != 0) {
            str = paymentState.systemError;
        }
        if ((i & 16) != 0) {
            z = paymentState.emailHintVisible;
        }
        if ((i & 32) != 0) {
            paymentInfo2 = paymentState.paymentInfoForThreeStepCache;
        }
        if ((i & 64) != 0) {
            c27919AxX = paymentState.paymentInfoForNextStep;
        }
        if ((i & 128) != 0) {
            z2 = paymentState.showLoading;
        }
        if ((i & 256) != 0) {
            obj = paymentState.resendPayAction;
        }
        if ((i & 512) != 0) {
            obj2 = paymentState.scrollUpAction;
        }
        if ((i & 1024) != 0) {
            c27919AxX2 = paymentState.toast;
        }
        if ((i & 2048) != 0) {
            billingFragmentEnterParams = paymentState.editBillingAddress;
        }
        return paymentState.copy(paymentMethod, list, paymentInfo, str, z, paymentInfo2, c27919AxX, z2, obj, obj2, c27919AxX2, billingFragmentEnterParams);
    }

    public final PaymentState copy(PaymentMethod paymentMethod, List<? extends Object> paymentList, PaymentInfo paymentInfo, String str, boolean z, PaymentInfo paymentInfo2, C27919AxX<PaymentInfo> c27919AxX, boolean z2, Object obj, Object obj2, C27919AxX<String> c27919AxX2, BillingFragmentEnterParams billingFragmentEnterParams) {
        o.LJIIIZ(paymentList, "paymentList");
        return new PaymentState(paymentMethod, paymentList, paymentInfo, str, z, paymentInfo2, c27919AxX, z2, obj, obj2, c27919AxX2, billingFragmentEnterParams);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentState)) {
            return false;
        }
        PaymentState paymentState = (PaymentState) obj;
        return o.LJ(this.checkedPaymentMethod, paymentState.checkedPaymentMethod) && o.LJ(this.paymentList, paymentState.paymentList) && o.LJ(this.paymentInfo, paymentState.paymentInfo) && o.LJ(this.systemError, paymentState.systemError) && this.emailHintVisible == paymentState.emailHintVisible && o.LJ(this.paymentInfoForThreeStepCache, paymentState.paymentInfoForThreeStepCache) && o.LJ(this.paymentInfoForNextStep, paymentState.paymentInfoForNextStep) && this.showLoading == paymentState.showLoading && o.LJ(this.resendPayAction, paymentState.resendPayAction) && o.LJ(this.scrollUpAction, paymentState.scrollUpAction) && o.LJ(this.toast, paymentState.toast) && o.LJ(this.editBillingAddress, paymentState.editBillingAddress);
    }

    public String toString() {
        return "PaymentState(checkedPaymentMethod=" + this.checkedPaymentMethod + ", paymentList=" + this.paymentList + ", paymentInfo=" + this.paymentInfo + ", systemError=" + this.systemError + ", emailHintVisible=" + this.emailHintVisible + ", paymentInfoForThreeStepCache=" + this.paymentInfoForThreeStepCache + ", paymentInfoForNextStep=" + this.paymentInfoForNextStep + ", showLoading=" + this.showLoading + ", resendPayAction=" + this.resendPayAction + ", scrollUpAction=" + this.scrollUpAction + ", toast=" + this.toast + ", editBillingAddress=" + this.editBillingAddress + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        PaymentMethod paymentMethod = this.checkedPaymentMethod;
        int i = 0;
        if (paymentMethod == null) {
            hashCode = 0;
        } else {
            hashCode = paymentMethod.hashCode();
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.paymentList, hashCode * 31, 31);
        PaymentInfo paymentInfo = this.paymentInfo;
        if (paymentInfo == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = paymentInfo.hashCode();
        }
        int i2 = (LIZIZ + hashCode2) * 31;
        String str = this.systemError;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        boolean z = this.emailHintVisible;
        int i4 = 1;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int i6 = (i3 + i5) * 31;
        PaymentInfo paymentInfo2 = this.paymentInfoForThreeStepCache;
        if (paymentInfo2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = paymentInfo2.hashCode();
        }
        int i7 = (i6 + hashCode4) * 31;
        C27919AxX<PaymentInfo> c27919AxX = this.paymentInfoForNextStep;
        if (c27919AxX == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c27919AxX.hashCode();
        }
        int i8 = (i7 + hashCode5) * 31;
        if (!this.showLoading) {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        Object obj = this.resendPayAction;
        if (obj == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = obj.hashCode();
        }
        int i10 = (i9 + hashCode6) * 31;
        Object obj2 = this.scrollUpAction;
        if (obj2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = obj2.hashCode();
        }
        int i11 = (i10 + hashCode7) * 31;
        C27919AxX<String> c27919AxX2 = this.toast;
        if (c27919AxX2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = c27919AxX2.hashCode();
        }
        int i12 = (i11 + hashCode8) * 31;
        BillingFragmentEnterParams billingFragmentEnterParams = this.editBillingAddress;
        if (billingFragmentEnterParams != null) {
            i = billingFragmentEnterParams.hashCode();
        }
        return i12 + i;
    }

    public final PaymentMethod getCheckedPaymentMethod() {
        return this.checkedPaymentMethod;
    }

    public final BillingFragmentEnterParams getEditBillingAddress() {
        return this.editBillingAddress;
    }

    public final boolean getEmailHintVisible() {
        return this.emailHintVisible;
    }

    public final PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    public final C27919AxX<PaymentInfo> getPaymentInfoForNextStep() {
        return this.paymentInfoForNextStep;
    }

    public final PaymentInfo getPaymentInfoForThreeStepCache() {
        return this.paymentInfoForThreeStepCache;
    }

    public final List<Object> getPaymentList() {
        return this.paymentList;
    }

    public final Object getResendPayAction() {
        return this.resendPayAction;
    }

    public final Object getScrollUpAction() {
        return this.scrollUpAction;
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public final String getSystemError() {
        return this.systemError;
    }

    public final C27919AxX<String> getToast() {
        return this.toast;
    }

    public PaymentState(PaymentMethod paymentMethod, List<? extends Object> paymentList, PaymentInfo paymentInfo, String str, boolean z, PaymentInfo paymentInfo2, C27919AxX<PaymentInfo> c27919AxX, boolean z2, Object obj, Object obj2, C27919AxX<String> c27919AxX2, BillingFragmentEnterParams billingFragmentEnterParams) {
        o.LJIIIZ(paymentList, "paymentList");
        this.checkedPaymentMethod = paymentMethod;
        this.paymentList = paymentList;
        this.paymentInfo = paymentInfo;
        this.systemError = str;
        this.emailHintVisible = z;
        this.paymentInfoForThreeStepCache = paymentInfo2;
        this.paymentInfoForNextStep = c27919AxX;
        this.showLoading = z2;
        this.resendPayAction = obj;
        this.scrollUpAction = obj2;
        this.toast = c27919AxX2;
        this.editBillingAddress = billingFragmentEnterParams;
    }

    public PaymentState(PaymentMethod paymentMethod, List list, PaymentInfo paymentInfo, String str, boolean z, PaymentInfo paymentInfo2, C27919AxX c27919AxX, boolean z2, Object obj, Object obj2, C27919AxX c27919AxX2, BillingFragmentEnterParams billingFragmentEnterParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : paymentMethod, (i & 2) != 0 ? C61878OQg.INSTANCE : list, (i & 4) != 0 ? null : paymentInfo, (i & 8) != 0 ? null : str, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : paymentInfo2, (i & 64) != 0 ? null : c27919AxX, (i & 128) == 0 ? z2 : false, (i & 256) != 0 ? null : obj, (i & 512) != 0 ? null : obj2, (i & 1024) != 0 ? null : c27919AxX2, (i & 2048) == 0 ? billingFragmentEnterParams : null);
    }
}
