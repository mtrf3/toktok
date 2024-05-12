package com.ss.android.ugc.aweme.bnpl.biz.bill.repayment;

import X.C113554cx;
import X.C16880lQ;
import X.C65352Pkq;
import X.C78404Ups;
import X.C91832a0y;
import X.C91924a2S;
import X.C92047a4R;
import X.C92227a7L;
import X.C92250a7i;
import X.C92324a8u;
import X.C92553aCb;
import X.C92554aCc;
import X.C92555aCd;
import X.C92556aCe;
import X.C92557aCf;
import X.C92558aCg;
import X.EV6;
import X.EnumC91974a3G;
import X.OSZ;
import X.X1D;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.math.BigDecimal;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class RepaymentViewModel extends AssemViewModel<C92227a7L> {
    public C91832a0y LJLJJI;
    public C92324a8u LJLJL;
    public long LJLJLJ;
    public boolean LJLJLLL;
    public long LJLL;
    public final String LJLIL = C16880lQ.LJLLJ(RepaymentViewModel.class);
    public final EV6 LJLILLLLZI = C78404Ups.LIZIZ(this, C65352Pkq.LIZ(C92250a7i.class));
    public String LJLJI = "";
    public String LJLJJL = "";
    public String LJLJJLL = "";
    public final String LJLLI = CardStruct.IStatusCode.DEFAULT;
    public String LJLLILLLL = "";
    public int LJLLJ = 1;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C92227a7L defaultState() {
        return new C92227a7L(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(X.InterfaceC67352kd<? super java.lang.String> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C92551aCZ
            if (r0 == 0) goto L1f
            r5 = r7
            X.aCZ r5 = (X.C92551aCZ) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r4 = r5.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r5.LJLJI
            r0 = 0
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            goto L40
        L1f:
            X.aCZ r5 = new X.aCZ
            r5.<init>(r6, r7)
            goto L12
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2d:
            X.C141335gf.LIZJ(r4)
            X.a0l r1 = com.ss.android.ugc.aweme.bnpl.network.CheckoutApi.LIZ     // Catch: java.lang.Throwable -> L5f
            r5.LJLJI = r2     // Catch: java.lang.Throwable -> L5f
            r1.getClass()     // Catch: java.lang.Throwable -> L5f
            com.ss.android.ugc.aweme.bnpl.network.CheckoutApi r1 = X.C91819a0l.LIZIZ     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r4 = r1.getNonce(r5)     // Catch: java.lang.Throwable -> L5f
            if (r4 != r3) goto L43
            return r3
        L40:
            X.C141335gf.LIZJ(r4)     // Catch: java.lang.Throwable -> L5f
        L43:
            X.Pbt r4 = (X.C64797Pbt) r4     // Catch: java.lang.Throwable -> L5f
            boolean r1 = r4.LIZIZ()     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L5f
            T r1 = r4.LIZIZ     // Catch: java.lang.Throwable -> L5f
            com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse r1 = (com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse) r1     // Catch: java.lang.Throwable -> L5f
            boolean r1 = r1.LIZ()     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L5f
            T r1 = r4.LIZIZ     // Catch: java.lang.Throwable -> L5f
            com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse r1 = (com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse) r1     // Catch: java.lang.Throwable -> L5f
            T r1 = r1.data     // Catch: java.lang.Throwable -> L5f
            com.ss.android.ugc.aweme.bnpl.network.model.Nonce r1 = (com.ss.android.ugc.aweme.bnpl.network.model.Nonce) r1     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = r1.nonce     // Catch: java.lang.Throwable -> L5f
        L5f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentViewModel.gv0(X.2kd):java.lang.Object");
    }

    public final void iv0(String str) {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.LJLJLJ;
        if (getState().LJLILLLLZI == EnumC91974a3G.EXCEED_DUE) {
            z = true;
        } else {
            z = false;
        }
        C91924a2S.LIZ(C91924a2S.LIZ, "fp_sdk_bnpl_start_repayment_click", "bnpl_start_repayment", this.LJLLILLLL, C113554cx.LJJL(new OSZ("obj_id", str), new OSZ("repayment_amount", this.LJLJI), new OSZ("currency", getState().LJLJLJ), new OSZ("is_exceed", C92047a4R.LIZLLL(z)), new OSZ("timestamp", String.valueOf(currentTimeMillis)), new OSZ("click_use_time", String.valueOf(j))), 8);
    }

    public final void jv0(String input) {
        o.LJIIIZ(input, "input");
        this.LJLJI = input;
        C92227a7L state = getState();
        try {
            if (this.LJLJI.length() != 0 && !o.LJ(new BigDecimal(this.LJLJI), BigDecimal.ZERO)) {
                if (new BigDecimal(this.LJLJI).compareTo(new BigDecimal(state.LJLJL)) < 0) {
                    setState(C92554aCc.LJLIL);
                } else if (state.LJLJJL && new BigDecimal(this.LJLJI).compareTo(new BigDecimal(state.LJLJI)) < 0) {
                    setState(C92555aCd.LJLIL);
                } else if (new BigDecimal(this.LJLJI).compareTo(new BigDecimal(state.LJLJJI)) > 0) {
                    setState(C92556aCe.LJLIL);
                } else if (new BigDecimal(this.LJLJI).compareTo(new BigDecimal(state.LJLJI)) > 0) {
                    setState(C92557aCf.LJLIL);
                } else {
                    setState(C92558aCg.LJLIL);
                }
            }
            setState(C92553aCb.LJLIL);
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("failed to parse amount: ");
            LIZ.append(th);
            X1D.LIZIZ(LIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hv0(X.C29S r18, X.InterfaceC67352kd<? super java.lang.Boolean> r19) {
        /*
            Method dump skipped, instructions count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentViewModel.hv0(X.29S, X.2kd):java.lang.Object");
    }
}
