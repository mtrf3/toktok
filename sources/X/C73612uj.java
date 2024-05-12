package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.ui.AICaptionLoadingView$startAnimation$2", f = "AICaptionLoadingView.kt", l = {163, 165, 166, 167, 168}, m = "invokeSuspend")
/* renamed from: X.2uj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73612uj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C159006Lw LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73612uj(C159006Lw c159006Lw, InterfaceC67352kd<? super C73612uj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c159006Lw;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C73612uj(this.LJLILLLLZI, interfaceC67352kd);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004b -> B:14:0x001d). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.NAu r11 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r12.LJLIL
            r2 = 200(0xc8, double:9.9E-322)
            r10 = 204(0xcc, float:2.86E-43)
            r9 = 0
            r8 = 5
            r7 = 4
            r6 = 3
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L4e
            if (r0 == r4) goto L1a
            if (r0 == r5) goto L28
            if (r0 == r6) goto L34
            if (r0 == r7) goto L42
            if (r0 != r8) goto L5c
        L1a:
            X.C141335gf.LIZJ(r13)
        L1d:
            X.6Lw r0 = r12.LJLILLLLZI
            r12.LJLIL = r5
            java.lang.Object r0 = r0.LIZ(r4, r10, r9, r12)
            if (r0 != r11) goto L2b
            return r11
        L28:
            X.C141335gf.LIZJ(r13)
        L2b:
            r12.LJLIL = r6
            java.lang.Object r0 = X.C1JD.LIZJ(r2, r12)
            if (r0 != r11) goto L37
            return r11
        L34:
            X.C141335gf.LIZJ(r13)
        L37:
            X.6Lw r0 = r12.LJLILLLLZI
            r12.LJLIL = r7
            java.lang.Object r0 = r0.LIZ(r4, r9, r10, r12)
            if (r0 != r11) goto L45
            return r11
        L42:
            X.C141335gf.LIZJ(r13)
        L45:
            r12.LJLIL = r8
            java.lang.Object r0 = X.C1JD.LIZJ(r2, r12)
            if (r0 != r11) goto L1d
            return r11
        L4e:
            X.C141335gf.LIZJ(r13)
            r12.LJLIL = r4
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r12)
            if (r0 != r11) goto L1d
            return r11
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73612uj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
