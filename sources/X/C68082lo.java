package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.ECExplanationWatcherCardWidgetNativeImpl$showAfterAnim$1$1", f = "ECExplanationWatcherCardWidgetNativeImpl.kt", l = {385}, m = "invokeSuspend")
/* renamed from: X.2lo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68082lo extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;

    public C68082lo(InterfaceC67352kd<? super C68082lo> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C68082lo(interfaceC67352kd);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0028 -> B:5:0x0010). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJI
            r4 = 1
            if (r0 == 0) goto L2b
            if (r0 != r4) goto L34
            int r3 = r6.LJLILLLLZI
            int r2 = r6.LJLIL
            X.C141335gf.LIZJ(r7)
        L10:
            X.2lp r0 = new X.2lp
            r0.<init>(r4, r4)
            X.C2U8.LIZ(r0)
            int r3 = r3 + 1
            if (r3 >= r2) goto L31
        L1c:
            r6.LJLIL = r2
            r6.LJLILLLLZI = r3
            r6.LJLJI = r4
            r0 = 7000(0x1b58, double:3.4585E-320)
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r6)
            if (r0 != r5) goto L10
            return r5
        L2b:
            X.C141335gf.LIZJ(r7)
            r3 = 0
            r2 = 3
            goto L1c
        L31:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68082lo.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C68082lo(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
