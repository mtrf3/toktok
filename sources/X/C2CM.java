package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1", f = "Hoverable.kt", l = {104}, m = "invokeSuspend")
/* renamed from: X.2CM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2CM extends AbstractC65783Prn implements InterfaceC88471Ynr<InterfaceC37471dX, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ MBA LJLJJI;
    public final /* synthetic */ InterfaceC70422pa LJLJJL;
    public final /* synthetic */ C1OH LJLJJLL;
    public final /* synthetic */ InterfaceC35811ar<C1OF> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2CM(MBA mba, InterfaceC70422pa interfaceC70422pa, C1OH c1oh, InterfaceC35811ar<C1OF> interfaceC35811ar, InterfaceC67352kd<? super C2CM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = mba;
        this.LJLJJL = interfaceC70422pa;
        this.LJLJJLL = c1oh;
        this.LJLJL = interfaceC35811ar;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2CM c2cm = new C2CM(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
        c2cm.LJLJI = obj;
        return c2cm;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003a -> B:5:0x0010). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLILLLLZI
            r5 = 1
            if (r0 == 0) goto L51
            if (r0 != r5) goto L5c
            java.lang.Object r0 = r9.LJLJI
            X.1dX r0 = (X.InterfaceC37471dX) r0
            X.C141335gf.LIZJ(r10)
        L10:
            X.11H r10 = (X.C11H) r10
            int r2 = r10.LIZJ
            r1 = 4
            if (r2 != r1) goto L4f
            r1 = 1
        L18:
            r8 = 3
            r7 = 0
            if (r1 == 0) goto L3d
            X.2pa r4 = r9.LJLJJL
            X.2CK r3 = new X.2CK
            X.1OH r2 = r9.LJLJJLL
            X.1ar<X.1OF> r1 = r9.LJLJL
            r3.<init>(r2, r1, r7)
            X.XKX.LIZLLL(r4, r7, r7, r3, r8)
        L2a:
            X.MBA r1 = r9.LJLJJI
            boolean r1 = X.C79146V4k.LJJJ(r1)
            if (r1 == 0) goto L59
            r9.LJLJI = r0
            r9.LJLILLLLZI = r5
            java.lang.Object r10 = X.SC5.LIZ(r0, r9)
            if (r10 != r6) goto L10
            return r6
        L3d:
            r1 = 5
            if (r2 != r1) goto L2a
            X.2pa r4 = r9.LJLJJL
            X.2CL r3 = new X.2CL
            X.1ar<X.1OF> r2 = r9.LJLJL
            X.1OH r1 = r9.LJLJJLL
            r3.<init>(r1, r2, r7)
            X.XKX.LIZLLL(r4, r7, r7, r3, r8)
            goto L2a
        L4f:
            r1 = 0
            goto L18
        L51:
            X.C141335gf.LIZJ(r10)
            java.lang.Object r0 = r9.LJLJI
            X.1dX r0 = (X.InterfaceC37471dX) r0
            goto L2a
        L59:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2CM.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC37471dX interfaceC37471dX, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC37471dX, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
