package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.editSticker.text.effect.EffectDownloadListener$onSuccessed$1", f = "EffectTextResDownloader.kt", l = {83, 84}, m = "invokeSuspend")
/* renamed from: X.Wmk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83306Wmk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C83303Wmh<T> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83306Wmk(C83303Wmh<T> c83303Wmh, InterfaceC67352kd<? super C83306Wmk> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c83303Wmh;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C83306Wmk(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLIL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L43
            if (r0 == r1) goto L59
            if (r0 != r2) goto L6f
            X.C141335gf.LIZJ(r5)
        Lf:
            X.Wmh<T> r0 = r4.LJLILLLLZI
            X.Wmq<T extends X.6Hh, java.lang.Void> r1 = r0.LJLILLLLZI
            r0 = 3
            r1.LIZ(r0)
            X.Wmh<T> r0 = r4.LJLILLLLZI
            X.Wmq<T extends X.6Hh, java.lang.Void> r1 = r0.LJLILLLLZI
            r1.getClass()
            X.WmQ<T extends X.6Hh, java.lang.Void> r0 = r0.LJLJJI
            r0.LIZJ(r1)
            X.Wmh<T> r0 = r4.LJLILLLLZI
            X.Wmq<T extends X.6Hh, java.lang.Void> r0 = r0.LJLILLLLZI
            Param r1 = r0.LJ
            boolean r0 = r1 instanceof X.C157776Hd
            if (r0 == 0) goto L37
            X.Wml r0 = X.C69E.LIZJ
            if (r0 == 0) goto L34
            r0.LIZIZ()
        L34:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L37:
            boolean r0 = r1 instanceof X.C157916Hr
            if (r0 == 0) goto L34
            X.Wml r0 = X.C69E.LIZJ
            if (r0 == 0) goto L34
            r0.LIZJ()
            goto L34
        L43:
            X.C141335gf.LIZJ(r5)
            X.Wmh<T> r0 = r4.LJLILLLLZI
            X.Wmq<T extends X.6Hh, java.lang.Void> r0 = r0.LJLILLLLZI
            Param r0 = r0.LJ
            X.6Hh r0 = (X.C157816Hh) r0
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.effect
            r4.LJLIL = r1
            java.lang.Object r0 = X.C157986Hy.LIZIZ(r0, r4)
            if (r0 != r3) goto L5c
            return r3
        L59:
            X.C141335gf.LIZJ(r5)
        L5c:
            X.Wmh<T> r0 = r4.LJLILLLLZI
            X.Ynr<T extends X.6Hh, X.2kd<? super X.UCe>, java.lang.Object> r1 = r0.LJLJI
            if (r1 == 0) goto Lf
            X.Wmq<T extends X.6Hh, java.lang.Void> r0 = r0.LJLILLLLZI
            Param r0 = r0.LJ
            r4.LJLIL = r2
            java.lang.Object r0 = r1.invoke(r0, r4)
            if (r0 != r3) goto Lf
            return r3
        L6f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83306Wmk.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
