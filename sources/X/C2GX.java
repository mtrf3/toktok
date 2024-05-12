package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {886}, m = "invokeSuspend")
/* renamed from: X.2GX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2GX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C1IK LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C36001bA LJLJJI;
    public final /* synthetic */ InterfaceC88473Ynt<InterfaceC70422pa, InterfaceC44041o8, InterfaceC67352kd<? super C76800UCe>, Object> LJLJJL;
    public final /* synthetic */ InterfaceC44041o8 LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2GX(C36001bA c36001bA, InterfaceC88473Ynt<? super InterfaceC70422pa, ? super InterfaceC44041o8, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88473Ynt, InterfaceC44041o8 interfaceC44041o8, InterfaceC67352kd<? super C2GX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = c36001bA;
        this.LJLJJL = interfaceC88473Ynt;
        this.LJLJJLL = interfaceC44041o8;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2GX c2gx = new C2GX(this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c2gx.LJLJI = obj;
        return c2gx;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.V4o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2GX.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
