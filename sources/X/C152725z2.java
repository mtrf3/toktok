package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.aicaption.AICaptionComponent$startGenerateAICaption$2", f = "AICaptionComponent.kt", l = {300, 304, 322}, m = "invokeSuspend")
/* renamed from: X.5z2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152725z2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C152695yz LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C152695yz LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C152725z2(C152695yz c152695yz, InterfaceC67352kd<? super C152725z2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = c152695yz;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C152725z2 c152725z2 = new C152725z2(this.LJLJJI, interfaceC67352kd);
        c152725z2.LJLJI = obj;
        return c152725z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0078 A[LOOP:0: B:21:0x0072->B:23:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLILLLLZI
            r3 = 3
            r6 = 2
            r1 = 1
            if (r0 == 0) goto L1a
            if (r0 == r1) goto L32
            if (r0 == r6) goto L4e
            if (r0 != r3) goto Lbf
            X.C141335gf.LIZJ(r8)
        L12:
            X.5yz r0 = r7.LJLJJI
            r0.LLJZIJLIL()
        L17:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L1a:
            X.C141335gf.LIZJ(r8)
            java.lang.Object r5 = r7.LJLJI
            X.2pa r5 = (X.InterfaceC70422pa) r5
            X.5yz r0 = r7.LJLJJI
            X.2mE r0 = r0.LLJJJIL()
            r7.LJLJI = r5
            r7.LJLILLLLZI = r1
            java.lang.Object r8 = r0.LJI(r7)
            if (r8 != r2) goto L39
            return r2
        L32:
            java.lang.Object r5 = r7.LJLJI
            X.2pa r5 = (X.InterfaceC70422pa) r5
            X.C141335gf.LIZJ(r8)
        L39:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L8d
            X.5yz r4 = r7.LJLJJI
            com.ss.android.ugc.aweme.nows.api.AICaptionNetworkModule r0 = r4.LJZ
            r7.LJLJI = r5
            r7.LJLIL = r4
            r7.LJLILLLLZI = r6
            java.lang.Object r8 = r0.LIZ(r8, r7)
            if (r8 != r2) goto L57
            return r2
        L4e:
            X.5yz r4 = r7.LJLIL
            java.lang.Object r5 = r7.LJLJI
            X.2pa r5 = (X.InterfaceC70422pa) r5
            X.C141335gf.LIZJ(r8)
        L57:
            com.ss.android.ugc.aweme.nows.api.AICaptionNetworkModule$AICaptionResponse r8 = (com.ss.android.ugc.aweme.nows.api.AICaptionNetworkModule.AICaptionResponse) r8
            if (r8 == 0) goto L8d
            int r0 = r8.statusCode
            if (r0 != 0) goto L8d
            java.util.List<java.lang.String> r1 = r8.textList
            if (r1 == 0) goto L8d
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L72:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lc7
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toUpperCase(r0)
            java.lang.String r0 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r3.add(r1)
            goto L72
        L8d:
            boolean r0 = X.C48841JEv.LJIILLIIL(r5)
            if (r0 == 0) goto Lb8
            X.5yz r0 = r7.LJLJJI
            java.lang.Object r0 = r0.LJJLJ()
            X.5z7 r0 = (X.C152775z7) r0
            X.5zD r1 = r0.LJLIL
            X.5zD r0 = X.EnumC152835zD.LOADING
            if (r1 != r0) goto La8
            X.5yz r1 = r7.LJLJJI
            X.5z4 r0 = X.C152745z4.LJLIL
            r1.LJJZZI(r0)
        La8:
            r0 = 0
            r7.LJLJI = r0
            r7.LJLIL = r0
            r7.LJLILLLLZI = r3
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r7)
            if (r0 != r2) goto L12
            return r2
        Lb8:
            X.5yz r0 = r7.LJLJJI
            r0.LLJZIJLIL()
            goto L17
        Lbf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lc7:
            r4.LJZL = r3
            r4.LLJJL()
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C152725z2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
