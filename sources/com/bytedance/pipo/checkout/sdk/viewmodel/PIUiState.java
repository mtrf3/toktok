package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.C61878OQg;
import X.C91969a3B;
import X.C92054a4Y;
import X.C92204a6y;
import X.C92232a7Q;
import X.EnumC91967a39;
import X.InterfaceC91961a33;
import X.ORZ;
import com.bytedance.pipo.checkout.api.network.model.response.BankCardRules;
import com.bytedance.pipo.checkout.api.network.model.response.MethodExtra;
import com.bytedance.pipo.checkout.api.network.model.response.Methods;
import com.bytedance.pipo.checkout.api.network.model.response.PIBasicInfoResponse;
import com.bytedance.pipo.checkout.api.network.model.response.StoredMethods;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PIUiState {
    public static final int $stable = 8;
    public final C92204a6y bizData;
    public final boolean closeBindSheet;
    public final boolean contentVisibility;
    public final StoredMethods currentMethod;
    public final String errorCode;
    public final boolean hasPrimary;
    public final int imeHeight;
    public final boolean isBindLoading;
    public final boolean isContentError;
    public final boolean isFullScreen;
    public final boolean isImeOpen;
    public final boolean isLoading;
    public final int navigationBarHeight;
    public final PIBasicInfoResponse piResponse;
    public final InterfaceC91961a33 selectedMethod;
    public final int statusBarHeight;
    public final String webViewTitle;

    public PIUiState() {
        this(false, false, null, false, 0, 0, 0, false, null, null, false, false, null, false, null, 32767, null);
    }

    private final PIBasicInfoResponse component15() {
        return this.piResponse;
    }

    public static /* synthetic */ PIUiState copy$default(PIUiState pIUiState, boolean z, boolean z2, StoredMethods storedMethods, boolean z3, int i, int i2, int i3, boolean z4, String str, String str2, boolean z5, boolean z6, InterfaceC91961a33 interfaceC91961a33, boolean z7, PIBasicInfoResponse pIBasicInfoResponse, int i4, Object obj) {
        boolean z8 = z2;
        boolean z9 = z;
        boolean z10 = z3;
        StoredMethods storedMethods2 = storedMethods;
        int i5 = i2;
        int i6 = i;
        boolean z11 = z4;
        int i7 = i3;
        String str3 = str2;
        String str4 = str;
        boolean z12 = z6;
        boolean z13 = z5;
        boolean z14 = z7;
        InterfaceC91961a33 interfaceC91961a332 = interfaceC91961a33;
        PIBasicInfoResponse pIBasicInfoResponse2 = pIBasicInfoResponse;
        if ((i4 & 1) != 0) {
            z9 = pIUiState.isLoading;
        }
        if ((i4 & 2) != 0) {
            z8 = pIUiState.isContentError;
        }
        if ((i4 & 4) != 0) {
            storedMethods2 = pIUiState.currentMethod;
        }
        if ((i4 & 8) != 0) {
            z10 = pIUiState.isBindLoading;
        }
        if ((i4 & 16) != 0) {
            i6 = pIUiState.statusBarHeight;
        }
        if ((i4 & 32) != 0) {
            i5 = pIUiState.navigationBarHeight;
        }
        if ((i4 & 64) != 0) {
            i7 = pIUiState.imeHeight;
        }
        if ((i4 & 128) != 0) {
            z11 = pIUiState.isImeOpen;
        }
        if ((i4 & 256) != 0) {
            str4 = pIUiState.webViewTitle;
        }
        if ((i4 & 512) != 0) {
            str3 = pIUiState.errorCode;
        }
        if ((i4 & 1024) != 0) {
            z13 = pIUiState.isFullScreen;
        }
        if ((i4 & 2048) != 0) {
            z12 = pIUiState.contentVisibility;
        }
        if ((i4 & 4096) != 0) {
            interfaceC91961a332 = pIUiState.selectedMethod;
        }
        if ((i4 & FileUtils.BUFFER_SIZE) != 0) {
            z14 = pIUiState.closeBindSheet;
        }
        if ((i4 & 16384) != 0) {
            pIBasicInfoResponse2 = pIUiState.piResponse;
        }
        return pIUiState.copy(z9, z8, storedMethods2, z10, i6, i5, i7, z11, str4, str3, z13, z12, interfaceC91961a332, z14, pIBasicInfoResponse2);
    }

    public final PIUiState copy(boolean z, boolean z2, StoredMethods currentMethod, boolean z3, int i, int i2, int i3, boolean z4, String webViewTitle, String str, boolean z5, boolean z6, InterfaceC91961a33 selectedMethod, boolean z7, PIBasicInfoResponse piResponse) {
        o.LJIIIZ(currentMethod, "currentMethod");
        o.LJIIIZ(webViewTitle, "webViewTitle");
        o.LJIIIZ(selectedMethod, "selectedMethod");
        o.LJIIIZ(piResponse, "piResponse");
        return new PIUiState(z, z2, currentMethod, z3, i, i2, i3, z4, webViewTitle, str, z5, z6, selectedMethod, z7, piResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PIUiState)) {
            return false;
        }
        PIUiState pIUiState = (PIUiState) obj;
        return this.isLoading == pIUiState.isLoading && this.isContentError == pIUiState.isContentError && o.LJ(this.currentMethod, pIUiState.currentMethod) && this.isBindLoading == pIUiState.isBindLoading && this.statusBarHeight == pIUiState.statusBarHeight && this.navigationBarHeight == pIUiState.navigationBarHeight && this.imeHeight == pIUiState.imeHeight && this.isImeOpen == pIUiState.isImeOpen && o.LJ(this.webViewTitle, pIUiState.webViewTitle) && o.LJ(this.errorCode, pIUiState.errorCode) && this.isFullScreen == pIUiState.isFullScreen && this.contentVisibility == pIUiState.contentVisibility && o.LJ(this.selectedMethod, pIUiState.selectedMethod) && this.closeBindSheet == pIUiState.closeBindSheet && o.LJ(this.piResponse, pIUiState.piResponse);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
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
        int hashCode = (((i + i2) * 31) + this.currentMethod.hashCode()) * 31;
        ?? r03 = this.isBindLoading;
        int i3 = r03;
        if (r03 != 0) {
            i3 = 1;
        }
        int i4 = (((((((hashCode + i3) * 31) + this.statusBarHeight) * 31) + this.navigationBarHeight) * 31) + this.imeHeight) * 31;
        ?? r04 = this.isImeOpen;
        int i5 = r04;
        if (r04 != 0) {
            i5 = 1;
        }
        int hashCode2 = (((i4 + i5) * 31) + this.webViewTitle.hashCode()) * 31;
        String str = this.errorCode;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ?? r05 = this.isFullScreen;
        int i6 = r05;
        if (r05 != 0) {
            i6 = 1;
        }
        int i7 = (hashCode3 + i6) * 31;
        ?? r06 = this.contentVisibility;
        int i8 = r06;
        if (r06 != 0) {
            i8 = 1;
        }
        return ((((((i7 + i8) * 31) + this.selectedMethod.hashCode()) * 31) + (this.closeBindSheet ? 1 : 0)) * 31) + this.piResponse.hashCode();
    }

    public String toString() {
        return "PIUiState(isLoading=" + this.isLoading + ", isContentError=" + this.isContentError + ", currentMethod=" + this.currentMethod + ", isBindLoading=" + this.isBindLoading + ", statusBarHeight=" + this.statusBarHeight + ", navigationBarHeight=" + this.navigationBarHeight + ", imeHeight=" + this.imeHeight + ", isImeOpen=" + this.isImeOpen + ", webViewTitle=" + this.webViewTitle + ", errorCode=" + ((Object) this.errorCode) + ", isFullScreen=" + this.isFullScreen + ", contentVisibility=" + this.contentVisibility + ", selectedMethod=" + this.selectedMethod + ", closeBindSheet=" + this.closeBindSheet + ", piResponse=" + this.piResponse + ')';
    }

    public final C92204a6y getBizData() {
        return this.bizData;
    }

    public final boolean getCloseBindSheet() {
        return this.closeBindSheet;
    }

    public final boolean getContentVisibility() {
        return this.contentVisibility;
    }

    public final StoredMethods getCurrentMethod() {
        return this.currentMethod;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final boolean getHasPrimary() {
        return this.hasPrimary;
    }

    public final int getImeHeight() {
        return this.imeHeight;
    }

    public final int getNavigationBarHeight() {
        return this.navigationBarHeight;
    }

    public final InterfaceC91961a33 getSelectedMethod() {
        return this.selectedMethod;
    }

    public final int getStatusBarHeight() {
        return this.statusBarHeight;
    }

    public final String getWebViewTitle() {
        return this.webViewTitle;
    }

    public final boolean isBindLoading() {
        return this.isBindLoading;
    }

    public final boolean isContentError() {
        return this.isContentError;
    }

    public final boolean isFullScreen() {
        return this.isFullScreen;
    }

    public final boolean isImeOpen() {
        return this.isImeOpen;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.OQg] */
    public PIUiState(boolean z, boolean z2, StoredMethods currentMethod, boolean z3, int i, int i2, int i3, boolean z4, String webViewTitle, String str, boolean z5, boolean z6, InterfaceC91961a33 selectedMethod, boolean z7, PIBasicInfoResponse piResponse) {
        ?? arrayList;
        boolean z8;
        o.LJIIIZ(currentMethod, "currentMethod");
        o.LJIIIZ(webViewTitle, "webViewTitle");
        o.LJIIIZ(selectedMethod, "selectedMethod");
        o.LJIIIZ(piResponse, "piResponse");
        this.isLoading = z;
        this.isContentError = z2;
        this.currentMethod = currentMethod;
        this.isBindLoading = z3;
        this.statusBarHeight = i;
        this.navigationBarHeight = i2;
        this.imeHeight = i3;
        this.isImeOpen = z4;
        this.webViewTitle = webViewTitle;
        this.errorCode = str;
        this.isFullScreen = z5;
        this.contentVisibility = z6;
        this.selectedMethod = selectedMethod;
        this.closeBindSheet = z7;
        this.piResponse = piResponse;
        List<Methods> methods = piResponse.getMethods();
        if (methods == null) {
            arrayList = C61878OQg.INSTANCE;
        } else {
            arrayList = new ArrayList();
            for (Methods methods2 : methods) {
                if (o.LJ(methods2.getPaymentMethodType(), EnumC91967a39.CCDC.getValue())) {
                    arrayList.add(methods2);
                }
            }
        }
        List<StoredMethods> LJIILJJIL = C91969a3B.LJIILJJIL(this.piResponse.getStoredMethods());
        List<BankCardRules> bankCardRules = this.piResponse.getBankCardRules();
        bankCardRules = bankCardRules == null ? C61878OQg.INSTANCE : bankCardRules;
        MethodExtra methodExtra = this.piResponse.getMethodExtra();
        this.bizData = new C92204a6y(LJIILJJIL, arrayList, bankCardRules, methodExtra == null ? new MethodExtra(null, null, 3, null) : methodExtra, C91969a3B.LJIIIZ(this.piResponse.getMethods(), null), null, C91969a3B.LJIILJJIL(this.piResponse.getUnavailableStoredMethods()), 32);
        List<StoredMethods> storedMethods = this.piResponse.getStoredMethods();
        storedMethods = storedMethods == null ? C61878OQg.INSTANCE : storedMethods;
        List<StoredMethods> unavailableStoredMethods = this.piResponse.getUnavailableStoredMethods();
        Iterator it = ((ArrayList) ORZ.LLIIIZ(unavailableStoredMethods == null ? C61878OQg.INSTANCE : unavailableStoredMethods, storedMethods)).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (o.LJ(Boolean.TRUE, ((StoredMethods) next).isPrimary())) {
                if (next != null) {
                    z8 = true;
                }
            }
        }
        z8 = false;
        this.hasPrimary = z8;
    }

    public /* synthetic */ PIUiState(boolean z, boolean z2, StoredMethods storedMethods, boolean z3, int i, int i2, int i3, boolean z4, String str, String str2, boolean z5, boolean z6, InterfaceC91961a33 interfaceC91961a33, boolean z7, PIBasicInfoResponse pIBasicInfoResponse, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? true : z, (i4 & 2) != 0 ? true : z2, (i4 & 4) != 0 ? new StoredMethods(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 7, null) : storedMethods, (i4 & 8) != 0 ? false : z3, (i4 & 16) != 0 ? 0 : i, (i4 & 32) != 0 ? 0 : i2, (i4 & 64) != 0 ? 0 : i3, (i4 & 128) != 0 ? false : z4, (i4 & 256) != 0 ? C92054a4Y.LIZ("pipo_common_waiting_while_loading_short", new String[0]) : str, (i4 & 512) != 0 ? null : str2, (i4 & 1024) != 0 ? false : z5, (i4 & 2048) == 0 ? z6 : true, (i4 & 4096) != 0 ? C92232a7Q.LJLIL : interfaceC91961a33, (i4 & FileUtils.BUFFER_SIZE) == 0 ? z7 : false, (i4 & 16384) != 0 ? new PIBasicInfoResponse(null, null, null, null, null, null, null, null, null, 511, null) : pIBasicInfoResponse);
    }
}
