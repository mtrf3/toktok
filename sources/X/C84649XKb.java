package X;

import fjb.a;
import kotlinx.coroutines.JobSupport;

@InterfaceC65848Psq(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {952, 954}, m = "invokeSuspend")
/* renamed from: X.XKb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84649XKb extends AbstractC65783Prn implements InterfaceC88471Ynr<AbstractC37657EqD<? super XL8>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public XJT LJLILLLLZI;
    public C84629XJh LJLJI;
    public int LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ JobSupport LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84649XKb(InterfaceC67352kd interfaceC67352kd, JobSupport jobSupport) {
        super(2, interfaceC67352kd);
        this.LJLJJLL = jobSupport;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C84649XKb c84649XKb = new C84649XKb(interfaceC67352kd, this.LJLJJLL);
        c84649XKb.LJLJJL = obj;
        return c84649XKb;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:6:0x0017). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0036 -> B:6:0x0017). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJI
            r5 = 2
            r3 = 1
            if (r0 == 0) goto L3d
            if (r0 == r3) goto L39
            if (r0 != r5) goto L71
            X.XJh r0 = r6.LJLJI
            X.XJT r1 = r6.LJLILLLLZI
            java.lang.Object r2 = r6.LJLJJL
            X.EqD r2 = (X.AbstractC37657EqD) r2
            X.C141335gf.LIZJ(r7)
        L17:
            X.XJh r0 = r0.LJIIZILJ()
        L1b:
            boolean r3 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r3 != 0) goto L67
            boolean r3 = r0 instanceof X.C84666XKs
            if (r3 == 0) goto L17
            r3 = r0
            X.XKs r3 = (X.C84666XKs) r3
            X.XL8 r3 = r3.LJLJJL
            r6.LJLJJL = r2
            r6.LJLILLLLZI = r1
            r6.LJLJI = r0
            r6.LJLJJI = r5
            X.NAu r3 = r2.LIZ(r3, r6)
            if (r3 != r4) goto L17
            return r4
        L39:
            X.C141335gf.LIZJ(r7)
            goto L67
        L3d:
            X.C141335gf.LIZJ(r7)
            java.lang.Object r2 = r6.LJLJJL
            X.EqD r2 = (X.AbstractC37657EqD) r2
            kotlinx.coroutines.JobSupport r0 = r6.LJLJJLL
            java.lang.Object r1 = r0.LJJJLIIL()
            boolean r0 = r1 instanceof X.C84666XKs
            if (r0 == 0) goto L5b
            X.XKs r1 = (X.C84666XKs) r1
            X.XL8 r0 = r1.LJLJJL
            r6.LJLJJI = r3
            X.NAu r0 = r2.LIZ(r0, r6)
            if (r0 != r4) goto L67
            return r4
        L5b:
            boolean r0 = r1 instanceof X.XL7
            if (r0 == 0) goto L67
            X.XL7 r1 = (X.XL7) r1
            X.XL4 r1 = r1.getList()
            if (r1 != 0) goto L6a
        L67:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L6a:
            java.lang.Object r0 = r1.LJIILLIIL()
            X.XJh r0 = (X.C84629XJh) r0
            goto L1b
        L71:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84649XKb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(AbstractC37657EqD<? super XL8> abstractC37657EqD, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(abstractC37657EqD, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
