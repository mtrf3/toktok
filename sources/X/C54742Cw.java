package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", l = {198}, m = "invokeSuspend")
/* renamed from: X.2Cw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54742Cw extends AbstractC65783Prn implements InterfaceC88471Ynr<InterfaceC37471dX, InterfaceC67352kd<? super C11P>, Object> {
    public long LJLILLLLZI;
    public int LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C11P LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54742Cw(C11P c11p, InterfaceC67352kd<? super C54742Cw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = c11p;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C54742Cw c54742Cw = new C54742Cw(this.LJLJJL, interfaceC67352kd);
        c54742Cw.LJLJJI = obj;
        return c54742Cw;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003c -> B:5:0x0012). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLJI
            r6 = 1
            if (r0 == 0) goto L1b
            if (r0 != r6) goto L3f
            long r3 = r8.LJLILLLLZI
            java.lang.Object r5 = r8.LJLJJI
            X.1dX r5 = (X.InterfaceC37471dX) r5
            X.C141335gf.LIZJ(r9)
        L12:
            X.11P r9 = (X.C11P) r9
            long r1 = r9.LIZIZ
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L30
            return r9
        L1b:
            X.C141335gf.LIZJ(r9)
            java.lang.Object r5 = r8.LJLJJI
            X.1dX r5 = (X.InterfaceC37471dX) r5
            X.11P r0 = r8.LJLJJL
            long r1 = r0.LIZIZ
            X.04g r0 = r5.getViewConfiguration()
            r0.LIZJ()
            r3 = 40
            long r3 = r3 + r1
        L30:
            r8.LJLJJI = r5
            r8.LJLILLLLZI = r3
            r8.LJLJI = r6
            X.11I r0 = X.C11I.Main
            java.lang.Object r9 = X.C0UM.LIZIZ(r5, r0, r6, r8)
            if (r9 != r7) goto L12
            return r7
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54742Cw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC37471dX interfaceC37471dX, InterfaceC67352kd<? super C11P> interfaceC67352kd) {
        return ((a) create(interfaceC37471dX, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
