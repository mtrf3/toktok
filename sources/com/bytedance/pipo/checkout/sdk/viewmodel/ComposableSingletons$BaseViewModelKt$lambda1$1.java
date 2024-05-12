package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.InterfaceC24520xk;
import X.InterfaceC88471Ynr;

/* renamed from: com.bytedance.pipo.checkout.sdk.viewmodel.ComposableSingletons$BaseViewModelKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes20.dex */
public final class ComposableSingletons$BaseViewModelKt$lambda1$1 extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public static final ComposableSingletons$BaseViewModelKt$lambda1$1 INSTANCE = new ComposableSingletons$BaseViewModelKt$lambda1$1();

    public ComposableSingletons$BaseViewModelKt$lambda1$1() {
        super(2);
    }

    public final void invoke(InterfaceC24520xk interfaceC24520xk, int i) {
        if (((i & 11) ^ 2) != 0 || !interfaceC24520xk.LIZ()) {
            return;
        }
        interfaceC24520xk.LIZLLL();
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        invoke(interfaceC24520xk, num.intValue());
        return C76800UCe.LIZ;
    }
}
