package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2", f = "Draggable.kt", l = {243}, m = "invokeSuspend")
/* renamed from: X.2Cp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54672Cp extends AbstractC65782Prm implements InterfaceC88471Ynr<C0UZ, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C68322mC LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C68322mC<C0UQ> LJLJJI;
    public final /* synthetic */ InterfaceC78936UyS<C0UQ> LJLJJL;
    public final /* synthetic */ C0UT LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54672Cp(C68322mC<C0UQ> c68322mC, InterfaceC78936UyS<C0UQ> interfaceC78936UyS, C0UT c0ut, InterfaceC67352kd<? super C54672Cp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = c68322mC;
        this.LJLJJL = interfaceC78936UyS;
        this.LJLJJLL = c0ut;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C54672Cp c54672Cp = new C54672Cp(this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c54672Cp.LJLJI = obj;
        return c54672Cp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0045 -> B:5:0x0012). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLILLLLZI
            r5 = 1
            if (r0 == 0) goto L4d
            if (r0 != r5) goto L58
            X.2mC r2 = r7.LJLIL
            java.lang.Object r0 = r7.LJLJI
            X.0UZ r0 = (X.C0UZ) r0
            X.C141335gf.LIZJ(r8)
        L12:
            r2.element = r8
        L14:
            X.2mC<X.0UQ> r1 = r7.LJLJJI
            T r2 = r1.element
            boolean r1 = r2 instanceof X.C1N2
            if (r1 != 0) goto L55
            boolean r1 = r2 instanceof X.C31891Mz
            if (r1 != 0) goto L55
            boolean r1 = r2 instanceof X.C1N0
            if (r1 == 0) goto L37
            X.1N0 r2 = (X.C1N0) r2
            if (r2 == 0) goto L37
            X.0UT r4 = r7.LJLJJLL
            long r2 = r2.LIZ
            X.0UT r1 = X.C0UT.Vertical
            if (r4 != r1) goto L48
            float r1 = X.C10370av.LJ(r2)
        L34:
            r0.LIZIZ(r1)
        L37:
            X.2mC<X.0UQ> r2 = r7.LJLJJI
            X.UyS<X.0UQ> r1 = r7.LJLJJL
            r7.LJLJI = r0
            r7.LJLIL = r2
            r7.LJLILLLLZI = r5
            java.lang.Object r8 = r1.LJIIIIZZ(r7)
            if (r8 != r6) goto L12
            return r6
        L48:
            float r1 = X.C10370av.LIZLLL(r2)
            goto L34
        L4d:
            X.C141335gf.LIZJ(r8)
            java.lang.Object r0 = r7.LJLJI
            X.0UZ r0 = (X.C0UZ) r0
            goto L14
        L55:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L58:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54672Cp.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C0UZ c0uz, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c0uz, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
