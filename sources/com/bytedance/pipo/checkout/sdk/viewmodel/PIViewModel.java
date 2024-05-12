package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.C11850dJ;
import X.C1DJ;
import X.C1ZD;
import X.C221108m2;
import X.C40431iJ;
import X.C43401n6;
import X.C5H3;
import X.C76800UCe;
import X.C78613UtF;
import X.C78966Uyw;
import X.C91706Zyw;
import X.C91856a1M;
import X.C91884a1o;
import X.C91943a2l;
import X.C91952a2u;
import X.C91992a3Y;
import X.C92082a50;
import X.C92083a51;
import X.C92103a5L;
import X.C92106a5O;
import X.C92116a5Y;
import X.C92145a61;
import X.C92204a6y;
import X.C92284a8G;
import X.C92322a8s;
import X.C92323a8t;
import X.C92324a8u;
import X.C92785aGL;
import X.C92787aGN;
import X.EnumC58928NAu;
import X.EnumC92104a5M;
import X.InterfaceC35811ar;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC88472Yns;
import X.InterfaceC91773a01;
import X.InterfaceC91780a08;
import X.InterfaceC92051a4V;
import X.ORZ;
import X.XKX;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.pipo.checkout.api.network.model.request.PaymentMethod;
import com.bytedance.pipo.checkout.api.network.model.response.PIBasicInfoResponse;
import com.bytedance.pipo.checkout.api.network.model.response.StoredMethods;
import java.util.Iterator;
import kotlin.jvm.internal.IDqS178S0200000_31;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PIViewModel extends BaseViewModel {
    public static final int $stable = 8;
    public final MutableLiveData<C92103a5L> _bindResult;
    public InterfaceC70422pa composerScope;
    public C92284a8G eventSender;
    public final C5H3 modalBottomSheetState$delegate;
    public InterfaceC92051a4V pipoEvents;
    public InterfaceC65784Pro<C76800UCe> retryFunc;
    public final InterfaceC35811ar uiState$delegate;
    public final InterfaceC35811ar<Boolean> visibility;

    public static /* synthetic */ void getModalBottomSheetState$annotations() {
    }

    public final InterfaceC92051a4V getPipoEvents() {
        return null;
    }

    public final void setPipoEvents(InterfaceC92051a4V interfaceC92051a4V) {
    }

    public final void cashierRetry() {
        setUiState(PIUiState.copy$default(getUiState(), true, false, null, false, 0, 0, 0, false, null, null, false, false, null, false, null, 32766, null));
        initMethod();
    }

    public final void closeBindSheet() {
        InterfaceC70422pa interfaceC70422pa = this.composerScope;
        if (interfaceC70422pa != null) {
            XKX.LIZLLL(interfaceC70422pa, null, null, new PIViewModel$closeBindSheet$1(this, null), 3);
        }
        setUiState(PIUiState.copy$default(getUiState(), false, false, null, false, 0, 0, 0, false, null, null, false, false, null, false, null, 32759, null));
    }

    public final C1ZD getModalBottomSheetState() {
        return (C1ZD) this.modalBottomSheetState$delegate.getValue();
    }

    public final PIUiState getUiState() {
        return (PIUiState) this.uiState$delegate.getValue();
    }

    public final void onClose() {
        updateBindResult(new C92103a5L(EnumC92104a5M.CANCELED));
        C91943a2l.LIZ();
    }

    public final void onPaymentMethodNotFound() {
        updateBindResult(new C92103a5L(EnumC92104a5M.PAYMENT_METHOD_NOT_FOUND));
        C91943a2l.LIZ();
    }

    public final void onPaymentMethodNotSet() {
        updateBindResult(new C92103a5L(EnumC92104a5M.PAYMENT_METHOD_NOT_SET));
        C91943a2l.LIZ();
    }

    public final void onRedirectAppFailed() {
        updateBindResult(new C92103a5L(EnumC92104a5M.FAILED_TO_APP));
        C91943a2l.LIZ();
    }

    public final void retry() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.retryFunc;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        this.retryFunc = null;
    }

    @Override // com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel
    public void initMethod() {
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new PIViewModel$initMethod$1(this, null), 3);
    }

    public final boolean skipErrorDialog() {
        return o.LJ(getConfiguration().LJIIIIZZ, Boolean.TRUE);
    }

    public final LiveData<C92103a5L> getBindResult() {
        return this._bindResult;
    }

    public final C92284a8G getEventSender() {
        return this.eventSender;
    }

    public final void changeBindVisibility(boolean z) {
        this.visibility.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object haveStoredMethods(X.InterfaceC67352kd<? super java.lang.Boolean> r23) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel.haveStoredMethods(X.2kd):java.lang.Object");
    }

    public final void imeHandle(int i) {
        PIUiState copy$default;
        if (i != 0) {
            if (getUiState().getImeHeight() != i) {
                copy$default = PIUiState.copy$default(getUiState(), false, false, null, false, 0, 0, i, true, null, null, false, false, null, false, null, 32575, null);
            } else {
                copy$default = PIUiState.copy$default(getUiState(), false, false, null, false, 0, 0, 0, true, null, null, false, false, null, false, null, 32639, null);
            }
        } else {
            copy$default = PIUiState.copy$default(getUiState(), false, false, null, false, 0, 0, 0, false, null, null, false, false, null, false, null, 32639, null);
        }
        setUiState(copy$default);
    }

    public final void setCurrentMethod(String piToken) {
        Object obj;
        o.LJIIIZ(piToken, "piToken");
        Iterator it = ORZ.LLIIIZ(getUiState().getBizData().LJLJL, getUiState().getBizData().LJLIL).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (o.LJ(((StoredMethods) obj).getPaymentMethodToken(), piToken)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        StoredMethods storedMethods = (StoredMethods) obj;
        PIUiState uiState = getUiState();
        if (storedMethods == null) {
            storedMethods = new StoredMethods(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 7, null);
        }
        setUiState(PIUiState.copy$default(uiState, false, false, storedMethods, false, 0, 0, 0, false, null, null, false, false, null, false, null, 32763, null));
    }

    public final void setEventSender(C92284a8G c92284a8G) {
        o.LJIIIZ(c92284a8G, "<set-?>");
        this.eventSender = c92284a8G;
    }

    public final void setUiState(PIUiState pIUiState) {
        this.uiState$delegate.setValue(pIUiState);
    }

    public final void updateBindResult(C92103a5L c92103a5L) {
        this._bindResult.postValue(c92103a5L);
    }

    public final void updateNavigation(boolean z) {
        setUiState(PIUiState.copy$default(getUiState(), false, false, null, false, 0, 0, 0, false, null, null, z, false, null, false, null, 31743, null));
    }

    public final void updateWebviewTitle(String title) {
        o.LJIIIZ(title, "title");
        setUiState(PIUiState.copy$default(getUiState(), false, false, null, false, 0, 0, 0, false, title, null, false, false, null, false, null, 32511, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getPIManageConfigure(java.lang.String r8, X.InterfaceC67352kd<? super com.bytedance.pipo.checkout.api.network.model.request.PIManageConfigure> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel$getPIManageConfigure$1
            if (r0 == 0) goto L50
            r6 = r9
            com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel$getPIManageConfigure$1 r6 = (com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel$getPIManageConfigure$1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.label
            r3 = 1
            if (r0 == 0) goto L34
            if (r0 != r3) goto L56
            java.lang.Object r2 = r6.L$2
            com.bytedance.pipo.checkout.api.network.model.request.Configuration r2 = (com.bytedance.pipo.checkout.api.network.model.request.Configuration) r2
            java.lang.Object r1 = r6.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r8 = r6.L$0
            java.lang.String r8 = (java.lang.String) r8
            X.C141335gf.LIZJ(r5)
        L2c:
            java.lang.String r5 = (java.lang.String) r5
            com.bytedance.pipo.checkout.api.network.model.request.PIManageConfigure r0 = new com.bytedance.pipo.checkout.api.network.model.request.PIManageConfigure
            r0.<init>(r1, r2, r5, r8)
            return r0
        L34:
            X.C141335gf.LIZJ(r5)
            X.a8u r0 = r7.getOrderInfo()
            java.lang.String r1 = r0.LJLILLLLZI
            com.bytedance.pipo.checkout.api.network.model.request.Configuration r2 = r7.getRequestConfiguration()
            r6.L$0 = r8
            r6.L$1 = r1
            r6.L$2 = r2
            r6.label = r3
            java.lang.Object r5 = r7.getNonceWithoutThrow(r6)
            if (r5 != r4) goto L2c
            return r4
        L50:
            com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel$getPIManageConfigure$1 r6 = new com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel$getPIManageConfigure$1
            r6.<init>(r7, r9)
            goto L12
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel.getPIManageConfigure(java.lang.String, X.2kd):java.lang.Object");
    }

    public final Object getPiBasicInfo(String str, InterfaceC67352kd<? super C92082a50<PIBasicInfoResponse>> interfaceC67352kd) {
        return XKX.LJI(C78613UtF.LIZJ, new PIViewModel$getPiBasicInfo$2(this, str, null), interfaceC67352kd);
    }

    public final Object isNetworkAvailable(View view, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return BaseViewModel.isNetworkAvailable$default(this, view, new IDqS422S0100000_31(this, 21), new IDqS422S0100000_31(this, 22), new IDqS422S0100000_31(this, 23), null, interfaceC67352kd, 16, null);
    }

    public final void launchBindSheet(View view, InterfaceC70422pa scope) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(scope, "scope");
        this.composerScope = scope;
        C1ZD modalBottomSheetState = getModalBottomSheetState();
        C92083a51 apiService = getApiService();
        C92204a6y bizData = getUiState().getBizData();
        String str = getOrderInfo().LJLJJLL;
        String countryOrRegion = getOrderInfo().LJLJJL;
        InterfaceC35811ar<Boolean> contentVisibility = this.visibility;
        PIViewModel$launchBindSheet$1 onClose = PIViewModel$launchBindSheet$1.INSTANCE;
        o.LJIIIZ(modalBottomSheetState, "modalBottomSheetState");
        o.LJIIIZ(apiService, "apiService");
        o.LJIIIZ(bizData, "bizData");
        o.LJIIIZ(countryOrRegion, "countryOrRegion");
        o.LJIIIZ(contentVisibility, "contentVisibility");
        o.LJIIIZ(onClose, "onClose");
        C40431iJ LJFF = C1DJ.LJFF(new C92785aGL(this, apiService, bizData, C78966Uyw.LJJJIL("available_methods"), str, countryOrRegion, modalBottomSheetState), -985536591, true);
        C43401n6 LJ = C91992a3Y.LJ();
        C11850dJ LIZLLL = C91992a3Y.LIZLLL();
        ViewGroup LIZ = C92116a5Y.LIZ(view);
        Context context = LIZ.getContext();
        o.LJIIIIZZ(context, "viewGroup.context");
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setContent(C1DJ.LJFF(new C92787aGN(modalBottomSheetState, contentVisibility, LJ, LIZLLL, LJFF, LIZ, composeView, onClose), -985531644, true));
        LIZ.addView(composeView);
        InterfaceC70422pa interfaceC70422pa = this.composerScope;
        if (interfaceC70422pa == null) {
            return;
        }
        XKX.LIZLLL(interfaceC70422pa, null, null, new PIViewModel$launchBindSheet$2(this, null), 3);
    }

    public final Object showNetworkErrorDialog(View view, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        changeBindVisibility(false);
        Object showNetworkErrorDialog = showNetworkErrorDialog(view, new IDqS422S0100000_31(this, 28), new IDqS422S0100000_31(this, 29), new IDqS422S0100000_31(this, 30), interfaceC67352kd);
        if (showNetworkErrorDialog == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return showNetworkErrorDialog;
        }
        return C76800UCe.LIZ;
    }

    public final void updateSystemBar(int i, int i2) {
        if (i != getUiState().getStatusBarHeight() || i2 != getUiState().getNavigationBarHeight()) {
            setUiState(PIUiState.copy$default(getUiState(), false, false, null, false, i, i2, 0, false, null, null, false, false, null, false, null, 32719, null));
            C91952a2u.LIZIZ = i;
        }
    }

    public final void webviewErrorHandler(WebView webView, C92145a61 navController) {
        o.LJIIIZ(navController, "navController");
        if (skipErrorDialog()) {
            return;
        }
        C91884a1o.LIZ(navController, "error_page");
        this.retryFunc = new IDqS178S0200000_31(navController, webView, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PIViewModel(C92324a8u orderInfo, C92106a5O configuration, C92083a51 apiService) {
        super(orderInfo, configuration, apiService);
        o.LJIIIZ(orderInfo, "orderInfo");
        o.LJIIIZ(configuration, "configuration");
        o.LJIIIZ(apiService, "apiService");
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        this.uiState$delegate = C78966Uyw.LJJJIL(new PIUiState(false, objArr, null, objArr2, objArr3, objArr4, objArr5, objArr6, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr7, objArr8, 0 == true ? 1 : 0, objArr9, 0 == true ? 1 : 0, 32767, 0 == true ? 1 : 0));
        this.eventSender = new C92284a8G();
        this.modalBottomSheetState$delegate = C221108m2.LIZIZ(PIViewModel$modalBottomSheetState$2.INSTANCE);
        this.visibility = C78966Uyw.LJJJIL(Boolean.TRUE);
        this._bindResult = new MutableLiveData<>();
        initMethod();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkBindSuccess(android.view.View r12, X.InterfaceC91780a08 r13, X.InterfaceC67352kd<? super X.C76800UCe> r14) {
        /*
            r11 = this;
            r6 = r12
            r5 = r13
            boolean r0 = r14 instanceof com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel$checkBindSuccess$1
            if (r0 == 0) goto L6c
            r4 = r14
            com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel$checkBindSuccess$1 r4 = (com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel$checkBindSuccess$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r4.label = r2
        L14:
            java.lang.Object r3 = r4.result
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L58
            if (r1 != r0) goto L72
            java.lang.Object r5 = r4.L$2
            X.a08 r5 = (X.InterfaceC91780a08) r5
            java.lang.Object r6 = r4.L$1
            android.view.View r6 = (android.view.View) r6
            java.lang.Object r1 = r4.L$0
            com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel r1 = (com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel) r1
            X.C141335gf.LIZJ(r3)
        L2e:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto L55
            boolean r0 = r1.skipErrorDialog()
            if (r0 != 0) goto L55
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            androidx.compose.runtime.ParcelableSnapshotMutableState r7 = X.C78966Uyw.LJJJIL(r0)
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r0 = "pipo_payin_added_pmid_toast"
            java.lang.String r8 = X.C92054a4Y.LIZ(r0, r1)
            X.a9p r9 = X.C92381a9p.LIZ
            int r10 = X.C91952a2u.LIZIZ
            int r0 = X.C91952a2u.LIZJ
            int r10 = r10 + r0
            r5.LIZ(r6, r7, r8, r9, r10)
        L55:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L58:
            X.C141335gf.LIZJ(r3)
            r4.L$0 = r11
            r4.L$1 = r6
            r4.L$2 = r5
            r4.label = r0
            java.lang.Object r3 = r11.haveStoredMethods(r4)
            if (r3 != r2) goto L6a
            return r2
        L6a:
            r1 = r11
            goto L2e
        L6c:
            com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel$checkBindSuccess$1 r4 = new com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel$checkBindSuccess$1
            r4.<init>(r11, r14)
            goto L14
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel.checkBindSuccess(android.view.View, X.a08, X.2kd):java.lang.Object");
    }

    public final void dealBindResult(boolean z, View view, InterfaceC91780a08 toast) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(toast, "toast");
        if (z) {
            XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new PIViewModel$dealBindResult$1(this, view, toast, null), 3);
        }
    }

    public final Object showGeneralErrorDialog(View view, String str, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object showGeneralErrorDialog = showGeneralErrorDialog(view, str, new IDqS422S0100000_31(this, 24), new IDqS422S0100000_31(this, 25), new IDqS422S0100000_31(this, 26), new IDqS422S0100000_31(this, 27), interfaceC67352kd);
        if (showGeneralErrorDialog == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return showGeneralErrorDialog;
        }
        return C76800UCe.LIZ;
    }

    public final void storePaymentMethod(PaymentMethod methodInfo, C92145a61 navController, View view) {
        o.LJIIIZ(methodInfo, "methodInfo");
        o.LJIIIZ(navController, "navController");
        o.LJIIIZ(view, "view");
        setUiState(PIUiState.copy$default(getUiState(), false, false, null, true, 0, 0, 0, false, null, null, false, false, null, false, null, 32759, null));
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), C78613UtF.LIZJ, null, new PIViewModel$storePaymentMethod$3(this, view, methodInfo, navController, null), 2);
    }

    public static /* synthetic */ void updateNavigation$default(PIViewModel pIViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        pIViewModel.updateNavigation(z);
    }

    public final void cancelAsPrimary(View view, InterfaceC91773a01 dialog, String paymentMethodToken, InterfaceC35811ar<Boolean> loadingDialog, InterfaceC88472Yns<? super Boolean, C76800UCe> toastCallback) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(dialog, "dialog");
        o.LJIIIZ(paymentMethodToken, "paymentMethodToken");
        o.LJIIIZ(loadingDialog, "loadingDialog");
        o.LJIIIZ(toastCallback, "toastCallback");
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new PIViewModel$cancelAsPrimary$1(this, view, loadingDialog, paymentMethodToken, toastCallback, null), 3);
    }

    public final void saveAsPrimary(View view, InterfaceC91773a01 dialog, String paymentMethodToken, InterfaceC35811ar<Boolean> loadingDialog, InterfaceC88472Yns<? super Boolean, C76800UCe> toastCallback) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(dialog, "dialog");
        o.LJIIIZ(paymentMethodToken, "paymentMethodToken");
        o.LJIIIZ(loadingDialog, "loadingDialog");
        o.LJIIIZ(toastCallback, "toastCallback");
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new PIViewModel$saveAsPrimary$1(this, view, loadingDialog, paymentMethodToken, toastCallback, null), 3);
    }

    public static /* synthetic */ Object showGeneralErrorDialog$default(PIViewModel pIViewModel, View view, String str, InterfaceC67352kd interfaceC67352kd, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return pIViewModel.showGeneralErrorDialog(view, str, interfaceC67352kd);
    }

    public final void deleteStoredMethod(View view, InterfaceC91773a01 dialog, String paymentMethodToken, InterfaceC35811ar<Boolean> loadingDialog, C92145a61 navHostController, InterfaceC88472Yns<? super Boolean, C76800UCe> toastCallback) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(dialog, "dialog");
        o.LJIIIZ(paymentMethodToken, "paymentMethodToken");
        o.LJIIIZ(loadingDialog, "loadingDialog");
        o.LJIIIZ(navHostController, "navHostController");
        o.LJIIIZ(toastCallback, "toastCallback");
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new PIViewModel$deleteStoredMethod$1(this, view, loadingDialog, paymentMethodToken, navHostController, toastCallback, null), 3);
    }

    public final void redirectHandler(boolean z, String errorCode, C91706Zyw navController, View view, InterfaceC91780a08 toast, InterfaceC65784Pro<C76800UCe> onClose) {
        o.LJIIIZ(errorCode, "errorCode");
        o.LJIIIZ(navController, "navController");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(toast, "toast");
        o.LJIIIZ(onClose, "onClose");
        if (z) {
            updateBindResult(new C92323a8t());
            if (!skipErrorDialog()) {
                XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new PIViewModel$redirectHandler$1(onClose, this, view, toast, null), 3);
            }
        } else {
            updateBindResult(new C92322a8s(C91856a1M.LIZLLL(errorCode)));
            if (!skipErrorDialog()) {
                setUiState(PIUiState.copy$default(getUiState(), false, false, null, false, 0, 0, 0, false, null, errorCode, false, false, null, false, null, 32255, null));
                C91884a1o.LIZ(navController, "error_page");
            }
        }
        C91943a2l.LIZ();
    }
}
