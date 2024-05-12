package com.ss.android.ugc.aweme.feed.prompt;

import X.C237629Ug;
import X.C237689Um;
import X.C65352Pkq;
import X.C78404Ups;
import X.EV6;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* loaded from: classes5.dex */
public final class PromptHistorySheetVM extends AssemViewModel<C237689Um> {
    public final EV6 LJLIL = C78404Ups.LIZIZ(this, C65352Pkq.LIZ(C237629Ug.class));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C237689Um defaultState() {
        return new C237689Um(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(X.C237749Us r7, X.InterfaceC67352kd<? super X.C3C5<com.ss.android.ugc.aweme.feed.prompt.api.InstructionUndoResp>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C237739Ur
            if (r0 == 0) goto L47
            r5 = r8
            X.9Ur r5 = (X.C237739Ur) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r1 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJI
            r3 = 1
            if (r0 == 0) goto L27
            if (r0 != r3) goto L4d
            X.C141335gf.LIZJ(r1)
            X.3C5 r1 = (X.C3C5) r1
            java.lang.Object r0 = r1.m15unboximpl()
        L26:
            return r0
        L27:
            X.C141335gf.LIZJ(r1)
            X.EV6 r0 = r6.LJLIL
            java.lang.Object r0 = r0.getValue()
            X.8aw r0 = (X.InterfaceC214228aw) r0
            X.3e4 r2 = r0.getOperator()
            X.9Uf r2 = (X.InterfaceC237619Uf) r2
            com.ss.android.ugc.aweme.feed.prompt.api.Instruction r0 = r7.LJLIL
            long r0 = r0.getId()
            r5.LJLJI = r3
            java.lang.Object r0 = r2.LJJJ(r0, r5)
            if (r0 != r4) goto L26
            return r4
        L47:
            X.9Ur r5 = new X.9Ur
            r5.<init>(r6, r8)
            goto L12
        L4d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.prompt.PromptHistorySheetVM.gv0(X.9Us, X.2kd):java.lang.Object");
    }
}
