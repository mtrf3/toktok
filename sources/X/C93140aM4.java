package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.verify.otp.OtpFragment$countDownCoroutines$1", f = "OtpFragment.kt", l = {361, 362}, m = "invokeSuspend")
/* renamed from: X.aM4, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93140aM4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC64672gJ<? super Integer>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93140aM4(int i, InterfaceC67352kd<? super C93140aM4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C93140aM4 c93140aM4 = new C93140aM4(this.LJLJJI, interfaceC67352kd);
        c93140aM4.LJLJI = obj;
        return c93140aM4;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0041 -> B:6:0x0016). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLILLLLZI
            r6 = -1
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L44
            if (r0 == r4) goto L2c
            if (r0 != r5) goto L51
            int r3 = r8.LJLIL
            java.lang.Object r2 = r8.LJLJI
            X.2gJ r2 = (X.InterfaceC64672gJ) r2
            X.C141335gf.LIZJ(r9)
        L16:
            int r3 = r3 + (-1)
        L18:
            if (r6 >= r3) goto L4e
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r3)
            r8.LJLJI = r2
            r8.LJLIL = r3
            r8.LJLILLLLZI = r4
            java.lang.Object r0 = r2.emit(r0, r8)
            if (r0 != r7) goto L35
            return r7
        L2c:
            int r3 = r8.LJLIL
            java.lang.Object r2 = r8.LJLJI
            X.2gJ r2 = (X.InterfaceC64672gJ) r2
            X.C141335gf.LIZJ(r9)
        L35:
            r8.LJLJI = r2
            r8.LJLIL = r3
            r8.LJLILLLLZI = r5
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r8)
            if (r0 != r7) goto L16
            return r7
        L44:
            X.C141335gf.LIZJ(r9)
            java.lang.Object r2 = r8.LJLJI
            X.2gJ r2 = (X.InterfaceC64672gJ) r2
            int r3 = r8.LJLJJI
            goto L18
        L4e:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L51:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93140aM4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC64672gJ<? super Integer> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC64672gJ, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
