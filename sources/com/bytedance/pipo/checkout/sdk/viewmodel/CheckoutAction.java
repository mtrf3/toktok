package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.InterfaceC91773a01;
import X.InterfaceC91961a33;
import X.X1D;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import com.bytedance.pipo.checkout.api.network.model.request.PaymentElements;
import com.bytedance.pipo.checkout.api.network.model.request.PaymentMethod;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public abstract class CheckoutAction {
    public static final int $stable = 0;

    /* loaded from: classes20.dex */
    public static final class RetryCheckout extends CheckoutAction {
        public static final int $stable = 0;
        public static final RetryCheckout INSTANCE = new RetryCheckout();
    }

    public /* synthetic */ CheckoutAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* loaded from: classes20.dex */
    public static final class ChangeVisibility extends CheckoutAction {
        public static final int $stable = 0;
        public final boolean visibility;

        public static /* synthetic */ ChangeVisibility copy$default(ChangeVisibility changeVisibility, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = changeVisibility.visibility;
            }
            return changeVisibility.copy(z);
        }

        public final ChangeVisibility copy(boolean z) {
            return new ChangeVisibility(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeVisibility) && this.visibility == ((ChangeVisibility) obj).visibility;
        }

        public int hashCode() {
            boolean z = this.visibility;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ChangeVisibility(visibility=");
            LIZ.append(this.visibility);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public final boolean getVisibility() {
            return this.visibility;
        }

        public ChangeVisibility(boolean z) {
            this.visibility = z;
        }
    }

    /* loaded from: classes20.dex */
    public static final class ClosePage extends CheckoutAction {
        public static final int $stable = 8;
        public final Activity context;
        public final boolean isCancel;

        public static /* synthetic */ ClosePage copy$default(ClosePage closePage, Activity activity, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                activity = closePage.context;
            }
            if ((i & 2) != 0) {
                z = closePage.isCancel;
            }
            return closePage.copy(activity, z);
        }

        public final ClosePage copy(Activity context, boolean z) {
            o.LJIIIZ(context, "context");
            return new ClosePage(context, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClosePage)) {
                return false;
            }
            ClosePage closePage = (ClosePage) obj;
            return o.LJ(this.context, closePage.context) && this.isCancel == closePage.isCancel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.context.hashCode() * 31;
            boolean z = this.isCancel;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ClosePage(context=");
            LIZ.append(this.context);
            LIZ.append(", isCancel=");
            LIZ.append(this.isCancel);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public final Activity getContext() {
            return this.context;
        }

        public final boolean isCancel() {
            return this.isCancel;
        }

        public ClosePage(Activity context, boolean z) {
            o.LJIIIZ(context, "context");
            this.context = context;
            this.isCancel = z;
        }
    }

    /* loaded from: classes20.dex */
    public static final class ImeHandle extends CheckoutAction {
        public static final int $stable = 8;
        public final int newImeHeight;
        public final SharedPreferences.Editor spEditor;

        public static /* synthetic */ ImeHandle copy$default(ImeHandle imeHandle, int i, SharedPreferences.Editor editor, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = imeHandle.newImeHeight;
            }
            if ((i2 & 2) != 0) {
                editor = imeHandle.spEditor;
            }
            return imeHandle.copy(i, editor);
        }

        public final ImeHandle copy(int i, SharedPreferences.Editor spEditor) {
            o.LJIIIZ(spEditor, "spEditor");
            return new ImeHandle(i, spEditor);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImeHandle)) {
                return false;
            }
            ImeHandle imeHandle = (ImeHandle) obj;
            return this.newImeHeight == imeHandle.newImeHeight && o.LJ(this.spEditor, imeHandle.spEditor);
        }

        public int hashCode() {
            return (this.newImeHeight * 31) + this.spEditor.hashCode();
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ImeHandle(newImeHeight=");
            LIZ.append(this.newImeHeight);
            LIZ.append(", spEditor=");
            LIZ.append(this.spEditor);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public final int getNewImeHeight() {
            return this.newImeHeight;
        }

        public final SharedPreferences.Editor getSpEditor() {
            return this.spEditor;
        }

        public ImeHandle(int i, SharedPreferences.Editor spEditor) {
            o.LJIIIZ(spEditor, "spEditor");
            this.newImeHeight = i;
            this.spEditor = spEditor;
        }
    }

    /* loaded from: classes20.dex */
    public static final class ImeHeightInit extends CheckoutAction {
        public static final int $stable = 0;
        public final int imeHeight;

        public static /* synthetic */ ImeHeightInit copy$default(ImeHeightInit imeHeightInit, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = imeHeightInit.imeHeight;
            }
            return imeHeightInit.copy(i);
        }

        public final ImeHeightInit copy(int i) {
            return new ImeHeightInit(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ImeHeightInit) && this.imeHeight == ((ImeHeightInit) obj).imeHeight;
        }

        public int hashCode() {
            return this.imeHeight;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ImeHeightInit(imeHeight=");
            LIZ.append(this.imeHeight);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public final int getImeHeight() {
            return this.imeHeight;
        }

        public ImeHeightInit(int i) {
            this.imeHeight = i;
        }
    }

    /* loaded from: classes20.dex */
    public static final class MethodConfirm extends CheckoutAction {
        public static final int $stable = 8;
        public final InterfaceC91773a01 dialog;
        public final PaymentMethod methodInfo;
        public final InterfaceC88472Yns<String, C76800UCe> navigate;
        public final boolean storePayment;
        public final View view;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MethodConfirm copy$default(MethodConfirm methodConfirm, PaymentMethod paymentMethod, boolean z, View view, InterfaceC91773a01 interfaceC91773a01, InterfaceC88472Yns interfaceC88472Yns, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentMethod = methodConfirm.methodInfo;
            }
            if ((i & 2) != 0) {
                z = methodConfirm.storePayment;
            }
            if ((i & 4) != 0) {
                view = methodConfirm.view;
            }
            if ((i & 8) != 0) {
                interfaceC91773a01 = methodConfirm.dialog;
            }
            if ((i & 16) != 0) {
                interfaceC88472Yns = methodConfirm.navigate;
            }
            return methodConfirm.copy(paymentMethod, z, view, interfaceC91773a01, interfaceC88472Yns);
        }

        public final MethodConfirm copy(PaymentMethod methodInfo, boolean z, View view, InterfaceC91773a01 dialog, InterfaceC88472Yns<? super String, C76800UCe> navigate) {
            o.LJIIIZ(methodInfo, "methodInfo");
            o.LJIIIZ(view, "view");
            o.LJIIIZ(dialog, "dialog");
            o.LJIIIZ(navigate, "navigate");
            return new MethodConfirm(methodInfo, z, view, dialog, navigate);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodConfirm)) {
                return false;
            }
            MethodConfirm methodConfirm = (MethodConfirm) obj;
            return o.LJ(this.methodInfo, methodConfirm.methodInfo) && this.storePayment == methodConfirm.storePayment && o.LJ(this.view, methodConfirm.view) && o.LJ(this.dialog, methodConfirm.dialog) && o.LJ(this.navigate, methodConfirm.navigate);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.methodInfo.hashCode() * 31;
            boolean z = this.storePayment;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return ((((((hashCode + i) * 31) + this.view.hashCode()) * 31) + this.dialog.hashCode()) * 31) + this.navigate.hashCode();
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MethodConfirm(methodInfo=");
            LIZ.append(this.methodInfo);
            LIZ.append(", storePayment=");
            LIZ.append(this.storePayment);
            LIZ.append(", view=");
            LIZ.append(this.view);
            LIZ.append(", dialog=");
            LIZ.append(this.dialog);
            LIZ.append(", navigate=");
            LIZ.append(this.navigate);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public final InterfaceC91773a01 getDialog() {
            return this.dialog;
        }

        public final PaymentMethod getMethodInfo() {
            return this.methodInfo;
        }

        public final InterfaceC88472Yns<String, C76800UCe> getNavigate() {
            return this.navigate;
        }

        public final boolean getStorePayment() {
            return this.storePayment;
        }

        public final View getView() {
            return this.view;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MethodConfirm(PaymentMethod methodInfo, boolean z, View view, InterfaceC91773a01 dialog, InterfaceC88472Yns<? super String, C76800UCe> navigate) {
            o.LJIIIZ(methodInfo, "methodInfo");
            o.LJIIIZ(view, "view");
            o.LJIIIZ(dialog, "dialog");
            o.LJIIIZ(navigate, "navigate");
            this.methodInfo = methodInfo;
            this.storePayment = z;
            this.view = view;
            this.dialog = dialog;
            this.navigate = navigate;
        }

        public /* synthetic */ MethodConfirm(PaymentMethod paymentMethod, boolean z, View view, InterfaceC91773a01 interfaceC91773a01, InterfaceC88472Yns interfaceC88472Yns, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(paymentMethod, (i & 2) != 0 ? false : z, view, interfaceC91773a01, interfaceC88472Yns);
        }
    }

    /* loaded from: classes20.dex */
    public static final class SelectPI extends CheckoutAction {
        public static final int $stable = 8;
        public final Object assemblePIIcon;
        public final String assemblePITitle;
        public final InterfaceC91961a33 selectedMethod;

        public static /* synthetic */ SelectPI copy$default(SelectPI selectPI, InterfaceC91961a33 interfaceC91961a33, String str, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                interfaceC91961a33 = selectPI.selectedMethod;
            }
            if ((i & 2) != 0) {
                str = selectPI.assemblePITitle;
            }
            if ((i & 4) != 0) {
                obj = selectPI.assemblePIIcon;
            }
            return selectPI.copy(interfaceC91961a33, str, obj);
        }

        public final SelectPI copy(InterfaceC91961a33 selectedMethod, String assemblePITitle, Object obj) {
            o.LJIIIZ(selectedMethod, "selectedMethod");
            o.LJIIIZ(assemblePITitle, "assemblePITitle");
            return new SelectPI(selectedMethod, assemblePITitle, obj);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectPI)) {
                return false;
            }
            SelectPI selectPI = (SelectPI) obj;
            return o.LJ(this.selectedMethod, selectPI.selectedMethod) && o.LJ(this.assemblePITitle, selectPI.assemblePITitle) && o.LJ(this.assemblePIIcon, selectPI.assemblePIIcon);
        }

        public int hashCode() {
            int hashCode = ((this.selectedMethod.hashCode() * 31) + this.assemblePITitle.hashCode()) * 31;
            Object obj = this.assemblePIIcon;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SelectPI(selectedMethod=");
            LIZ.append(this.selectedMethod);
            LIZ.append(", assemblePITitle=");
            LIZ.append(this.assemblePITitle);
            LIZ.append(", assemblePIIcon=");
            LIZ.append(this.assemblePIIcon);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public final Object getAssemblePIIcon() {
            return this.assemblePIIcon;
        }

        public final String getAssemblePITitle() {
            return this.assemblePITitle;
        }

        public final InterfaceC91961a33 getSelectedMethod() {
            return this.selectedMethod;
        }

        public SelectPI(InterfaceC91961a33 selectedMethod, String assemblePITitle, Object obj) {
            o.LJIIIZ(selectedMethod, "selectedMethod");
            o.LJIIIZ(assemblePITitle, "assemblePITitle");
            this.selectedMethod = selectedMethod;
            this.assemblePITitle = assemblePITitle;
            this.assemblePIIcon = obj;
        }

        public /* synthetic */ SelectPI(InterfaceC91961a33 interfaceC91961a33, String str, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC91961a33, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : obj);
        }
    }

    /* loaded from: classes20.dex */
    public static final class StorePaymentMethod extends CheckoutAction {
        public static final int $stable = 8;
        public final InterfaceC91773a01 dialog;
        public final InterfaceC88472Yns<String, C76800UCe> navigate;
        public final PaymentMethod paymentMethod;
        public final View view;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StorePaymentMethod copy$default(StorePaymentMethod storePaymentMethod, PaymentMethod paymentMethod, View view, InterfaceC91773a01 interfaceC91773a01, InterfaceC88472Yns interfaceC88472Yns, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentMethod = storePaymentMethod.paymentMethod;
            }
            if ((i & 2) != 0) {
                view = storePaymentMethod.view;
            }
            if ((i & 4) != 0) {
                interfaceC91773a01 = storePaymentMethod.dialog;
            }
            if ((i & 8) != 0) {
                interfaceC88472Yns = storePaymentMethod.navigate;
            }
            return storePaymentMethod.copy(paymentMethod, view, interfaceC91773a01, interfaceC88472Yns);
        }

        public final StorePaymentMethod copy(PaymentMethod paymentMethod, View view, InterfaceC91773a01 dialog, InterfaceC88472Yns<? super String, C76800UCe> navigate) {
            o.LJIIIZ(paymentMethod, "paymentMethod");
            o.LJIIIZ(view, "view");
            o.LJIIIZ(dialog, "dialog");
            o.LJIIIZ(navigate, "navigate");
            return new StorePaymentMethod(paymentMethod, view, dialog, navigate);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StorePaymentMethod)) {
                return false;
            }
            StorePaymentMethod storePaymentMethod = (StorePaymentMethod) obj;
            return o.LJ(this.paymentMethod, storePaymentMethod.paymentMethod) && o.LJ(this.view, storePaymentMethod.view) && o.LJ(this.dialog, storePaymentMethod.dialog) && o.LJ(this.navigate, storePaymentMethod.navigate);
        }

        public int hashCode() {
            return (((((this.paymentMethod.hashCode() * 31) + this.view.hashCode()) * 31) + this.dialog.hashCode()) * 31) + this.navigate.hashCode();
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("StorePaymentMethod(paymentMethod=");
            LIZ.append(this.paymentMethod);
            LIZ.append(", view=");
            LIZ.append(this.view);
            LIZ.append(", dialog=");
            LIZ.append(this.dialog);
            LIZ.append(", navigate=");
            LIZ.append(this.navigate);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public final InterfaceC91773a01 getDialog() {
            return this.dialog;
        }

        public final InterfaceC88472Yns<String, C76800UCe> getNavigate() {
            return this.navigate;
        }

        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final View getView() {
            return this.view;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public StorePaymentMethod(PaymentMethod paymentMethod, View view, InterfaceC91773a01 dialog, InterfaceC88472Yns<? super String, C76800UCe> navigate) {
            o.LJIIIZ(paymentMethod, "paymentMethod");
            o.LJIIIZ(view, "view");
            o.LJIIIZ(dialog, "dialog");
            o.LJIIIZ(navigate, "navigate");
            this.paymentMethod = paymentMethod;
            this.view = view;
            this.dialog = dialog;
            this.navigate = navigate;
        }
    }

    /* loaded from: classes20.dex */
    public static final class StoredMethodConfirm extends CheckoutAction {
        public static final int $stable = 8;
        public final InterfaceC91773a01 dialog;
        public final InterfaceC88472Yns<String, C76800UCe> navigate;
        public final List<PaymentElements> paymentElements;
        public final View view;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StoredMethodConfirm copy$default(StoredMethodConfirm storedMethodConfirm, List list, View view, InterfaceC91773a01 interfaceC91773a01, InterfaceC88472Yns interfaceC88472Yns, int i, Object obj) {
            if ((i & 1) != 0) {
                list = storedMethodConfirm.paymentElements;
            }
            if ((i & 2) != 0) {
                view = storedMethodConfirm.view;
            }
            if ((i & 4) != 0) {
                interfaceC91773a01 = storedMethodConfirm.dialog;
            }
            if ((i & 8) != 0) {
                interfaceC88472Yns = storedMethodConfirm.navigate;
            }
            return storedMethodConfirm.copy(list, view, interfaceC91773a01, interfaceC88472Yns);
        }

        public final StoredMethodConfirm copy(List<PaymentElements> paymentElements, View view, InterfaceC91773a01 dialog, InterfaceC88472Yns<? super String, C76800UCe> navigate) {
            o.LJIIIZ(paymentElements, "paymentElements");
            o.LJIIIZ(view, "view");
            o.LJIIIZ(dialog, "dialog");
            o.LJIIIZ(navigate, "navigate");
            return new StoredMethodConfirm(paymentElements, view, dialog, navigate);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StoredMethodConfirm)) {
                return false;
            }
            StoredMethodConfirm storedMethodConfirm = (StoredMethodConfirm) obj;
            return o.LJ(this.paymentElements, storedMethodConfirm.paymentElements) && o.LJ(this.view, storedMethodConfirm.view) && o.LJ(this.dialog, storedMethodConfirm.dialog) && o.LJ(this.navigate, storedMethodConfirm.navigate);
        }

        public int hashCode() {
            return (((((this.paymentElements.hashCode() * 31) + this.view.hashCode()) * 31) + this.dialog.hashCode()) * 31) + this.navigate.hashCode();
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("StoredMethodConfirm(paymentElements=");
            LIZ.append(this.paymentElements);
            LIZ.append(", view=");
            LIZ.append(this.view);
            LIZ.append(", dialog=");
            LIZ.append(this.dialog);
            LIZ.append(", navigate=");
            LIZ.append(this.navigate);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public final InterfaceC91773a01 getDialog() {
            return this.dialog;
        }

        public final InterfaceC88472Yns<String, C76800UCe> getNavigate() {
            return this.navigate;
        }

        public final List<PaymentElements> getPaymentElements() {
            return this.paymentElements;
        }

        public final View getView() {
            return this.view;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public StoredMethodConfirm(List<PaymentElements> paymentElements, View view, InterfaceC91773a01 dialog, InterfaceC88472Yns<? super String, C76800UCe> navigate) {
            o.LJIIIZ(paymentElements, "paymentElements");
            o.LJIIIZ(view, "view");
            o.LJIIIZ(dialog, "dialog");
            o.LJIIIZ(navigate, "navigate");
            this.paymentElements = paymentElements;
            this.view = view;
            this.dialog = dialog;
            this.navigate = navigate;
        }
    }

    /* loaded from: classes20.dex */
    public static final class SystemBarHeightInit extends CheckoutAction {
        public static final int $stable = 0;
        public final int bottom;
        public final int top;

        public static /* synthetic */ SystemBarHeightInit copy$default(SystemBarHeightInit systemBarHeightInit, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = systemBarHeightInit.top;
            }
            if ((i3 & 2) != 0) {
                i2 = systemBarHeightInit.bottom;
            }
            return systemBarHeightInit.copy(i, i2);
        }

        public final SystemBarHeightInit copy(int i, int i2) {
            return new SystemBarHeightInit(i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SystemBarHeightInit)) {
                return false;
            }
            SystemBarHeightInit systemBarHeightInit = (SystemBarHeightInit) obj;
            return this.top == systemBarHeightInit.top && this.bottom == systemBarHeightInit.bottom;
        }

        public int hashCode() {
            return (this.top * 31) + this.bottom;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SystemBarHeightInit(top=");
            LIZ.append(this.top);
            LIZ.append(", bottom=");
            LIZ.append(this.bottom);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getTop() {
            return this.top;
        }

        public SystemBarHeightInit(int i, int i2) {
            this.top = i;
            this.bottom = i2;
        }
    }

    public CheckoutAction() {
    }
}
