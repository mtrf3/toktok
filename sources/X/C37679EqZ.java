package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.tux.skeleton.text.config.PlaceholderConfigParser$readTextConfig$1", f = "PlaceholderConfigParser.kt", l = {60, 65}, m = "invokeSuspend")
/* renamed from: X.EqZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37679EqZ extends AbstractC65783Prn implements InterfaceC88471Ynr<AbstractC37657EqD<? super String>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLILLLLZI;
    public int LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C37716ErA LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37679EqZ(C37716ErA c37716ErA, InterfaceC67352kd<? super C37679EqZ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = c37716ErA;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C37679EqZ c37679EqZ = new C37679EqZ(this.LJLJJL, interfaceC67352kd);
        c37679EqZ.LJLJJI = obj;
        return c37679EqZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        r0 = r7.toString();
        r8.LJLJJI = r2;
        r8.LJLILLLLZI = r7;
        r8.LJLJI = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r2.LIZ(r0, r8) != r6) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        return r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0084 -> B:6:0x0019). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37679EqZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(AbstractC37657EqD<? super String> abstractC37657EqD, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(abstractC37657EqD, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
