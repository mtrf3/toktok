package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.spriteimage.ScrollHandleConfiguration$getAndFillInThumbnails$getCurrentShownThumbnail$1$1", f = "ScrollHandleConfiguration.kt", l = {537, 560}, m = "invokeSuspend")
/* renamed from: X.EKk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36246EKk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C72979SkZ LJLJJL;
    public final /* synthetic */ boolean[] LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36246EKk(C72979SkZ c72979SkZ, boolean[] zArr, InterfaceC67352kd<? super C36246EKk> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = c72979SkZ;
        this.LJLJJLL = zArr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C36246EKk c36246EKk = new C36246EKk(this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c36246EKk.LJLJJI = obj;
        return c36246EKk;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            r5 = r18
            int r1 = r5.LJLJI
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L7b
            if (r1 == r0) goto L8f
            if (r1 != r3) goto Lb9
            int r7 = r5.LJLILLLLZI
            int r6 = r5.LJLIL
            java.lang.Object r2 = r5.LJLJJI
            X.2pa r2 = (X.InterfaceC70422pa) r2
            X.C141335gf.LIZJ(r19)
        L19:
            boolean r0 = X.C48841JEv.LJIILLIIL(r2)
            if (r0 == 0) goto Lb6
            X.SkZ r0 = r5.LJLJJL
            kotlin.jvm.internal.AqS194S0100000_12 r8 = r0.LJJIJ
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r6)
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r7)
            java.lang.Object r8 = r8.invoke(r1, r0)
            java.util.Set r8 = (java.util.Set) r8
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L40
            r0 = 0
            X.C48841JEv.LIZJ(r2, r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L40:
            X.SkZ r11 = r5.LJLJJL
            boolean[] r1 = r5.LJLJJLL
            java.util.Iterator r10 = r8.iterator()
        L48:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r10.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r9 = r0.intValue()
            int r8 = r11.LJIJJ
            int r0 = r9 * r8
            long r12 = (long) r0
            long r15 = (long) r8
            long r15 = r15 + r12
            r17 = 0
            boolean r14 = r1[r9]
            r0 = 0
            r1[r9] = r0
            r11.LIZIZ(r12, r14, r15, r17)
            goto L48
        L6a:
            r5.LJLJJI = r2
            r5.LJLIL = r6
            r5.LJLILLLLZI = r7
            r5.LJLJI = r3
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r5)
            if (r0 != r4) goto L19
            return r4
        L7b:
            X.C141335gf.LIZJ(r19)
            java.lang.Object r2 = r5.LJLJJI
            X.2pa r2 = (X.InterfaceC70422pa) r2
            r5.LJLJJI = r2
            r5.LJLJI = r0
            r0 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r5)
            if (r0 != r4) goto L96
            return r4
        L8f:
            java.lang.Object r2 = r5.LJLJJI
            X.2pa r2 = (X.InterfaceC70422pa) r2
            X.C141335gf.LIZJ(r19)
        L96:
            X.SkZ r0 = r5.LJLJJL
            kotlin.jvm.internal.AqS162S0100000_12 r0 = r0.LJJIIZ
            java.lang.Object r1 = r0.invoke()
            X.OSZ r1 = (X.OSZ) r1
            java.lang.Object r0 = r1.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r6 = r0.intValue()
            java.lang.Object r0 = r1.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r7 = r0.intValue()
            goto L19
        Lb6:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Lb9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36246EKk.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
