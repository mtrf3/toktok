package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.AbstractC65782Prm;
import X.C76800UCe;
import X.InterfaceC65848Psq;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC88471Ynr;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel$initMethod$1", f = "PIViewModel.kt", l = {180, 185}, m = "invokeSuspend")
/* loaded from: classes20.dex */
public final class PIViewModel$initMethod$1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int label;
    public final /* synthetic */ PIViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PIViewModel$initMethod$1(PIViewModel pIViewModel, InterfaceC67352kd<? super PIViewModel$initMethod$1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.this$0 = pIViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new PIViewModel$initMethod$1(this.this$0, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0069 A[Catch: all -> 0x00b4, TryCatch #0 {all -> 0x00b4, blocks: (B:9:0x0043, B:10:0x0046, B:12:0x004e, B:15:0x0059, B:17:0x0069, B:21:0x0027, B:22:0x002a, B:26:0x0036, B:29:0x0090, B:32:0x001c), top: B:2:0x000a }] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel$initMethod$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
