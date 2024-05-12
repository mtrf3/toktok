package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5", f = "AndroidPopup.android.kt", l = {299}, m = "invokeSuspend")
/* renamed from: X.2Gg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55622Gg extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C36541c2 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55622Gg(C36541c2 c36541c2, InterfaceC67352kd<? super C55622Gg> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c36541c2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C55622Gg c55622Gg = new C55622Gg(this.LJLJI, interfaceC67352kd);
        c55622Gg.LJLILLLLZI = obj;
        return c55622Gg;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0010, code lost:
    
        if (r3.LJIIL() == r6) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLIL
            r5 = 1
            if (r0 == 0) goto L57
            if (r0 != r5) goto L62
            java.lang.Object r0 = r9.LJLILLLLZI
            X.2pa r0 = (X.InterfaceC70422pa) r0
            X.C141335gf.LIZJ(r10)
        L10:
            X.1c2 r8 = r9.LJLJI
            int[] r2 = r8.LLFF
            r7 = 0
            r4 = r2[r7]
            r3 = r2[r5]
            android.view.View r1 = r8.LJLLI
            r1.getLocationOnScreen(r2)
            int[] r2 = r8.LLFF
            r1 = r2[r7]
            if (r4 != r1) goto L28
            r1 = r2[r5]
            if (r3 == r1) goto L2b
        L28:
            r8.LJIIL()
        L2b:
            boolean r1 = X.C48841JEv.LJIILLIIL(r0)
            if (r1 == 0) goto L5f
            X.27M r4 = X.C27M.LJLIL
            r9.LJLILLLLZI = r0
            r9.LJLIL = r5
            X.MBA r2 = r9.getContext()
            X.19f r1 = X.InterfaceC39951hX.LIZIZ
            X.MBD r3 = r2.get(r1)
            X.1hX r3 = (X.InterfaceC39951hX) r3
            if (r3 != 0) goto L4c
            java.lang.Object r1 = X.C1JD.LJJJJI(r4, r9)
        L49:
            if (r1 != r6) goto L10
            return r6
        L4c:
            X.29W r2 = new X.29W
            r1 = 0
            r2.<init>(r4, r1)
            java.lang.Object r1 = r3.LJIIL()
            goto L49
        L57:
            X.C141335gf.LIZJ(r10)
            java.lang.Object r0 = r9.LJLILLLLZI
            X.2pa r0 = (X.InterfaceC70422pa) r0
            goto L2b
        L5f:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L62:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55622Gg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
