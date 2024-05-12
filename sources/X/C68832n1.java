package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.autocut.AutoCutComponent$fakeProgress$1", f = "AutoCutComponent.kt", l = {1030}, m = "invokeSuspend")
/* renamed from: X.2n1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68832n1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ Integer LJLJJI;
    public final /* synthetic */ C45199HoZ LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ InterfaceC88472Yns<Float, C76800UCe> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C68832n1(Integer num, C45199HoZ c45199HoZ, long j, InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C68832n1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = num;
        this.LJLJJL = c45199HoZ;
        this.LJLJJLL = j;
        this.LJLJL = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C68832n1(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0036 -> B:5:0x0010). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJI
            r5 = 1
            if (r0 == 0) goto L39
            if (r0 != r5) goto L49
            int r4 = r7.LJLILLLLZI
            int r0 = r7.LJLIL
            X.C141335gf.LIZJ(r8)
        L10:
            X.Yns<java.lang.Float, X.UCe> r3 = r7.LJLJL
            float r2 = (float) r4
            float r1 = (float) r0
            float r2 = r2 / r1
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r2)
            r3.invoke(r1)
            int r4 = r4 + 1
        L1f:
            if (r4 >= r0) goto L27
            X.HoZ r1 = r7.LJLJJL
            X.Hgm r1 = r1.LJLLL
            if (r1 != 0) goto L2a
        L27:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2a:
            long r1 = r7.LJLJJLL
            r7.LJLIL = r0
            r7.LJLILLLLZI = r4
            r7.LJLJI = r5
            java.lang.Object r1 = X.C1JD.LIZJ(r1, r7)
            if (r1 != r6) goto L10
            return r6
        L39:
            X.C141335gf.LIZJ(r8)
            java.lang.Integer r0 = r7.LJLJJI
            if (r0 == 0) goto L46
            int r0 = r0.intValue()
        L44:
            r4 = 0
            goto L1f
        L46:
            r0 = 100
            goto L44
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68832n1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
