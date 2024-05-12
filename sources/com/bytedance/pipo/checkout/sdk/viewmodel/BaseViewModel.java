package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.C36636EZk;
import X.C76800UCe;
import X.C78613UtF;
import X.C91671ZyN;
import X.C91964a36;
import X.C91965a37;
import X.C91969a3B;
import X.C92082a50;
import X.C92083a51;
import X.C92106a5O;
import X.C92324a8u;
import X.EnumC58928NAu;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.XKX;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pipo.checkout.api.network.model.request.Configuration;
import com.bytedance.pipo.checkout.api.network.model.request.PmsParams;
import com.bytedance.pipo.checkout.api.network.model.response.CashierBasicInfoResponse;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public abstract class BaseViewModel extends ViewModel {
    public static final int $stable = 8;
    public final C92083a51 apiService;
    public final C92106a5O configuration;
    public String language;
    public C91964a36 nonceContainer;
    public final Timer nonceRequireTimer;
    public final C92324a8u orderInfo;

    public abstract void initMethod();

    public final PmsParams getPMSConfig() {
        C92324a8u c92324a8u = this.orderInfo;
        return new PmsParams(c92324a8u.LJLJJL, c92324a8u.LJLJI, c92324a8u.LJLJJI, "go", "10.0.0", null, 32, null);
    }

    public final Configuration getRequestConfiguration() {
        String str;
        C92324a8u c92324a8u = this.orderInfo;
        String str2 = c92324a8u.LJLJL;
        if (C91671ZyN.LIZ) {
            str = "light";
        } else {
            str = "dark";
        }
        return new Configuration(str2, c92324a8u.LJLJJLL, null, "android", str, "wap", 4, null);
    }

    public final void initNonceTimer() {
        this.nonceRequireTimer.schedule(new TimerTask() { // from class: com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel$initNonceTimer$1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                com_bytedance_pipo_checkout_sdk_viewmodel_BaseViewModel$initNonceTimer$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bytedance_pipo_checkout_sdk_viewmodel_BaseViewModel$initNonceTimer$1__run$___twin___() {
                XKX.LIZLLL(ViewModelKt.getViewModelScope(BaseViewModel.this), C78613UtF.LIZJ, null, new BaseViewModel$initNonceTimer$1$run$1(BaseViewModel.this, null), 2);
            }

            public static void com_bytedance_pipo_checkout_sdk_viewmodel_BaseViewModel$initNonceTimer$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(BaseViewModel$initNonceTimer$1 baseViewModel$initNonceTimer$1) {
                boolean LIZ;
                try {
                    baseViewModel$initNonceTimer$1.com_bytedance_pipo_checkout_sdk_viewmodel_BaseViewModel$initNonceTimer$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }, 0L, 180000L);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.nonceRequireTimer.cancel();
        C91965a37.LIZ = null;
    }

    public final C92083a51 getApiService() {
        return this.apiService;
    }

    public final C92106a5O getConfiguration() {
        return this.configuration;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final C92324a8u getOrderInfo() {
        return this.orderInfo;
    }

    private final void requestStarling(String str) {
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new BaseViewModel$requestStarling$1(this, str, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getNonceWithoutThrow(X.InterfaceC67352kd<? super java.lang.String> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel$getNonceWithoutThrow$1
            if (r0 == 0) goto L1e
            r4 = r6
            com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel$getNonceWithoutThrow$1 r4 = (com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel$getNonceWithoutThrow$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 != r1) goto L24
            goto L3a
        L1e:
            com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel$getNonceWithoutThrow$1 r4 = new com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel$getNonceWithoutThrow$1
            r4.<init>(r5, r6)
            goto L12
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2c:
            X.C141335gf.LIZJ(r3)
            X.a36 r0 = r5.nonceContainer     // Catch: java.lang.Throwable -> L40
            r4.label = r1     // Catch: java.lang.Throwable -> L40
            java.lang.Object r3 = r0.LIZ(r4)     // Catch: java.lang.Throwable -> L40
            if (r3 != r2) goto L3d
            return r2
        L3a:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Throwable -> L40
        L3d:
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L40
            goto L42
        L40:
            java.lang.String r3 = ""
        L42:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel.getNonceWithoutThrow(X.2kd):java.lang.Object");
    }

    public final boolean isHttpURL(String url) {
        o.LJIIIZ(url, "url");
        Uri parse = UriProtector.parse(url);
        if (o.LJ(parse.getScheme(), "http") || o.LJ(parse.getScheme(), "https")) {
            return true;
        }
        return false;
    }

    public final boolean isSchemaMailTo(String url) {
        o.LJIIIZ(url, "url");
        return o.LJ(UriProtector.parse(url).getScheme(), "mailto");
    }

    public final boolean isSchemaMatch(String url) {
        o.LJIIIZ(url, "url");
        return o.LJ(this.configuration.LIZIZ, UriProtector.parse(url).getScheme());
    }

    public final void setLanguage(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.language = str;
    }

    public final String updateLanguageAndRequestStarling(String lang) {
        o.LJIIIZ(lang, "lang");
        String str = C91969a3B.LJFF.get(lang);
        if (str != null) {
            lang = str;
        }
        this.language = lang;
        requestStarling(lang);
        return this.language;
    }

    public final Object loadCashier(String str, InterfaceC67352kd<? super C92082a50<CashierBasicInfoResponse>> interfaceC67352kd) {
        return XKX.LJI(C78613UtF.LIZJ, new BaseViewModel$loadCashier$2(this, str, null), interfaceC67352kd);
    }

    public BaseViewModel(C92324a8u orderInfo, C92106a5O configuration, C92083a51 apiService) {
        o.LJIIIZ(orderInfo, "orderInfo");
        o.LJIIIZ(configuration, "configuration");
        o.LJIIIZ(apiService, "apiService");
        this.orderInfo = orderInfo;
        this.configuration = configuration;
        this.apiService = apiService;
        this.nonceContainer = new C91964a36(configuration.LIZJ);
        this.nonceRequireTimer = new PthreadTimer("BaseViewModel");
        this.language = "en";
    }

    public static /* synthetic */ String updateLanguageAndRequestStarling$default(BaseViewModel baseViewModel, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = baseViewModel.orderInfo.LJLJJLL;
            }
            return baseViewModel.updateLanguageAndRequestStarling(str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLanguageAndRequestStarling");
    }

    public final Object showNetworkErrorDialog(View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LJI = XKX.LJI(C36636EZk.LIZ, new BaseViewModel$showNetworkErrorDialog$5(view, interfaceC65784Pro, interfaceC65784Pro2, interfaceC65784Pro3, null), interfaceC67352kd);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object isNetworkAvailable(android.view.View r12, X.InterfaceC65784Pro<X.C76800UCe> r13, X.InterfaceC65784Pro<X.C76800UCe> r14, X.InterfaceC65784Pro<X.C76800UCe> r15, X.InterfaceC65784Pro<X.C76800UCe> r16, X.InterfaceC67352kd<? super java.lang.Boolean> r17) {
        /*
            r11 = this;
            r3 = r17
            boolean r0 = r3 instanceof com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel$isNetworkAvailable$1
            r5 = r11
            if (r0 == 0) goto L69
            r10 = r3
            com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel$isNetworkAvailable$1 r10 = (com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel$isNetworkAvailable$1) r10
            int r2 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L69
            int r2 = r2 - r1
            r10.label = r2
        L15:
            java.lang.Object r1 = r10.result
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r10.label
            r3 = 1
            if (r0 == 0) goto L26
            if (r0 != r3) goto L6f
            X.C141335gf.LIZJ(r1)
        L23:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L26:
            X.C141335gf.LIZJ(r1)
            r6 = r12
            android.content.Context r1 = r6.getContext()
            java.lang.String r0 = "view.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2 = 0
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = X.C16880lQ.LLILL(r1, r0)     // Catch: java.lang.Exception -> L54
            if (r0 == 0) goto L4b
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Exception -> L54
            android.net.NetworkInfo r0 = X.C16880lQ.LJJLI(r0)     // Catch: java.lang.Exception -> L54
            if (r0 == 0) goto L54
            boolean r0 = r0.isConnected()     // Catch: java.lang.Exception -> L54
            if (r0 == 0) goto L54
            goto L53
        L4b:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L54
            java.lang.String r0 = "null cannot be cast to non-null type android.net.ConnectivityManager"
            r1.<init>(r0)     // Catch: java.lang.Exception -> L54
            throw r1     // Catch: java.lang.Exception -> L54
        L53:
            r2 = 1
        L54:
            if (r2 == 0) goto L59
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L59:
            r13.invoke()
            r10.label = r3
            r7 = r14
            r8 = r15
            r9 = r16
            java.lang.Object r0 = r5.showNetworkErrorDialog(r6, r7, r8, r9, r10)
            if (r0 != r4) goto L23
            return r4
        L69:
            com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel$isNetworkAvailable$1 r10 = new com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel$isNetworkAvailable$1
            r10.<init>(r5, r3)
            goto L15
        L6f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel.isNetworkAvailable(android.view.View, X.Pro, X.Pro, X.Pro, X.Pro, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object showGeneralErrorDialog(android.view.View r13, java.lang.String r14, X.InterfaceC65784Pro<X.C76800UCe> r15, X.InterfaceC65784Pro<X.C76800UCe> r16, X.InterfaceC65784Pro<X.C76800UCe> r17, X.InterfaceC65784Pro<X.C76800UCe> r18, X.InterfaceC67352kd<? super X.C76800UCe> r19) {
        /*
            r12 = this;
            r3 = r19
            r7 = r13
            r6 = r14
            r9 = r16
            r8 = r18
            r10 = r17
            boolean r0 = r3 instanceof com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel$showGeneralErrorDialog$1
            if (r0 == 0) goto L7e
            r4 = r3
            com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel$showGeneralErrorDialog$1 r4 = (com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel$showGeneralErrorDialog$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7e
            int r2 = r2 - r1
            r4.label = r2
        L1c:
            java.lang.Object r5 = r4.result
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L30
            if (r1 == r0) goto L4b
            if (r1 != r2) goto L84
            X.C141335gf.LIZJ(r5)
        L2d:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L30:
            X.C141335gf.LIZJ(r5)
            r15.invoke()
            r4.L$0 = r7
            r4.L$1 = r6
            r4.L$2 = r9
            r4.L$3 = r10
            r4.L$4 = r8
            r4.label = r0
            r0 = 100
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r4)
            if (r0 != r3) goto L62
            return r3
        L4b:
            java.lang.Object r8 = r4.L$4
            X.Pro r8 = (X.InterfaceC65784Pro) r8
            java.lang.Object r10 = r4.L$3
            X.Pro r10 = (X.InterfaceC65784Pro) r10
            java.lang.Object r9 = r4.L$2
            X.Pro r9 = (X.InterfaceC65784Pro) r9
            java.lang.Object r6 = r4.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r4.L$0
            android.view.View r7 = (android.view.View) r7
            X.C141335gf.LIZJ(r5)
        L62:
            X.UtN r0 = X.C36636EZk.LIZ
            com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel$showGeneralErrorDialog$6 r5 = new com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel$showGeneralErrorDialog$6
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r4.L$0 = r11
            r4.L$1 = r11
            r4.L$2 = r11
            r4.L$3 = r11
            r4.L$4 = r11
            r4.label = r2
            java.lang.Object r0 = X.XKX.LJI(r0, r5, r4)
            if (r0 != r3) goto L2d
            return r3
        L7e:
            com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel$showGeneralErrorDialog$1 r4 = new com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel$showGeneralErrorDialog$1
            r4.<init>(r12, r3)
            goto L1c
        L84:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel.showGeneralErrorDialog(android.view.View, java.lang.String, X.Pro, X.Pro, X.Pro, X.Pro, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object showNetworkErrorDialog$default(BaseViewModel baseViewModel, View view, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, InterfaceC65784Pro interfaceC65784Pro3, InterfaceC67352kd interfaceC67352kd, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                interfaceC65784Pro = BaseViewModel$showNetworkErrorDialog$2.INSTANCE;
            }
            if ((i & 4) != 0) {
                interfaceC65784Pro2 = BaseViewModel$showNetworkErrorDialog$3.INSTANCE;
            }
            if ((i & 8) != 0) {
                interfaceC65784Pro3 = BaseViewModel$showNetworkErrorDialog$4.INSTANCE;
            }
            return baseViewModel.showNetworkErrorDialog(view, interfaceC65784Pro, interfaceC65784Pro2, interfaceC65784Pro3, interfaceC67352kd);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showNetworkErrorDialog");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object isNetworkAvailable$default(BaseViewModel baseViewModel, View view, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, InterfaceC65784Pro interfaceC65784Pro3, InterfaceC65784Pro interfaceC65784Pro4, InterfaceC67352kd interfaceC67352kd, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                interfaceC65784Pro = BaseViewModel$isNetworkAvailable$2.INSTANCE;
            }
            if ((i & 4) != 0) {
                interfaceC65784Pro2 = BaseViewModel$isNetworkAvailable$3.INSTANCE;
            }
            if ((i & 8) != 0) {
                interfaceC65784Pro3 = BaseViewModel$isNetworkAvailable$4.INSTANCE;
            }
            if ((i & 16) != 0) {
                interfaceC65784Pro4 = BaseViewModel$isNetworkAvailable$5.INSTANCE;
            }
            return baseViewModel.isNetworkAvailable(view, interfaceC65784Pro, interfaceC65784Pro2, interfaceC65784Pro3, interfaceC65784Pro4, interfaceC67352kd);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isNetworkAvailable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object showGeneralErrorDialog$default(BaseViewModel baseViewModel, View view, String str, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, InterfaceC65784Pro interfaceC65784Pro3, InterfaceC65784Pro interfaceC65784Pro4, InterfaceC67352kd interfaceC67352kd, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                interfaceC65784Pro = BaseViewModel$showGeneralErrorDialog$2.INSTANCE;
            }
            if ((i & 8) != 0) {
                interfaceC65784Pro2 = BaseViewModel$showGeneralErrorDialog$3.INSTANCE;
            }
            if ((i & 16) != 0) {
                interfaceC65784Pro3 = BaseViewModel$showGeneralErrorDialog$4.INSTANCE;
            }
            if ((i & 32) != 0) {
                interfaceC65784Pro4 = BaseViewModel$showGeneralErrorDialog$5.INSTANCE;
            }
            return baseViewModel.showGeneralErrorDialog(view, str, interfaceC65784Pro, interfaceC65784Pro2, interfaceC65784Pro3, interfaceC65784Pro4, interfaceC67352kd);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showGeneralErrorDialog");
    }
}
