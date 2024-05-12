package com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze;

import X.InterfaceC91769Zzx;
import X.InterfaceC91773a01;
import X.InterfaceC91774a02;
import X.InterfaceC91775a03;
import X.InterfaceC91776a04;
import X.InterfaceC91777a05;
import X.InterfaceC91778a06;
import X.InterfaceC91779a07;
import X.InterfaceC91780a08;

/* loaded from: classes20.dex */
public interface IComponentProvider extends Comparable<IComponentProvider> {
    /* JADX WARN: Can't rename method to resolve collision */
    int compareTo(IComponentProvider iComponentProvider);

    @Override // java.lang.Comparable
    /* bridge */ /* synthetic */ int compareTo(IComponentProvider iComponentProvider);

    InterfaceC91769Zzx getButton();

    InterfaceC91773a01 getDialog();

    InterfaceC91774a02 getEditText();

    InterfaceC91776a04 getForm();

    InterfaceC91775a03 getFormPrefix();

    InterfaceC91777a05 getLoading();

    int getPriority();

    InterfaceC91778a06 getStateView();

    InterfaceC91779a07 getTextCell();

    InterfaceC91780a08 getToast();
}
