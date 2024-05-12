package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1", f = "DragGestureDetector.kt", l = {238, 239, 244}, m = "invokeSuspend")
/* renamed from: X.2DE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2DE extends AbstractC65783Prn implements InterfaceC88471Ynr<InterfaceC37471dX, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<C10370av, C76800UCe> LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJLL;
    public final /* synthetic */ InterfaceC88471Ynr<C11P, C10370av, C76800UCe> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2DE(InterfaceC67352kd interfaceC67352kd, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88471Ynr interfaceC88471Ynr) {
        super(2, interfaceC67352kd);
        this.LJLJJI = interfaceC88472Yns;
        this.LJLJJL = interfaceC65784Pro;
        this.LJLJJLL = interfaceC65784Pro2;
        this.LJLJL = interfaceC88471Ynr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2DE c2de = new C2DE(interfaceC67352kd, this.LJLJJL, this.LJLJJLL, this.LJLJJI, this.LJLJL);
        c2de.LJLJI = obj;
        return c2de;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r3 = r8.LJLILLLLZI
            r1 = 0
            r6 = 3
            r2 = 2
            r0 = 1
            if (r3 == 0) goto L4b
            if (r3 == r0) goto L5f
            if (r3 == r2) goto L75
            if (r3 != r6) goto La8
            java.lang.Object r5 = r8.LJLJI
            X.1dX r5 = (X.InterfaceC37471dX) r5
            X.C141335gf.LIZJ(r9)
        L17:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r0 = r9.booleanValue()
            if (r0 == 0) goto La2
            X.11H r0 = r5.LJJJ()
            java.util.List<X.11P> r4 = r0.LIZ
            int r3 = r4.size()
            r2 = 0
        L2a:
            if (r2 >= r3) goto Lb0
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r2)
            X.11P r1 = (X.C11P) r1
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            boolean r0 = r1.LIZIZ()
            if (r0 != 0) goto L48
            boolean r0 = r1.LJI
            if (r0 == 0) goto L48
            boolean r0 = r1.LIZLLL
            if (r0 != 0) goto L48
            r1.LIZ()
        L48:
            int r2 = r2 + 1
            goto L2a
        L4b:
            X.C141335gf.LIZJ(r9)
            java.lang.Object r5 = r8.LJLJI
            X.1dX r5 = (X.InterfaceC37471dX) r5
            r8.LJLJI = r5
            r8.LJLILLLLZI = r0
            X.11I r0 = X.C11I.Main
            java.lang.Object r9 = X.C0UM.LIZIZ(r5, r0, r1, r8)
            if (r9 != r7) goto L66
            return r7
        L5f:
            java.lang.Object r5 = r8.LJLJI
            X.1dX r5 = (X.InterfaceC37471dX) r5
            X.C141335gf.LIZJ(r9)
        L66:
            X.11P r9 = (X.C11P) r9
            long r0 = r9.LIZ
            r8.LJLJI = r5
            r8.LJLILLLLZI = r2
            java.lang.Object r9 = X.C0US.LIZIZ(r5, r0, r8)
            if (r9 != r7) goto L7c
            return r7
        L75:
            java.lang.Object r5 = r8.LJLJI
            X.1dX r5 = (X.InterfaceC37471dX) r5
            X.C141335gf.LIZJ(r9)
        L7c:
            X.11P r9 = (X.C11P) r9
            if (r9 == 0) goto Lb5
            X.Yns<X.0av, X.UCe> r3 = r8.LJLJJI
            long r1 = r9.LIZJ
            X.0av r0 = new X.0av
            r0.<init>(r1)
            r3.invoke(r0)
            long r3 = r9.LIZ
            kotlin.jvm.internal.IDqS416S0100000 r2 = new kotlin.jvm.internal.IDqS416S0100000
            X.Ynr<X.11P, X.0av, X.UCe> r1 = r8.LJLJL
            r0 = 173(0xad, float:2.42E-43)
            r2.<init>(r1, r0)
            r8.LJLJI = r5
            r8.LJLILLLLZI = r6
            java.lang.Object r9 = X.C0US.LIZJ(r5, r3, r2, r8)
            if (r9 != r7) goto L17
            return r7
        La2:
            X.Pro<X.UCe> r0 = r8.LJLJJLL
            r0.invoke()
            goto Lb5
        La8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb0:
            X.Pro<X.UCe> r0 = r8.LJLJJL
            r0.invoke()
        Lb5:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2DE.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC37471dX interfaceC37471dX, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC37471dX, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
