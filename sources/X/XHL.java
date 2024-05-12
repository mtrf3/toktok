package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.mota.queue.PQSupervisor$PendingQueue$1", f = "PQSupervisor.kt", l = {89, 91}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class XHL extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ XHM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XHL(XHM xhm, InterfaceC67352kd<? super XHL> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = xhm;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new XHL(this.LJLILLLLZI, interfaceC67352kd);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0054 -> B:11:0x000f). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLIL
            r4 = 2
            r3 = 1
            if (r0 == 0) goto Lc
            if (r0 == r3) goto L45
            if (r0 != r4) goto L57
        Lc:
            X.C141335gf.LIZJ(r7)
        Lf:
            X.XHM r2 = r6.LJLILLLLZI
            r6.LJLIL = r3
            r2.getClass()
            X.XKS r1 = new X.XKS
            X.2kd r0 = X.C78555UsJ.LJJII(r6)
            r1.<init>(r3, r0)
            r1.LJIIL()
            java.util.concurrent.LinkedBlockingQueue<X.XHN> r0 = r2.LIZJ
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L42
            X.UCe r0 = X.C76800UCe.LIZ
            X.C3C5.m7constructorimpl(r0)
            r1.resumeWith(r0)
        L34:
            java.lang.Object r1 = r1.LJIIJJI()
            X.NAu r0 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            if (r1 != r0) goto L3f
        L3c:
            if (r1 != r5) goto L48
            return r5
        L3f:
            X.UCe r1 = X.C76800UCe.LIZ
            goto L3c
        L42:
            r2.LIZLLL = r1
            goto L34
        L45:
            X.C141335gf.LIZJ(r7)
        L48:
            X.XHM r0 = r6.LJLILLLLZI
            r0.LIZIZ = r3
            X.XHM r0 = r6.LJLILLLLZI
            r6.LJLIL = r4
            java.lang.Object r0 = r0.LIZIZ(r6)
            if (r0 != r5) goto Lf
            return r5
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XHL.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
