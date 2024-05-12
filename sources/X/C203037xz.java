package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ui.feed.photos.DotIndicatorAutoScrollTicker$startJob$1", f = "PhotoAutoScrollTicker.kt", l = {C61447O9r.LJIIJ}, m = "invokeSuspend")
/* renamed from: X.7xz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203037xz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C203027xy LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C203037xz(C203027xy c203027xy, InterfaceC67352kd<? super C203037xz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c203027xy;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C203037xz c203037xz = new C203037xz(this.LJLJI, interfaceC67352kd);
        c203037xz.LJLILLLLZI = obj;
        return c203037xz;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0029 -> B:5:0x0010). Please report as a decompilation issue!!! */
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
            if (r0 == 0) goto L2c
            if (r0 != r3) goto L37
            java.lang.Object r0 = r5.LJLILLLLZI
            X.2pa r0 = (X.InterfaceC70422pa) r0
            X.C141335gf.LIZJ(r6)
        L10:
            X.7xy r1 = r5.LJLJI
            X.7y1 r1 = r1.LJ
            r1.LIZ()
        L17:
            boolean r1 = X.C48841JEv.LJIILLIIL(r0)
            if (r1 == 0) goto L34
            X.7xy r1 = r5.LJLJI
            long r1 = r1.LIZ
            r5.LJLILLLLZI = r0
            r5.LJLIL = r3
            java.lang.Object r1 = X.C1JD.LIZJ(r1, r5)
            if (r1 != r4) goto L10
            return r4
        L2c:
            X.C141335gf.LIZJ(r6)
            java.lang.Object r0 = r5.LJLILLLLZI
            X.2pa r0 = (X.InterfaceC70422pa) r0
            goto L17
        L34:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L37:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203037xz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
