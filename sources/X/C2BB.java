package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {295, 300, 307}, m = "invokeSuspend")
/* renamed from: X.2BB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2BB extends AbstractC65783Prn implements InterfaceC88471Ynr<AbstractC37657EqD<? super Integer>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int[] LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ C1IQ LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2BB(C1IQ c1iq, InterfaceC67352kd<? super C2BB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJL = c1iq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2BB c2bb = new C2BB(this.LJLJL, interfaceC67352kd);
        c2bb.LJLJJLL = obj;
        return c2bb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b8, code lost:
    
        if (r10 >= 64) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r9 >= 64) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:7:0x001f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0045 -> B:7:0x001f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0093 -> B:20:0x00b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00aa -> B:20:0x00b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x006e -> B:31:0x007e). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2BB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(AbstractC37657EqD<? super Integer> abstractC37657EqD, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(abstractC37657EqD, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
