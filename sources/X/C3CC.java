package X;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {224, 358}, m = "invokeSuspend")
/* renamed from: X.3CC, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3CC extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, InterfaceC64672gJ<Object>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C68322mC LJLIL;
    public C72242sW LJLILLLLZI;
    public int LJLJI;
    public /* synthetic */ Object LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<Object, Long> LJLJJLL;
    public final /* synthetic */ InterfaceC65462ha<Object> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3CC(InterfaceC67352kd interfaceC67352kd, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65462ha interfaceC65462ha) {
        super(3, interfaceC67352kd);
        this.LJLJJLL = interfaceC88472Yns;
        this.LJLJL = interfaceC65462ha;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:51|23|26|27|28|(1:30)|31|32|(1:34)) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0096, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
    
        if (r9.LJ() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        r0 = X.C141335gf.LIZ(r10);
        X.C3C5.m7constructorimpl(r0);
        r9.resumeWith(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b0, code lost:
    
        if ((r10 instanceof java.util.concurrent.CancellationException) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b2, code lost:
    
        r1 = r9.LJJIII();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b8, code lost:
    
        if ((r1 instanceof kotlinx.coroutines.CompletedExceptionally) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c0, code lost:
    
        X.C78540Us4.LJIIJ(r9.getContext(), r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:28:0x007b, B:30:0x007f, B:31:0x0089), top: B:27:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ab -> B:6:0x001b). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3CC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC64672gJ<Object> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C3CC c3cc = new C3CC(interfaceC67352kd, this.LJLJJLL, this.LJLJL);
        c3cc.LJLJJI = interfaceC70422pa;
        c3cc.LJLJJL = interfaceC64672gJ;
        return c3cc.invokeSuspend(C76800UCe.LIZ);
    }
}
