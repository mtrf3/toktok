package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.ECExplanationWatcherCardWidgetNativeImpl$showAfterAnim$1$2", f = "ECExplanationWatcherCardWidgetNativeImpl.kt", l = {393}, m = "invokeSuspend")
/* renamed from: X.2ln, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68072ln extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C71184Rwi LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68072ln(C71184Rwi c71184Rwi, InterfaceC67352kd<? super C68072ln> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c71184Rwi;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C68072ln c68072ln = new C68072ln(this.LJLJI, interfaceC67352kd);
        c68072ln.LJLILLLLZI = obj;
        return c68072ln;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0038 -> B:5:0x0010). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLIL
            r3 = 1
            if (r0 == 0) goto L3b
            if (r0 != r3) goto L46
            java.lang.Object r0 = r5.LJLILLLLZI
            X.2pa r0 = (X.InterfaceC70422pa) r0
            X.C141335gf.LIZJ(r6)
        L10:
            X.2lp r2 = new X.2lp
            r1 = 2
            r2.<init>(r1, r3)
            X.C2U8.LIZ(r2)
        L19:
            boolean r1 = X.C48841JEv.LJIILLIIL(r0)
            if (r1 == 0) goto L43
            X.Rwi r1 = r5.LJLJI
            X.Ol8 r1 = r1.LJFF
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r1 = r1 * 1000
            long r1 = (long) r1
            r5.LJLILLLLZI = r0
            r5.LJLIL = r3
            java.lang.Object r1 = X.C1JD.LIZJ(r1, r5)
            if (r1 != r4) goto L10
            return r4
        L3b:
            X.C141335gf.LIZJ(r6)
            java.lang.Object r0 = r5.LJLILLLLZI
            X.2pa r0 = (X.InterfaceC70422pa) r0
            goto L19
        L43:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68072ln.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
