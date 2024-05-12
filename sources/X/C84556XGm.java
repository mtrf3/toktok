package X;

import fjb.a;

/* JADX INFO: Add missing generic type declarations: [D] */
@InterfaceC65848Psq(c = "com.bytedance.mota.runner.optimistic.OptimisticRunner$run$1", f = "OptimisticRunner.kt", l = {29, 32, 33}, m = "invokeSuspend")
/* renamed from: X.XGm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84556XGm<D> extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC64672gJ<? super XGX<D>>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ XGS LJLJI;
    public final /* synthetic */ XGZ LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84556XGm(XGS xgs, XGZ xgz, InterfaceC67352kd<? super C84556XGm> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = xgs;
        this.LJLJJI = xgz;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C84556XGm c84556XGm = new C84556XGm(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c84556XGm.LJLILLLLZI = obj;
        return c84556XGm;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0090  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r10.LJLIL
            r6 = 3
            r4 = 2
            r7 = 1
            r3 = 0
            if (r0 == 0) goto L16
            if (r0 == r7) goto L6d
            if (r0 == r4) goto L87
            if (r0 != r6) goto L9b
            X.C141335gf.LIZJ(r11)
        L13:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L16:
            X.C141335gf.LIZJ(r11)
            java.lang.Object r2 = r10.LJLILLLLZI
            X.2gJ r2 = (X.InterfaceC64672gJ) r2
            X.XGY r9 = new X.XGY
            X.XGS r0 = r10.LJLJI
            r9.<init>(r0)
            X.XGS r0 = r10.LJLJI
            X.XH8 r1 = r0.LJLILLLLZI
            X.XGp r0 = X.C84568XGy.LIZJ
            X.XHD r0 = r1.LIZ(r0)
            X.XGy r0 = (X.C84568XGy) r0
            if (r0 == 0) goto L74
            D extends X.7rv r8 = r0.LIZIZ
            if (r8 == 0) goto L74
            X.XGS r0 = r10.LJLJI
            X.XH8 r1 = r0.LJLILLLLZI
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            X.XGo r0 = X.C84567XGx.LIZJ
            X.XHD r0 = r1.LIZ(r0)
            X.XGx r0 = (X.C84567XGx) r0
            if (r0 == 0) goto L6b
            X.Ynr<D extends X.MfB, java.lang.Boolean, java.util.List<com.bytedance.mota.storage.motacache.IMotaCache>> r1 = r0.LIZIZ
        L4b:
            X.C65777Prh.LJ(r4, r1)
            if (r1 == 0) goto L55
            X.XHg r0 = X.EnumC84576XHg.Optimistic
            X.C77412UZs.LJJIZ(r1, r8, r0)
        L55:
            r9.LIZIZ = r8
            X.XGX r1 = r9.LIZ()
            X.UzC r0 = X.EnumC78982UzC.Optimistic
            X.C78977Uz7.LJJLIIIJLLLLLLLZ(r1, r0)
            r10.LJLILLLLZI = r2
            r10.LJLIL = r7
            java.lang.Object r0 = r2.emit(r1, r10)
            if (r0 != r5) goto L74
            return r5
        L6b:
            r1 = r3
            goto L4b
        L6d:
            java.lang.Object r2 = r10.LJLILLLLZI
            X.2gJ r2 = (X.InterfaceC64672gJ) r2
            X.C141335gf.LIZJ(r11)
        L74:
            X.XGZ r1 = r10.LJLJJI
            X.XGS r0 = r10.LJLJI
            X.2ha r0 = r1.LIZ(r0)
            r10.LJLILLLLZI = r2
            r10.LJLIL = r4
            java.lang.Object r11 = X.V1M.LJJJJL(r0, r10)
            if (r11 != r5) goto L8e
            return r5
        L87:
            java.lang.Object r2 = r10.LJLILLLLZI
            X.2gJ r2 = (X.InterfaceC64672gJ) r2
            X.C141335gf.LIZJ(r11)
        L8e:
            if (r11 == 0) goto L13
            r10.LJLILLLLZI = r3
            r10.LJLIL = r6
            java.lang.Object r0 = r2.emit(r11, r10)
            if (r0 != r5) goto L13
            return r5
        L9b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84556XGm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(obj, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
