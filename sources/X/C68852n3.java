package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.autocut.EditAutoCutComponent$fakeProgress$1", f = "EditAutoCutComponent.kt", l = {1146}, m = "invokeSuspend")
/* renamed from: X.2n3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68852n3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ Integer LJLJJI;
    public final /* synthetic */ C45054HmE LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<Float, C76800UCe> LJLJJLL;
    public final /* synthetic */ long LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C68852n3(Integer num, C45054HmE c45054HmE, InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns, long j, InterfaceC67352kd<? super C68852n3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = num;
        this.LJLJJL = c45054HmE;
        this.LJLJJLL = interfaceC88472Yns;
        this.LJLJL = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C68852n3(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
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
            int r4 = r4 + 1
        L12:
            if (r4 >= r0) goto L1a
            X.HmE r1 = r7.LJLJJL
            X.Hgm r1 = r1.LLIIJLIL
            if (r1 != 0) goto L1d
        L1a:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L1d:
            X.Yns<java.lang.Float, X.UCe> r3 = r7.LJLJJLL
            float r2 = (float) r4
            float r1 = (float) r0
            float r2 = r2 / r1
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r2)
            r3.invoke(r1)
            long r1 = r7.LJLJL
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
            goto L12
        L46:
            r0 = 100
            goto L44
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68852n3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
