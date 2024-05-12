package com.bytedance.pipo.checkout.solution.component.tux;

import X.C92241a7Z;
import X.C92245a7d;
import X.C92256a7o;
import X.C92257a7p;
import X.C92258a7q;
import X.C92261a7t;
import X.C92265a7x;
import X.C92278a8A;
import X.C92281a8D;
import X.InterfaceC91769Zzx;
import X.InterfaceC91773a01;
import X.InterfaceC91774a02;
import X.InterfaceC91775a03;
import X.InterfaceC91776a04;
import X.InterfaceC91777a05;
import X.InterfaceC91778a06;
import X.InterfaceC91779a07;
import X.InterfaceC91780a08;
import com.bytedance.pipo.checkout.pux.compose.PuxComponentProvider;

/* loaded from: classes20.dex */
public final class TuxComponentProvider extends PuxComponentProvider {
    public static final int $stable = 8;
    public final int priority = 2;
    public final InterfaceC91774a02 editText = new C92256a7o();
    public final InterfaceC91776a04 form = new C92257a7p();
    public final InterfaceC91775a03 formPrefix = new C92258a7q();
    public final InterfaceC91777a05 loading = new C92265a7x();
    public final InterfaceC91769Zzx button = new C92241a7Z();
    public final InterfaceC91779a07 textCell = new C92261a7t();
    public final InterfaceC91773a01 dialog = new C92245a7d();
    public final InterfaceC91780a08 toast = new C92281a8D();
    public final InterfaceC91778a06 stateView = new C92278a8A();

    @Override // com.bytedance.pipo.checkout.pux.compose.PuxComponentProvider, com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public InterfaceC91769Zzx getButton() {
        return this.button;
    }

    @Override // com.bytedance.pipo.checkout.pux.compose.PuxComponentProvider, com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public InterfaceC91773a01 getDialog() {
        return this.dialog;
    }

    @Override // com.bytedance.pipo.checkout.pux.compose.PuxComponentProvider, com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public InterfaceC91774a02 getEditText() {
        return this.editText;
    }

    @Override // com.bytedance.pipo.checkout.pux.compose.PuxComponentProvider, com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public InterfaceC91776a04 getForm() {
        return this.form;
    }

    @Override // com.bytedance.pipo.checkout.pux.compose.PuxComponentProvider, com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public InterfaceC91775a03 getFormPrefix() {
        return this.formPrefix;
    }

    @Override // com.bytedance.pipo.checkout.pux.compose.PuxComponentProvider, com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public InterfaceC91777a05 getLoading() {
        return this.loading;
    }

    @Override // com.bytedance.pipo.checkout.pux.compose.PuxComponentProvider, com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public int getPriority() {
        return this.priority;
    }

    @Override // com.bytedance.pipo.checkout.pux.compose.PuxComponentProvider, com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public InterfaceC91778a06 getStateView() {
        return this.stateView;
    }

    @Override // com.bytedance.pipo.checkout.pux.compose.PuxComponentProvider, com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public InterfaceC91779a07 getTextCell() {
        return this.textCell;
    }

    @Override // com.bytedance.pipo.checkout.pux.compose.PuxComponentProvider, com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public InterfaceC91780a08 getToast() {
        return this.toast;
    }
}
