package X;

import com.ss.android.ugc.aweme.bnpl.biz.bill.model.BillRepaymentPrepareInfo;
import com.ss.android.ugc.aweme.bnpl.biz.bill.result.RepaymentViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.bill.result.RepaymentViewModel$onPrepareRepayment$1$2", f = "ReapymentRetViewModel.kt", l = {191, 197, 201, 212}, m = "invokeSuspend")
/* renamed from: X.aLu, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93130aLu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public InterfaceC88471Ynr LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ RepaymentViewModel LJLJJI;
    public final /* synthetic */ InterfaceC88471Ynr<BillRepaymentPrepareInfo, String, C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C93130aLu(RepaymentViewModel repaymentViewModel, InterfaceC88471Ynr<? super BillRepaymentPrepareInfo, ? super String, C76800UCe> interfaceC88471Ynr, InterfaceC67352kd<? super C93130aLu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = repaymentViewModel;
        this.LJLJJL = interfaceC88471Ynr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93130aLu(this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.bytedance.assem.arch.viewModel.AssemViewModel] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLJI
            r6 = 4
            r7 = 3
            r3 = 2
            r8 = 1
            r4 = 0
            if (r0 == 0) goto L20
            if (r0 == r8) goto L19
            if (r0 == r3) goto L87
            if (r0 == r7) goto L87
            if (r0 != r6) goto Lc2
            X.C141335gf.LIZJ(r10)
        L16:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L19:
            X.Ynr r2 = r9.LJLILLLLZI
            java.lang.Object r1 = r9.LJLIL
            com.bytedance.assem.arch.viewModel.AssemViewModel r1 = (com.bytedance.assem.arch.viewModel.AssemViewModel) r1
            goto L43
        L20:
            X.C141335gf.LIZJ(r10)
            com.ss.android.ugc.aweme.bnpl.biz.bill.result.RepaymentViewModel r1 = r9.LJLJJI
            X.Ynr<com.ss.android.ugc.aweme.bnpl.biz.bill.model.BillRepaymentPrepareInfo, java.lang.String, X.UCe> r2 = r9.LJLJJL
            X.EV6 r0 = r1.LJLILLLLZI     // Catch: java.lang.Throwable -> L96
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L96
            X.8aw r0 = (X.InterfaceC214228aw) r0     // Catch: java.lang.Throwable -> L96
            X.3e4 r0 = r0.getOperator()     // Catch: java.lang.Throwable -> L96
            X.a7h r0 = (X.InterfaceC92249a7h) r0     // Catch: java.lang.Throwable -> L96
            r9.LJLIL = r1     // Catch: java.lang.Throwable -> L96
            r9.LJLILLLLZI = r2     // Catch: java.lang.Throwable -> L96
            r9.LJLJI = r8     // Catch: java.lang.Throwable -> L96
            java.lang.Object r10 = r0.LJJII(r9)     // Catch: java.lang.Throwable -> L96
            if (r10 != r5) goto L46
            goto Lcc
        L43:
            X.C141335gf.LIZJ(r10)     // Catch: java.lang.Throwable -> L96
        L46:
            X.Pbt r10 = (X.C64797Pbt) r10     // Catch: java.lang.Throwable -> L96
            X.aI8 r0 = X.C92896aI8.LJLIL     // Catch: java.lang.Throwable -> L96
            r1.setState(r0)     // Catch: java.lang.Throwable -> L96
            boolean r0 = r10.LIZIZ()     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L90
            T r0 = r10.LIZIZ     // Catch: java.lang.Throwable -> L96
            com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse r0 = (com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse) r0     // Catch: java.lang.Throwable -> L96
            boolean r0 = r0.LIZ()     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L72
        L5e:
            X.UtN r1 = X.C36636EZk.LIZ     // Catch: java.lang.Throwable -> L96
            X.aLr r0 = new X.aLr     // Catch: java.lang.Throwable -> L96
            r0.<init>(r2, r10, r4)     // Catch: java.lang.Throwable -> L96
            r9.LJLIL = r4     // Catch: java.lang.Throwable -> L96
            r9.LJLILLLLZI = r4     // Catch: java.lang.Throwable -> L96
            r9.LJLJI = r3     // Catch: java.lang.Throwable -> L96
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r9)     // Catch: java.lang.Throwable -> L96
            if (r0 != r5) goto L8a
            goto Lca
        L72:
            X.UtN r1 = X.C36636EZk.LIZ     // Catch: java.lang.Throwable -> L96
            X.aLs r0 = new X.aLs     // Catch: java.lang.Throwable -> L96
            r0.<init>(r2, r10, r4)     // Catch: java.lang.Throwable -> L96
            r9.LJLIL = r4     // Catch: java.lang.Throwable -> L96
            r9.LJLILLLLZI = r4     // Catch: java.lang.Throwable -> L96
            r9.LJLJI = r7     // Catch: java.lang.Throwable -> L96
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r9)     // Catch: java.lang.Throwable -> L96
            if (r0 != r5) goto L8a
            goto Lcb
        L87:
            X.C141335gf.LIZJ(r10)     // Catch: java.lang.Throwable -> L96
        L8a:
            X.UCe r3 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L96
            X.C3C5.m7constructorimpl(r3)     // Catch: java.lang.Throwable -> L96
            goto L9e
        L90:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L96
            r0.<init>()     // Catch: java.lang.Throwable -> L96
            throw r0     // Catch: java.lang.Throwable -> L96
        L96:
            r0 = move-exception
            X.3C4 r3 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r3)
        L9e:
            com.ss.android.ugc.aweme.bnpl.biz.bill.result.RepaymentViewModel r1 = r9.LJLJJI
            X.Ynr<com.ss.android.ugc.aweme.bnpl.biz.bill.model.BillRepaymentPrepareInfo, java.lang.String, X.UCe> r2 = r9.LJLJJL
            java.lang.Throwable r0 = X.C3C5.m10exceptionOrNullimpl(r3)
            if (r0 == 0) goto L16
            X.aI9 r0 = X.C92897aI9.LJLIL
            r1.setState(r0)
            X.UtN r1 = X.C36636EZk.LIZ
            X.aLt r0 = new X.aLt
            r0.<init>(r2, r4)
            r9.LJLIL = r3
            r9.LJLILLLLZI = r4
            r9.LJLJI = r6
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r9)
            if (r0 != r5) goto L16
            return r5
        Lc2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lca:
            return r5
        Lcb:
            return r5
        Lcc:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93130aLu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
