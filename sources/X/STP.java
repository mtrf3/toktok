package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.aigc.AIGCQuickTask$fakeProgressJob$2$1", f = "AIGCQuickTask.kt", l = {25}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class STP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ STQ LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public STP(STQ stq, InterfaceC67352kd<? super STP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = stq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new STP(this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020 A[LOOP:0: B:6:0x001a->B:8:0x0020, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005f -> B:5:0x0012). Please report as a decompilation issue!!! */
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
            r0 = 1
            if (r1 == 0) goto L48
            if (r1 != r0) goto L62
            int r6 = r5.LJLILLLLZI
            int r3 = r5.LJLIL
            X.C141335gf.LIZJ(r19)
        L12:
            X.STQ r0 = r5.LJLJJI
            java.util.List<X.STO> r0 = r0.listenerList
            java.util.Iterator r1 = r0.iterator()
        L1a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r0 = r1.next()
            X.STO r0 = (X.STO) r0
            X.ST8 r7 = new X.ST8
            X.STF r8 = X.STF.IN_PROGRESS
            r9 = 0
            r10 = 0
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r6)
            java.lang.String r15 = "fast"
            r17 = 328(0x148, float:4.6E-43)
            r11 = r10
            r12 = r10
            r14 = r10
            r16 = r10
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.onUpdate(r7)
            goto L1a
        L41:
            r0 = 99
            if (r3 <= r0) goto L4d
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L48:
            X.C141335gf.LIZJ(r19)
            r3 = 0
            goto L4e
        L4d:
            r0 = 1
        L4e:
            int r2 = r3 + 1
            r5.LJLIL = r2
            r5.LJLILLLLZI = r3
            r5.LJLJI = r0
            r0 = 20
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r5)
            if (r0 != r4) goto L5f
            return r4
        L5f:
            r6 = r3
            r3 = r2
            goto L12
        L62:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STP.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
