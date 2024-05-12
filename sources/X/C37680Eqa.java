package X;

import fjb.a;

@InterfaceC65848Psq(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", l = {276, 284, 288}, m = "invokeSuspend")
/* renamed from: X.Eqa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37680Eqa extends AbstractC65783Prn implements InterfaceC88471Ynr<AbstractC37657EqD<? super String>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ OJD LJLJJLL;
    public final /* synthetic */ CharSequence LJLJL;
    public final /* synthetic */ int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37680Eqa(OJD ojd, CharSequence charSequence, int i, InterfaceC67352kd<? super C37680Eqa> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJLL = ojd;
        this.LJLJL = charSequence;
        this.LJLJLJ = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C37680Eqa c37680Eqa = new C37680Eqa(this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
        c37680Eqa.LJLJJL = obj;
        return c37680Eqa;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005b -> B:13:0x006b). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r10.LJLJJI
            r4 = 3
            r9 = 2
            r7 = 1
            if (r0 == 0) goto L15
            if (r0 == r7) goto La0
            if (r0 == r9) goto L5e
            if (r0 != r4) goto L98
            X.C141335gf.LIZJ(r11)
        L12:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L15:
            X.C141335gf.LIZJ(r11)
            java.lang.Object r2 = r10.LJLJJL
            X.EqD r2 = (X.AbstractC37657EqD) r2
            X.OJD r0 = r10.LJLJJLL
            java.util.regex.Pattern r1 = r0.nativePattern
            java.lang.CharSequence r0 = r10.LJLJL
            java.util.regex.Matcher r8 = r1.matcher(r0)
            int r0 = r10.LJLJLJ
            if (r0 == r7) goto L30
            boolean r0 = r8.find()
            if (r0 != 0) goto L3f
        L30:
            java.lang.CharSequence r0 = r10.LJLJL
            java.lang.String r0 = r0.toString()
            r10.LJLJJI = r7
            X.NAu r0 = r2.LIZ(r0, r10)
            if (r0 != r3) goto La3
            return r3
        L3f:
            r6 = 0
            r5 = 0
        L41:
            java.lang.CharSequence r1 = r10.LJLJL
            int r0 = r8.start()
            java.lang.CharSequence r0 = r1.subSequence(r6, r0)
            java.lang.String r0 = r0.toString()
            r10.LJLJJL = r2
            r10.LJLILLLLZI = r8
            r10.LJLJI = r5
            r10.LJLJJI = r9
            X.NAu r0 = r2.LIZ(r0, r10)
            if (r0 != r3) goto L6b
            return r3
        L5e:
            int r5 = r10.LJLJI
            java.lang.Object r8 = r10.LJLILLLLZI
            java.util.regex.Matcher r8 = (java.util.regex.Matcher) r8
            java.lang.Object r2 = r10.LJLJJL
            X.EqD r2 = (X.AbstractC37657EqD) r2
            X.C141335gf.LIZJ(r11)
        L6b:
            int r6 = r8.end()
            int r5 = r5 + 1
            int r0 = r10.LJLJLJ
            int r0 = r0 - r7
            if (r5 == r0) goto L7c
            boolean r0 = r8.find()
            if (r0 != 0) goto L41
        L7c:
            java.lang.CharSequence r1 = r10.LJLJL
            int r0 = r1.length()
            java.lang.CharSequence r0 = r1.subSequence(r6, r0)
            java.lang.String r1 = r0.toString()
            r0 = 0
            r10.LJLJJL = r0
            r10.LJLILLLLZI = r0
            r10.LJLJJI = r4
            X.NAu r0 = r2.LIZ(r1, r10)
            if (r0 != r3) goto L12
            return r3
        L98:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La0:
            X.C141335gf.LIZJ(r11)
        La3:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37680Eqa.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(AbstractC37657EqD<? super String> abstractC37657EqD, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(abstractC37657EqD, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
