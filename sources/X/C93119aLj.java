package X;

import com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentViewModel$presentCheckout$1", f = "RepaymentViewModel.kt", l = {437, 439, 462, 476}, m = "invokeSuspend")
/* renamed from: X.aLj, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93119aLj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public long LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ RepaymentViewModel LJLJI;
    public final /* synthetic */ C29S LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93119aLj(RepaymentViewModel repaymentViewModel, C29S c29s, InterfaceC67352kd<? super C93119aLj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = repaymentViewModel;
        this.LJLJJI = c29s;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93119aLj(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(1:2)|(1:(1:(3:(1:(1:8)(2:12|13))(2:14|15)|9|10)(4:16|17|18|19))(3:20|21|22))(4:40|41|42|(2:44|45))|23|24|(4:26|(2:28|29)|18|19)(4:30|(2:32|33)|9|10)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        r6 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ad, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r3 = r16
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r15.LJLILLLLZI
            r2 = 4
            r6 = 3
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L30
            if (r0 == r5) goto L2a
            if (r0 == r4) goto L27
            if (r0 == r6) goto L21
            if (r0 != r2) goto Lae
            X.C141335gf.LIZJ(r3)
        L17:
            com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentViewModel r1 = r15.LJLJI
            X.aHO r0 = X.C92850aHO.LJLIL
            r1.setState(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L21:
            long r7 = r15.LJLIL
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Throwable -> L7b
            goto L17
        L27:
            long r7 = r15.LJLIL
            goto L6e
        L2a:
            long r7 = r15.LJLIL
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Throwable -> L97
            goto L4d
        L30:
            X.C141335gf.LIZJ(r3)
            com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentViewModel r3 = r15.LJLJI
            X.aHM r0 = X.C92848aHM.LJLIL
            r3.setState(r0)
            long r7 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentViewModel r3 = r15.LJLJI     // Catch: java.lang.Throwable -> L95
            X.29S r0 = r15.LJLJJI     // Catch: java.lang.Throwable -> L95
            r15.LJLIL = r7     // Catch: java.lang.Throwable -> L95
            r15.LJLILLLLZI = r5     // Catch: java.lang.Throwable -> L95
            java.lang.Object r3 = r3.hv0(r0, r15)     // Catch: java.lang.Throwable -> L95
            if (r3 != r1) goto L4d
            goto Lb9
        L4d:
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L93
            boolean r0 = r3.booleanValue()     // Catch: java.lang.Throwable -> L93
            if (r0 != 0) goto L7d
        L56:
            X.UtN r0 = X.C36636EZk.LIZ     // Catch: java.lang.Throwable -> L93
            X.aLg r9 = new X.aLg     // Catch: java.lang.Throwable -> L93
            com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentViewModel r10 = r15.LJLJI     // Catch: java.lang.Throwable -> L93
            X.29S r11 = r15.LJLJJI     // Catch: java.lang.Throwable -> L93
            r14 = 0
            r12 = r7
            r9.<init>(r10, r11, r12, r14)     // Catch: java.lang.Throwable -> L93
            r15.LJLIL = r7     // Catch: java.lang.Throwable -> L93
            r15.LJLILLLLZI = r4     // Catch: java.lang.Throwable -> L93
            java.lang.Object r0 = X.XKX.LJI(r0, r9, r15)     // Catch: java.lang.Throwable -> L93
            if (r0 != r1) goto L71
            goto Lb7
        L6e:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Throwable -> L7b
        L71:
            com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentViewModel r3 = r15.LJLJI     // Catch: java.lang.Throwable -> L7b
            X.aHN r0 = X.C92849aHN.LJLIL     // Catch: java.lang.Throwable -> L7b
            r3.setState(r0)     // Catch: java.lang.Throwable -> L7b
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L7b
            goto Lb6
        L7b:
            r6 = move-exception
            goto L98
        L7d:
            X.UtN r5 = X.C36636EZk.LIZ     // Catch: java.lang.Throwable -> L93
            X.aLh r4 = new X.aLh     // Catch: java.lang.Throwable -> L93
            com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentViewModel r3 = r15.LJLJI     // Catch: java.lang.Throwable -> L93
            r0 = 0
            r4.<init>(r3, r7, r0)     // Catch: java.lang.Throwable -> L93
            r15.LJLIL = r7     // Catch: java.lang.Throwable -> L93
            r15.LJLILLLLZI = r6     // Catch: java.lang.Throwable -> L93
            java.lang.Object r0 = X.XKX.LJI(r5, r4, r15)     // Catch: java.lang.Throwable -> L93
            if (r0 != r1) goto L17
            goto Lb8
        L93:
            r6 = move-exception
            goto L98
        L95:
            r6 = move-exception
            goto L98
        L97:
            r6 = move-exception
        L98:
            X.UtN r0 = X.C36636EZk.LIZ
            X.aLi r3 = new X.aLi
            X.29S r4 = r15.LJLJJI
            com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentViewModel r5 = r15.LJLJI
            r9 = 0
            r3.<init>(r4, r5, r6, r7, r9)
            r15.LJLILLLLZI = r2
            java.lang.Object r0 = X.XKX.LJI(r0, r3, r15)
            if (r0 != r1) goto L17
            return r1
        Lae:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb6:
            return r0
        Lb7:
            return r1
        Lb8:
            return r1
        Lb9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93119aLj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
