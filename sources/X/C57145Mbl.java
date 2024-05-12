package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.main.MainPageFragment$subscribeContactOrFbAuthState$1", f = "MainPageFragment.kt", l = {830}, m = "invokeSuspend")
/* renamed from: X.Mbl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57145Mbl extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public EnumC77147UPn[] LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;

    public C57145Mbl(InterfaceC67352kd<? super C57145Mbl> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57145Mbl(interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x002f -> B:5:0x0012). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJI
            r5 = 1
            if (r0 == 0) goto L32
            if (r0 != r5) goto L3f
            int r4 = r7.LJLJI
            int r3 = r7.LJLILLLLZI
            X.UPn[] r0 = r7.LJLIL
            X.C141335gf.LIZJ(r8)
        L12:
            int r3 = r3 + 1
        L14:
            if (r3 >= r4) goto L3c
            r2 = r0[r3]
            X.UTK r1 = X.UTK.LIZIZ
            X.2pT r2 = r1.LJIIIZ(r2)
            X.Mbn r1 = new X.Mbn
            r1.<init>()
            r7.LJLIL = r0
            r7.LJLILLLLZI = r3
            r7.LJLJI = r4
            r7.LJLJJI = r5
            java.lang.Object r1 = r2.collect(r1, r7)
            if (r1 != r6) goto L12
            return r6
        L32:
            X.C141335gf.LIZJ(r8)
            X.UPn[] r0 = X.EnumC77147UPn.values()
            int r4 = r0.length
            r3 = 0
            goto L14
        L3c:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57145Mbl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C57145Mbl(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
