package com.bytedance.pipo.checkout.pux.compose;

import X.C91772a00;
import X.C92246a7e;
import X.C92251a7j;
import X.C92275a87;
import X.C92276a88;
import X.C92277a89;
import X.C92282a8E;
import X.C92286a8I;
import X.C92309a8f;
import X.C92318a8o;
import X.InterfaceC91769Zzx;
import X.InterfaceC91773a01;
import X.InterfaceC91774a02;
import X.InterfaceC91775a03;
import X.InterfaceC91776a04;
import X.InterfaceC91777a05;
import X.InterfaceC91778a06;
import X.InterfaceC91779a07;
import X.InterfaceC91780a08;
import com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider;

/* loaded from: classes20.dex */
public class PuxComponentProvider implements IComponentProvider {
    public static final int $stable = 8;
    public final int priority = 1;
    public final InterfaceC91774a02 editText = new C92275a87();
    public final InterfaceC91776a04 form = new C92276a88();
    public final InterfaceC91775a03 formPrefix = new C92277a89();
    public final InterfaceC91777a05 loading = new C92286a8I();
    public final InterfaceC91769Zzx button = new C92246a7e();
    public final InterfaceC91779a07 textCell = new C92282a8E();
    public final InterfaceC91773a01 dialog = new C92251a7j();
    public final InterfaceC91780a08 toast = new C92318a8o();
    public final InterfaceC91778a06 stateView = new C92309a8f();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public final /* synthetic */ int compareTo(IComponentProvider iComponentProvider) {
        return C91772a00.LIZ(this, iComponentProvider);
    }

    @Override // com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(IComponentProvider iComponentProvider) {
        int compareTo;
        compareTo = compareTo((IComponentProvider) iComponentProvider);
        return compareTo;
    }

    @Override // com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public InterfaceC91769Zzx getButton() {
        return this.button;
    }

    @Override // com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public InterfaceC91773a01 getDialog() {
        return this.dialog;
    }

    @Override // com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public InterfaceC91774a02 getEditText() {
        return this.editText;
    }

    @Override // com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public InterfaceC91776a04 getForm() {
        return this.form;
    }

    @Override // com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public InterfaceC91775a03 getFormPrefix() {
        return this.formPrefix;
    }

    @Override // com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public InterfaceC91777a05 getLoading() {
        return this.loading;
    }

    @Override // com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public int getPriority() {
        return this.priority;
    }

    @Override // com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public InterfaceC91778a06 getStateView() {
        return this.stateView;
    }

    @Override // com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public InterfaceC91779a07 getTextCell() {
        return this.textCell;
    }

    @Override // com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public InterfaceC91780a08 getToast() {
        return this.toast;
    }
}
