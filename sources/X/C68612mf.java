package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.autocut.autocutanchor.AutoCutTemplateComponent$fakeProgress$1", f = "AutoCutTemplateComponent.kt", l = {252}, m = "invokeSuspend")
/* renamed from: X.2mf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68612mf extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ HKJ LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<Float, C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C68612mf(HKJ hkj, long j, InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C68612mf> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = hkj;
        this.LJLJJI = j;
        this.LJLJJL = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C68612mf(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r3 >= 100) goto L10;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0032 -> B:5:0x000e). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLILLLLZI
            r4 = 1
            if (r0 == 0) goto L35
            if (r0 != r4) goto L3a
            int r3 = r6.LJLIL
            X.C141335gf.LIZJ(r7)
        Le:
            X.Yns<java.lang.Float, X.UCe> r2 = r6.LJLJJL
            float r1 = (float) r3
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r1)
            r2.invoke(r0)
            int r3 = r3 + 1
            r0 = 100
            if (r3 >= r0) goto L25
        L1f:
            X.HKJ r0 = r6.LJLJI
            java.lang.String r0 = r0.LJLJJI
            if (r0 != 0) goto L28
        L25:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L28:
            long r0 = r6.LJLJJI
            r6.LJLIL = r3
            r6.LJLILLLLZI = r4
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r6)
            if (r0 != r5) goto Le
            return r5
        L35:
            X.C141335gf.LIZJ(r7)
            r3 = 0
            goto L1f
        L3a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68612mf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
