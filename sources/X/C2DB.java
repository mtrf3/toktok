package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", l = {819, 836}, m = "invokeSuspend")
/* renamed from: X.2DB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2DB extends AbstractC65783Prn implements InterfaceC88471Ynr<InterfaceC37471dX, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C11H LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C68322mC<C11P> LJLJJLL;
    public final /* synthetic */ C68322mC<C11P> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2DB(C68322mC<C11P> c68322mC, C68322mC<C11P> c68322mC2, InterfaceC67352kd<? super C2DB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJLL = c68322mC;
        this.LJLJL = c68322mC2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2DB c2db = new C2DB(this.LJLJJLL, this.LJLJL, interfaceC67352kd);
        c2db.LJLJJL = obj;
        return c2db;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r1 == 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        r13.LJLJJLL.element = r1;
        r13.LJLJL.element = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (r6 == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e6, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0030 A[EDGE_INSN: B:63:0x0030->B:13:0x0030 BREAK  A[LOOP:0: B:7:0x0021->B:10:0x009f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f5 -> B:6:0x0018). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2DB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC37471dX interfaceC37471dX, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC37471dX, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
