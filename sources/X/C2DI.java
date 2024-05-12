package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1$1", f = "Scrollable.kt", l = {291}, m = "invokeSuspend")
/* renamed from: X.2DI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2DI extends AbstractC65783Prn implements InterfaceC88471Ynr<InterfaceC37471dX, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C0UV LJLJJI;
    public final /* synthetic */ InterfaceC24760y8<C0UL> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2DI(C0UV c0uv, InterfaceC24760y8<C0UL> interfaceC24760y8, InterfaceC67352kd<? super C2DI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = c0uv;
        this.LJLJJL = interfaceC24760y8;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2DI c2di = new C2DI(this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c2di.LJLJI = obj;
        return c2di;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[EDGE_INSN: B:15:0x0038->B:16:0x0038 BREAK  A[LOOP:0: B:6:0x001a->B:9:0x0035], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0032 -> B:5:0x0010). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLILLLLZI
            r5 = 1
            if (r0 == 0) goto L74
            if (r0 != r5) goto L7c
            java.lang.Object r0 = r8.LJLJI
            X.1dX r0 = (X.InterfaceC37471dX) r0
            X.C141335gf.LIZJ(r9)
        L10:
            X.11H r9 = (X.C11H) r9
            java.util.List<X.11P> r7 = r9.LIZ
            int r3 = r7.size()
            r4 = 0
            r2 = 0
        L1a:
            if (r2 >= r3) goto L38
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r2)
            X.11P r1 = (X.C11P) r1
            boolean r1 = r1.LIZIZ()
            r1 = r1 ^ 1
            if (r1 != 0) goto L35
        L2a:
            r8.LJLJI = r0
            r8.LJLILLLLZI = r5
            java.lang.Object r9 = X.C08250Ub.LIZ(r0, r8)
            if (r9 != r6) goto L10
            return r6
        L35:
            int r2 = r2 + 1
            goto L1a
        L38:
            X.0UV r1 = r8.LJLJJI
            X.0y8<X.0UL> r3 = r8.LJLJJL
            r0.LIZ()
            long r1 = r1.LIZ(r0, r9)
            java.lang.Object r3 = r3.getValue()
            X.0UL r3 = (X.C0UL) r3
            float r2 = r3.LJ(r1)
            boolean r1 = r3.LIZIZ
            if (r1 == 0) goto L54
            r1 = -1
            float r1 = (float) r1
            float r2 = r2 * r1
        L54:
            X.0UK r1 = r3.LIZLLL
            float r2 = r1.LIZJ(r2)
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L60
            goto L2a
        L60:
            java.util.List<X.11P> r3 = r9.LIZ
            int r2 = r3.size()
        L66:
            if (r4 >= r2) goto L2a
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r4)
            X.11P r1 = (X.C11P) r1
            r1.LIZ()
            int r4 = r4 + 1
            goto L66
        L74:
            X.C141335gf.LIZJ(r9)
            java.lang.Object r0 = r8.LJLJI
            X.1dX r0 = (X.InterfaceC37471dX) r0
            goto L2a
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2DI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC37471dX interfaceC37471dX, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC37471dX, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
