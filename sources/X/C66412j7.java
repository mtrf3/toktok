package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.prop.mobileefffect.MobileEffectUtilKt$updateEffectNameImage$2$iconFileKey$sizeAdjustDefer$1", f = "MobileEffectUtil.kt", l = {224, 227}, m = "invokeSuspend")
/* renamed from: X.2j7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66412j7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66412j7(String str, InterfaceC67352kd<? super C66412j7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C66412j7(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (((java.lang.Boolean) r6).booleanValue() == false) goto L20;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLIL
            r1 = 2
            r3 = 1
            if (r0 == 0) goto L1c
            if (r0 == r3) goto L2a
            if (r0 != r1) goto L41
            X.C141335gf.LIZJ(r6)
        Lf:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r0 = r6.booleanValue()
            if (r0 == 0) goto L3f
        L17:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L1c:
            X.C141335gf.LIZJ(r6)
            java.lang.String r0 = r5.LJLILLLLZI
            r5.LJLIL = r3
            java.lang.Object r6 = X.C66432j9.LIZ(r0, r5)
            if (r6 != r4) goto L2d
            return r4
        L2a:
            X.C141335gf.LIZJ(r6)
        L2d:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            if (r6 == 0) goto L3f
            java.lang.String r2 = r5.LJLILLLLZI
            r5.LJLIL = r1
            r1 = 0
            r0 = 252(0xfc, float:3.53E-43)
            java.lang.Object r6 = X.C66432j9.LIZIZ(r6, r2, r1, r5, r0)
            if (r6 != r4) goto Lf
            return r4
        L3f:
            r3 = 0
            goto L17
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66412j7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
