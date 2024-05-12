package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2", f = "BringIntoViewResponder.kt", l = {224, 233, 240}, m = "invokeSuspend")
/* renamed from: X.2F0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2F0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public OSZ LJLIL;
    public OSZ LJLILLLLZI;
    public int LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C2F1 LJLJJL;
    public final /* synthetic */ InterfaceC274415w LJLJJLL;
    public final /* synthetic */ InterfaceC65784Pro<C10390ax> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2F0(C2F1 c2f1, InterfaceC274415w interfaceC274415w, InterfaceC65784Pro<C10390ax> interfaceC65784Pro, InterfaceC67352kd<? super C2F0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = c2f1;
        this.LJLJJLL = interfaceC274415w;
        this.LJLJL = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2F0 c2f0 = new C2F0(this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
        c2f0.LJLJJI = obj;
        return c2f0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d3 A[Catch: all -> 0x00f3, TryCatch #0 {all -> 0x00f3, blocks: (B:23:0x00cd, B:25:0x00d3), top: B:22:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0114  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2F0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
