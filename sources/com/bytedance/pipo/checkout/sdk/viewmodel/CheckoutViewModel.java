package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.C32I;
import X.C76800UCe;
import X.C78613UtF;
import X.C78966Uyw;
import X.C91952a2u;
import X.C91960a32;
import X.C92083a51;
import X.C92106a5O;
import X.C92108a5Q;
import X.C92230a7O;
import X.C92231a7P;
import X.C92233a7R;
import X.C92283a8F;
import X.C92324a8u;
import X.C92325a8v;
import X.C92326a8w;
import X.C92328a8y;
import X.C92329a8z;
import X.EnumC58928NAu;
import X.EnumC92050a4U;
import X.EnumC92109a5R;
import X.InterfaceC35811ar;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.InterfaceC88472Yns;
import X.InterfaceC91773a01;
import X.InterfaceC91961a33;
import X.XKX;
import android.app.Activity;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.pipo.checkout.api.network.model.request.PaymentElements;
import com.bytedance.pipo.checkout.api.network.model.request.PaymentMethod;
import com.bytedance.pipo.checkout.api.network.model.response.StoredMethods;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutAction;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class CheckoutViewModel extends BaseViewModel {
    public static final int $stable = 8;
    public final MutableLiveData<C92108a5Q> _payResult;
    public boolean _payResultPosted;
    public Timer _paymentDetailPollingTimer;
    public C92283a8F eventSender;
    public boolean isBankTransferOrStoreSuccess;
    public boolean isInPayProgress;
    public String redirectUrl;
    public String reference;
    public InterfaceC65784Pro<C76800UCe> retryFunc;
    public final InterfaceC35811ar uiState$delegate;

    public final void cancelPolling() {
        try {
            this._paymentDetailPollingTimer.cancel();
        } catch (Throwable unused) {
        }
    }

    public final CheckoutUiState getUiState() {
        return (CheckoutUiState) this.uiState$delegate.getValue();
    }

    public final void retry() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.retryFunc;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        this.retryFunc = null;
    }

    public final String formattedAmount() {
        return formatAmount(getOrderInfo().LJLJJI);
    }

    @Override // com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel
    public void initMethod() {
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new CheckoutViewModel$initMethod$1(this, null), 3);
    }

    @Override // com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        try {
            this._paymentDetailPollingTimer.cancel();
        } catch (Throwable unused) {
        }
    }

    public final C92283a8F getEventSender() {
        return this.eventSender;
    }

    public final LiveData<C92108a5Q> getPayResult() {
        return this._payResult;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final void changeCheckoutVisibility(boolean z) {
        setUiState(CheckoutUiState.copy$default(getUiState(), false, false, z, null, 0, 0, 0, false, false, null, null, null, null, null, null, null, null, null, 262139, null));
    }

    public final void dispatch(CheckoutAction action) {
        CheckoutUiState copy$default;
        o.LJIIIZ(action, "action");
        if (action instanceof CheckoutAction.StorePaymentMethod) {
            CheckoutAction.StorePaymentMethod storePaymentMethod = (CheckoutAction.StorePaymentMethod) action;
            storePaymentMethod(storePaymentMethod.getPaymentMethod(), storePaymentMethod.getNavigate(), storePaymentMethod.getView(), storePaymentMethod.getDialog());
            return;
        }
        if (action instanceof CheckoutAction.StoredMethodConfirm) {
            CheckoutAction.StoredMethodConfirm storedMethodConfirm = (CheckoutAction.StoredMethodConfirm) action;
            processCCVConfirm(storedMethodConfirm.getPaymentElements(), storedMethodConfirm.getNavigate(), storedMethodConfirm.getView(), storedMethodConfirm.getDialog());
            return;
        }
        if (action instanceof CheckoutAction.MethodConfirm) {
            CheckoutAction.MethodConfirm methodConfirm = (CheckoutAction.MethodConfirm) action;
            processCCDCConfirm(methodConfirm.getMethodInfo(), methodConfirm.getStorePayment(), methodConfirm.getNavigate(), methodConfirm.getView(), methodConfirm.getDialog());
            return;
        }
        if (action instanceof CheckoutAction.ClosePage) {
            CheckoutAction.ClosePage closePage = (CheckoutAction.ClosePage) action;
            closeCheckout(closePage.getContext(), closePage.isCancel());
            return;
        }
        if (action instanceof CheckoutAction.ImeHeightInit) {
            setUiState(CheckoutUiState.copy$default(getUiState(), false, false, false, null, 0, 0, ((CheckoutAction.ImeHeightInit) action).getImeHeight(), false, false, null, null, null, null, null, null, null, null, null, 262079, null));
            return;
        }
        if (action instanceof CheckoutAction.ImeHandle) {
            CheckoutAction.ImeHandle imeHandle = (CheckoutAction.ImeHandle) action;
            if (imeHandle.getNewImeHeight() != 0) {
                if (getUiState().getImeHeight() != imeHandle.getNewImeHeight()) {
                    setUiState(CheckoutUiState.copy$default(getUiState(), false, false, false, null, 0, 0, imeHandle.getNewImeHeight(), true, false, null, null, null, null, null, null, null, null, null, 261951, null));
                    imeHandle.getSpEditor().putInt("imeHeight", imeHandle.getNewImeHeight());
                    imeHandle.getSpEditor().commit();
                    return;
                }
                setUiState(CheckoutUiState.copy$default(getUiState(), false, false, false, null, 0, 0, 0, true, false, null, null, null, null, null, null, null, null, null, 262015, null));
                return;
            }
            setUiState(CheckoutUiState.copy$default(getUiState(), false, false, false, null, 0, 0, 0, false, false, null, null, null, null, null, null, null, null, null, 262015, null));
            return;
        }
        if (action instanceof CheckoutAction.SystemBarHeightInit) {
            CheckoutAction.SystemBarHeightInit systemBarHeightInit = (CheckoutAction.SystemBarHeightInit) action;
            setUiState(CheckoutUiState.copy$default(getUiState(), false, false, false, null, systemBarHeightInit.getTop(), systemBarHeightInit.getBottom(), 0, false, false, null, null, null, null, null, null, null, null, null, 262095, null));
            C91952a2u.LIZ = systemBarHeightInit.getBottom();
            C91952a2u.LIZIZ = systemBarHeightInit.getTop();
            return;
        }
        if (action instanceof CheckoutAction.RetryCheckout) {
            setUiState(CheckoutUiState.copy$default(getUiState(), true, false, false, null, 0, 0, 0, false, false, null, null, null, null, null, null, null, null, null, 262142, null));
            updatePayResult(new C92108a5Q(EnumC92109a5R.UNKNOWN, ""));
            initMethod();
            return;
        }
        if (action instanceof CheckoutAction.SelectPI) {
            CheckoutAction.SelectPI selectPI = (CheckoutAction.SelectPI) action;
            if (selectPI.getSelectedMethod() instanceof C92230a7O) {
                try {
                    CheckoutUiState uiState = getUiState();
                    List<InterfaceC91961a33> list = ((C92230a7O) ((CheckoutAction.SelectPI) action).getSelectedMethod()).LJLIL;
                    ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                    Iterator<InterfaceC91961a33> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((C92231a7P) it.next()).LJLIL);
                    }
                    copy$default = CheckoutUiState.copy$default(uiState, false, false, false, null, 0, 0, 0, false, false, null, null, null, arrayList, ((CheckoutAction.SelectPI) action).getAssemblePITitle(), ((CheckoutAction.SelectPI) action).getAssemblePIIcon(), null, null, null, 233471, null);
                } catch (Throwable unused) {
                    CheckoutUiState uiState2 = getUiState();
                    List emptyList = Collections.emptyList();
                    o.LJIIIIZZ(emptyList, "emptyList()");
                    copy$default = CheckoutUiState.copy$default(uiState2, false, false, false, null, 0, 0, 0, false, false, null, null, null, emptyList, null, null, null, null, null, 258047, null);
                }
            } else {
                copy$default = CheckoutUiState.copy$default(getUiState(), false, false, false, null, 0, 0, 0, false, false, null, null, selectPI.getSelectedMethod(), null, null, null, null, null, null, 260095, null);
            }
            setUiState(copy$default);
            return;
        }
        if (!(action instanceof CheckoutAction.ChangeVisibility)) {
            return;
        }
        changeCheckoutVisibility(((CheckoutAction.ChangeVisibility) action).getVisibility());
    }

    public final String formatAmount(String str) {
        return C91960a32.LIZ(str, new Locale(getLanguage(), getOrderInfo().LJLJJL));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[PHI: r3
      0x0027: PHI (r3v7 java.lang.Object) = (r3v6 java.lang.Object), (r3v1 java.lang.Object) binds: [B:17:0x00b7, B:10:0x0024] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getPaymentDetails(X.InterfaceC67352kd<? super X.C92082a50<com.bytedance.pipo.checkout.api.network.model.response.PaymentDetailResponse>> r18) {
        /*
            r17 = this;
            r3 = r18
            boolean r0 = r3 instanceof com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel$getPaymentDetails$1
            r4 = r17
            if (r0 == 0) goto Lba
            r6 = r3
            com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel$getPaymentDetails$1 r6 = (com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel$getPaymentDetails$1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lba
            int r2 = r2 - r1
            r6.label = r2
        L16:
            java.lang.Object r3 = r6.result
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L38
            if (r0 == r1) goto L28
            if (r0 != r2) goto Lc1
            X.C141335gf.LIZJ(r3)
        L27:
            return r3
        L28:
            java.lang.Object r7 = r6.L$2
            com.bytedance.pipo.checkout.api.network.model.request.PaymentDetail r7 = (com.bytedance.pipo.checkout.api.network.model.request.PaymentDetail) r7
            java.lang.Object r0 = r6.L$1
            com.bytedance.pipo.checkout.api.network.model.request.PaymentDetail r0 = (com.bytedance.pipo.checkout.api.network.model.request.PaymentDetail) r0
            java.lang.Object r1 = r6.L$0
            com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel r1 = (com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel) r1
            X.C141335gf.LIZJ(r3)
            goto L76
        L38:
            X.C141335gf.LIZJ(r3)
            com.bytedance.pipo.checkout.api.network.model.request.PaymentDetail r7 = new com.bytedance.pipo.checkout.api.network.model.request.PaymentDetail
            r8 = 0
            r15 = 127(0x7f, float:1.78E-43)
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r16 = r8
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = r4.reference
            r7.setChargeId(r0)
            java.lang.String r0 = r4.reference
            r7.setPaymentReference(r0)
            com.bytedance.pipo.checkout.api.network.model.request.Configuration r0 = r4.getRequestConfiguration()
            r7.setConfiguration(r0)
            X.a8u r0 = r4.getOrderInfo()
            java.lang.String r0 = r0.LJLILLLLZI
            r7.setMerchantUserId(r0)
            r6.L$0 = r4
            r6.L$1 = r7
            r6.L$2 = r7
            r6.label = r1
            java.lang.Object r3 = r4.getNonceWithoutThrow(r6)
            if (r3 != r5) goto L74
            return r5
        L74:
            r1 = r4
            r0 = r7
        L76:
            java.lang.String r3 = (java.lang.String) r3
            r7.setNonce(r3)
            com.bytedance.pipo.checkout.api.network.model.request.PaymentDetailRequest r4 = new com.bytedance.pipo.checkout.api.network.model.request.PaymentDetailRequest
            r4.<init>(r0)
            X.a8u r0 = r1.getOrderInfo()
            java.lang.String r0 = r0.LJLIL
            r4.setMerchantId(r0)
            X.a51 r1 = r1.getApiService()
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r0
            r6.L$2 = r0
            r6.label = r2
            X.a4z r1 = r1.LIZIZ
            java.lang.String r0 = "/payment/v1/payment_details"
            java.lang.String r3 = r1.LIZ(r0)
            X.XKg r2 = new X.XKg
            X.2kd r0 = X.C78555UsJ.LJJII(r6)
            r2.<init>(r0)
            java.util.Map r1 = r4.buildParamsMap()
            X.a8Y r0 = new X.a8Y
            r0.<init>(r2)
            X.C92097a5F.LIZIZ(r3, r1, r0)
            java.lang.Object r3 = r2.LIZ()
            if (r3 != r5) goto L27
            return r5
        Lba:
            com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel$getPaymentDetails$1 r6 = new com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel$getPaymentDetails$1
            r6.<init>(r4, r3)
            goto L16
        Lc1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel.getPaymentDetails(X.2kd):java.lang.Object");
    }

    public final void onNavBarChange(CheckoutNavBarState config) {
        String str;
        o.LJIIIZ(config, "config");
        String currentRoute = config.getCurrentRoute();
        o.LJIIIZ(currentRoute, "<this>");
        if (o.LJ(currentRoute, "checkout_home")) {
            str = EnumC92050a4U.CheckoutPiSelected.getPageID();
        } else if (o.LJ(currentRoute, "select_pi") || o.LJ(currentRoute, "select_pi_without_default")) {
            str = EnumC92050a4U.CheckoutListToSelectPi.getPageID();
        } else if (o.LJ(currentRoute, "pay_result")) {
            str = EnumC92050a4U.CheckoutPayResult.getPageID();
        } else {
            o.LJ(currentRoute, "webview");
            str = "";
        }
        if (str.length() > 0) {
            setEventSender(new C92283a8F(str));
        }
        setUiState(CheckoutUiState.copy$default(getUiState(), false, false, false, config, 0, 0, 0, false, false, null, null, null, null, null, null, null, null, null, 262135, null));
    }

    public final void retryPaymentPolling(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        interfaceC88472Yns.invoke("pay_result");
        startPollingPaymentResult(interfaceC88472Yns, new CheckoutViewModel$retryPaymentPolling$1(this));
    }

    public final void saveRedirectUrl(String str) {
        this.redirectUrl = str;
    }

    public final void setErrorPageRetryFun(InterfaceC65784Pro<C76800UCe> retryFun) {
        o.LJIIIZ(retryFun, "retryFun");
        this.retryFunc = retryFun;
    }

    public final void setEventSender(C92283a8F c92283a8F) {
        o.LJIIIZ(c92283a8F, "<set-?>");
        this.eventSender = c92283a8F;
    }

    public final void setPayResultPageValue(C92108a5Q c92108a5Q) {
        if ((c92108a5Q instanceof C92329a8z) || (c92108a5Q instanceof C92325a8v) || (c92108a5Q instanceof C92326a8w) || (c92108a5Q instanceof C92328a8y)) {
            if (!this._payResultPosted) {
                setUiState(CheckoutUiState.copy$default(getUiState(), false, false, false, null, 0, 0, 0, false, false, null, null, null, null, null, null, null, null, null, 261887, null));
                updatePayResult(c92108a5Q);
            }
            this._payResultPosted = true;
        }
    }

    public final void setUiState(CheckoutUiState checkoutUiState) {
        this.uiState$delegate.setValue(checkoutUiState);
    }

    public final void startPollingPaymentDetailAndSetResult(InterfaceC88472Yns<? super String, C76800UCe> navigate) {
        o.LJIIIZ(navigate, "navigate");
        startPollingPaymentResult(navigate, new CheckoutViewModel$startPollingPaymentDetailAndSetResult$1(this));
    }

    public final void updateErrorCode(String str) {
        setUiState(CheckoutUiState.copy$default(getUiState(), false, false, false, null, 0, 0, 0, false, false, null, null, null, null, null, null, null, str, null, 196607, null));
    }

    public final void updatePayResult(C92108a5Q c92108a5Q) {
        setUiState(CheckoutUiState.copy$default(getUiState(), false, false, false, null, 0, 0, 0, false, false, c92108a5Q, null, null, null, null, null, null, null, null, 261631, null));
        this._payResult.postValue(c92108a5Q);
    }

    public final void updateWebviewTitle(String title) {
        o.LJIIIZ(title, "title");
        setUiState(CheckoutUiState.copy$default(getUiState(), false, false, false, null, 0, 0, 0, false, false, null, null, null, null, null, null, title, null, null, 229375, null));
    }

    private final void closeCheckout(Activity activity, boolean z) {
        EnumC92109a5R enumC92109a5R;
        if (z) {
            if (this.isBankTransferOrStoreSuccess) {
                enumC92109a5R = EnumC92109a5R.CLOSE_IN_STORE;
            } else if (this.isInPayProgress) {
                enumC92109a5R = EnumC92109a5R.CLOSE_IN_PAY;
            } else {
                enumC92109a5R = EnumC92109a5R.CANCELED;
            }
            updatePayResult(new C92108a5Q(enumC92109a5R, null));
        }
        setUiState(CheckoutUiState.copy$default(getUiState(), false, false, false, null, 0, 0, 0, false, false, null, null, null, null, null, null, null, null, null, 262139, null));
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new CheckoutViewModel$closeCheckout$1(activity, null), 3);
    }

    private final void startPollingPaymentResult(final InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, final InterfaceC88472Yns<? super C92108a5Q, C76800UCe> interfaceC88472Yns2) {
        cancelPolling();
        PthreadTimer pthreadTimer = new PthreadTimer("CheckoutViewModel");
        this._paymentDetailPollingTimer = pthreadTimer;
        pthreadTimer.schedule(new TimerTask() { // from class: com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel$startPollingPaymentResult$$inlined$timerTask$1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                com_bytedance_pipo_checkout_sdk_viewmodel_CheckoutViewModel$startPollingPaymentResult$$inlined$timerTask$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bytedance_pipo_checkout_sdk_viewmodel_CheckoutViewModel$startPollingPaymentResult$$inlined$timerTask$1__run$___twin___() {
                XKX.LIZLLL(ViewModelKt.getViewModelScope(CheckoutViewModel.this), null, null, new CheckoutViewModel$startPollingPaymentResult$1$1(CheckoutViewModel.this, interfaceC88472Yns, interfaceC88472Yns2, null), 3);
            }

            public static void com_bytedance_pipo_checkout_sdk_viewmodel_CheckoutViewModel$startPollingPaymentResult$$inlined$timerTask$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(CheckoutViewModel$startPollingPaymentResult$$inlined$timerTask$1 checkoutViewModel$startPollingPaymentResult$$inlined$timerTask$1) {
                boolean LIZ;
                try {
                    checkoutViewModel$startPollingPaymentResult$$inlined$timerTask$1.com_bytedance_pipo_checkout_sdk_viewmodel_CheckoutViewModel$startPollingPaymentResult$$inlined$timerTask$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }, 0L, 1000L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckoutViewModel(C92324a8u orderInfo, C92106a5O configuration, C92083a51 apiService) {
        super(orderInfo, configuration, apiService);
        o.LJIIIZ(orderInfo, "orderInfo");
        o.LJIIIZ(configuration, "configuration");
        o.LJIIIZ(apiService, "apiService");
        this.redirectUrl = "";
        this.uiState$delegate = C78966Uyw.LJJJIL(new CheckoutUiState(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 262143, 0 == true ? 1 : 0));
        this.eventSender = new C92283a8F(EnumC92050a4U.CheckoutListToSelectPi.getPageID());
        this.reference = "";
        this._payResult = new MutableLiveData<>();
        this._paymentDetailPollingTimer = new PthreadTimer("CheckoutViewModel");
        initMethod();
    }

    public final Object isNetworkAvailable(View view, InterfaceC91773a01 interfaceC91773a01, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return isNetworkAvailable(view, new IDqS422S0100000_31(this, 10), new IDqS422S0100000_31(this, 11), new IDqS422S0100000_31(this, 12), new IDqS422S0100000_31(this, 13), interfaceC67352kd);
    }

    public final Object showNetworkErrorDialog(View view, InterfaceC91773a01 interfaceC91773a01, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        changeCheckoutVisibility(false);
        Object showNetworkErrorDialog = showNetworkErrorDialog(view, new IDqS422S0100000_31(this, 18), new IDqS422S0100000_31(this, 19), new IDqS422S0100000_31(this, 20), interfaceC67352kd);
        if (showNetworkErrorDialog == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return showNetworkErrorDialog;
        }
        return C76800UCe.LIZ;
    }

    private final void processCCVConfirm(List<PaymentElements> list, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, View view, InterfaceC91773a01 interfaceC91773a01) {
        if (getUiState().getSelectedMethod() instanceof C92233a7R) {
            StoredMethods storedMethods = ((C92233a7R) getUiState().getSelectedMethod()).LJLIL;
            pay$default(this, new PaymentMethod(storedMethods.getPaymentMethodId(), list, null, storedMethods.getPaymentMethodToken(), null, null, 48, null), false, interfaceC88472Yns, view, interfaceC91773a01, 2, null);
        }
    }

    private final void processStorePaymentMethod(PaymentMethod paymentMethod, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, View view, InterfaceC91773a01 interfaceC91773a01) {
        storePaymentMethod(paymentMethod, interfaceC88472Yns, view, interfaceC91773a01);
    }

    private final void storePaymentMethod(PaymentMethod paymentMethod, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, View view, InterfaceC91773a01 interfaceC91773a01) {
        setUiState(CheckoutUiState.copy$default(getUiState(), false, false, false, null, 0, 0, 0, false, true, null, null, null, null, null, null, null, null, null, 261887, null));
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new CheckoutViewModel$storePaymentMethod$1(this, view, interfaceC91773a01, paymentMethod, interfaceC88472Yns, null), 3);
    }

    public static /* synthetic */ void updateErrorCode$default(CheckoutViewModel checkoutViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        checkoutViewModel.updateErrorCode(str);
    }

    public final Object showGeneralErrorDialog(View view, InterfaceC91773a01 interfaceC91773a01, String str, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object showGeneralErrorDialog = showGeneralErrorDialog(view, str, new IDqS422S0100000_31(this, 14), new IDqS422S0100000_31(this, 15), new IDqS422S0100000_31(this, 16), new IDqS422S0100000_31(this, 17), interfaceC67352kd);
        if (showGeneralErrorDialog == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return showGeneralErrorDialog;
        }
        return C76800UCe.LIZ;
    }

    private final void pay(PaymentMethod paymentMethod, boolean z, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, View view, InterfaceC91773a01 interfaceC91773a01) {
        setUiState(CheckoutUiState.copy$default(getUiState(), false, false, false, null, 0, 0, 0, false, true, null, null, null, null, null, null, null, null, null, 261887, null));
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), C78613UtF.LIZJ, null, new CheckoutViewModel$pay$1(this, view, interfaceC91773a01, paymentMethod, z, interfaceC88472Yns, null), 2);
    }

    private final void processCCDCConfirm(PaymentMethod paymentMethod, boolean z, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, View view, InterfaceC91773a01 interfaceC91773a01) {
        pay(paymentMethod, z, interfaceC88472Yns, view, interfaceC91773a01);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startPollingPaymentResult$default(CheckoutViewModel checkoutViewModel, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC88472Yns2 = null;
        }
        checkoutViewModel.startPollingPaymentResult(interfaceC88472Yns, interfaceC88472Yns2);
    }

    public static /* synthetic */ Object showGeneralErrorDialog$default(CheckoutViewModel checkoutViewModel, View view, InterfaceC91773a01 interfaceC91773a01, String str, InterfaceC67352kd interfaceC67352kd, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        return checkoutViewModel.showGeneralErrorDialog(view, interfaceC91773a01, str, interfaceC67352kd);
    }

    public static /* synthetic */ void pay$default(CheckoutViewModel checkoutViewModel, PaymentMethod paymentMethod, boolean z, InterfaceC88472Yns interfaceC88472Yns, View view, InterfaceC91773a01 interfaceC91773a01, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        checkoutViewModel.pay(paymentMethod, z, interfaceC88472Yns, view, interfaceC91773a01);
    }
}
