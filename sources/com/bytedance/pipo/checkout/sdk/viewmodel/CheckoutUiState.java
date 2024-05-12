package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.C91969a3B;
import X.C92108a5Q;
import X.C92204a6y;
import X.C92231a7P;
import X.C92233a7R;
import X.InterfaceC91961a33;
import X.ORZ;
import com.bytedance.pipo.checkout.api.network.model.response.BankCardRules;
import com.bytedance.pipo.checkout.api.network.model.response.CashierBasicInfoResponse;
import com.bytedance.pipo.checkout.api.network.model.response.MethodExtra;
import com.bytedance.pipo.checkout.api.network.model.response.Methods;
import com.bytedance.pipo.checkout.api.network.model.response.StoredMethods;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class CheckoutUiState {
    public static final int $stable = 8;
    public final List<Methods> assembleMethods;
    public final Object assemblePIIcon;
    public final String assemblePITitle;
    public final C92204a6y bizData;
    public final CashierBasicInfoResponse cashierResponse;
    public final Methods currentMethod;
    public final String errorCode;
    public final int imeHeight;
    public final boolean isContentError;
    public final boolean isImeOpen;
    public final boolean isLoading;
    public final boolean isPayLoading;
    public final CheckoutNavBarState navBarState;
    public final int navigationBarHeight;
    public final C92108a5Q payResult;
    public final InterfaceC91961a33 selectedMethod;
    public final boolean showContent;
    public final int statusBarHeight;
    public final String webViewTitle;

    /* JADX WARN: Multi-variable type inference failed */
    public CheckoutUiState() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 262143, 0 == true ? 1 : 0);
    }

    private final CashierBasicInfoResponse component18() {
        return this.cashierResponse;
    }

    public static /* synthetic */ CheckoutUiState copy$default(CheckoutUiState checkoutUiState, boolean z, boolean z2, boolean z3, CheckoutNavBarState checkoutNavBarState, int i, int i2, int i3, boolean z4, boolean z5, C92108a5Q c92108a5Q, Methods methods, InterfaceC91961a33 interfaceC91961a33, List list, String str, Object obj, String str2, String str3, CashierBasicInfoResponse cashierBasicInfoResponse, int i4, Object obj2) {
        CheckoutNavBarState checkoutNavBarState2 = checkoutNavBarState;
        boolean z6 = z3;
        boolean z7 = z;
        boolean z8 = z2;
        boolean z9 = z5;
        boolean z10 = z4;
        int i5 = i3;
        int i6 = i;
        int i7 = i2;
        String str4 = str;
        List list2 = list;
        InterfaceC91961a33 interfaceC91961a332 = interfaceC91961a33;
        C92108a5Q c92108a5Q2 = c92108a5Q;
        Methods methods2 = methods;
        CashierBasicInfoResponse cashierBasicInfoResponse2 = cashierBasicInfoResponse;
        String str5 = str3;
        Object obj3 = obj;
        String str6 = str2;
        if ((i4 & 1) != 0) {
            z7 = checkoutUiState.isLoading;
        }
        if ((i4 & 2) != 0) {
            z8 = checkoutUiState.isContentError;
        }
        if ((i4 & 4) != 0) {
            z6 = checkoutUiState.showContent;
        }
        if ((i4 & 8) != 0) {
            checkoutNavBarState2 = checkoutUiState.navBarState;
        }
        if ((i4 & 16) != 0) {
            i6 = checkoutUiState.statusBarHeight;
        }
        if ((i4 & 32) != 0) {
            i7 = checkoutUiState.navigationBarHeight;
        }
        if ((i4 & 64) != 0) {
            i5 = checkoutUiState.imeHeight;
        }
        if ((i4 & 128) != 0) {
            z10 = checkoutUiState.isImeOpen;
        }
        if ((i4 & 256) != 0) {
            z9 = checkoutUiState.isPayLoading;
        }
        if ((i4 & 512) != 0) {
            c92108a5Q2 = checkoutUiState.payResult;
        }
        if ((i4 & 1024) != 0) {
            methods2 = checkoutUiState.currentMethod;
        }
        if ((i4 & 2048) != 0) {
            interfaceC91961a332 = checkoutUiState.selectedMethod;
        }
        if ((i4 & 4096) != 0) {
            list2 = checkoutUiState.assembleMethods;
        }
        if ((i4 & FileUtils.BUFFER_SIZE) != 0) {
            str4 = checkoutUiState.assemblePITitle;
        }
        if ((i4 & 16384) != 0) {
            obj3 = checkoutUiState.assemblePIIcon;
        }
        if ((32768 & i4) != 0) {
            str6 = checkoutUiState.webViewTitle;
        }
        if ((65536 & i4) != 0) {
            str5 = checkoutUiState.errorCode;
        }
        if ((i4 & 131072) != 0) {
            cashierBasicInfoResponse2 = checkoutUiState.cashierResponse;
        }
        int i8 = i7;
        int i9 = i5;
        boolean z11 = z10;
        return checkoutUiState.copy(z7, z8, z6, checkoutNavBarState2, i6, i8, i9, z11, z9, c92108a5Q2, methods2, interfaceC91961a332, list2, str4, obj3, str6, str5, cashierBasicInfoResponse2);
    }

    public final CheckoutUiState copy(boolean z, boolean z2, boolean z3, CheckoutNavBarState navBarState, int i, int i2, int i3, boolean z4, boolean z5, C92108a5Q payResult, Methods currentMethod, InterfaceC91961a33 selectedMethod, List<Methods> assembleMethods, String assemblePITitle, Object obj, String webViewTitle, String str, CashierBasicInfoResponse cashierResponse) {
        o.LJIIIZ(navBarState, "navBarState");
        o.LJIIIZ(payResult, "payResult");
        o.LJIIIZ(currentMethod, "currentMethod");
        o.LJIIIZ(selectedMethod, "selectedMethod");
        o.LJIIIZ(assembleMethods, "assembleMethods");
        o.LJIIIZ(assemblePITitle, "assemblePITitle");
        o.LJIIIZ(webViewTitle, "webViewTitle");
        o.LJIIIZ(cashierResponse, "cashierResponse");
        return new CheckoutUiState(z, z2, z3, navBarState, i, i2, i3, z4, z5, payResult, currentMethod, selectedMethod, assembleMethods, assemblePITitle, obj, webViewTitle, str, cashierResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutUiState)) {
            return false;
        }
        CheckoutUiState checkoutUiState = (CheckoutUiState) obj;
        return this.isLoading == checkoutUiState.isLoading && this.isContentError == checkoutUiState.isContentError && this.showContent == checkoutUiState.showContent && o.LJ(this.navBarState, checkoutUiState.navBarState) && this.statusBarHeight == checkoutUiState.statusBarHeight && this.navigationBarHeight == checkoutUiState.navigationBarHeight && this.imeHeight == checkoutUiState.imeHeight && this.isImeOpen == checkoutUiState.isImeOpen && this.isPayLoading == checkoutUiState.isPayLoading && o.LJ(this.payResult, checkoutUiState.payResult) && o.LJ(this.currentMethod, checkoutUiState.currentMethod) && o.LJ(this.selectedMethod, checkoutUiState.selectedMethod) && o.LJ(this.assembleMethods, checkoutUiState.assembleMethods) && o.LJ(this.assemblePITitle, checkoutUiState.assemblePITitle) && o.LJ(this.assemblePIIcon, checkoutUiState.assemblePIIcon) && o.LJ(this.webViewTitle, checkoutUiState.webViewTitle) && o.LJ(this.errorCode, checkoutUiState.errorCode) && o.LJ(this.cashierResponse, checkoutUiState.cashierResponse);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public int hashCode() {
        boolean z = this.isLoading;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r02 = this.isContentError;
        int i2 = r02;
        if (r02 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r03 = this.showContent;
        int i4 = r03;
        if (r03 != 0) {
            i4 = 1;
        }
        int hashCode = (((((((((i3 + i4) * 31) + this.navBarState.hashCode()) * 31) + this.statusBarHeight) * 31) + this.navigationBarHeight) * 31) + this.imeHeight) * 31;
        ?? r04 = this.isImeOpen;
        int i5 = r04;
        if (r04 != 0) {
            i5 = 1;
        }
        int hashCode2 = (((((((((((((hashCode + i5) * 31) + (this.isPayLoading ? 1 : 0)) * 31) + this.payResult.hashCode()) * 31) + this.currentMethod.hashCode()) * 31) + this.selectedMethod.hashCode()) * 31) + this.assembleMethods.hashCode()) * 31) + this.assemblePITitle.hashCode()) * 31;
        Object obj = this.assemblePIIcon;
        int hashCode3 = (((hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31) + this.webViewTitle.hashCode()) * 31;
        String str = this.errorCode;
        return ((hashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.cashierResponse.hashCode();
    }

    public String toString() {
        return "CheckoutUiState(isLoading=" + this.isLoading + ", isContentError=" + this.isContentError + ", showContent=" + this.showContent + ", navBarState=" + this.navBarState + ", statusBarHeight=" + this.statusBarHeight + ", navigationBarHeight=" + this.navigationBarHeight + ", imeHeight=" + this.imeHeight + ", isImeOpen=" + this.isImeOpen + ", isPayLoading=" + this.isPayLoading + ", payResult=" + this.payResult + ", currentMethod=" + this.currentMethod + ", selectedMethod=" + this.selectedMethod + ", assembleMethods=" + this.assembleMethods + ", assemblePITitle=" + this.assemblePITitle + ", assemblePIIcon=" + this.assemblePIIcon + ", webViewTitle=" + this.webViewTitle + ", errorCode=" + ((Object) this.errorCode) + ", cashierResponse=" + this.cashierResponse + ')';
    }

    public final List<Methods> getAssembleMethods() {
        return this.assembleMethods;
    }

    public final Object getAssemblePIIcon() {
        return this.assemblePIIcon;
    }

    public final String getAssemblePITitle() {
        return this.assemblePITitle;
    }

    public final C92204a6y getBizData() {
        return this.bizData;
    }

    public final Methods getCurrentMethod() {
        return this.currentMethod;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final int getImeHeight() {
        return this.imeHeight;
    }

    public final CheckoutNavBarState getNavBarState() {
        return this.navBarState;
    }

    public final int getNavigationBarHeight() {
        return this.navigationBarHeight;
    }

    public final C92108a5Q getPayResult() {
        return this.payResult;
    }

    public final InterfaceC91961a33 getSelectedMethod() {
        return this.selectedMethod;
    }

    public final boolean getShowContent() {
        return this.showContent;
    }

    public final int getStatusBarHeight() {
        return this.statusBarHeight;
    }

    public final String getWebViewTitle() {
        return this.webViewTitle;
    }

    public final boolean isContentError() {
        return this.isContentError;
    }

    public final boolean isImeOpen() {
        return this.isImeOpen;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isPayLoading() {
        return this.isPayLoading;
    }

    public CheckoutUiState(boolean z, boolean z2, boolean z3, CheckoutNavBarState navBarState, int i, int i2, int i3, boolean z4, boolean z5, C92108a5Q payResult, Methods currentMethod, InterfaceC91961a33 selectedMethod, List<Methods> assembleMethods, String assemblePITitle, Object obj, String webViewTitle, String str, CashierBasicInfoResponse cashierResponse) {
        o.LJIIIZ(navBarState, "navBarState");
        o.LJIIIZ(payResult, "payResult");
        o.LJIIIZ(currentMethod, "currentMethod");
        o.LJIIIZ(selectedMethod, "selectedMethod");
        o.LJIIIZ(assembleMethods, "assembleMethods");
        o.LJIIIZ(assemblePITitle, "assemblePITitle");
        o.LJIIIZ(webViewTitle, "webViewTitle");
        o.LJIIIZ(cashierResponse, "cashierResponse");
        this.isLoading = z;
        this.isContentError = z2;
        this.showContent = z3;
        this.navBarState = navBarState;
        this.statusBarHeight = i;
        this.navigationBarHeight = i2;
        this.imeHeight = i3;
        this.isImeOpen = z4;
        this.isPayLoading = z5;
        this.payResult = payResult;
        this.currentMethod = currentMethod;
        this.selectedMethod = selectedMethod;
        this.assembleMethods = assembleMethods;
        this.assemblePITitle = assemblePITitle;
        this.assemblePIIcon = obj;
        this.webViewTitle = webViewTitle;
        this.errorCode = str;
        this.cashierResponse = cashierResponse;
        List<Methods> methods = cashierResponse.getMethods();
        if (methods == null) {
            methods = Collections.emptyList();
            o.LJIIIIZZ(methods, "emptyList()");
        }
        List<StoredMethods> storedMethods = cashierResponse.getStoredMethods();
        List LLJILJILJ = (storedMethods == null || (LLJILJILJ = ORZ.LLJILJILJ(storedMethods)) == null) ? new ArrayList() : LLJILJILJ;
        List<BankCardRules> bankCardRules = cashierResponse.getBankCardRules();
        if (bankCardRules == null) {
            bankCardRules = Collections.emptyList();
            o.LJIIIIZZ(bankCardRules, "emptyList()");
        }
        MethodExtra methodExtra = cashierResponse.getMethodExtra();
        methodExtra = methodExtra == null ? new MethodExtra(null, null, 3, null) : methodExtra;
        List<InterfaceC91961a33> LJIIIZ = C91969a3B.LJIIIZ(cashierResponse.getMethods(), cashierResponse.getStoredMethods());
        ArrayList arrayList = new ArrayList();
        List<StoredMethods> unavailableStoredMethods = cashierResponse.getUnavailableStoredMethods();
        if (unavailableStoredMethods != null) {
            Iterator<StoredMethods> it = unavailableStoredMethods.iterator();
            while (it.hasNext()) {
                arrayList.add(new C92233a7R(it.next()));
            }
        }
        List<Methods> unavailableMethods = cashierResponse.getUnavailableMethods();
        if (unavailableMethods != null) {
            Iterator<Methods> it2 = unavailableMethods.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C92231a7P(it2.next()));
            }
        }
        this.bizData = new C92204a6y(LLJILJILJ, methods, bankCardRules, methodExtra, LJIIIZ, arrayList, null, 64);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ CheckoutUiState(boolean r67, boolean r68, boolean r69, com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutNavBarState r70, int r71, int r72, int r73, boolean r74, boolean r75, X.C92108a5Q r76, com.bytedance.pipo.checkout.api.network.model.response.Methods r77, X.InterfaceC91961a33 r78, java.util.List r79, java.lang.String r80, java.lang.Object r81, java.lang.String r82, java.lang.String r83, com.bytedance.pipo.checkout.api.network.model.response.CashierBasicInfoResponse r84, int r85, kotlin.jvm.internal.DefaultConstructorMarker r86) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutUiState.<init>(boolean, boolean, boolean, com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutNavBarState, int, int, int, boolean, boolean, X.a5Q, com.bytedance.pipo.checkout.api.network.model.response.Methods, X.a33, java.util.List, java.lang.String, java.lang.Object, java.lang.String, java.lang.String, com.bytedance.pipo.checkout.api.network.model.response.CashierBasicInfoResponse, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
